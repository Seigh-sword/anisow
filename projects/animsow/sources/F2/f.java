package f2;

import I0.o;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f8405d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f8406e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f8407f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f8408g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f8409h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static l f8413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static m f8414m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8415a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f8410i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f8411j = new j(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final V0.m f8412k = new V0.m(25);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V0.m f8403b = new V0.m(27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f8404c = new o(28);

    public f(Context context) {
        this.f8415a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC1332d.D(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e6) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e6.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r10 != 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[Catch: all -> 0x008d, TryCatch #9 {all -> 0x008d, blocks: (B:9:0x0053, B:13:0x0081, B:21:0x0097, B:24:0x009d, B:27:0x00b1, B:105:0x021c, B:106:0x0223, B:109:0x0226, B:110:0x0227, B:111:0x022e, B:112:0x022f, B:114:0x024d, B:116:0x025a), top: B:160:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #9 {all -> 0x008d, blocks: (B:9:0x0053, B:13:0x0081, B:21:0x0097, B:24:0x009d, B:27:0x00b1, B:105:0x021c, B:106:0x0223, B:109:0x0226, B:110:0x0227, B:111:0x022e, B:112:0x022f, B:114:0x024d, B:116:0x025a), top: B:160:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [f2.k] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f2.f c(android.content.Context r23, f2.e r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.c(android.content.Context, f2.e, java.lang.String):f2.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00af A[Catch: all -> 0x0036, TryCatch #9 {, blocks: (B:9:0x0026, B:11:0x0032, B:53:0x00b7, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00ac, B:52:0x00af, B:17:0x003e), top: B:146:0x0026, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[PHI: r9
      0x0097: PHI (r9v8 boolean) = (r9v7 boolean), (r9v12 boolean), (r9v12 boolean) binds: [B:11:0x0055, B:29:0x008e, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void f(ClassLoader classLoader) throws C0698b {
        m mVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                mVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f8414m = mVar;
        } catch (ClassNotFoundException e6) {
            e = e6;
            throw new C0698b("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new C0698b("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e8) {
            e = e8;
            throw new C0698b("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e9) {
            e = e9;
            throw new C0698b("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new C0698b("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f8409h)) {
            return true;
        }
        boolean z5 = false;
        if (f8409h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (U1.f.f3588b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z5 = true;
            }
            f8409h = Boolean.valueOf(z5);
            if (z5 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f8407f = true;
            }
        }
        if (!z5) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z5;
    }

    public static l h(Context context) {
        l lVar;
        synchronized (f.class) {
            l lVar2 = f8413l;
            if (lVar2 != null) {
                return lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (lVar != null) {
                    f8413l = lVar;
                    return lVar;
                }
            } catch (Exception e6) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e6.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws C0698b {
        try {
            return (IBinder) this.f8415a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
            throw new C0698b("Failed to instantiate module class: ".concat(str), e6);
        }
    }
}
