package m2;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0422g4;
import com.google.android.gms.internal.measurement.C0434i4;
import com.google.android.gms.internal.measurement.C0523x4;
import com.google.android.gms.internal.measurement.C0535z4;
import com.google.android.gms.internal.measurement.InterfaceC0440j4;
import com.google.android.gms.internal.measurement.InterfaceC0517w4;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0654b;
import h3.InterfaceC0773a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l3.InterfaceC0940c;
import org.json.JSONObject;
import r3.C1275a;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: m2.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C1017B implements InterfaceC1019D, InterfaceC0773a, InterfaceC0940c, r3.c, d3.f, S3.q {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static C1017B f10487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static C1017B f10488y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static C1017B f10489z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10490w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1017B() {
        this(2, (Object) null);
        this.f10490w = 2;
    }

    public static void j(int i6, int i7) {
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(H1.a.k("index: ", i6, ", size: ", i7));
        }
    }

    public static void k(int i6, int i7) {
        if (i6 < 0 || i6 > i7) {
            throw new IndexOutOfBoundsException(H1.a.k("index: ", i6, ", size: ", i7));
        }
    }

    public static void l(int i6, int i7, int i8) {
        if (i6 >= 0 && i7 <= i8) {
            if (i6 > i7) {
                throw new IllegalArgumentException(H1.a.k("fromIndex: ", i6, " > toIndex: ", i7));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i6 + ", toIndex: " + i7 + ", size: " + i8);
    }

    public static C1275a n(C1018C c1018c) {
        N.r rVar = new N.r(8);
        l1.l lVar = new l1.l(true, false, false);
        c1018c.getClass();
        return new C1275a(System.currentTimeMillis() + ((long) 3600000), rVar, lVar, 10.0d, 1.2d, 60);
    }

    public static a4.c o(String str) {
        a4.c cVar;
        if (str != null) {
            a4.c[] cVarArrValues = a4.c.values();
            int length = cVarArrValues.length;
            while (true) {
                length--;
                if (length < 0) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[length];
                String strName = cVar.name();
                if (strName != null && strName.equalsIgnoreCase(str)) {
                    break;
                }
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return a4.c.f5026y;
    }

    public static N3.O p() {
        Object objB = Y2.g.c().b(N3.O.class);
        AbstractC1305a.n(objB, "Firebase.app[SessionGenerator::class.java]");
        return (N3.O) objB;
    }

    @Override // m2.InterfaceC1019D
    public final Object a() {
        switch (this.f10490w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0535z4) ((InterfaceC0517w4) C0523x4.f6998x.get())).getClass();
                Boolean bool = (Boolean) C0535z4.f7020a.a();
                bool.getClass();
                return bool;
            default:
                ((C0434i4) ((InterfaceC0440j4) C0422g4.f6830x.get())).getClass();
                Boolean bool2 = (Boolean) C0434i4.f6837a.a();
                bool2.getClass();
                return bool2;
        }
    }

    @Override // r3.c
    public final C1275a c(C1018C c1018c, JSONObject jSONObject) {
        return n(c1018c);
    }

    @Override // d3.f
    public final List d(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0654b c0654b : componentRegistrar.getComponents()) {
            String str = c0654b.f8181a;
            if (str != null) {
                L3.d dVar = new L3.d(1, c0654b, str);
                c0654b = new C0654b(str, c0654b.f8182b, c0654b.f8183c, c0654b.f8184d, c0654b.f8185e, dVar, c0654b.f8187g);
            }
            arrayList.add(c0654b);
        }
        return arrayList;
    }

    @Override // l3.InterfaceC0940c
    public final String e() {
        return null;
    }

    @Override // h3.InterfaceC0773a
    public final void f(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // S3.q
    public final Object h() {
        switch (this.f10490w) {
            case 14:
                return new LinkedHashSet();
            case 15:
                return new ArrayList();
            case 16:
                return new ConcurrentHashMap();
            default:
                return new LinkedHashMap();
        }
    }

    public float i(float f6, float f7) {
        return 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [E3.d] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(E3.d r9, v4.InterfaceC1427e r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof N3.r
            if (r0 == 0) goto L13
            r0 = r10
            N3.r r0 = (N3.r) r0
            int r1 = r0.f2263C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2263C = r1
            goto L18
        L13:
            N3.r r0 = new N3.r
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f2261A
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2263C
            java.lang.String r3 = ""
            java.lang.String r4 = "InstallationId"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.f2264z
            java.lang.String r9 = (java.lang.String) r9
            S3.a.O(r10)     // Catch: java.lang.Exception -> L33
            goto L95
        L33:
            r10 = move-exception
            goto L9e
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f2264z
            E3.d r9 = (E3.d) r9
            S3.a.O(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L78
        L48:
            S3.a.O(r10)
            r10 = r9
            E3.c r10 = (E3.c) r10     // Catch: java.lang.Exception -> L46
            q2.s r9 = r10.d()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            s4.AbstractC1305a.n(r9, r2)     // Catch: java.lang.Exception -> L76
            r0.f2264z = r10     // Catch: java.lang.Exception -> L76
            r0.f2263C = r6     // Catch: java.lang.Exception -> L76
            java.lang.Object r9 = s4.AbstractC1305a.e(r9, r0)     // Catch: java.lang.Exception -> L76
            if (r9 != r1) goto L62
            return r1
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            E3.a r10 = (E3.a) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.f393a     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            s4.AbstractC1305a.n(r10, r2)     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L72:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L78
        L76:
            r9 = move-exception
            goto L72
        L78:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r4, r2, r10)
            r10 = r9
            r9 = r3
        L7f:
            E3.c r10 = (E3.c) r10     // Catch: java.lang.Exception -> L33
            q2.s r10 = r10.c()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "firebaseInstallations.id"
            s4.AbstractC1305a.n(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.f2264z = r9     // Catch: java.lang.Exception -> L33
            r0.f2263C = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = s4.AbstractC1305a.e(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L95
            return r1
        L95:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            s4.AbstractC1305a.n(r10, r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            r3 = r10
            goto La3
        L9e:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r4, r0, r10)
        La3:
            N3.s r10 = new N3.s
            r10.<init>(r3, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1017B.m(E3.d, v4.e):java.lang.Object");
    }

    public C1017B(int i6) {
        this.f10490w = i6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1017B(int i6, int i7) {
        this.f10490w = i6;
        Object obj = null;
        int i8 = 19;
        if (i6 != 19) {
            switch (i6) {
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    this(8, obj);
                    break;
                case 9:
                    this(9, obj);
                    break;
                case 10:
                    this(10, obj);
                    break;
                case 11:
                    this(11, obj);
                    break;
                case 12:
                    this(12, obj);
                    break;
                default:
                    switch (i6) {
                        case 21:
                            this(21, obj);
                            break;
                        case 22:
                            this(22, obj);
                            break;
                        case 23:
                            this(23, obj);
                            break;
                        case 24:
                            this(24, obj);
                            break;
                        case 25:
                            this(25, obj);
                            break;
                        case 26:
                            this(26, obj);
                            break;
                        case 27:
                            this(27, obj);
                            break;
                        case 28:
                            this(28, obj);
                            break;
                        default:
                            this(7, obj);
                            break;
                    }
                    break;
            }
            return;
        }
        this(i8, obj);
    }

    public /* synthetic */ C1017B(int i6, Object obj) {
        this.f10490w = i6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1017B(Object obj) {
        this(4, (Object) null);
        this.f10490w = 4;
    }

    @Override // l3.InterfaceC0940c
    public final void b() {
    }

    @Override // l3.InterfaceC0940c
    public final void g(String str, long j6) {
    }
}
