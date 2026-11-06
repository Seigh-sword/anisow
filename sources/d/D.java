package D;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Iterator;
import s.C1281c;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f166e;

    public D(t tVar) {
        int i6;
        ArrayList arrayList;
        int i7;
        new ArrayList();
        this.f165d = new Bundle();
        this.f164c = tVar;
        Context context = tVar.f219a;
        this.f162a = context;
        this.f163b = Build.VERSION.SDK_INT >= 26 ? z.a(context, tVar.f237s) : new Notification.Builder(tVar.f219a);
        Notification notification = tVar.f240v;
        int i8 = 0;
        this.f163b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(tVar.f223e).setContentText(tVar.f224f).setContentInfo(null).setContentIntent(tVar.f225g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(tVar.f227i).setProgress(0, 0, false);
        Notification.Builder builder = this.f163b;
        IconCompat iconCompat = tVar.f226h;
        x.b(builder, iconCompat == null ? null : H.c.c(iconCompat, context));
        this.f163b.setSubText(null).setUsesChronometer(false).setPriority(tVar.f228j);
        for (C0013n c0013n : tVar.f220b) {
            if (c0013n.f208b == null && (i7 = c0013n.f211e) != 0) {
                c0013n.f208b = IconCompat.b(i7);
            }
            IconCompat iconCompat2 = c0013n.f208b;
            Notification.Action.Builder builderA = x.a(iconCompat2 != null ? H.c.c(iconCompat2, null) : null, c0013n.f212f, c0013n.f213g);
            Bundle bundle = c0013n.f207a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z5 = c0013n.f209c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z5);
            int i9 = Build.VERSION.SDK_INT;
            y.a(builderA, z5);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i9 >= 28) {
                A.b(builderA, 0);
            }
            if (i9 >= 29) {
                B.c(builderA, false);
            }
            if (i9 >= 31) {
                C.a(builderA, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c0013n.f210d);
            v.b(builderA, bundle2);
            v.a(this.f163b, v.d(builderA));
        }
        Bundle bundle3 = tVar.f234p;
        if (bundle3 != null) {
            this.f165d.putAll(bundle3);
        }
        int i10 = Build.VERSION.SDK_INT;
        this.f163b.setShowWhen(tVar.f229k);
        v.i(this.f163b, tVar.f233o);
        v.g(this.f163b, tVar.f231m);
        v.j(this.f163b, null);
        v.h(this.f163b, tVar.f232n);
        this.f166e = tVar.f238t;
        w.b(this.f163b, null);
        w.c(this.f163b, tVar.f235q);
        w.f(this.f163b, tVar.f236r);
        w.d(this.f163b, null);
        w.e(this.f163b, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = tVar.f221c;
        ArrayList arrayList3 = tVar.f241w;
        if (i10 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    AbstractC0628i.p(it.next());
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    C1281c c1281c = new C1281c(arrayList3.size() + arrayList.size());
                    c1281c.addAll(arrayList);
                    c1281c.addAll(arrayList3);
                    arrayList3 = new ArrayList(c1281c);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                w.a(this.f163b, (String) it2.next());
            }
        }
        ArrayList arrayList4 = tVar.f222d;
        if (arrayList4.size() > 0) {
            if (tVar.f234p == null) {
                tVar.f234p = new Bundle();
            }
            Bundle bundle4 = tVar.f234p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i11 = 0;
            while (i11 < arrayList4.size()) {
                String string = Integer.toString(i11);
                C0013n c0013n2 = (C0013n) arrayList4.get(i11);
                Bundle bundle7 = new Bundle();
                if (c0013n2.f208b == null && (i6 = c0013n2.f211e) != 0) {
                    c0013n2.f208b = IconCompat.b(i6);
                }
                IconCompat iconCompat3 = c0013n2.f208b;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i8);
                bundle7.putCharSequence("title", c0013n2.f212f);
                bundle7.putParcelable("actionIntent", c0013n2.f213g);
                Bundle bundle8 = c0013n2.f207a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", c0013n2.f209c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", c0013n2.f210d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i11++;
                i8 = 0;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (tVar.f234p == null) {
                tVar.f234p = new Bundle();
            }
            tVar.f234p.putBundle("android.car.EXTENSIONS", bundle4);
            this.f165d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f163b.setExtras(tVar.f234p);
        y.e(this.f163b, null);
        if (i12 >= 26) {
            z.b(this.f163b, 0);
            z.e(this.f163b, null);
            z.f(this.f163b, null);
            z.g(this.f163b, 0L);
            z.d(this.f163b, tVar.f238t);
            if (!TextUtils.isEmpty(tVar.f237s)) {
                this.f163b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                AbstractC0628i.p(it3.next());
                throw null;
            }
        }
        if (i12 >= 29) {
            B.a(this.f163b, tVar.f239u);
            B.b(this.f163b, null);
        }
    }
}
