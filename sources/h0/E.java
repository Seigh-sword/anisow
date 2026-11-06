package h0;

import D.InterfaceC0003d;
import D.InterfaceC0004e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.EnumC0314n;
import d.AbstractActivityC0638s;
import d.C0625f;
import d.C0626g;
import i.AbstractActivityC0812l;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends AbstractActivityC0638s implements InterfaceC0003d, InterfaceC0004e {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ int f8645U = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final S0.f f8646P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f8648R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f8649S;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C0323x f8647Q = new C0323x(this);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f8650T = true;

    public E() {
        final AbstractActivityC0812l abstractActivityC0812l = (AbstractActivityC0812l) this;
        this.f8646P = new S0.f(16, new D(abstractActivityC0812l));
        final int i6 = 1;
        this.f8142z.f14072b.c("android:support:lifecycle", new C0625f(i6, this));
        final int i7 = 0;
        this.f8130E.add(new M.a() { // from class: h0.C
            @Override // M.a
            public final void a(Object obj) {
                int i8 = i7;
                E e6 = abstractActivityC0812l;
                switch (i8) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        e6.f8646P.F();
                        break;
                    default:
                        e6.f8646P.F();
                        break;
                }
            }
        });
        this.f8132G.add(new M.a() { // from class: h0.C
            @Override // M.a
            public final void a(Object obj) {
                int i8 = i6;
                E e6 = abstractActivityC0812l;
                switch (i8) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        e6.f8646P.F();
                        break;
                    default:
                        e6.f8646P.F();
                        break;
                }
            }
        });
        i(new C0626g(this, i6));
    }

    public static boolean j(W w5) {
        boolean zJ = false;
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : w5.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null) {
                D d6 = abstractComponentCallbacksC0734B.f8606Q;
                if ((d6 == null ? null : d6.f8641B) != null) {
                    zJ |= j(abstractComponentCallbacksC0734B.l());
                }
                m0 m0Var = abstractComponentCallbacksC0734B.f8628m0;
                EnumC0314n enumC0314n = EnumC0314n.f5634z;
                if (m0Var != null) {
                    m0Var.d();
                    if (m0Var.f8846A.f5645d.compareTo(enumC0314n) >= 0) {
                        abstractComponentCallbacksC0734B.f8628m0.f8846A.g();
                        zJ = true;
                    }
                }
                if (abstractComponentCallbacksC0734B.f8627l0.f5645d.compareTo(enumC0314n) >= 0) {
                    abstractComponentCallbacksC0734B.f8627l0.g();
                    zJ = true;
                }
            }
        }
        return zJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.E.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // d.AbstractActivityC0638s, android.app.Activity
    public final void onActivityResult(int i6, int i7, Intent intent) {
        this.f8646P.F();
        super.onActivityResult(i6, i7, intent);
    }

    @Override // d.AbstractActivityC0638s, D.AbstractActivityC0011l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8647Q.e(EnumC0313m.ON_CREATE);
        W w5 = ((D) this.f8646P.f3073x).f8640A;
        w5.f8686H = false;
        w5.f8687I = false;
        w5.f8693O.f8735g = false;
        w5.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((D) this.f8646P.f3073x).f8640A.f8700f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((D) this.f8646P.f3073x).f8640A.l();
        this.f8647Q.e(EnumC0313m.ON_DESTROY);
    }

    @Override // d.AbstractActivityC0638s, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 6) {
            return ((D) this.f8646P.f3073x).f8640A.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f8649S = false;
        ((D) this.f8646P.f3073x).f8640A.u(5);
        this.f8647Q.e(EnumC0313m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f8647Q.e(EnumC0313m.ON_RESUME);
        W w5 = ((D) this.f8646P.f3073x).f8640A;
        w5.f8686H = false;
        w5.f8687I = false;
        w5.f8693O.f8735g = false;
        w5.u(7);
    }

    @Override // d.AbstractActivityC0638s, android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        this.f8646P.F();
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        S0.f fVar = this.f8646P;
        fVar.F();
        super.onResume();
        this.f8649S = true;
        ((D) fVar.f3073x).f8640A.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        S0.f fVar = this.f8646P;
        fVar.F();
        super.onStart();
        this.f8650T = false;
        if (!this.f8648R) {
            this.f8648R = true;
            W w5 = ((D) fVar.f3073x).f8640A;
            w5.f8686H = false;
            w5.f8687I = false;
            w5.f8693O.f8735g = false;
            w5.u(4);
        }
        ((D) fVar.f3073x).f8640A.z(true);
        this.f8647Q.e(EnumC0313m.ON_START);
        W w6 = ((D) fVar.f3073x).f8640A;
        w6.f8686H = false;
        w6.f8687I = false;
        w6.f8693O.f8735g = false;
        w6.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f8646P.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        S0.f fVar;
        super.onStop();
        this.f8650T = true;
        do {
            fVar = this.f8646P;
        } while (j(fVar.C()));
        W w5 = ((D) fVar.f3073x).f8640A;
        w5.f8687I = true;
        w5.f8693O.f8735g = true;
        w5.u(4);
        this.f8647Q.e(EnumC0313m.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((D) this.f8646P.f3073x).f8640A.f8700f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
