package com.onesignal;

import java.util.Set;

/* JADX INFO: renamed from: com.onesignal.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0605x0 extends AbstractC0571l1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Set f8064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0611z0 f8065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A0 f8066j;

    public /* synthetic */ C0605x0(A0 a02, Set set, InterfaceC0611z0 interfaceC0611z0, int i6) {
        this.f8063g = i6;
        this.f8066j = a02;
        this.f8064h = set;
        this.f8065i = interfaceC0611z0;
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void H(int i6, String str, Throwable th) {
        int i7 = this.f8063g;
        InterfaceC0611z0 interfaceC0611z0 = this.f8065i;
        A0 a02 = this.f8066j;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                A0.b(a02, "engagement", i6, str);
                interfaceC0611z0.d(str);
                break;
            case 1:
                A0.b(a02, "page impression", i6, str);
                interfaceC0611z0.d(str);
                break;
            default:
                A0.b(a02, "impression", i6, str);
                interfaceC0611z0.d(str);
                break;
        }
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void I(String str) {
        int i6 = this.f8063g;
        Set set = this.f8064h;
        A0 a02 = this.f8066j;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                A0.a(a02, "engagement", str);
                String str2 = E1.f7517a;
                a02.f7462c.getClass();
                E1.g(str2, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
                break;
            case 1:
                A0.a(a02, "page impression", str);
                String str3 = E1.f7517a;
                a02.f7462c.getClass();
                E1.g(str3, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
                break;
            default:
                A0.a(a02, "impression", str);
                String str4 = E1.f7517a;
                a02.f7462c.getClass();
                E1.g(str4, "PREFS_OS_IMPRESSIONED_IAMS", set);
                break;
        }
    }
}
