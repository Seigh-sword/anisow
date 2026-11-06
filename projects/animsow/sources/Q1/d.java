package q1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import f2.h;
import j1.m;
import p1.w;
import p1.x;

/* JADX INFO: loaded from: classes.dex */
public final class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f12347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f12348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f12349d;

    public d(Context context, x xVar, x xVar2, Class cls) {
        this.f12346a = context.getApplicationContext();
        this.f12347b = xVar;
        this.f12348c = xVar2;
        this.f12349d = cls;
    }

    @Override // p1.x
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && h.x((Uri) obj);
    }

    @Override // p1.x
    public final w b(Object obj, int i6, int i7, m mVar) {
        Uri uri = (Uri) obj;
        return new w(new B1.b(uri), new c(this.f12346a, this.f12347b, this.f12348c, uri, i6, i7, mVar, this.f12349d));
    }
}
