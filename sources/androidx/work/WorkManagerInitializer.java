package androidx.work;

import B3.e;
import C0.b;
import I0.o;
import J0.k;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5828a = o.y("WrkMgrInitializer");

    @Override // C0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // C0.b
    public final Object b(Context context) {
        o.w().u(f5828a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        k.K(context, new I0.b(new e()));
        return k.J(context);
    }
}
