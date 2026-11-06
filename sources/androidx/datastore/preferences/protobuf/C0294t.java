package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0294t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0294t f5514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0294t f5515b = new C0294t();

    public C0294t() {
        Collections.emptyMap();
    }

    public static C0294t a() {
        C0294t c0294t = f5514a;
        if (c0294t == null) {
            synchronized (C0294t.class) {
                try {
                    c0294t = f5514a;
                    if (c0294t == null) {
                        Class cls = AbstractC0293s.f5513a;
                        C0294t c0294t2 = null;
                        if (cls != null) {
                            try {
                                c0294t2 = (C0294t) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0294t2 == null) {
                            c0294t2 = f5515b;
                        }
                        f5514a = c0294t2;
                        c0294t = c0294t2;
                    }
                } finally {
                }
            }
        }
        return c0294t;
    }
}
