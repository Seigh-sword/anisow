package B3;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import d3.r;
import java.util.concurrent.Executor;
import p3.C1251c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements d3.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f90w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f91x;

    public /* synthetic */ b(r rVar, int i6) {
        this.f90w = i6;
        this.f91x = rVar;
    }

    @Override // d3.e
    public final Object f(C1251c c1251c) {
        int i6 = this.f90w;
        r rVar = this.f91x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new d((Context) c1251c.a(Context.class), ((Y2.g) c1251c.a(Y2.g.class)).d(), c1251c.g(r.a(e.class)), c1251c.b(L3.b.class), (Executor) c1251c.f(rVar));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(rVar, c1251c);
        }
    }
}
