package h0;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import d.AbstractActivityC0638s;
import f.C0675a;
import f.C0683i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends m3.v0 {
    @Override // m3.v0
    public final Intent a(AbstractActivityC0638s abstractActivityC0638s, Object obj) {
        Bundle bundleExtra;
        C0683i c0683i = (C0683i) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = c0683i.f8320x;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                IntentSender intentSender = c0683i.f8319w;
                AbstractC1305a.o(intentSender, "intentSender");
                c0683i = new C0683i(intentSender, null, c0683i.f8321y, c0683i.f8322z);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0683i);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
        }
        return intent;
    }

    @Override // m3.v0
    public final Object g(Intent intent, int i6) {
        return new C0675a(intent, i6);
    }
}
