package Y2;

import N.I;
import N.V;
import a3.C0262c;
import a3.InterfaceC0260a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import d.AbstractC0628i;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import m2.C0;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Thread f4806a;

    public static TimeInterpolator A(Context context, int i6, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!q(strValueOf, "cubic-bezier") && !q(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!q(strValueOf, "cubic-bezier")) {
            if (q(strValueOf, "path")) {
                return P.a.c(com.bumptech.glide.d.k(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return P.a.b(n(0, strArrSplit), n(1, strArrSplit), n(2, strArrSplit), n(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static void B(View view, P2.g gVar) {
        G2.a aVar = gVar.f2457w.f2418b;
        if (aVar == null || !aVar.f863a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = V.f1964a;
            fI += I.i((View) parent);
        }
        P2.f fVar = gVar.f2457w;
        if (fVar.f2429m != fI) {
            fVar.f2429m = fI;
            gVar.s();
        }
    }

    public static boolean C(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static int D(int i6) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i6) * (-862048943)), 15)) * 461845907);
    }

    public static int E(Object obj) {
        return D(obj == null ? 0 : obj.hashCode());
    }

    public static int F(int i6, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i6] & 255 : obj instanceof short[] ? ((short[]) obj)[i6] & 65535 : ((int[]) obj)[i6];
    }

    public static void G(int i6, int i7, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i6] = (byte) i7;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i6] = (short) i7;
        } else {
            ((int[]) obj)[i6] = i7;
        }
    }

    public static int a(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC0628i.f("Unknown visibility ", visibility));
    }

    public static String b(String str, int i6, int i7) {
        if (i6 < 0) {
            return C0.m("%s (%s) must not be negative", str, Integer.valueOf(i6));
        }
        if (i7 >= 0) {
            return C0.m("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i6), Integer.valueOf(i7));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = d(r9, r10, r11)
            boolean r1 = d(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = t(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.b.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean d(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void e(int i6, int i7) {
        String strM;
        if (i6 < 0 || i6 >= i7) {
            if (i6 < 0) {
                strM = C0.m("%s (%s) must not be negative", "index", Integer.valueOf(i6));
            } else {
                if (i7 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i7);
                    throw new IllegalArgumentException(sb.toString());
                }
                strM = C0.m("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i6), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strM);
        }
    }

    public static void f(int i6, Object[] objArr) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (objArr[i7] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i7);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void g(int i6, String str) {
        if (i6 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void h(int i6, int i7) {
        if (i6 < 0 || i6 > i7) {
            throw new IndexOutOfBoundsException(b("index", i6, i7));
        }
    }

    public static void i(int i6, int i7, int i8) {
        if (i6 < 0 || i7 < i6 || i7 > i8) {
            throw new IndexOutOfBoundsException((i6 < 0 || i6 > i8) ? b("start index", i6, i8) : (i7 < 0 || i7 > i8) ? b("end index", i7, i8) : C0.m("end index (%s) must not be less than start index (%s)", Integer.valueOf(i7), Integer.valueOf(i6)));
        }
    }

    public static com.bumptech.glide.d j(int i6) {
        return i6 != 0 ? i6 != 1 ? new P2.i() : new P2.d() : new P2.i();
    }

    public static Object k(int i6) {
        if (i6 >= 2 && i6 <= 1073741824 && Integer.highestOneBit(i6) == i6) {
            return i6 <= 256 ? new byte[i6] : i6 <= 65536 ? new short[i6] : new int[i6];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean l() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            g.c();
            g gVarC = g.c();
            gVarC.a();
            Context context = gVarC.f4816a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void m(Future future) {
        if (!future.isDone()) {
            throw new IllegalStateException(C0.m("Future was expected to be done: %s", future));
        }
        boolean z5 = false;
        while (true) {
            try {
                future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    public static float n(int i6, String[] strArr) {
        float f6 = Float.parseFloat(strArr[i6]);
        if (f6 >= 0.0f && f6 <= 1.0f) {
            return f6;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f6);
    }

    public static boolean p(int i6, Rect rect, Rect rect2) {
        if (i6 == 17) {
            int i7 = rect.right;
            int i8 = rect2.right;
            return (i7 > i8 || rect.left >= i8) && rect.left > rect2.left;
        }
        if (i6 == 33) {
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            return (i9 > i10 || rect.top >= i10) && rect.top > rect2.top;
        }
        if (i6 == 66) {
            int i11 = rect.left;
            int i12 = rect2.left;
            return (i11 < i12 || rect.right <= i12) && rect.right < rect2.right;
        }
        if (i6 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        return (i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom;
    }

    public static boolean q(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[PHI: r2
      0x00da: PHI (r2v22 java.lang.String) = (r2v21 java.lang.String), (r2v72 java.lang.String) binds: [B:38:0x00c2, B:42:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d A[Catch: NumberFormatException -> 0x0192, TRY_ENTER, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x0192, blocks: (B:97:0x018d, B:107:0x01ae), top: B:128:0x018b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(android.content.Intent r24) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.b.r(android.content.Intent):void");
    }

    public static void s(String str, Bundle bundle) {
        try {
            g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e6) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e6);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e7);
                }
            }
            String str2 = K1.b.v(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC0260a interfaceC0260a = (InterfaceC0260a) g.c().b(InterfaceC0260a.class);
            if (interfaceC0260a != null) {
                ((C0262c) interfaceC0260a).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static int t(int i6, Rect rect, Rect rect2) {
        int i7;
        int i8;
        if (i6 == 17) {
            i7 = rect.left;
            i8 = rect2.right;
        } else if (i6 == 33) {
            i7 = rect.top;
            i8 = rect2.bottom;
        } else if (i6 == 66) {
            i7 = rect2.left;
            i8 = rect.right;
        } else {
            if (i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i7 = rect2.top;
            i8 = rect.bottom;
        }
        return Math.max(0, i7 - i8);
    }

    public static int u(int i6, int i7, int i8) {
        return (i6 & (~i8)) | (i7 & i8);
    }

    public static int v(int i6, Rect rect, Rect rect2) {
        int iHeight;
        int i7;
        int iHeight2;
        if (i6 == 17) {
            iHeight = (rect.height() / 2) + rect.top;
            i7 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = (rect.height() / 2) + rect.top;
                i7 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = (rect.width() / 2) + rect.left;
            i7 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - ((iHeight2 / 2) + i7));
    }

    public static int y(Object obj, Object obj2, int i6, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i7;
        int i8;
        int iE = E(obj);
        int i9 = iE & i6;
        int iF = F(i9, obj3);
        if (iF == 0) {
            return -1;
        }
        int i10 = ~i6;
        int i11 = iE & i10;
        int i12 = -1;
        while (true) {
            i7 = iF - 1;
            i8 = iArr[i7];
            if ((i8 & i10) == i11 && C0.d(obj, objArr[i7]) && (objArr2 == null || C0.d(obj2, objArr2[i7]))) {
                break;
            }
            int i13 = i8 & i6;
            if (i13 == 0) {
                return -1;
            }
            i12 = i7;
            iF = i13;
        }
        int i14 = i8 & i6;
        if (i12 == -1) {
            G(i9, i14, obj3);
        } else {
            iArr[i12] = u(iArr[i12], i14, i6);
        }
        return i7;
    }

    public static int z(Context context, int i6, int i7) {
        TypedValue typedValueO = C0.o(context, i6);
        return (typedValueO == null || typedValueO.type != 16) ? i7 : typedValueO.data;
    }

    public abstract Object o(InterfaceC1427e interfaceC1427e);

    public abstract Object w(Uri uri, InputEvent inputEvent, InterfaceC1427e interfaceC1427e);

    public abstract Object x(Uri uri, InterfaceC1427e interfaceC1427e);
}
