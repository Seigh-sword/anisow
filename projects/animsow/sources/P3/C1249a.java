package p3;

import J0.l;
import android.util.Log;
import d.AbstractC0628i;
import j3.C0858h;
import j3.C0860j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import m3.L0;
import n3.C1156c;

/* JADX INFO: renamed from: p3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1249a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f12307e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12308f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1156c f12309g = new C1156c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final K.b f12310h = new K.b(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0858h f12311i = new C0858h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f12312a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1251c f12313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f12314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0860j f12315d;

    public C1249a(C1251c c1251c, l lVar, C0860j c0860j) {
        this.f12313b = c1251c;
        this.f12314c = lVar;
        this.f12315d = c0860j;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i6 = fileInputStream.read(bArr);
                if (i6 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f12307e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i6);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f12307e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        C1251c c1251c = this.f12313b;
        arrayList.addAll(C1251c.s(((File) c1251c.f12323g).listFiles()));
        arrayList.addAll(C1251c.s(((File) c1251c.f12324h).listFiles()));
        K.b bVar = f12310h;
        Collections.sort(arrayList, bVar);
        List listS = C1251c.s(((File) c1251c.f12322f).listFiles());
        Collections.sort(listS, bVar);
        arrayList.addAll(listS);
        return arrayList;
    }

    public final void c(L0 l02, String str, boolean z5) {
        C1251c c1251c = this.f12313b;
        int i6 = this.f12314c.c().f12473a.f2042a;
        f12309g.getClass();
        try {
            e(c1251c.n(str, AbstractC0628i.j("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f12312a.getAndIncrement())), z5 ? "_" : "")), C1156c.f11702a.c(l02));
        } catch (IOException e6) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e6);
        }
        C0858h c0858h = new C0858h(3);
        c1251c.getClass();
        File file = new File((File) c1251c.f12321e, str);
        file.mkdirs();
        List<File> listS = C1251c.s(file.listFiles(c0858h));
        Collections.sort(listS, new K.b(4));
        int size = listS.size();
        for (File file2 : listS) {
            if (size <= i6) {
                return;
            }
            C1251c.r(file2);
            size--;
        }
    }
}
