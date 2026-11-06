package com.google.firebase;

import B3.d;
import B3.e;
import B3.f;
import B3.g;
import L3.a;
import L3.b;
import N.C0095h;
import android.content.Context;
import android.os.Build;
import c3.InterfaceC0375a;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0653a;
import d3.C0654b;
import d3.k;
import d3.r;
import f2.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import s4.C1308d;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C0653a c0653aB = C0654b.b(b.class);
        c0653aB.a(new k(2, 0, a.class));
        c0653aB.f8179f = new C0095h(8);
        arrayList.add(c0653aB.b());
        r rVar = new r(InterfaceC0375a.class, Executor.class);
        C0653a c0653a = new C0653a(d.class, new Class[]{f.class, g.class});
        c0653a.a(k.b(Context.class));
        c0653a.a(k.b(Y2.g.class));
        c0653a.a(new k(2, 0, e.class));
        c0653a.a(new k(1, 1, b.class));
        c0653a.a(new k(rVar, 1, 0));
        c0653a.f8179f = new B3.b(rVar, 0);
        arrayList.add(c0653a.b());
        arrayList.add(h.j("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.j("fire-core", "21.0.0"));
        arrayList.add(h.j("device-name", a(Build.PRODUCT)));
        arrayList.add(h.j("device-model", a(Build.DEVICE)));
        arrayList.add(h.j("device-brand", a(Build.BRAND)));
        arrayList.add(h.m("android-target-sdk", new C0095h(19)));
        arrayList.add(h.m("android-min-sdk", new C0095h(20)));
        arrayList.add(h.m("android-platform", new C0095h(21)));
        arrayList.add(h.m("android-installer", new C0095h(22)));
        try {
            C1308d.f12629x.getClass();
            str = "1.9.24";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(h.j("kotlin", str));
        }
        return arrayList;
    }
}
