package u;

import d.AbstractC0628i;
import java.util.Arrays;

/* JADX INFO: renamed from: u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1354a implements InterfaceC1355b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P0.h f12761c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12759a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12762d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f12763e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f12764f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f12765g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12766h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12767i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12768j = false;

    public C1354a(c cVar, P0.h hVar) {
        this.f12760b = cVar;
        this.f12761c = hVar;
    }

    @Override // u.InterfaceC1355b
    public final float a(int i6) {
        int i7 = this.f12766h;
        for (int i8 = 0; i7 != -1 && i8 < this.f12759a; i8++) {
            if (i8 == i6) {
                return this.f12765g[i7];
            }
            i7 = this.f12764f[i7];
        }
        return 0.0f;
    }

    @Override // u.InterfaceC1355b
    public final boolean b(i iVar) {
        int i6 = this.f12766h;
        if (i6 == -1) {
            return false;
        }
        for (int i7 = 0; i6 != -1 && i7 < this.f12759a; i7++) {
            if (this.f12763e[i6] == iVar.f12810x) {
                return true;
            }
            i6 = this.f12764f[i6];
        }
        return false;
    }

    @Override // u.InterfaceC1355b
    public final void c(i iVar, float f6, boolean z5) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i6 = this.f12766h;
            c cVar = this.f12760b;
            if (i6 == -1) {
                this.f12766h = 0;
                this.f12765g[0] = f6;
                this.f12763e[0] = iVar.f12810x;
                this.f12764f[0] = -1;
                iVar.f12807G++;
                iVar.a(cVar);
                this.f12759a++;
                if (this.f12768j) {
                    return;
                }
                int i7 = this.f12767i + 1;
                this.f12767i = i7;
                int[] iArr = this.f12763e;
                if (i7 >= iArr.length) {
                    this.f12768j = true;
                    this.f12767i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i8 = -1;
            for (int i9 = 0; i6 != -1 && i9 < this.f12759a; i9++) {
                int i10 = this.f12763e[i6];
                int i11 = iVar.f12810x;
                if (i10 == i11) {
                    float[] fArr = this.f12765g;
                    float f7 = fArr[i6] + f6;
                    if (f7 > -0.001f && f7 < 0.001f) {
                        f7 = 0.0f;
                    }
                    fArr[i6] = f7;
                    if (f7 == 0.0f) {
                        if (i6 == this.f12766h) {
                            this.f12766h = this.f12764f[i6];
                        } else {
                            int[] iArr2 = this.f12764f;
                            iArr2[i8] = iArr2[i6];
                        }
                        if (z5) {
                            iVar.b(cVar);
                        }
                        if (this.f12768j) {
                            this.f12767i = i6;
                        }
                        iVar.f12807G--;
                        this.f12759a--;
                        return;
                    }
                    return;
                }
                if (i10 < i11) {
                    i8 = i6;
                }
                i6 = this.f12764f[i6];
            }
            int length = this.f12767i;
            int i12 = length + 1;
            if (this.f12768j) {
                int[] iArr3 = this.f12763e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i12;
            }
            int[] iArr4 = this.f12763e;
            if (length >= iArr4.length && this.f12759a < iArr4.length) {
                int i13 = 0;
                while (true) {
                    int[] iArr5 = this.f12763e;
                    if (i13 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i13] == -1) {
                        length = i13;
                        break;
                    }
                    i13++;
                }
            }
            int[] iArr6 = this.f12763e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i14 = this.f12762d * 2;
                this.f12762d = i14;
                this.f12768j = false;
                this.f12767i = length - 1;
                this.f12765g = Arrays.copyOf(this.f12765g, i14);
                this.f12763e = Arrays.copyOf(this.f12763e, this.f12762d);
                this.f12764f = Arrays.copyOf(this.f12764f, this.f12762d);
            }
            this.f12763e[length] = iVar.f12810x;
            this.f12765g[length] = f6;
            int[] iArr7 = this.f12764f;
            if (i8 != -1) {
                iArr7[length] = iArr7[i8];
                iArr7[i8] = length;
            } else {
                iArr7[length] = this.f12766h;
                this.f12766h = length;
            }
            iVar.f12807G++;
            iVar.a(cVar);
            this.f12759a++;
            if (!this.f12768j) {
                this.f12767i++;
            }
            int i15 = this.f12767i;
            int[] iArr8 = this.f12763e;
            if (i15 >= iArr8.length) {
                this.f12768j = true;
                this.f12767i = iArr8.length - 1;
            }
        }
    }

    @Override // u.InterfaceC1355b
    public final void clear() {
        int i6 = this.f12766h;
        for (int i7 = 0; i6 != -1 && i7 < this.f12759a; i7++) {
            i iVar = ((i[]) this.f12761c.f2410d)[this.f12763e[i6]];
            if (iVar != null) {
                iVar.b(this.f12760b);
            }
            i6 = this.f12764f[i6];
        }
        this.f12766h = -1;
        this.f12767i = -1;
        this.f12768j = false;
        this.f12759a = 0;
    }

    @Override // u.InterfaceC1355b
    public final float d(i iVar) {
        int i6 = this.f12766h;
        for (int i7 = 0; i6 != -1 && i7 < this.f12759a; i7++) {
            if (this.f12763e[i6] == iVar.f12810x) {
                return this.f12765g[i6];
            }
            i6 = this.f12764f[i6];
        }
        return 0.0f;
    }

    @Override // u.InterfaceC1355b
    public final void e(i iVar, float f6) {
        if (f6 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i6 = this.f12766h;
        c cVar = this.f12760b;
        if (i6 == -1) {
            this.f12766h = 0;
            this.f12765g[0] = f6;
            this.f12763e[0] = iVar.f12810x;
            this.f12764f[0] = -1;
            iVar.f12807G++;
            iVar.a(cVar);
            this.f12759a++;
            if (this.f12768j) {
                return;
            }
            int i7 = this.f12767i + 1;
            this.f12767i = i7;
            int[] iArr = this.f12763e;
            if (i7 >= iArr.length) {
                this.f12768j = true;
                this.f12767i = iArr.length - 1;
                return;
            }
            return;
        }
        int i8 = -1;
        for (int i9 = 0; i6 != -1 && i9 < this.f12759a; i9++) {
            int i10 = this.f12763e[i6];
            int i11 = iVar.f12810x;
            if (i10 == i11) {
                this.f12765g[i6] = f6;
                return;
            }
            if (i10 < i11) {
                i8 = i6;
            }
            i6 = this.f12764f[i6];
        }
        int length = this.f12767i;
        int i12 = length + 1;
        if (this.f12768j) {
            int[] iArr2 = this.f12763e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i12;
        }
        int[] iArr3 = this.f12763e;
        if (length >= iArr3.length && this.f12759a < iArr3.length) {
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f12763e;
                if (i13 >= iArr4.length) {
                    break;
                }
                if (iArr4[i13] == -1) {
                    length = i13;
                    break;
                }
                i13++;
            }
        }
        int[] iArr5 = this.f12763e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i14 = this.f12762d * 2;
            this.f12762d = i14;
            this.f12768j = false;
            this.f12767i = length - 1;
            this.f12765g = Arrays.copyOf(this.f12765g, i14);
            this.f12763e = Arrays.copyOf(this.f12763e, this.f12762d);
            this.f12764f = Arrays.copyOf(this.f12764f, this.f12762d);
        }
        this.f12763e[length] = iVar.f12810x;
        this.f12765g[length] = f6;
        int[] iArr6 = this.f12764f;
        if (i8 != -1) {
            iArr6[length] = iArr6[i8];
            iArr6[i8] = length;
        } else {
            iArr6[length] = this.f12766h;
            this.f12766h = length;
        }
        iVar.f12807G++;
        iVar.a(cVar);
        int i15 = this.f12759a + 1;
        this.f12759a = i15;
        if (!this.f12768j) {
            this.f12767i++;
        }
        int[] iArr7 = this.f12763e;
        if (i15 >= iArr7.length) {
            this.f12768j = true;
        }
        if (this.f12767i >= iArr7.length) {
            this.f12768j = true;
            this.f12767i = iArr7.length - 1;
        }
    }

    @Override // u.InterfaceC1355b
    public final i f(int i6) {
        int i7 = this.f12766h;
        for (int i8 = 0; i7 != -1 && i8 < this.f12759a; i8++) {
            if (i8 == i6) {
                return ((i[]) this.f12761c.f2410d)[this.f12763e[i7]];
            }
            i7 = this.f12764f[i7];
        }
        return null;
    }

    @Override // u.InterfaceC1355b
    public final float g(i iVar, boolean z5) {
        int i6 = this.f12766h;
        if (i6 == -1) {
            return 0.0f;
        }
        int i7 = 0;
        int i8 = -1;
        while (i6 != -1 && i7 < this.f12759a) {
            if (this.f12763e[i6] == iVar.f12810x) {
                if (i6 == this.f12766h) {
                    this.f12766h = this.f12764f[i6];
                } else {
                    int[] iArr = this.f12764f;
                    iArr[i8] = iArr[i6];
                }
                if (z5) {
                    iVar.b(this.f12760b);
                }
                iVar.f12807G--;
                this.f12759a--;
                this.f12763e[i6] = -1;
                if (this.f12768j) {
                    this.f12767i = i6;
                }
                return this.f12765g[i6];
            }
            i7++;
            i8 = i6;
            i6 = this.f12764f[i6];
        }
        return 0.0f;
    }

    @Override // u.InterfaceC1355b
    public final void h(float f6) {
        int i6 = this.f12766h;
        for (int i7 = 0; i6 != -1 && i7 < this.f12759a; i7++) {
            float[] fArr = this.f12765g;
            fArr[i6] = fArr[i6] / f6;
            i6 = this.f12764f[i6];
        }
    }

    @Override // u.InterfaceC1355b
    public final float i(c cVar, boolean z5) {
        float fD = d(cVar.f12769a);
        g(cVar.f12769a, z5);
        InterfaceC1355b interfaceC1355b = cVar.f12772d;
        int iK = interfaceC1355b.k();
        for (int i6 = 0; i6 < iK; i6++) {
            i iVarF = interfaceC1355b.f(i6);
            c(iVarF, interfaceC1355b.d(iVarF) * fD, z5);
        }
        return fD;
    }

    @Override // u.InterfaceC1355b
    public final void j() {
        int i6 = this.f12766h;
        for (int i7 = 0; i6 != -1 && i7 < this.f12759a; i7++) {
            float[] fArr = this.f12765g;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.f12764f[i6];
        }
    }

    @Override // u.InterfaceC1355b
    public final int k() {
        return this.f12759a;
    }

    public final String toString() {
        int i6 = this.f12766h;
        String str = "";
        for (int i7 = 0; i6 != -1 && i7 < this.f12759a; i7++) {
            str = (AbstractC0628i.i(str, " -> ") + this.f12765g[i6] + " : ") + ((i[]) this.f12761c.f2410d)[this.f12763e[i6]];
            i6 = this.f12764f[i6];
        }
        return str;
    }
}
