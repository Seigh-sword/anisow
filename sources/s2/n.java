package S2;

import J3.G;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f3170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f3172d;

    public n(m mVar) {
        this.f3169a = mVar.f3165w;
        this.f3170b = mVar;
        this.f3171c = mVar.getContext();
        this.f3172d = mVar.f3149C;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public G h() {
        return null;
    }

    public boolean i(int i6) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof j;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f3170b.f(false);
    }

    public abstract void r();

    public void a() {
    }

    public void b() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(O.i iVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z5) {
    }
}
