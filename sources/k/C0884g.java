package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.MenuC0904D;

/* JADX INFO: renamed from: k.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0884g extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0880c f9581b;

    public C0884g(Context context, AbstractC0880c abstractC0880c) {
        this.f9580a = context;
        this.f9581b = abstractC0880c;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f9581b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f9581b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0904D(this.f9580a, this.f9581b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f9581b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f9581b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f9581b.f9566w;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f9581b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f9581b.f9567x;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f9581b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f9581b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f9581b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i6) {
        this.f9581b.l(i6);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f9581b.f9566w = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i6) {
        this.f9581b.n(i6);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z5) {
        this.f9581b.p(z5);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f9581b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f9581b.o(charSequence);
    }
}
