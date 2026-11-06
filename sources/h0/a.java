package H0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1280b f893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1280b f894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1280b f895c;

    public a(C1280b c1280b, C1280b c1280b2, C1280b c1280b3) {
        this.f893a = c1280b;
        this.f894b = c1280b2;
        this.f895c = c1280b3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1280b c1280b = this.f895c;
        Class cls2 = (Class) c1280b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1280b.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        C1280b c1280b = this.f893a;
        Method method = (Method) c1280b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        c1280b.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C1280b c1280b = this.f894b;
        Method method = (Method) c1280b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        c1280b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i6);

    public final int f(int i6, int i7) {
        return !e(i7) ? i6 : ((b) this).f897e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i6) {
        if (!e(i6)) {
            return parcelable;
        }
        return ((b) this).f897e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String string = ((b) this).f897e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (c) c(string).invoke(null, a());
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public abstract void i(int i6);

    public final void j(int i6, int i7) {
        i(i7);
        ((b) this).f897e.writeInt(i6);
    }

    public final void k(c cVar) {
        if (cVar == null) {
            ((b) this).f897e.writeString(null);
            return;
        }
        try {
            ((b) this).f897e.writeString(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                int i6 = bVarA.f901i;
                if (i6 >= 0) {
                    int i7 = bVarA.f896d.get(i6);
                    Parcel parcel = bVarA.f897e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i7);
                    parcel.writeInt(iDataPosition - i7);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
            } catch (InvocationTargetException e9) {
                if (!(e9.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
                }
                throw ((RuntimeException) e9.getCause());
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }
}
