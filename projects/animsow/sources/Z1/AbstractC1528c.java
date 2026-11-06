package z1;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.xo.anilab.R;
import java.util.ArrayList;
import t0.AbstractC1332d;
import y1.h;

/* JADX INFO: renamed from: z1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1528c extends AbstractC1526a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f14075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f14076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Animatable f14077y;

    public AbstractC1528c(ImageView imageView) {
        AbstractC1332d.l(imageView, "Argument must not be null");
        this.f14075w = imageView;
        this.f14076x = new f(imageView);
    }

    @Override // z1.e
    public final void a(InterfaceC1529d interfaceC1529d) {
        f fVar = this.f14076x;
        View view = fVar.f14079a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = fVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = fVar.f14079a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = fVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            ((h) interfaceC1529d).n(iA, iA2);
            return;
        }
        ArrayList arrayList = fVar.f14080b;
        if (!arrayList.contains(interfaceC1529d)) {
            arrayList.add(interfaceC1529d);
        }
        if (fVar.f14081c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            B.f fVar2 = new B.f(fVar);
            fVar.f14081c = fVar2;
            viewTreeObserver.addOnPreDrawListener(fVar2);
        }
    }

    @Override // z1.e
    public final void b(y1.c cVar) {
        this.f14075w.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // z1.e
    public final void c(Drawable drawable) {
        l(null);
        ((ImageView) this.f14075w).setImageDrawable(drawable);
    }

    @Override // z1.e
    public final void d(Drawable drawable) {
        l(null);
        ((ImageView) this.f14075w).setImageDrawable(drawable);
    }

    @Override // w1.InterfaceC1465i
    public final void e() {
        Animatable animatable = this.f14077y;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // z1.e
    public final y1.c f() {
        Object tag = this.f14075w.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof y1.c) {
            return (y1.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // z1.e
    public final void g(Drawable drawable) {
        f fVar = this.f14076x;
        ViewTreeObserver viewTreeObserver = fVar.f14079a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.f14081c);
        }
        fVar.f14081c = null;
        fVar.f14080b.clear();
        Animatable animatable = this.f14077y;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        ((ImageView) this.f14075w).setImageDrawable(drawable);
    }

    @Override // z1.e
    public final void h(Object obj) {
        l(obj);
    }

    @Override // w1.InterfaceC1465i
    public final void i() {
        Animatable animatable = this.f14077y;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // z1.e
    public final void k(InterfaceC1529d interfaceC1529d) {
        this.f14076x.f14080b.remove(interfaceC1529d);
    }

    public final void l(Object obj) {
        C1527b c1527b = (C1527b) this;
        int i6 = c1527b.f14074z;
        View view = c1527b.f14075w;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((ImageView) view).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) view).setImageDrawable((Drawable) obj);
                break;
        }
        if (!(obj instanceof Animatable)) {
            this.f14077y = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f14077y = animatable;
        animatable.start();
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: " + this.f14075w;
    }
}
