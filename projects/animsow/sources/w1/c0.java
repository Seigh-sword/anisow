package W1;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import h0.AbstractComponentCallbacksC0734B;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AbstractComponentCallbacksC0734B implements InterfaceC0213g {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Map f4297t0 = Collections.synchronizedMap(new C1280b());

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f4298u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Bundle f4299v0;

    static {
        new WeakHashMap();
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void A(Bundle bundle) {
        super.A(bundle);
        this.f4298u0 = 1;
        this.f4299v0 = bundle;
        for (Map.Entry entry : this.f4297t0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void C() {
        this.f8616a0 = true;
        this.f4298u0 = 5;
        Iterator it = this.f4297t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void G() {
        this.f8616a0 = true;
        this.f4298u0 = 3;
        Iterator it = this.f4297t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e();
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void H(Bundle bundle) {
        for (Map.Entry entry : this.f4297t0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).f(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void I() {
        this.f8616a0 = true;
        this.f4298u0 = 2;
        Iterator it = this.f4297t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void J() {
        this.f8616a0 = true;
        this.f4298u0 = 4;
        Iterator it = this.f4297t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f4297t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void x(int i6, int i7, Intent intent) {
        super.x(i6, i7, intent);
        Iterator it = this.f4297t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).c(i6, i7, intent);
        }
    }
}
