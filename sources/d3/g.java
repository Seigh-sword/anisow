package d3;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import e3.ScheduledExecutorServiceC0669f;
import e3.ThreadFactoryC0664a;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements D3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8190a;

    public /* synthetic */ g(int i6) {
        this.f8190a = i6;
    }

    @Override // D3.c
    public final Object get() {
        switch (this.f8190a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return Collections.emptySet();
            case 1:
                return null;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                n nVar = ExecutorsRegistrar.f7427a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i6 = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i6 >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new ScheduledExecutorServiceC0669f(Executors.newFixedThreadPool(4, new ThreadFactoryC0664a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f7430d.get());
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                n nVar2 = ExecutorsRegistrar.f7427a;
                return new ScheduledExecutorServiceC0669f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC0664a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f7430d.get());
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                n nVar3 = ExecutorsRegistrar.f7427a;
                return new ScheduledExecutorServiceC0669f(Executors.newCachedThreadPool(new ThreadFactoryC0664a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f7430d.get());
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                n nVar4 = ExecutorsRegistrar.f7427a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0664a("Firebase Scheduler", 0, null));
            default:
                C1243i c1243i = FirebaseMessaging.f7437k;
                return null;
        }
    }
}
