package X1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f4536d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4539c;

    public N(String str, String str2, boolean z5) {
        AbstractC1332d.g(str);
        this.f4537a = str;
        AbstractC1332d.g(str2);
        this.f4538b = str2;
        this.f4539c = z5;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        String str = this.f4537a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f4539c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f4536d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e6) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e6.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f4538b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n5 = (N) obj;
        return AbstractC1332d.D(this.f4537a, n5.f4537a) && AbstractC1332d.D(this.f4538b, n5.f4538b) && AbstractC1332d.D(null, null) && this.f4539c == n5.f4539c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4537a, this.f4538b, null, 4225, Boolean.valueOf(this.f4539c)});
    }

    public final String toString() {
        String str = this.f4537a;
        if (str != null) {
            return str;
        }
        AbstractC1332d.m(null);
        throw null;
    }
}
