package p1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f12273a;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i6 = 0; i6 < length; i6++) {
                char cCharAt = property.charAt(i6);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    cCharAt = '?';
                }
                sb.append(cCharAt);
            }
            property = sb.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put("User-Agent", Collections.singletonList(new r(property)));
        }
        f12273a = Collections.unmodifiableMap(map);
    }
}
