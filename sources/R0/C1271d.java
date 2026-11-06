package r0;

import M4.B;
import M4.J;
import android.net.Uri;
import android.view.InputEvent;
import s0.AbstractC1286a;
import s0.AbstractC1289d;
import s0.AbstractC1290e;
import s0.C1288c;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: r0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1271d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y2.b f12428a;

    public C1271d(C1288c c1288c) {
        this.f12428a = c1288c;
    }

    public X2.a a(AbstractC1286a abstractC1286a) {
        AbstractC1305a.o(abstractC1286a, "deletionRequest");
        throw null;
    }

    public X2.a b() {
        return B.b(S3.a.e(S3.a.c(J.f1851a), new C1268a(this, null)));
    }

    public X2.a c(Uri uri, InputEvent inputEvent) {
        AbstractC1305a.o(uri, "attributionSource");
        return B.b(S3.a.e(S3.a.c(J.f1851a), new C1269b(this, uri, inputEvent, null)));
    }

    public X2.a d(Uri uri) {
        AbstractC1305a.o(uri, "trigger");
        return B.b(S3.a.e(S3.a.c(J.f1851a), new C1270c(this, uri, null)));
    }

    public X2.a e(AbstractC1289d abstractC1289d) {
        AbstractC1305a.o(abstractC1289d, "request");
        throw null;
    }

    public X2.a f(AbstractC1290e abstractC1290e) {
        AbstractC1305a.o(abstractC1290e, "request");
        throw null;
    }
}
