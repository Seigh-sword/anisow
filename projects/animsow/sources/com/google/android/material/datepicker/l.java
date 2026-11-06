package com.google.android.material.datepicker;

import N.E0;
import N.F0;
import N.H0;
import N.I;
import N.V;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.xo.anilab.R;
import d2.AbstractC0651b;
import f.C0682h;
import h0.DialogInterfaceOnCancelListenerC0756v;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public final class l<S> extends DialogInterfaceOnCancelListenerC0756v {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final /* synthetic */ int f7204h1 = 0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final LinkedHashSet f7205J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final LinkedHashSet f7206K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f7207L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public s f7208M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public c f7209N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public k f7210O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f7211P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public CharSequence f7212Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f7213R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f7214S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f7215T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public CharSequence f7216U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f7217V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public CharSequence f7218W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f7219X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public CharSequence f7220Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int f7221Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public CharSequence f7222a1;
    public TextView b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public CheckableImageButton f7223c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public P2.g f7224d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f7225e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public CharSequence f7226f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public CharSequence f7227g1;

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f7205J0 = new LinkedHashSet();
        this.f7206K0 = new LinkedHashSet();
    }

    public static int Z(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarC = u.c();
        calendarC.set(5, 1);
        Calendar calendarB = u.b(calendarC);
        calendarB.get(2);
        calendarB.get(1);
        int maximum = calendarB.getMaximum(7);
        calendarB.getActualMaximum(5);
        calendarB.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean a0(Context context, int i6) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0.q(R.attr.materialCalendarStyle, context, k.class.getCanonicalName()).data, new int[]{i6});
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z5;
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, h0.AbstractComponentCallbacksC0734B
    public final void A(Bundle bundle) {
        super.A(bundle);
        if (bundle == null) {
            bundle = this.f8591B;
        }
        this.f7207L0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        H1.a.o(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7209N0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        H1.a.o(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f7211P0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f7212Q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f7214S0 = bundle.getInt("INPUT_MODE_KEY");
        this.f7215T0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f7216U0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f7217V0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f7218W0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f7219X0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f7220Y0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f7221Z0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f7222a1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f7212Q0;
        if (text == null) {
            text = O().getResources().getText(this.f7211P0);
        }
        this.f7226f1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f7227g1 = text;
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindViewById;
        LinearLayout.LayoutParams layoutParams;
        View viewInflate = layoutInflater.inflate(this.f7213R0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f7213R0) {
            viewFindViewById = viewInflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(Z(context), -2);
        } else {
            viewFindViewById = viewInflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(Z(context), -1);
        }
        viewFindViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = V.f1964a;
        textView.setAccessibilityLiveRegion(1);
        this.f7223c1 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.b1 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f7223c1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f7223c1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0651b.p(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0651b.p(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f7223c1.setChecked(this.f7214S0 != 0);
        V.l(this.f7223c1, null);
        this.f7223c1.setContentDescription(this.f7223c1.getContext().getString(this.f7214S0 == 1 ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f7223c1.setOnClickListener(new W0.d(2, this));
        Y();
        throw null;
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, h0.AbstractComponentCallbacksC0734B
    public final void H(Bundle bundle) {
        super.H(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7207L0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        c cVar = this.f7209N0;
        a aVar = new a();
        int i6 = a.f7168b;
        int i7 = a.f7168b;
        long j6 = cVar.f7173w.f7231B;
        long j7 = cVar.f7174x.f7231B;
        aVar.f7169a = Long.valueOf(cVar.f7176z.f7231B);
        k kVar = this.f7210O0;
        n nVar = kVar == null ? null : kVar.f7200w0;
        if (nVar != null) {
            aVar.f7169a = Long.valueOf(nVar.f7231B);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar.f7175y);
        n nVarB = n.b(j6);
        n nVarB2 = n.b(j7);
        b bVar = (b) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l5 = aVar.f7169a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c(nVarB, nVarB2, bVar, l5 == null ? null : n.b(l5.longValue()), cVar.f7170A));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f7211P0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f7212Q0);
        bundle.putInt("INPUT_MODE_KEY", this.f7214S0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f7215T0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f7216U0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f7217V0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f7218W0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f7219X0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f7220Y0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f7221Z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f7222a1);
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, h0.AbstractComponentCallbacksC0734B
    public final void I() {
        B3.e f02;
        B3.e f03;
        super.I();
        Dialog dialog = this.E0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f7213R0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f7224d1);
            if (!this.f7225e1) {
                View viewFindViewById = P().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListG = C0.g(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListG != null ? Integer.valueOf(colorStateListG.getDefaultColor()) : null;
                int i6 = Build.VERSION.SDK_INT;
                boolean z5 = false;
                boolean z6 = numValueOf == null || numValueOf.intValue() == 0;
                int iE = C0.e(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z6) {
                    numValueOf = Integer.valueOf(iE);
                }
                com.bumptech.glide.d.w(window, false);
                window.getContext();
                int iD = i6 < 27 ? G.a.d(C0.e(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z7 = C0.j(0) || C0.j(numValueOf.intValue());
                S0.f fVar = new S0.f(window.getDecorView());
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 30) {
                    H0 h02 = new H0(window.getInsetsController(), fVar);
                    h02.f1957z = window;
                    f02 = h02;
                } else {
                    f02 = i7 >= 26 ? new F0(window, fVar) : new E0(window, fVar);
                }
                f02.A(z7);
                boolean zJ = C0.j(iE);
                if (C0.j(iD) || (iD == 0 && zJ)) {
                    z5 = true;
                }
                S0.f fVar2 = new S0.f(window.getDecorView());
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 30) {
                    H0 h03 = new H0(window.getInsetsController(), fVar2);
                    h03.f1957z = window;
                    f03 = h03;
                } else {
                    f03 = i8 >= 26 ? new F0(window, fVar2) : new E0(window, fVar2);
                }
                f03.z(z5);
                int paddingTop = viewFindViewById.getPaddingTop();
                int i9 = viewFindViewById.getLayoutParams().height;
                C0682h c0682h = new C0682h();
                c0682h.f8318z = this;
                c0682h.f8315w = i9;
                c0682h.f8317y = viewFindViewById;
                c0682h.f8316x = paddingTop;
                WeakHashMap weakHashMap = V.f1964a;
                I.u(viewFindViewById, c0682h);
                this.f7225e1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = O().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f7224d1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.E0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new E2.a(dialog2, rect));
        }
        O();
        int i10 = this.f7207L0;
        if (i10 == 0) {
            Y();
            throw null;
        }
        Y();
        c cVar = this.f7209N0;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", cVar.f7176z);
        kVar.S(bundle);
        this.f7210O0 = kVar;
        s sVar = kVar;
        if (this.f7214S0 == 1) {
            Y();
            c cVar2 = this.f7209N0;
            m mVar = new m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
            mVar.S(bundle2);
            sVar = mVar;
        }
        this.f7208M0 = sVar;
        this.b1.setText((this.f7214S0 == 1 && O().getResources().getConfiguration().orientation == 2) ? this.f7227g1 : this.f7226f1);
        Y();
        m();
        throw null;
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, h0.AbstractComponentCallbacksC0734B
    public final void J() {
        this.f7208M0.f7249t0.clear();
        super.J();
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v
    public final Dialog V() {
        Context contextO = O();
        O();
        int i6 = this.f7207L0;
        if (i6 == 0) {
            Y();
            throw null;
        }
        Dialog dialog = new Dialog(contextO, i6);
        Context context = dialog.getContext();
        this.f7213R0 = a0(context, android.R.attr.windowFullscreen);
        this.f7224d1 = new P2.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1274a.f12463q, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f7224d1.k(context);
        this.f7224d1.n(ColorStateList.valueOf(color));
        P2.g gVar = this.f7224d1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = V.f1964a;
        gVar.m(I.i(decorView));
        return dialog;
    }

    public final void Y() {
        H1.a.o(this.f8591B.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f7205J0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f7206K0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f8618c0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
