package com.google.firebase.crashlytics;

import J3.G;
import O3.a;
import O3.c;
import O3.d;
import Y2.g;
import a3.InterfaceC0260a;
import android.util.Log;
import c3.InterfaceC0375a;
import c3.b;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0653a;
import d3.C0654b;
import d3.k;
import d3.r;
import f2.h;
import f3.C0702c;
import g3.InterfaceC0729a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7431c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f7432a = new r(InterfaceC0375a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f7433b = new r(b.class, ExecutorService.class);

    static {
        d dVar = d.f2338w;
        Map map = c.f2337b;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new a(new T4.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C0653a c0653aB = C0654b.b(C0702c.class);
        c0653aB.f8174a = "fire-cls";
        c0653aB.a(k.b(g.class));
        c0653aB.a(k.b(E3.d.class));
        c0653aB.a(k.a(this.f7432a));
        c0653aB.a(k.a(this.f7433b));
        c0653aB.a(new k(0, 2, InterfaceC0729a.class));
        c0653aB.a(new k(0, 2, InterfaceC0260a.class));
        c0653aB.a(new k(0, 2, M3.a.class));
        c0653aB.f8179f = new G(2, this);
        c0653aB.c(2);
        return Arrays.asList(c0653aB.b(), h.j("fire-cls", "19.2.0"));
    }
}
