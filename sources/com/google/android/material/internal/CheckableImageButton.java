package com.google.android.material.internal;

import H2.a;
import N.V;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import m.D;
import y2.C1503e;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends D implements Checkable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f7254C = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f7255A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f7256B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7257z;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.xo.anilab.R.attr.imageButtonStyle);
        this.f7255A = true;
        this.f7256B = true;
        V.l(this, new C1503e(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f7257z;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        return this.f7257z ? View.mergeDrawableStates(super.onCreateDrawableState(i6 + 1), f7254C) : super.onCreateDrawableState(i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f3569w);
        setChecked(aVar.f969y);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f969y = this.f7257z;
        return aVar;
    }

    public void setCheckable(boolean z5) {
        if (this.f7255A != z5) {
            this.f7255A = z5;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (!this.f7255A || this.f7257z == z5) {
            return;
        }
        this.f7257z = z5;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z5) {
        this.f7256B = z5;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        if (this.f7256B) {
            super.setPressed(z5);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f7257z);
    }
}
