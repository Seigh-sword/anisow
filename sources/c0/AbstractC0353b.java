package c0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: c0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0353b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
