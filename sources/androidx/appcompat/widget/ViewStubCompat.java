package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.AbstractC0732a;
import java.lang.ref.WeakReference;
import m.n1;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WeakReference f5263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LayoutInflater f5264z;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5261w = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8588z, 0, 0);
        this.f5262x = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f5261w = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f5261w == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f5264z;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f5261w, viewGroup, false);
        int i6 = this.f5262x;
        if (i6 != -1) {
            viewInflate.setId(i6);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f5263y = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f5262x;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f5264z;
    }

    public int getLayoutResource() {
        return this.f5261w;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i6) {
        this.f5262x = i6;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f5264z = layoutInflater;
    }

    public void setLayoutResource(int i6) {
        this.f5261w = i6;
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        WeakReference weakReference = this.f5263y;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i6);
            return;
        }
        super.setVisibility(i6);
        if (i6 == 0 || i6 == 4) {
            a();
        }
    }

    public void setOnInflateListener(n1 n1Var) {
    }
}
