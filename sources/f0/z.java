package F0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w f598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewGroup f599x;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ec A[EDGE_INSN: B:154:0x01ec->B:92:0x01ec BREAK  A[LOOP:1: B:19:0x0088->B:91:0x01e2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f2  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.z.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f599x;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = A.f474c;
        ViewGroup viewGroup2 = this.f599x;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) A.b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((w) it.next()).H(viewGroup2);
            }
        }
        this.f598w.m(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
