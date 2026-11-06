package N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.internal.measurement.C0396c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2.j f2017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f2019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2020d;

    public l0(y2.j jVar) {
        super(0);
        this.f2020d = new HashMap();
        this.f2017a = jVar;
    }

    public final o0 a(WindowInsetsAnimation windowInsetsAnimation) {
        o0 o0Var = (o0) this.f2020d.get(windowInsetsAnimation);
        if (o0Var == null) {
            o0Var = new o0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                o0Var.f2031a = new m0(windowInsetsAnimation);
            }
            this.f2020d.put(windowInsetsAnimation, o0Var);
        }
        return o0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        y2.j jVar = this.f2017a;
        a(windowInsetsAnimation);
        jVar.f13816b.setTranslationY(0.0f);
        this.f2020d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        y2.j jVar = this.f2017a;
        a(windowInsetsAnimation);
        View view = jVar.f13816b;
        int[] iArr = jVar.f13819e;
        view.getLocationOnScreen(iArr);
        jVar.f13817c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2019c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2019c = arrayList2;
            this.f2018b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationK = F2.b.k(list.get(size));
            o0 o0VarA = a(windowInsetsAnimationK);
            o0VarA.f2031a.d(windowInsetsAnimationK.getFraction());
            this.f2019c.add(o0VarA);
        }
        y2.j jVar = this.f2017a;
        C0 c0G = C0.g(null, windowInsets);
        jVar.a(c0G, this.f2018b);
        return c0G.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        y2.j jVar = this.f2017a;
        a(windowInsetsAnimation);
        C0396c2 c0396c2 = new C0396c2(bounds);
        View view = jVar.f13816b;
        int[] iArr = jVar.f13819e;
        view.getLocationOnScreen(iArr);
        int i6 = jVar.f13817c - iArr[1];
        jVar.f13818d = i6;
        view.setTranslationY(i6);
        return m0.e(c0396c2);
    }
}
