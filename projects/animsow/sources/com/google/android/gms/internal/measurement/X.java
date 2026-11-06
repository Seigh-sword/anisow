package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class X extends Handler {
    public X(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Looper looper, int i6) {
        super(looper);
        if (i6 == 1) {
            super(looper);
            Looper.getMainLooper();
        } else if (i6 == 2) {
            super(looper);
            Looper.getMainLooper();
        } else if (i6 != 3) {
            Looper.getMainLooper();
        } else {
            super(looper);
            Looper.getMainLooper();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Looper looper, Handler.Callback callback, int i6) {
        super(looper, callback);
        if (i6 == 1) {
            super(looper, callback);
            Looper.getMainLooper();
        } else if (i6 != 2) {
            Looper.getMainLooper();
        } else {
            super(looper, callback);
            Looper.getMainLooper();
        }
    }
}
