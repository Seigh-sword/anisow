package c1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import h0.E;
import s4.AbstractC1305a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnTouchListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6216x;

    public /* synthetic */ o(int i6, Object obj) {
        this.f6215w = i6;
        this.f6216x = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        E eD;
        int i6 = this.f6215w;
        Object obj = this.f6216x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                t tVar = (t) obj;
                int i7 = t.f6226I0;
                AbstractC1305a.o(tVar, "this$0");
                View view2 = tVar.f8618c0;
                if (view2 != null && (eD = tVar.d()) != null) {
                    AbstractC1332d.N(eD, view2);
                }
                EditText editText = tVar.f6229C0;
                if (editText != null) {
                    editText.clearFocus();
                    return false;
                }
                AbstractC1305a.W("searchInput");
                throw null;
            default:
                S2.j jVar = (S2.j) obj;
                jVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - jVar.f3140o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        jVar.f3138m = false;
                    }
                    jVar.u();
                    jVar.f3138m = true;
                    jVar.f3140o = System.currentTimeMillis();
                }
                return false;
        }
    }
}
