package W1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Fragment implements InterfaceC0213g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f4289w = Collections.synchronizedMap(new C1280b());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4290x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bundle f4291y;

    static {
        new WeakHashMap();
    }

    @Override // W1.InterfaceC0213g
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f4289w.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i6, int i7, Intent intent) {
        super.onActivityResult(i6, i7, intent);
        Iterator it = this.f4289w.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).c(i6, i7, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4290x = 1;
        this.f4291y = bundle;
        for (Map.Entry entry : this.f4289w.entrySet()) {
            ((LifecycleCallback) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f4290x = 5;
        Iterator it = this.f4289w.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f4290x = 3;
        Iterator it = this.f4289w.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f4289w.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).f(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f4290x = 2;
        Iterator it = this.f4289w.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f4290x = 4;
        Iterator it = this.f4289w.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }
}
