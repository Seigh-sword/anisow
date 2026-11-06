package d;

import D.AbstractC0005f;
import D.AbstractC0007h;
import D.C0006g;
import J3.J;
import W1.C0217k;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.L;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import h0.AbstractComponentCallbacksC0734B;
import h0.C0750o;
import h0.C0751p;
import h0.W;
import h0.e0;
import h0.s0;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import l3.C0941d;
import m.RunnableC0969k;
import p3.C1251c;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0632m implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8110x;

    public /* synthetic */ RunnableC0632m(int i6, Object obj) {
        this.f8109w = i6;
        this.f8110x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        long j6;
        int i6 = 2;
        Map mapUnmodifiableMap = null;
        switch (this.f8109w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ViewTreeObserverOnDrawListenerC0633n viewTreeObserverOnDrawListenerC0633n = (ViewTreeObserverOnDrawListenerC0633n) this.f8110x;
                AbstractC1305a.o(viewTreeObserverOnDrawListenerC0633n, "this$0");
                Runnable runnable = viewTreeObserverOnDrawListenerC0633n.f8112x;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0633n.f8112x = null;
                    return;
                }
                return;
            case 1:
                DialogC0639t.a((DialogC0639t) this.f8110x);
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
            case 14:
            default:
                Y4.e eVar = (Y4.e) this.f8110x;
                ThreadPoolExecutor threadPoolExecutor = Y4.e.f4876g;
                eVar.getClass();
                while (true) {
                    long jNanoTime = System.nanoTime();
                    synchronized (eVar) {
                        try {
                            long j7 = Long.MIN_VALUE;
                            int i7 = 0;
                            int i8 = 0;
                            Y4.d dVar = null;
                            for (Y4.d dVar2 : eVar.f4880d) {
                                if (eVar.b(dVar2, jNanoTime) > 0) {
                                    i8++;
                                } else {
                                    i7++;
                                    long j8 = jNanoTime - dVar2.f4875q;
                                    if (j8 > j7) {
                                        dVar = dVar2;
                                        j7 = j8;
                                    }
                                }
                                break;
                            }
                            j6 = eVar.f4878b;
                            if (j7 >= j6 || i7 > eVar.f4877a) {
                                eVar.f4880d.remove(dVar);
                                W4.b.d(dVar.f4863e);
                                j6 = 0;
                            } else if (i7 > 0) {
                                j6 -= j7;
                            } else if (i8 <= 0) {
                                eVar.f4882f = false;
                                j6 = -1;
                            }
                        } finally {
                        }
                    }
                    if (j6 == -1) {
                        return;
                    }
                    if (j6 > 0) {
                        long j9 = j6 / 1000000;
                        long j10 = j6 - (1000000 * j9);
                        synchronized (eVar) {
                            try {
                                eVar.wait(j9, (int) j10);
                                break;
                            } catch (InterruptedException unused) {
                            }
                            break;
                        }
                    }
                }
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                Activity activity = (Activity) this.f8110x;
                int i9 = AbstractC0005f.f190b;
                if (activity.isFinishing()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    Class cls = AbstractC0007h.f197a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0007h.f197a;
                boolean z5 = i10 == 26 || i10 == 27;
                Method method = AbstractC0007h.f202f;
                if ((!z5 || method != null) && (AbstractC0007h.f201e != null || AbstractC0007h.f200d != null)) {
                    try {
                        Object obj2 = AbstractC0007h.f199c.get(activity);
                        if (obj2 != null && (obj = AbstractC0007h.f198b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0006g c0006g = new C0006g(activity);
                            application.registerActivityLifecycleCallbacks(c0006g);
                            Handler handler = AbstractC0007h.f203g;
                            handler.post(new RunnableC0969k(c0006g, obj2, i6));
                            int i11 = 3;
                            try {
                                if (i10 == 26 || i10 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC0969k(application, c0006g, i11));
                                return;
                            } catch (Throwable th) {
                                handler.post(new RunnableC0969k(application, c0006g, i11));
                                throw th;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                activity.recreate();
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                View view = (View) this.f8110x;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                D4.r rVar = (D4.r) this.f8110x;
                AbstractC1305a.o(rVar, "$seekCancelLambda");
                C4.a aVar = (C4.a) rVar.f377w;
                if (aVar != null) {
                    aVar.b();
                    return;
                }
                return;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ArrayList arrayList = (ArrayList) this.f8110x;
                AbstractC1305a.o(arrayList, "$transitioningViews");
                e0.a(4, arrayList);
                return;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                C0750o c0750o = (C0750o) this.f8110x;
                AbstractC1305a.o(c0750o, "this$0");
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = c0750o.f8858c.iterator();
                while (it.hasNext()) {
                    ((s0) ((C0751p) it.next()).f1668w).c(c0750o);
                }
                return;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = (AbstractComponentCallbacksC0734B) this.f8110x;
                abstractComponentCallbacksC0734B.f8628m0.f8847B.b(abstractComponentCallbacksC0734B.f8637z);
                abstractComponentCallbacksC0734B.f8637z = null;
                return;
            case 9:
                Iterator it2 = ((W) this.f8110x).f8708n.iterator();
                if (it2.hasNext()) {
                    AbstractC0628i.p(it2.next());
                    throw null;
                }
                return;
            case 10:
                L l5 = (L) this.f8110x;
                L l6 = L.f5561E;
                AbstractC1305a.o(l5, "this$0");
                if (l5.f5567x == 0) {
                    l5.f5568y = true;
                    l5.f5563B.e(EnumC0313m.ON_PAUSE);
                }
                if (l5.f5566w == 0 && l5.f5568y) {
                    l5.f5563B.e(EnumC0313m.ON_STOP);
                    l5.f5569z = true;
                    return;
                }
                return;
            case 11:
                c1.t tVar = (c1.t) this.f8110x;
                int i12 = c1.r.f6222y;
                AbstractC1305a.o(tVar, "this$0");
                W0.b bVar = tVar.f6184y0;
                if (bVar == null) {
                    AbstractC1305a.W("parentActivity");
                    throw null;
                }
                Object systemService = bVar.getSystemService("input_method");
                AbstractC1305a.m(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText = tVar.f6229C0;
                if (editText != null) {
                    inputMethodManager.showSoftInput(editText, 1);
                    return;
                } else {
                    AbstractC1305a.W("searchInput");
                    throw null;
                }
            case 12:
                M1.l lVar = (M1.l) this.f8110x;
                lVar.getClass();
                ((N1.l) lVar.f1807d).k(new J3.G(13, lVar));
                return;
            case 13:
                ((CarouselLayoutManager) this.f8110x).m0();
                return;
            case 15:
                C0217k c0217k = (C0217k) this.f8110x;
                c0217k.f4321c = false;
                V.e eVar2 = ((SideSheetBehavior) c0217k.f4320b).f7279i;
                if (eVar2 != null && eVar2.f()) {
                    c0217k.a(c0217k.f4322d);
                    return;
                }
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0217k.f4320b;
                if (sideSheetBehavior.f7278h == 2) {
                    sideSheetBehavior.w(c0217k.f4322d);
                    return;
                }
                return;
            case 16:
                ((S2.d) this.f8110x).t(true);
                return;
            case 17:
                S2.j jVar = (S2.j) this.f8110x;
                boolean zIsPopupShowing = jVar.f3133h.isPopupShowing();
                jVar.t(zIsPopupShowing);
                jVar.f3138m = zIsPopupShowing;
                return;
            case 18:
                ((TextInputLayout) this.f8110x).f7376z.requestLayout();
                return;
            case 19:
                com.bumptech.glide.k kVar = (com.bumptech.glide.k) this.f8110x;
                ((AtomicReference) kVar.f6358y).set(null);
                synchronized (kVar) {
                    try {
                        if (((AtomicMarkableReference) kVar.f6357x).isMarked()) {
                            C0941d c0941d = (C0941d) ((AtomicMarkableReference) kVar.f6357x).getReference();
                            synchronized (c0941d) {
                                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(c0941d.f10035a));
                            }
                            Object obj3 = kVar.f6357x;
                            ((AtomicMarkableReference) obj3).set((C0941d) ((AtomicMarkableReference) obj3).getReference(), false);
                        }
                    } finally {
                    }
                }
                if (mapUnmodifiableMap != null) {
                    C1251c c1251c = (C1251c) kVar.f6359z;
                    ((l3.f) c1251c.f12319c).g((String) c1251c.f12318b, mapUnmodifiableMap, kVar.f6356w);
                    return;
                }
                return;
            case 20:
                E3.c cVar = (E3.c) this.f8110x;
                Object obj4 = E3.c.f399m;
                cVar.a(false);
                return;
            case 21:
                J3.x xVar = (J3.x) this.f8110x;
                synchronized (((ArrayDeque) xVar.f1449e)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) xVar.f1446b).edit();
                    String str = (String) xVar.f1447c;
                    StringBuilder sb = new StringBuilder();
                    Iterator it3 = ((ArrayDeque) xVar.f1449e).iterator();
                    while (it3.hasNext()) {
                        sb.append((String) it3.next());
                        sb.append((String) xVar.f1448d);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
            case 22:
                J j11 = (J) this.f8110x;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + j11.f1369a.getAction() + " finishing.");
                j11.f1370b.c(null);
                return;
        }
    }
}
