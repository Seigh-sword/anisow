package I0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.internal.measurement.A3;
import com.google.android.gms.internal.measurement.B3;
import com.google.android.gms.internal.measurement.C0392b4;
import com.google.android.gms.internal.measurement.C0458m4;
import com.google.android.gms.internal.measurement.C0470o4;
import com.google.android.gms.internal.measurement.C0487r4;
import com.google.android.gms.internal.measurement.C0499t4;
import com.google.android.gms.internal.measurement.C3;
import com.google.android.gms.internal.measurement.D3;
import com.google.android.gms.internal.measurement.E3;
import com.google.android.gms.internal.measurement.F3;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.InterfaceC0476p4;
import com.google.android.gms.internal.measurement.InterfaceC0482q4;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.L3;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.N3;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.V3;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z3;
import f2.InterfaceC0699c;
import i1.C0831e;
import j1.InterfaceC0845c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l1.C0926E;
import m1.InterfaceC1006d;
import m2.AbstractC1078w;
import m2.InterfaceC1019D;
import n1.InterfaceC1145a;
import o1.InterfaceC1226c;
import p1.C1234C;
import p1.C1239e;
import p1.F;
import p1.L;
import p1.y;
import s1.G;
import s1.H;
import u1.C1360d;
import w1.InterfaceC1462f;
import w1.InterfaceC1463g;
import w1.InterfaceC1465i;
import w1.InterfaceC1468l;
import w1.InterfaceC1470n;

/* JADX INFO: loaded from: classes.dex */
public final class o implements D1.a, InterfaceC1145a, InterfaceC1226c, y, InterfaceC0845c, p1.n, s1.q, H, j1.p, InterfaceC1463g, InterfaceC1462f, InterfaceC1468l, f2.e, InterfaceC1019D {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static o f1107x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1108w;

    public /* synthetic */ o(int i6) {
        this.f1108w = i6;
    }

