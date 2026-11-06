package e0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class j extends c0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8249a;

    public j(EditText editText) {
        this.f8249a = new WeakReference(editText);
    }

    @Override // c0.j
    public final void a() {
        k.a((EditText) this.f8249a.get(), 1);
    }
}
