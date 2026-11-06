package m4;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import d.C0629j;
import h0.AbstractComponentCallbacksC0734B;

/* JADX INFO: renamed from: m4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1137j extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater f11671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f11672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1137j(Context context, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        super(context);
        context.getClass();
        C0629j c0629j = new C0629j(5, this);
        this.f11671a = null;
        abstractComponentCallbacksC0734B.getClass();
        abstractComponentCallbacksC0734B.f8627l0.a(c0629j);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f11672b == null) {
            if (this.f11671a == null) {
                this.f11671a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f11672b = this.f11671a.cloneInContext(this);
        }
        return this.f11672b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1137j(LayoutInflater layoutInflater, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        Context context = layoutInflater.getContext();
        context.getClass();
        super(context);
        C0629j c0629j = new C0629j(5, this);
        this.f11671a = layoutInflater;
        abstractComponentCallbacksC0734B.getClass();
        abstractComponentCallbacksC0734B.f8627l0.a(c0629j);
    }
}
