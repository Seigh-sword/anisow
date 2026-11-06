package d;

import android.window.OnBackInvokedCallback;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0614B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0614B f8075a = new C0614B();

    public final OnBackInvokedCallback a(C4.l lVar, C4.l lVar2, C4.a aVar, C4.a aVar2) {
        AbstractC1305a.o(lVar, "onBackStarted");
        AbstractC1305a.o(lVar2, "onBackProgressed");
        AbstractC1305a.o(aVar, "onBackInvoked");
        AbstractC1305a.o(aVar2, "onBackCancelled");
        return new C0613A(lVar, lVar2, aVar, aVar2);
    }
}
