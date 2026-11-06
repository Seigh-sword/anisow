package F0;

import android.view.ViewGroup;
import com.xo.anilab.R;
import d.AbstractC0628i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0014a f472a = new C0014a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f473b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f474c = new ArrayList();

    public static void a(ViewGroup viewGroup, w wVar) {
        ArrayList arrayList = f474c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (wVar == null) {
            wVar = f472a;
        }
        w wVarClone = wVar.clone();
        c(viewGroup, wVarClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        z zVar = new z();
        zVar.f598w = wVarClone;
        zVar.f599x = viewGroup;
        viewGroup.addOnAttachStateChangeListener(zVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(zVar);
    }

    public static C1280b b() {
        C1280b c1280b;
        ThreadLocal threadLocal = f473b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1280b = (C1280b) weakReference.get()) != null) {
            return c1280b;
        }
        C1280b c1280b2 = new C1280b();
        threadLocal.set(new WeakReference(c1280b2));
        return c1280b2;
    }

    public static void c(ViewGroup viewGroup, w wVar) {
        ArrayList arrayList = (ArrayList) b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((w) it.next()).D(viewGroup);
            }
        }
        if (wVar != null) {
            wVar.l(viewGroup, true);
        }
        AbstractC0628i.p(viewGroup.getTag(R.id.transition_current_scene));
    }
}
