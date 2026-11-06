package t0;

import android.view.Choreographer;

/* JADX INFO: renamed from: t0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1334f {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: t0.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j6) {
                runnable.run();
            }
        });
    }
}
