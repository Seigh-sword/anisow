package V0;

import android.content.Context;
import p4.InterfaceC1254c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC1254c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3687a;

    public e(f fVar) {
        this.f3687a = fVar;
    }

    @Override // q4.InterfaceC1266a
    public final Object get() {
        Context context = this.f3687a.f3688a.f11703a;
        if (context != null) {
            return new Z0.e(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
