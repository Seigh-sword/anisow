package m;

import N.InterfaceC0092f0;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0949a implements InterfaceC0092f0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f10241y;

    @Override // N.InterfaceC0092f0
    public final void a() {
        this.f10239w = true;
    }

    @Override // N.InterfaceC0092f0
    public final void c() {
        if (this.f10239w) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f10241y;
        actionBarContextView.f5139B = null;
        super/*android.view.View*/.setVisibility(this.f10240x);
    }

    @Override // N.InterfaceC0092f0
    public final void f() {
        super/*android.view.View*/.setVisibility(0);
        this.f10239w = false;
    }
}
