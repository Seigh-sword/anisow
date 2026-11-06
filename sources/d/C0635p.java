package d;

import D.AbstractC0005f;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import f.AbstractC0680f;
import f.C0683i;
import g.C0712a;
import m3.v0;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0635p extends AbstractC0680f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0638s f8119h;

    public C0635p(h0.E e6) {
        this.f8119h = e6;
    }

    @Override // f.AbstractC0680f
    public final void b(int i6, v0 v0Var, Object obj) {
        Bundle bundle;
        AbstractC1305a.o(v0Var, "contract");
        AbstractActivityC0638s abstractActivityC0638s = this.f8119h;
        C0712a c0712aE = v0Var.e(abstractActivityC0638s, obj);
        int i7 = 0;
        if (c0712aE != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0634o(i6, i7, this, c0712aE));
            return;
        }
        Intent intentA = v0Var.a(abstractActivityC0638s, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            AbstractC1305a.l(extras);
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(abstractActivityC0638s.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (AbstractC1305a.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0005f.c(abstractActivityC0638s, stringArrayExtra, i6);
            return;
        }
        if (!AbstractC1305a.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
            int i8 = AbstractC0005f.f190b;
            abstractActivityC0638s.startActivityForResult(intentA, i6, bundle);
            return;
        }
        C0683i c0683i = (C0683i) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            AbstractC1305a.l(c0683i);
            IntentSender intentSender = c0683i.f8319w;
            Intent intent = c0683i.f8320x;
            int i9 = c0683i.f8321y;
            int i10 = c0683i.f8322z;
            int i11 = AbstractC0005f.f190b;
            abstractActivityC0638s.startIntentSenderForResult(intentSender, i6, intent, i9, i10, 0, bundle);
        } catch (IntentSender.SendIntentException e6) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0634o(i6, 1, this, e6));
        }
    }
}
