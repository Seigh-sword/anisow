package S2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public final class u extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f3220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W0.d f3221g;

    public u(m mVar, int i6) {
        super(mVar);
        this.f3219e = R.drawable.design_password_eye;
        this.f3221g = new W0.d(5, this);
        if (i6 != 0) {
            this.f3219e = i6;
        }
    }

    @Override // S2.n
    public final void b() {
        q();
    }

    @Override // S2.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // S2.n
    public final int d() {
        return this.f3219e;
    }

    @Override // S2.n
    public final View.OnClickListener f() {
        return this.f3221g;
    }

    @Override // S2.n
    public final boolean k() {
        return true;
    }

    @Override // S2.n
    public final boolean l() {
        EditText editText = this.f3220f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // S2.n
    public final void m(EditText editText) {
        this.f3220f = editText;
        q();
    }

    @Override // S2.n
    public final void r() {
        EditText editText = this.f3220f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3220f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // S2.n
    public final void s() {
        EditText editText = this.f3220f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
