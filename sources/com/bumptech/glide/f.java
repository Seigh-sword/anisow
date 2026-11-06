package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;
import l1.q;
import m1.C1010h;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f6330k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1010h f6331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U1.i f6332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V0.m f6333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S0.f f6334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f6336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f6337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final I0.f f6338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y1.f f6340j;

    static {
        a aVar = new a();
        aVar.f6290w = A1.a.f6a;
        f6330k = aVar;
    }

    public f(Context context, C1010h c1010h, k kVar, V0.m mVar, S0.f fVar, C1280b c1280b, List list, q qVar, I0.f fVar2, int i6) {
        super(context.getApplicationContext());
        this.f6331a = c1010h;
        this.f6333c = mVar;
        this.f6334d = fVar;
        this.f6335e = list;
        this.f6336f = c1280b;
        this.f6337g = qVar;
        this.f6338h = fVar2;
        this.f6339i = i6;
        this.f6332b = new U1.i(kVar);
    }

    public final j a() {
        return (j) this.f6332b.a();
    }
}
