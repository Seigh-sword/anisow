package h0;

import android.util.Log;
import android.view.ViewGroup;
import s4.C1316l;

/* JADX INFO: renamed from: h0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0749n extends D4.i implements C4.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ D4.r f8852A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0750o f8853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8854y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8855z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749n(C0750o c0750o, ViewGroup viewGroup, Object obj, D4.r rVar) {
        super(0);
        this.f8853x = c0750o;
        this.f8854y = viewGroup;
        this.f8855z = obj;
        this.f8852A = rVar;
    }

    @Override // C4.a
    public final Object b() {
        C0750o c0750o = this.f8853x;
        l0 l0Var = c0750o.f8861f;
        ViewGroup viewGroup = this.f8854y;
        Object obj = this.f8855z;
        Object objI = l0Var.i(viewGroup, obj);
        c0750o.f8871p = objI;
        if (objI == null) {
            throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
        }
        this.f8852A.f377w = new C0748m(c0750o, obj, viewGroup);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Started executing operations from " + c0750o.f8859d + " to " + c0750o.f8860e);
        }
        return C1316l.f12640a;
    }
}
