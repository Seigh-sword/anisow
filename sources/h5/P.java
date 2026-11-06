package h5;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class P extends B3.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9032x;

    public /* synthetic */ P(int i6) {
        this.f9032x = i6;
    }

    @Override // B3.e
    public final String l(Method method, int i6) {
        switch (this.f9032x) {
            case 1:
                Parameter parameter = method.getParameters()[i6];
                if (!parameter.isNamePresent()) {
                }
                break;
        }
        return super.l(method, i6);
    }

    @Override // B3.e
    public final Object v(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f9032x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (Build.VERSION.SDK_INT >= 26) {
                    return AbstractC1305a.I(method, cls, obj, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return AbstractC1305a.I(method, cls, obj, objArr);
        }
    }

    @Override // B3.e
    public final boolean x(Method method) {
        switch (this.f9032x) {
        }
        return method.isDefault();
    }
}
