package I0;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f1103c;

    public h(int i6, int i7, Notification notification) {
        this.f1101a = i6;
        this.f1103c = notification;
        this.f1102b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f1101a == hVar.f1101a && this.f1102b == hVar.f1102b) {
            return this.f1103c.equals(hVar.f1103c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1103c.hashCode() + (((this.f1101a * 31) + this.f1102b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f1101a + ", mForegroundServiceType=" + this.f1102b + ", mNotification=" + this.f1103c + '}';
    }
}
