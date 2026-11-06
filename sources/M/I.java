package m;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10124c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f10125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f10126b;

    public I(ProgressBar progressBar) {
        this.f10125a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i6) {
        ProgressBar progressBar = this.f10125a;
        C0803c c0803cJ = C0803c.J(progressBar.getContext(), attributeSet, f10124c, i6, 0);
        Drawable drawableW = c0803cJ.w(0);
        if (drawableW != null) {
            if (drawableW instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableW;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i7 = 0; i7 < numberOfFrames; i7++) {
                    Drawable drawableB = b(animationDrawable.getFrame(i7), true);
                    drawableB.setLevel(10000);
                    animationDrawable2.addFrame(drawableB, animationDrawable.getDuration(i7));
                }
                animationDrawable2.setLevel(10000);
                drawableW = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableW);
        }
        Drawable drawableW2 = c0803cJ.w(1);
        if (drawableW2 != null) {
            progressBar.setProgressDrawable(b(drawableW2, false));
        }
        c0803cJ.M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z5) {
        if (drawable instanceof H.g) {
            ((H.h) ((H.g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    int id = layerDrawable.getId(i6);
                    drawableArr[i6] = b(layerDrawable.getDrawable(i6), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    layerDrawable2.setId(i7, layerDrawable.getId(i7));
                    layerDrawable2.setLayerGravity(i7, layerDrawable.getLayerGravity(i7));
                    layerDrawable2.setLayerWidth(i7, layerDrawable.getLayerWidth(i7));
                    layerDrawable2.setLayerHeight(i7, layerDrawable.getLayerHeight(i7));
                    layerDrawable2.setLayerInsetLeft(i7, layerDrawable.getLayerInsetLeft(i7));
                    layerDrawable2.setLayerInsetRight(i7, layerDrawable.getLayerInsetRight(i7));
                    layerDrawable2.setLayerInsetTop(i7, layerDrawable.getLayerInsetTop(i7));
                    layerDrawable2.setLayerInsetBottom(i7, layerDrawable.getLayerInsetBottom(i7));
                    layerDrawable2.setLayerInsetStart(i7, layerDrawable.getLayerInsetStart(i7));
                    layerDrawable2.setLayerInsetEnd(i7, layerDrawable.getLayerInsetEnd(i7));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f10126b == null) {
                    this.f10126b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z5 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
