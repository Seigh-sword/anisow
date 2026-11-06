package I2;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import d.C0621b;

/* JADX INFO: loaded from: classes.dex */
public final class e implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1145b;

    public e(f fVar, b bVar) {
        this.f1145b = fVar;
        this.f1144a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f1145b.f1143a != null) {
            this.f1144a.d();
        }
    }

    public final void onBackInvoked() {
        this.f1144a.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f1145b.f1143a != null) {
            this.f1144a.a(new C0621b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f1145b.f1143a != null) {
            this.f1144a.b(new C0621b(backEvent));
        }
    }
}
