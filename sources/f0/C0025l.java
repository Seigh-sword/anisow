package F0;

import java.util.ArrayList;

/* JADX INFO: renamed from: F0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0025l extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f537c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f538d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0027n f541g;

    public C0025l(C0027n c0027n, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f541g = c0027n;
        this.f535a = obj;
        this.f536b = arrayList;
        this.f539e = obj2;
        this.f540f = arrayList2;
    }

    @Override // F0.x, F0.u
    public final void a(w wVar) {
        wVar.F(this);
    }

    @Override // F0.x, F0.u
    public final void d(w wVar) {
        C0027n c0027n = this.f541g;
        Object obj = this.f535a;
        if (obj != null) {
            c0027n.z(obj, this.f536b, null);
        }
        Object obj2 = this.f537c;
        if (obj2 != null) {
            c0027n.z(obj2, this.f538d, null);
        }
        Object obj3 = this.f539e;
        if (obj3 != null) {
            c0027n.z(obj3, this.f540f, null);
        }
    }
}
