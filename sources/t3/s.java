package T3;

import Q3.A;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3507d;

    public s(Q3.n nVar, A a6, Type type) {
        this.f3504a = 0;
        this.f3505b = nVar;
        this.f3506c = a6;
        this.f3507d = type;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        int i6 = this.f3504a;
        Object obj = this.f3506c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((A) obj).b(aVar);
            default:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                String strU = aVar.U();
                Enum r02 = (Enum) ((Map) this.f3505b).get(strU);
                return r02 == null ? (Enum) ((Map) obj).get(strU) : r02;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    @Override // Q3.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(X3.b r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f3504a
            java.lang.Object r1 = r4.f3507d
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto Ld
            r6 = 0
            goto L15
        Ld:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            r5.Q(r6)
            return
        L19:
            java.lang.Object r0 = r4.f3506c
            Q3.A r0 = (Q3.A) r0
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            if (r6 == 0) goto L2e
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 != 0) goto L29
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L2e
        L29:
            java.lang.Class r2 = r6.getClass()
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == r1) goto L64
            java.lang.Object r1 = r4.f3505b
            Q3.n r1 = (Q3.n) r1
            com.google.gson.reflect.TypeToken r3 = new com.google.gson.reflect.TypeToken
            r3.<init>(r2)
            Q3.A r1 = r1.c(r3)
            boolean r2 = r1 instanceof T3.n
            if (r2 != 0) goto L43
            goto L63
        L43:
            r2 = r0
        L44:
            boolean r3 = r2 instanceof T3.r
            if (r3 == 0) goto L5e
            r3 = r2
            T3.r r3 = (T3.r) r3
            Q3.m r3 = (Q3.m) r3
            Q3.A r3 = r3.f2810a
            if (r3 == 0) goto L56
            if (r3 != r2) goto L54
            goto L5e
        L54:
            r2 = r3
            goto L44
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            r5.<init>(r6)
            throw r5
        L5e:
            boolean r2 = r2 instanceof T3.n
            if (r2 != 0) goto L63
            goto L64
        L63:
            r0 = r1
        L64:
            r0.c(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.s.c(X3.b, java.lang.Object):void");
    }

    public s(Class cls) {
        this.f3504a = 1;
        this.f3505b = new HashMap();
        this.f3506c = new HashMap();
        this.f3507d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new v(cls))) {
                Enum r42 = (Enum) field.get(null);
                String strName = r42.name();
                String string = r42.toString();
                R3.b bVar = (R3.b) field.getAnnotation(R3.b.class);
                Object obj = this.f3505b;
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        ((Map) obj).put(str, r42);
                    }
                }
                ((Map) obj).put(strName, r42);
                ((Map) this.f3506c).put(string, r42);
                ((Map) this.f3507d).put(r42, strName);
            }
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        }
    }
}
