package h1;

import android.os.Build;
import android.os.StrictMode;
import com.bumptech.glide.k;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: h1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0765e implements Closeable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f8955B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public BufferedWriter f8958E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f8960G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final File f8964w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final File f8965x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final File f8966y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final File f8967z;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f8957D = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final LinkedHashMap f8959F = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f8961H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ThreadPoolExecutor f8962I = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0762b());

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final CallableC0761a f8963J = new CallableC0761a(0, this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f8954A = 1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f8956C = 1;

    public C0765e(File file, long j6) {
        this.f8964w = file;
        this.f8965x = new File(file, "journal");
        this.f8966y = new File(file, "journal.tmp");
        this.f8967z = new File(file, "journal.bkp");
        this.f8955B = j6;
    }

    public static void N(File file, File file2, boolean z5) throws IOException {
        if (z5) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000c, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:16:0x0027, B:22:0x0033, B:23:0x004c, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:32:0x007a, B:31:0x0077, B:33:0x007d, B:35:0x008f, B:37:0x00b4, B:39:0x00dd, B:41:0x00ea, B:43:0x00f0, B:38:0x00be, B:45:0x00fa, B:46:0x00ff), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000c, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:16:0x0027, B:22:0x0033, B:23:0x004c, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:32:0x007a, B:31:0x0077, B:33:0x007d, B:35:0x008f, B:37:0x00b4, B:39:0x00dd, B:41:0x00ea, B:43:0x00f0, B:38:0x00be, B:45:0x00fa, B:46:0x00ff), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000c, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:16:0x0027, B:22:0x0033, B:23:0x004c, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:32:0x007a, B:31:0x0077, B:33:0x007d, B:35:0x008f, B:37:0x00b4, B:39:0x00dd, B:41:0x00ea, B:43:0x00f0, B:38:0x00be, B:45:0x00fa, B:46:0x00ff), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000c, B:10:0x0011, B:12:0x0015, B:14:0x001d, B:16:0x0027, B:22:0x0033, B:23:0x004c, B:24:0x004d, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:32:0x007a, B:31:0x0077, B:33:0x007d, B:35:0x008f, B:37:0x00b4, B:39:0x00dd, B:41:0x00ea, B:43:0x00f0, B:38:0x00be, B:45:0x00fa, B:46:0x00ff), top: B:49:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(h1.C0765e r9, com.bumptech.glide.k r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C0765e.b(h1.e, com.bumptech.glide.k, boolean):void");
    }

    public static void c(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void k(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static C0765e u(File file, long j6) throws IOException {
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                N(file2, file3, false);
            }
        }
        C0765e c0765e = new C0765e(file, j6);
        if (c0765e.f8965x.exists()) {
            try {
                c0765e.K();
                c0765e.J();
                return c0765e;
            } catch (IOException e6) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                c0765e.close();
                AbstractC0768h.a(c0765e.f8964w);
            }
        }
        file.mkdirs();
        C0765e c0765e2 = new C0765e(file, j6);
        c0765e2.M();
        return c0765e2;
    }

    public final void J() throws IOException {
        g(this.f8966y);
        Iterator it = this.f8959F.values().iterator();
        while (it.hasNext()) {
            C0763c c0763c = (C0763c) it.next();
            k kVar = c0763c.f8946f;
            int i6 = this.f8956C;
            int i7 = 0;
            if (kVar == null) {
                while (i7 < i6) {
                    this.f8957D += c0763c.f8942b[i7];
                    i7++;
                }
            } else {
                c0763c.f8946f = null;
                while (i7 < i6) {
                    g(c0763c.f8943c[i7]);
                    g(c0763c.f8944d[i7]);
                    i7++;
                }
                it.remove();
            }
        }
    }

    public final void K() {
        File file = this.f8965x;
        C0767g c0767g = new C0767g(new FileInputStream(file), AbstractC0768h.f8974a);
        try {
            String strB = c0767g.b();
            String strB2 = c0767g.b();
            String strB3 = c0767g.b();
            String strB4 = c0767g.b();
            String strB5 = c0767g.b();
            if (!"libcore.io.DiskLruCache".equals(strB) || !"1".equals(strB2) || !Integer.toString(this.f8954A).equals(strB3) || !Integer.toString(this.f8956C).equals(strB4) || !"".equals(strB5)) {
                throw new IOException("unexpected journal header: [" + strB + ", " + strB2 + ", " + strB4 + ", " + strB5 + "]");
            }
            int i6 = 0;
            while (true) {
                try {
                    L(c0767g.b());
                    i6++;
                } catch (EOFException unused) {
                    this.f8960G = i6 - this.f8959F.size();
                    if (c0767g.f8969A == -1) {
                        M();
                    } else {
                        this.f8958E = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC0768h.f8974a));
                    }
                    try {
                        c0767g.close();
                        return;
                    } catch (RuntimeException e6) {
                        throw e6;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c0767g.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void L(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i6 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i6);
        LinkedHashMap linkedHashMap = this.f8959F;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i6);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i6, iIndexOf2);
        }
        C0763c c0763c = (C0763c) linkedHashMap.get(strSubstring);
        if (c0763c == null) {
            c0763c = new C0763c(this, strSubstring);
            linkedHashMap.put(strSubstring, c0763c);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c0763c.f8946f = new k(this, c0763c);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c0763c.f8945e = true;
        c0763c.f8946f = null;
        if (strArrSplit.length != c0763c.f8948h.f8956C) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            try {
                c0763c.f8942b[i7] = Long.parseLong(strArrSplit[i7]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void M() {
        try {
            BufferedWriter bufferedWriter = this.f8958E;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8966y), AbstractC0768h.f8974a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f8954A));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f8956C));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C0763c c0763c : this.f8959F.values()) {
                    bufferedWriter2.write(c0763c.f8946f != null ? "DIRTY " + c0763c.f8941a + '\n' : "CLEAN " + c0763c.f8941a + c0763c.a() + '\n');
                }
                c(bufferedWriter2);
                if (this.f8965x.exists()) {
                    N(this.f8965x, this.f8967z, true);
                }
                N(this.f8966y, this.f8965x, false);
                this.f8967z.delete();
                this.f8958E = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8965x, true), AbstractC0768h.f8974a));
            } catch (Throwable th) {
                c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void O() {
        while (this.f8957D > this.f8955B) {
            String str = (String) ((Map.Entry) this.f8959F.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f8958E == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C0763c c0763c = (C0763c) this.f8959F.get(str);
                    if (c0763c != null && c0763c.f8946f == null) {
                        for (int i6 = 0; i6 < this.f8956C; i6++) {
                            File file = c0763c.f8943c[i6];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j6 = this.f8957D;
                            long[] jArr = c0763c.f8942b;
                            this.f8957D = j6 - jArr[i6];
                            jArr[i6] = 0;
                        }
                        this.f8960G++;
                        this.f8958E.append((CharSequence) "REMOVE");
                        this.f8958E.append(' ');
                        this.f8958E.append((CharSequence) str);
                        this.f8958E.append('\n');
                        this.f8959F.remove(str);
                        if (n()) {
                            this.f8962I.submit(this.f8963J);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f8958E == null) {
                return;
            }
            Iterator it = new ArrayList(this.f8959F.values()).iterator();
            while (it.hasNext()) {
                k kVar = ((C0763c) it.next()).f8946f;
                if (kVar != null) {
                    kVar.b();
                }
            }
            O();
            c(this.f8958E);
            this.f8958E = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final k h(String str) {
        synchronized (this) {
            try {
                if (this.f8958E == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C0763c c0763c = (C0763c) this.f8959F.get(str);
                if (c0763c == null) {
                    c0763c = new C0763c(this, str);
                    this.f8959F.put(str, c0763c);
                } else if (c0763c.f8946f != null) {
                    return null;
                }
                k kVar = new k(this, c0763c);
                c0763c.f8946f = kVar;
                this.f8958E.append((CharSequence) "DIRTY");
                this.f8958E.append(' ');
                this.f8958E.append((CharSequence) str);
                this.f8958E.append('\n');
                k(this.f8958E);
                return kVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized C0764d l(String str) {
        if (this.f8958E == null) {
            throw new IllegalStateException("cache is closed");
        }
        C0763c c0763c = (C0763c) this.f8959F.get(str);
        if (c0763c == null) {
            return null;
        }
        if (!c0763c.f8945e) {
            return null;
        }
        for (File file : c0763c.f8943c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f8960G++;
        this.f8958E.append((CharSequence) "READ");
        this.f8958E.append(' ');
        this.f8958E.append((CharSequence) str);
        this.f8958E.append('\n');
        if (n()) {
            this.f8962I.submit(this.f8963J);
        }
        long j6 = c0763c.f8947g;
        File[] fileArr = c0763c.f8943c;
        long[] jArr = c0763c.f8942b;
        C0764d c0764d = new C0764d();
        c0764d.f8951x = this;
        c0764d.f8952y = str;
        c0764d.f8950w = j6;
        c0764d.f8949A = fileArr;
        c0764d.f8953z = jArr;
        return c0764d;
    }

    public final boolean n() {
        int i6 = this.f8960G;
        return i6 >= 2000 && i6 >= this.f8959F.size();
    }
}
