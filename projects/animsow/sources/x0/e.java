package X0;

import C4.l;
import M4.B;
import M4.J;
import M4.m0;
import P4.q0;
import R4.p;
import V0.j;
import W.Q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.app.models.Post;
import com.google.android.material.card.MaterialCardView;
import com.xo.anilab.R;
import i.C0803c;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o0.C1185g;
import o0.C1193k;
import o0.C1197m;
import o0.G0;
import o0.H0;
import o0.K0;
import o0.L0;
import o0.M0;
import o0.T0;
import o0.h1;
import s1.C1299h;
import s4.AbstractC1305a;
import s4.C1316l;
import t0.AbstractC1332d;
import v0.C1390c;
import v0.W;
import v0.u0;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends W {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1193k f4505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f4506f;

    public e(H0 h02) throws InterruptedException {
        a aVar = new a(1);
        S4.e eVar = J.f1851a;
        m0 m0Var = p.f3037a;
        S4.e eVar2 = J.f1851a;
        AbstractC1305a.o(m0Var, "mainDispatcher");
        AbstractC1305a.o(eVar2, "workerDispatcher");
        this.f4505e = new C1193k(aVar, new C1390c(this), m0Var, eVar2);
        this.f13073c = 3;
        this.f13071a.f();
        this.f13071a.registerObserver(new L0(0, this));
        f(new M0(this));
        this.f4506f = h02;
    }

    public static final void e(e eVar) {
        if (eVar.f13073c != 3 || eVar.f4504d) {
            return;
        }
        eVar.f4504d = true;
        eVar.f13073c = 1;
        eVar.f13071a.f();
    }

    @Override // v0.W
    public final int a() {
        C1193k c1193k = this.f4505e;
        h1 h1Var = (h1) c1193k.f11978f.get();
        return h1Var != null ? ((G0) h1Var).e() : c1193k.f11979g.f11862c.e();
    }

    @Override // v0.W
    public final /* bridge */ /* synthetic */ long b(int i6) {
        return -1L;
    }

    @Override // v0.W
    public final void c(u0 u0Var, int i6) {
        Object value;
        Object value2;
        Object value3;
        f fVar = (f) u0Var;
        C1193k c1193k = this.f4505e;
        q0 q0Var = c1193k.f11976d;
        do {
            try {
                value2 = q0Var.getValue();
                ((Boolean) value2).getClass();
            } catch (Throwable th) {
                do {
                    value = q0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!q0Var.j(value, Boolean.FALSE));
                throw th;
            }
        } while (!q0Var.j(value2, Boolean.TRUE));
        c1193k.f11977e = i6;
        h1 h1Var = (h1) c1193k.f11978f.get();
        Object objA = h1Var != null ? B.a(h1Var, i6) : c1193k.f11979g.b(i6);
        do {
            value3 = q0Var.getValue();
            ((Boolean) value3).getClass();
        } while (!q0Var.j(value3, Boolean.FALSE));
        Post post = (Post) objA;
        if (post == null) {
            return;
        }
        P0.h hVar = fVar.f4508u;
        int i7 = 1;
        ((j) AbstractC1332d.x0((ImageView) hVar.f2410d).s(post.getPoster()).x(new C1299h(0), true)).E((ImageView) hVar.f2410d);
        ((ImageView) hVar.f2410d).setClipToOutline(true);
        ((TextView) hVar.f2408b).setText(post.getAge());
        LinearLayout linearLayout = (LinearLayout) hVar.f2409c;
        AbstractC1305a.n(linearLayout, "ageBlock");
        String age = post.getAge();
        AbstractC1332d.v0(linearLayout, !(age == null || K4.h.d0(age)));
        ((MaterialCardView) hVar.f2407a).setOnClickListener(new b(fVar, post, i7));
    }

    @Override // v0.W
    public final u0 d(RecyclerView recyclerView) {
        AbstractC1305a.o(recyclerView, "parent");
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_post, (ViewGroup) recyclerView, false);
        int i6 = R.id.age;
        TextView textView = (TextView) AbstractC1332d.E(viewInflate, R.id.age);
        if (textView != null) {
            i6 = R.id.ageBlock;
            LinearLayout linearLayout = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.ageBlock);
            if (linearLayout != null) {
                i6 = R.id.image;
                ImageView imageView = (ImageView) AbstractC1332d.E(viewInflate, R.id.image);
                if (imageView != null) {
                    return new f(new P0.h((MaterialCardView) viewInflate, textView, linearLayout, imageView), this.f4506f);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    public final void f(l lVar) throws InterruptedException {
        C1193k c1193k = this.f4505e;
        c1193k.getClass();
        AtomicReference atomicReference = c1193k.f11981i;
        if (atomicReference.get() == null) {
            Q q5 = c1193k.f11983k;
            AbstractC1305a.o(q5, "listener");
            atomicReference.set(q5);
            C1185g c1185g = c1193k.f11979g;
            c1185g.getClass();
            C0803c c0803c = c1185g.f11863d;
            c0803c.getClass();
            ((CopyOnWriteArrayList) c0803c.f9277x).add(q5);
            C1197m c1197m = (C1197m) ((q0) ((P4.W) c0803c.f9278y)).getValue();
            if (c1197m != null) {
                q5.j(c1197m);
            }
        }
        c1193k.f11982j.add(lVar);
    }

    public final Object g(K0 k02, InterfaceC1427e interfaceC1427e) {
        C1193k c1193k = this.f4505e;
        c1193k.f11980h.incrementAndGet();
        C1185g c1185g = c1193k.f11979g;
        c1185g.getClass();
        Object objA = c1185g.f11865f.a(0, new T0(c1185g, k02, null), interfaceC1427e);
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        C1316l c1316l = C1316l.f12640a;
        if (objA != enumC1481a) {
            objA = c1316l;
        }
        if (objA != enumC1481a) {
            objA = c1316l;
        }
        return objA == enumC1481a ? objA : c1316l;
    }
}
