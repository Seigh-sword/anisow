package S2;

import N.V;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.xo.anilab.R;
import i.C0803c;
import java.util.WeakHashMap;
import m.C0964h0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f3222A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public PorterDuff.Mode f3223B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f3224C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView.ScaleType f3225D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View.OnLongClickListener f3226E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f3227F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextInputLayout f3228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0964h0 f3229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f3230y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CheckableImageButton f3231z;

    public v(TextInputLayout textInputLayout, C0803c c0803c) {
        CharSequence charSequenceE;
        super(textInputLayout.getContext());
        this.f3228w = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3231z = checkableImageButton;
        C0964h0 c0964h0 = new C0964h0(getContext(), null);
        this.f3229x = c0964h0;
        if (f2.h.v(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3226E;
        checkableImageButton.setOnClickListener(null);
        f2.h.F(checkableImageButton, onLongClickListener);
        this.f3226E = null;
        checkableImageButton.setOnLongClickListener(null);
        f2.h.F(checkableImageButton, null);
        if (c0803c.G(69)) {
            this.f3222A = f2.h.p(getContext(), c0803c, 69);
        }
        if (c0803c.G(70)) {
            this.f3223B = f2.h.B(c0803c.z(70, -1), null);
        }
        if (c0803c.G(66)) {
            b(c0803c.v(66));
            if (c0803c.G(65) && checkableImageButton.getContentDescription() != (charSequenceE = c0803c.E(65))) {
                checkableImageButton.setContentDescription(charSequenceE);
            }
            checkableImageButton.setCheckable(c0803c.r(64, true));
        }
        int iU = c0803c.u(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iU < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iU != this.f3224C) {
            this.f3224C = iU;
            checkableImageButton.setMinimumWidth(iU);
            checkableImageButton.setMinimumHeight(iU);
        }
        if (c0803c.G(68)) {
            ImageView.ScaleType scaleTypeI = f2.h.i(c0803c.z(68, -1));
            this.f3225D = scaleTypeI;
            checkableImageButton.setScaleType(scaleTypeI);
        }
        c0964h0.setVisibility(8);
        c0964h0.setId(R.id.textinput_prefix_text);
        c0964h0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = V.f1964a;
        c0964h0.setAccessibilityLiveRegion(1);
        c0964h0.setTextAppearance(c0803c.B(60, 0));
        if (c0803c.G(61)) {
            c0964h0.setTextColor(c0803c.s(61));
        }
        CharSequence charSequenceE2 = c0803c.E(59);
        this.f3230y = TextUtils.isEmpty(charSequenceE2) ? null : charSequenceE2;
        c0964h0.setText(charSequenceE2);
        e();
        addView(checkableImageButton);
        addView(c0964h0);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f3231z;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = V.f1964a;
        return this.f3229x.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3231z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3222A;
            PorterDuff.Mode mode = this.f3223B;
            TextInputLayout textInputLayout = this.f3228w;
            f2.h.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            f2.h.D(textInputLayout, checkableImageButton, this.f3222A);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f3226E;
        checkableImageButton.setOnClickListener(null);
        f2.h.F(checkableImageButton, onLongClickListener);
        this.f3226E = null;
        checkableImageButton.setOnLongClickListener(null);
        f2.h.F(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z5) {
        CheckableImageButton checkableImageButton = this.f3231z;
        if ((checkableImageButton.getVisibility() == 0) != z5) {
            checkableImageButton.setVisibility(z5 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f3228w.f7376z;
        if (editText == null) {
            return;
        }
        if (this.f3231z.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = V.f1964a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = V.f1964a;
        this.f3229x.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i6 = (this.f3230y == null || this.f3227F) ? 8 : 0;
        setVisibility((this.f3231z.getVisibility() == 0 || i6 == 0) ? 0 : 8);
        this.f3229x.setVisibility(i6);
        this.f3228w.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        d();
    }
}
