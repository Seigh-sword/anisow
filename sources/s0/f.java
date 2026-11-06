package S0;

import N.A0;
import N.C0;
import N.C0112x;
import N.C0113y;
import N.InterfaceC0091f;
import N.InterfaceC0107s;
import N.V;
import P4.W;
import P4.c0;
import P4.d0;
import P4.q0;
import W.j0;
import W.l0;
import android.content.ClipData;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.work.impl.WorkDatabase;
import d2.AbstractC0651b;
import h0.D;
import i1.C0830d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import l1.u;
import l1.v;
import n1.C1149e;
import o0.C1222z;
import o0.I;
import p1.C1234C;
import p1.C1236b;
import p1.InterfaceC1235a;
import p1.InterfaceC1237c;
import p1.x;
import p1.y;
import p3.C1251c;
import s4.AbstractC1305a;
import t0.InterfaceC1331c;

/* JADX INFO: loaded from: classes.dex */
public class f implements l.m, m.r, InterfaceC0107s, G.m, InterfaceC0091f, InterfaceC1331c, D1.a, y, InterfaceC1235a, InterfaceC1237c, s1.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f3073x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f() {
        this(19);
        this.f3072w = 19;
    }

    public static ByteArrayInputStream y(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public static Object z(Object[] objArr, int i6, G.m mVar) {
        int i7 = (i6 & 1) == 0 ? 400 : 700;
        boolean z5 = (i6 & 2) != 0;
        Object obj = null;
        int i8 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(mVar.q(obj2) - i7) * 2) + (mVar.t(obj2) == z5 ? 0 : 1);
            if (obj == null || i8 > iAbs) {
                obj = obj2;
                i8 = iAbs;
            }
        }
        return obj;
    }

    public K.h A(int i6, K.h[] hVarArr) {
        return (K.h) z(hVarArr, i6, new f(6, this));
    }

    public final j0 B() {
        return (j0) ((q0) ((W) this.f3073x)).getValue();
    }

    public final h0.W C() {
        return ((D) this.f3073x).f8640A;
    }

    public final c0 D(I i6) {
        AbstractC1305a.o(i6, "loadType");
        int iOrdinal = i6.ordinal();
        if (iOrdinal == 1) {
            return ((C1222z) ((p.b) this.f3073x).f12205a).f12166b;
        }
        if (iOrdinal == 2) {
            return ((C1222z) ((p.b) this.f3073x).f12206b).f12166b;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final int E(String str) {
        ((WorkDatabase) this.f3073x).c();
        try {
            Long lB = ((WorkDatabase) this.f3073x).j().b(str);
            int i6 = 0;
            int iIntValue = lB != null ? lB.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i6 = iIntValue + 1;
            }
            ((WorkDatabase) this.f3073x).j().e(new R0.d(str, i6));
            ((WorkDatabase) this.f3073x).h();
            ((WorkDatabase) this.f3073x).f();
            return iIntValue;
        } catch (Throwable th) {
            ((WorkDatabase) this.f3073x).f();
            throw th;
        }
    }

    public final void F() {
        ((D) this.f3073x).f8640A.P();
    }

    public final synchronized void G(C0830d c0830d) {
        c0830d.f9384b = null;
        c0830d.f9385c = null;
        ((Queue) this.f3073x).offer(c0830d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(W.j0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            s4.AbstractC1305a.o(r7, r0)
            java.lang.Object r0 = r6.f3073x
            P4.W r0 = (P4.W) r0
        L9:
            r1 = r0
            P4.q0 r1 = (P4.q0) r1
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            W.j0 r3 = (W.j0) r3
            boolean r4 = r3 instanceof W.Z
            if (r4 == 0) goto L18
            goto L2b
        L18:
            W.l0 r4 = W.l0.f4146b
            boolean r4 = s4.AbstractC1305a.c(r3, r4)
            if (r4 == 0) goto L21
            goto L2b
        L21:
            boolean r4 = r3 instanceof W.C0185d
            if (r4 == 0) goto L2d
            int r4 = r3.f4133a
            int r5 = r7.f4133a
            if (r5 <= r4) goto L31
        L2b:
            r3 = r7
            goto L31
        L2d:
            boolean r4 = r3 instanceof W.X
            if (r4 == 0) goto L38
        L31:
            boolean r1 = r1.j(r2, r3)
            if (r1 == 0) goto L9
            return
        L38:
            h0.A r7 = new h0.A
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.f.H(W.j0):void");
    }

    @Override // s1.l
    public final long a(long j6) throws IOException {
        if (j6 < 0) {
            return 0L;
        }
        long j7 = j6;
        while (j7 > 0) {
            long jSkip = ((InputStream) this.f3073x).skip(j7);
            if (jSkip <= 0) {
                if (((InputStream) this.f3073x).read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j7 -= jSkip;
        }
        return j6 - j7;
    }

    @Override // p1.InterfaceC1237c
    public final Class b() {
        switch (this.f3072w) {
            case 24:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // s1.l
    public final int c() {
        return (o() << 8) | o();
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        return new C1236b((AssetManager) this.f3073x, this);
    }

    @Override // N.InterfaceC0091f
    public final ClipData e() {
        return ((ContentInfo) this.f3073x).getClip();
    }

    @Override // N.InterfaceC0091f
    public final int f() {
        return ((ContentInfo) this.f3073x).getFlags();
    }

    @Override // p1.InterfaceC1237c
    public final Object g(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // t0.InterfaceC1331c
    public final void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.m
    public final boolean i(l.o oVar, MenuItem menuItem) {
        m.r rVar = ((ActionMenuView) this.f3073x).f5200W;
        if (rVar != null) {
            f fVar = (f) rVar;
            if (((Toolbar) fVar.f3073x).f5246f0.K()) {
                return true;
            }
            ((Toolbar) fVar.f3073x).getClass();
        }
        return false;
    }

    @Override // l.m
    public final void j(l.o oVar) {
        l.m mVar = ((ActionMenuView) this.f3073x).f5195R;
        if (mVar != null) {
            mVar.j(oVar);
        }
    }

    @Override // s1.l
    public final int k(int i6, byte[] bArr) throws s1.k {
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6 && (i8 = ((InputStream) this.f3073x).read(bArr, i7, i6 - i7)) != -1) {
            i7 += i8;
        }
        if (i7 == 0 && i8 == -1) {
            throw new s1.k();
        }
        return i7;
    }

    @Override // N.InterfaceC0091f
    public final ContentInfo l() {
        return (ContentInfo) this.f3073x;
    }

    @Override // t0.InterfaceC1331c
    public final void m(int i6, Object obj) {
        String str;
        switch (i6) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i6 == 6 || i6 == 7 || i6 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f3073x).setResultCode(i6);
    }

    @Override // N.InterfaceC0091f
    public final int n() {
        return ((ContentInfo) this.f3073x).getSource();
    }

    @Override // s1.l
    public final short o() throws IOException {
        int i6 = ((InputStream) this.f3073x).read();
        if (i6 != -1) {
            return (short) i6;
        }
        throw new s1.k();
    }

    @Override // N.InterfaceC0107s
    public final C0 p(View view, C0 c02) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3073x;
        if (!Objects.equals(coordinatorLayout.f5300J, c02)) {
            coordinatorLayout.f5300J = c02;
            boolean z5 = c02.d() > 0;
            coordinatorLayout.f5301K = z5;
            coordinatorLayout.setWillNotDraw(!z5 && coordinatorLayout.getBackground() == null);
            A0 a02 = c02.f1943a;
            if (!a02.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = coordinatorLayout.getChildAt(i6);
                    WeakHashMap weakHashMap = V.f1964a;
                    if (childAt.getFitsSystemWindows() && ((B.e) childAt.getLayoutParams()).f37a != null && a02.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c02;
    }

    @Override // G.m
    public final int q(Object obj) {
        return ((K.h) obj).f1489c;
    }

    @Override // p1.InterfaceC1235a
    public final com.bumptech.glide.load.data.k r(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.k(assetManager, str, 0);
    }

    @Override // D1.a
    public final Object s() {
        C1251c c1251c = (C1251c) this.f3073x;
        return new u((o1.d) c1251c.f12318b, (o1.d) c1251c.f12319c, (o1.d) c1251c.f12320d, (o1.d) c1251c.f12321e, (v) c1251c.f12322f, (l1.x) c1251c.f12323g, (M.b) c1251c.f12324h);
    }

    @Override // G.m
    public final boolean t(Object obj) {
        return ((K.h) obj).f1490d;
    }

    public final String toString() {
        switch (this.f3072w) {
            case 9:
                return "ContentInfoCompat{" + ((ContentInfo) this.f3073x) + "}";
            default:
                return super.toString();
        }
    }

    public Typeface u(Context context, F.g gVar, Resources resources, int i6) {
        long jLongValue;
        F.h hVar = (F.h) z(gVar.f436a, i6, new L3.c(7, this));
        if (hVar == null) {
            return null;
        }
        f fVar = G.g.f648a;
        int i7 = hVar.f442f;
        String str = hVar.f437a;
        Typeface typefaceX = fVar.x(context, resources, i7, str, i6);
        if (typefaceX != null) {
            G.g.f649b.c(G.g.b(resources, i7, str, 0, i6), typefaceX);
        }
        if (typefaceX == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceX)).longValue();
            } catch (IllegalAccessException | NoSuchFieldException e6) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e6);
                jLongValue = 0;
            }
        }
        if (jLongValue != 0) {
            ((ConcurrentHashMap) this.f3073x).put(Long.valueOf(jLongValue), gVar);
        }
        return typefaceX;
    }

    public Typeface v(Context context, K.h[] hVarArr, int i6) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(A(i6, hVarArr).f1487a);
            try {
                Typeface typefaceW = w(context, inputStreamOpenInputStream);
                AbstractC0651b.i(inputStreamOpenInputStream);
                return typefaceW;
            } catch (IOException unused) {
                AbstractC0651b.i(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                AbstractC0651b.i(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface w(Context context, InputStream inputStream) {
        File fileR = AbstractC0651b.r(context);
        if (fileR == null) {
            return null;
        }
        try {
            if (AbstractC0651b.k(fileR, inputStream)) {
                return Typeface.createFromFile(fileR.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileR.delete();
        }
    }

    public Typeface x(Context context, Resources resources, int i6, String str, int i7) {
        File fileR = AbstractC0651b.r(context);
        if (fileR == null) {
            return null;
        }
        try {
            if (AbstractC0651b.j(fileR, resources, i6)) {
                return Typeface.createFromFile(fileR.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileR.delete();
        }
    }

    public f(int i6) {
        this.f3072w = i6;
        if (i6 == 7) {
            this.f3073x = new ConcurrentHashMap();
            return;
        }
        if (i6 == 12) {
            this.f3073x = d0.b(l0.f4146b);
            return;
        }
        if (i6 == 17) {
            p.b bVar = new p.b();
            bVar.f12209e = this;
            bVar.f12205a = new C1222z();
            bVar.f12206b = new C1222z();
            bVar.f12208d = new ReentrantLock();
            this.f3073x = bVar;
            return;
        }
        if (i6 != 19) {
            if (i6 == 28) {
                char[] cArr = C1.n.f134a;
                this.f3073x = new ArrayDeque(0);
            } else if (i6 != 29) {
                this.f3073x = new ArrayDeque();
            }
        }
    }

    public /* synthetic */ f(int i6, Object obj) {
        this.f3072w = i6;
        this.f3073x = obj;
    }

    public f(ContentInfo contentInfo) {
        this.f3072w = 9;
        contentInfo.getClass();
        this.f3073x = M0.a.o(contentInfo);
    }

    public f(View view) {
        Object c0112x;
        this.f3072w = 10;
        if (Build.VERSION.SDK_INT >= 30) {
            C0113y c0113y = new C0113y(view);
            c0113y.f2062x = view;
            c0112x = c0113y;
        } else {
            c0112x = new C0112x(view);
        }
        this.f3073x = c0112x;
    }

    public f(WindowInsetsController windowInsetsController) {
        this.f3072w = 10;
        C0113y c0113y = new C0113y(null);
        c0113y.f2063y = windowInsetsController;
        this.f3073x = c0113y;
    }

    public f(Object obj) {
        this.f3072w = 26;
        this.f3073x = new C1149e(this);
    }

    public f(boolean z5) {
        this.f3072w = 13;
        this.f3073x = new AtomicBoolean(z5);
    }
}
