package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1 f7721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f7724f;

    public W1(Context context) {
        this.f7720b = false;
        this.f7722d = false;
        this.f7719a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.f7723e = cls.getMethod("d", new Class[0]).invoke(null, new Object[0]);
            } catch (NullPointerException unused) {
                this.f7723e = cls.getMethod("e", new Class[0]).invoke(null, new Object[0]);
                this.f7722d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f7724f = declaredField;
            declaredField.setAccessible(true);
            this.f7721c = new V1();
            this.f7720b = true;
            e();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e6) {
            d(e6);
        }
    }

    public static void d(Exception exc) {
        AbstractC0603w1.b(EnumC0600v1.f7997y, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    public final void c() {
        if (this.f7720b) {
            try {
                PurchasingListener purchasingListener = (PurchasingListener) this.f7724f.get(this.f7723e);
                V1 v12 = this.f7721c;
                if (purchasingListener != v12) {
                    v12.getClass();
                    e();
                }
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            }
        }
    }

    public final void e() {
        if (this.f7722d) {
            OSUtils.u(new U1(this));
        } else {
            PurchasingService.registerListener(this.f7719a, this.f7721c);
        }
    }
}
