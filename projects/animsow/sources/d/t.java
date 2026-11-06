package D;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.xo.anilab.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f219a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f228j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f232n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bundle f234p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f237s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Notification f240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f241w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f220b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f221c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f222d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f229k = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f233o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f235q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f236r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f238t = 0;

    public t(Context context, String str) {
        Notification notification = new Notification();
        this.f240v = notification;
        this.f219a = context;
        this.f237s = str;
        notification.when = System.currentTimeMillis();
        this.f240v.audioStreamType = -1;
        this.f228j = 0;
        this.f241w = new ArrayList();
        this.f239u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        D d6 = new D(this);
        t tVar = d6.f164c;
        u uVar = tVar.f230l;
        if (uVar != null) {
            uVar.b(d6);
        }
        int i6 = Build.VERSION.SDK_INT;
        Notification.Builder builder = d6.f163b;
        if (i6 >= 26) {
            notificationBuild = builder.build();
        } else {
            Notification notificationBuild2 = builder.build();
            int i7 = d6.f166e;
            if (i7 != 0) {
                if (v.f(notificationBuild2) != null && (notificationBuild2.flags & 512) != 0 && i7 == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (v.f(notificationBuild2) != null && (notificationBuild2.flags & 512) == 0 && i7 == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        if (uVar != null) {
            tVar.f230l.getClass();
        }
        if (uVar != null && (bundle = notificationBuild.extras) != null) {
            uVar.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(int i6) {
        Notification notification = this.f240v;
        notification.defaults = i6;
        if ((i6 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i6, boolean z5) {
        Notification notification;
        int i7;
        if (z5) {
            notification = this.f240v;
            i7 = i6 | notification.flags;
        } else {
            notification = this.f240v;
            i7 = (~i6) & notification.flags;
        }
        notification.flags = i7;
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f219a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f5316k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f5318b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f226h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f240v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder builderE = s.e(s.c(s.b(), 4), 5);
        this.f240v.audioAttributes = s.a(builderE);
    }

    public final void g(u uVar) {
        if (this.f230l != uVar) {
            this.f230l = uVar;
            if (uVar == null || uVar.f242a == this) {
                return;
            }
            uVar.f242a = this;
            g(uVar);
        }
    }
}
