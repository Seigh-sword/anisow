package G1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f819l;

    public m(int i6) {
        if (i6 != 1) {
            return;
        }
        this.f808a = new P2.i();
        this.f809b = new P2.i();
        this.f810c = new P2.i();
        this.f811d = new P2.i();
        this.f812e = new P2.a(0.0f);
        this.f813f = new P2.a(0.0f);
        this.f814g = new P2.a(0.0f);
        this.f815h = new P2.a(0.0f);
        this.f816i = new P2.e();
        this.f817j = new P2.e();
        this.f818k = new P2.e();
        this.f819l = new P2.e();
    }

    public static void b(com.bumptech.glide.d dVar) {
        Object obj;
        if (dVar instanceof P2.i) {
            obj = (P2.i) dVar;
        } else if (!(dVar instanceof P2.d)) {
            return;
        } else {
            obj = (P2.d) dVar;
        }
        obj.getClass();
    }

    public final P2.j a() {
        P2.j jVar = new P2.j();
        jVar.f2462a = (com.bumptech.glide.d) this.f808a;
        jVar.f2463b = (com.bumptech.glide.d) this.f809b;
        jVar.f2464c = (com.bumptech.glide.d) this.f810c;
        jVar.f2465d = (com.bumptech.glide.d) this.f811d;
        jVar.f2466e = (P2.c) this.f812e;
        jVar.f2467f = (P2.c) this.f813f;
        jVar.f2468g = (P2.c) this.f814g;
        jVar.f2469h = (P2.c) this.f815h;
        jVar.f2470i = (P2.e) this.f816i;
        jVar.f2471j = (P2.e) this.f817j;
        jVar.f2472k = (P2.e) this.f818k;
        jVar.f2473l = (P2.e) this.f819l;
        return jVar;
    }
}
