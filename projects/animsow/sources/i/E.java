package i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p1.C1234C;

/* JADX INFO: loaded from: classes.dex */
public abstract class E implements p1.y {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f9145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f9146x;

    public E(int i6) {
        this.f9146x = new ArrayList();
        for (int i7 = 0; i7 < i6; i7++) {
            ((List) this.f9146x).add(new K2.j());
        }
    }

    public abstract void a();

    public final void b() {
        Object obj = this.f9145w;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((H) this.f9146x).f9171G.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f9145w = null;
        }
    }

    public abstract IntentFilter c();

    @Override // p1.y
    public final p1.x d(C1234C c1234c) {
        Context context = (Context) this.f9145w;
        Class cls = (Class) this.f9146x;
        return new q1.d(context, c1234c.b(File.class, cls), c1234c.b(Uri.class, cls), cls);
    }

    public abstract int e();

    public abstract void f();

    public abstract void g();

    public abstract void h(K2.c cVar);

    public abstract void i();

    public final void j() {
        b();
        IntentFilter intentFilterC = c();
        if (intentFilterC.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f9145w) == null) {
            this.f9145w = new D(0, this);
        }
        ((H) this.f9146x).f9171G.registerReceiver((BroadcastReceiver) this.f9145w, intentFilterC);
    }

    public abstract void k();

    public abstract void l();

    public E(Context context, Class cls) {
        this.f9145w = context;
        this.f9146x = cls;
    }

    public E(H h4) {
        this.f9146x = h4;
    }
}
