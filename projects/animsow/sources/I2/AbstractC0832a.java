package i2;

import android.os.Build;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0832a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9407a;

    static {
        f9407a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
