package i;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.xo.anilab.R;

/* JADX INFO: renamed from: i.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0809i extends J implements DialogInterface {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0808h f9319B;

    public DialogInterfaceC0809i(Context context, int i6) {
        super(context, i(context, i6));
        this.f9319B = new C0808h(getContext(), this, getWindow());
    }

    public static int i(Context context, int i6) {
        if (((i6 >>> 24) & 255) >= 1) {
            return i6;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x023c A[PHI: r4
      0x023c: PHI (r4v5 android.view.View) = (r4v4 android.view.View), (r4v9 android.view.View) binds: [B:78:0x023a, B:75:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // i.J, d.DialogC0639t, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.DialogInterfaceC0809i.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f9319B.f9303i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i6, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i6, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f9319B.f9303i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i6, keyEvent);
        }
        return true;
    }

    @Override // i.J, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0808h c0808h = this.f9319B;
        c0808h.f9298d = charSequence;
        TextView textView = c0808h.f9307m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
