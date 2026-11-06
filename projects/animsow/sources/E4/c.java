package e4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedList f8294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC0674a f8295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ComponentName f8296c;

    static {
        LinkedList linkedList = new LinkedList();
        f8294a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    public static void a(Context context, int i6) {
        InterfaceC0674a interfaceC0674a;
        if (f8295b == null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                f8296c = launchIntentForPackage.getComponent();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveInfoResolveActivity != null && !resolveInfoResolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
                    String str = resolveInfoResolveActivity.activityInfo.packageName;
                    Iterator it = f8294a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            interfaceC0674a = (InterfaceC0674a) ((Class) it.next()).newInstance();
                        } catch (Exception unused) {
                            interfaceC0674a = null;
                        }
                        if (interfaceC0674a != null && interfaceC0674a.b().contains(str)) {
                            f8295b = interfaceC0674a;
                            break;
                        }
                    }
                    if (f8295b == null) {
                        String str2 = Build.MANUFACTURER;
                        f8295b = str2.equalsIgnoreCase("ZUK") ? new ZukHomeBadger() : str2.equalsIgnoreCase("OPPO") ? new OPPOHomeBader() : str2.equalsIgnoreCase("VIVO") ? new VivoHomeBadger() : new DefaultBadger();
                    }
                }
            } else {
                Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            }
            throw new b("No default launcher available");
        }
        try {
            f8295b.a(context, f8296c, i6);
        } catch (Exception e6) {
            throw new b("Unable to execute badge", e6);
        }
    }
}
