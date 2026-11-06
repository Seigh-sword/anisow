package z0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0319t;
import androidx.lifecycle.InterfaceC0321v;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import d.AbstractC0628i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: z0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1520a implements InterfaceC0319t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1525f f14064w;

    public C1520a(InterfaceC1525f interfaceC1525f) {
        AbstractC1305a.o(interfaceC1525f, "owner");
        this.f14064w = interfaceC1525f;
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        if (enumC0313m != EnumC0313m.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0321v.g().b(this);
        InterfaceC1525f interfaceC1525f = this.f14064w;
        Bundle bundleA = interfaceC1525f.b().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, C1520a.class.getClassLoader()).asSubclass(InterfaceC1521b.class);
                AbstractC1305a.n(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        AbstractC1305a.n(objNewInstance, "{\n                constr…wInstance()\n            }");
                        if (!(interfaceC1525f instanceof j0)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                        }
                        i0 i0VarE = ((j0) interfaceC1525f).e();
                        C1523d c1523dB = interfaceC1525f.b();
                        i0VarE.getClass();
                        LinkedHashMap linkedHashMap = i0VarE.f5627a;
                        for (String str2 : new HashSet(linkedHashMap.keySet())) {
                            AbstractC1305a.o(str2, "key");
                            b0 b0Var = (b0) linkedHashMap.get(str2);
                            AbstractC1305a.l(b0Var);
                            U.a(b0Var, c1523dB, interfaceC1525f.g());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            c1523dB.d();
                        }
                    } catch (Exception e6) {
                        throw new RuntimeException(AbstractC0628i.q("Failed to instantiate ", str), e6);
                    }
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                }
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException(AbstractC0628i.j("Class ", str, " wasn't found"), e8);
            }
        }
    }
}
