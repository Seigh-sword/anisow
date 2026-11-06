package N3;

import W.C0183b;
import a0.C0254b;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import b2.AbstractC0338c;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: N3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0138y extends D4.i implements C4.l {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0138y f2279x = new C0138y(1);

    @Override // C4.l
    public final Object j(Object obj) {
        String strA;
        C0183b c0183b = (C0183b) obj;
        AbstractC1305a.o(c0183b, "ex");
        StringBuilder sb = new StringBuilder("CorruptionException in sessions DataStore in ");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            strA = Process.myProcessName();
            AbstractC1305a.n(strA, "myProcessName()");
        } else if ((i6 < 28 || (strA = Application.getProcessName()) == null) && (strA = AbstractC0338c.a()) == null) {
            strA = "";
        }
        sb.append(strA);
        sb.append('.');
        Log.w("FirebaseSessionsRepo", sb.toString(), c0183b);
        return new C0254b(true);
    }
}
