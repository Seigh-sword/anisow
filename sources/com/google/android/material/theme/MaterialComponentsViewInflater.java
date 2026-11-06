package com.google.android.material.theme;

import C2.b;
import H2.m;
import L2.a;
import S2.t;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.xo.anilab.R;
import f2.h;
import i.M;
import m.C0964h0;
import m.C0984s;
import m.C0988u;
import m.C0990v;
import m.J;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends M {
    @Override // i.M
    public final C0984s a(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    @Override // i.M
    public final C0988u b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // i.M
    public final C0990v c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // i.M
    public final J d(Context context, AttributeSet attributeSet) {
        a aVar = new a(U2.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray typedArrayE = m.e(context2, attributeSet, AbstractC1274a.f12467u, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayE.hasValue(0)) {
            T.b.c(aVar, h.o(context2, typedArrayE, 0));
        }
        aVar.f1727B = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        return aVar;
    }

    @Override // i.M
    public final C0964h0 e(Context context, AttributeSet attributeSet) {
        T2.a aVar = new T2.a(U2.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (C0.p(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1274a.f12470x;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iR = -1;
            for (int i6 = 0; i6 < 2 && iR < 0; i6++) {
                iR = h.r(context2, typedArrayObtainStyledAttributes, iArr2[i6], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iR == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1274a.f12469w);
                    Context context3 = aVar.getContext();
                    int[] iArr3 = {1, 2};
                    int iR2 = -1;
                    for (int i7 = 0; i7 < 2 && iR2 < 0; i7++) {
                        iR2 = h.r(context3, typedArrayObtainStyledAttributes3, iArr3[i7], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iR2 >= 0) {
                        aVar.setLineHeight(iR2);
                    }
                }
            }
        }
        return aVar;
    }
}
