package N3;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import b2.AbstractC0338c;
import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f2143a = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K1.b f2144b;

    static {
        y3.d dVar = new y3.d();
        dVar.a(H.class, C0121g.f2230a);
        dVar.a(P.class, C0122h.f2234a);
        dVar.a(C0124j.class, C0119e.f2221a);
        dVar.a(C0116b.class, C0118d.f2214a);
        dVar.a(C0115a.class, C0117c.f2207a);
        dVar.a(C0134u.class, C0120f.f2225a);
        dVar.f13830d = true;
        f2144b = new K1.b(19, dVar);
    }

    public static C0116b a(Y2.g gVar) {
        Object next;
        C0134u c0134u;
        String strA;
        gVar.a();
        Context context = gVar.f4816a;
        AbstractC1305a.n(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.f4818c.f4832b;
        AbstractC1305a.n(str, "firebaseApp.options.applicationId");
        String str2 = Build.MODEL;
        AbstractC1305a.n(str2, "MODEL");
        String str3 = Build.VERSION.RELEASE;
        AbstractC1305a.n(str3, "RELEASE");
        AbstractC1305a.n(packageName, "packageName");
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? strValueOf : str4;
        String str6 = Build.MANUFACTURER;
        AbstractC1305a.n(str6, "MANUFACTURER");
        gVar.a();
        int iMyPid = Process.myPid();
        Iterator it = f2.h.n(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0134u) next).f2272b == iMyPid) {
                break;
            }
        }
        C0134u c0134u2 = (C0134u) next;
        if (c0134u2 == null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33) {
                strA = Process.myProcessName();
                AbstractC1305a.n(strA, "myProcessName()");
            } else if ((i6 < 28 || (strA = Application.getProcessName()) == null) && (strA = AbstractC0338c.a()) == null) {
                strA = "";
            }
            c0134u = new C0134u(iMyPid, 0, strA, false);
        } else {
            c0134u = c0134u2;
        }
        gVar.a();
        return new C0116b(str, str2, str3, new C0115a(packageName, str5, strValueOf, str6, c0134u, f2.h.n(context)));
    }
}
