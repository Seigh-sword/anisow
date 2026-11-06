package M4;

import v4.InterfaceC1430h;
import v4.InterfaceC1432j;

/* JADX INFO: renamed from: M4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0074t extends D4.i implements C4.p {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0074t f1919y = new C0074t(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0074t f1920z = new C0074t(1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1921x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0074t(int i6) {
        super(2);
        this.f1921x = i6;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f1921x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((InterfaceC1432j) obj).k((InterfaceC1430h) obj2);
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
        }
    }
}
