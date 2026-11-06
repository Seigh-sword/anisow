package D;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import d.AbstractC0628i;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: D.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0005f extends E.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f190b = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Activity activity, String[] strArr, int i6) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (TextUtils.isEmpty(strArr[i7])) {
                throw new IllegalArgumentException(AbstractC0628i.m(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i7], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i7));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (!hashSet.contains(Integer.valueOf(i9))) {
                    strArr2[i8] = strArr[i9];
                    i8++;
                }
            }
        }
        if (activity instanceof InterfaceC0004e) {
            ((InterfaceC0004e) activity).getClass();
        }
        AbstractC0000a.b(activity, strArr, i6);
    }
}
