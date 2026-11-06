package F0;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: F0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032t extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0.j f556d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f559g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f553a = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F.d f557e = new F.d();

    public C0032t(C c6) {
        this.f559g = c6;
    }

    @Override // F0.x, F0.u
    public final void b(w wVar) {
        this.f555c = true;
    }

    public final void g() {
        F.d dVar;
        if (this.f556d != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f6 = this.f553a;
        F.d dVar2 = this.f557e;
        int i6 = (dVar2.f433x + 1) % 20;
        dVar2.f433x = i6;
        ((long[]) dVar2.f434y)[i6] = jCurrentAnimationTimeMillis;
        ((float[]) dVar2.f435z)[i6] = f6;
        b0.i iVar = new b0.i();
        float fSqrt = 0.0f;
        iVar.f5883a = 0.0f;
        this.f556d = new b0.j(iVar);
        b0.k kVar = new b0.k();
        kVar.f5906b = 1.0f;
        int i7 = 0;
        kVar.f5907c = false;
        kVar.a(200.0f);
        b0.j jVar = this.f556d;
        jVar.f5902m = kVar;
        jVar.f5891b = this.f553a;
        jVar.f5892c = true;
        if (jVar.f5895f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = jVar.f5901l;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        b0.j jVar2 = this.f556d;
        int i8 = dVar2.f433x;
        long j6 = Long.MIN_VALUE;
        if (i8 != 0 || ((long[]) dVar2.f434y)[i8] != Long.MIN_VALUE) {
            long j7 = ((long[]) dVar2.f434y)[i8];
            long j8 = j7;
            while (true) {
                long j9 = ((long[]) dVar2.f434y)[i8];
                if (j9 == j6) {
                    break;
                }
                float f7 = j7 - j9;
                float fAbs = Math.abs(j9 - j8);
                if (f7 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i8 == 0) {
                    i8 = 20;
                }
                i8--;
                i7++;
                if (i7 >= 20) {
                    break;
                }
                j8 = j9;
                j6 = Long.MIN_VALUE;
            }
            if (i7 >= 2) {
                if (i7 == 2) {
                    int i9 = dVar2.f433x;
                    int i10 = i9 == 0 ? 19 : i9 - 1;
                    long[] jArr = (long[]) dVar2.f434y;
                    float f8 = jArr[i9] - jArr[i10];
                    if (f8 != 0.0f) {
                        float[] fArr = (float[]) dVar2.f435z;
                        fSqrt = ((fArr[i9] - fArr[i10]) / f8) * 1000.0f;
                    }
                } else {
                    int i11 = dVar2.f433x;
                    int i12 = ((i11 - i7) + 21) % 20;
                    int i13 = (i11 + 21) % 20;
                    long j10 = ((long[]) dVar2.f434y)[i12];
                    float f9 = ((float[]) dVar2.f435z)[i12];
                    int i14 = i12 + 1;
                    int i15 = i14 % 20;
                    float f10 = 0.0f;
                    while (i15 != i13) {
                        long j11 = ((long[]) dVar2.f434y)[i15];
                        float f11 = j11 - j10;
                        if (f11 == fSqrt) {
                            dVar = dVar2;
                        } else {
                            float f12 = ((float[]) dVar2.f435z)[i15];
                            dVar = dVar2;
                            float f13 = (f12 - f9) / f11;
                            float fAbs2 = (Math.abs(f13) * (f13 - ((float) (Math.sqrt(2.0f * Math.abs(f10)) * ((double) Math.signum(f10)))))) + f10;
                            if (i15 == i14) {
                                fAbs2 *= 0.5f;
                            }
                            f10 = fAbs2;
                            f9 = f12;
                            j10 = j11;
                        }
                        i15 = (i15 + 1) % 20;
                        dVar2 = dVar;
                        fSqrt = 0.0f;
                    }
                    fSqrt = 1000.0f * ((float) (Math.sqrt(Math.abs(f10) * 2.0f) * ((double) Math.signum(f10))));
                }
            }
        }
        jVar2.f5890a = fSqrt;
        b0.j jVar3 = this.f556d;
        jVar3.f5896g = this.f559g.f588T + 1;
        jVar3.f5897h = -1.0f;
        jVar3.f5899j = 4.0f;
        C0031s c0031s = new C0031s(this);
        ArrayList arrayList2 = jVar3.f5900k;
        if (arrayList2.contains(c0031s)) {
            return;
        }
        arrayList2.add(c0031s);
    }
}
