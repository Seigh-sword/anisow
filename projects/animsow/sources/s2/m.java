package S2;

import J3.G;
import N.V;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import f.C0682h;
import i.C0803c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.ViewOnAttachStateChangeListenerC0913f;
import m.C0964h0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends LinearLayout {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ int f3146S = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PorterDuff.Mode f3147A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View.OnLongClickListener f3148B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final CheckableImageButton f3149C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0682h f3150D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f3151E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final LinkedHashSet f3152F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ColorStateList f3153G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public PorterDuff.Mode f3154H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f3155I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ImageView.ScaleType f3156J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public View.OnLongClickListener f3157K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CharSequence f3158L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C0964h0 f3159M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f3160N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public EditText f3161O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final AccessibilityManager f3162P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public G f3163Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final k f3164R;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextInputLayout f3165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FrameLayout f3166x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CheckableImageButton f3167y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f3168z;

    public m(TextInputLayout textInputLayout, C0803c c0803c) {
        CharSequence charSequenceE;
        super(textInputLayout.getContext());
        this.f3151E = 0;
        this.f3152F = new LinkedHashSet();
        this.f3164R = new k(this);
        l lVar = new l(this);
        this.f3162P = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3165w = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3166x = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f3167y = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f3149C = checkableImageButtonA2;
        C0682h c0682h = new C0682h();
        c0682h.f8317y = new SparseArray();
        c0682h.f8318z = this;
        c0682h.f8315w = c0803c.B(28, 0);
        c0682h.f8316x = c0803c.B(52, 0);
        this.f3150D = c0682h;
        C0964h0 c0964h0 = new C0964h0(getContext(), null);
        this.f3159M = c0964h0;
        if (c0803c.G(38)) {
            this.f3168z = f2.h.p(getContext(), c0803c, 38);
        }
        if (c0803c.G(39)) {
            this.f3147A = f2.h.B(c0803c.z(39, -1), null);
        }
        if (c0803c.G(37)) {
            i(c0803c.v(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = V.f1964a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!c0803c.G(53)) {
            if (c0803c.G(32)) {
                this.f3153G = f2.h.p(getContext(), c0803c, 32);
            }
            if (c0803c.G(33)) {
                this.f3154H = f2.h.B(c0803c.z(33, -1), null);
            }
        }
        if (c0803c.G(30)) {
            g(c0803c.z(30, 0));
            if (c0803c.G(27) && checkableImageButtonA2.getContentDescription() != (charSequenceE = c0803c.E(27))) {
                checkableImageButtonA2.setContentDescription(charSequenceE);
            }
            checkableImageButtonA2.setCheckable(c0803c.r(26, true));
        } else if (c0803c.G(53)) {
            if (c0803c.G(54)) {
                this.f3153G = f2.h.p(getContext(), c0803c, 54);
            }
            if (c0803c.G(55)) {
                this.f3154H = f2.h.B(c0803c.z(55, -1), null);
            }
            g(c0803c.r(53, false) ? 1 : 0);
            CharSequence charSequenceE2 = c0803c.E(51);
            if (checkableImageButtonA2.getContentDescription() != charSequenceE2) {
                checkableImageButtonA2.setContentDescription(charSequenceE2);
            }
        }
        int iU = c0803c.u(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iU < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iU != this.f3155I) {
            this.f3155I = iU;
            checkableImageButtonA2.setMinimumWidth(iU);
            checkableImageButtonA2.setMinimumHeight(iU);
            checkableImageButtonA.setMinimumWidth(iU);
            checkableImageButtonA.setMinimumHeight(iU);
        }
        if (c0803c.G(31)) {
            ImageView.ScaleType scaleTypeI = f2.h.i(c0803c.z(31, -1));
            this.f3156J = scaleTypeI;
            checkableImageButtonA2.setScaleType(scaleTypeI);
            checkableImageButtonA.setScaleType(scaleTypeI);
        }
        c0964h0.setVisibility(8);
        c0964h0.setId(R.id.textinput_suffix_text);
        c0964h0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0964h0.setAccessibilityLiveRegion(1);
        c0964h0.setTextAppearance(c0803c.B(72, 0));
        if (c0803c.G(73)) {
            c0964h0.setTextColor(c0803c.s(73));
        }
        CharSequence charSequenceE3 = c0803c.E(71);
        this.f3158L = TextUtils.isEmpty(charSequenceE3) ? null : charSequenceE3;
        c0964h0.setText(charSequenceE3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(c0964h0);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f7303A0.add(lVar);
        if (textInputLayout.f7376z != null) {
            lVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0913f(2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i6) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i6);
        if (f2.h.v(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n b() {
        int i6 = this.f3151E;
        C0682h c0682h = this.f3150D;
        SparseArray sparseArray = (SparseArray) c0682h.f8317y;
        n eVar = (n) sparseArray.get(i6);
        if (eVar == null) {
            if (i6 != -1) {
                int i7 = 1;
                if (i6 == 0) {
                    eVar = new e((m) c0682h.f8318z, i7);
                } else if (i6 == 1) {
                    eVar = new u((m) c0682h.f8318z, c0682h.f8316x);
                } else if (i6 == 2) {
                    eVar = new d((m) c0682h.f8318z);
                } else {
                    if (i6 != 3) {
                        throw new IllegalArgumentException(AbstractC0628i.f("Invalid end icon mode: ", i6));
                    }
                    eVar = new j((m) c0682h.f8318z);
                }
            } else {
                eVar = new e((m) c0682h.f8318z, 0);
            }
            sparseArray.append(i6, eVar);
        }
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f3149C;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = V.f1964a;
        return this.f3159M.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f3166x.getVisibility() == 0 && this.f3149C.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f3167y.getVisibility() == 0;
    }

    public final void f(boolean z5) {
        boolean z6;
        boolean zIsActivated;
        boolean z7;
        n nVarB = b();
        boolean zK = nVarB.k();
        CheckableImageButton checkableImageButton = this.f3149C;
        boolean z8 = true;
        if (!zK || (z7 = checkableImageButton.f7257z) == nVarB.l()) {
            z6 = false;
        } else {
            checkableImageButton.setChecked(!z7);
            z6 = true;
        }
        if (!(nVarB instanceof j) || (zIsActivated = checkableImageButton.isActivated()) == nVarB.j()) {
            z8 = z6;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z5 || z8) {
            f2.h.D(this.f3165w, checkableImageButton, this.f3153G);
        }
    }

    public final void g(int i6) {
        if (this.f3151E == i6) {
            return;
        }
        n nVarB = b();
        G g4 = this.f3163Q;
        AccessibilityManager accessibilityManager = this.f3162P;
        if (g4 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new O.b(g4));
        }
        this.f3163Q = null;
        nVarB.s();
        this.f3151E = i6;
        Iterator it = this.f3152F.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
        h(i6 != 0);
        n nVarB2 = b();
        int iD = this.f3150D.f8315w;
        if (iD == 0) {
            iD = nVarB2.d();
        }
        Drawable drawableP = iD != 0 ? AbstractC0651b.p(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f3149C;
        checkableImageButton.setImageDrawable(drawableP);
        TextInputLayout textInputLayout = this.f3165w;
        if (drawableP != null) {
            f2.h.a(textInputLayout, checkableImageButton, this.f3153G, this.f3154H);
            f2.h.D(textInputLayout, checkableImageButton, this.f3153G);
        }
        int iC = nVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(nVarB2.k());
        if (!nVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i6);
        }
        nVarB2.r();
        G gH = nVarB2.h();
        this.f3163Q = gH;
        if (gH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = V.f1964a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new O.b(this.f3163Q));
            }
        }
        View.OnClickListener onClickListenerF = nVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f3157K;
        checkableImageButton.setOnClickListener(onClickListenerF);
        f2.h.F(checkableImageButton, onLongClickListener);
        EditText editText = this.f3161O;
        if (editText != null) {
            nVarB2.m(editText);
            j(nVarB2);
        }
        f2.h.a(textInputLayout, checkableImageButton, this.f3153G, this.f3154H);
        f(true);
    }

    public final void h(boolean z5) {
        if (d() != z5) {
            this.f3149C.setVisibility(z5 ? 0 : 8);
            k();
            m();
            this.f3165w.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3167y;
        checkableImageButton.setImageDrawable(drawable);
        l();
        f2.h.a(this.f3165w, checkableImageButton, this.f3168z, this.f3147A);
    }

    public final void j(n nVar) {
        if (this.f3161O == null) {
            return;
        }
        if (nVar.e() != null) {
            this.f3161O.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.f3149C.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void k() {
        this.f3166x.setVisibility((this.f3149C.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f3158L == null || this.f3160N) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f3167y;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f3165w;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f7311F.f3197q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f3151E != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f3165w;
        if (textInputLayout.f7376z == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f7376z;
            WeakHashMap weakHashMap = V.f1964a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f7376z.getPaddingTop();
        int paddingBottom = textInputLayout.f7376z.getPaddingBottom();
        WeakHashMap weakHashMap2 = V.f1964a;
        this.f3159M.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        C0964h0 c0964h0 = this.f3159M;
        int visibility = c0964h0.getVisibility();
        int i6 = (this.f3158L == null || this.f3160N) ? 8 : 0;
        if (visibility != i6) {
            b().p(i6 == 0);
        }
        k();
        c0964h0.setVisibility(i6);
        this.f3165w.q();
    }
}
