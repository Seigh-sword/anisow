package s;

import l.AbstractC0911d;

/* JADX INFO: renamed from: s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1279a extends AbstractC0911d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12492e;

    public C1279a(int i6, Object obj) {
        this.f12491d = i6;
        this.f12492e = obj;
    }

    @Override // l.AbstractC0911d
    public final void c() {
        int i6 = this.f12491d;
        Object obj = this.f12492e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C1280b) obj).clear();
                break;
            default:
                ((C1281c) obj).clear();
                break;
        }
    }

    @Override // l.AbstractC0911d
    public final Object d(int i6, int i7) {
        int i8 = this.f12491d;
        Object obj = this.f12492e;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C1280b) obj).f12533x[(i6 << 1) + i7];
            default:
                return ((C1281c) obj).f12501x[i6];
        }
    }

    @Override // l.AbstractC0911d
    public final C1280b e() {
        switch (this.f12491d) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (C1280b) this.f12492e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // l.AbstractC0911d
    public final int f() {
        int i6 = this.f12491d;
        Object obj = this.f12492e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C1280b) obj).f12534y;
            default:
                return ((C1281c) obj).f12502y;
        }
    }

    @Override // l.AbstractC0911d
    public final int g(Object obj) {
        int i6 = this.f12491d;
        Object obj2 = this.f12492e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C1280b) obj2).e(obj);
            default:
                return ((C1281c) obj2).indexOf(obj);
        }
    }

    @Override // l.AbstractC0911d
    public final int h(Object obj) {
        int i6 = this.f12491d;
        Object obj2 = this.f12492e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C1280b) obj2).g(obj);
            default:
                return ((C1281c) obj2).indexOf(obj);
        }
    }

    @Override // l.AbstractC0911d
    public final void i(Object obj, Object obj2) {
        int i6 = this.f12491d;
        Object obj3 = this.f12492e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C1280b) obj3).put(obj, obj2);
                break;
            default:
                ((C1281c) obj3).add(obj);
                break;
        }
    }

    @Override // l.AbstractC0911d
    public final void j(int i6) {
        int i7 = this.f12491d;
        Object obj = this.f12492e;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C1280b) obj).j(i6);
                break;
            default:
                ((C1281c) obj).g(i6);
                break;
        }
    }

    @Override // l.AbstractC0911d
    public final Object k(int i6, Object obj) {
        switch (this.f12491d) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C1280b) this.f12492e).k(i6, obj);
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
