package o0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: o0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1176c extends D4.i implements C4.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C1176c f11901y = new C1176c(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C1176c f11902z = new C1176c(1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11903x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1176c(int i6) {
        super(0);
        this.f11903x = i6;
    }

    @Override // C4.a
    public final Object b() {
        switch (this.f11903x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new Handler(Looper.getMainLooper());
            default:
                return null;
        }
    }
}
