package P1;

import android.os.SystemClock;
import com.bumptech.glide.d;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2413a;

    public final long a() {
        switch (this.f2413a) {
            case d.f6312l /* 0 */:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
