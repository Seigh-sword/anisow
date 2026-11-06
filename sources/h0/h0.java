package h0;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8822c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8823d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f8826g;

    public h0(j0 j0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f8826g = j0Var;
        this.f8820a = obj;
        this.f8821b = arrayList;
        this.f8824e = obj2;
        this.f8825f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        j0 j0Var = this.f8826g;
        Object obj = this.f8820a;
        if (obj != null) {
            j0Var.A(obj, this.f8821b, null);
        }
        Object obj2 = this.f8822c;
        if (obj2 != null) {
            j0Var.A(obj2, this.f8823d, null);
        }
        Object obj3 = this.f8824e;
        if (obj3 != null) {
            j0Var.A(obj3, this.f8825f, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
