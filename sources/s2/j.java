package S2;

import J3.G;
import N.V;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.xo.anilab.R;
import d.RunnableC0632m;
import java.util.WeakHashMap;
import m.C0955d;
import m2.C0;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f3133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final W0.d f3134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f3135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G f3136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f3141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f3142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f3143r;

    public j(m mVar) {
        super(mVar);
        this.f3134i = new W0.d(4, this);
        this.f3135j = new a(this, 1);
        this.f3136k = new G(17, this);
        this.f3140o = Long.MAX_VALUE;
        this.f3131f = Y2.b.z(mVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f3130e = Y2.b.z(mVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f3132g = Y2.b.A(mVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1301a.f12617a);
    }

    @Override // S2.n
    public final void a() {
        if (this.f3141p.isTouchExplorationEnabled() && C0.k(this.f3133h) && !this.f3172d.hasFocus()) {
            this.f3133h.dismissDropDown();
        }
        this.f3133h.post(new RunnableC0632m(17, this));
    }

    @Override // S2.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // S2.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // S2.n
    public final View.OnFocusChangeListener e() {
        return this.f3135j;
    }

    @Override // S2.n
    public final View.OnClickListener f() {
        return this.f3134i;
    }

    @Override // S2.n
    public final G h() {
        return this.f3136k;
    }

    @Override // S2.n
    public final boolean i(int i6) {
        return i6 != 0;
    }

    @Override // S2.n
    public final boolean j() {
        return this.f3137l;
    }

    @Override // S2.n
    public final boolean l() {
        return this.f3139n;
    }

    @Override // S2.n
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f3133h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new c1.o(1, this));
        this.f3133h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: S2.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                j jVar = this.f3129a;
                jVar.f3138m = true;
                jVar.f3140o = System.currentTimeMillis();
                jVar.t(false);
            }
        });
        this.f3133h.setThreshold(0);
        TextInputLayout textInputLayout = this.f3169a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!C0.k(editText) && this.f3141p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = V.f1964a;
            this.f3172d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // S2.n
    public final void n(O.i iVar) {
        boolean zK = C0.k(this.f3133h);
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        if (!zK) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? accessibilityNodeInfo.isShowingHintText() : iVar.e(4)) {
            iVar.i(null);
        }
    }

    @Override // S2.n
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f3141p.isEnabled() || C0.k(this.f3133h)) {
            return;
        }
        boolean z5 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f3139n && !this.f3133h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z5) {
            u();
            this.f3138m = true;
            this.f3140o = System.currentTimeMillis();
        }
    }

    @Override // S2.n
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3132g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f3131f);
        int i6 = 1;
        valueAnimatorOfFloat.addUpdateListener(new A2.b(i6, this));
        this.f3143r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f3130e);
        valueAnimatorOfFloat2.addUpdateListener(new A2.b(i6, this));
        this.f3142q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0955d(10, this));
        this.f3141p = (AccessibilityManager) this.f3171c.getSystemService("accessibility");
    }

    @Override // S2.n
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f3133h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f3133h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z5) {
        if (this.f3139n != z5) {
            this.f3139n = z5;
            this.f3143r.cancel();
            this.f3142q.start();
        }
    }

    public final void u() {
        if (this.f3133h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f3140o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f3138m = false;
        }
        if (this.f3138m) {
            this.f3138m = false;
            return;
        }
        t(!this.f3139n);
        if (!this.f3139n) {
            this.f3133h.dismissDropDown();
        } else {
            this.f3133h.requestFocus();
            this.f3133h.showDropDown();
        }
    }
}
