package c0;

import android.os.Trace;
import com.google.android.gms.internal.measurement.AbstractC0420g2;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6141w;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6141w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    int i6 = J.l.f1168a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (l.f6123k != null) {
                        l.a().c();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i7 = J.l.f1168a;
                    Trace.endSection();
                    throw th;
                }
            default:
                AbstractC0420g2.f6820j.incrementAndGet();
                return;
        }
    }
}
