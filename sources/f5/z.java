package f5;

import s4.AbstractC1305a;
import t4.AbstractC1353j;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f8505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f8506g;

    public z() {
        this.f8500a = new byte[8192];
        this.f8504e = true;
        this.f8503d = false;
    }

    public final z a() {
        z zVar = this.f8505f;
        if (zVar == this) {
            zVar = null;
        }
        z zVar2 = this.f8506g;
        AbstractC1305a.l(zVar2);
        zVar2.f8505f = this.f8505f;
        z zVar3 = this.f8505f;
        AbstractC1305a.l(zVar3);
        zVar3.f8506g = this.f8506g;
        this.f8505f = null;
        this.f8506g = null;
        return zVar;
    }

    public final void b(z zVar) {
        zVar.f8506g = this;
        zVar.f8505f = this.f8505f;
        z zVar2 = this.f8505f;
        AbstractC1305a.l(zVar2);
        zVar2.f8506g = zVar;
        this.f8505f = zVar;
    }

    public final z c() {
        this.f8503d = true;
        return new z(this.f8500a, this.f8501b, this.f8502c, true);
    }

    public final void d(z zVar, int i6) {
        if (!zVar.f8504e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i7 = zVar.f8502c;
        int i8 = i7 + i6;
        byte[] bArr = zVar.f8500a;
        if (i8 > 8192) {
            if (zVar.f8503d) {
                throw new IllegalArgumentException();
            }
            int i9 = zVar.f8501b;
            if (i8 - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC1353j.b0(0, i9, i7, bArr, bArr);
            zVar.f8502c -= zVar.f8501b;
            zVar.f8501b = 0;
        }
        int i10 = zVar.f8502c;
        int i11 = this.f8501b;
        AbstractC1353j.b0(i10, i11, i11 + i6, this.f8500a, bArr);
        zVar.f8502c += i6;
        this.f8501b += i6;
    }

    public z(byte[] bArr, int i6, int i7, boolean z5) {
        AbstractC1305a.o(bArr, "data");
        this.f8500a = bArr;
        this.f8501b = i6;
        this.f8502c = i7;
        this.f8503d = z5;
        this.f8504e = false;
    }
}
