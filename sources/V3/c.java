package V3;

import Q3.q;
import d.AbstractC0628i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m3.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f3745a;

    static {
        v0 aVar;
        try {
            aVar = new b();
        } catch (NoSuchMethodException unused) {
            aVar = new a();
        }
        f3745a = aVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i6 = 0; i6 < parameterTypes.length; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i6].getSimpleName());
        }
        sb.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb);
        return sb.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.reflect.AccessibleObject r4, boolean r5) {
        /*
            boolean r0 = r4 instanceof java.lang.reflect.Field
            java.lang.String r1 = "'"
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "field '"
            r0.<init>(r2)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = c(r4)
        L13:
            r0.append(r4)
            r0.append(r1)
        L19:
            java.lang.String r4 = r0.toString()
            goto L77
        L1e:
            boolean r0 = r4 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L56
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r4.getName()
            r0.<init>(r2)
            a(r4, r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "method '"
            r2.<init>(r3)
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = "#"
            r2.append(r4)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            goto L77
        L56:
            boolean r0 = r4 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "constructor '"
            r0.<init>(r2)
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.String r4 = b(r4)
            goto L13
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<unknown AccessibleObject> "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            goto L19
        L77:
            if (r5 == 0) goto La0
            r5 = 0
            char r0 = r4.charAt(r5)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r5 = r4.charAt(r5)
            char r5 = java.lang.Character.toUpperCase(r5)
            r0.append(r5)
            r5 = 1
            java.lang.String r4 = r4.substring(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        La0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.c.d(java.lang.reflect.AccessibleObject, boolean):java.lang.String");
    }

    public static void e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e6) {
            throw new q(AbstractC0628i.j("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e6);
        }
    }
}
