package N4;

import M4.C0078x;
import M4.InterfaceC0079y;
import v4.AbstractC1423a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1423a implements InterfaceC0079y {
    private volatile Object _preHandler;

    public b() {
        super(C0078x.f1929w);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J(v4.InterfaceC1432j r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r0 > r5) goto L4f
            r0 = 28
            if (r5 >= r0) goto L4f
            java.lang.Object r5 = r4._preHandler
            r0 = 0
            r1 = 0
            if (r5 == r4) goto L13
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            goto L35
        L13:
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.lang.String r2 = "getUncaughtExceptionPreHandler"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L32
            int r2 = r5.getModifiers()     // Catch: java.lang.Throwable -> L32
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L32
            int r2 = r5.getModifiers()     // Catch: java.lang.Throwable -> L32
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L32
            goto L33
        L32:
            r5 = r1
        L33:
            r4._preHandler = r5
        L35:
            if (r5 == 0) goto L3e
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r5 = r5.invoke(r1, r0)
            goto L3f
        L3e:
            r5 = r1
        L3f:
            boolean r0 = r5 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r0 == 0) goto L46
            r1 = r5
            java.lang.Thread$UncaughtExceptionHandler r1 = (java.lang.Thread.UncaughtExceptionHandler) r1
        L46:
            if (r1 == 0) goto L4f
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r1.uncaughtException(r5, r6)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.b.J(v4.j, java.lang.Throwable):void");
    }
}
