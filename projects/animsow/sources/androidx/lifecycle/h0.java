package androidx.lifecycle;

import d.AbstractActivityC0638s;
import i.C0803c;
import java.util.HashMap;
import l0.AbstractC0920b;
import l0.C0919a;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0803c f5626a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, e0 e0Var) {
        this(i0Var, e0Var, C0919a.f9834b);
        AbstractC1305a.o(i0Var, "store");
        AbstractC1305a.o(e0Var, "factory");
    }

    public final b0 a(I4.b bVar) {
        String str;
        AbstractC1305a.o(bVar, "modelClass");
        Class cls = ((D4.d) bVar).f367a;
        AbstractC1305a.o(cls, "jClass");
        String canonicalName = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            HashMap map = D4.d.f365c;
            if (zIsArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) map.get(cls.getName());
                if (canonicalName == null) {
                    canonicalName = cls.getCanonicalName();
                }
            }
        }
        if (canonicalName != null) {
            return this.f5626a.F(bVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public h0(i0 i0Var, e0 e0Var, AbstractC0920b abstractC0920b) {
        AbstractC1305a.o(i0Var, "store");
        AbstractC1305a.o(e0Var, "factory");
        AbstractC1305a.o(abstractC0920b, "defaultCreationExtras");
        this.f5626a = new C0803c(i0Var, e0Var, abstractC0920b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(AbstractActivityC0638s abstractActivityC0638s, l4.d dVar) {
        this(abstractActivityC0638s.e(), dVar, abstractActivityC0638s.a());
        AbstractC1305a.o(abstractActivityC0638s, "owner");
    }
}
