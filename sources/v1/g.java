package V1;

import I0.o;
import W1.C0207a;
import W1.C0211e;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.measurement.X;
import java.util.Collections;
import java.util.Set;
import s.C1281c;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f3712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f3713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0207a f3714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f3716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0211e f3717h;

    public g(Context context, d dVar, a aVar, f fVar) {
        AbstractC1332d.n(context, "Null context is not permitted.");
        AbstractC1332d.n(dVar, "Api must not be null.");
        AbstractC1332d.n(fVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC1332d.n(applicationContext, "The provided context did not have an application context.");
        this.f3710a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f3711b = attributionTag;
        this.f3712c = dVar;
        this.f3713d = aVar;
        this.f3714e = new C0207a(dVar, aVar, attributionTag);
        C0211e c0211eE = C0211e.e(applicationContext);
        this.f3717h = c0211eE;
        this.f3715f = c0211eE.f4307D.getAndIncrement();
        this.f3716g = fVar.f3709a;
        X x5 = c0211eE.f4312I;
        x5.sendMessage(x5.obtainMessage(7, this));
    }

    public final p.b a() {
        p.b bVar = new p.b(4);
        bVar.f12205a = null;
        Set setEmptySet = Collections.emptySet();
        if (((C1281c) bVar.f12206b) == null) {
            bVar.f12206b = new C1281c(0);
        }
        ((C1281c) bVar.f12206b).addAll(setEmptySet);
        Context context = this.f3710a;
        bVar.f12208d = context.getClass().getName();
        bVar.f12207c = context.getPackageName();
        return bVar;
    }
}
