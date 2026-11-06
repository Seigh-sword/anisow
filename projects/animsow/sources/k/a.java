package K;

import I0.n;
import I0.o;
import J0.k;
import J0.m;
import T1.q;
import W1.b0;
import W1.c0;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.measurement.C0393c;
import com.google.android.gms.internal.measurement.C0512w;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.InterfaceC0394c0;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.measurement.X0;
import i.C0803c;
import j3.C0851a;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.C0878a;
import m2.B1;
import m2.BinderC1066p0;
import m2.C0;
import m2.C1021a0;
import m2.C1029d;
import m2.C1033e0;
import m2.C1042h0;
import m2.C1051k0;
import m2.C1074u;
import m2.C1076v;
import m2.EnumC1083y0;
import m2.G1;
import m2.H1;
import m2.InterfaceC1055l1;
import m2.N;
import m2.P;
import m2.ServiceConnectionC1024b0;
import m2.Y0;
import m2.x1;
import q2.s;
import q3.C1265c;
import t0.AbstractC1332d;
import u2.C1368a;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f1469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f1470y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f1471z;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i6) {
        this.f1468w = i6;
        this.f1471z = obj;
        this.f1469x = obj2;
        this.f1470y = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [J0.m] */
    private void a() {
        Object obj = this.f1470y;
        ?? r32 = this.f1471z;
        try {
            try {
                n nVar = (n) ((T0.i) this.f1469x).get();
                if (nVar == null) {
                    o.w().v(m.f1224O, ((m) r32).f1242z.f2902c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                } else {
                    o.w().u(m.f1224O, String.format("%s returned a %s result.", ((m) r32).f1242z.f2902c, nVar), new Throwable[0]);
                    ((m) r32).f1227C = nVar;
                }
            } catch (InterruptedException e6) {
                e = e6;
                o.w().v(m.f1224O, ((String) obj) + " failed because it threw an exception/error", e);
            } catch (CancellationException e7) {
                o.w().x(m.f1224O, ((String) obj) + " was cancelled", e7);
            } catch (ExecutionException e8) {
                e = e8;
                o.w().v(m.f1224O, ((String) obj) + " failed because it threw an exception/error", e);
            }
            r32 = (m) r32;
            r32.c();
        } catch (Throwable th) {
            ((m) r32).c();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i6;
        s sVarB;
        X0 x02;
        C1074u c1074u;
        AtomicReference atomicReference;
        int i7 = 0;
        boolean zBooleanValue = true;
        char c6 = 1;
        Object objCall = null;
        strU = null;
        strU = null;
        String strU = null;
        switch (this.f1468w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                L3.c cVar = (L3.c) this.f1469x;
                Typeface typeface = (Typeface) this.f1470y;
                com.bumptech.glide.d dVar = (com.bumptech.glide.d) cVar.f1734x;
                if (dVar != null) {
                    dVar.t(typeface);
                    return;
                }
                return;
            case 1:
                ((M.a) this.f1469x).a(this.f1470y);
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    objCall = ((Callable) this.f1469x).call();
                    break;
                } catch (Exception unused) {
                }
                ((Handler) this.f1471z).post(new a(this, (M.a) this.f1470y, objCall, c6 == true ? 1 : 0));
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    zBooleanValue = ((Boolean) ((X2.a) this.f1471z).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((J0.a) this.f1469x).a((String) this.f1470y, zBooleanValue);
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                Object obj = this.f1470y;
                Object obj2 = this.f1471z;
                try {
                    ((X2.a) this.f1469x).get();
                    o.w().u(m.f1224O, "Starting work for " + ((m) obj2).f1242z.f2902c, new Throwable[0]);
                    ((m) obj2).f1237M = ((m) obj2).f1225A.e();
                    ((T0.i) obj).l(((m) obj2).f1237M);
                    return;
                } catch (Throwable th) {
                    ((T0.i) obj).k(th);
                    return;
                }
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                a();
                return;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                R0.i iVarK = ((WorkDatabase) this.f1469x).n().k((String) this.f1470y);
                if (iVarK == null || !iVarK.b()) {
                    return;
                }
                synchronized (((Q0.c) this.f1471z).f2783y) {
                    ((Q0.c) this.f1471z).f2777B.put((String) this.f1470y, iVarK);
                    ((Q0.c) this.f1471z).f2778C.add(iVarK);
                    Object obj3 = this.f1471z;
                    ((Q0.c) obj3).f2779D.b(((Q0.c) obj3).f2778C);
                    break;
                }
                return;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((k) this.f1469x).f1211m.g((String) this.f1470y, (C0803c) this.f1471z);
                return;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                T1.a aVar = (T1.a) this.f1470y;
                Intent intent = aVar.f3404w;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    sVarB = f2.h.l(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = aVar.f3404w;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.f3404w;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.f1469x;
                    bundle.putBoolean("supports_message_handled", true);
                    q qVarA = q.a(context);
                    synchronized (qVarA) {
                        i6 = qVarA.f3446a;
                        qVarA.f3446a = i6 + 1;
                    }
                    sVarB = qVarA.b(new T1.n(i6, 2, bundle, 0));
                }
                sVarB.h(T1.i.f3423w, new T1.j(i7, (CountDownLatch) this.f1471z));
                return;
            case 9:
                b0 b0Var = (b0) this.f1471z;
                int i8 = b0Var.f4290x;
                Object obj4 = this.f1469x;
                if (i8 > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj4;
                    Bundle bundle2 = b0Var.f4291y;
                    lifecycleCallback.d(bundle2 != null ? bundle2.getBundle((String) this.f1470y) : null);
                }
                if (b0Var.f4290x >= 2) {
                    ((LifecycleCallback) obj4).g();
                }
                if (b0Var.f4290x >= 3) {
                    ((LifecycleCallback) obj4).e();
                }
                if (b0Var.f4290x >= 4) {
                    ((LifecycleCallback) obj4).h();
                }
                if (b0Var.f4290x >= 5) {
                    ((LifecycleCallback) obj4).getClass();
                    return;
                }
                return;
            case 10:
                c0 c0Var = (c0) this.f1471z;
                int i9 = c0Var.f4298u0;
                Object obj5 = this.f1469x;
                if (i9 > 0) {
                    LifecycleCallback lifecycleCallback2 = (LifecycleCallback) obj5;
                    Bundle bundle3 = c0Var.f4299v0;
                    lifecycleCallback2.d(bundle3 != null ? bundle3.getBundle((String) this.f1470y) : null);
                }
                if (c0Var.f4298u0 >= 2) {
                    ((LifecycleCallback) obj5).g();
                }
                if (c0Var.f4298u0 >= 3) {
                    ((LifecycleCallback) obj5).e();
                }
                if (c0Var.f4298u0 >= 4) {
                    ((LifecycleCallback) obj5).h();
                }
                if (c0Var.f4298u0 >= 5) {
                    ((LifecycleCallback) obj5).getClass();
                    return;
                }
                return;
            case 11:
                ServiceConnectionC1024b0 serviceConnectionC1024b0 = (ServiceConnectionC1024b0) this.f1471z;
                C1021a0 c1021a0 = serviceConnectionC1024b0.f10851x;
                String str = serviceConnectionC1024b0.f10850w;
                J j6 = (J) this.f1469x;
                C1051k0 c1051k0 = c1021a0.f10841a;
                C1042h0 c1042h0 = c1051k0.f10984F;
                C1051k0.i(c1042h0);
                c1042h0.r();
                N n5 = c1051k0.f10983E;
                if (j6 != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("package_name", str);
                    try {
                        L l5 = (L) j6;
                        Parcel parcelB = l5.b();
                        G.c(parcelB, bundle4);
                        Parcel parcelE = l5.E(parcelB, 1);
                        Bundle bundle5 = (Bundle) G.a(parcelE, Bundle.CREATOR);
                        parcelE.recycle();
                        if (bundle5 == null) {
                            C1051k0.i(n5);
                            n5.f10715B.d("Install Referrer Service returned a null response");
                        }
                    } catch (Exception e6) {
                        C1051k0.i(n5);
                        n5.f10715B.c(e6.getMessage(), "Exception occurred while retrieving the Install Referrer");
                    }
                    break;
                } else {
                    C1051k0.i(n5);
                    n5.f10718E.d("Attempting to use Install Referrer Service while it is not initialized");
                }
                C1042h0 c1042h02 = c1021a0.f10841a.f10984F;
                C1051k0.i(c1042h02);
                c1042h02.r();
                throw new IllegalStateException("Unexpected call on client side");
            case 12:
                BinderC1066p0 binderC1066p0 = (BinderC1066p0) this.f1471z;
                binderC1066p0.f11055c.b0();
                C1029d c1029d = (C1029d) this.f1469x;
                Object objA = c1029d.f10873y.a();
                Object obj6 = this.f1470y;
                if (objA == null) {
                    binderC1066p0.f11055c.u(c1029d, (B1) obj6);
                    return;
                } else {
                    binderC1066p0.f11055c.J(c1029d, (B1) obj6);
                    return;
                }
            case 13:
                BinderC1066p0 binderC1066p02 = (BinderC1066p0) this.f1471z;
                C1076v c1076vL = (C1076v) this.f1469x;
                binderC1066p02.getClass();
                if ("_cmp".equals(c1076vL.f11113w) && (c1074u = c1076vL.f11114x) != null) {
                    Bundle bundle6 = c1074u.f11108w;
                    if (bundle6.size() != 0) {
                        String string = bundle6.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            binderC1066p02.f11055c.f().f10721H.c(c1076vL.toString(), "Event has been filtered ");
                            c1076vL = new C1076v("_cmpx", c1076vL.f11114x, c1076vL.f11115y, c1076vL.f11116z);
                        }
                    }
                }
                String str2 = c1076vL.f11113w;
                B1 b1 = (B1) this.f1470y;
                x1 x1Var = binderC1066p02.f11055c;
                C1033e0 c1033e0 = x1Var.f11270w;
                H1 h12 = x1Var.f11243C;
                x1.x(c1033e0);
                String str3 = b1.f10525w;
                if (!TextUtils.isEmpty(str3) && (x02 = (X0) c1033e0.f10891D.getOrDefault(str3, null)) != null && x02.p() != 0) {
                    P p5 = x1Var.f().f10723J;
                    String str4 = b1.f10525w;
                    p5.c(str4, "EES config found for");
                    C1033e0 c1033e02 = x1Var.f11270w;
                    x1.x(c1033e02);
                    C0512w c0512w = TextUtils.isEmpty(str4) ? null : (C0512w) c1033e02.f10893F.b(str4);
                    if (c0512w == null) {
                        x1Var.f().f10723J.c(str4, "EES not loaded for");
                    } else {
                        try {
                            x1.x(h12);
                            HashMap mapJ = H1.J(c1076vL.f11114x.c(), true);
                            String strS = C0.s(str2, C0.f10532c, C0.f10530a);
                            if (strS == null) {
                                strS = str2;
                            }
                            if (c0512w.b(new C0393c(strS, c1076vL.f11116z, mapJ))) {
                                C0803c c0803c = c0512w.f6983c;
                                boolean z5 = !((C0393c) c0803c.f9278y).equals((C0393c) c0803c.f9277x);
                                C0803c c0803c2 = c0512w.f6983c;
                                if (z5) {
                                    x1Var.f().f10723J.c(str2, "EES edited event");
                                    x1.x(h12);
                                    c1076vL = H1.L((C0393c) c0803c2.f9278y);
                                }
                                binderC1066p02.F(c1076vL, b1);
                                if (!((List) c0512w.f6983c.f9279z).isEmpty()) {
                                    for (C0393c c0393c : (List) c0803c2.f9279z) {
                                        x1Var.f().f10723J.c(c0393c.f6770a, "EES logging created event");
                                        x1.x(h12);
                                        binderC1066p02.F(H1.L(c0393c), b1);
                                    }
                                    return;
                                }
                                return;
                            }
                        } catch (K unused3) {
                            x1Var.f().f10715B.b(b1.f10526x, str2, "EES error. appId, eventName");
                        }
                        x1Var.f().f10723J.c(str2, "EES was not applied to event");
                    }
                }
                binderC1066p02.F(c1076vL, b1);
                return;
            case 14:
                BinderC1066p0 binderC1066p03 = (BinderC1066p0) this.f1471z;
                binderC1066p03.f11055c.b0();
                binderC1066p03.f11055c.v((C1076v) this.f1469x, (String) this.f1470y);
                return;
            case 15:
                BinderC1066p0 binderC1066p04 = (BinderC1066p0) this.f1471z;
                binderC1066p04.f11055c.b0();
                G1 g12 = (G1) this.f1469x;
                Object objA2 = g12.a();
                Object obj7 = this.f1470y;
                if (objA2 == null) {
                    binderC1066p04.f11055c.s(g12.f10636x, (B1) obj7);
                    return;
                } else {
                    binderC1066p04.f11055c.y(g12, (B1) obj7);
                    return;
                }
            case 16:
                synchronized (((AtomicReference) this.f1469x)) {
                    try {
                        try {
                        } catch (RemoteException e7) {
                            ((Y0) this.f1471z).f().f10715B.c(e7, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f1469x;
                        }
                        if (((Y0) this.f1471z).p().C().i(EnumC1083y0.f11278y)) {
                            Object obj8 = this.f1471z;
                            m2.G g4 = ((Y0) obj8).f10831z;
                            if (g4 == null) {
                                ((Y0) obj8).f().f10715B.d("Failed to get app instance id");
                                ((AtomicReference) this.f1469x).notify();
                            } else {
                                AbstractC1332d.m((B1) this.f1470y);
                                ((AtomicReference) this.f1469x).set(g4.u((B1) this.f1470y));
                                String str5 = (String) ((AtomicReference) this.f1469x).get();
                                if (str5 != null) {
                                    ((Y0) this.f1471z).u().X(str5);
                                    ((Y0) this.f1471z).p().f10804D.e(str5);
                                }
                                ((Y0) this.f1471z).M();
                                atomicReference = (AtomicReference) this.f1469x;
                                atomicReference.notify();
                            }
                        } else {
                            ((Y0) this.f1471z).f().f10720G.d("Analytics storage consent denied; will not get app instance id");
                            ((Y0) this.f1471z).u().X(null);
                            ((Y0) this.f1471z).p().f10804D.e(null);
                            ((AtomicReference) this.f1469x).set(null);
                        }
                    } finally {
                        ((AtomicReference) this.f1469x).notify();
                    }
                }
                return;
            case 17:
                Object obj9 = this.f1469x;
                Object obj10 = this.f1470y;
                Object obj11 = this.f1471z;
                try {
                    try {
                        if (((Y0) obj11).p().C().i(EnumC1083y0.f11278y)) {
                            m2.G g6 = ((Y0) obj11).f10831z;
                            if (g6 == null) {
                                ((Y0) obj11).f().f10715B.d("Failed to get app instance id");
                            } else {
                                AbstractC1332d.m((B1) obj9);
                                strU = g6.u((B1) obj9);
                                if (strU != null) {
                                    ((Y0) obj11).u().X(strU);
                                    ((Y0) obj11).p().f10804D.e(strU);
                                }
                                ((Y0) obj11).M();
                            }
                        } else {
                            ((Y0) obj11).f().f10720G.d("Analytics storage consent denied; will not get app instance id");
                            ((Y0) obj11).u().X(null);
                            ((Y0) obj11).p().f10804D.e(null);
                        }
                    } finally {
                        ((Y0) obj11).q().R(null, (InterfaceC0394c0) obj10);
                    }
                } catch (RemoteException e8) {
                    ((Y0) obj11).f().f10715B.c(e8, "Failed to get app instance id");
                }
                return;
            case 18:
                Object obj12 = this.f1469x;
                Y0 y02 = (Y0) this.f1471z;
                m2.G g7 = y02.f10831z;
                if (g7 == null) {
                    y02.f().f10715B.d("Failed to send default event parameters to service");
                    return;
                }
                try {
                    AbstractC1332d.m((B1) obj12);
                    g7.mo1g((Bundle) this.f1470y, (B1) obj12);
                    return;
                } catch (RemoteException e9) {
                    y02.f().f10715B.c(e9, "Failed to send default event parameters to service");
                    return;
                }
            case 19:
                C0878a c0878a = (C0878a) this.f1469x;
                N n6 = (N) this.f1470y;
                JobParameters jobParameters = (JobParameters) this.f1471z;
                c0878a.getClass();
                n6.f10723J.d("AppMeasurementJobService processed last upload request.");
                ((InterfaceC1055l1) c0878a.f9565x).a(jobParameters);
                return;
            case 20:
                if (((View) this.f1470y) != null) {
                    ((t2.b) this.f1471z).getClass();
                    return;
                }
                return;
            case 21:
                ((C1368a) this.f1471z).h((View) this.f1469x, (FrameLayout) this.f1470y);
                return;
            default:
                C1265c c1265c = (C1265c) this.f1471z;
                C0851a c0851a = (C0851a) this.f1469x;
                c1265c.b(c0851a, (q2.j) this.f1470y);
                ((AtomicInteger) c1265c.f12397i.f5012y).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(c1265c.f12390b, c1265c.a()) * (60000.0d / c1265c.f12389a));
                String str6 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + c0851a.f9454b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str6, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused4) {
                    return;
                }
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i6, int i7) {
        this.f1468w = i6;
        this.f1469x = obj;
        this.f1470y = obj2;
        this.f1471z = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(C1265c c1265c, C0851a c0851a, q2.j jVar) {
        this(c1265c, c0851a, jVar, 22);
        this.f1468w = 22;
    }
}
