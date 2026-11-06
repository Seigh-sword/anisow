package i;

import android.content.Context;

/* JADX INFO: renamed from: i.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0814n implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f9326x;

    public /* synthetic */ RunnableC0814n(Context context, int i6) {
        this.f9325w = i6;
        this.f9326x = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.f9325w
            android.content.Context r1 = r11.f9326x
            switch(r0) {
                case 0: goto L30;
                case 1: goto L15;
                default: goto L7;
            }
        L7:
            n.a r0 = new n.a
            r2 = 11
            r0.<init>(r2)
            B3.e r2 = t0.AbstractC1332d.f12692a
            r3 = 0
            t0.AbstractC1332d.E0(r1, r0, r2, r3)
            return
        L15:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r7 = 0
            r5 = 0
            r6 = 1
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            i.n r2 = new i.n
            r3 = 2
            r2.<init>(r1, r3)
            r0.execute(r2)
            return
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 33
            if (r0 < r3) goto Lae
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r4.<init>(r1, r5)
            android.content.pm.PackageManager r5 = r1.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r4)
            if (r5 == r2) goto Lae
            java.lang.String r5 = "locale"
            if (r0 < r3) goto L83
            s.c r0 = i.AbstractC0818s.f9334C
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r0.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            i.s r3 = (i.AbstractC0818s) r3
            if (r3 == 0) goto L52
            i.H r3 = (i.H) r3
            android.content.Context r3 = r3.f9171G
            if (r3 == 0) goto L52
            java.lang.Object r0 = r3.getSystemService(r5)
            goto L72
        L71:
            r0 = 0
        L72:
            if (r0 == 0) goto L88
            android.os.LocaleList r0 = i.AbstractC0816p.a(r0)
            J.i r3 = new J.i
            J.k r6 = new J.k
            r6.<init>(r0)
            r3.<init>(r6)
            goto L8a
        L83:
            J.i r3 = i.AbstractC0818s.f9339y
            if (r3 == 0) goto L88
            goto L8a
        L88:
            J.i r3 = J.i.f1165b
        L8a:
            J.j r0 = r3.f1166a
            J.k r0 = (J.k) r0
            android.os.LocaleList r0 = r0.f1167a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La7
            java.lang.String r0 = D.AbstractC0008i.b(r1)
            java.lang.Object r3 = r1.getSystemService(r5)
            if (r3 == 0) goto La7
            android.os.LocaleList r0 = i.AbstractC0815o.a(r0)
            i.AbstractC0816p.b(r3, r0)
        La7:
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r0.setComponentEnabledSetting(r4, r2, r2)
        Lae:
            i.AbstractC0818s.f9333B = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.RunnableC0814n.run():void");
    }
}
