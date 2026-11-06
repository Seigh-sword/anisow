package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0480q2 implements Cloneable {
    public static void a(int i6, R2 r22) {
        String strJ = H1.a.j("Element at index ", r22.size() - i6, " is null.");
        for (int size = r22.size() - 1; size >= i6; size--) {
            r22.remove(size);
        }
        throw new NullPointerException(strJ);
    }
}
