package com.onesignal;

import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f7665A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7666w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7668y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7669z;

    public P0(p2 p2Var, Activity activity, String str, C0552f0 c0552f0) {
        this.f7667x = p2Var;
        this.f7668y = activity;
        this.f7669z = str;
        this.f7665A = c0552f0;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i6 = this.f7666w;
        Object obj = this.f7669z;
        Object obj2 = this.f7668y;
        Object obj3 = this.f7667x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    ((Method) obj3).invoke(obj2, obj);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e6) {
                    e6.printStackTrace();
                    return;
                }
            default:
                try {
                    p2.c((p2) obj3, (Activity) obj2, (String) obj, ((C0552f0) this.f7665A).f7805d);
                    return;
                } catch (Exception e7) {
                    if (e7.getMessage() == null || !e7.getMessage().contains("No WebView installed")) {
                        throw e7;
                    }
                    AbstractC0603w1.b(EnumC0600v1.f7997y, "Error setting up WebView: ", e7);
                    return;
                }
        }
    }

    public P0(C1474r c1474r, Method method, Object obj, Object obj2) {
        this.f7665A = c1474r;
        this.f7667x = method;
        this.f7668y = obj;
        this.f7669z = obj2;
    }
}
