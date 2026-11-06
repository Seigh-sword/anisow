package G0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f712p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1280b f727o;

    public m() {
        this.f715c = new Matrix();
        this.f720h = 0.0f;
        this.f721i = 0.0f;
        this.f722j = 0.0f;
        this.f723k = 0.0f;
        this.f724l = 255;
        this.f725m = null;
        this.f726n = null;
        this.f727o = new C1280b();
        this.f719g = new j();
        this.f713a = new Path();
        this.f714b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.graphics.PathMeasure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(G0.j r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.m.a(G0.j, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f724l;
    }

    public void setAlpha(float f6) {
        setRootAlpha((int) (f6 * 255.0f));
    }

    public void setRootAlpha(int i6) {
        this.f724l = i6;
    }

    public m(m mVar) {
        this.f715c = new Matrix();
        this.f720h = 0.0f;
        this.f721i = 0.0f;
        this.f722j = 0.0f;
        this.f723k = 0.0f;
        this.f724l = 255;
        this.f725m = null;
        this.f726n = null;
        C1280b c1280b = new C1280b();
        this.f727o = c1280b;
        this.f719g = new j(mVar.f719g, c1280b);
        this.f713a = new Path(mVar.f713a);
        this.f714b = new Path(mVar.f714b);
        this.f720h = mVar.f720h;
        this.f721i = mVar.f721i;
        this.f722j = mVar.f722j;
        this.f723k = mVar.f723k;
        this.f724l = mVar.f724l;
        this.f725m = mVar.f725m;
        String str = mVar.f725m;
        if (str != null) {
            c1280b.put(str, this);
        }
        this.f726n = mVar.f726n;
    }
}
