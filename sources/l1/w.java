package l1;

import java.security.MessageDigest;
import java.util.Map;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class w implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f10006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f10007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1.i f10008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f10009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1.m f10010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10011j;

    public w(Object obj, j1.i iVar, int i6, int i7, C1.c cVar, Class cls, Class cls2, j1.m mVar) {
        AbstractC1332d.l(obj, "Argument must not be null");
        this.f10003b = obj;
        AbstractC1332d.l(iVar, "Signature must not be null");
        this.f10008g = iVar;
        this.f10004c = i6;
        this.f10005d = i7;
        AbstractC1332d.l(cVar, "Argument must not be null");
        this.f10009h = cVar;
        AbstractC1332d.l(cls, "Resource class must not be null");
        this.f10006e = cls;
        AbstractC1332d.l(cls2, "Transcode class must not be null");
        this.f10007f = cls2;
        AbstractC1332d.l(mVar, "Argument must not be null");
        this.f10010i = mVar;
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f10003b.equals(wVar.f10003b) && this.f10008g.equals(wVar.f10008g) && this.f10005d == wVar.f10005d && this.f10004c == wVar.f10004c && this.f10009h.equals(wVar.f10009h) && this.f10006e.equals(wVar.f10006e) && this.f10007f.equals(wVar.f10007f) && this.f10010i.equals(wVar.f10010i);
    }

    @Override // j1.i
    public final int hashCode() {
        if (this.f10011j == 0) {
            int iHashCode = this.f10003b.hashCode();
            this.f10011j = iHashCode;
            int iHashCode2 = ((((this.f10008g.hashCode() + (iHashCode * 31)) * 31) + this.f10004c) * 31) + this.f10005d;
            this.f10011j = iHashCode2;
            int iHashCode3 = this.f10009h.hashCode() + (iHashCode2 * 31);
            this.f10011j = iHashCode3;
            int iHashCode4 = this.f10006e.hashCode() + (iHashCode3 * 31);
            this.f10011j = iHashCode4;
            int iHashCode5 = this.f10007f.hashCode() + (iHashCode4 * 31);
            this.f10011j = iHashCode5;
            this.f10011j = this.f10010i.f9442b.hashCode() + (iHashCode5 * 31);
        }
        return this.f10011j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f10003b + ", width=" + this.f10004c + ", height=" + this.f10005d + ", resourceClass=" + this.f10006e + ", transcodeClass=" + this.f10007f + ", signature=" + this.f10008g + ", hashCode=" + this.f10011j + ", transformations=" + this.f10009h + ", options=" + this.f10010i + '}';
    }
}
