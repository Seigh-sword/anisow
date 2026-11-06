package com.bumptech.glide;

import w1.C1474r;
import w1.InterfaceC1457a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC1457a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1474r f6402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f6403b;

    public n(o oVar, C1474r c1474r) {
        this.f6403b = oVar;
        this.f6402a = c1474r;
    }

    @Override // w1.InterfaceC1457a
    public final void a(boolean z5) {
        if (z5) {
            synchronized (this.f6403b) {
                this.f6402a.i();
            }
        }
    }
}
