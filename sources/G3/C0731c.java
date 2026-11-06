package g3;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m3.C1088a0;
import m3.C1090b0;
import m3.E0;
import s4.AbstractC1305a;
import t4.k;
import t4.n;
import t4.p;

/* JADX INFO: renamed from: g3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0731c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0731c f8531a = new C0731c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0731c f8532b = new C0731c();

    public static C1090b0 a(C0731c c0731c, String str, int i6, int i7, int i8) {
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        c0731c.getClass();
        C1088a0 c1088a0 = new C1088a0();
        c1088a0.f11449a = str;
        c1088a0.f11450b = i6;
        byte b6 = (byte) (c1088a0.f11453e | 1);
        c1088a0.f11451c = i7;
        c1088a0.f11452d = false;
        c1088a0.f11453e = (byte) (((byte) (b6 | 2)) | 4);
        return c1088a0.a();
    }

    public static ArrayList e(Context context) {
        AbstractC1305a.o(context, "context");
        int i6 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = p.f12756w;
        }
        ArrayList arrayListA0 = n.a0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListA0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i6) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k.W(arrayList));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            C1088a0 c1088a0 = new C1088a0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            c1088a0.f11449a = str2;
            c1088a0.f11450b = runningAppProcessInfo.pid;
            byte b6 = (byte) (c1088a0.f11453e | 1);
            c1088a0.f11451c = runningAppProcessInfo.importance;
            c1088a0.f11453e = (byte) (b6 | 2);
            c1088a0.f11452d = AbstractC1305a.c(str2, str);
            c1088a0.f11453e = (byte) (c1088a0.f11453e | 4);
            arrayList2.add(c1088a0.a());
        }
        return arrayList2;
    }

    public boolean b(int i6) {
        return 4 <= i6 || Log.isLoggable("FirebaseCrashlytics", i6);
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void d(String str, Exception exc) {
        if (b(6)) {
            Log.e("FirebaseCrashlytics", str, exc);
        }
    }

    public E0 f(Context context) {
        Object next;
        String processName;
        AbstractC1305a.o(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = e(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C1090b0) ((E0) next)).f11465b == iMyPid) {
                break;
            }
        }
        E0 e02 = (E0) next;
        if (e02 != null) {
            return e02;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            processName = Process.myProcessName();
            AbstractC1305a.n(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i6 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return a(this, processName, iMyPid, 0, 12);
    }

    public void g(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void h(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
