package com.onesignal;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p2 f7862x;

    public /* synthetic */ k2(p2 p2Var, int i6) {
        this.f7861w = i6;
        this.f7862x = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f7861w;
        int i7 = 0;
        p2 p2Var = this.f7862x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int[] iArrC = AbstractC0565j1.c(p2Var.f7941d);
                p2Var.f7939b.evaluateJavascript(AbstractC0628i.j("setSafeAreaInsets(", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrC[0]), Integer.valueOf(iArrC[1]), Integer.valueOf(iArrC[2]), Integer.valueOf(iArrC[3])), ")"), null);
                break;
            default:
                p2.d(p2Var, p2Var.f7941d);
                if (p2Var.f7943f.f7805d) {
                    OSUtils.u(new k2(p2Var, i7));
                }
                p2Var.f7939b.evaluateJavascript("getPageMetaData()", new l2(this));
                break;
        }
    }
}
