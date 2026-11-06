package androidx.core.graphics.drawable;

import H.c;
import H.e;
import Z.j;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f5316k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f5319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f5320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f5323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f5324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f5326j;

    public IconCompat() {
        this.f5317a = -1;
        this.f5319c = null;
        this.f5320d = null;
        this.f5321e = 0;
        this.f5322f = 0;
        this.f5323g = null;
        this.f5324h = f5316k;
        this.f5325i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z5) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f6 = iMin;
        float f7 = 0.5f * f6;
        float f8 = 0.9166667f * f7;
        if (z5) {
            float f9 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f9, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.setShadowLayer(f9, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f7, f7, f8, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f5321e = i6;
        iconCompat.f5318b = "";
        iconCompat.f5326j = "";
        return iconCompat;
    }

    public final int c() {
        int i6 = this.f5317a;
        if (i6 != -1) {
            if (i6 == 2) {
                return this.f5321e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = this.f5318b;
        if (i7 >= 28) {
            return e.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        }
    }

    public final int d() {
        StringBuilder sb;
        int i6 = this.f5317a;
        if (i6 != -1) {
            return i6;
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = this.f5318b;
        if (i7 >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e6) {
            e = e6;
            sb = new StringBuilder("Unable to get icon type ");
            sb.append(obj);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e7) {
            e = e7;
            sb = new StringBuilder("Unable to get icon type ");
            sb.append(obj);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e8) {
            e = e8;
            sb = new StringBuilder("Unable to get icon type ");
            sb.append(obj);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    public final Uri e() {
        int i6 = this.f5317a;
        if (i6 == -1) {
            return c.a(this.f5318b);
        }
        if (i6 == 4 || i6 == 6) {
            return Uri.parse((String) this.f5318b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        int height;
        if (this.f5317a == -1) {
            return String.valueOf(this.f5318b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f5317a) {
            case 1:
                str = "BITMAP";
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f5317a) {
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f5318b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f5318b).getHeight();
                sb.append(height);
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.f5326j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f5321e);
                if (this.f5322f != 0) {
                    sb.append(" off=");
                    height = this.f5322f;
                    sb.append(height);
                }
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f5318b);
                break;
        }
        if (this.f5323g != null) {
            sb.append(" tint=");
            sb.append(this.f5323g);
        }
        if (this.f5324h != f5316k) {
            sb.append(" mode=");
            sb.append(this.f5324h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i6) {
        this.f5319c = null;
        this.f5320d = null;
        this.f5321e = 0;
        this.f5322f = 0;
        this.f5323g = null;
        this.f5324h = f5316k;
        this.f5325i = null;
        this.f5317a = i6;
    }
}
