package J3;

import android.util.Log;
import d.AbstractC0628i;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f1331d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1334c;

    public A(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f1331d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AbstractC0628i.j("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f1332a = strSubstring;
        this.f1333b = str;
        this.f1334c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a6 = (A) obj;
        return this.f1332a.equals(a6.f1332a) && this.f1333b.equals(a6.f1333b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1333b, this.f1332a});
    }
}
