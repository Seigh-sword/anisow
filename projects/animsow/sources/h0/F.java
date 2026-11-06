package h0;

import N.ViewTreeObserverOnPreDrawListenerC0110v;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8651A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewGroup f8652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f8653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8654y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8655z;

    public F(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f8651A = true;
        this.f8652w = viewGroup;
        this.f8653x = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f8651A = true;
        if (this.f8654y) {
            return !this.f8655z;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f8654y = true;
            ViewTreeObserverOnPreDrawListenerC0110v.a(this.f8652w, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5 = this.f8654y;
        ViewGroup viewGroup = this.f8652w;
        if (z5 || !this.f8651A) {
            viewGroup.endViewTransition(this.f8653x);
            this.f8655z = true;
        } else {
            this.f8651A = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation, float f6) {
        this.f8651A = true;
        if (this.f8654y) {
            return !this.f8655z;
        }
        if (!super.getTransformation(j6, transformation, f6)) {
            this.f8654y = true;
            ViewTreeObserverOnPreDrawListenerC0110v.a(this.f8652w, this);
        }
        return true;
    }
}
