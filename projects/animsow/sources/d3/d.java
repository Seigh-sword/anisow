package d3;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import d.AbstractC0628i;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements D3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8189b;

    public /* synthetic */ d(int i6, Object obj) {
        this.f8188a = i6;
        this.f8189b = obj;
    }

    @Override // D3.c
    public final Object get() {
        int i6 = this.f8188a;
        Object obj = this.f8189b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e6) {
                    throw new m(AbstractC0628i.j("Could not instantiate ", str, "."), e6);
                } catch (InstantiationException e7) {
                    throw new m(AbstractC0628i.j("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e8) {
                    throw new m(AbstractC0628i.q("Could not instantiate ", str), e8);
                } catch (InvocationTargetException e9) {
                    throw new m(AbstractC0628i.q("Could not instantiate ", str), e9);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                Object obj2 = E3.c.f399m;
                return new F3.b((Y2.g) obj);
        }
    }
}
