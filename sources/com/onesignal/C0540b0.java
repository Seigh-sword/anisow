package com.onesignal;

import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: renamed from: com.onesignal.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Date f7769c = new Date();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0537a0 f7770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7771b = new ArrayList();

    public C0540b0(C0579o0 c0579o0) {
        this.f7770a = c0579o0;
    }

    public static boolean a(double d6, double d7) {
        return Math.abs(d6 - d7) < 0.3d;
    }
}
