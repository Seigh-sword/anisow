package com.onesignal;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.onesignal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0545d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC0541b1 f7777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC0538a1 f7778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f7779y;

    public ViewTreeObserverOnGlobalLayoutListenerC0545d(InterfaceC0538a1 interfaceC0538a1, InterfaceC0541b1 interfaceC0541b1, String str) {
        this.f7778x = interfaceC0538a1;
        this.f7777w = interfaceC0541b1;
        this.f7779y = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (AbstractC0565j1.f(new WeakReference(AbstractC0603w1.j()))) {
            return;
        }
        Activity activity = ((C0548e) this.f7778x).f7789b;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        ConcurrentHashMap concurrentHashMap = C0548e.f7787f;
        String str = this.f7779y;
        concurrentHashMap.remove(str);
        C0548e.f7786e.remove(str);
        ((C0579o0) this.f7777w).a0();
    }
}
