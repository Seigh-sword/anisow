package v0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0 f13125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f13126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13128d;

    public g0(int i6, int i7) {
        super(i6, i7);
        this.f13126b = new Rect();
        this.f13127c = true;
        this.f13128d = false;
    }

    public g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13126b = new Rect();
        this.f13127c = true;
        this.f13128d = false;
    }

    public g0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f13126b = new Rect();
        this.f13127c = true;
        this.f13128d = false;
    }

    public g0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f13126b = new Rect();
        this.f13127c = true;
        this.f13128d = false;
    }

    public g0(g0 g0Var) {
        super((ViewGroup.LayoutParams) g0Var);
        this.f13126b = new Rect();
        this.f13127c = true;
        this.f13128d = false;
    }
}
