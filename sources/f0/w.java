package F0;

import N.C0095h;
import N.V;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.C0955d;
import s.AbstractC1282d;
import s.C1280b;
import s.C1283e;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements Cloneable {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Animator[] f565W = new Animator[0];

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int[] f566X = {2, 1, 3, 4};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final P2.e f567Y = new P2.e();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final ThreadLocal f568Z = new ThreadLocal();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f575G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f576H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public u[] f577I;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public com.bumptech.glide.c f586R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f588T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0032t f589U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f590V;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f591w = getClass().getName();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f592x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f593y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TimeInterpolator f594z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f569A = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f570B = new ArrayList();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public P0.h f571C = new P0.h(6);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public P0.h f572D = new P0.h(6);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C f573E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int[] f574F = f566X;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ArrayList f578J = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Animator[] f579K = f565W;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f580L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f581M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f582N = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public w f583O = null;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList f584P = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayList f585Q = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public P2.e f587S = f567Y;

    public static boolean A(F f6, F f7, String str) {
        Object obj = f6.f483a.get(str);
        Object obj2 = f7.f483a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void e(P0.h hVar, View view, F f6) {
        ((C1280b) hVar.f2407a).put(view, f6);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) hVar.f2408b).indexOfKey(id) >= 0) {
                ((SparseArray) hVar.f2408b).put(id, null);
            } else {
                ((SparseArray) hVar.f2408b).put(id, view);
            }
        }
        WeakHashMap weakHashMap = V.f1964a;
        String strK = N.I.k(view);
        if (strK != null) {
            if (((C1280b) hVar.f2410d).containsKey(strK)) {
                ((C1280b) hVar.f2410d).put(strK, null);
            } else {
                ((C1280b) hVar.f2410d).put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1283e c1283e = (C1283e) hVar.f2409c;
                if (c1283e.f12507w) {
                    c1283e.e();
                }
                if (AbstractC1282d.b(c1283e.f12508x, c1283e.f12510z, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ((C1283e) hVar.f2409c).i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ((C1283e) hVar.f2409c).f(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ((C1283e) hVar.f2409c).i(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C1280b t() {
        ThreadLocal threadLocal = f568Z;
        C1280b c1280b = (C1280b) threadLocal.get();
        if (c1280b != null) {
            return c1280b;
        }
        C1280b c1280b2 = new C1280b();
        threadLocal.set(c1280b2);
        return c1280b2;
    }

    public final void B(w wVar, C0095h c0095h, boolean z5) {
        w wVar2 = this.f583O;
        if (wVar2 != null) {
            wVar2.B(wVar, c0095h, z5);
        }
        ArrayList arrayList = this.f584P;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f584P.size();
        u[] uVarArr = this.f577I;
        if (uVarArr == null) {
            uVarArr = new u[size];
        }
        this.f577I = null;
        u[] uVarArr2 = (u[]) this.f584P.toArray(uVarArr);
        for (int i6 = 0; i6 < size; i6++) {
            u uVar = uVarArr2[i6];
            switch (c0095h.f1989w) {
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    uVar.f(wVar);
                    break;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    uVar.a(wVar);
                    break;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    uVar.b(wVar);
                    break;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    uVar.c();
                    break;
                default:
                    uVar.e();
                    break;
            }
            uVarArr2[i6] = null;
        }
        this.f577I = uVarArr2;
    }

    public final void C(C0095h c0095h) {
        B(this, c0095h, false);
    }

    public void D(View view) {
        if (this.f582N) {
            return;
        }
        ArrayList arrayList = this.f578J;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f579K);
        this.f579K = f565W;
        for (int i6 = size - 1; i6 >= 0; i6--) {
            Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            animator.pause();
        }
        this.f579K = animatorArr;
        B(this, v.f563d, false);
        this.f581M = true;
    }

    public void E() {
        C1280b c1280bT = t();
        this.f588T = 0L;
        for (int i6 = 0; i6 < this.f585Q.size(); i6++) {
            Animator animator = (Animator) this.f585Q.get(i6);
            C0030q c0030q = (C0030q) c1280bT.getOrDefault(animator, null);
            if (animator != null && c0030q != null) {
                long j6 = this.f593y;
                Animator animator2 = c0030q.f551f;
                if (j6 >= 0) {
                    animator2.setDuration(j6);
                }
                long j7 = this.f592x;
                if (j7 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j7);
                }
                TimeInterpolator timeInterpolator = this.f594z;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f578J.add(animator);
                this.f588T = Math.max(this.f588T, r.a(animator));
            }
        }
        this.f585Q.clear();
    }

    public w F(u uVar) {
        w wVar;
        ArrayList arrayList = this.f584P;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(uVar) && (wVar = this.f583O) != null) {
            wVar.F(uVar);
        }
        if (this.f584P.size() == 0) {
            this.f584P = null;
        }
        return this;
    }

    public void G(View view) {
        this.f570B.remove(view);
    }

    public void H(ViewGroup viewGroup) {
        if (this.f581M) {
            if (!this.f582N) {
                ArrayList arrayList = this.f578J;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f579K);
                this.f579K = f565W;
                for (int i6 = size - 1; i6 >= 0; i6--) {
                    Animator animator = animatorArr[i6];
                    animatorArr[i6] = null;
                    animator.resume();
                }
                this.f579K = animatorArr;
                B(this, v.f564e, false);
            }
            this.f581M = false;
        }
    }

    public void I() {
        Q();
        C1280b c1280bT = t();
        for (Animator animator : this.f585Q) {
            if (c1280bT.containsKey(animator)) {
                Q();
                if (animator != null) {
                    animator.addListener(new C0029p(this, 0, c1280bT));
                    long j6 = this.f593y;
                    if (j6 >= 0) {
                        animator.setDuration(j6);
                    }
                    long j7 = this.f592x;
                    if (j7 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j7);
                    }
                    TimeInterpolator timeInterpolator = this.f594z;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0955d(1, this));
                    animator.start();
                }
            }
        }
        this.f585Q.clear();
        q();
    }

    public void J(long j6, long j7) {
        long j8 = this.f588T;
        boolean z5 = j6 < j7;
        if ((j7 < 0 && j6 >= 0) || (j7 > j8 && j6 <= j8)) {
            this.f582N = false;
            B(this, v.f560a, z5);
        }
        ArrayList arrayList = this.f578J;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f579K);
        this.f579K = f565W;
        for (int i6 = 0; i6 < size; i6++) {
            Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            r.b(animator, Math.min(Math.max(0L, j6), r.a(animator)));
        }
        this.f579K = animatorArr;
        if ((j6 <= j8 || j7 > j8) && (j6 >= 0 || j7 < 0)) {
            return;
        }
        if (j6 > j8) {
            this.f582N = true;
        }
        B(this, v.f561b, z5);
    }

    public void K(long j6) {
        this.f593y = j6;
    }

    public void L(com.bumptech.glide.c cVar) {
        this.f586R = cVar;
    }

    public void M(TimeInterpolator timeInterpolator) {
        this.f594z = timeInterpolator;
    }

    public void N(P2.e eVar) {
        if (eVar == null) {
            eVar = f567Y;
        }
        this.f587S = eVar;
    }

    public void P(long j6) {
        this.f592x = j6;
    }

    public final void Q() {
        if (this.f580L == 0) {
            C(v.f560a);
            this.f582N = false;
        }
        this.f580L++;
    }

    public String R(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f593y != -1) {
            sb.append("dur(");
            sb.append(this.f593y);
            sb.append(") ");
        }
        if (this.f592x != -1) {
            sb.append("dly(");
            sb.append(this.f592x);
            sb.append(") ");
        }
        if (this.f594z != null) {
            sb.append("interp(");
            sb.append(this.f594z);
            sb.append(") ");
        }
        ArrayList arrayList = this.f569A;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f570B;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i6));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i7));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(u uVar) {
        if (this.f584P == null) {
            this.f584P = new ArrayList();
        }
        this.f584P.add(uVar);
    }

    public void cancel() {
        ArrayList arrayList = this.f578J;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f579K);
        this.f579K = f565W;
        for (int i6 = size - 1; i6 >= 0; i6--) {
            Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            animator.cancel();
        }
        this.f579K = animatorArr;
        B(this, v.f562c, false);
    }

    public void d(View view) {
        this.f570B.add(view);
    }

    public abstract void f(F f6);

    public final void i(View view, boolean z5) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            F f6 = new F(view);
            if (z5) {
                k(f6);
            } else {
                f(f6);
            }
            f6.f485c.add(this);
            j(f6);
            e(z5 ? this.f571C : this.f572D, view, f6);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                i(viewGroup.getChildAt(i6), z5);
            }
        }
    }

    public abstract void k(F f6);

    public final void l(ViewGroup viewGroup, boolean z5) {
        m(z5);
        ArrayList arrayList = this.f569A;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f570B;
        if (size <= 0 && arrayList2.size() <= 0) {
            i(viewGroup, z5);
            return;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i6)).intValue());
            if (viewFindViewById != null) {
                F f6 = new F(viewFindViewById);
                if (z5) {
                    k(f6);
                } else {
                    f(f6);
                }
                f6.f485c.add(this);
                j(f6);
                e(z5 ? this.f571C : this.f572D, viewFindViewById, f6);
            }
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            View view = (View) arrayList2.get(i7);
            F f7 = new F(view);
            if (z5) {
                k(f7);
            } else {
                f(f7);
            }
            f7.f485c.add(this);
            j(f7);
            e(z5 ? this.f571C : this.f572D, view, f7);
        }
    }

    public final void m(boolean z5) {
        P0.h hVar;
        if (z5) {
            ((C1280b) this.f571C.f2407a).clear();
            ((SparseArray) this.f571C.f2408b).clear();
            hVar = this.f571C;
        } else {
            ((C1280b) this.f572D.f2407a).clear();
            ((SparseArray) this.f572D.f2408b).clear();
            hVar = this.f572D;
        }
        ((C1283e) hVar.f2409c).a();
    }

    @Override // 
    /* JADX INFO: renamed from: n */
    public w clone() {
        try {
            w wVar = (w) super.clone();
            wVar.f585Q = new ArrayList();
            wVar.f571C = new P0.h(6);
            wVar.f572D = new P0.h(6);
            wVar.f575G = null;
            wVar.f576H = null;
            wVar.f589U = null;
            wVar.f583O = this;
            wVar.f584P = null;
            return wVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public Animator o(ViewGroup viewGroup, F f6, F f7) {
        return null;
    }

    public void p(ViewGroup viewGroup, P0.h hVar, P0.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i6;
        View view;
        F f6;
        Animator animator;
        Animator animator2;
        F f7;
        C1280b c1280bT = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z5 = s().f589U != null;
        int i7 = 0;
        while (i7 < size) {
            F f8 = (F) arrayList.get(i7);
            F f9 = (F) arrayList2.get(i7);
            if (f8 != null && !f8.f485c.contains(this)) {
                f8 = null;
            }
            if (f9 != null && !f9.f485c.contains(this)) {
                f9 = null;
            }
            if ((f8 != null || f9 != null) && (f8 == null || f9 == null || y(f8, f9))) {
                Animator animatorO = o(viewGroup, f8, f9);
                if (animatorO != null) {
                    String str = this.f591w;
                    if (f9 != null) {
                        String[] strArrU = u();
                        view = f9.f484b;
                        if (strArrU != null && strArrU.length > 0) {
                            f7 = new F(view);
                            i6 = size;
                            F f10 = (F) ((C1280b) hVar2.f2407a).getOrDefault(view, null);
                            if (f10 != null) {
                                int i8 = 0;
                                while (i8 < strArrU.length) {
                                    HashMap map = f7.f483a;
                                    String str2 = strArrU[i8];
                                    map.put(str2, f10.f483a.get(str2));
                                    i8++;
                                    strArrU = strArrU;
                                }
                            }
                            int i9 = c1280bT.f12534y;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= i9) {
                                    animator2 = animatorO;
                                    break;
                                }
                                C0030q c0030q = (C0030q) c1280bT.getOrDefault((Animator) c1280bT.h(i10), null);
                                if (c0030q.f548c != null && c0030q.f546a == view && c0030q.f547b.equals(str) && c0030q.f548c.equals(f7)) {
                                    animator2 = null;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            i6 = size;
                            animator2 = animatorO;
                            f7 = null;
                        }
                        animator = animator2;
                        f6 = f7;
                    } else {
                        i6 = size;
                        view = f8.f484b;
                        f6 = null;
                        animator = animatorO;
                    }
                    if (animator != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C0030q c0030q2 = new C0030q();
                        c0030q2.f546a = view;
                        c0030q2.f547b = str;
                        c0030q2.f548c = f6;
                        c0030q2.f549d = windowId;
                        c0030q2.f550e = this;
                        c0030q2.f551f = animator;
                        Object obj = animator;
                        if (z5) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            obj = animatorSet;
                        }
                        c1280bT.put(obj, c0030q2);
                        this.f585Q.add(obj);
                    }
                }
                i7++;
                size = i6;
            }
            i6 = size;
            i7++;
            size = i6;
        }
        if (sparseIntArray.size() != 0) {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                C0030q c0030q3 = (C0030q) c1280bT.getOrDefault((Animator) this.f585Q.get(sparseIntArray.keyAt(i11)), null);
                c0030q3.f551f.setStartDelay(c0030q3.f551f.getStartDelay() + (((long) sparseIntArray.valueAt(i11)) - Long.MAX_VALUE));
            }
        }
    }

    public final void q() {
        int i6 = this.f580L - 1;
        this.f580L = i6;
        if (i6 == 0) {
            B(this, v.f561b, false);
            for (int i7 = 0; i7 < ((C1283e) this.f571C.f2409c).j(); i7++) {
                View view = (View) ((C1283e) this.f571C.f2409c).k(i7);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i8 = 0; i8 < ((C1283e) this.f572D.f2409c).j(); i8++) {
                View view2 = (View) ((C1283e) this.f572D.f2409c).k(i8);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f582N = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f576H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f575G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (F0.F) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final F0.F r(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            F0.C r0 = r5.f573E
            if (r0 == 0) goto L9
            F0.F r6 = r0.r(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f575G
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f576H
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            F0.F r4 = (F0.F) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f484b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f576H
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f575G
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            F0.F r1 = (F0.F) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.w.r(android.view.View, boolean):F0.F");
    }

    public final w s() {
        C c6 = this.f573E;
        return c6 != null ? c6.s() : this;
    }

    public final String toString() {
        return R("");
    }

    public String[] u() {
        return null;
    }

    public final F v(View view, boolean z5) {
        C c6 = this.f573E;
        if (c6 != null) {
            return c6.v(view, z5);
        }
        return (F) ((C1280b) (z5 ? this.f571C : this.f572D).f2407a).getOrDefault(view, null);
    }

    public boolean w() {
        return !this.f578J.isEmpty();
    }

    public boolean x() {
        return this instanceof C0019f;
    }

    public boolean y(F f6, F f7) {
        if (f6 == null || f7 == null) {
            return false;
        }
        String[] strArrU = u();
        if (strArrU == null) {
            Iterator it = f6.f483a.keySet().iterator();
            while (it.hasNext()) {
                if (A(f6, f7, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrU) {
            if (!A(f6, f7, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean z(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f569A;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f570B;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void O() {
    }

    public void j(F f6) {
    }
}
