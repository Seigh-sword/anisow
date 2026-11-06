package F0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class C extends w {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f479c0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ArrayList f477a0 = new ArrayList();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f478b0 = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f480d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f481e0 = 0;

    @Override // F0.w
    public final void D(View view) {
        super.D(view);
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w) this.f477a0.get(i6)).D(view);
        }
    }

    @Override // F0.w
    public final void E() {
        this.f588T = 0L;
        B b6 = new B(this, 0);
        for (int i6 = 0; i6 < this.f477a0.size(); i6++) {
            w wVar = (w) this.f477a0.get(i6);
            wVar.a(b6);
            wVar.E();
            long j6 = wVar.f588T;
            if (this.f478b0) {
                this.f588T = Math.max(this.f588T, j6);
            } else {
                long j7 = this.f588T;
                wVar.f590V = j7;
                this.f588T = j7 + j6;
            }
        }
    }

    @Override // F0.w
    public final w F(u uVar) {
        super.F(uVar);
        return this;
    }

    @Override // F0.w
    public final void G(View view) {
        for (int i6 = 0; i6 < this.f477a0.size(); i6++) {
            ((w) this.f477a0.get(i6)).G(view);
        }
        this.f570B.remove(view);
    }

    @Override // F0.w
    public final void H(ViewGroup viewGroup) {
        super.H(viewGroup);
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w) this.f477a0.get(i6)).H(viewGroup);
        }
    }

    @Override // F0.w
    public final void I() {
        if (this.f477a0.isEmpty()) {
            Q();
            q();
            return;
        }
        B b6 = new B(this, 1);
        Iterator it = this.f477a0.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(b6);
        }
        this.f479c0 = this.f477a0.size();
        if (this.f478b0) {
            Iterator it2 = this.f477a0.iterator();
            while (it2.hasNext()) {
                ((w) it2.next()).I();
            }
            return;
        }
        for (int i6 = 1; i6 < this.f477a0.size(); i6++) {
            ((w) this.f477a0.get(i6 - 1)).a(new y(this, 1, (w) this.f477a0.get(i6)));
        }
        w wVar = (w) this.f477a0.get(0);
        if (wVar != null) {
            wVar.I();
        }
    }

    @Override // F0.w
    public final void J(long j6, long j7) {
        long j8 = this.f588T;
        if (this.f573E != null) {
            if (j6 < 0 && j7 < 0) {
                return;
            }
            if (j6 > j8 && j7 > j8) {
                return;
            }
        }
        boolean z5 = j6 < j7;
        if ((j6 >= 0 && j7 < 0) || (j6 <= j8 && j7 > j8)) {
            this.f582N = false;
            B(this, v.f560a, z5);
        }
        if (this.f478b0) {
            for (int i6 = 0; i6 < this.f477a0.size(); i6++) {
                ((w) this.f477a0.get(i6)).J(j6, j7);
            }
        } else {
            int size = 1;
            while (true) {
                if (size >= this.f477a0.size()) {
                    size = this.f477a0.size();
                    break;
                } else if (((w) this.f477a0.get(size)).f590V > j7) {
                    break;
                } else {
                    size++;
                }
            }
            int i7 = size - 1;
            if (j6 >= j7) {
                while (i7 < this.f477a0.size()) {
                    w wVar = (w) this.f477a0.get(i7);
                    long j9 = wVar.f590V;
                    int i8 = i7;
                    long j10 = j6 - j9;
                    if (j10 < 0) {
                        break;
                    }
                    wVar.J(j10, j7 - j9);
                    i7 = i8 + 1;
                }
            } else {
                while (i7 >= 0) {
                    w wVar2 = (w) this.f477a0.get(i7);
                    long j11 = wVar2.f590V;
                    long j12 = j6 - j11;
                    wVar2.J(j12, j7 - j11);
                    if (j12 >= 0) {
                        break;
                    } else {
                        i7--;
                    }
                }
            }
        }
        if (this.f573E != null) {
            if ((j6 <= j8 || j7 > j8) && (j6 >= 0 || j7 < 0)) {
                return;
            }
            if (j6 > j8) {
                this.f582N = true;
            }
            B(this, v.f561b, z5);
        }
    }

    @Override // F0.w
    public final void L(com.bumptech.glide.c cVar) {
        this.f586R = cVar;
        this.f481e0 |= 8;
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w) this.f477a0.get(i6)).L(cVar);
        }
    }

    @Override // F0.w
    public final void N(P2.e eVar) {
        super.N(eVar);
        this.f481e0 |= 4;
        if (this.f477a0 != null) {
            for (int i6 = 0; i6 < this.f477a0.size(); i6++) {
                ((w) this.f477a0.get(i6)).N(eVar);
            }
        }
    }

    @Override // F0.w
    public final void O() {
        this.f481e0 |= 2;
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w) this.f477a0.get(i6)).O();
        }
    }

    @Override // F0.w
    public final void P(long j6) {
        this.f592x = j6;
    }

    @Override // F0.w
    public final String R(String str) {
        String strR = super.R(str);
        for (int i6 = 0; i6 < this.f477a0.size(); i6++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strR);
            sb.append("\n");
            sb.append(((w) this.f477a0.get(i6)).R(str + "  "));
            strR = sb.toString();
        }
        return strR;
    }

    public final void S(w wVar) {
        this.f477a0.add(wVar);
        wVar.f573E = this;
        long j6 = this.f593y;
        if (j6 >= 0) {
            wVar.K(j6);
        }
        if ((this.f481e0 & 1) != 0) {
            wVar.M(this.f594z);
        }
        if ((this.f481e0 & 2) != 0) {
            wVar.O();
        }
        if ((this.f481e0 & 4) != 0) {
            wVar.N(this.f587S);
        }
        if ((this.f481e0 & 8) != 0) {
            wVar.L(this.f586R);
        }
    }

    public final w T(int i6) {
        if (i6 < 0 || i6 >= this.f477a0.size()) {
            return null;
        }
        return (w) this.f477a0.get(i6);
    }

    @Override // F0.w
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void K(long j6) {
        ArrayList arrayList;
        this.f593y = j6;
        if (j6 < 0 || (arrayList = this.f477a0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w) this.f477a0.get(i6)).K(j6);
        }
    }

    @Override // F0.w
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void M(TimeInterpolator timeInterpolator) {
        this.f481e0 |= 1;
        ArrayList arrayList = this.f477a0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((w) this.f477a0.get(i6)).M(timeInterpolator);
            }
        }
        this.f594z = timeInterpolator;
    }

    public final void W(int i6) {
        if (i6 == 0) {
            this.f478b0 = true;
        } else {
            if (i6 != 1) {
                throw new AndroidRuntimeException(AbstractC0628i.f("Invalid parameter for TransitionSet ordering: ", i6));
            }
            this.f478b0 = false;
        }
    }

    @Override // F0.w
    public final void a(u uVar) {
        super.a(uVar);
    }

    @Override // F0.w
    public final void cancel() {
        super.cancel();
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w) this.f477a0.get(i6)).cancel();
        }
    }

    @Override // F0.w
    public final void d(View view) {
        for (int i6 = 0; i6 < this.f477a0.size(); i6++) {
            ((w) this.f477a0.get(i6)).d(view);
        }
        this.f570B.add(view);
    }

    @Override // F0.w
    public final void f(F f6) {
        if (z(f6.f484b)) {
            for (w wVar : this.f477a0) {
                if (wVar.z(f6.f484b)) {
                    wVar.f(f6);
                    f6.f485c.add(wVar);
                }
            }
        }
    }

    @Override // F0.w
    public final void j(F f6) {
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w) this.f477a0.get(i6)).j(f6);
        }
    }

    @Override // F0.w
    public final void k(F f6) {
        if (z(f6.f484b)) {
            for (w wVar : this.f477a0) {
                if (wVar.z(f6.f484b)) {
                    wVar.k(f6);
                    f6.f485c.add(wVar);
                }
            }
        }
    }

    @Override // F0.w
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final w clone() {
        C c6 = (C) super.clone();
        c6.f477a0 = new ArrayList();
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            w wVarClone = ((w) this.f477a0.get(i6)).clone();
            c6.f477a0.add(wVarClone);
            wVarClone.f573E = c6;
        }
        return c6;
    }

    @Override // F0.w
    public final void p(ViewGroup viewGroup, P0.h hVar, P0.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j6 = this.f592x;
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            w wVar = (w) this.f477a0.get(i6);
            if (j6 > 0 && (this.f478b0 || i6 == 0)) {
                long j7 = wVar.f592x;
                if (j7 > 0) {
                    wVar.P(j7 + j6);
                } else {
                    wVar.P(j6);
                }
            }
            wVar.p(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    @Override // F0.w
    public final boolean w() {
        for (int i6 = 0; i6 < this.f477a0.size(); i6++) {
            if (((w) this.f477a0.get(i6)).w()) {
                return true;
            }
        }
        return false;
    }

    @Override // F0.w
    public final boolean x() {
        int size = this.f477a0.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!((w) this.f477a0.get(i6)).x()) {
                return false;
            }
        }
        return true;
    }
}
