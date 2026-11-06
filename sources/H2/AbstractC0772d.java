package h2;

import android.os.Build;

/* JADX INFO: renamed from: h2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0772d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f8980a;

    static {
        f8980a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
