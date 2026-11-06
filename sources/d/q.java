package D;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class q extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconCompat f214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f216g;

    @Override // D.u
    public final void b(D d6) {
        Bitmap bitmapA;
        Object obj;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(d6.f163b).setBigContentTitle(this.f243b);
        IconCompat iconCompat = this.f214e;
        Context context = d6.f162a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                p.a(bigContentTitle, H.c.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f214e;
                int i6 = iconCompat2.f5317a;
                if (i6 == -1) {
                    obj = iconCompat2.f5318b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                } else if (i6 == 1) {
                    obj = iconCompat2.f5318b;
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f5318b, true);
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                }
            }
        }
        if (this.f216g) {
            IconCompat iconCompat3 = this.f215f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                o.a(bigContentTitle, H.c.c(iconCompat3, context));
            }
        }
        if (this.f245d) {
            bigContentTitle.setSummaryText(this.f244c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            p.c(bigContentTitle, false);
            p.b(bigContentTitle, null);
        }
    }

    @Override // D.u
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
