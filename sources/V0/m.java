package V0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.internal.measurement.C0392b4;
import com.google.android.gms.internal.measurement.C0452l4;
import com.google.android.gms.internal.measurement.C0464n4;
import com.google.android.gms.internal.measurement.C0487r4;
import com.google.android.gms.internal.measurement.C0499t4;
import com.google.android.gms.internal.measurement.C0522x3;
import com.google.android.gms.internal.measurement.C0528y3;
import com.google.android.gms.internal.measurement.C3;
import com.google.android.gms.internal.measurement.E3;
import com.google.android.gms.internal.measurement.F3;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.InterfaceC0446k4;
import com.google.android.gms.internal.measurement.InterfaceC0482q4;
import com.google.android.gms.internal.measurement.InterfaceC0534z3;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.L3;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.N3;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.O4;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.P4;
import com.google.android.gms.internal.measurement.Q3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.R4;
import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.V3;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z3;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.c5;
import f2.InterfaceC0699c;
import i1.C0831e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m2.AbstractC1078w;
import m2.InterfaceC1019D;
import o1.InterfaceC1226c;
import p1.C1234C;
import p1.C1239e;
import p1.C1241g;
import p1.F;
import p1.o;
import p1.x;
import p1.y;
import s1.D;
import s1.H;
import u1.C1360d;
import v1.InterfaceC1417a;
import w1.InterfaceC1463g;
import w1.InterfaceC1468l;
import w1.InterfaceC1470n;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC1468l, InterfaceC1226c, y, p1.n, H, InterfaceC1417a, InterfaceC1470n, D1.c, InterfaceC0699c, f2.e, InterfaceC1019D {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3703w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m() {
        this(16);
        this.f3703w = 16;
    }

    public static boolean h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // m2.InterfaceC1019D
    public Object a() {
        switch (this.f3703w) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                List list = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l5 = (Long) E3.f6495a.a();
                l5.getClass();
                return l5;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                List list2 = AbstractC1078w.f11172a;
                ((Q3) ((R3) O3.f6653x.get())).getClass();
                Boolean bool = (Boolean) Q3.f6666a.a();
                bool.getClass();
                return bool;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                List list3 = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool2 = (Boolean) L4.f6630d.a();
                bool2.getClass();
                return bool2;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                List list4 = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool3 = (Boolean) L4.f6635i.a();
                bool3.getClass();
                return bool3;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list5 = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool4 = (Boolean) L4.f6633g.a();
                bool4.getClass();
                return bool4;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list6 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6485Q.a()).longValue());
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                ((R4) ((O4) P4.f6661x.get())).getClass();
                Boolean bool5 = (Boolean) R4.f6674a.a();
                bool5.getClass();
                return bool5;
            case 9:
                ((R4) ((O4) P4.f6661x.get())).getClass();
                Boolean bool6 = (Boolean) R4.f6675b.a();
                bool6.getClass();
                return bool6;
            case 10:
                List list7 = AbstractC1078w.f11172a;
                ((V3) ((S3) T3.f6698x.get())).getClass();
                Boolean bool7 = (Boolean) V3.f6722a.a();
                bool7.getClass();
                return bool7;
            case 11:
                List list8 = AbstractC1078w.f11172a;
                ((C0499t4) ((InterfaceC0482q4) C0487r4.f6942x.get())).getClass();
                Boolean bool8 = (Boolean) C0499t4.f6961a.a();
                bool8.getClass();
                return bool8;
            case 12:
                List list9 = AbstractC1078w.f11172a;
                ((C0392b4) ((Y3) Z3.f6755x.get())).getClass();
                Boolean bool9 = (Boolean) C0392b4.f6766b.a();
                bool9.getClass();
                return bool9;
            case 13:
                List list10 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6489U.a()).longValue());
            case 14:
                List list11 = AbstractC1078w.f11172a;
                ((P3) ((M3) N3.f6648x.get())).getClass();
                Boolean bool10 = (Boolean) P3.f6658a.a();
                bool10.getClass();
                return bool10;
            case 15:
                List list12 = AbstractC1078w.f11172a;
                ((C0464n4) ((InterfaceC0446k4) C0452l4.f6877x.get())).getClass();
                Boolean bool11 = (Boolean) C0464n4.f6903a.a();
                bool11.getClass();
                return bool11;
            case 16:
                List list13 = AbstractC1078w.f11172a;
                ((C0528y3) ((InterfaceC0534z3) C0522x3.f6996x.get())).getClass();
                Boolean bool12 = (Boolean) C0528y3.f7011a.a();
                bool12.getClass();
                return bool12;
            case 17:
                List list14 = AbstractC1078w.f11172a;
                ((L4) ((I4) J4.f6612x.get())).getClass();
                Boolean bool13 = (Boolean) L4.f6632f.a();
                bool13.getClass();
                return bool13;
            case 18:
                List list15 = AbstractC1078w.f11172a;
                ((c5) ((a5) b5.f6767x.get())).getClass();
                Boolean bool14 = (Boolean) c5.f6780a.a();
                bool14.getClass();
                return bool14;
            case 19:
                List list16 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6491W.a()).longValue());
            case 20:
                List list17 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6493Y.a()).longValue());
            case 21:
                List list18 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return (String) E3.f6500c0.a();
            case 22:
                List list19 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l6 = (Long) E3.f6482N.a();
                l6.getClass();
                return l6;
            case 23:
                List list20 = AbstractC1078w.f11172a;
                ((K3) ((L3) I3.f6607x.get())).getClass();
                Boolean bool15 = (Boolean) K3.f6618b.a();
                bool15.getClass();
                return bool15;
            case 24:
                List list21 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l7 = (Long) E3.f6484P.a();
                l7.getClass();
                return l7;
            case 25:
                List list22 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l8 = (Long) E3.f6507h.a();
                l8.getClass();
                return l8;
            case 26:
                List list23 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l9 = (Long) E3.f6522w.a();
                l9.getClass();
                return l9;
            case 27:
                List list24 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l10 = (Long) E3.f6471C.a();
                l10.getClass();
                return l10;
            case 28:
                List list25 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                Long l11 = (Long) E3.f6498b0.a();
                l11.getClass();
                return l11;
            default:
                List list26 = AbstractC1078w.f11172a;
                ((E3) ((F3) C3.f6456x.get())).getClass();
                return Integer.valueOf((int) ((Long) E3.f6496a0.a()).longValue());
        }
    }

    @Override // p1.n
    public Class b() {
        return InputStream.class;
    }

    @Override // p1.n
    public void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // p1.y
    public x d(C1234C c1234c) {
        int i6 = 0;
        switch (this.f3703w) {
            case 10:
                return new C1239e(i6, new L3.c(29, this));
            case 11:
                return new C1241g(i6);
            case 12:
            default:
                return new F(c1234c.b(o.class, InputStream.class), 1);
            case 13:
                return new F(c1234c.b(Uri.class, AssetFileDescriptor.class), i6);
            case 14:
                return new F(c1234c.b(Uri.class, InputStream.class), i6);
        }
    }

    @Override // f2.InterfaceC0699c
    public int e(Context context, String str) {
        return f2.f.a(context, str);
    }

    @Override // v1.InterfaceC1417a
    public l1.F f(l1.F f6, j1.m mVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C0831e) ((C1360d) f6.a()).f12831w.f12824a.f12845a).f9390d.asReadOnlyBuffer();
        AtomicReference atomicReference = C1.b.f113a;
        e0.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new e0.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar != null && bVar.f8231a == 0 && bVar.f8232b == ((byte[]) bVar.f8233c).length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new D(bArrArray);
    }

    @Override // f2.InterfaceC0699c
    public int g(Context context, String str, boolean z5) {
        return f2.f.d(context, str, z5);
    }

    @Override // o1.InterfaceC1226c
    public void i(Throwable th) {
        switch (this.f3703w) {
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return;
            default:
                throw new RuntimeException("Request threw uncaught throwable", th);
        }
    }

    @Override // p1.n
    public Object j(File file) {
        return new FileInputStream(file);
    }

    @Override // s1.H
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // w1.InterfaceC1468l
    public com.bumptech.glide.o l(com.bumptech.glide.b bVar, InterfaceC1463g interfaceC1463g, InterfaceC1470n interfaceC1470n, Context context) {
        return new k(bVar, interfaceC1463g, interfaceC1470n, context);
    }

    @Override // f2.e
    public f2.d o(Context context, String str, InterfaceC0699c interfaceC0699c) {
        int i6 = 0;
        switch (this.f3703w) {
            case 26:
                f2.d dVar = new f2.d();
                int iE = interfaceC0699c.e(context, str);
                dVar.f8400a = iE;
                if (iE != 0) {
                    dVar.f8402c = -1;
                } else {
                    int iG = interfaceC0699c.g(context, str, true);
                    dVar.f8401b = iG;
                    if (iG != 0) {
                        dVar.f8402c = 1;
                    }
                }
                return dVar;
            case 27:
                f2.d dVar2 = new f2.d();
                dVar2.f8400a = interfaceC0699c.e(context, str);
                int iG2 = interfaceC0699c.g(context, str, true);
                dVar2.f8401b = iG2;
                int i7 = dVar2.f8400a;
                if (i7 == 0) {
                    if (iG2 != 0) {
                    }
                    dVar2.f8402c = i6;
                    return dVar2;
                }
                i6 = i7;
                i6 = i6 >= iG2 ? -1 : 1;
                dVar2.f8402c = i6;
                return dVar2;
            default:
                f2.d dVar3 = new f2.d();
                dVar3.f8400a = interfaceC0699c.e(context, str);
                int iG3 = interfaceC0699c.g(context, str, true);
                dVar3.f8401b = iG3;
                int i8 = dVar3.f8400a;
                if (i8 == 0) {
                    if (iG3 != 0) {
                    }
                    dVar3.f8402c = i6;
                    return dVar3;
                }
                i6 = i8;
                i6 = iG3 >= i6 ? 1 : -1;
                dVar3.f8402c = i6;
                return dVar3;
        }
    }

    @Override // s1.H
    public void r(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public /* synthetic */ m(int i6) {
        this.f3703w = i6;
    }

    public /* synthetic */ m(int i6, int i7) {
        this.f3703w = i6;
    }
}
