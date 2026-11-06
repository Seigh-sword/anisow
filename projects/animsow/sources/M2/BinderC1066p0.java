package m2;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import b2.C0337b;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.N3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import m.RunnableC0969k;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1066p0 extends com.google.android.gms.internal.measurement.H implements G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f11055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f11056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11057e;

    public BinderC1066p0(x1 x1Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        AbstractC1332d.m(x1Var);
        this.f11055c = x1Var;
        this.f11057e = null;
    }

    @Override // m2.G
    public final void A(B1 b1) {
        AbstractC1332d.g(b1.f10525w);
        AbstractC1332d.m(b1.f10514R);
        s(new RunnableC1069r0(this, b1, 0));
    }

    @Override // m2.G
    public final void C(B1 b1) {
        AbstractC1332d.g(b1.f10525w);
        AbstractC1332d.m(b1.f10514R);
        s(new RunnableC1069r0(this, b1, 1));
    }

    public final void D(Runnable runnable) {
        x1 x1Var = this.f11055c;
        if (x1Var.g().C()) {
            runnable.run();
        } else {
            x1Var.g().A(runnable);
        }
    }

    public final void E(B1 b1) {
        AbstractC1332d.m(b1);
        String str = b1.f10525w;
        AbstractC1332d.g(str);
        e(str, false);
        this.f11055c.a0().b0(b1.f10526x, b1.f10509M);
    }

    public final void F(C1076v c1076v, B1 b1) {
        x1 x1Var = this.f11055c;
        x1Var.b0();
        x1Var.w(c1076v, b1);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final boolean b(int i6, Parcel parcel, Parcel parcel2) {
        boolean z5;
        List listO;
        int i7 = 1;
        ArrayList arrayList = null;
        x1 x1Var = this.f11055c;
        switch (i6) {
            case 1:
                C1076v c1076v = (C1076v) com.google.android.gms.internal.measurement.G.a(parcel, C1076v.CREATOR);
                B1 b1 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                l(c1076v, b1);
                parcel2.writeNoException();
                return true;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                G1 g12 = (G1) com.google.android.gms.internal.measurement.G.a(parcel, G1.CREATOR);
                B1 b12 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                q(g12, b12);
                parcel2.writeNoException();
                return true;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
            case 22:
            case 23:
            default:
                return false;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                B1 b13 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                t(b13);
                parcel2.writeNoException();
                return true;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                C1076v c1076v2 = (C1076v) com.google.android.gms.internal.measurement.G.a(parcel, C1076v.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.G.d(parcel);
                AbstractC1332d.m(c1076v2);
                AbstractC1332d.g(string);
                e(string, true);
                D(new K.a(this, c1076v2, string, 14));
                parcel2.writeNoException();
                return true;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                B1 b14 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                p(b14);
                parcel2.writeNoException();
                return true;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                B1 b15 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                z5 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.G.d(parcel);
                E(b15);
                String str = b15.f10525w;
                AbstractC1332d.m(str);
                try {
                    List<I1> list = (List) x1Var.g().w(new CallableC1075u0(this, i7, str)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (I1 i12 : list) {
                        if (z5 || !K1.w0(i12.f10649c)) {
                            arrayList2.add(new G1(i12));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e6) {
                    e = e6;
                    x1Var.f().f10715B.b(N.x(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e7) {
                    e = e7;
                    x1Var.f().f10715B.b(N.x(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C1076v c1076v3 = (C1076v) com.google.android.gms.internal.measurement.G.a(parcel, C1076v.CREATOR);
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.G.d(parcel);
                byte[] bArrI = i(c1076v3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrI);
                return true;
            case 10:
                long j6 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.internal.measurement.G.d(parcel);
                v(j6, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                B1 b16 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                String strU = u(b16);
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 12:
                C1029d c1029d = (C1029d) com.google.android.gms.internal.measurement.G.a(parcel, C1029d.CREATOR);
                B1 b17 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                m(c1029d, b17);
                parcel2.writeNoException();
                return true;
            case 13:
                C1029d c1029d2 = (C1029d) com.google.android.gms.internal.measurement.G.a(parcel, C1029d.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                AbstractC1332d.m(c1029d2);
                AbstractC1332d.m(c1029d2.f10873y);
                AbstractC1332d.g(c1029d2.f10871w);
                e(c1029d2.f10871w, true);
                D(new RunnableC0969k(this, 23, new C1029d(c1029d2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.G.f6599a;
                z5 = parcel.readInt() != 0;
                B1 b18 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                listO = o(string6, string7, z5, b18);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.G.f6599a;
                z5 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.G.d(parcel);
                listO = w(string8, string9, string10, z5);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                B1 b19 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                listO = z(string11, string12, b19);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.internal.measurement.G.d(parcel);
                listO = y(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 18:
                B1 b110 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                h(b110);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.G.a(parcel, Bundle.CREATOR);
                B1 b111 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                mo1g(bundle, b111);
                parcel2.writeNoException();
                return true;
            case 20:
                B1 b112 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                r(b112);
                parcel2.writeNoException();
                return true;
            case 21:
                B1 b113 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                C1038g c1038gK = k(b113);
                parcel2.writeNoException();
                if (c1038gK == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c1038gK.writeToParcel(parcel2, 1);
                return true;
            case 24:
                B1 b114 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.G.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                listO = g(bundle2, b114);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 25:
                B1 b115 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                A(b115);
                parcel2.writeNoException();
                return true;
            case 26:
                B1 b116 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                C(b116);
                parcel2.writeNoException();
                return true;
            case 27:
                B1 b117 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                j(b117);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.G.a(parcel, Bundle.CREATOR);
                B1 b118 = (B1) com.google.android.gms.internal.measurement.G.a(parcel, B1.CREATOR);
                com.google.android.gms.internal.measurement.G.d(parcel);
                ((M3) N3.f6648x.get()).getClass();
                if (x1Var.Q().D(null, AbstractC1078w.f11188f1)) {
                    E(b118);
                    String str2 = b118.f10525w;
                    AbstractC1332d.m(str2);
                    D(new RunnableC1068q0(this, bundle3, str2, 0));
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public final void e(String str, boolean z5) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        x1 x1Var = this.f11055c;
        if (zIsEmpty) {
            x1Var.f().f10715B.d("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z5) {
            try {
                if (this.f11056d == null) {
                    this.f11056d = Boolean.valueOf("com.google.android.gms".equals(this.f11057e) || AbstractC1332d.U(x1Var.f11248H.f11009w, Binder.getCallingUid()) || U1.i.c(x1Var.f11248H.f11009w).d(Binder.getCallingUid()));
                }
                if (this.f11056d.booleanValue()) {
                    return;
                }
            } catch (SecurityException e6) {
                x1Var.f().f10715B.c(N.x(str), "Measurement Service called with invalid calling package. appId");
                throw e6;
            }
        }
        if (this.f11057e == null) {
            Context context = x1Var.f11248H.f11009w;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = U1.h.f3590a;
            if (AbstractC1332d.t0(callingUid, context, str)) {
                this.f11057e = str;
            }
        }
        if (str.equals(this.f11057e)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // m2.G
    public final List g(Bundle bundle, B1 b1) {
        E(b1);
        String str = b1.f10525w;
        AbstractC1332d.m(str);
        x1 x1Var = this.f11055c;
        try {
            return (List) x1Var.g().w(new CallableC1077v0(this, b1, bundle, 1)).get();
        } catch (InterruptedException | ExecutionException e6) {
            N nF = x1Var.f();
            nF.f10715B.b(N.x(str), e6, "Failed to get trigger URIs. appId");
            return Collections.emptyList();
        }
    }

    @Override // m2.G
    public final void h(B1 b1) {
        AbstractC1332d.g(b1.f10525w);
        e(b1.f10525w, false);
        D(new RunnableC1069r0(this, b1, 6));
    }

    @Override // m2.G
    public final byte[] i(C1076v c1076v, String str) {
        AbstractC1332d.g(str);
        AbstractC1332d.m(c1076v);
        e(str, true);
        x1 x1Var = this.f11055c;
        N nF = x1Var.f();
        C1051k0 c1051k0 = x1Var.f11248H;
        K k5 = c1051k0.f10987I;
        String str2 = c1076v.f11113w;
        nF.f10722I.c(k5.b(str2), "Log and bundle. event");
        ((C0337b) x1Var.h()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) x1Var.g().z(new CallableC1077v0(this, c1076v, str, 0)).get();
            if (bArr == null) {
                x1Var.f().f10715B.c(N.x(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((C0337b) x1Var.h()).getClass();
            x1Var.f().f10722I.e("Log and bundle processed. event, size, time_ms", c1051k0.f10987I.b(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e6) {
            e = e6;
            N nF2 = x1Var.f();
            nF2.f10715B.e("Failed to log and bundle. appId, event, error", N.x(str), c1051k0.f10987I.b(str2), e);
            return null;
        } catch (ExecutionException e7) {
            e = e7;
            N nF22 = x1Var.f();
            nF22.f10715B.e("Failed to log and bundle. appId, event, error", N.x(str), c1051k0.f10987I.b(str2), e);
            return null;
        }
    }

    @Override // m2.G
    public final void j(B1 b1) {
        E(b1);
        D(new RunnableC1069r0(this, b1, 4));
    }

    @Override // m2.G
    public final C1038g k(B1 b1) {
        E(b1);
        String str = b1.f10525w;
        AbstractC1332d.g(str);
        x1 x1Var = this.f11055c;
        try {
            return (C1038g) x1Var.g().z(new CallableC1075u0(this, 0, b1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            N nF = x1Var.f();
            nF.f10715B.b(N.x(str), e6, "Failed to get consent. appId");
            return new C1038g(null);
        }
    }

    @Override // m2.G
    public final void l(C1076v c1076v, B1 b1) {
        AbstractC1332d.m(c1076v);
        E(b1);
        D(new K.a(this, c1076v, b1, 13));
    }

    @Override // m2.G
    public final void m(C1029d c1029d, B1 b1) {
        AbstractC1332d.m(c1029d);
        AbstractC1332d.m(c1029d.f10873y);
        E(b1);
        C1029d c1029d2 = new C1029d(c1029d);
        c1029d2.f10871w = b1.f10525w;
        D(new K.a(this, c1029d2, b1, 12));
    }

    @Override // m2.G
    public final List o(String str, String str2, boolean z5, B1 b1) {
        E(b1);
        String str3 = b1.f10525w;
        AbstractC1332d.m(str3);
        x1 x1Var = this.f11055c;
        try {
            List<I1> list = (List) x1Var.g().w(new CallableC1073t0(this, str3, str, str2, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (I1 i12 : list) {
                if (z5 || !K1.w0(i12.f10649c)) {
                    arrayList.add(new G1(i12));
                }
            }
            return arrayList;
        } catch (InterruptedException e6) {
            e = e6;
            N nF = x1Var.f();
            nF.f10715B.b(N.x(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        } catch (ExecutionException e7) {
            e = e7;
            N nF2 = x1Var.f();
            nF2.f10715B.b(N.x(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // m2.G
    public final void p(B1 b1) {
        E(b1);
        D(new RunnableC1069r0(this, b1, 3));
    }

    @Override // m2.G
    public final void q(G1 g12, B1 b1) {
        AbstractC1332d.m(g12);
        E(b1);
        D(new K.a(this, g12, b1, 15));
    }

    @Override // m2.G
    public final void r(B1 b1) {
        AbstractC1332d.g(b1.f10525w);
        AbstractC1332d.m(b1.f10514R);
        s(new RunnableC1069r0(this, b1, 5));
    }

    public final void s(RunnableC1069r0 runnableC1069r0) {
        x1 x1Var = this.f11055c;
        if (x1Var.g().C()) {
            runnableC1069r0.run();
        } else {
            x1Var.g().B(runnableC1069r0);
        }
    }

    @Override // m2.G
    public final void t(B1 b1) {
        E(b1);
        D(new RunnableC1069r0(this, b1, 2));
    }

    @Override // m2.G
    public final String u(B1 b1) {
        E(b1);
        x1 x1Var = this.f11055c;
        try {
            return (String) x1Var.g().w(new CallableC1075u0(x1Var, 2, b1)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            N nF = x1Var.f();
            nF.f10715B.b(N.x(b1.f10525w), e6, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // m2.G
    public final void v(long j6, String str, String str2, String str3) {
        D(new RunnableC1071s0(this, str2, str3, str, j6, 0));
    }

    @Override // m2.G
    public final List w(String str, String str2, String str3, boolean z5) {
        e(str, true);
        x1 x1Var = this.f11055c;
        try {
            List<I1> list = (List) x1Var.g().w(new CallableC1073t0(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (I1 i12 : list) {
                if (z5 || !K1.w0(i12.f10649c)) {
                    arrayList.add(new G1(i12));
                }
            }
            return arrayList;
        } catch (InterruptedException e6) {
            e = e6;
            N nF = x1Var.f();
            nF.f10715B.b(N.x(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        } catch (ExecutionException e7) {
            e = e7;
            N nF2 = x1Var.f();
            nF2.f10715B.b(N.x(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    @Override // m2.G
    public final List y(String str, String str2, String str3) {
        e(str, true);
        x1 x1Var = this.f11055c;
        try {
            return (List) x1Var.g().w(new CallableC1073t0(this, str, str2, str3, 2)).get();
        } catch (InterruptedException | ExecutionException e6) {
            x1Var.f().f10715B.c(e6, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // m2.G
    public final List z(String str, String str2, B1 b1) {
        E(b1);
        String str3 = b1.f10525w;
        AbstractC1332d.m(str3);
        x1 x1Var = this.f11055c;
        try {
            return (List) x1Var.g().w(new CallableC1073t0(this, str3, str, str2, 3)).get();
        } catch (InterruptedException | ExecutionException e6) {
            x1Var.f().f10715B.c(e6, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // m2.G
    /* JADX INFO: renamed from: g */
    public final void mo1g(Bundle bundle, B1 b1) {
        E(b1);
        String str = b1.f10525w;
        AbstractC1332d.m(str);
        D(new RunnableC1068q0(this, bundle, str, 1));
    }
}
