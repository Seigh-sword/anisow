package com.onesignal;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.onesignal.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC0612z1 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        return (float) ((Math.cos(8.0d * ((double) f6)) * Math.pow(2.718281828459045d, ((double) (-f6)) / 0.1d) * (-1.0d)) + 1.0d);
    }
}
