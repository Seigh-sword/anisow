package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0445k3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0445k3 f6859c = new C0445k3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6861b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X2 f6860a = new X2();

    public final InterfaceC0457m3 a(Class cls) {
        InterfaceC0457m3 interfaceC0457m3L;
        Charset charset = K2.f6615a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f6861b;
        InterfaceC0457m3 interfaceC0457m3 = (InterfaceC0457m3) concurrentHashMap.get(cls);
        if (interfaceC0457m3 != null) {
            return interfaceC0457m3;
        }
        X2 x22 = this.f6860a;
        x22.getClass();
        I2.class.isAssignableFrom(cls);
        InterfaceC0397c3 interfaceC0397c3B = x22.f6737a.b(cls);
        C0451l3 c0451l3 = (C0451l3) interfaceC0397c3B;
        boolean z5 = (c0451l3.f6876d & 2) == 2;
        J2 j22 = W.f6727a;
        if (z5) {
            interfaceC0457m3L = new C0421g3(c0451l3.f6873a);
        } else {
            if (Z2.f6754a[u.h.b(c0451l3.b())] == 1) {
                j22 = null;
            }
            interfaceC0457m3L = C0415f3.l(interfaceC0397c3B, j22);
        }
        InterfaceC0457m3 interfaceC0457m32 = (InterfaceC0457m3) concurrentHashMap.putIfAbsent(cls, interfaceC0457m3L);
        return interfaceC0457m32 != null ? interfaceC0457m32 : interfaceC0457m3L;
    }
}
