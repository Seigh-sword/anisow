package D4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements I4.a, Serializable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f358A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f359B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient I4.a f360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Class f362y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f363z;

    public b(Object obj, Class cls, String str, String str2, boolean z5) {
        this.f361x = obj;
        this.f362y = cls;
        this.f363z = str;
        this.f358A = str2;
        this.f359B = z5;
    }

    public abstract I4.a a();

    public final c c() {
        Class cls = this.f362y;
        if (cls == null) {
            return null;
        }
        if (!this.f359B) {
            return s.a(cls);
        }
        s.f378a.getClass();
        return new j(cls);
    }
}
