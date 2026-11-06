package T2;

import android.content.Context;
import android.content.res.TypedArray;
import com.xo.anilab.R;
import f2.h;
import m.C0964h0;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C0964h0 {
    @Override // m.C0964h0, android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        if (C0.p(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i6, AbstractC1274a.f12469w);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iR = -1;
            for (int i7 = 0; i7 < 2 && iR < 0; i7++) {
                iR = h.r(context2, typedArrayObtainStyledAttributes, iArr[i7], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iR >= 0) {
                setLineHeight(iR);
            }
        }
    }
}
