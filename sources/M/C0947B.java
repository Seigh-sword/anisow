package m;

import N.C0085c;
import N.C0089e;
import N.C0093g;
import N.InterfaceC0087d;
import N.InterfaceC0109u;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.C0396c2;
import com.xo.anilab.R;
import d2.AbstractC0651b;

/* JADX INFO: renamed from: m.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0947B extends EditText implements InterfaceC0109u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0396c2 f10082A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0946A f10083B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0986t f10084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0956d0 f10085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0396c2 f10086y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final T.r f10087z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0947B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        Y0.a(context);
        X0.a(getContext(), this);
        C0986t c0986t = new C0986t(this);
        this.f10084w = c0986t;
        c0986t.e(attributeSet, R.attr.editTextStyle);
        C0956d0 c0956d0 = new C0956d0(this);
        this.f10085x = c0956d0;
        c0956d0.f(attributeSet, R.attr.editTextStyle);
        c0956d0.b();
        this.f10086y = new C0396c2((TextView) this);
        this.f10087z = new T.r();
        C0396c2 c0396c2 = new C0396c2((EditText) this);
        this.f10082A = c0396c2;
        c0396c2.J(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerG = c0396c2.G(keyListener);
            if (keyListenerG == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerG);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private C0946A getSuperCaller() {
        if (this.f10083B == null) {
            this.f10083B = new C0946A(this);
        }
        return this.f10083B;
    }

    @Override // N.InterfaceC0109u
    public final C0093g a(C0093g c0093g) {
        return this.f10087z.a(this, c0093g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0986t c0986t = this.f10084w;
        if (c0986t != null) {
            c0986t.a();
        }
        C0956d0 c0956d0 = this.f10085x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0651b.E(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10084w;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10084w;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10085x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10085x.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0396c2 c0396c2;
        if (Build.VERSION.SDK_INT >= 28 || (c0396c2 = this.f10086y) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0396c2.f6776y;
        return textClassifier == null ? X.a((TextView) c0396c2.f6775x) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
      0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            m.d0 r1 = r7.f10085x
            r1.getClass()
            m.C0956d0.h(r7, r0, r8)
            com.bumptech.glide.c.y(r7, r8, r0)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = N.V.f(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            S.a.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            J3.G r2 = new J3.G
            r6 = 0
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            S.d r1 = new S.d
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = S.c.f3052a
            if (r1 < r5) goto L59
            java.lang.String[] r1 = S.a.b(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            S.e r1 = new S.e
            r1.<init>(r0, r2)
            goto L4b
        L77:
            com.google.android.gms.internal.measurement.c2 r1 = r7.f10082A
            android.view.inputmethod.InputConnection r8 = r1.K(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0947B.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30 || i6 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && N.V.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && L.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i6) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 || N.V.f(this) == null || !(i6 == 16908322 || i6 == 16908337)) {
            return super.onTextContextMenuItem(i6);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            InterfaceC0087d c0085c = i7 >= 31 ? new C0085c(primaryClip, 1) : new C0089e(primaryClip, 1);
            c0085c.d(i6 == 16908322 ? 0 : 1);
            N.V.h(this, c0085c.a());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10084w;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10084w;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10085x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10085x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0651b.G(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((P2.e) ((e0.b) this.f10082A.f6776y).f8233c).n(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f10082A.G(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0986t c0986t = this.f10084w;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10084w;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0956d0 c0956d0 = this.f10085x;
        c0956d0.l(colorStateList);
        c0956d0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0956d0 c0956d0 = this.f10085x;
        c0956d0.m(mode);
        c0956d0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        C0956d0 c0956d0 = this.f10085x;
        if (c0956d0 != null) {
            c0956d0.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0396c2 c0396c2;
        if (Build.VERSION.SDK_INT >= 28 || (c0396c2 = this.f10086y) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0396c2.f6776y = textClassifier;
        }
    }
}
