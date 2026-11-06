package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import l0.C0921c;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d0 f5618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B3.e f5619d = new B3.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f5620b;

    public d0(Application application) {
        this.f5620b = application;
    }

    @Override // androidx.lifecycle.f0, androidx.lifecycle.e0
    public final b0 a(Class cls) {
        Application application = this.f5620b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.f0, androidx.lifecycle.e0
    public final b0 c(Class cls, C0921c c0921c) {
        if (this.f5620b != null) {
            return a(cls);
        }
        Application application = (Application) c0921c.f9835a.get(f5619d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0301a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final b0 d(Class cls, Application application) {
        if (!AbstractC0301a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            b0 b0Var = (b0) cls.getConstructor(Application.class).newInstance(application);
            AbstractC1305a.n(b0Var, "{\n                try {\n…          }\n            }");
            return b0Var;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }
}
