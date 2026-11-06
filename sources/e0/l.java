package e0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f8254a;

    public l(TransformationMethod transformationMethod) {
        this.f8254a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f8254a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || c0.l.a().b() != 1) {
            return charSequence;
        }
        c0.l lVarA = c0.l.a();
        lVarA.getClass();
        return lVarA.f(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i6, Rect rect) {
        TransformationMethod transformationMethod = this.f8254a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z5, i6, rect);
        }
    }
}
