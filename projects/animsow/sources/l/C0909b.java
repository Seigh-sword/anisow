package l;

import androidx.appcompat.view.menu.ActionMenuItemView;
import m.A0;
import m.C0965i;
import m.C0967j;

/* JADX INFO: renamed from: l.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0909b extends A0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f9697F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0909b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f9697F = actionMenuItemView;
    }

    @Override // m.A0
    public final InterfaceC0905E b() {
        C0965i c0965i;
        AbstractC0910c abstractC0910c = this.f9697F.f5104I;
        if (abstractC0910c == null || (c0965i = ((C0967j) abstractC0910c).f10298a.f10354Q) == null) {
            return null;
        }
        return c0965i.a();
    }

    @Override // m.A0
    public final boolean c() {
        InterfaceC0905E interfaceC0905EB;
        ActionMenuItemView actionMenuItemView = this.f9697F;
        n nVar = actionMenuItemView.f5102G;
        return nVar != null && nVar.c(actionMenuItemView.f5099D) && (interfaceC0905EB = b()) != null && interfaceC0905EB.a();
    }
}
