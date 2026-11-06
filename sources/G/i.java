package G;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import d2.AbstractC0651b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends S0.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Method f655A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Method f656B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Class f657y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Constructor f658z;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi24Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f658z = constructor;
        f657y = cls;
        f655A = method2;
        f656B = method;
    }

    public static boolean I(Object obj, ByteBuffer byteBuffer, int i6, int i7, boolean z5) {
        try {
            return ((Boolean) f655A.invoke(obj, byteBuffer, Integer.valueOf(i6), null, Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface J(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f657y, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f656B.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    @Override // S0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface u(android.content.Context r17, F.g r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            r0 = 0
            java.lang.reflect.Constructor r2 = G.i.f658z     // Catch: java.lang.Throwable -> Lb
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 != 0) goto Lf
            return r1
        Lf:
            r3 = r18
            F.h[] r3 = r3.f436a
            int r4 = r3.length
            r5 = r0
        L15:
            if (r5 >= r4) goto L72
            r6 = r3[r5]
            int r0 = r6.f442f
            java.io.File r7 = d2.AbstractC0651b.r(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L5a
        L25:
            r8 = r19
            boolean r0 = d2.AbstractC0651b.j(r7, r8, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            r9.<init>(r7)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            goto L57
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L55:
            throw r10     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L56:
            r0 = r1
        L57:
            r7.delete()
        L5a:
            if (r0 != 0) goto L5d
            return r1
        L5d:
            int r7 = r6.f438b
            boolean r9 = r6.f439c
            int r6 = r6.f441e
            boolean r0 = I(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L6a
            return r1
        L6a:
            int r5 = r5 + 1
            goto L15
        L6d:
            r0 = move-exception
            r7.delete()
            throw r0
        L72:
            android.graphics.Typeface r0 = J(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G.i.u(android.content.Context, F.g, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // S0.f
    public final Typeface v(Context context, K.h[] hVarArr, int i6) {
        Object objNewInstance;
        try {
            objNewInstance = f658z.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        s.k kVar = new s.k();
        for (K.h hVar : hVarArr) {
            Uri uri = hVar.f1487a;
            ByteBuffer byteBufferW = (ByteBuffer) kVar.getOrDefault(uri, null);
            if (byteBufferW == null) {
                byteBufferW = AbstractC0651b.w(context, uri);
                kVar.put(uri, byteBufferW);
            }
            if (byteBufferW == null) {
                return null;
            }
            if (!I(objNewInstance, byteBufferW, hVar.f1488b, hVar.f1489c, hVar.f1490d)) {
                return null;
            }
        }
        Typeface typefaceJ = J(objNewInstance);
        if (typefaceJ == null) {
            return null;
        }
        return Typeface.create(typefaceJ, i6);
    }
}
