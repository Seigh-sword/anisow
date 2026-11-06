package d;

import android.view.View;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0308h;
import androidx.lifecycle.InterfaceC0319t;
import androidx.lifecycle.InterfaceC0321v;
import androidx.lifecycle.W;
import androidx.lifecycle.i0;
import h0.AbstractComponentCallbacksC0734B;
import java.util.HashMap;
import m4.C1137j;

/* JADX INFO: renamed from: d.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0629j implements InterfaceC0319t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f8106x;

    public /* synthetic */ C0629j(int i6, Object obj) {
        this.f8105w = i6;
        this.f8106x = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        View view;
        int i6 = this.f8105w;
        Object obj = this.f8106x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractActivityC0638s abstractActivityC0638s = (AbstractActivityC0638s) obj;
                if (abstractActivityC0638s.f8126A == null) {
                    C0631l c0631l = (C0631l) abstractActivityC0638s.getLastNonConfigurationInstance();
                    if (c0631l != null) {
                        abstractActivityC0638s.f8126A = c0631l.f8108a;
                    }
                    if (abstractActivityC0638s.f8126A == null) {
                        abstractActivityC0638s.f8126A = new i0();
                    }
                }
                abstractActivityC0638s.f205w.b(this);
                return;
            case 1:
                if (enumC0313m != EnumC0313m.ON_STOP || (view = ((AbstractComponentCallbacksC0734B) obj).f8618c0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                new HashMap();
                InterfaceC0308h[] interfaceC0308hArr = (InterfaceC0308h[]) obj;
                if (interfaceC0308hArr.length > 0) {
                    InterfaceC0308h interfaceC0308h = interfaceC0308hArr[0];
                    throw null;
                }
                if (interfaceC0308hArr.length <= 0) {
                    return;
                }
                InterfaceC0308h interfaceC0308h2 = interfaceC0308hArr[0];
                throw null;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (enumC0313m == EnumC0313m.ON_CREATE) {
                    interfaceC0321v.g().b(this);
                    ((W) obj).c();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0313m).toString());
                }
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0628i.p(obj);
                throw null;
            default:
                if (enumC0313m == EnumC0313m.ON_DESTROY) {
                    C1137j c1137j = (C1137j) obj;
                    c1137j.getClass();
                    c1137j.f11671a = null;
                    c1137j.f11672b = null;
                    return;
                }
                return;
        }
    }

    public C0629j(W w5) {
        this.f8105w = 3;
        this.f8106x = w5;
    }

    public C0629j(InterfaceC0308h[] interfaceC0308hArr) {
        this.f8105w = 2;
        this.f8106x = interfaceC0308hArr;
    }
}
