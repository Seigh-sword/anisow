package h0;

import android.util.Log;
import android.view.ViewGroup;
import d.RunnableC0632m;
import d.RunnableC0637r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m.Z0;
import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: renamed from: h0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0748m extends D4.i implements C4.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8842A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8843x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0750o f8844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8845z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0748m(C0750o c0750o, ViewGroup viewGroup, Object obj) {
        super(0);
        this.f8844y = c0750o;
        this.f8842A = viewGroup;
        this.f8845z = obj;
    }

    public final void a() {
        int i6 = this.f8843x;
        ViewGroup viewGroup = this.f8842A;
        Object obj = this.f8845z;
        C0750o c0750o = this.f8844y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0750o.f8861f.e(viewGroup, obj);
                break;
            default:
                List list = c0750o.f8858c;
                boolean z5 = list instanceof Collection;
                l0 l0Var = c0750o.f8861f;
                if (!z5 || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((s0) ((C0751p) it.next()).f1668w).f8892g) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            Z0 z02 = new Z0();
                            l0Var.u(((s0) ((C0751p) c0750o.f8858c.get(0)).f1668w).f8888c, obj, z02, new RunnableC0632m(7, c0750o));
                            z02.a();
                            break;
                        }
                    }
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                Object obj2 = c0750o.f8871p;
                AbstractC1305a.l(obj2);
                l0Var.d(new RunnableC0637r(c0750o, 4, viewGroup), obj2);
                break;
        }
    }

    @Override // C4.a
    public final /* bridge */ /* synthetic */ Object b() {
        C1316l c1316l = C1316l.f12640a;
        switch (this.f8843x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                a();
                break;
            default:
                a();
                break;
        }
        return c1316l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0748m(C0750o c0750o, Object obj, ViewGroup viewGroup) {
        super(0);
        this.f8844y = c0750o;
        this.f8845z = obj;
        this.f8842A = viewGroup;
    }
}
