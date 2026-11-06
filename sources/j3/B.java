package J3;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f1335b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f1336a;

    public final synchronized A a() {
        String str;
        A a6;
        x xVar = this.f1336a;
        synchronized (((ArrayDeque) xVar.f1449e)) {
            str = (String) ((ArrayDeque) xVar.f1449e).peek();
        }
        Pattern pattern = A.f1331d;
        a6 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                a6 = new A(strArrSplit[0], strArrSplit[1]);
            }
        }
        return a6;
    }
}
