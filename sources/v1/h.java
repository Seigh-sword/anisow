package V1;

import W1.C0229x;
import W1.Y;
import X1.C0239g;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.onesignal.C0589s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import n2.C1153a;
import s.C1280b;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3721d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f3723f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Looper f3726i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f3718a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f3719b = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1280b f3722e = new C1280b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1280b f3724g = new C1280b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3725h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U1.e f3727j = U1.e.f3586d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z1.b f3728k = n2.b.f11699a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f3729l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f3730m = new ArrayList();

    public h(Context context) {
        this.f3723f = context;
        this.f3726i = context.getMainLooper();
        this.f3720c = context.getPackageName();
        this.f3721d = context.getClass().getName();
    }

    public final void a(d dVar) {
        AbstractC1332d.n(dVar, "Api must not be null");
        this.f3724g.put(dVar, null);
        AbstractC1332d.n(dVar.f3704a, "Base client builder must not be null");
        List listEmptyList = Collections.emptyList();
        this.f3719b.addAll(listEmptyList);
        this.f3718a.addAll(listEmptyList);
    }

    public final void b(C0589s c0589s) {
        this.f3729l.add(c0589s);
    }

    public final void c(C0589s c0589s) {
        this.f3730m.add(c0589s);
    }

    public final C0229x d() {
        AbstractC1332d.d("must call addApi() to add at least one API", !this.f3724g.isEmpty());
        C1153a c1153a = C1153a.f11698a;
        C1280b c1280b = this.f3724g;
        d dVar = n2.b.f11700b;
        if (c1280b.containsKey(dVar)) {
            c1153a = (C1153a) c1280b.getOrDefault(dVar, null);
        }
        C0239g c0239g = new C0239g(null, this.f3718a, this.f3722e, this.f3720c, this.f3721d, c1153a);
        Map map = c0239g.f4592d;
        C1280b c1280b2 = new C1280b();
        C1280b c1280b3 = new C1280b();
        ArrayList arrayList = new ArrayList();
        for (d dVar2 : (s.h) this.f3724g.keySet()) {
            Object orDefault = this.f3724g.getOrDefault(dVar2, null);
            boolean z5 = map.get(dVar2) != null;
            c1280b2.put(dVar2, Boolean.valueOf(z5));
            Y y5 = new Y(dVar2, z5);
            arrayList.add(y5);
            f2.h hVar = dVar2.f3704a;
            AbstractC1332d.m(hVar);
            c1280b3.put(dVar2.f3705b, hVar.e(this.f3723f, this.f3726i, c0239g, orDefault, y5, y5));
        }
        C0229x c0229x = new C0229x(this.f3723f, new ReentrantLock(), this.f3726i, c0239g, this.f3727j, this.f3728k, c1280b2, this.f3729l, this.f3730m, c1280b3, this.f3725h, C0229x.f(c1280b3.values(), true), arrayList);
        Set set = GoogleApiClient.f6432a;
        synchronized (set) {
            set.add(c0229x);
        }
        if (this.f3725h < 0) {
            return c0229x;
        }
        throw null;
    }

    public final void e(Handler handler) {
        AbstractC1332d.n(handler, "Handler must not be null");
        this.f3726i = handler.getLooper();
    }
}
