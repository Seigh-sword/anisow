package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Y2 implements InterfaceC0391b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0391b3[] f6748a;

    @Override // com.google.android.gms.internal.measurement.InterfaceC0391b3
    public final boolean a(Class cls) {
        for (InterfaceC0391b3 interfaceC0391b3 : this.f6748a) {
            if (interfaceC0391b3.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0391b3
    public final InterfaceC0397c3 b(Class cls) {
        for (InterfaceC0391b3 interfaceC0391b3 : this.f6748a) {
            if (interfaceC0391b3.a(cls)) {
                return interfaceC0391b3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
