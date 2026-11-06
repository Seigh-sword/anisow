package f2;

import H2.n;
import H2.o;
import J3.C0048d;
import J3.G;
import N.C0095h;
import N.I;
import N.V;
import N3.C0134u;
import X1.AbstractC0242j;
import X1.C0239g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import d3.C0653a;
import d3.C0654b;
import f5.B;
import f5.C0705b;
import f5.C0706c;
import f5.D;
import f5.E;
import f5.u;
import f5.y;
import i.C0803c;
import i.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import m2.RunnableC1028c1;
import q2.InterfaceC1260c;
import q2.p;
import q2.s;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import u1.C1358b;
import v0.C1389b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f8417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f8418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static V0.m f8419c;

    public static String A(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i6 = 0; i6 < str.length(); i6++) {
            sb.append(str.charAt(i6));
            if (str2.length() > i6) {
                sb.append(str2.charAt(i6));
            }
        }
        return sb.toString();
    }

    public static PorterDuff.Mode B(int i6, PorterDuff.Mode mode) {
        if (i6 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i6 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i6 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i6) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void C(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Animator animator = (Animator) arrayList.get(i6);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void D(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        H.a.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final int E(B b6, int i6) {
        int i7;
        AbstractC1305a.o(b6, "<this>");
        int i8 = i6 + 1;
        int length = b6.f8430A.length;
        int[] iArr = b6.f8431B;
        AbstractC1305a.o(iArr, "<this>");
        int i9 = length - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= i9) {
                i7 = (i10 + i9) >>> 1;
                int i11 = iArr[i7];
                if (i11 >= i8) {
                    if (i11 <= i8) {
                        break;
                    }
                    i9 = i7 - 1;
                } else {
                    i10 = i7 + 1;
                }
            } else {
                i7 = (-i10) - 1;
                break;
            }
        }
        return i7 >= 0 ? i7 : ~i7;
    }

    public static void F(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = V.f1964a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z5 = onLongClickListener != null;
        boolean z6 = zHasOnClickListeners || z5;
        checkableImageButton.setFocusable(z6);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z5);
        checkableImageButton.setImportantForAccessibility(z6 ? 1 : 2);
    }

    public static final C0705b G(Socket socket) throws IOException {
        Logger logger = u.f8489a;
        AbstractC1305a.o(socket, "<this>");
        D d6 = new D(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC1305a.n(outputStream, "getOutputStream()");
        return new C0705b(d6, new C0705b(outputStream, d6));
    }

    public static final C0706c H(Socket socket) throws IOException {
        Logger logger = u.f8489a;
        AbstractC1305a.o(socket, "<this>");
        D d6 = new D(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC1305a.n(inputStream, "getInputStream()");
        return new C0706c(d6, new C0706c(inputStream, d6));
    }

    public static byte[] I(C0048d c0048d) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i6 = 0;
        while (i6 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i6);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i7 = 0;
            while (i7 < iMin2) {
                int i8 = c0048d.read(bArr, i7, iMin2 - i7);
                if (i8 == -1) {
                    return h(arrayDeque, i6);
                }
                i7 += i8;
                i6 += i8;
            }
            long j6 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j6 > 2147483647L ? Integer.MAX_VALUE : j6 < -2147483648L ? Integer.MIN_VALUE : (int) j6;
        }
        if (c0048d.read() == -1) {
            return h(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static s J(List list) {
        if (list == null || list.isEmpty()) {
            return l(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((q2.i) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        s sVar = new s();
        q2.m mVar = new q2.m(list.size(), sVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            q2.i iVar = (q2.i) it2.next();
            r rVar = q2.k.f12353b;
            iVar.b(rVar, mVar);
            iVar.a(rVar, mVar);
            s sVar2 = (s) iVar;
            sVar2.f12375b.k(new p(rVar, (InterfaceC1260c) mVar));
            sVar2.p();
        }
        return sVar;
    }

    public static int K(int i6) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i7 = 0; i7 < 6; i7++) {
            int i8 = iArr[i7];
            int i9 = i8 - 1;
            if (i8 == 0) {
                throw null;
            }
            if (i9 == i6) {
                return i8;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8 A[Catch: all -> 0x00a4, PHI: r1
      0x00a8: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:46:0x00a1] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x009f, B:60:0x00ce, B:12:0x001f, B:51:0x00a7, B:52:0x00a8, B:63:0x00d2, B:64:0x00d3, B:53:0x00a9, B:59:0x00cd, B:58:0x00b3, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0073, B:42:0x0083, B:43:0x009d, B:18:0x003c), top: B:74:0x0003, inners: #0, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader L() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.L():java.lang.ClassLoader");
    }

    public static Object M(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder("Invalid conditional user property field type. '");
        sb.append(str);
        sb.append("' expected [");
        sb.append(canonicalName);
        sb.append("] but was [");
        throw new IllegalStateException(AbstractC0628i.m(sb, canonicalName2, "]"));
    }

    public static Object N(q2.i iVar) throws ExecutionException {
        if (iVar.f()) {
            return iVar.d();
        }
        if (((s) iVar).f12377d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.c());
    }

    public static void O(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                H.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                H.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                H.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static Object b(q2.i iVar) throws InterruptedException {
        AbstractC1332d.j("Must not be called on the main application thread");
        AbstractC1332d.i();
        AbstractC1332d.n(iVar, "Task must not be null");
        if (iVar.e()) {
            return N(iVar);
        }
        q2.l lVar = new q2.l();
        r rVar = q2.k.f12353b;
        iVar.b(rVar, lVar);
        iVar.a(rVar, lVar);
        s sVar = (s) iVar;
        sVar.f12375b.k(new p(rVar, (InterfaceC1260c) lVar));
        sVar.p();
        Object obj = lVar.f12355x;
        switch (2) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((CountDownLatch) obj).await();
                break;
            default:
                ((s) obj).n(null);
                break;
        }
        return N(iVar);
    }

    public static Object c(s sVar, long j6, TimeUnit timeUnit) throws TimeoutException {
        AbstractC1332d.j("Must not be called on the main application thread");
        AbstractC1332d.i();
        AbstractC1332d.n(sVar, "Task must not be null");
        AbstractC1332d.n(timeUnit, "TimeUnit must not be null");
        if (sVar.e()) {
            return N(sVar);
        }
        q2.l lVar = new q2.l();
        r rVar = q2.k.f12353b;
        sVar.b(rVar, lVar);
        sVar.a(rVar, lVar);
        sVar.f12375b.k(new p(rVar, (InterfaceC1260c) lVar));
        sVar.p();
        if (((CountDownLatch) lVar.f12355x).await(j6, timeUnit)) {
            return N(sVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static final y d(E e6) {
        AbstractC1305a.o(e6, "<this>");
        return new y(e6);
    }

    public static s f(Executor executor, Callable callable) {
        AbstractC1332d.n(executor, "Executor must not be null");
        s sVar = new s();
        executor.execute(new RunnableC1028c1(sVar, callable, 10));
        return sVar;
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] h(ArrayDeque arrayDeque, int i6) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i6) {
            return bArr;
        }
        int length = i6 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i6);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i6 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static ImageView.ScaleType i(int i6) {
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 5 ? i6 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static C0654b j(String str, String str2) {
        L3.a aVar = new L3.a(str, str2);
        C0653a c0653aB = C0654b.b(L3.a.class);
        c0653aB.f8178e = 1;
        c0653aB.f8179f = new G(0, aVar);
        return c0653aB.b();
    }

    public static void k(View view, o oVar) {
        WeakHashMap weakHashMap = V.f1964a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        C1389b0 c1389b0 = new C1389b0();
        c1389b0.f13084a = paddingStart;
        c1389b0.f13085b = paddingTop;
        c1389b0.f13086c = paddingEnd;
        c1389b0.f13087d = paddingBottom;
        I.u(view, new C1358b(oVar, 28, c1389b0));
        if (view.isAttachedToWindow()) {
            N.G.c(view);
        } else {
            view.addOnAttachStateChangeListener(new n());
        }
    }

    public static s l(Object obj) {
        s sVar = new s();
        sVar.l(obj);
        return sVar;
    }

    public static C0654b m(String str, C0095h c0095h) {
        C0653a c0653aB = C0654b.b(L3.a.class);
        c0653aB.f8178e = 1;
        c0653aB.a(d3.k.b(Context.class));
        c0653aB.f8179f = new L3.d(0, c0095h, str);
        return c0653aB.b();
    }

    public static ArrayList n(Context context) {
        int i6 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = t4.p.f12756w;
        }
        ArrayList arrayListA0 = t4.n.a0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListA0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i6) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t4.k.W(arrayList));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            AbstractC1305a.n(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new C0134u(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, AbstractC1305a.c(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static ColorStateList o(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (colorStateListB = E.f.b(context, resourceId)) == null) ? typedArray.getColorStateList(i6) : colorStateListB;
    }

    public static ColorStateList p(Context context, C0803c c0803c, int i6) {
        int iB;
        ColorStateList colorStateListB;
        return (!c0803c.G(i6) || (iB = c0803c.B(i6, 0)) == 0 || (colorStateListB = E.f.b(context, iB)) == null) ? c0803c.s(i6) : colorStateListB;
    }

    public static int q(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static int r(Context context, TypedArray typedArray, int i6, int i7) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i6, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i6, i7);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i7);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable s(Context context, TypedArray typedArray, int i6) {
        int resourceId;
        Drawable drawableP;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0 || (drawableP = AbstractC0651b.p(context, resourceId)) == null) ? typedArray.getDrawable(i6) : drawableP;
    }

    public static SharedPreferences t(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final boolean u(AssertionError assertionError) {
        String message;
        Logger logger = u.f8489a;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !K4.h.W(message, "getsockname failed")) ? false : true;
    }

    public static boolean v(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean w(View view) {
        WeakHashMap weakHashMap = V.f1964a;
        return view.getLayoutDirection() == 1;
    }

    public static boolean x(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static float y(float f6, float f7, float f8) {
        return (f8 * f7) + ((1.0f - f8) * f6);
    }

    public static V2.e z(V2.e eVar) {
        if ((eVar instanceof V2.g) || (eVar instanceof V2.f)) {
            return eVar;
        }
        if (eVar instanceof Serializable) {
            return new V2.f(eVar);
        }
        V2.g gVar = new V2.g();
        gVar.f3737w = eVar;
        return gVar;
    }

    public abstract AbstractC0242j e(Context context, Looper looper, C0239g c0239g, Object obj, V1.i iVar, V1.j jVar);
}
