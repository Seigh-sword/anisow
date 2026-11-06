package z3;

import T1.j;
import a3.C0261b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import w3.C1478b;
import w3.C1479c;
import w3.InterfaceC1480d;
import y3.C1508a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements w3.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f14113f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1479c f14114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1479c f14115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1508a f14116i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f14117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f14118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f14119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1480d f14120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f14121e = new h(this);

    static {
        C0261b c0261bA = C1479c.a("key");
        j jVarE = j.e();
        jVarE.f3424w = 1;
        f14114g = H1.a.n(jVarE, c0261bA);
        C0261b c0261bA2 = C1479c.a("value");
        j jVarE2 = j.e();
        jVarE2.f3424w = 2;
        f14115h = H1.a.n(jVarE2, c0261bA2);
        f14116i = new C1508a(1);
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, InterfaceC1480d interfaceC1480d) {
        this.f14117a = byteArrayOutputStream;
        this.f14118b = map;
        this.f14119c = map2;
        this.f14120d = interfaceC1480d;
    }

    public static int k(C1479c c1479c) {
        e eVar = (e) ((Annotation) c1479c.f13591b.get(e.class));
        if (eVar != null) {
            return ((C1531a) eVar).f14108a;
        }
        throw new C1478b("Field has no @Protobuf config");
    }

    public final void a(C1479c c1479c, double d6, boolean z5) throws IOException {
        if (z5 && d6 == 0.0d) {
            return;
        }
        l((k(c1479c) << 3) | 1);
        this.f14117a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d6).array());
    }

    public final void b(C1479c c1479c, int i6, boolean z5) {
        if (z5 && i6 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) c1479c.f13591b.get(e.class));
        if (eVar == null) {
            throw new C1478b("Field has no @Protobuf config");
        }
        C1531a c1531a = (C1531a) eVar;
        int iOrdinal = c1531a.f14109b.ordinal();
        int i7 = c1531a.f14108a;
        if (iOrdinal == 0) {
            l(i7 << 3);
            l(i6);
        } else if (iOrdinal == 1) {
            l(i7 << 3);
            l((i6 << 1) ^ (i6 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((i7 << 3) | 5);
            this.f14117a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i6).array());
        }
    }

    @Override // w3.e
    public final w3.e c(C1479c c1479c, double d6) throws IOException {
        a(c1479c, d6, true);
        return this;
    }

    @Override // w3.e
    public final w3.e d(C1479c c1479c, long j6) throws IOException {
        h(c1479c, j6, true);
        return this;
    }

    @Override // w3.e
    public final w3.e e(C1479c c1479c, int i6) {
        b(c1479c, i6, true);
        return this;
    }

    @Override // w3.e
    public final w3.e f(C1479c c1479c, Object obj) {
        i(c1479c, obj, true);
        return this;
    }

    @Override // w3.e
    public final w3.e g(C1479c c1479c, boolean z5) {
        b(c1479c, z5 ? 1 : 0, true);
        return this;
    }

    public final void h(C1479c c1479c, long j6, boolean z5) throws IOException {
        if (z5 && j6 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) c1479c.f13591b.get(e.class));
        if (eVar == null) {
            throw new C1478b("Field has no @Protobuf config");
        }
        C1531a c1531a = (C1531a) eVar;
        int iOrdinal = c1531a.f14109b.ordinal();
        int i6 = c1531a.f14108a;
        if (iOrdinal == 0) {
            l(i6 << 3);
            m(j6);
        } else if (iOrdinal == 1) {
            l(i6 << 3);
            m((j6 >> 63) ^ (j6 << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((i6 << 3) | 1);
            this.f14117a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j6).array());
        }
    }

    public final void i(C1479c c1479c, Object obj, boolean z5) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z5 && charSequence.length() == 0) {
                return;
            }
            l((k(c1479c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f14113f);
            l(bytes.length);
            this.f14117a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(c1479c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(f14116i, c1479c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(c1479c, ((Double) obj).doubleValue(), z5);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z5 && fFloatValue == 0.0f) {
                return;
            }
            l((k(c1479c) << 3) | 5);
            this.f14117a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(c1479c, ((Number) obj).longValue(), z5);
            return;
        }
        if (obj instanceof Boolean) {
            b(c1479c, ((Boolean) obj).booleanValue() ? 1 : 0, z5);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z5 && bArr.length == 0) {
                return;
            }
            l((k(c1479c) << 3) | 2);
            l(bArr.length);
            this.f14117a.write(bArr);
            return;
        }
        InterfaceC1480d interfaceC1480d = (InterfaceC1480d) this.f14118b.get(obj.getClass());
        if (interfaceC1480d != null) {
            j(interfaceC1480d, c1479c, obj, z5);
            return;
        }
        w3.f fVar = (w3.f) this.f14119c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f14121e;
            hVar.f14123a = false;
            hVar.f14125c = c1479c;
            hVar.f14124b = z5;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(c1479c, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(c1479c, ((Enum) obj).ordinal(), true);
        } else {
            j(this.f14120d, c1479c, obj, z5);
        }
    }

    public final void j(InterfaceC1480d interfaceC1480d, C1479c c1479c, Object obj, boolean z5) throws IOException {
        C1532b c1532b = new C1532b();
        c1532b.f14110w = 0L;
        try {
            OutputStream outputStream = this.f14117a;
            this.f14117a = c1532b;
            try {
                interfaceC1480d.a(obj, this);
                this.f14117a = outputStream;
                long j6 = c1532b.f14110w;
                c1532b.close();
                if (z5 && j6 == 0) {
                    return;
                }
                l((k(c1479c) << 3) | 2);
                m(j6);
                interfaceC1480d.a(obj, this);
            } catch (Throwable th) {
                this.f14117a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1532b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i6) throws IOException {
        while ((i6 & (-128)) != 0) {
            this.f14117a.write((i6 & ModuleDescriptor.MODULE_VERSION) | 128);
            i6 >>>= 7;
        }
        this.f14117a.write(i6 & ModuleDescriptor.MODULE_VERSION);
    }

    public final void m(long j6) throws IOException {
        while (((-128) & j6) != 0) {
            this.f14117a.write((((int) j6) & ModuleDescriptor.MODULE_VERSION) | 128);
            j6 >>>= 7;
        }
        this.f14117a.write(((int) j6) & ModuleDescriptor.MODULE_VERSION);
    }
}
