package k3;

import D4.i;

/* JADX INFO: renamed from: k3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897c extends i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0897c f9651y = new C0897c(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0897c f9652z = new C0897c(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0897c f9650A = new C0897c(2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0897c(int i6) {
        super(0);
        this.f9653x = i6;
    }

    public final String a() {
        switch (this.f9653x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
            case 1:
                return "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
            default:
                return "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
        }
    }

    @Override // C4.a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f9653x) {
        }
        return a();
    }
}
