package N;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import d.AbstractC0628i;
import java.util.Locale;

/* JADX INFO: renamed from: N.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0089e implements InterfaceC0087d, InterfaceC0091f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Comparable f1981A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Object f1982B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f1984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1985y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1986z;

    public C0089e(C0089e c0089e) {
        this.f1983w = 1;
        ClipData clipData = (ClipData) c0089e.f1984x;
        clipData.getClass();
        this.f1984x = clipData;
        int i6 = c0089e.f1985y;
        if (i6 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i6 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f1985y = i6;
        int i7 = c0089e.f1986z;
        if ((i7 & 1) == i7) {
            this.f1986z = i7;
            this.f1981A = (Uri) c0089e.f1981A;
            this.f1982B = (Bundle) c0089e.f1982B;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i7) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    public static String h(Y2.g gVar) {
        gVar.a();
        Y2.i iVar = gVar.f4818c;
        String str = iVar.f4835e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f4832b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // N.InterfaceC0087d
    public final C0093g a() {
        return new C0093g(new C0089e(this));
    }

    @Override // N.InterfaceC0087d
    public final void b(Bundle bundle) {
        this.f1982B = bundle;
    }

    @Override // N.InterfaceC0087d
    public final void c(Uri uri) {
        this.f1981A = uri;
    }

    @Override // N.InterfaceC0087d
    public final void d(int i6) {
        this.f1986z = i6;
    }

    @Override // N.InterfaceC0091f
    public final ClipData e() {
        return (ClipData) this.f1984x;
    }

    @Override // N.InterfaceC0091f
    public final int f() {
        return this.f1986z;
    }

    public final synchronized String g() {
        try {
            if (((String) this.f1981A) == null) {
                k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f1981A;
    }

    public final PackageInfo i(String str) {
        try {
            return ((Context) this.f1984x).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e6) {
            Log.w("FirebaseMessaging", "Failed to find package " + e6);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0026, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0028, B:17:0x002e, B:19:0x0040, B:21:0x0046, B:24:0x004a, B:26:0x005d, B:28:0x0063, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f1986z     // Catch: java.lang.Throwable -> L26
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
        L7:
            monitor-exit(r5)
            goto L7b
        La:
            java.lang.Object r0 = r5.f1984x     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L26
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L26
            r4 = -1
            if (r3 != r4) goto L28
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            goto L7e
        L26:
            r0 = move-exception
            goto L80
        L28:
            boolean r3 = t0.AbstractC1332d.S()     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L4a
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L26
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L4a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L26
            if (r3 <= 0) goto L4a
            r5.f1986z = r1     // Catch: java.lang.Throwable -> L26
        L48:
            monitor-exit(r5)
            goto L7f
        L4a:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L26
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L26
            r3 = 2
            if (r0 == 0) goto L66
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L26
            if (r0 <= 0) goto L66
            r5.f1986z = r3     // Catch: java.lang.Throwable -> L26
            goto L48
        L66:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L26
            boolean r0 = t0.AbstractC1332d.S()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L76
            r5.f1986z = r3     // Catch: java.lang.Throwable -> L26
            goto L78
        L76:
            r5.f1986z = r1     // Catch: java.lang.Throwable -> L26
        L78:
            int r0 = r5.f1986z     // Catch: java.lang.Throwable -> L26
            goto L7
        L7b:
            if (r0 == 0) goto L7e
            goto L7f
        L7e:
            r1 = r2
        L7f:
            return r1
        L80:
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0089e.j():boolean");
    }

    public final synchronized void k() {
        PackageInfo packageInfoI = i(((Context) this.f1984x).getPackageName());
        if (packageInfoI != null) {
            this.f1981A = Integer.toString(packageInfoI.versionCode);
            this.f1982B = packageInfoI.versionName;
        }
    }

    @Override // N.InterfaceC0091f
    public final ContentInfo l() {
        return null;
    }

    @Override // N.InterfaceC0091f
    public final int n() {
        return this.f1985y;
    }

    public final String toString() {
        String str;
        switch (this.f1983w) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f1984x).getDescription());
                sb.append(", source=");
                int i6 = this.f1985y;
                sb.append(i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? String.valueOf(i6) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i7 = this.f1986z;
                sb.append((i7 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i7));
                if (((Uri) this.f1981A) == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + ((Uri) this.f1981A).toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0628i.m(sb, ((Bundle) this.f1982B) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0089e(ClipData clipData, int i6) {
        this.f1983w = 0;
        this.f1984x = clipData;
        this.f1985y = i6;
    }

    public C0089e(Context context) {
        this.f1983w = 2;
        this.f1986z = 0;
        this.f1984x = context;
    }
}
