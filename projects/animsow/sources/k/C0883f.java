package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import m.C0977o;

/* JADX INFO: renamed from: k.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0883f extends AbstractC0880c implements l.m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC0879b f9574A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public WeakReference f9575B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9576C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public l.o f9577D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Context f9578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ActionBarContextView f9579z;

    @Override // k.AbstractC0880c
    public final void a() {
        if (this.f9576C) {
            return;
        }
        this.f9576C = true;
        this.f9574A.d(this);
    }

    @Override // k.AbstractC0880c
    public final View b() {
        WeakReference weakReference = this.f9575B;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0880c
    public final l.o c() {
        return this.f9577D;
    }

    @Override // k.AbstractC0880c
    public final MenuInflater d() {
        return new C0887j(this.f9579z.getContext());
    }

    @Override // k.AbstractC0880c
    public final CharSequence e() {
        return this.f9579z.getSubtitle();
    }

    @Override // k.AbstractC0880c
    public final CharSequence f() {
        return this.f9579z.getTitle();
    }

    @Override // k.AbstractC0880c
    public final void g() {
        this.f9574A.c(this, this.f9577D);
    }

    @Override // k.AbstractC0880c
    public final boolean h() {
        return this.f9579z.f5152O;
    }

    @Override // l.m
    public final boolean i(l.o oVar, MenuItem menuItem) {
        return this.f9574A.b(this, menuItem);
    }

    @Override // l.m
    public final void j(l.o oVar) {
        g();
        C0977o c0977o = this.f9579z.f5157z;
        if (c0977o != null) {
            c0977o.o();
        }
    }

    @Override // k.AbstractC0880c
    public final void k(View view) {
        this.f9579z.setCustomView(view);
        this.f9575B = view != null ? new WeakReference(view) : null;
    }

    @Override // k.AbstractC0880c
    public final void l(int i6) {
        m(this.f9578y.getString(i6));
    }

    @Override // k.AbstractC0880c
    public final void m(CharSequence charSequence) {
        this.f9579z.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0880c
    public final void n(int i6) {
        o(this.f9578y.getString(i6));
    }

    @Override // k.AbstractC0880c
    public final void o(CharSequence charSequence) {
        this.f9579z.setTitle(charSequence);
    }

    @Override // k.AbstractC0880c
    public final void p(boolean z5) {
        this.f9567x = z5;
        this.f9579z.setTitleOptional(z5);
    }
}
