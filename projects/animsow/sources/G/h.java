package G;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import d2.AbstractC0651b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class h extends S0.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static Method f650A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static Method f651B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static boolean f652C = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static Class f653y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static Constructor f654z;

    public h() {
        super(7);
    }

    public static boolean I(Object obj, String str, int i6, boolean z5) {
        J();
        try {
            return ((Boolean) f650A.invoke(obj, str, Integer.valueOf(i6), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void J() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f652C) {
            return;
        }
        f652C = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f654z = constructor;
        f653y = cls;
        f650A = method2;
        f651B = method;
    }

    @Override // S0.f
    public Typeface u(Context context, F.g gVar, Resources resources, int i6) {
        J();
        try {
            Object objNewInstance = f654z.newInstance(new Object[0]);
            for (F.h hVar : gVar.f436a) {
                File fileR = AbstractC0651b.r(context);
                if (fileR == null) {
                    return null;
                }
                try {
                    if (!AbstractC0651b.j(fileR, resources, hVar.f442f)) {
                        return null;
                    }
                    if (!I(objNewInstance, fileR.getPath(), hVar.f438b, hVar.f439c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileR.delete();
                }
            }
            J();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f653y, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f651B.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // S0.f
    public Typeface v(Context context, K.h[] hVarArr, int i6) {
        String str;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(A(i6, hVarArr).f1487a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceW = w(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceW;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
