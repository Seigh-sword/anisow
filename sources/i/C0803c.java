package i;

import P4.W;
import P4.q0;
import W.d0;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.lifecycle.AbstractC0315o;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0321v;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.C0393c;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import h0.C0733A;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import l0.AbstractC0920b;
import l0.C0921c;
import m.C0998z;
import m0.C1002c;
import m1.C1010h;
import m1.InterfaceC1006d;
import o0.C1168D;
import o0.C1169E;
import o0.C1173b;
import o0.C1197m;
import s1.C1295d;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import u1.C1360d;
import v1.InterfaceC1417a;
import w.C1437d;
import w.C1438e;
import w0.AbstractC1447b;
import z0.C1523d;

/* JADX INFO: renamed from: i.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0803c implements T.j, S.g, A0.c, InterfaceC1417a, M.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static C0803c f9275A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f9277x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f9278y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f9279z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0803c() {
        this(28);
        this.f9276w = 28;
    }

    public static C0803c J(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7) {
        return new C0803c(context, 2, context.obtainStyledAttributes(attributeSet, iArr, i6, i7));
    }

    public static final C1197m i(C0803c c0803c, C1197m c1197m, o0.H h4, o0.H h6) {
        o0.G g4;
        o0.G g6;
        o0.G g7;
        c0803c.getClass();
        o0.G g8 = o0.F.f11748c;
        if (c1197m == null || (g4 = c1197m.f12010a) == null) {
            g4 = g8;
        }
        o0.G g9 = h4.f11768a;
        o0.G gM = m(g4, g9, g9, h6 != null ? h6.f11768a : null);
        if (c1197m == null || (g6 = c1197m.f12011b) == null) {
            g6 = g8;
        }
        o0.G g10 = h6 != null ? h6.f11769b : null;
        o0.G g11 = h4.f11768a;
        o0.G gM2 = m(g6, g11, h4.f11769b, g10);
        if (c1197m != null && (g7 = c1197m.f12012c) != null) {
            g8 = g7;
        }
        return new C1197m(gM, gM2, m(g8, g11, h4.f11770c, h6 != null ? h6.f11770c : null), h4, h6);
    }

    public static o0.G m(o0.G g4, o0.G g6, o0.G g7, o0.G g8) {
        return g8 == null ? g7 : (!(g4 instanceof C1169E) || ((g6 instanceof o0.F) && (g8 instanceof o0.F)) || (g8 instanceof C1168D)) ? g8 : g4;
    }

    public final Location A(String str) {
        try {
            if (((LocationManager) this.f9278y).isProviderEnabled(str)) {
                return ((LocationManager) this.f9278y).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e6) {
            Log.d("TwilightManager", "Failed to get last known location", e6);
            return null;
        }
    }

    public final int B(int i6, int i7) {
        return ((TypedArray) this.f9278y).getResourceId(i6, i7);
    }

    public final String C(int i6) {
        return ((TypedArray) this.f9278y).getString(i6);
    }

    public final R0.e D(String str) {
        R0.e eVar;
        w0.r rVarB = w0.r.b(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            rVarB.h(1);
        } else {
            rVarB.l(1, str);
        }
        ((w0.p) this.f9277x).b();
        Cursor cursorG = ((w0.p) this.f9277x).g(rVarB);
        try {
            int iQ = f2.h.q(cursorG, "work_spec_id");
            int iQ2 = f2.h.q(cursorG, "system_id");
            if (cursorG.moveToFirst()) {
                eVar = new R0.e(cursorG.getInt(iQ2), cursorG.getString(iQ));
            } else {
                eVar = null;
            }
            return eVar;
        } finally {
            cursorG.close();
            rVarB.n();
        }
    }

    public final CharSequence E(int i6) {
        return ((TypedArray) this.f9278y).getText(i6);
    }

    public final b0 F(I4.b bVar, String str) {
        boolean zIsInstance;
        b0 b0VarA;
        AbstractC1305a.o(bVar, "modelClass");
        AbstractC1305a.o(str, "key");
        i0 i0Var = (i0) this.f9277x;
        i0Var.getClass();
        b0 b0Var = (b0) i0Var.f5627a.get(str);
        Class clsE = ((D4.d) bVar).f367a;
        AbstractC1305a.o(clsE, "jClass");
        Map map = D4.d.f364b;
        AbstractC1305a.m(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsE);
        if (num != null) {
            zIsInstance = S3.a.A(num.intValue(), b0Var);
        } else {
            if (clsE.isPrimitive()) {
                clsE = AbstractC1305a.E(D4.s.a(clsE));
            }
            zIsInstance = clsE.isInstance(b0Var);
        }
        if (zIsInstance) {
            Object obj = (e0) this.f9278y;
            if (obj instanceof g0) {
                AbstractC1305a.l(b0Var);
                Y y5 = (Y) ((g0) obj);
                y5.getClass();
                AbstractC0315o abstractC0315o = y5.f5597d;
                if (abstractC0315o != null) {
                    C1523d c1523d = y5.f5598e;
                    AbstractC1305a.l(c1523d);
                    androidx.lifecycle.U.a(b0Var, c1523d, abstractC0315o);
                }
            }
            AbstractC1305a.m(b0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return b0Var;
        }
        C0921c c0921c = new C0921c((AbstractC0920b) this.f9279z);
        c0921c.f9835a.put(C1002c.f10437a, str);
        e0 e0Var = (e0) this.f9278y;
        AbstractC1305a.o(e0Var, "factory");
        try {
            try {
                b0VarA = e0Var.b(bVar, c0921c);
            } catch (AbstractMethodError unused) {
                b0VarA = e0Var.a(AbstractC1305a.D(bVar));
            }
        } catch (AbstractMethodError unused2) {
            b0VarA = e0Var.c(AbstractC1305a.D(bVar), c0921c);
        }
        i0 i0Var2 = (i0) this.f9277x;
        i0Var2.getClass();
        AbstractC1305a.o(b0VarA, "viewModel");
        b0 b0Var2 = (b0) i0Var2.f5627a.put(str, b0VarA);
        if (b0Var2 != null) {
            b0Var2.b();
        }
        return b0VarA;
    }

    public final boolean G(int i6) {
        return ((TypedArray) this.f9278y).hasValue(i6);
    }

    public final void H(R0.e eVar) {
        ((w0.p) this.f9277x).b();
        ((w0.p) this.f9277x).c();
        try {
            ((AbstractC1447b) this.f9278y).e(eVar);
            ((w0.p) this.f9277x).h();
        } finally {
            ((w0.p) this.f9277x).f();
        }
    }

    public final boolean I(int i6, C1437d c1437d, x.n nVar) {
        x.b bVar = (x.b) this.f9278y;
        int[] iArr = c1437d.f13397p0;
        bVar.f13600a = iArr[0];
        bVar.f13601b = iArr[1];
        bVar.f13602c = c1437d.r();
        ((x.b) this.f9278y).f13603d = c1437d.l();
        x.b bVar2 = (x.b) this.f9278y;
        bVar2.f13608i = false;
        bVar2.f13609j = i6;
        boolean z5 = bVar2.f13600a == 3;
        boolean z6 = bVar2.f13601b == 3;
        boolean z7 = z5 && c1437d.f13362W > 0.0f;
        boolean z8 = z6 && c1437d.f13362W > 0.0f;
        int[] iArr2 = c1437d.f13401t;
        if (z7 && iArr2[0] == 4) {
            bVar2.f13600a = 1;
        }
        if (z8 && iArr2[1] == 4) {
            bVar2.f13601b = 1;
        }
        nVar.b(c1437d, bVar2);
        c1437d.P(((x.b) this.f9278y).f13604e);
        c1437d.M(((x.b) this.f9278y).f13605f);
        x.b bVar3 = (x.b) this.f9278y;
        c1437d.f13344E = bVar3.f13607h;
        c1437d.J(bVar3.f13606g);
        x.b bVar4 = (x.b) this.f9278y;
        bVar4.f13609j = 0;
        return bVar4.f13608i;
    }

    public final boolean K() {
        Iterator it = ((CopyOnWriteArrayList) this.f9278y).iterator();
        while (it.hasNext()) {
            if (((h0.M) it.next()).f8668a.p()) {
                return true;
            }
        }
        return false;
    }

    public final void L(EnumC0313m enumC0313m) {
        a0 a0Var = (a0) this.f9279z;
        if (a0Var != null) {
            a0Var.run();
        }
        a0 a0Var2 = new a0((C0323x) this.f9277x, enumC0313m);
        this.f9279z = a0Var2;
        ((Handler) this.f9278y).postAtFrontOfQueue(a0Var2);
    }

    public final void M() {
        ((TypedArray) this.f9278y).recycle();
    }

    public final void N(String str) {
        ((w0.p) this.f9277x).b();
        B0.g gVarA = ((w0.t) this.f9279z).a();
        if (str == null) {
            gVarA.h(1);
        } else {
            gVarA.k(1, str);
        }
        ((w0.p) this.f9277x).c();
        try {
            gVarA.l();
            ((w0.p) this.f9277x).h();
        } finally {
            ((w0.p) this.f9277x).f();
            ((w0.t) this.f9279z).c(gVarA);
        }
    }

    public final void O(o0.H h4, o0.H h6) {
        AbstractC1305a.o(h4, "sourceLoadStates");
        o(new d0(this, h4, h6, 1));
    }

    public final void P(o0.I i6, o0.G g4) {
        AbstractC1305a.o(i6, "type");
        int iOrdinal = i6.ordinal();
        if (iOrdinal == 0) {
            this.f9277x = g4;
        } else if (iOrdinal == 1) {
            this.f9278y = g4;
        } else {
            if (iOrdinal != 2) {
                throw new C0733A();
            }
            this.f9279z = g4;
        }
    }

    public final void Q(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f9277x = str;
    }

    public final void R(E1.d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f9279z = dVar;
    }

    public final o0.H S() {
        return new o0.H((o0.G) this.f9277x, (o0.G) this.f9278y, (o0.G) this.f9279z);
    }

    public final void T(C1438e c1438e, int i6, int i7, int i8) {
        int i9 = c1438e.f13369b0;
        int i10 = c1438e.f13371c0;
        c1438e.f13369b0 = 0;
        c1438e.f13371c0 = 0;
        c1438e.P(i7);
        c1438e.M(i8);
        if (i9 < 0) {
            c1438e.f13369b0 = 0;
        } else {
            c1438e.f13369b0 = i9;
        }
        if (i10 < 0) {
            c1438e.f13371c0 = 0;
        } else {
            c1438e.f13371c0 = i10;
        }
        C1438e c1438e2 = (C1438e) this.f9279z;
        c1438e2.f13421t0 = i6;
        c1438e2.S();
    }

    public final void U(C1438e c1438e) {
        ((ArrayList) this.f9277x).clear();
        int size = c1438e.f13489q0.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1437d c1437d = (C1437d) c1438e.f13489q0.get(i6);
            int[] iArr = c1437d.f13397p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f9277x).add(c1437d);
            }
        }
        c1438e.f13420s0.f13613b = true;
    }

    @Override // S.g
    public final Uri b() {
        return (Uri) this.f9279z;
    }

    @Override // S.g
    public final ClipDescription c() {
        return (ClipDescription) this.f9278y;
    }

    public final /* synthetic */ Object clone() {
        switch (this.f9276w) {
            case 26:
                C0803c c0803c = new C0803c((C0393c) ((C0393c) this.f9277x).clone());
                Iterator it = ((List) this.f9279z).iterator();
                while (it.hasNext()) {
                    ((List) c0803c.f9279z).add((C0393c) ((C0393c) it.next()).clone());
                }
                return c0803c;
            default:
                return super.clone();
        }
    }

    @Override // M.b
    public final boolean d(Object obj) {
        if (obj instanceof D1.b) {
            ((D1.b) obj).e().f290a = true;
        }
        switch (((V0.m) ((D1.c) this.f9278y)).f3703w) {
            case 23:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((M.b) this.f9279z).d(obj);
    }

    @Override // S.g
    public final Object e() {
        return null;
    }

    @Override // v1.InterfaceC1417a
    public final l1.F f(l1.F f6, j1.m mVar) {
        Drawable drawable = (Drawable) f6.a();
        if (drawable instanceof BitmapDrawable) {
            return ((InterfaceC1417a) this.f9278y).f(C1295d.e(((BitmapDrawable) drawable).getBitmap(), (InterfaceC1006d) this.f9277x), mVar);
        }
        if (drawable instanceof C1360d) {
            return ((InterfaceC1417a) this.f9279z).f(f6, mVar);
        }
        return null;
    }

    @Override // S.g
    public final Uri g() {
        return (Uri) this.f9277x;
    }

    @Override // M.b
    public final Object h() {
        Object objH = ((M.b) this.f9279z).h();
        if (objH == null) {
            objH = ((D1.a) this.f9277x).s();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objH.getClass());
            }
        }
        if (objH instanceof D1.b) {
            ((D1.b) objH).e().f290a = false;
        }
        return objH;
    }

    @Override // A0.c
    public final A0.d j(A0.b bVar) {
        return new w0.s(bVar.f2a, (String) this.f9277x, (File) this.f9278y, bVar.f4c.f10110a, ((A0.c) this.f9279z).j(bVar));
    }

    public final H1.j k() {
        String strConcat = ((String) this.f9277x) == null ? " backendName" : "";
        if (((E1.d) this.f9279z) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new H1.j((String) this.f9277x, (byte[]) this.f9278y, (E1.d) this.f9279z);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public final M1.c l() {
        String strI = ((Long) this.f9277x) == null ? " delta" : "";
        if (((Long) this.f9278y) == null) {
            strI = strI.concat(" maxAllowedDelay");
        }
        if (((Set) this.f9279z) == null) {
            strI = AbstractC0628i.i(strI, " flags");
        }
        if (strI.isEmpty()) {
            return new M1.c(((Long) this.f9277x).longValue(), ((Long) this.f9278y).longValue(), (Set) this.f9279z);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public final Bitmap n(BitmapFactory.Options options) {
        switch (this.f9276w) {
            case 19:
                return BitmapFactory.decodeStream(new C1.a(C1.b.c((ByteBuffer) this.f9277x)), null, options);
            case 20:
                s1.y yVar = (s1.y) ((com.bumptech.glide.load.data.n) this.f9277x).f6388b;
                yVar.reset();
                return BitmapFactory.decodeStream(yVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.n) this.f9279z).b().getFileDescriptor(), null, options);
        }
    }

    public final void o(C4.l lVar) {
        q0 q0Var;
        Object value;
        C1197m c1197m;
        W w5 = (W) this.f9278y;
        do {
            q0Var = (q0) w5;
            value = q0Var.getValue();
            C1197m c1197m2 = (C1197m) value;
            c1197m = (C1197m) lVar.j(c1197m2);
            if (AbstractC1305a.c(c1197m2, c1197m)) {
                return;
            }
        } while (!q0Var.j(value, c1197m));
        if (c1197m != null) {
            Iterator it = ((CopyOnWriteArrayList) this.f9277x).iterator();
            while (it.hasNext()) {
                ((C4.l) it.next()).j(c1197m);
            }
        }
    }

    public final void p(Runnable runnable) {
        ((S0.i) this.f9277x).execute(runnable);
    }

    public final o0.G q(o0.I i6) {
        Object obj;
        AbstractC1305a.o(i6, "loadType");
        int iOrdinal = i6.ordinal();
        if (iOrdinal == 0) {
            obj = this.f9277x;
        } else if (iOrdinal == 1) {
            obj = this.f9278y;
        } else {
            if (iOrdinal != 2) {
                throw new C0733A();
            }
            obj = this.f9279z;
        }
        return (o0.G) obj;
    }

    public final boolean r(int i6, boolean z5) {
        return ((TypedArray) this.f9278y).getBoolean(i6, z5);
    }

    public final ColorStateList s(int i6) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!((TypedArray) this.f9278y).hasValue(i6) || (resourceId = ((TypedArray) this.f9278y).getResourceId(i6, 0)) == 0 || (colorStateListB = E.f.b((Context) this.f9277x, resourceId)) == null) ? ((TypedArray) this.f9278y).getColorStateList(i6) : colorStateListB;
    }

    public final int t(int i6, int i7) {
        return ((TypedArray) this.f9278y).getDimensionPixelOffset(i6, i7);
    }

    public final String toString() {
        switch (this.f9276w) {
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                String str = "[ ";
                if (((u.i) this.f9277x) != null) {
                    for (int i6 = 0; i6 < 9; i6++) {
                        str = str + ((u.i) this.f9277x).f12804D[i6] + " ";
                    }
                }
                return str + "] " + ((u.i) this.f9277x);
            default:
                return super.toString();
        }
    }

    public final int u(int i6, int i7) {
        return ((TypedArray) this.f9278y).getDimensionPixelSize(i6, i7);
    }

    public final Drawable v(int i6) {
        int resourceId;
        return (!((TypedArray) this.f9278y).hasValue(i6) || (resourceId = ((TypedArray) this.f9278y).getResourceId(i6, 0)) == 0) ? ((TypedArray) this.f9278y).getDrawable(i6) : AbstractC0651b.p((Context) this.f9277x, resourceId);
    }

    public final Drawable w(int i6) {
        int resourceId;
        Drawable drawableF;
        if (!((TypedArray) this.f9278y).hasValue(i6) || (resourceId = ((TypedArray) this.f9278y).getResourceId(i6, 0)) == 0) {
            return null;
        }
        C0998z c0998zA = C0998z.a();
        Context context = (Context) this.f9277x;
        synchronized (c0998zA) {
            drawableF = c0998zA.f10429a.f(context, resourceId, true);
        }
        return drawableF;
    }

    public final Typeface x(int i6, int i7, m.Y y5) {
        int resourceId = ((TypedArray) this.f9278y).getResourceId(i6, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f9279z) == null) {
            this.f9279z = new TypedValue();
        }
        Context context = (Context) this.f9277x;
        TypedValue typedValue = (TypedValue) this.f9279z;
        ThreadLocal threadLocal = F.q.f458a;
        if (context.isRestricted()) {
            return null;
        }
        return F.q.b(context, resourceId, typedValue, i7, y5, true, false);
    }

    public final ImageHeaderParser$ImageType y() throws Throwable {
        switch (this.f9276w) {
            case 19:
                return AbstractC1332d.K((List) this.f9278y, C1.b.c((ByteBuffer) this.f9277x));
            case 20:
                List list = (List) this.f9279z;
                s1.y yVar = (s1.y) ((com.bumptech.glide.load.data.n) this.f9277x).f6388b;
                yVar.reset();
                return AbstractC1332d.L((C1010h) this.f9278y, yVar, list);
            default:
                List list2 = (List) this.f9278y;
                com.bumptech.glide.load.data.n nVar = (com.bumptech.glide.load.data.n) this.f9279z;
                C1010h c1010h = (C1010h) this.f9277x;
                int size = list2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    j1.f fVar = (j1.f) list2.get(i6);
                    s1.y yVar2 = null;
                    try {
                        s1.y yVar3 = new s1.y(new FileInputStream(nVar.b().getFileDescriptor()), c1010h);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = fVar.c(yVar3);
                            yVar3.c();
                            nVar.b();
                            if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeC;
                            }
                        } catch (Throwable th) {
                            th = th;
                            yVar2 = yVar3;
                            if (yVar2 != null) {
                                yVar2.c();
                            }
                            nVar.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public final int z(int i6, int i7) {
        return ((TypedArray) this.f9278y).getInt(i6, i7);
    }

    public C0803c(int i6) {
        this.f9276w = i6;
        if (i6 == 10) {
            this.f9277x = new CopyOnWriteArrayList();
            q0 q0VarB = P4.d0.b(null);
            this.f9278y = q0VarB;
            this.f9279z = new P4.Y(q0VarB);
            return;
        }
        if (i6 == 11) {
            o0.F f6 = o0.F.f11748c;
            this.f9277x = f6;
            this.f9278y = f6;
            this.f9279z = f6;
            return;
        }
        if (i6 == 13) {
            this.f9277x = Collections.emptyList();
            this.f9278y = Collections.emptyList();
            return;
        }
        if (i6 != 28) {
            if (i6 != 29) {
                switch (i6) {
                    case 24:
                        break;
                    case 25:
                        break;
                    case 26:
                        this.f9277x = new C0393c("", 0L, null);
                        this.f9278y = new C0393c("", 0L, null);
                        this.f9279z = new ArrayList();
                        break;
                    default:
                        this.f9277x = new ReentrantLock();
                        this.f9278y = P4.d0.b(o0.H.f11767d);
                        this.f9279z = new C1173b();
                        break;
                }
                return;
            }
            this.f9277x = W2.g.a();
        }
    }

    public /* synthetic */ C0803c(M.c cVar, Object obj, V0.m mVar) {
        this.f9276w = 23;
        this.f9279z = cVar;
        this.f9277x = obj;
        this.f9278y = mVar;
    }

    public C0803c(Context context, LocationManager locationManager) {
        this.f9276w = 1;
        this.f9279z = new Q();
        this.f9277x = context;
        this.f9278y = locationManager;
    }

    public C0803c(ParcelFileDescriptor parcelFileDescriptor, List list, C1010h c1010h) {
        this.f9276w = 21;
        AbstractC1332d.l(c1010h, "Argument must not be null");
        this.f9277x = c1010h;
        AbstractC1332d.l(list, "Argument must not be null");
        this.f9278y = list;
        this.f9279z = new com.bumptech.glide.load.data.n(parcelFileDescriptor);
    }

    public C0803c(InterfaceC0321v interfaceC0321v) {
        this.f9276w = 7;
        AbstractC1305a.o(interfaceC0321v, "provider");
        this.f9277x = new C0323x(interfaceC0321v);
        this.f9278y = new Handler();
    }

    public C0803c(i0 i0Var, e0 e0Var, AbstractC0920b abstractC0920b) {
        this.f9276w = 8;
        AbstractC1305a.o(i0Var, "store");
        AbstractC1305a.o(e0Var, "factory");
        AbstractC1305a.o(abstractC0920b, "extras");
        this.f9277x = i0Var;
        this.f9278y = e0Var;
        this.f9279z = abstractC0920b;
    }

    public C0803c(C0393c c0393c) {
        this.f9276w = 26;
        this.f9277x = c0393c;
        this.f9278y = (C0393c) c0393c.clone();
        this.f9279z = new ArrayList();
    }

    public /* synthetic */ C0803c(Object obj, int i6, Object obj2) {
        this.f9276w = i6;
        this.f9277x = obj;
        this.f9278y = obj2;
    }

    public /* synthetic */ C0803c(Object obj, Object obj2, Object obj3, int i6) {
        this.f9276w = i6;
        this.f9277x = obj;
        this.f9278y = obj2;
        this.f9279z = obj3;
    }

    public C0803c(Runnable runnable) {
        this.f9276w = 5;
        this.f9278y = new CopyOnWriteArrayList();
        this.f9279z = new HashMap();
        this.f9277x = runnable;
    }

    public C0803c(ExecutorService executorService) {
        this.f9276w = 15;
        this.f9278y = new Handler(Looper.getMainLooper());
        this.f9279z = new U0.a(0, this);
        this.f9277x = new S0.i(executorService);
    }

    public C0803c(C1010h c1010h, C1.k kVar, List list) {
        this.f9276w = 20;
        AbstractC1332d.l(c1010h, "Argument must not be null");
        this.f9278y = c1010h;
        AbstractC1332d.l(list, "Argument must not be null");
        this.f9279z = list;
        this.f9277x = new com.bumptech.glide.load.data.n(kVar, c1010h);
    }

    @Override // S.g
    public final void a() {
    }

    public C0803c(u.g gVar, u.g gVar2) {
        this.f9276w = 3;
        this.f9279z = gVar;
        this.f9278y = gVar2;
    }

    public C0803c(C1438e c1438e) {
        this.f9276w = 4;
        this.f9277x = new ArrayList();
        this.f9278y = new x.b();
        this.f9279z = c1438e;
    }

    public C0803c(w0.p pVar) {
        this.f9276w = 14;
        this.f9277x = pVar;
        this.f9278y = new R0.b(this, pVar, 2);
        this.f9279z = new R0.g(this, pVar, 2);
    }
}
