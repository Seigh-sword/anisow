package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class J1 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ AbstractC0571l1 f7595A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f7596B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ String f7597C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Thread[] f7598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f7599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f7600y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7601z;

    public J1(Thread[] threadArr, String str, String str2, JSONObject jSONObject, AbstractC0571l1 abstractC0571l1, int i6, String str3) {
        this.f7598w = threadArr;
        this.f7599x = str;
        this.f7600y = str2;
        this.f7601z = jSONObject;
        this.f7595A = abstractC0571l1;
        this.f7596B = i6;
        this.f7597C = str3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(1:4)|5|(4:145|6|7|(6:154|8|9|(1:11)|(1:16)|17))|(6:143|19|(4:21|(2:23|(5:25|26|139|27|31)(1:28))(1:29)|30|31)(0)|105|132|133)(1:38)|39|(1:43)|158|44|151|45|46|141|47|48|(14:82|137|83|84|156|85|(1:87)|88|91|(1:93)(1:94)|95|(1:99)|(2:101|77)(2:102|103)|104)(5:52|153|(6:149|54|(1:56)|(3:60|(1:62)(1:63)|64)(1:65)|(0)(3:68|69|70)|104)(6:71|(1:73)(1:74)|75|(1:78)|77|104)|67|104)|105|132|133|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:0|2|(1:4)|5|145|6|7|(6:154|8|9|(1:11)|(1:16)|17)|(6:143|19|(4:21|(2:23|(5:25|26|139|27|31)(1:28))(1:29)|30|31)(0)|105|132|133)(1:38)|39|(1:43)|158|44|151|45|46|141|47|48|(14:82|137|83|84|156|85|(1:87)|88|91|(1:93)(1:94)|95|(1:99)|(2:101|77)(2:102|103)|104)(5:52|153|(6:149|54|(1:56)|(3:60|(1:62)(1:63)|64)(1:65)|(0)(3:68|69|70)|104)(6:71|(1:73)(1:74)|75|(1:78)|77|104)|67|104)|105|132|133|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:0|2|(1:4)|5|145|6|7|154|8|9|(1:11)|(1:16)|17|(6:143|19|(4:21|(2:23|(5:25|26|139|27|31)(1:28))(1:29)|30|31)(0)|105|132|133)(1:38)|39|(1:43)|158|44|151|45|46|141|47|48|(14:82|137|83|84|156|85|(1:87)|88|91|(1:93)(1:94)|95|(1:99)|(2:101|77)(2:102|103)|104)(5:52|153|(6:149|54|(1:56)|(3:60|(1:62)(1:63)|64)(1:65)|(0)(3:68|69|70)|104)(6:71|(1:73)(1:74)|75|(1:78)|77|104)|67|104)|105|132|133|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d6, code lost:
    
        r9 = r21;
        r21 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02dc, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02df, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02e0, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ef A[Catch: all -> 0x030a, TryCatch #5 {all -> 0x030a, blocks: (B:117:0x02eb, B:119:0x02ef, B:122:0x02f4, B:128:0x0326, B:125:0x030e), top: B:147:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030e A[Catch: all -> 0x030a, TryCatch #5 {all -> 0x030a, blocks: (B:117:0x02eb, B:119:0x02ef, B:122:0x02f4, B:128:0x0326, B:125:0x030e), top: B:147:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0326 A[Catch: all -> 0x030a, TRY_LEAVE, TryCatch #5 {all -> 0x030a, blocks: (B:117:0x02eb, B:119:0x02ef, B:122:0x02f4, B:128:0x0326, B:125:0x030e), top: B:147:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread[]] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.J1.run():void");
    }
}
