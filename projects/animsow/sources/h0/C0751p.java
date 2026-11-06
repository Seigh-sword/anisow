package h0;

import android.transition.Transition;

/* JADX INFO: renamed from: h0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0751p extends L.i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f8875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f8876y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f8877z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0751p(h0.s0 r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            r5.<init>(r6)
            int r0 = r6.f8886a
            r1 = 2
            r2 = 0
            h0.B r3 = r6.f8888c
            if (r0 != r1) goto L1e
            if (r7 == 0) goto L19
            h0.z r0 = r3.f8621f0
            if (r0 != 0) goto L12
            goto L18
        L12:
            java.lang.Object r0 = r0.f8935j
            java.lang.Object r4 = h0.AbstractComponentCallbacksC0734B.f8589s0
            if (r0 != r4) goto L2c
        L18:
            goto L1c
        L19:
            r3.getClass()
        L1c:
            r0 = r2
            goto L2c
        L1e:
            if (r7 == 0) goto L19
            h0.z r0 = r3.f8621f0
            if (r0 != 0) goto L25
            goto L18
        L25:
            java.lang.Object r0 = r0.f8934i
            java.lang.Object r4 = h0.AbstractComponentCallbacksC0734B.f8589s0
            if (r0 != r4) goto L2c
            goto L18
        L2c:
            r5.f8875x = r0
            int r6 = r6.f8886a
            if (r6 != r1) goto L39
            if (r7 == 0) goto L37
            h0.z r6 = r3.f8621f0
            goto L39
        L37:
            h0.z r6 = r3.f8621f0
        L39:
            r6 = 1
            r5.f8876y = r6
            if (r8 == 0) goto L51
            if (r7 == 0) goto L4e
            h0.z r6 = r3.f8621f0
            if (r6 != 0) goto L45
            goto L51
        L45:
            java.lang.Object r6 = r6.f8936k
            java.lang.Object r7 = h0.AbstractComponentCallbacksC0734B.f8589s0
            if (r6 != r7) goto L4c
            goto L51
        L4c:
            r2 = r6
            goto L51
        L4e:
            r3.getClass()
        L51:
            r5.f8877z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0751p.<init>(h0.s0, boolean, boolean):void");
    }

    public final l0 s() {
        Object obj = this.f8875x;
        l0 l0VarT = t(obj);
        Object obj2 = this.f8877z;
        l0 l0VarT2 = t(obj2);
        if (l0VarT == null || l0VarT2 == null || l0VarT == l0VarT2) {
            return l0VarT == null ? l0VarT2 : l0VarT;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((s0) this.f1668w).f8888c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final l0 t(Object obj) {
        if (obj == null) {
            return null;
        }
        j0 j0Var = e0.f8805a;
        if (obj instanceof Transition) {
            return j0Var;
        }
        l0 l0Var = e0.f8806b;
        if (l0Var != null && l0Var.g(obj)) {
            return l0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((s0) this.f1668w).f8888c + " is not a valid framework Transition or AndroidX Transition");
    }
}
