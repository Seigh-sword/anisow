package l3;

import android.util.Log;
import j3.AbstractC0857g;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0940c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Charset f10056z = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final File f10057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10058x = 65536;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f10059y;

    public k(File file) {
        this.f10057w = file;
    }

    public final void a() {
        File file = this.f10057w;
        if (this.f10059y == null) {
            try {
                this.f10059y = new j(file);
            } catch (IOException e6) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e6);
            }
        }
    }

    @Override // l3.InterfaceC0940c
    public final void b() {
        AbstractC0857g.b(this.f10059y, "There was a problem closing the Crashlytics log file.");
        this.f10059y = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // l3.InterfaceC0940c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r7 = this;
            java.io.File r0 = r7.f10057w
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L38
        Lc:
            r7.a()
            l3.j r0 = r7.f10059y
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.J()
            byte[] r0 = new byte[r0]
            l3.j r4 = r7.f10059y     // Catch: java.io.IOException -> L29
            b3.c r5 = new b3.c     // Catch: java.io.IOException -> L29
            r5.<init>(r7, r0, r3)     // Catch: java.io.IOException -> L29
            r4.g(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L31:
            T1.j r4 = new T1.j
            r3 = r3[r2]
            r4.<init>(r3, r0)
        L38:
            if (r4 != 0) goto L3c
            r3 = r1
            goto L47
        L3c:
            int r0 = r4.f3424w
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f3425x
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L47:
            if (r3 == 0) goto L50
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = l3.k.f10056z
            r1.<init>(r3, r0)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.k.e():java.lang.String");
    }

    @Override // l3.InterfaceC0940c
    public final void g(String str, long j6) {
        boolean z5;
        a();
        int i6 = this.f10058x;
        if (this.f10059y == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i7 = i6 / 4;
            if (str.length() > i7) {
                str = "..." + str.substring(str.length() - i7);
            }
            this.f10059y.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j6), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f10056z));
            while (true) {
                j jVar = this.f10059y;
                synchronized (jVar) {
                    z5 = jVar.f10054y == 0;
                }
                if (z5 || this.f10059y.J() <= i6) {
                    return;
                } else {
                    this.f10059y.l();
                }
            }
        } catch (IOException e6) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e6);
        }
    }
}
