package d2;

import C4.p;
import D.AbstractC0009j;
import D.AbstractC0010k;
import M4.J;
import M4.s0;
import N.InterfaceC0101l;
import N.U;
import N.V;
import P4.C0150k;
import P4.InterfaceC0146g;
import T.d;
import T.e;
import T.q;
import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.lifecycle.C0316p;
import androidx.lifecycle.C0317q;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.InterfaceC0321v;
import d.AbstractC0628i;
import f5.j;
import h5.E;
import h5.Q;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m.R0;
import o0.o1;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import w.AbstractC1443j;
import w.C1436c;
import w.C1437d;
import w.C1441h;
import x.o;

/* JADX INFO: renamed from: d2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0651b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f8165a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f8166b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f8167c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f8168d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f8169e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f8170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f8171g = 0;

    public static void A(TextView textView, int i6) {
        e(i6);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i6 > Math.abs(i7)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i6 - i7);
        }
    }

    public static void B(TextView textView, int i6) {
        e(i6);
        if (i6 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i6 - r0, 1.0f);
        }
    }

    public static final InterfaceC0146g C(p pVar) {
        return AbstractC1305a.h(new C0150k(new o1(pVar, null)), -2);
    }

    public static int D(Context context, int i6) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i6});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static ActionMode.Callback E(ActionMode.Callback callback) {
        return (!(callback instanceof q) || Build.VERSION.SDK_INT < 26) ? callback : ((q) callback).f3369a;
    }

    public static boolean F(int i6, int i7, int i8, int i9) {
        return (i8 == 1 || i8 == 2 || (i8 == 4 && i6 != 2)) || (i9 == 1 || i9 == 2 || (i9 == 4 && i7 != 2));
    }

    public static ActionMode.Callback G(ActionMode.Callback callback, TextView textView) {
        int i6 = Build.VERSION.SDK_INT;
        return (i6 < 26 || i6 > 27 || (callback instanceof q) || callback == null) ? callback : new q(callback, textView);
    }

    public static final boolean c(int i6, int i7, int i8, byte[] bArr, byte[] bArr2) {
        AbstractC1305a.o(bArr, "a");
        AbstractC1305a.o(bArr2, "b");
        for (int i9 = 0; i9 < i8; i9++) {
            if (bArr[i9 + i6] != bArr2[i9 + i7]) {
                return false;
            }
        }
        return true;
    }

    public static void d(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void g(long j6, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j6 || j6 - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j7 + " byteCount=" + j8);
        }
    }

    public static int h(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = AbstractC0009j.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManagerC = AbstractC0010k.c(context);
                iC = AbstractC0010k.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = AbstractC0010k.a(appOpsManagerC, strD, iMyUid, AbstractC0010k.b(context));
                }
            } else {
                iC = AbstractC0009j.c((AppOpsManager) AbstractC0009j.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean j(File file, Resources resources, int i6) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i6);
            try {
                boolean zK = k(file, inputStreamOpenRawResource);
                i(inputStreamOpenRawResource);
                return zK;
            } catch (Throwable th) {
                th = th;
                i(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean k(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i6 = inputStream.read(bArr);
                if (i6 == -1) {
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i6);
            }
        } catch (IOException e7) {
            e = e7;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            i(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            i(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean l(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = V.f1964a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = U.f1960d;
        U u5 = (U) view.getTag(com.xo.anilab.R.id.tag_unhandled_key_event_manager);
        if (u5 == null) {
            u5 = new U();
            u5.f1961a = null;
            u5.f1962b = null;
            u5.f1963c = null;
            view.setTag(com.xo.anilab.R.id.tag_unhandled_key_event_manager, u5);
        }
        WeakReference weakReference2 = u5.f1963c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        u5.f1963c = new WeakReference(keyEvent);
        if (u5.f1962b == null) {
            u5.f1962b = new SparseArray();
        }
        SparseArray sparseArray = u5.f1962b;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(com.xo.anilab.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        AbstractC0628i.p(arrayList.get(size));
        throw null;
    }

    public static boolean m(InterfaceC0101l interfaceC0101l, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        if (interfaceC0101l == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0101l.d(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f8167c) {
                        try {
                            f8168d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f8167c = true;
                    }
                    Method method = f8168d;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null) {
                                if (((Boolean) objInvoke).booleanValue()) {
                                    return true;
                                }
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (V.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && V.b(view, keyEvent)) || interfaceC0101l.d(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f8169e) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f8170f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f8169e = true;
        }
        Field field = f8170f;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (V.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }

    public static o n(C1437d c1437d, int i6, ArrayList arrayList, o oVar) {
        C1436c c1436c;
        int i7;
        int i8 = i6 == 0 ? c1437d.f13393n0 : c1437d.f13395o0;
        if (i8 != -1 && (oVar == null || i8 != oVar.f13649b)) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i9);
                if (oVar2.f13649b == i8) {
                    if (oVar != null) {
                        oVar.c(i6, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i9++;
                }
            }
        } else if (i8 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (c1437d instanceof AbstractC1443j) {
                AbstractC1443j abstractC1443j = (AbstractC1443j) c1437d;
                int i10 = 0;
                while (true) {
                    if (i10 >= abstractC1443j.f13487r0) {
                        i7 = -1;
                        break;
                    }
                    C1437d c1437d2 = abstractC1443j.f13486q0[i10];
                    if ((i6 == 0 && (i7 = c1437d2.f13393n0) != -1) || (i6 == 1 && (i7 = c1437d2.f13395o0) != -1)) {
                        break;
                    }
                    i10++;
                }
                if (i7 != -1) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = (o) arrayList.get(i11);
                        if (oVar3.f13649b == i7) {
                            oVar = oVar3;
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o();
                oVar.f13648a = new ArrayList();
                oVar.f13651d = null;
                oVar.f13652e = -1;
                int i12 = o.f13647f;
                o.f13647f = i12 + 1;
                oVar.f13649b = i12;
                oVar.f13650c = i6;
            }
            arrayList.add(oVar);
        }
        ArrayList arrayList2 = oVar.f13648a;
        if (!arrayList2.contains(c1437d)) {
            arrayList2.add(c1437d);
            if (c1437d instanceof C1441h) {
                C1441h c1441h = (C1441h) c1437d;
                c1441h.f13483t0.c(c1441h.f13484u0 == 0 ? 1 : 0, oVar, arrayList);
            }
            int i13 = oVar.f13649b;
            if (i6 == 0) {
                c1437d.f13393n0 = i13;
                c1437d.f13348I.c(i6, oVar, arrayList);
                c1436c = c1437d.f13350K;
            } else {
                c1437d.f13395o0 = i13;
                c1437d.f13349J.c(i6, oVar, arrayList);
                c1437d.f13352M.c(i6, oVar, arrayList);
                c1436c = c1437d.f13351L;
            }
            c1436c.c(i6, oVar, arrayList);
            c1437d.f13355P.c(i6, oVar, arrayList);
        }
        return oVar;
    }

    public static float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable p(Context context, int i6) {
        return R0.c().e(context, i6);
    }

    public static final C0317q q(InterfaceC0321v interfaceC0321v) {
        C0317q c0317q;
        AbstractC1305a.o(interfaceC0321v, "<this>");
        C0323x c0323xG = interfaceC0321v.g();
        AbstractC1305a.o(c0323xG, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = c0323xG.f5635a;
            c0317q = (C0317q) atomicReference.get();
            if (c0317q == null) {
                s0 s0Var = new s0(null);
                S4.e eVar = J.f1851a;
                c0317q = new C0317q(c0323xG, AbstractC1305a.Q(s0Var, ((N4.c) R4.p.f3037a).f2282B));
                while (!atomicReference.compareAndSet(null, c0317q)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                S4.e eVar2 = J.f1851a;
                S3.a.B(c0317q, ((N4.c) R4.p.f3037a).f2282B, null, new C0316p(c0317q, null), 2);
                break loop0;
            }
            break;
        }
        return c0317q;
    }

    public static File r(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i6 = 0; i6 < 100; i6++) {
            File file = new File(cacheDir, str + i6);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static L.e s(android.widget.TextView r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            L.e r0 = new L.e
            android.text.PrecomputedText$Params r8 = T.o.c(r8)
            r0.<init>(r8)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r8.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r4 = T.m.a(r8)
            int r5 = T.m.d(r8)
            android.text.method.TransformationMethod r6 = r8.getTransformationMethod()
            boolean r6 = r6 instanceof android.text.method.PasswordTransformationMethod
            if (r6 == 0) goto L2e
        L2b:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L72
        L2e:
            r6 = 1
            r7 = 0
            if (r0 < r1) goto L59
            int r0 = r8.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L59
            java.util.Locale r8 = r8.getTextLocale()
            android.icu.text.DecimalFormatSymbols r8 = T.n.a(r8)
            java.lang.String[] r8 = T.o.b(r8)
            r8 = r8[r7]
            int r8 = r8.codePointAt(r7)
            byte r8 = java.lang.Character.getDirectionality(r8)
            if (r8 == r6) goto L56
            r0 = 2
            if (r8 != r0) goto L2b
        L56:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            goto L72
        L59:
            int r0 = r8.getLayoutDirection()
            if (r0 != r6) goto L60
            goto L61
        L60:
            r6 = r7
        L61:
            int r8 = r8.getTextDirection()
            switch(r8) {
                case 2: goto L70;
                case 3: goto L2b;
                case 4: goto L56;
                case 5: goto L6d;
                case 6: goto L72;
                case 7: goto L6a;
                default: goto L68;
            }
        L68:
            if (r6 == 0) goto L72
        L6a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L72
        L6d:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LOCALE
            goto L72
        L70:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.ANYRTL_LTR
        L72:
            L.e r8 = new L.e
            android.text.TextDirectionHeuristic r3 = (android.text.TextDirectionHeuristic) r3
            r8.<init>(r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.AbstractC0651b.s(android.widget.TextView):L.e");
    }

    public static int t(int i6) {
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 4) {
            return 2;
        }
        if (i6 == 8) {
            return 3;
        }
        if (i6 == 16) {
            return 4;
        }
        if (i6 == 32) {
            return 5;
        }
        if (i6 == 64) {
            return 6;
        }
        if (i6 == 128) {
            return 7;
        }
        if (i6 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0628i.f("type needs to be >= FIRST and <= LAST, type=", i6));
    }

    public static synchronized boolean u(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f8165a;
        if (context2 != null && (bool = f8166b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f8166b = null;
        if (!AbstractC1332d.S()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f8166b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                f8166b = boolValueOf;
            }
            f8165a = applicationContext;
            return f8166b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f8166b = boolValueOf;
        f8165a = applicationContext;
        return f8166b.booleanValue();
    }

    public static MappedByteBuffer w(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static float x(EdgeEffect edgeEffect, float f6, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f6, f7);
        }
        d.a(edgeEffect, f6, f7);
        return f6;
    }

    public static final int y(j jVar, int i6) {
        AbstractC1305a.o(jVar, "<this>");
        return i6 == -1234567890 ? jVar.d() : i6;
    }

    public static void z(TextView textView, int i6) {
        e(i6);
        if (Build.VERSION.SDK_INT >= 28) {
            T.o.d(textView, i6);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i6 > Math.abs(i7)) {
            textView.setPadding(textView.getPaddingLeft(), i6 + i7, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public abstract void a(Q q5, Object obj);

    public E b() {
        return new E(this, 1);
    }

    public E v() {
        return new E(this, 0);
    }
}
