package U1;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable f3630e;

    public /* synthetic */ v(l lVar) {
        super(false, null, null);
        this.f3630e = lVar;
    }

    @Override // U1.w
    public final String a() {
        try {
            return (String) this.f3630e.call();
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
