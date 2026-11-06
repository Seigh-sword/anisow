package com.bumptech.glide;

import F.q;
import N.AbstractC0094g0;
import P2.t;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.Window;
import c0.C0354c;
import c0.C0355d;
import c0.y;
import c0.z;
import d.RunnableC0637r;
import d0.C0647b;
import d2.AbstractC0651b;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import k.C0882e;
import m.C0986t;
import o0.A1;
import o0.B1;
import o0.C1;
import o0.I;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f6301a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f6302b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f6303c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f6304d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f6305e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f6306f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f6307g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f6308h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f6309i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Field f6310j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f6311k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f6312l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile boolean f6313m = true;

    /* JADX WARN: Removed duplicated region for block: B:184:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0535 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06fd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(w.C1438e r36, u.d r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.a(w.e, u.d, java.util.ArrayList, int):void");
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b6 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b6)));
        }
        return sb.toString();
    }

    public static boolean f(G.f[] fVarArr, G.f[] fVarArr2) {
        if (fVarArr == null || fVarArr2 == null || fVarArr.length != fVarArr2.length) {
            return false;
        }
        for (int i6 = 0; i6 < fVarArr.length; i6++) {
            G.f fVar = fVarArr[i6];
            char c6 = fVar.f646a;
            G.f fVar2 = fVarArr2[i6];
            if (c6 != fVar2.f646a || fVar.f647b.length != fVar2.f647b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] g(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            jArr[i6] = iArr[i6];
        }
        return jArr;
    }

    public static float[] h(float[] fArr, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i6, length);
        float[] fArr2 = new float[i6];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static z i(Context context) {
        ProviderInfo providerInfo;
        C0986t c0986t;
        ApplicationInfo applicationInfo;
        B3.e c0355d = Build.VERSION.SDK_INT >= 28 ? new C0355d() : new C0354c();
        PackageManager packageManager = context.getPackageManager();
        AbstractC0651b.f(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0986t = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrS = c0355d.s(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrS) {
                    arrayList.add(signature.toByteArray());
                }
                c0986t = new C0986t(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e6) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e6);
                c0986t = null;
            }
        }
        if (c0986t == null) {
            return null;
        }
        return new z(new y(context, c0986t));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static G.f[] j(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.j(java.lang.String):G.f[]");
    }

    public static Path k(String str) {
        Path path = new Path();
        try {
            G.f.b(j(str), path);
            return path;
        } catch (RuntimeException e6) {
            throw new RuntimeException("Error in parsing ".concat(str), e6);
        }
    }

    public static G.f[] l(G.f[] fVarArr) {
        G.f[] fVarArr2 = new G.f[fVarArr.length];
        for (int i6 = 0; i6 < fVarArr.length; i6++) {
            fVarArr2[i6] = new G.f(fVarArr[i6]);
        }
        return fVarArr2;
    }

    public static Drawable n(Context context, Context context2, int i6, Resources.Theme theme) {
        try {
            if (f6313m) {
                return r(context2, i6, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e6) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e6;
            }
            Object obj = E.f.f379a;
            return E.a.b(context2, i6);
        } catch (NoClassDefFoundError unused2) {
            f6313m = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = q.f458a;
        return F.j.a(resources, i6, theme);
    }

    public static Set o() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static Drawable r(Context context, int i6, Resources.Theme theme) {
        if (theme != null) {
            C0882e c0882e = new C0882e(context, theme);
            c0882e.a(theme.getResources().getConfiguration());
            context = c0882e;
        }
        return AbstractC0651b.p(context, i6);
    }

    public static C0647b u(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j6;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i6 = byteBufferDuplicate.getShort() & 65535;
        if (i6 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                j6 = -1;
                break;
            }
            int i8 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j6 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i8) {
                break;
            }
            i7++;
        }
        if (j6 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j6 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i9 = 0; i9 < j7; i9++) {
                int i10 = byteBufferDuplicate.getInt();
                long j8 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i10 || 1701669481 == i10) {
                    byteBufferDuplicate.position((int) (j8 + j6));
                    C0647b c0647b = new C0647b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0647b.f8160b = byteBufferDuplicate;
                    c0647b.f8159a = iPosition;
                    int i11 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0647b.f8161c = i11;
                    c0647b.f8162d = c0647b.f8160b.getShort(i11);
                    return c0647b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void w(Window window, boolean z5) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0094g0.a(window, z5);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final boolean z(C1 c12, C1 c13, I i6) {
        AbstractC1305a.o(c12, "<this>");
        if (c13 == null) {
            return true;
        }
        if ((c13 instanceof B1) && (c12 instanceof A1)) {
            return true;
        }
        return (((c12 instanceof B1) && (c13 instanceof A1)) || (c12.f11741c == c13.f11741c && c12.f11742d == c13.f11742d && c13.a(i6) <= c12.a(i6))) ? false : true;
    }

    public void d(int i6) {
        new Handler(Looper.getMainLooper()).post(new F.n(i6, 0, this));
    }

    public void e(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0637r(this, 2, typeface));
    }

    public abstract void m(float f6, float f7, t tVar);

    public float p(View view) {
        if (f6309i) {
            try {
                return F0.I.a(view);
            } catch (NoSuchMethodError unused) {
                f6309i = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void s(int i6);

    public abstract void t(Typeface typeface);

    public void x(View view, float f6) {
        if (f6309i) {
            try {
                F0.I.b(view, f6);
                return;
            } catch (NoSuchMethodError unused) {
                f6309i = false;
            }
        }
        view.setAlpha(f6);
    }

    public void y(View view, int i6) {
        if (!f6311k) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6310j = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f6311k = true;
        }
        Field field = f6310j;
        if (field != null) {
            try {
                f6310j.setInt(view, i6 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void b() {
    }

    public void q() {
    }

    public /* bridge */ /* synthetic */ void v() {
    }
}
