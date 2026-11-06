package X1;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0238f f4669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f4671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0238f f4672f;

    public z(AbstractC0238f abstractC0238f, int i6, Bundle bundle) {
        this.f4672f = abstractC0238f;
        Boolean bool = Boolean.TRUE;
        this.f4669c = abstractC0238f;
        this.f4667a = bool;
        this.f4668b = false;
        this.f4670d = i6;
        this.f4671e = bundle;
    }

    public final /* bridge */ void a() {
        U1.b bVar;
        AbstractC0238f abstractC0238f = this.f4672f;
        int i6 = this.f4670d;
        if (i6 != 0) {
            abstractC0238f.z(1, null);
            Bundle bundle = this.f4671e;
            bVar = new U1.b(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (c()) {
                return;
            }
            abstractC0238f.z(1, null);
            bVar = new U1.b(8, null);
        }
        b(bVar);
    }

    public abstract void b(U1.b bVar);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.f4667a = null;
        }
        synchronized (this.f4669c.f4579q) {
            this.f4669c.f4579q.remove(this);
        }
    }
}
