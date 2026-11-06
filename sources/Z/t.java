package z;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import w.C1440g;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends AbstractC1512c {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f14062D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f14063E;

    @Override // z.AbstractC1512c
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // z.AbstractC1512c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f14053b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 6) {
                    this.f14062D = true;
                } else if (index == 22) {
                    this.f14063E = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void j(C1440g c1440g, int i6, int i7);

    @Override // z.AbstractC1512c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14062D || this.f14063E) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i6 = 0; i6 < this.f13852x; i6++) {
                    View view = (View) constraintLayout.f5282w.get(this.f13851w[i6]);
                    if (view != null) {
                        if (this.f14062D) {
                            view.setVisibility(visibility);
                        }
                        if (this.f14063E && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }
}
