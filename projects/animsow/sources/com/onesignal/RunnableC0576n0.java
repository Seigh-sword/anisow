package com.onesignal;

import android.app.Activity;

/* JADX INFO: renamed from: com.onesignal.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0576n0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7896w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f7897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7898y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7899z;

    public RunnableC0576n0(p2 p2Var, Activity activity, String str) {
        this.f7899z = p2Var;
        this.f7898y = activity;
        this.f7897x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f7896w;
        Object obj = this.f7898y;
        Object obj2 = this.f7899z;
        switch (i6) {
            case 1:
                AbstractC0571l1.D(this.f7897x, null, null, (AbstractC0571l1) obj, 60000, (String) obj2);
                break;
            default:
                p2 p2Var = (p2) obj2;
                p2.d(p2Var, (Activity) obj);
                p2Var.f7939b.loadData(this.f7897x, "text/html; charset=utf-8", "base64");
                break;
        }
    }

    public RunnableC0576n0(String str, AbstractC0571l1 abstractC0571l1, String str2) {
        this.f7897x = str;
        this.f7898y = abstractC0571l1;
        this.f7899z = str2;
    }
}
