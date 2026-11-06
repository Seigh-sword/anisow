package j;

import I0.k;
import I0.l;
import I0.o;
import I0.x;
import N.V;
import R0.i;
import T.g;
import V.e;
import W1.C0217k;
import Z.j;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.E;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c1.t;
import com.android.app.activities.HomeActivity;
import com.google.android.gms.internal.measurement.C0396c2;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.xo.anilab.R;
import d.AbstractC0628i;
import h0.DialogInterfaceOnCancelListenerC0756v;
import h0.W;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l1.C0928b;
import l1.C0929c;
import m.C0977o;
import m.C0995x0;
import m.RunnableC0969k;
import m2.AbstractC1078w;
import m2.C1032e;
import m2.C1051k0;
import m2.C1052k1;
import m2.G0;
import m2.K1;
import m2.N;
import m2.RunnableC1025b1;
import m2.RunnableC1061n1;
import m2.RunnableC1063o0;
import m2.Y0;
import o.AbstractC1162e;
import p2.C1247a;
import p3.C1251c;
import s4.AbstractC1305a;
import u1.C1358b;
import w0.AbstractC1453h;
import w0.C1454i;

/* JADX INFO: renamed from: j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0835a implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9413x;

    public /* synthetic */ RunnableC0835a(int i6, Object obj) {
        this.f9412w = i6;
        this.f9413x = obj;
    }

    public final HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor cursorG = ((C1454i) this.f9413x).f13507c.g(new C0396c2("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (cursorG.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorG.getInt(0)));
            } catch (Throwable th) {
                cursorG.close();
                throw th;
            }
        }
        cursorG.close();
        if (!hashSet.isEmpty()) {
            ((C1454i) this.f9413x).f13510f.l();
        }
        return hashSet;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        C0977o c0977o;
        Object obj;
        k kVar;
        int i6 = 2;
        HashSet hashSetA = null;
        switch (this.f9412w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0837c abstractC0837c = (AbstractC0837c) this.f9413x;
                abstractC0837c.a(true);
                abstractC0837c.invalidateSelf();
                return;
            case 1:
                C0995x0 c0995x0 = (C0995x0) this.f9413x;
                c0995x0.f10416H = null;
                c0995x0.drawableStateChanged();
                return;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f9413x;
                if (searchView$SearchAutoComplete.f5216B) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f5216B = false;
                    return;
                }
                return;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                ActionMenuView actionMenuView = ((Toolbar) this.f9413x).f5257w;
                if (actionMenuView == null || (c0977o = actionMenuView.f5193P) == null) {
                    return;
                }
                c0977o.o();
                return;
            case j.LONG_FIELD_NUMBER /* 4 */:
                g gVar = (g) this.f9413x;
                if (gVar.f3361K) {
                    if (gVar.f3359I) {
                        gVar.f3359I = false;
                        T.a aVar = gVar.f3364w;
                        aVar.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3345e = jCurrentAnimationTimeMillis;
                        aVar.f3347g = -1L;
                        aVar.f3346f = jCurrentAnimationTimeMillis;
                        aVar.f3348h = 0.5f;
                    }
                    T.a aVar2 = gVar.f3364w;
                    if ((aVar2.f3347g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f3347g + ((long) aVar2.f3349i)) || !gVar.f()) {
                        gVar.f3361K = false;
                        return;
                    }
                    if (gVar.f3360J) {
                        gVar.f3360J = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        gVar.f3366y.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f3346f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j6 = jCurrentAnimationTimeMillis2 - aVar2.f3346f;
                    aVar2.f3346f = jCurrentAnimationTimeMillis2;
                    gVar.f3363M.scrollListBy((int) (j6 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f3344d));
                    View view = gVar.f3366y;
                    WeakHashMap weakHashMap = V.f1964a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case j.STRING_FIELD_NUMBER /* 5 */:
                ((e) this.f9413x).n(0);
                return;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0628i.p(this.f9413x);
                SystemClock.uptimeMillis();
                throw null;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                DialogInterfaceOnCancelListenerC0756v dialogInterfaceOnCancelListenerC0756v = (DialogInterfaceOnCancelListenerC0756v) this.f9413x;
                dialogInterfaceOnCancelListenerC0756v.f8918w0.onDismiss(dialogInterfaceOnCancelListenerC0756v.E0);
                return;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                ((W) this.f9413x).z(true);
                return;
            case 9:
                synchronized (((E) this.f9413x).f5550a) {
                    obj = ((E) this.f9413x).f5555f;
                    ((E) this.f9413x).f5555f = E.f5549k;
                    break;
                }
                ((E) this.f9413x).g(obj);
                return;
            case 10:
                ReentrantReadWriteLock.ReadLock lock = ((C1454i) this.f9413x).f13507c.f13538h.readLock();
                try {
                    try {
                        lock.lock();
                    } finally {
                        lock.unlock();
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (IllegalStateException e7) {
                    e = e7;
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                }
                if (((C1454i) this.f9413x).a() && ((C1454i) this.f9413x).f13508d.compareAndSet(true, false) && !((B0.b) ((C1454i) this.f9413x).f13507c.f13533c.C()).f62w.inTransaction()) {
                    Object obj2 = this.f9413x;
                    if (((C1454i) obj2).f13507c.f13536f) {
                        B0.b bVar = (B0.b) ((C1454i) obj2).f13507c.f13533c.C();
                        bVar.b();
                        try {
                            hashSetA = a();
                            bVar.l();
                            bVar.c();
                        } catch (Throwable th) {
                            bVar.c();
                            throw th;
                        }
                    } else {
                        hashSetA = a();
                    }
                    lock.unlock();
                    if (hashSetA == null || hashSetA.isEmpty()) {
                        return;
                    }
                    synchronized (((C1454i) this.f9413x).f13512h) {
                        try {
                            AbstractC1162e abstractC1162e = (AbstractC1162e) ((C1454i) this.f9413x).f13512h.iterator();
                            if (abstractC1162e.hasNext()) {
                                ((AbstractC1453h) ((Map.Entry) abstractC1162e.next()).getValue()).getClass();
                                throw null;
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 11:
                Object obj3 = this.f9413x;
                try {
                    ((Worker) obj3).f5829B.j(((Worker) obj3).g());
                    return;
                } catch (Throwable th2) {
                    ((Worker) obj3).f5829B.k(th2);
                    return;
                }
            case 12:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f9413x;
                Object obj4 = constraintTrackingWorker.f5825x.f5831b.f1100a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj4 instanceof String ? (String) obj4 : null;
                if (TextUtils.isEmpty(str)) {
                    o.w().v(ConstraintTrackingWorker.f5859G, "No worker to delegate to.", new Throwable[0]);
                    kVar = new k();
                } else {
                    x xVar = constraintTrackingWorker.f5825x.f5833d;
                    Context context = constraintTrackingWorker.f5824w;
                    WorkerParameters workerParameters = constraintTrackingWorker.f5860B;
                    xVar.getClass();
                    ListenableWorker listenableWorkerA = x.a(context, str, workerParameters);
                    constraintTrackingWorker.f5864F = listenableWorkerA;
                    if (listenableWorkerA == null) {
                        o.w().u(ConstraintTrackingWorker.f5859G, "No worker to delegate to.", new Throwable[0]);
                        kVar = new k();
                    } else {
                        i iVarK = J0.k.J(constraintTrackingWorker.f5824w).f1208j.n().k(constraintTrackingWorker.f5825x.f5830a.toString());
                        if (iVarK != null) {
                            Context context2 = constraintTrackingWorker.f5824w;
                            N0.c cVar = new N0.c(context2, J0.k.J(context2).f1209k, constraintTrackingWorker);
                            cVar.b(Collections.singletonList(iVarK));
                            if (!cVar.a(constraintTrackingWorker.f5825x.f5830a.toString())) {
                                o.w().u(ConstraintTrackingWorker.f5859G, AbstractC0628i.j("Constraints not met for delegate ", str, ". Requesting retry."), new Throwable[0]);
                                constraintTrackingWorker.f5863E.j(new l());
                                return;
                            }
                            o.w().u(ConstraintTrackingWorker.f5859G, AbstractC0628i.q("Constraints met for delegate ", str), new Throwable[0]);
                            try {
                                T0.i iVarE = constraintTrackingWorker.f5864F.e();
                                iVarE.a(new RunnableC0969k(constraintTrackingWorker, 12, iVarE), constraintTrackingWorker.f5825x.f5832c);
                                return;
                            } catch (Throwable th3) {
                                o oVarW = o.w();
                                String str2 = ConstraintTrackingWorker.f5859G;
                                oVarW.u(str2, AbstractC0628i.j("Delegated worker ", str, " threw exception in startWork."), th3);
                                synchronized (constraintTrackingWorker.f5861C) {
                                    try {
                                        if (constraintTrackingWorker.f5862D) {
                                            o.w().u(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                                            constraintTrackingWorker.f5863E.j(new l());
                                        } else {
                                            constraintTrackingWorker.f5863E.j(new k());
                                        }
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        kVar = new k();
                    }
                }
                constraintTrackingWorker.f5863E.j(kVar);
                return;
            case 13:
                C1251c c1251c = ((HomeActivity) this.f9413x).f6271c0;
                if (c1251c != null) {
                    ((BottomNavigationView) c1251c.f12319c).setSelectedItemId(R.id.home);
                    return;
                } else {
                    AbstractC1305a.W("binding");
                    throw null;
                }
            case 14:
                t tVar = (t) this.f9413x;
                int i7 = t.f6226I0;
                tVar.X();
                return;
            case 15:
                com.bumptech.glide.o oVar = (com.bumptech.glide.o) this.f9413x;
                oVar.f6413y.p(oVar);
                return;
            case 16:
                C0929c c0929c = (C0929c) this.f9413x;
                c0929c.getClass();
                while (true) {
                    try {
                        c0929c.b((C0928b) c0929c.f9885c.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 17:
                if (((q2.j) this.f9413x).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 18:
                RunnableC1061n1 runnableC1061n1 = (RunnableC1061n1) this.f9413x;
                C1358b c1358b = runnableC1061n1.f11040y;
                ((C1052k1) c1358b.f12823y).r();
                ((C1052k1) c1358b.f12823y).f().f10722I.d("Application going to the background");
                ((C1052k1) c1358b.f12823y).p().f10816P.a(true);
                C1052k1 c1052k1 = (C1052k1) c1358b.f12823y;
                c1052k1.r();
                c1052k1.f11017z = true;
                if (!((C1052k1) c1358b.f12823y).n().F()) {
                    boolean zD = ((C1052k1) c1358b.f12823y).n().D(null, AbstractC1078w.f11149O0);
                    long j7 = runnableC1061n1.f11039x;
                    if (zD) {
                        ((C1052k1) c1358b.f12823y).f11014B.a(false, false, j7);
                        ((C1052k1) c1358b.f12823y).f11014B.f11051c.a();
                    } else {
                        ((C1052k1) c1358b.f12823y).f11014B.f11051c.a();
                        ((C1052k1) c1358b.f12823y).f11014B.a(false, false, j7);
                    }
                }
                ((C1052k1) c1358b.f12823y).f().f10721H.c(Long.valueOf(runnableC1061n1.f11038w), "Application backgrounded at: timestamp_millis");
                C1032e c1032eN = ((C1052k1) c1358b.f12823y).n();
                m2.E e8 = AbstractC1078w.f11179c1;
                if (c1032eN.D(null, e8)) {
                    G0 g0U = ((C1052k1) c1358b.f12823y).u();
                    g0U.r();
                    g0U.y();
                    if (g0U.n().D(null, e8)) {
                        Y0 y0W = g0U.w();
                        y0W.r();
                        y0W.y();
                        if (y0W.K() && y0W.q().v0() < 242600) {
                            return;
                        }
                        Y0 y0W2 = g0U.w();
                        y0W2.r();
                        y0W2.y();
                        y0W2.B(new RunnableC1025b1(y0W2, y0W2.N(true), i6));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                C1051k0 c1051k0 = (C1051k0) this.f9413x;
                K1 k12 = c1051k0.f10986H;
                C1051k0.e(k12);
                k12.r();
                if (k12.A0() == 1) {
                    G0 g02 = c1051k0.f10990L;
                    C1051k0.d(g02);
                    new Thread(new RunnableC1063o0(g02, 3)).start();
                    return;
                } else {
                    N n5 = c1051k0.f10983E;
                    C1051k0.i(n5);
                    n5.f10718E.d("registerTrigger called but app not eligible");
                    return;
                }
            case 20:
                C1247a c1247a = (C1247a) this.f9413x;
                synchronized (c1247a.f12293a) {
                    try {
                        if (c1247a.b()) {
                            Log.e("WakeLock", String.valueOf(c1247a.f12302j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            c1247a.d();
                            if (c1247a.b()) {
                                c1247a.f12295c = 1;
                                c1247a.e();
                            }
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 21:
                C0217k c0217k = (C0217k) this.f9413x;
                c0217k.f4321c = false;
                e eVar = ((BottomSheetBehavior) c0217k.f4320b).f7064M;
                if (eVar != null && eVar.f()) {
                    c0217k.a(c0217k.f4322d);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0217k.f4320b;
                if (bottomSheetBehavior.f7063L == 2) {
                    bottomSheetBehavior.I(c0217k.f4322d);
                    return;
                }
                return;
            default:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f9413x).f7374y.f3149C;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
        }
    }
}
