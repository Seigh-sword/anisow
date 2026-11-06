package K2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1565b;

    public /* synthetic */ h(i iVar, int i6) {
        this.f1564a = i6;
        this.f1565b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1564a) {
            case 1:
                super.onAnimationEnd(animator);
                i iVar = this.f1565b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = iVar.f1568B;
                if (arrayList != null && !iVar.f1569C) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((G0.c) it.next()).a(iVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1564a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                super.onAnimationStart(animator);
                i iVar = this.f1565b;
                ArrayList arrayList = iVar.f1568B;
                if (arrayList != null && !iVar.f1569C) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((G0.c) it.next()).b(iVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
