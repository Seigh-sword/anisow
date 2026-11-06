package G0;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F.d f685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F.d f687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Cap f693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint.Join f694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f695o;

    @Override // G0.k
    public final boolean a() {
        return this.f687g.c() || this.f685e.c();
    }

    @Override // G0.k
    public final boolean b(int[] iArr) {
        return this.f685e.d(iArr) | this.f687g.d(iArr);
    }

    public float getFillAlpha() {
        return this.f689i;
    }

    public int getFillColor() {
        return this.f687g.f433x;
    }

    public float getStrokeAlpha() {
        return this.f688h;
    }

    public int getStrokeColor() {
        return this.f685e.f433x;
    }

    public float getStrokeWidth() {
        return this.f686f;
    }

    public float getTrimPathEnd() {
        return this.f691k;
    }

    public float getTrimPathOffset() {
        return this.f692l;
    }

    public float getTrimPathStart() {
        return this.f690j;
    }

    public void setFillAlpha(float f6) {
        this.f689i = f6;
    }

    public void setFillColor(int i6) {
        this.f687g.f433x = i6;
    }

    public void setStrokeAlpha(float f6) {
        this.f688h = f6;
    }

    public void setStrokeColor(int i6) {
        this.f685e.f433x = i6;
    }

    public void setStrokeWidth(float f6) {
        this.f686f = f6;
    }

    public void setTrimPathEnd(float f6) {
        this.f691k = f6;
    }

    public void setTrimPathOffset(float f6) {
        this.f692l = f6;
    }

    public void setTrimPathStart(float f6) {
        this.f690j = f6;
    }
}
