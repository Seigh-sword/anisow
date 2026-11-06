package z;

import android.util.AttributeSet;
import w.C1434a;

/* JADX INFO: renamed from: z.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1510a extends AbstractC1512c {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13838D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f13839E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C1434a f13840F;

    @Override // z.AbstractC1512c
    public final void g(AttributeSet attributeSet) {
        C1434a c1434a = new C1434a();
        c1434a.f13310s0 = 0;
        c1434a.f13311t0 = true;
        c1434a.f13312u0 = 0;
        c1434a.f13313v0 = false;
        this.f13840F = c1434a;
        this.f13854z = c1434a;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f13840F.f13311t0;
    }

    public int getMargin() {
        return this.f13840F.f13312u0;
    }

    public int getType() {
        return this.f13838D;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // z.AbstractC1512c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(w.C1437d r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.f13838D
            r5.f13839E = r0
            r1 = 0
            r2 = 6
            r3 = 1
            r4 = 5
            if (r7 == 0) goto L14
            if (r0 != r4) goto Lf
        Lc:
            r5.f13839E = r3
            goto L1a
        Lf:
            if (r0 != r2) goto L1a
        L11:
            r5.f13839E = r1
            goto L1a
        L14:
            if (r0 != r4) goto L17
            goto L11
        L17:
            if (r0 != r2) goto L1a
            goto Lc
        L1a:
            boolean r7 = r6 instanceof w.C1434a
            if (r7 == 0) goto L24
            w.a r6 = (w.C1434a) r6
            int r7 = r5.f13839E
            r6.f13310s0 = r7
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C1510a.h(w.d, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z5) {
        this.f13840F.f13311t0 = z5;
    }

    public void setDpMargin(int i6) {
        this.f13840F.f13312u0 = (int) ((i6 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i6) {
        this.f13840F.f13312u0 = i6;
    }

    public void setType(int i6) {
        this.f13838D = i6;
    }
}
