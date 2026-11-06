package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c0.AbstractC0353b;
import java.util.HashMap;
import java.util.List;
import s4.AbstractC1305a;
import z0.C1523d;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0306f implements InterfaceC0319t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5622w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f5623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f5624y;

    public C0306f(AbstractC0315o abstractC0315o, C1523d c1523d) {
        this.f5623x = abstractC0315o;
        this.f5624y = c1523d;
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        int i6 = this.f5622w;
        Object obj = this.f5623x;
        Object obj2 = this.f5624y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                switch (AbstractC0305e.f5621a[enumC0313m.ordinal()]) {
                    case 1:
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((c0.m) obj).getClass();
                        break;
                    case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                        c0.m mVar = (c0.m) obj;
                        mVar.f6134x.getClass();
                        (Build.VERSION.SDK_INT >= 28 ? AbstractC0353b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new c0.p(0), 500L);
                        mVar.f6133w.b(mVar);
                        break;
                    case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0319t interfaceC0319t = (InterfaceC0319t) obj2;
                if (interfaceC0319t != null) {
                    interfaceC0319t.b(interfaceC0321v, enumC0313m);
                    return;
                }
                return;
            case 1:
                if (enumC0313m == EnumC0313m.ON_START) {
                    ((AbstractC0315o) obj).b(this);
                    ((C1523d) obj2).d();
                    return;
                }
                return;
            default:
                HashMap map = ((C0302b) obj2).f5605a;
                C0302b.a((List) map.get(enumC0313m), interfaceC0321v, enumC0313m, obj);
                C0302b.a((List) map.get(EnumC0313m.ON_ANY), interfaceC0321v, enumC0313m, obj);
                return;
        }
    }

    public C0306f(c0.m mVar, InterfaceC0319t interfaceC0319t) {
        AbstractC1305a.o(mVar, "defaultLifecycleObserver");
        this.f5623x = mVar;
        this.f5624y = interfaceC0319t;
    }

    public C0306f(Object obj) {
        this.f5623x = obj;
        this.f5624y = C0304d.f5615c.b(obj.getClass());
    }
}
