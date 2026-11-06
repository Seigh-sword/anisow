package F1;

import G1.C0044l;
import I1.h;
import android.content.Context;
import android.net.ConnectivityManager;
import d.AbstractC0628i;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1.b f612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P1.a f616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P1.a f617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f618g;

    public d(Context context, P1.a aVar, P1.a aVar2) {
        y3.d dVar = new y3.d();
        C0044l.f807a.a(dVar);
        dVar.f13830d = true;
        this.f612a = new K1.b(19, dVar);
        this.f614c = context;
        this.f613b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f615d = b(a.f600c);
        this.f616e = aVar2;
        this.f617f = aVar;
        this.f618g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException(AbstractC0628i.q("Invalid url: ", str), e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final H1.i a(H1.i r7) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.d.a(H1.i):H1.i");
    }
}
