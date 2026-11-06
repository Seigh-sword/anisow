package a3;

import P0.h;
import android.os.Bundle;
import b3.AbstractC0341a;
import b3.C0342b;
import b3.C0343c;
import com.google.android.gms.internal.measurement.C0466o0;
import com.google.android.gms.internal.measurement.C0525y0;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: a3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0262c implements InterfaceC0260a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0262c f5013c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1.b f5014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5015b;

    public C0262c(K1.b bVar) {
        AbstractC1332d.m(bVar);
        this.f5014a = bVar;
        this.f5015b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if ((!AbstractC0341a.f5926c.contains(str)) && AbstractC0341a.a(str2, bundle) && AbstractC0341a.b(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            C0466o0 c0466o0 = (C0466o0) this.f5014a.f1515x;
            c0466o0.getClass();
            c0466o0.b(new C0525y0(c0466o0, str, str2, bundle));
        }
    }

    public final C0261b b(C0261b c0261b, String str) {
        Object obj;
        if (!(!AbstractC0341a.f5926c.contains(str))) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f5015b;
        if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        int i6 = 0;
        K1.b bVar = this.f5014a;
        if (zEquals) {
            h hVar = new h();
            hVar.f2408b = c0261b;
            hVar.f2409c = bVar;
            C0342b c0342b = new C0342b(0, hVar);
            hVar.f2410d = c0342b;
            bVar.y(c0342b);
            hVar.f2407a = new HashSet();
            obj = hVar;
        } else if ("clx".equals(str)) {
            C0343c c0343c = new C0343c();
            c0343c.f5930w = c0261b;
            c0343c.f5931x = bVar;
            C0342b c0342b2 = new C0342b(1, c0343c);
            c0343c.f5932y = c0342b2;
            bVar.y(c0342b2);
            obj = c0343c;
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        concurrentHashMap.put(str, obj);
        return new C0261b(this, i6, str);
    }
}
