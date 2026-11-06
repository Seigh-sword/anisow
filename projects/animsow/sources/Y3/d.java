package y3;

import java.util.Date;
import java.util.HashMap;
import w3.InterfaceC1480d;
import w3.g;
import x3.InterfaceC1491a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1491a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f13824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f13825g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1508a f13829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1508a f13823e = new C1508a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f13826h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [y3.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [y3.b] */
    static {
        final int i6 = 0;
        f13824f = new w3.f() { // from class: y3.b
            @Override // w3.InterfaceC1477a
            public final void a(Object obj, Object obj2) {
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        ((g) obj2).a((String) obj);
                        break;
                    default:
                        ((g) obj2).b(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i7 = 1;
        f13825g = new w3.f() { // from class: y3.b
            @Override // w3.InterfaceC1477a
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        ((g) obj2).a((String) obj);
                        break;
                    default:
                        ((g) obj2).b(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f13827a = map;
        HashMap map2 = new HashMap();
        this.f13828b = map2;
        this.f13829c = f13823e;
        this.f13830d = false;
        map2.put(String.class, f13824f);
        map.remove(String.class);
        map2.put(Boolean.class, f13825g);
        map.remove(Boolean.class);
        map2.put(Date.class, f13826h);
        map.remove(Date.class);
    }

    public final InterfaceC1491a a(Class cls, InterfaceC1480d interfaceC1480d) {
        this.f13827a.put(cls, interfaceC1480d);
        this.f13828b.remove(cls);
        return this;
    }
}
