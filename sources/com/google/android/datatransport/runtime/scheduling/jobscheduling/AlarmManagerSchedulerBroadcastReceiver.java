package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import H1.j;
import H1.u;
import M1.f;
import Q1.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6415a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i6 = intent.getExtras().getInt("attemptNumber");
        u.b(context);
        C0803c c0803cA = j.a();
        c0803cA.Q(queryParameter);
        c0803cA.R(a.b(iIntValue));
        if (queryParameter2 != null) {
            c0803cA.f9278y = Base64.decode(queryParameter2, 0);
        }
        M1.j jVar = u.a().f962d;
        j jVarK = c0803cA.k();
        M1.a aVar = new M1.a();
        jVar.getClass();
        jVar.f1790e.execute(new f(jVar, jVarK, i6, aVar));
    }
}
