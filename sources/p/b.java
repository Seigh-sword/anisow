package p;

import C4.p;
import V4.B;
import V4.E;
import V4.r;
import X1.C0239g;
import android.accounts.Account;
import d.AbstractC0628i;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import n2.C1153a;
import o0.A1;
import o0.C1222z;
import s.C1281c;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12209e;

    public b(int i6) {
        if (i6 == 4) {
            this.f12209e = C1153a.f11698a;
        } else {
            if (i6 != 7) {
                return;
            }
            this.f12209e = Collections.emptyMap();
            this.f12206b = "GET";
            this.f12207c = new C1486b(2);
        }
    }

    public final B a() {
        if (((r) this.f12205a) != null) {
            return new B(this);
        }
        throw new IllegalStateException("url == null");
    }

    public final C0239g b() {
        return new C0239g((Account) this.f12205a, (C1281c) this.f12206b, null, (String) this.f12207c, (String) this.f12208d, (C1153a) this.f12209e);
    }

    public final void c(String str, E e6) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (e6 != null && !S3.a.F(str)) {
            throw new IllegalArgumentException(AbstractC0628i.j("method ", str, " must not have a request body."));
        }
        if (e6 == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(AbstractC0628i.j("method ", str, " must have a request body."));
        }
        this.f12206b = str;
        this.f12208d = e6;
    }

    public final void d(A1 a12, p pVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f12208d;
        try {
            reentrantLock.lock();
            if (a12 != null) {
                this.f12207c = a12;
            }
            pVar.h((C1222z) this.f12205a, (C1222z) this.f12206b);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(String str) {
        ((C1486b) this.f12207c).c(str);
    }

    public final void f(Class cls, Object obj) {
        if (cls == null) {
            throw new NullPointerException("type == null");
        }
        if (obj == null) {
            ((Map) this.f12209e).remove(cls);
            return;
        }
        if (((Map) this.f12209e).isEmpty()) {
            this.f12209e = new LinkedHashMap();
        }
        ((Map) this.f12209e).put(cls, cls.cast(obj));
    }
}
