package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements C0.b {
    @Override // C0.b
    public final List a() {
        return t4.p.f12756w;
    }

    @Override // C0.b
    public final Object b(Context context) {
        AbstractC1305a.o(context, "context");
        C0.a aVarC = C0.a.c(context);
        AbstractC1305a.n(aVarC, "getInstance(context)");
        if (!aVarC.f109b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!AbstractC0318s.f5640a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC1305a.m(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        L l5 = L.f5561E;
        l5.getClass();
        l5.f5562A = new Handler();
        l5.f5563B.e(EnumC0313m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1305a.m(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new J(l5));
        return l5;
    }
}
