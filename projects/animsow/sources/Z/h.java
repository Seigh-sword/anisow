package Z;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0268c;
import androidx.datastore.preferences.protobuf.AbstractC0280i;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0279h0;
import androidx.datastore.preferences.protobuf.C0281i0;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.InterfaceC0273e0;
import androidx.datastore.preferences.protobuf.K;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h extends C {
    private static final h DEFAULT_INSTANCE;
    private static volatile InterfaceC0273e0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private E strings_ = C0279h0.f5449z;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        C.m(h.class, hVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void o(h hVar, Set set) {
        E e6 = hVar.strings_;
        if (!((AbstractC0268c) e6).f5436w) {
            int size = e6.size();
            hVar.strings_ = e6.n(size == 0 ? 10 : size * 2);
        }
        List list = hVar.strings_;
        Charset charset = F.f5369a;
        if (!(set instanceof K)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List listO = ((K) set).o();
        K k5 = (K) list;
        int size4 = list.size();
        for (Object obj2 : listO) {
            if (obj2 == null) {
                String str2 = "Element at index " + (k5.size() - size4) + " is null.";
                for (int size5 = k5.size() - 1; size5 >= size4; size5--) {
                    k5.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof AbstractC0280i) {
                k5.k((AbstractC0280i) obj2);
            } else {
                k5.add((String) obj2);
            }
        }
    }

    public static h p() {
        return DEFAULT_INSTANCE;
    }

    public static g r() {
        return (g) ((A) DEFAULT_INSTANCE.f(5));
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object f(int i6) {
        switch (u.h.b(i6)) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0281i0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return new h();
            case j.LONG_FIELD_NUMBER /* 4 */:
                return new g(DEFAULT_INSTANCE);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0273e0 b6 = PARSER;
                if (b6 == null) {
                    synchronized (h.class) {
                        try {
                            b6 = PARSER;
                            if (b6 == null) {
                                b6 = new B();
                                PARSER = b6;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return b6;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final E q() {
        return this.strings_;
    }
}
