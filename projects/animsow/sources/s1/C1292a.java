package s1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.measurement.C0396c2;
import i.C0803c;
import java.io.InputStream;
import java.util.ArrayDeque;
import m1.C1010h;
import m1.InterfaceC1006d;
import t1.AbstractC1339b;
import t1.C1341d;

/* JADX INFO: renamed from: s1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1292a implements j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12559c;

    public C1292a(Resources resources, j1.o oVar) {
        this.f12557a = 0;
        this.f12559c = resources;
        this.f12558b = oVar;
    }

    @Override // j1.o
    public final boolean a(Object obj, j1.m mVar) {
        int i6 = this.f12557a;
        Object obj2 = this.f12558b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((j1.o) obj2).a(obj, mVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((r) obj2).getClass();
                return true;
        }
    }

    @Override // j1.o
    public final l1.F b(Object obj, int i6, int i7, j1.m mVar) {
        boolean z5;
        y yVar;
        C1.e eVar;
        switch (this.f12557a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                l1.F fB = ((j1.o) this.f12558b).b(obj, i6, i7, mVar);
                Resources resources = (Resources) this.f12559c;
                if (fB == null) {
                    return null;
                }
                return new C1295d(resources, fB);
            case 1:
                l1.F fC = ((C1341d) this.f12558b).c((Uri) obj, mVar);
                if (fC == null) {
                    return null;
                }
                return t.a((InterfaceC1006d) this.f12559c, (Drawable) ((AbstractC1339b) fC).a(), i6, i7);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof y) {
                    yVar = (y) inputStream;
                    z5 = false;
                } else {
                    z5 = true;
                    yVar = new y(inputStream, (C1010h) this.f12559c);
                }
                ArrayDeque arrayDeque = C1.e.f117y;
                synchronized (arrayDeque) {
                    eVar = (C1.e) arrayDeque.poll();
                    break;
                }
                if (eVar == null) {
                    eVar = new C1.e();
                }
                C1.e eVar2 = eVar;
                eVar2.f118w = yVar;
                C1.k kVar = new C1.k(eVar2);
                C0396c2 c0396c2 = new C0396c2(yVar, 28, eVar2);
                try {
                    r rVar = (r) this.f12558b;
                    C1295d c1295dA = rVar.a(new C0803c(rVar.f12594c, kVar, rVar.f12595d), i6, i7, mVar, c0396c2);
                    eVar2.f119x = null;
                    eVar2.f118w = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar2);
                        break;
                    }
                    if (z5) {
                        yVar.c();
                    }
                    return c1295dA;
                } catch (Throwable th) {
                    eVar2.f119x = null;
                    eVar2.f118w = null;
                    ArrayDeque arrayDeque2 = C1.e.f117y;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar2);
                        if (z5) {
                            yVar.c();
                        }
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ C1292a(Object obj, int i6, Object obj2) {
        this.f12557a = i6;
        this.f12558b = obj;
        this.f12559c = obj2;
    }
}
