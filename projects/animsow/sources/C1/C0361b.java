package c1;

import androidx.lifecycle.InterfaceC0309i;
import androidx.lifecycle.j0;
import l0.AbstractC0920b;
import l0.C0919a;
import s4.InterfaceC1309e;

/* JADX INFO: renamed from: c1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0361b extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6174x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1309e f6175y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0361b(InterfaceC1309e interfaceC1309e, int i6) {
        super(0);
        this.f6174x = i6;
        this.f6175y = interfaceC1309e;
    }

    public final AbstractC0920b a() {
        InterfaceC0309i interfaceC0309i;
        int i6 = this.f6174x;
        InterfaceC1309e interfaceC1309e = this.f6175y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                j0 j0Var = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var : null;
                if (interfaceC0309i == null) {
                }
                break;
            case 1:
                j0 j0Var2 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var2 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var2 : null;
                if (interfaceC0309i == null) {
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                j0 j0Var3 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var3 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var3 : null;
                if (interfaceC0309i == null) {
                }
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                j0 j0Var4 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var4 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var4 : null;
                if (interfaceC0309i == null) {
                }
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                j0 j0Var5 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var5 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var5 : null;
                if (interfaceC0309i == null) {
                }
                break;
            default:
                j0 j0Var6 = (j0) interfaceC1309e.getValue();
                interfaceC0309i = j0Var6 instanceof InterfaceC0309i ? (InterfaceC0309i) j0Var6 : null;
                if (interfaceC0309i == null) {
                }
                break;
        }
        return C0919a.f9834b;
    }

    @Override // C4.a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f6174x) {
        }
        return a();
    }
}
