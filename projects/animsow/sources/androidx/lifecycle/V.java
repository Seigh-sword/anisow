package androidx.lifecycle;

import M4.InterfaceC0071p;
import M4.k0;
import W.InterfaceC0191j;
import com.android.app.models.MyList;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import o0.V0;
import s4.AbstractC1305a;
import s4.C1311g;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class V extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5587x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5588y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i6, Object obj) {
        super(0);
        this.f5587x = i6;
        this.f5588y = obj;
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        int i6 = this.f5587x;
        Object obj = this.f5588y;
        switch (i6) {
            case 1:
                ((k0) ((InterfaceC0071p) obj)).b(null);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((V0) obj).f11870k.c(C1316l.f12640a);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // C4.a
    public final Object b() throws IllegalAccessException, IOException, InvocationTargetException {
        int iE0;
        long jG;
        Iterator it;
        C1311g c1311g;
        C1311g c1311g2;
        C1316l c1316l = C1316l.f12640a;
        int i6 = this.f5587x;
        Object obj = this.f5588y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return U.d((j0) obj);
            case 1:
                a();
                return c1316l;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                a();
                return c1316l;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                switch (i6) {
                    case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                        return new f1.f((MyList) obj);
                    default:
                        return new f1.f((String) obj);
                }
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                switch (i6) {
                    case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                        return new f1.f((MyList) obj);
                    default:
                        return new f1.f((String) obj);
                }
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return new P3.q((InterfaceC0191j) obj);
            default:
                f5.w wVar = g5.e.f8543c;
                ClassLoader classLoader = (ClassLoader) obj;
                AbstractC1305a.o(classLoader, "<this>");
                Enumeration<URL> resources = classLoader.getResources("");
                AbstractC1305a.n(resources, "getResources(\"\")");
                ArrayList<URL> list = Collections.list(resources);
                AbstractC1305a.n(list, "list(this)");
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    f5.w wVar2 = g5.e.f8543c;
                    AbstractC1305a.n(url, "it");
                    if (AbstractC1305a.c(url.getProtocol(), "file")) {
                        f5.s sVar = f5.m.f8472a;
                        String str = f5.w.f8492x;
                        c1311g2 = new C1311g(sVar, B3.e.p(new File(url.toURI())));
                    } else {
                        c1311g2 = null;
                    }
                    if (c1311g2 != null) {
                        arrayList.add(c1311g2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                AbstractC1305a.n(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
                ArrayList list2 = Collections.list(resources2);
                AbstractC1305a.n(list2, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    URL url2 = (URL) it2.next();
                    f5.w wVar3 = g5.e.f8543c;
                    AbstractC1305a.n(url2, "it");
                    String string = url2.toString();
                    AbstractC1305a.n(string, "toString()");
                    if (string.startsWith("jar:file:") && (iE0 = K4.h.e0(string, "!", 6)) != -1) {
                        String str2 = f5.w.f8492x;
                        String strSubstring = string.substring(4, iE0);
                        AbstractC1305a.n(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        f5.w wVarP = B3.e.p(new File(URI.create(strSubstring)));
                        f5.s sVar2 = f5.m.f8472a;
                        AbstractC1305a.o(sVar2, "fileSystem");
                        f5.r rVarF = sVar2.f(wVarP);
                        try {
                            jG = rVarF.g() - ((long) 22);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                S3.a.j(rVarF, th);
                                throw th2;
                            }
                        }
                        if (jG < 0) {
                            throw new IOException("not a zip: size=" + rVarF.g());
                        }
                        long jMax = Math.max(jG - 65536, 0L);
                        while (true) {
                            f5.y yVarD = f2.h.d(rVarF.h(jG));
                            try {
                                if (yVarD.A() == 101010256) {
                                    int iG = yVarD.g() & 65535;
                                    int iG2 = yVarD.g() & 65535;
                                    long jG2 = yVarD.g() & 65535;
                                    it = it2;
                                    if (jG2 != (yVarD.g() & 65535) || iG != 0 || iG2 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    yVarD.a(4L);
                                    long jA = ((long) yVarD.A()) & 4294967295L;
                                    int iG3 = yVarD.g() & 65535;
                                    i.P p5 = new i.P(iG3, jG2, jA);
                                    yVarD.h(iG3);
                                    yVarD.close();
                                    long j6 = jG - ((long) 20);
                                    if (j6 > 0) {
                                        f5.y yVarD2 = f2.h.d(rVarF.h(j6));
                                        try {
                                            if (yVarD2.A() == 117853008) {
                                                int iA = yVarD2.A();
                                                long jO = yVarD2.o();
                                                if (yVarD2.A() != 1 || iA != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                yVarD2 = f2.h.d(rVarF.h(jO));
                                                try {
                                                    int iA2 = yVarD2.A();
                                                    if (iA2 != 101075792) {
                                                        throw new IOException("bad zip: expected " + g5.b.c(101075792) + " but was " + g5.b.c(iA2));
                                                    }
                                                    yVarD2.a(12L);
                                                    int iA3 = yVarD2.A();
                                                    int iA4 = yVarD2.A();
                                                    long jO2 = yVarD2.o();
                                                    if (jO2 != yVarD2.o() || iA3 != 0 || iA4 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    yVarD2.a(8L);
                                                    i.P p6 = new i.P(p5.f9236c, jO2, yVarD2.o());
                                                    S3.a.j(yVarD2, null);
                                                    p5 = p6;
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } finally {
                                                    }
                                                }
                                                throw th;
                                            }
                                            S3.a.j(yVarD2, null);
                                        } finally {
                                            try {
                                                throw th3;
                                            } finally {
                                            }
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    f5.y yVarD3 = f2.h.d(rVarF.h(p5.f9235b));
                                    try {
                                        long j7 = p5.f9234a;
                                        long j8 = 0;
                                        while (j8 < j7) {
                                            g5.f fVarD = g5.b.d(yVarD3);
                                            long j9 = j7;
                                            if (fVarD.f8551g >= p5.f9235b) {
                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                            }
                                            f5.w wVar4 = g5.e.f8543c;
                                            if (B3.e.b(fVarD.f8545a)) {
                                                arrayList3.add(fVarD);
                                            }
                                            j8++;
                                            j7 = j9;
                                            throw th;
                                        }
                                        S3.a.j(yVarD3, null);
                                        f5.H h4 = new f5.H(wVarP, sVar2, g5.b.b(arrayList3));
                                        S3.a.j(rVarF, null);
                                        c1311g = new C1311g(h4, g5.e.f8543c);
                                    } catch (Throwable th4) {
                                    }
                                } else {
                                    Iterator it3 = it2;
                                    yVarD.close();
                                    jG--;
                                    if (jG < jMax) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                    it2 = it3;
                                }
                            } catch (Throwable th5) {
                                yVarD.close();
                                throw th5;
                            }
                        }
                    } else {
                        it = it2;
                        c1311g = null;
                    }
                    if (c1311g != null) {
                        arrayList2.add(c1311g);
                    }
                    it2 = it;
                }
                ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size());
                arrayList4.addAll(arrayList);
                arrayList4.addAll(arrayList2);
                return arrayList4;
        }
    }
}
