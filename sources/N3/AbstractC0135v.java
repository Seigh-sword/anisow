package N3;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import b2.AbstractC0338c;
import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: N3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0135v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f2276b;

    static {
        String strA;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            strA = Process.myProcessName();
            AbstractC1305a.n(strA, "myProcessName()");
        } else if ((i6 < 28 || (strA = Application.getProcessName()) == null) && (strA = AbstractC0338c.a()) == null) {
            strA = "";
        }
        byte[] bytes = strA.getBytes(K4.a.f1637a);
        AbstractC1305a.n(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        f2275a = AbstractC0628i.j("firebase_session_", strEncodeToString, "_data");
        f2276b = AbstractC0628i.j("firebase_session_", strEncodeToString, "_settings");
    }
}
