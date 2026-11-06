package K1;

import J2.i;
import J2.k;
import J3.G;
import N.C0;
import N.InterfaceC0107s;
import N.V;
import O.s;
import R2.j;
import S3.q;
import V4.K;
import W1.InterfaceC0216j;
import X1.InterfaceC0235c;
import Z0.p;
import a3.C0262c;
import a3.InterfaceC0260a;
import android.content.ContentProviderClient;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import b3.C0342b;
import c1.C0363d;
import c1.C0365f;
import c1.C0367h;
import c1.C0370k;
import c1.C0373n;
import c1.t;
import com.android.app.activities.HomeActivity;
import com.google.android.gms.internal.measurement.BinderC0454m0;
import com.google.android.gms.internal.measurement.C0466o0;
import com.google.android.gms.internal.measurement.C0472p0;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.onesignal.C0594t1;
import com.xo.anilab.R;
import h3.InterfaceC0773a;
import j3.AbstractC0857g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import l.m;
import l.o;
import m2.AbstractC1039g0;
import m2.B0;
import m2.C1033e0;
import m2.C1051k0;
import m2.C1085z0;
import m2.N;
import m2.P;
import m3.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C1243i;
import p3.C1251c;
import s.C1280b;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import y2.C1505g;
import y2.DialogC1506h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0235c, s, InterfaceC0107s, m, InterfaceC0773a, q2.h, q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f1515x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i6) {
        this(5, 5L, TimeUnit.MINUTES);
        this.f1514w = i6;
        if (i6 != 25) {
        } else {
            this.f1515x = new LinkedHashSet();
        }
    }

    public static b A(String str) {
        return new b(5, (TextUtils.isEmpty(str) || str.length() > 1) ? B0.f10493x : C1085z0.f(str.charAt(0)));
    }

    public static boolean v(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final Object B() {
        Map mapEmptyMap;
        Y1 y12 = (Y1) this.f1515x;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = y12.f6744w.acquireUnstableContentProviderClient(y12.f6745x);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(y12.f6745x, Y1.f6740E, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        mapEmptyMap = Collections.emptyMap();
                        if (cursorQuery != null) {
                        }
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return mapEmptyMap;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        mapEmptyMap = Collections.emptyMap();
                    } else {
                        Map c1280b = count <= 256 ? new C1280b(count) : new HashMap(count, 1.0f);
                        while (cursorQuery.moveToNext()) {
                            c1280b.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
                        if (cursorQuery.isAfterLast()) {
                            cursorQuery.close();
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            return c1280b;
                        }
                        Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                        mapEmptyMap = Collections.emptyMap();
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return mapEmptyMap;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e6) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e6);
                Map mapEmptyMap2 = Collections.emptyMap();
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return mapEmptyMap2;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    public final void C(int i6, String str, List list, boolean z5, boolean z6) {
        P p5;
        int i7 = AbstractC1039g0.f10911a[u.h.b(i6)];
        if (i7 == 1) {
            p5 = ((C1033e0) this.f1515x).f().f10722I;
        } else if (i7 == 2) {
            N nF = ((C1033e0) this.f1515x).f();
            p5 = z5 ? nF.f10716C : !z6 ? nF.f10717D : nF.f10715B;
        } else if (i7 != 3) {
            p5 = i7 != 4 ? ((C1033e0) this.f1515x).f().f10721H : ((C1033e0) this.f1515x).f().f10723J;
        } else {
            N nF2 = ((C1033e0) this.f1515x).f();
            p5 = z5 ? nF2.f10719F : !z6 ? nF2.f10720G : nF2.f10718E;
        }
        int size = list.size();
        if (size == 1) {
            p5.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            p5.b(list.get(0), list.get(1), str);
        } else if (size != 3) {
            p5.d(str);
        } else {
            p5.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public final boolean D() {
        if (!TextUtils.isEmpty(((C1051k0) this.f1515x).f11010x)) {
            return false;
        }
        N n5 = ((C1051k0) this.f1515x).f10983E;
        C1051k0.i(n5);
        return n5.z(3);
    }

    @Override // O.s
    public final boolean a(View view) {
        if (!((SwipeDismissBehavior) this.f1515x).v(view)) {
            return false;
        }
        WeakHashMap weakHashMap = V.f1964a;
        boolean z5 = view.getLayoutDirection() == 1;
        int i6 = ((SwipeDismissBehavior) this.f1515x).f7047e;
        view.offsetLeftAndRight((!(i6 == 0 && z5) && (i6 != 1 || z5)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        C1243i c1243i = ((SwipeDismissBehavior) this.f1515x).f7044b;
        if (c1243i != null) {
            c1243i.o(view);
        }
        return true;
    }

    public final synchronized void b(K k5) {
        ((Set) this.f1515x).remove(k5);
    }

    public final String c(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            d(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public final void d(Object obj, Writer writer) throws IOException {
        y3.d dVar = (y3.d) this.f1515x;
        y3.e eVar = new y3.e(writer, dVar.f13827a, dVar.f13828b, dVar.f13829c, dVar.f13830d);
        eVar.h(obj);
        eVar.j();
        eVar.f13832b.flush();
    }

    @Override // X1.InterfaceC0235c
    public final void e(U1.b bVar) {
        ((InterfaceC0216j) this.f1515x).e(bVar);
    }

    @Override // h3.InterfaceC0773a
    public final void f(Bundle bundle) {
        ((C0262c) ((InterfaceC0260a) this.f1515x)).a("clx", "_ae", bundle);
    }

    public final boolean g(String str) {
        String strT = t(str);
        return "1".equals(strT) || Boolean.parseBoolean(strT);
    }

    @Override // S3.q
    public final Object h() {
        try {
            return ((Constructor) this.f1515x).newInstance(new Object[0]);
        } catch (IllegalAccessException e6) {
            v0 v0Var = V3.c.f3745a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + V3.c.b((Constructor) this.f1515x) + "' with no args", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Failed to invoke constructor '" + V3.c.b((Constructor) this.f1515x) + "' with no args", e8.getCause());
        }
    }

    @Override // l.m
    public final boolean i(o oVar, MenuItem menuItem) throws Throwable {
        C0363d c0363d;
        FrameLayout frameLayout;
        C0363d c0363d2;
        k kVar = (k) this.f1515x;
        int i6 = k.f1325B;
        kVar.getClass();
        i iVar = ((k) this.f1515x).f1326A;
        if (iVar == null) {
            return false;
        }
        HomeActivity homeActivity = (HomeActivity) ((G) iVar).f1363x;
        int i7 = HomeActivity.f6270m0;
        AbstractC1305a.o(homeActivity, "this$0");
        AbstractC1305a.o(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.home) {
            AbstractC1332d.M(homeActivity);
            C0363d c0363d3 = homeActivity.f6279k0;
            C0367h c0367h = homeActivity.f6274f0;
            if (AbstractC1305a.c(c0363d3, c0367h)) {
                Y0.c cVar = c0367h.f6193A0;
                if (cVar == null) {
                    AbstractC1305a.W("binding");
                    throw null;
                }
                NestedScrollView nestedScrollView = cVar.f4781b;
                nestedScrollView.u(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), false);
                return false;
            }
            C1251c c1251c = homeActivity.f6271c0;
            if (c1251c == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout2 = (FrameLayout) c1251c.f12320d;
            AbstractC1305a.n(frameLayout2, "homeFragment");
            frameLayout2.setVisibility(0);
            C1251c c1251c2 = homeActivity.f6271c0;
            if (c1251c2 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout3 = (FrameLayout) c1251c2.f12321e;
            AbstractC1305a.n(frameLayout3, "moviesFragment");
            frameLayout3.setVisibility(8);
            C1251c c1251c3 = homeActivity.f6271c0;
            if (c1251c3 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout4 = (FrameLayout) c1251c3.f12324h;
            AbstractC1305a.n(frameLayout4, "seriesFragment");
            frameLayout4.setVisibility(8);
            C1251c c1251c4 = homeActivity.f6271c0;
            if (c1251c4 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout5 = (FrameLayout) c1251c4.f12323g;
            AbstractC1305a.n(frameLayout5, "searchFragment");
            frameLayout5.setVisibility(8);
            C1251c c1251c5 = homeActivity.f6271c0;
            if (c1251c5 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            frameLayout = (FrameLayout) c1251c5.f12322f;
            AbstractC1305a.n(frameLayout, "myListFragment");
            c0363d2 = c0367h;
        } else if (itemId == R.id.categories) {
            AbstractC1332d.M(homeActivity);
            C0363d c0363d4 = homeActivity.f6279k0;
            C0365f c0365f = homeActivity.f6275g0;
            if (AbstractC1305a.c(c0363d4, c0365f)) {
                Y0.b bVar = c0365f.f6186A0;
                if (bVar != null) {
                    bVar.f4778c.c0(0);
                    return false;
                }
                AbstractC1305a.W("binding");
                throw null;
            }
            C1251c c1251c6 = homeActivity.f6271c0;
            if (c1251c6 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout6 = (FrameLayout) c1251c6.f12320d;
            AbstractC1305a.n(frameLayout6, "homeFragment");
            frameLayout6.setVisibility(8);
            C1251c c1251c7 = homeActivity.f6271c0;
            if (c1251c7 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout7 = (FrameLayout) c1251c7.f12321e;
            AbstractC1305a.n(frameLayout7, "moviesFragment");
            frameLayout7.setVisibility(0);
            C1251c c1251c8 = homeActivity.f6271c0;
            if (c1251c8 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout8 = (FrameLayout) c1251c8.f12324h;
            AbstractC1305a.n(frameLayout8, "seriesFragment");
            frameLayout8.setVisibility(8);
            C1251c c1251c9 = homeActivity.f6271c0;
            if (c1251c9 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout9 = (FrameLayout) c1251c9.f12323g;
            AbstractC1305a.n(frameLayout9, "searchFragment");
            frameLayout9.setVisibility(8);
            C1251c c1251c10 = homeActivity.f6271c0;
            if (c1251c10 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            frameLayout = (FrameLayout) c1251c10.f12322f;
            AbstractC1305a.n(frameLayout, "myListFragment");
            c0363d2 = c0365f;
        } else {
            if (itemId != R.id.latest) {
                if (itemId == R.id.search) {
                    t tVar = homeActivity.f6277i0;
                    tVar.Y();
                    if (AbstractC1305a.c(homeActivity.f6279k0, tVar)) {
                        android.support.v4.media.b bVar2 = tVar.f6227A0;
                        if (bVar2 != null) {
                            ((RecyclerView) bVar2.f5068d).c0(0);
                            return false;
                        }
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    C1251c c1251c11 = homeActivity.f6271c0;
                    if (c1251c11 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout10 = (FrameLayout) c1251c11.f12320d;
                    AbstractC1305a.n(frameLayout10, "homeFragment");
                    frameLayout10.setVisibility(8);
                    C1251c c1251c12 = homeActivity.f6271c0;
                    if (c1251c12 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout11 = (FrameLayout) c1251c12.f12321e;
                    AbstractC1305a.n(frameLayout11, "moviesFragment");
                    frameLayout11.setVisibility(8);
                    C1251c c1251c13 = homeActivity.f6271c0;
                    if (c1251c13 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout12 = (FrameLayout) c1251c13.f12324h;
                    AbstractC1305a.n(frameLayout12, "seriesFragment");
                    frameLayout12.setVisibility(8);
                    C1251c c1251c14 = homeActivity.f6271c0;
                    if (c1251c14 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout13 = (FrameLayout) c1251c14.f12323g;
                    AbstractC1305a.n(frameLayout13, "searchFragment");
                    frameLayout13.setVisibility(0);
                    C1251c c1251c15 = homeActivity.f6271c0;
                    if (c1251c15 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout14 = (FrameLayout) c1251c15.f12322f;
                    AbstractC1305a.n(frameLayout14, "myListFragment");
                    frameLayout14.setVisibility(8);
                    c0363d = tVar;
                } else {
                    if (itemId != R.id.watchlist) {
                        return true;
                    }
                    AbstractC1332d.M(homeActivity);
                    C0373n c0373n = homeActivity.f6278j0;
                    if (c0373n.f6214D0 != null) {
                        p pVarU = c0373n.U();
                        pVarU.getClass();
                        if (((Boolean) S3.a.J(new Z0.k(pVarU, null))).booleanValue()) {
                            p pVarU2 = c0373n.U();
                            pVarU2.getClass();
                            S3.a.J(new Z0.o(pVarU2, false, null));
                            c0373n.X();
                        }
                    }
                    if (AbstractC1305a.c(homeActivity.f6279k0, c0373n)) {
                        Y0.b bVar3 = c0373n.f6211A0;
                        if (bVar3 != null) {
                            bVar3.f4778c.c0(0);
                            return false;
                        }
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    C1251c c1251c16 = homeActivity.f6271c0;
                    if (c1251c16 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout15 = (FrameLayout) c1251c16.f12320d;
                    AbstractC1305a.n(frameLayout15, "homeFragment");
                    frameLayout15.setVisibility(8);
                    C1251c c1251c17 = homeActivity.f6271c0;
                    if (c1251c17 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout16 = (FrameLayout) c1251c17.f12321e;
                    AbstractC1305a.n(frameLayout16, "moviesFragment");
                    frameLayout16.setVisibility(8);
                    C1251c c1251c18 = homeActivity.f6271c0;
                    if (c1251c18 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout17 = (FrameLayout) c1251c18.f12324h;
                    AbstractC1305a.n(frameLayout17, "seriesFragment");
                    frameLayout17.setVisibility(8);
                    C1251c c1251c19 = homeActivity.f6271c0;
                    if (c1251c19 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout18 = (FrameLayout) c1251c19.f12323g;
                    AbstractC1305a.n(frameLayout18, "searchFragment");
                    frameLayout18.setVisibility(8);
                    C1251c c1251c20 = homeActivity.f6271c0;
                    if (c1251c20 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    FrameLayout frameLayout19 = (FrameLayout) c1251c20.f12322f;
                    AbstractC1305a.n(frameLayout19, "myListFragment");
                    frameLayout19.setVisibility(0);
                    c0363d = c0373n;
                }
                homeActivity.f6279k0 = c0363d;
                return false;
            }
            AbstractC1332d.M(homeActivity);
            C0363d c0363d5 = homeActivity.f6279k0;
            C0370k c0370k = homeActivity.f6276h0;
            if (AbstractC1305a.c(c0363d5, c0370k)) {
                Y0.b bVar4 = c0370k.f6202A0;
                if (bVar4 != null) {
                    bVar4.f4778c.c0(0);
                    return false;
                }
                AbstractC1305a.W("binding");
                throw null;
            }
            C1251c c1251c21 = homeActivity.f6271c0;
            if (c1251c21 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout20 = (FrameLayout) c1251c21.f12320d;
            AbstractC1305a.n(frameLayout20, "homeFragment");
            frameLayout20.setVisibility(8);
            C1251c c1251c22 = homeActivity.f6271c0;
            if (c1251c22 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout21 = (FrameLayout) c1251c22.f12321e;
            AbstractC1305a.n(frameLayout21, "moviesFragment");
            frameLayout21.setVisibility(8);
            C1251c c1251c23 = homeActivity.f6271c0;
            if (c1251c23 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout22 = (FrameLayout) c1251c23.f12324h;
            AbstractC1305a.n(frameLayout22, "seriesFragment");
            frameLayout22.setVisibility(0);
            C1251c c1251c24 = homeActivity.f6271c0;
            if (c1251c24 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            FrameLayout frameLayout23 = (FrameLayout) c1251c24.f12323g;
            AbstractC1305a.n(frameLayout23, "searchFragment");
            frameLayout23.setVisibility(8);
            C1251c c1251c25 = homeActivity.f6271c0;
            if (c1251c25 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            frameLayout = (FrameLayout) c1251c25.f12322f;
            AbstractC1305a.n(frameLayout, "myListFragment");
            c0363d2 = c0370k;
        }
        frameLayout.setVisibility(8);
        homeActivity.f6279k0 = c0363d2;
        return false;
    }

    public final Integer k(String str) {
        String strT = t(str);
        if (TextUtils.isEmpty(strT)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strT));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + strT + ") into an int");
            return null;
        }
    }

    @Override // q2.h
    public final q2.s l(Object obj) {
        return f2.h.l(Boolean.TRUE);
    }

    public final JSONArray m(String str) {
        String strT = t(str);
        if (TextUtils.isEmpty(strT)) {
            return null;
        }
        try {
            return new JSONArray(strT);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + strT + ", falling back to default");
            return null;
        }
    }

    public final int[] n() {
        String str;
        JSONArray jSONArrayM = m("gcm.n.light_settings");
        if (jSONArrayM == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM.optInt(1);
            iArr[2] = jSONArrayM.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e6) {
            str = "LightSettings is invalid: " + jSONArrayM + ". " + e6.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + jSONArrayM + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    public final Object[] o(String str) {
        JSONArray jSONArrayM = m(str.concat("_loc_args"));
        if (jSONArrayM == null) {
            return null;
        }
        int length = jSONArrayM.length();
        String[] strArr = new String[length];
        for (int i6 = 0; i6 < length; i6++) {
            strArr[i6] = jSONArrayM.optString(i6);
        }
        return strArr;
    }

    @Override // N.InterfaceC0107s
    public final C0 p(View view, C0 c02) {
        switch (this.f1514w) {
            case 9:
                DialogC1506h dialogC1506h = (DialogC1506h) this.f1515x;
                C1505g c1505g = dialogC1506h.f13810I;
                if (c1505g != null) {
                    dialogC1506h.f13803B.f7074W.remove(c1505g);
                }
                DialogC1506h dialogC1506h2 = (DialogC1506h) this.f1515x;
                dialogC1506h2.f13810I = new C1505g(dialogC1506h2.f13806E, c02);
                DialogC1506h dialogC1506h3 = (DialogC1506h) this.f1515x;
                dialogC1506h3.f13810I.e(dialogC1506h3.getWindow());
                DialogC1506h dialogC1506h4 = (DialogC1506h) this.f1515x;
                BottomSheetBehavior bottomSheetBehavior = dialogC1506h4.f13803B;
                C1505g c1505g2 = dialogC1506h4.f13810I;
                ArrayList arrayList = bottomSheetBehavior.f7074W;
                if (!arrayList.contains(c1505g2)) {
                    arrayList.add(c1505g2);
                }
                break;
            default:
                ((j) this.f1515x).f2983m = c02.a();
                ((j) this.f1515x).f2984n = c02.b();
                ((j) this.f1515x).f2985o = c02.c();
                ((j) this.f1515x).e();
                break;
        }
        return c02;
    }

    public final String q(String str) {
        return t(str.concat("_loc_key"));
    }

    public final Long r() {
        String strT = t("gcm.n.event_time");
        if (TextUtils.isEmpty(strT)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strT));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + z("gcm.n.event_time") + "(" + strT + ") into a long");
            return null;
        }
    }

    public final String s(Resources resources, String str, String str2) {
        String strT = t(str2);
        if (!TextUtils.isEmpty(strT)) {
            return strT;
        }
        String strQ = q(str2);
        if (TextUtils.isEmpty(strQ)) {
            return null;
        }
        int identifier = resources.getIdentifier(strQ, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", z(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrO = o(str2);
        if (objArrO == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrO);
        } catch (MissingFormatArgumentException e6) {
            Log.w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(objArrO) + " Default value will be used.", e6);
            return null;
        }
    }

    public final String t(String str) {
        Bundle bundle = (Bundle) this.f1515x;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (((Bundle) this.f1515x).containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public final long[] u() {
        JSONArray jSONArrayM = m("gcm.n.vibrate_timings");
        if (jSONArrayM == null) {
            return null;
        }
        try {
            if (jSONArrayM.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM.length();
            long[] jArr = new long[length];
            for (int i6 = 0; i6 < length; i6++) {
                jArr[i6] = jSONArrayM.optLong(i6);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public final Bundle w() {
        Bundle bundle = new Bundle((Bundle) this.f1515x);
        for (String str : ((Bundle) this.f1515x).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final JSONObject x() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f1515x;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(AbstractC0857g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e6) {
                        e = e6;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        AbstractC0857g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    AbstractC0857g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            AbstractC0857g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC0857g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final void y(C0342b c0342b) {
        C0466o0 c0466o0 = (C0466o0) this.f1515x;
        c0466o0.getClass();
        synchronized (c0466o0.f6912e) {
            for (int i6 = 0; i6 < c0466o0.f6912e.size(); i6++) {
                try {
                    if (c0342b.equals(((Pair) c0466o0.f6912e.get(i6)).first)) {
                        Log.w(c0466o0.f6908a, "OnEventListener already registered.");
                        return;
                    }
                } finally {
                }
            }
            BinderC0454m0 binderC0454m0 = new BinderC0454m0(c0342b);
            c0466o0.f6912e.add(new Pair(c0342b, binderC0454m0));
            if (c0466o0.f6915h != null) {
                try {
                    c0466o0.f6915h.registerOnMeasurementEventListener(binderC0454m0);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(c0466o0.f6908a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c0466o0.b(new C0472p0(c0466o0, binderC0454m0, 2));
        }
    }

    public b(int i6, long j6, TimeUnit timeUnit) {
        this.f1514w = 24;
        this.f1515x = new Y4.e(i6, j6, timeUnit);
    }

    public /* synthetic */ b(int i6, Object obj) {
        this.f1514w = i6;
        this.f1515x = obj;
    }

    public b(Bundle bundle) {
        this.f1514w = 20;
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f1515x = new Bundle(bundle);
    }

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f1514w = 13;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f7049g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f7050h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f7047e = 0;
    }

    public b(C0594t1 c0594t1) {
        this.f1514w = 23;
        this.f1515x = c0594t1;
    }

    public b(C1051k0 c1051k0) {
        this.f1514w = 7;
        this.f1515x = c1051k0;
    }

    public b(C1251c c1251c) {
        this.f1514w = 18;
        this.f1515x = new File((File) c1251c.f12320d, "com.crashlytics.settings.json");
    }

    @Override // l.m
    public final void j(o oVar) {
    }
}
