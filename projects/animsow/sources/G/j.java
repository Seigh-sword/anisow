package G;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import d2.AbstractC0651b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends h {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Class f659D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Constructor f660E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Method f661F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Method f662G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Method f663H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Method f664I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Method f665J;

    public j() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodQ;
        Method method2;
        Method method3;
        Method methodR;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodQ = Q(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodR = R(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            cls = null;
            method = null;
            constructor = null;
            methodQ = null;
            method2 = null;
            method3 = null;
            methodR = null;
        }
        this.f659D = cls;
        this.f660E = constructor;
        this.f661F = methodQ;
        this.f662G = method2;
        this.f663H = method3;
        this.f664I = method;
        this.f665J = methodR;
    }

    public static Method Q(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void K(Object obj) {
        try {
            this.f664I.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean L(Context context, Object obj, String str, int i6, int i7, int i8, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f661F.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface M(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f659D, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f665J.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean N(Object obj) {
        try {
            return ((Boolean) this.f663H.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean O() {
        Method method = this.f661F;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object P() {
        try {
            return this.f660E.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method R(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // G.h, S0.f
    public final Typeface u(Context context, F.g gVar, Resources resources, int i6) {
        if (!O()) {
            return super.u(context, gVar, resources, i6);
        }
        Object objP = P();
        if (objP == null) {
            return null;
        }
        for (F.h hVar : gVar.f436a) {
            if (!L(context, objP, hVar.f437a, hVar.f441e, hVar.f438b, hVar.f439c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.f440d))) {
                K(objP);
                return null;
            }
        }
        if (N(objP)) {
            return M(objP);
        }
        return null;
    }

    @Override // G.h, S0.f
    public final Typeface v(Context context, K.h[] hVarArr, int i6) {
        Typeface typefaceM;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!O()) {
            K.h hVarA = A(i6, hVarArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarA.f1487a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarA.f1489c).setItalic(hVarA.f1490d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (K.h hVar : hVarArr) {
            if (hVar.f1491e == 0) {
                Uri uri = hVar.f1487a;
                if (!map.containsKey(uri)) {
                    map.put(uri, AbstractC0651b.w(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objP = P();
        if (objP == null) {
            return null;
        }
        int length = hVarArr.length;
        int i7 = 0;
        boolean z5 = false;
        while (i7 < length) {
            K.h hVar2 = hVarArr[i7];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f1487a);
            if (byteBuffer != null) {
                if (!((Boolean) this.f662G.invoke(objP, byteBuffer, Integer.valueOf(hVar2.f1488b), null, Integer.valueOf(hVar2.f1489c), Integer.valueOf(hVar2.f1490d ? 1 : 0))).booleanValue()) {
                    K(objP);
                    return null;
                }
                z5 = true;
            }
            i7++;
            z5 = z5;
        }
        if (!z5) {
            K(objP);
            return null;
        }
        if (N(objP) && (typefaceM = M(objP)) != null) {
            return Typeface.create(typefaceM, i6);
        }
        return null;
    }

    @Override // S0.f
    public final Typeface x(Context context, Resources resources, int i6, String str, int i7) {
        if (!O()) {
            return super.x(context, resources, i6, str, i7);
        }
        Object objP = P();
        if (objP == null) {
            return null;
        }
        if (!L(context, objP, str, 0, -1, -1, null)) {
            K(objP);
            return null;
        }
        if (N(objP)) {
            return M(objP);
        }
        return null;
    }
}
