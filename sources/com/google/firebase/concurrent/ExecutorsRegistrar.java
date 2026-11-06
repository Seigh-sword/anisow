package com.google.firebase.concurrent;

import N.C0095h;
import android.annotation.SuppressLint;
import c3.InterfaceC0375a;
import c3.b;
import c3.c;
import c3.d;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0653a;
import d3.C0654b;
import d3.g;
import d3.n;
import d3.r;
import f2.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f7427a = new n(new g(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f7428b = new n(new g(3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f7429c = new n(new g(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f7430d = new n(new g(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(InterfaceC0375a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(InterfaceC0375a.class, ExecutorService.class), new r(InterfaceC0375a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            h.g(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        C0654b c0654b = new C0654b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0095h(0), hashSet3);
        r rVar3 = new r(b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(b.class, ExecutorService.class), new r(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            h.g(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        C0654b c0654b2 = new C0654b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C0095h(1), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            h.g(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        C0654b c0654b3 = new C0654b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C0095h(2), hashSet9);
        C0653a c0653aA = C0654b.a(new r(d.class, Executor.class));
        c0653aA.f8179f = new C0095h(3);
        return Arrays.asList(c0654b, c0654b2, c0654b3, c0653aA.b());
    }
}
