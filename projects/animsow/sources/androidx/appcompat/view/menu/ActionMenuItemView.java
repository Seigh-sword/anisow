package androidx.appcompat.view.menu;

import M4.B;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import h.AbstractC0732a;
import l.AbstractC0910c;
import l.C0909b;
import l.InterfaceC0902B;
import l.n;
import l.o;
import l.q;
import m.C0964h0;
import m.InterfaceC0979p;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0964h0 implements InterfaceC0902B, View.OnClickListener, InterfaceC0979p {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public q f5099D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f5100E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f5101F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public n f5102G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C0909b f5103H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public AbstractC0910c f5104I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5105J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f5106K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f5107L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f5108M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f5109N;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f5105J = n();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8565c, 0, 0);
        this.f5107L = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f5109N = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f5108M = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC0979p
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC0902B
    public final void b(q qVar) {
        this.f5099D = qVar;
        setIcon(qVar.getIcon());
        setTitle(qVar.getTitleCondensed());
        setId(qVar.f9784a);
        setVisibility(qVar.isVisible() ? 0 : 8);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f5103H == null) {
            this.f5103H = new C0909b(this);
        }
    }

    @Override // m.InterfaceC0979p
    public final boolean c() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f5099D.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.InterfaceC0902B
    public q getItemData() {
        return this.f5099D;
    }

    public final boolean n() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        return i6 >= 480 || (i6 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void o() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f5100E);
        if (this.f5101F != null && ((this.f5099D.f9808y & 4) != 4 || (!this.f5105J && !this.f5106K))) {
            z5 = false;
        }
        boolean z7 = z6 & z5;
        setText(z7 ? this.f5100E : null);
        CharSequence charSequence = this.f5099D.f9800q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z7 ? null : this.f5099D.f9788e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f5099D.f9801r;
        if (TextUtils.isEmpty(charSequence2)) {
            B.q(this, z7 ? null : this.f5099D.f9788e);
        } else {
            B.q(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f5102G;
        if (nVar != null) {
            nVar.c(this.f5099D);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5105J = n();
        o();
    }

    @Override // m.C0964h0, android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        boolean z5 = !TextUtils.isEmpty(getText());
        if (z5 && (i8 = this.f5108M) >= 0) {
            super.setPadding(i8, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int measuredWidth = getMeasuredWidth();
        int i9 = this.f5107L;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i9) : i9;
        if (mode != 1073741824 && i9 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i7);
        }
        if (z5 || this.f5101F == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f5101F.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0909b c0909b;
        if (this.f5099D.hasSubMenu() && (c0909b = this.f5103H) != null && c0909b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    public void setExpandedFormat(boolean z5) {
        if (this.f5106K != z5) {
            this.f5106K = z5;
            q qVar = this.f5099D;
            if (qVar != null) {
                o oVar = qVar.f9797n;
                oVar.f9764k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f5101F = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = this.f5109N;
            if (intrinsicWidth > i6) {
                intrinsicHeight = (int) (intrinsicHeight * (i6 / intrinsicWidth));
                intrinsicWidth = i6;
            }
            if (intrinsicHeight > i6) {
                intrinsicWidth = (int) (intrinsicWidth * (i6 / intrinsicHeight));
            } else {
                i6 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i6);
        }
        setCompoundDrawables(drawable, null, null, null);
        o();
    }

    public void setItemInvoker(n nVar) {
        this.f5102G = nVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i6, int i7, int i8, int i9) {
        this.f5108M = i6;
        super.setPadding(i6, i7, i8, i9);
    }

    public void setPopupCallback(AbstractC0910c abstractC0910c) {
        this.f5104I = abstractC0910c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f5100E = charSequence;
        o();
    }
}
