package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.AbstractC0880c;
import k.C0887j;
import k.InterfaceC0879b;
import m.C0977o;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0880c implements l.m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC0879b f9241A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public WeakReference f9242B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ U f9243C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f9244y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l.o f9245z;

    public T(U u5, Context context, x xVar) {
        this.f9243C = u5;
        this.f9244y = context;
        this.f9241A = xVar;
        l.o oVar = new l.o(context);
        oVar.f9765l = 1;
        this.f9245z = oVar;
        oVar.f9758e = this;
    }

    @Override // k.AbstractC0880c
    public final void a() {
        U u5 = this.f9243C;
        if (u5.f9267v != this) {
            return;
        }
        if (u5.f9250C) {
            u5.f9268w = this;
            u5.f9269x = this.f9241A;
        } else {
            this.f9241A.d(this);
        }
        this.f9241A = null;
        u5.A(false);
        ActionBarContextView actionBarContextView = u5.f9264s;
        if (actionBarContextView.f5144G == null) {
            actionBarContextView.e();
        }
        u5.f9261p.setHideOnContentScrollEnabled(u5.f9255H);
        u5.f9267v = null;
    }

    @Override // k.AbstractC0880c
    public final View b() {
        WeakReference weakReference = this.f9242B;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0880c
    public final l.o c() {
        return this.f9245z;
    }

    @Override // k.AbstractC0880c
    public final MenuInflater d() {
        return new C0887j(this.f9244y);
    }

    @Override // k.AbstractC0880c
    public final CharSequence e() {
        return this.f9243C.f9264s.getSubtitle();
    }

    @Override // k.AbstractC0880c
    public final CharSequence f() {
        return this.f9243C.f9264s.getTitle();
    }

    @Override // k.AbstractC0880c
    public final void g() {
        if (this.f9243C.f9267v != this) {
            return;
        }
        l.o oVar = this.f9245z;
        oVar.w();
        try {
            this.f9241A.c(this, oVar);
        } finally {
            oVar.v();
        }
    }

    @Override // k.AbstractC0880c
    public final boolean h() {
        return this.f9243C.f9264s.f5152O;
    }

    @Override // l.m
    public final boolean i(l.o oVar, MenuItem menuItem) {
        InterfaceC0879b interfaceC0879b = this.f9241A;
        if (interfaceC0879b != null) {
            return interfaceC0879b.b(this, menuItem);
        }
        return false;
    }

    @Override // l.m
    public final void j(l.o oVar) {
        if (this.f9241A == null) {
            return;
        }
        g();
        C0977o c0977o = this.f9243C.f9264s.f5157z;
        if (c0977o != null) {
            c0977o.o();
        }
    }

    @Override // k.AbstractC0880c
    public final void k(View view) {
        this.f9243C.f9264s.setCustomView(view);
        this.f9242B = new WeakReference(view);
    }

    @Override // k.AbstractC0880c
    public final void l(int i6) {
        m(this.f9243C.f9259n.getResources().getString(i6));
    }

    @Override // k.AbstractC0880c
    public final void m(CharSequence charSequence) {
        this.f9243C.f9264s.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0880c
    public final void n(int i6) {
        o(this.f9243C.f9259n.getResources().getString(i6));
    }

    @Override // k.AbstractC0880c
    public final void o(CharSequence charSequence) {
        this.f9243C.f9264s.setTitle(charSequence);
    }

    @Override // k.AbstractC0880c
    public final void p(boolean z5) {
        this.f9567x = z5;
        this.f9243C.f9264s.setTitleOptional(z5);
    }
}
