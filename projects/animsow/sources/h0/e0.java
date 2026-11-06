package h0;

import F0.C0027n;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f8805a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f8806b;

    static {
        l0 l0Var;
        try {
            l0Var = (l0) C0027n.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            l0Var = null;
        }
        f8806b = l0Var;
    }

    public static final void a(int i6, List list) {
        AbstractC1305a.o(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i6);
        }
    }
}
