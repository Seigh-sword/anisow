package Z;

import C4.l;
import M4.InterfaceC0080z;
import W.C0186e;
import W.InterfaceC0184c;
import W.W;
import a0.C0256d;
import a0.C0257e;
import android.content.Context;
import f5.m;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X.a f4907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f4908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0080z f4909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C0256d f4911f;

    public c(String str, X.a aVar, l lVar, InterfaceC0080z interfaceC0080z) {
        AbstractC1305a.o(str, "name");
        this.f4906a = str;
        this.f4907b = aVar;
        this.f4908c = lVar;
        this.f4909d = interfaceC0080z;
        this.f4910e = new Object();
    }

    public final C0256d a(Object obj, I4.f fVar) {
        C0256d c0256d;
        Context context = (Context) obj;
        AbstractC1305a.o(context, "thisRef");
        AbstractC1305a.o(fVar, "property");
        C0256d c0256d2 = this.f4911f;
        if (c0256d2 != null) {
            return c0256d2;
        }
        synchronized (this.f4910e) {
            try {
                if (this.f4911f == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC0184c eVar = this.f4907b;
                    l lVar = this.f4908c;
                    AbstractC1305a.n(applicationContext, "applicationContext");
                    List list = (List) lVar.j(applicationContext);
                    InterfaceC0080z interfaceC0080z = this.f4909d;
                    int i6 = 0;
                    b bVar = new b(applicationContext, i6, this);
                    AbstractC1305a.o(list, "migrations");
                    AbstractC1305a.o(interfaceC0080z, "scope");
                    Y.f fVar2 = new Y.f(m.f8472a, new C0257e(bVar, i6));
                    if (eVar == null) {
                        eVar = new P2.e();
                    }
                    this.f4911f = new C0256d(new C0256d(new W(fVar2, S3.a.D(new C0186e(list, null)), eVar, interfaceC0080z)));
                }
                c0256d = this.f4911f;
                AbstractC1305a.l(c0256d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0256d;
    }
}
