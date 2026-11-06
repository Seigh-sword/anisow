package Q0;

import I0.h;
import I0.o;
import J0.k;
import R0.i;
import S0.j;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import d.AbstractC0628i;
import i.C0803c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements N0.b, J0.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f2775F = o.y("SystemFgDispatcher");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinkedHashMap f2776A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final HashMap f2777B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final HashSet f2778C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final N0.c f2779D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public b f2780E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f2781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0803c f2782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f2783y = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f2784z;

    public c(Context context) {
        k kVarJ = k.J(context);
        this.f2781w = kVarJ;
        C0803c c0803c = kVarJ.f1209k;
        this.f2782x = c0803c;
        this.f2784z = null;
        this.f2776A = new LinkedHashMap();
        this.f2778C = new HashSet();
        this.f2777B = new HashMap();
        this.f2779D = new N0.c(context, c0803c, this);
        kVarJ.f1211m.b(this);
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f1101a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f1102b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f1103c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f1101a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f1102b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f1103c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // J0.a
    public final void a(String str, boolean z5) {
        Map.Entry entry;
        synchronized (this.f2783y) {
            try {
                i iVar = (i) this.f2777B.remove(str);
                if (iVar != null && this.f2778C.remove(iVar)) {
                    this.f2779D.b(this.f2778C);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f2776A.remove(str);
        int i6 = 0;
        if (str.equals(this.f2784z) && this.f2776A.size() > 0) {
            Iterator it = this.f2776A.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.f2784z = (String) entry.getKey();
            if (this.f2780E != null) {
                h hVar2 = (h) entry.getValue();
                b bVar = this.f2780E;
                int i7 = hVar2.f1101a;
                int i8 = hVar2.f1102b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
                systemForegroundService.f5855x.post(new d(systemForegroundService, i7, hVar2.f1103c, i8));
                b bVar2 = this.f2780E;
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) bVar2;
                systemForegroundService2.f5855x.post(new e(hVar2.f1101a, i6, systemForegroundService2));
            }
        }
        b bVar3 = this.f2780E;
        if (hVar == null || bVar3 == null) {
            return;
        }
        o oVarW = o.w();
        String str2 = f2775F;
        int i9 = hVar.f1101a;
        int i10 = hVar.f1102b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i9);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        oVarW.u(str2, AbstractC0628i.l(sb, i10, ")"), new Throwable[0]);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) bVar3;
        systemForegroundService3.f5855x.post(new e(hVar.f1101a, i6, systemForegroundService3));
    }

    @Override // N0.b
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.w().u(f2775F, AbstractC0628i.q("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            k kVar = this.f2781w;
            kVar.f1209k.p(new j(kVar, str, true));
        }
    }

    public final void f(Intent intent) {
        int i6 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o oVarW = o.w();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        oVarW.u(f2775F, AbstractC0628i.l(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.f2780E == null) {
            return;
        }
        h hVar = new h(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f2776A;
        linkedHashMap.put(stringExtra, hVar);
        if (TextUtils.isEmpty(this.f2784z)) {
            this.f2784z = stringExtra;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.f2780E;
            systemForegroundService.f5855x.post(new d(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f2780E;
        systemForegroundService2.f5855x.post(new c.d(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i6 |= ((h) ((Map.Entry) it.next()).getValue()).f1102b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f2784z);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f2780E;
            systemForegroundService3.f5855x.post(new d(systemForegroundService3, hVar2.f1101a, hVar2.f1103c, i6));
        }
    }

    public final void g() {
        this.f2780E = null;
        synchronized (this.f2783y) {
            this.f2779D.c();
        }
        this.f2781w.f1211m.e(this);
    }

    @Override // N0.b
    public final void c(List list) {
    }
}
