package m2;

import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f10764A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f10765B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ L.i f10766C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Serializable f10769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Serializable f10770z;

    /* JADX WARN: Multi-variable type inference failed */
    public U(Q q5, String str, URL url, byte[] bArr, Map map, T t5) {
        this.f10767w = 0;
        this.f10766C = q5;
        AbstractC1332d.g(str);
        AbstractC1332d.m(url);
        this.f10769y = url;
        this.f10770z = bArr;
        this.f10764A = t5;
        this.f10768x = str;
        this.f10765B = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.U.run():void");
    }

    public U(Y0 y02, AtomicReference atomicReference, String str, String str2, B1 b1) {
        this.f10767w = 1;
        this.f10769y = atomicReference;
        this.f10768x = null;
        this.f10770z = str;
        this.f10764A = str2;
        this.f10765B = b1;
        this.f10766C = y02;
    }
}
