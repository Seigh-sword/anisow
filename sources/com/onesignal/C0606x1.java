package com.onesignal;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.onesignal.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0606x1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f8067a;

    public C0606x1(RelativeLayout relativeLayout) {
        this.f8067a = relativeLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8067a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
