package D;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f218f;

    public r(int i6) {
        this.f217e = i6;
        if (i6 != 1) {
            return;
        }
        this.f218f = new ArrayList();
    }

    @Override // D.u
    public final void a(Bundle bundle) {
        switch (this.f217e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                super.a(bundle);
                break;
            default:
                super.a(bundle);
                break;
        }
    }

    @Override // D.u
    public final void b(D d6) {
        int i6 = this.f217e;
        Notification.Builder builder = d6.f163b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(builder).setBigContentTitle(this.f243b).bigText((CharSequence) this.f218f);
                if (this.f245d) {
                    bigTextStyleBigText.setSummaryText(this.f244c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(builder).setBigContentTitle(this.f243b);
                if (this.f245d) {
                    bigContentTitle.setSummaryText(this.f244c);
                }
                Iterator it = ((ArrayList) this.f218f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // D.u
    public final String c() {
        switch (this.f217e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
