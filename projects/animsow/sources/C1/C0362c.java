package c1;

import androidx.lifecycle.InterfaceC0309i;
import androidx.lifecycle.e0;
import androidx.lifecycle.j0;
import h0.AbstractComponentCallbacksC0734B;
import s4.InterfaceC1309e;

/* JADX INFO: renamed from: c1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0362c extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0734B f6177y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1309e f6178z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0362c(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, InterfaceC1309e interfaceC1309e, int i6) {
        super(0);
        this.f6176x = i6;
        this.f6177y = abstractComponentCallbacksC0734B;
        this.f6178z = interfaceC1309e;
    }

    public final e0 a() {
        InterfaceC0309i interfaceC0309i;
        int i6 = this.f6176x;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f6177y;
        InterfaceC1309e interfaceC1309e = this.f6178z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                j0 j0Var = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var : null;
                if (interfaceC0309i == null || (r0 = interfaceC0309i.f()) == null) {
                }
                break;
            case 1:
                j0 j0Var2 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var2 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var2 : null;
                if (interfaceC0309i == null || (r0 = interfaceC0309i.f()) == null) {
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                j0 j0Var3 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var3 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var3 : null;
                if (interfaceC0309i == null || (r0 = interfaceC0309i.f()) == null) {
                }
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                j0 j0Var4 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var4 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var4 : null;
                if (interfaceC0309i == null || (r0 = interfaceC0309i.f()) == null) {
                }
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                j0 j0Var5 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var5 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var5 : null;
                if (interfaceC0309i == null || (r0 = interfaceC0309i.f()) == null) {
                }
                break;
            default:
                j0 j0Var6 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var6 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var6 : null;
                if (interfaceC0309i == null || (r0 = interfaceC0309i.f()) == null) {
                }
                break;
        }
        return abstractComponentCallbacksC0734B.f();
    }

    @Override // C4.a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f6176x) {
        }
        return a();
    }
}
