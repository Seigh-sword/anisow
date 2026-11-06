package h5;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0.a f9029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B3.e f9030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P2.e f9031c;

    static {
        P2.e eVar;
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f9029a = null;
            f9030b = new B3.e();
            eVar = new P2.e();
        } else if (property.equals("Dalvik")) {
            f9029a = new U0.a();
            f9030b = new P(0);
            eVar = new C0781h();
        } else {
            f9029a = null;
            f9030b = new P(1);
            eVar = new C0781h();
        }
        f9031c = eVar;
    }
}
