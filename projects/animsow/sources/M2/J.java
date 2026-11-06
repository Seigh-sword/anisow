package m2;

import b2.C0337b;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class J extends X {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10652A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f10653B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f10654C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f10655D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f10656E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f10657F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f10658G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f10659H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f10660I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f10661J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f10662K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f10663L;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f10664y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f10665z;

    @Override // m2.X
    public final boolean A() {
        return true;
    }

    public final String B() {
        y();
        AbstractC1332d.m(this.f10664y);
        return this.f10664y;
    }

    public final String C() {
        r();
        y();
        AbstractC1332d.m(this.f10659H);
        return this.f10659H;
    }

    public final void D() {
        String str;
        r();
        if (p().C().i(EnumC1083y0.f11278y)) {
            byte[] bArr = new byte[16];
            q().F0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            f().f10722I.d("Analytics Storage consent is not granted");
            str = null;
        }
        f().f10722I.d("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f10661J = str;
        ((C0337b) h()).getClass();
        this.f10662K = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136 A[Catch: IllegalStateException -> 0x0161, TryCatch #3 {IllegalStateException -> 0x0161, blocks: (B:53:0x00fd, B:57:0x011a, B:61:0x0126, B:65:0x012e, B:67:0x0136, B:71:0x0150, B:75:0x015e, B:74:0x015a, B:70:0x014c, B:79:0x0165, B:81:0x0177, B:83:0x017c, B:82:0x017a, B:60:0x0122, B:56:0x0116), top: B:127:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165 A[Catch: IllegalStateException -> 0x0161, TryCatch #3 {IllegalStateException -> 0x0161, blocks: (B:53:0x00fd, B:57:0x011a, B:61:0x0126, B:65:0x012e, B:67:0x0136, B:71:0x0150, B:75:0x015e, B:74:0x015a, B:70:0x014c, B:79:0x0165, B:81:0x0177, B:83:0x017c, B:82:0x017a, B:60:0x0122, B:56:0x0116), top: B:127:0x00fd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.J.E():void");
    }
}
