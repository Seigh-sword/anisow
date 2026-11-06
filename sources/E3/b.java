package E3;

import N.I0;
import N.P;
import N.V;
import a3.C0261b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import d.AbstractC0628i;
import java.io.IOException;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f398y;

    public /* synthetic */ b(int i6, Object obj, boolean z5) {
        this.f396w = i6;
        this.f397x = obj;
        this.f398y = z5;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        F3.a aVarP;
        F3.a aVarB;
        I0 i02 = null;
        switch (this.f396w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((c) this.f397x).a(this.f398y);
                return;
            case 1:
                c cVar = (c) this.f397x;
                boolean z5 = this.f398y;
                cVar.getClass();
                Object obj = c.f399m;
                synchronized (obj) {
                    try {
                        Y2.g gVar = cVar.f400a;
                        gVar.a();
                        C0261b c0261bA = C0261b.a(gVar.f4816a);
                        try {
                            aVarP = cVar.f402c.p();
                            if (c0261bA != null) {
                                c0261bA.q();
                            }
                        } catch (Throwable th) {
                            if (c0261bA != null) {
                                c0261bA.q();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    F3.c cVar2 = F3.c.f630A;
                    F3.c cVar3 = aVarP.f621b;
                    if (cVar3 == cVar2 || cVar3 == F3.c.f634y) {
                        aVarB = cVar.g(aVarP);
                    } else if (!z5 && !cVar.f403d.b(aVarP)) {
                        return;
                    } else {
                        aVarB = cVar.b(aVarP);
                    }
                    synchronized (obj) {
                        try {
                            Y2.g gVar2 = cVar.f400a;
                            gVar2.a();
                            C0261b c0261bA2 = C0261b.a(gVar2.f4816a);
                            try {
                                cVar.f402c.m(aVarB);
                                if (c0261bA2 != null) {
                                    c0261bA2.q();
                                }
                            } catch (Throwable th2) {
                                if (c0261bA2 != null) {
                                    c0261bA2.q();
                                }
                                throw th2;
                            }
                        } finally {
                        }
                    }
                    synchronized (cVar) {
                        if (cVar.f410k.size() != 0 && !TextUtils.equals(aVarP.f620a, aVarB.f620a)) {
                            Iterator it = cVar.f410k.iterator();
                            if (it.hasNext()) {
                                AbstractC0628i.p(it.next());
                                throw null;
                            }
                        }
                    }
                    if (aVarB.f621b == F3.c.f635z) {
                        String str = aVarB.f620a;
                        synchronized (cVar) {
                            cVar.f409j = str;
                        }
                    }
                    F3.c cVar4 = aVarB.f621b;
                    if (cVar4 == cVar2) {
                        e = new e();
                    } else {
                        if (cVar4 != F3.c.f633x && cVar4 != F3.c.f632w) {
                            cVar.i(aVarB);
                            return;
                        }
                        e = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
                    }
                } catch (e e6) {
                    e = e6;
                }
                cVar.h(e);
                return;
            default:
                View view = (View) this.f397x;
                if (this.f398y) {
                    WeakHashMap weakHashMap = V.f1964a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        i02 = P.c(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        i02 = new I0(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                        }
                    }
                    if (i02 != null) {
                        i02.f1958a.D();
                        return;
                    }
                }
                Context context2 = view.getContext();
                Object obj2 = E.f.f379a;
                ((InputMethodManager) E.b.b(context2, InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
