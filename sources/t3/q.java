package T3;

import Q3.A;
import Q3.B;
import Q3.C0165a;
import com.google.gson.reflect.TypeToken;
import d.AbstractC0628i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class q implements B {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final List f3499A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1474r f3500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q3.i f3501x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final S3.i f3502y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d f3503z;

    public q(C1474r c1474r, S3.i iVar, d dVar, List list) {
        C0165a c0165a = Q3.h.f2804w;
        this.f3500w = c1474r;
        this.f3501x = c0165a;
        this.f3502y = iVar;
        this.f3503z = dVar;
        this.f3499A = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!S3.t.f3286a.a(obj, accessibleObject)) {
            throw new Q3.q(AbstractC0628i.i(V3.c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // Q3.B
    public final A a(Q3.n nVar, TypeToken typeToken) {
        Class cls = typeToken.f7456a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        S3.a.s(this.f3499A);
        return V3.c.f3745a.f(cls) ? new p(cls, c(nVar, typeToken, cls, true)) : new o(this.f3500w.d(typeToken), c(nVar, typeToken, cls, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.LinkedHashMap c(Q3.n r36, com.google.gson.reflect.TypeToken r37, java.lang.Class r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.q.c(Q3.n, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    public final boolean d(Field field, boolean z5) {
        Class<?> type = field.getType();
        S3.i iVar = this.f3502y;
        iVar.getClass();
        if (!S3.i.e(type)) {
            iVar.d(z5);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !S3.i.e(field.getType())) {
                List list = z5 ? iVar.f3256w : iVar.f3257x;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        AbstractC0628i.p(it.next());
                        throw null;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
