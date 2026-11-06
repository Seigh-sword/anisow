package h5;

import f5.C0710g;

/* JADX INFO: renamed from: h5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0774a implements InterfaceC0790q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0774a f9096w = new C0774a();

    @Override // h5.InterfaceC0790q
    public final Object k(Object obj) {
        V4.J j6 = (V4.J) obj;
        try {
            C0710g c0710g = new C0710g();
            j6.g().s(c0710g);
            return new V4.H(j6.c(), j6.b(), c0710g);
        } finally {
            j6.close();
        }
    }
}
