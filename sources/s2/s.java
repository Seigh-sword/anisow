package S2;

import N.V;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f3208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f3209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f3210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i6, String[] strArr) {
        super(context, i6, strArr);
        this.f3210c = tVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        t tVar = this.f3210c;
        ColorStateList colorStateList2 = tVar.f3218H;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f3209b = colorStateList;
        if (tVar.f3217G != 0 && tVar.f3218H != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{G.a.b(tVar.f3218H.getColorForState(iArr3, 0), tVar.f3217G), G.a.b(tVar.f3218H.getColorForState(iArr2, 0), tVar.f3217G), tVar.f3217G});
        }
        this.f3208a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i6, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            t tVar = this.f3210c;
            Drawable rippleDrawable = null;
            if (tVar.getText().toString().contentEquals(textView.getText()) && tVar.f3217G != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(tVar.f3217G);
                if (this.f3209b != null) {
                    H.a.h(colorDrawable, this.f3208a);
                    rippleDrawable = new RippleDrawable(this.f3209b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = V.f1964a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