    public static synchronized o w() {
        try {
            if (f1107x == null) {
                f1107x = new o(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1107x;
    }

    public static String y(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // m2.InterfaceC1019D
    public Object a() {
        switch (this.f1108w) {
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool = (Boolean) L4.f6634h.a();
                bool.getClass();
                return bool;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                List list2 = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool2 = (Boolean) L4.f6636j.a();
                bool2.getClass();
                return bool2;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                List list3 = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool3 = (Boolean) L4.f6631e.a();
                bool3.getClass();
                return bool3;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list4 = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool4 = (Boolean) L4.f6627a.a();
                bool4.getClass();
                return bool4;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list5 = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool5 = (Boolean) L4.f6637k.a();
                bool5.getClass();
                return bool5;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                List list6 = AbstractC1078w.f11172a;
                ((P3) ((M3) N3.f6648x.get())).getClass();
                Boolean bool6 = (Boolean) P3.f6660c.a();
                bool6.getClass();
                return bool6;
            case 9:
                List list7 = AbstractC1078w.f11172a;
                ((V3) ((S3) T3.f6698x.get())).getClass();
                Boolean bool7 = (Boolean) V3.f6723b.a();
                bool7.getClass();
                return bool7;
            case 10:
                List list8 = AbstractC1078w.f11172a;
                ((V3) ((S3) T3.f6698x.get())).getClass();
                Boolean bool8 = (Boolean) V3.f6724c.a();
                bool8.getClass();
                return bool8;
            case 11:
                List list9 = AbstractC1078w.f11172a;
                ((C0499t4) ((InterfaceC0482q4) C0487r4.f6942x.get())).getClass();
                Boolean bool9 = (Boolean) C0499t4.f6962b.a();
                bool9.getClass();
                return bool9;
            case 12:
                List list10 = AbstractC1078w.f11172a;
                ((C0392b4) ((Y3) Z3.f6755x.get())).getClass();
                Boolean bool10 = (Boolean) C0392b4.f6765a.a();
                bool10.getClass();
                return bool10;
            case 13:
                List list11 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6490V.a()).longValue());
            case 14:
                List list12 = AbstractC1078w.f11172a;
                ((P3) ((M3) N3.f6648x.get())).getClass();
                Boolean bool11 = (Boolean) P3.f6659b.a();
                bool11.getClass();
                return bool11;
            case 15:
                List list13 = AbstractC1078w.f11172a;
                ((D3) ((A3) B3.f6451x.get())).getClass();
                Boolean bool12 = (Boolean) D3.f6464a.a();
                bool12.getClass();
                return bool12;
            case 16:
                List list14 = AbstractC1078w.f11172a;
                ((C0470o4) ((InterfaceC0476p4) C0458m4.f6883x.get())).getClass();
                Boolean bool13 = (Boolean) C0470o4.f6917a.a();
                bool13.getClass();
                return bool13;
            case 17:
                List list15 = AbstractC1078w.f11172a;
                ((K3) ((L3) I3.f6607x.get())).getClass();
                Boolean bool14 = (Boolean) K3.f6617a.a();
                bool14.getClass();
                return bool14;
            case 18:
                List list16 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6488T.a()).longValue());
            case 19:
                List list17 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6487S.a()).longValue());
            case 20:
                List list18 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6515p.a()).longValue());
            case 21:
                List list19 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return (String) E3.f6511l.a();
            case 22:
                List list20 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l5 = (Long) E3.f6502d0.a();
                l5.getClass();
                return l5;
            case 23:
                List list21 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l6 = (Long) E3.f6497b.a();
                l6.getClass();
                return l6;
            case 24:
                List list22 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l7 = (Long) E3.f6470B.a();
                l7.getClass();
                return l7;
            case 25:
                List list23 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l8 = (Long) E3.f6523x.a();
                l8.getClass();
                return l8;
            case 26:
                List list24 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l9 = (Long) E3.f6474F.a();
                l9.getClass();
                return l9;
            case 27:
                List list25 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l10 = (Long) E3.f6483O.a();
                l10.getClass();
                return l10;
            case 28:
                List list26 = AbstractC1078w.f11172a;
                ((K3) ((L3) I3.f6607x.get())).getClass();
                Boolean bool15 = (Boolean) K3.f6619c.a();
                bool15.getClass();
                return bool15;
            default:
                List list27 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l11 = (Long) E3.f6524y.a();
                l11.getClass();
                return l11;
        }
    }

    @Override // p1.n
    public Class b() {
        return ParcelFileDescriptor.class;
    }

    @Override // p1.n
    public void c(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // p1.y
    public p1.x d(C1234C c1234c) {
        int i6 = 0;
        switch (this.f1108w) {
            case 10:
                return new C1239e(i6, new S0.f(24, this));
            case 14:
                return new F(c1234c.b(Uri.class, ParcelFileDescriptor.class), i6);
            default:
                return new L(c1234c.b(p1.o.class, InputStream.class));
        }
    }

    @Override // j1.p
    public int e(j1.m mVar) {
        return 1;
    }

    @Override // n1.InterfaceC1145a
    public File h(j1.i iVar) {
        return null;
    }

    @Override // o1.InterfaceC1226c
    public void i(Throwable th) {
        if (Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
        }
    }

    @Override // p1.n
    public Object j(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // s1.H
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f1108w) {
            case 17:
                mediaMetadataRetriever.setDataSource(new G((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // w1.InterfaceC1468l
    public com.bumptech.glide.o l(com.bumptech.glide.b bVar, InterfaceC1463g interfaceC1463g, InterfaceC1470n interfaceC1470n, Context context) {
        return new com.bumptech.glide.o(bVar, interfaceC1463g, interfaceC1470n, context);
    }

    @Override // j1.InterfaceC0845c
    public boolean m(Object obj, File file, j1.m mVar) throws Throwable {
        switch (this.f1108w) {
            case 11:
                try {
                    C1.b.d((ByteBuffer) obj, file);
                } catch (IOException e6) {
                    if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                        return false;
                    }
                    Log.d("ByteBufferEncoder", "Failed to write data", e6);
                    return false;
                }
                break;
            default:
                try {
                    C1.b.d(((C0831e) ((C1360d) ((l1.F) obj).a()).f12831w.f12824a.f12845a).f9390d.asReadOnlyBuffer(), file);
                } catch (IOException e7) {
                    if (!Log.isLoggable("GifEncoder", 5)) {
                        return false;
                    }
                    Log.w("GifEncoder", "Failed to encode GIF drawable data", e7);
                    return false;
                }
                break;
        }
        return false;
    }

    @Override // f2.e
    public f2.d o(Context context, String str, InterfaceC0699c interfaceC0699c) {
        int i6 = -1;
        switch (this.f1108w) {
            case 26:
                f2.d dVar = new f2.d();
                int iG = interfaceC0699c.g(context, str, true);
                dVar.f8401b = iG;
                if (iG != 0) {
                    dVar.f8402c = 1;
                } else {
                    int iE = interfaceC0699c.e(context, str);
                    dVar.f8400a = iE;
                    if (iE != 0) {
                        dVar.f8402c = -1;
                    }
                }
                return dVar;
            case 27:
                f2.d dVar2 = new f2.d();
                int iG2 = interfaceC0699c.g(context, str, false);
                dVar2.f8401b = iG2;
                dVar2.f8402c = iG2 != 0 ? 1 : 0;
                return dVar2;
            case 28:
                f2.d dVar3 = new f2.d();
                int iE2 = interfaceC0699c.e(context, str);
                dVar3.f8400a = iE2;
                int iG3 = iE2 != 0 ? interfaceC0699c.g(context, str, false) : interfaceC0699c.g(context, str, true);
                dVar3.f8401b = iG3;
                int i7 = dVar3.f8400a;
                if (i7 == 0) {
                    if (iG3 == 0) {
                        i6 = 0;
                    }
                    dVar3.f8402c = i6;
                    return dVar3;
                }
                i = i7;
                if (i < iG3) {
                    i6 = 1;
                }
                dVar3.f8402c = i6;
                return dVar3;
            default:
                f2.d dVar4 = new f2.d();
                int iE3 = interfaceC0699c.e(context, str);
                dVar4.f8400a = iE3;
                int iG4 = iE3 != 0 ? interfaceC0699c.g(context, str, false) : interfaceC0699c.g(context, str, true);
                dVar4.f8401b = iG4;
                int i8 = dVar4.f8400a;
                if (i8 == 0) {
                    if (iG4 == 0) {
                        i6 = 0;
                    }
                    dVar4.f8402c = i6;
                    return dVar4;
                }
                i = i8;
                if (iG4 >= i) {
                    i6 = 1;
                }
                dVar4.f8402c = i6;
                return dVar4;
        }
    }

    @Override // w1.InterfaceC1463g
    public void p(InterfaceC1465i interfaceC1465i) {
        interfaceC1465i.i();
    }

    @Override // s1.H
    public void r(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f1108w) {
            case 17:
                mediaExtractor.setDataSource(new G((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // D1.a
    public Object s() {
        switch (this.f1108w) {
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0926E();
            default:
                return new ArrayList();
        }
    }

    public void u(String str, String str2, Throwable... thArr) {
        if (this.f1108w <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void v(String str, String str2, Throwable... thArr) {
        if (this.f1108w <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void x(String str, String str2, Throwable... thArr) {
        if (this.f1108w <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void z(String str, String str2, Throwable... thArr) {
        if (this.f1108w <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i6, int i7) {
        this(0);
        this.f1108w = i6;
        int i8 = 1;
        if (i6 != 1) {
        } else {
            this(i8);
        }
    }

    @Override // s1.q
    public void t() {
    }

    @Override // w1.InterfaceC1462f
    public void f(Activity activity) {
    }

    @Override // w1.InterfaceC1463g
    public void g(InterfaceC1465i interfaceC1465i) {
    }

    @Override // s1.q
    public void n(Bitmap bitmap, InterfaceC1006d interfaceC1006d) {
    }

    @Override // n1.InterfaceC1145a
    public void q(j1.i iVar, l1.k kVar) {
    }
}
