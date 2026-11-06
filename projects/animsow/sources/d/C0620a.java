package d;

import android.window.BackEvent;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0620a f8090a = new C0620a();

    public final BackEvent a(float f6, float f7, float f8, int i6) {
        return new BackEvent(f6, f7, f8, i6);
    }

    public final float b(BackEvent backEvent) {
        AbstractC1305a.o(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        AbstractC1305a.o(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        AbstractC1305a.o(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        AbstractC1305a.o(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
