package u;

import i.C0803c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i[] f12796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i[] f12797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0803c f12799i;

    @Override // u.c
    public final i d(boolean[] zArr) {
        int i6 = -1;
        for (int i7 = 0; i7 < this.f12798h; i7++) {
            i[] iVarArr = this.f12796f;
            i iVar = iVarArr[i7];
            if (!zArr[iVar.f12810x]) {
                C0803c c0803c = this.f12799i;
                c0803c.f9277x = iVar;
                int i8 = 8;
                if (i6 == -1) {
                    while (i8 >= 0) {
                        float f6 = ((i) c0803c.f9277x).f12804D[i8];
                        if (f6 <= 0.0f) {
                            if (f6 < 0.0f) {
                                i6 = i7;
                                break;
                            }
                            i8--;
                        }
                    }
                } else {
                    i iVar2 = iVarArr[i6];
                    while (true) {
                        if (i8 >= 0) {
                            float f7 = iVar2.f12804D[i8];
                            float f8 = ((i) c0803c.f9277x).f12804D[i8];
                            if (f8 == f7) {
                                i8--;
                            } else if (f8 < f7) {
                            }
                        }
                    }
                }
            }
        }
        if (i6 == -1) {
            return null;
        }
        return this.f12796f[i6];
    }

    @Override // u.c
    public final boolean e() {
        return this.f12798h == 0;
    }

    @Override // u.c
    public final void i(d dVar, c cVar, boolean z5) {
        i iVar = cVar.f12769a;
        if (iVar == null) {
            return;
        }
        InterfaceC1355b interfaceC1355b = cVar.f12772d;
        int iK = interfaceC1355b.k();
        for (int i6 = 0; i6 < iK; i6++) {
            i iVarF = interfaceC1355b.f(i6);
            float fA = interfaceC1355b.a(i6);
            C0803c c0803c = this.f12799i;
            c0803c.f9277x = iVarF;
            boolean z6 = iVarF.f12809w;
            float[] fArr = iVar.f12804D;
            if (z6) {
                boolean z7 = true;
                for (int i7 = 0; i7 < 9; i7++) {
                    float[] fArr2 = ((i) c0803c.f9277x).f12804D;
                    float f6 = (fArr[i7] * fA) + fArr2[i7];
                    fArr2[i7] = f6;
                    if (Math.abs(f6) < 1.0E-4f) {
                        ((i) c0803c.f9277x).f12804D[i7] = 0.0f;
                    } else {
                        z7 = false;
                    }
                }
                if (z7) {
                    ((g) c0803c.f9279z).k((i) c0803c.f9277x);
                }
            } else {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f7 = fArr[i8];
                    if (f7 != 0.0f) {
                        float f8 = f7 * fA;
                        if (Math.abs(f8) < 1.0E-4f) {
                            f8 = 0.0f;
                        }
                        ((i) c0803c.f9277x).f12804D[i8] = f8;
                    } else {
                        ((i) c0803c.f9277x).f12804D[i8] = 0.0f;
                    }
                }
                j(iVarF);
            }
            this.f12770b = (cVar.f12770b * fA) + this.f12770b;
        }
        k(iVar);
    }

    public final void j(i iVar) {
        int i6;
        int i7 = this.f12798h + 1;
        i[] iVarArr = this.f12796f;
        if (i7 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f12796f = iVarArr2;
            this.f12797g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f12796f;
        int i8 = this.f12798h;
        iVarArr3[i8] = iVar;
        int i9 = i8 + 1;
        this.f12798h = i9;
        if (i9 > 1 && iVarArr3[i8].f12810x > iVar.f12810x) {
            int i10 = 0;
            while (true) {
                i6 = this.f12798h;
                if (i10 >= i6) {
                    break;
                }
                this.f12797g[i10] = this.f12796f[i10];
                i10++;
            }
            Arrays.sort(this.f12797g, 0, i6, new f(0, this));
            for (int i11 = 0; i11 < this.f12798h; i11++) {
                this.f12796f[i11] = this.f12797g[i11];
            }
        }
        iVar.f12809w = true;
        iVar.a(this);
    }

    public final void k(i iVar) {
        int i6 = 0;
        while (i6 < this.f12798h) {
            if (this.f12796f[i6] == iVar) {
                while (true) {
                    int i7 = this.f12798h;
                    if (i6 >= i7 - 1) {
                        this.f12798h = i7 - 1;
                        iVar.f12809w = false;
                        return;
                    } else {
                        i[] iVarArr = this.f12796f;
                        int i8 = i6 + 1;
                        iVarArr[i6] = iVarArr[i8];
                        i6 = i8;
                    }
                }
            } else {
                i6++;
            }
        }
    }

    @Override // u.c
    public final String toString() {
        String str = " goal -> (" + this.f12770b + ") : ";
        for (int i6 = 0; i6 < this.f12798h; i6++) {
            i iVar = this.f12796f[i6];
            C0803c c0803c = this.f12799i;
            c0803c.f9277x = iVar;
            str = str + c0803c + " ";
        }
        return str;
    }
}
