package P2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.bumptech.glide.d f2462a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.d f2463b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.d f2464c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.d f2465d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f2466e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f2467f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f2468g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f2469h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f2470i = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f2471j = new e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f2472k = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f2473l = new e();

    public static G1.m a(Context context, int i6, int i7, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i6);
        if (i7 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i7);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC1274a.f12440D);
        try {
            int i8 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i9 = typedArrayObtainStyledAttributes.getInt(3, i8);
            int i10 = typedArrayObtainStyledAttributes.getInt(4, i8);
            int i11 = typedArrayObtainStyledAttributes.getInt(2, i8);
            int i12 = typedArrayObtainStyledAttributes.getInt(1, i8);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            G1.m mVar = new G1.m(1);
            com.bumptech.glide.d dVarJ = Y2.b.j(i9);
            mVar.f808a = dVarJ;
            G1.m.b(dVarJ);
            mVar.f812e = cVarC2;
            com.bumptech.glide.d dVarJ2 = Y2.b.j(i10);
            mVar.f809b = dVarJ2;
            G1.m.b(dVarJ2);
            mVar.f813f = cVarC3;
            com.bumptech.glide.d dVarJ3 = Y2.b.j(i11);
            mVar.f810c = dVarJ3;
            G1.m.b(dVarJ3);
            mVar.f814g = cVarC4;
            com.bumptech.glide.d dVarJ4 = Y2.b.j(i12);
            mVar.f811d = dVarJ4;
            G1.m.b(dVarJ4);
            mVar.f815h = cVarC5;
            return mVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static G1.m b(Context context, AttributeSet attributeSet, int i6, int i7) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12468v, i6, i7);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i6, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i6);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i7 = typedValuePeekValue.type;
        return i7 == 5 ? new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i7 == 6 ? new h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z5 = this.f2473l.getClass().equals(e.class) && this.f2471j.getClass().equals(e.class) && this.f2470i.getClass().equals(e.class) && this.f2472k.getClass().equals(e.class);
        float fA = this.f2466e.a(rectF);
        return z5 && ((this.f2467f.a(rectF) > fA ? 1 : (this.f2467f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2469h.a(rectF) > fA ? 1 : (this.f2469h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2468g.a(rectF) > fA ? 1 : (this.f2468g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f2463b instanceof i) && (this.f2462a instanceof i) && (this.f2464c instanceof i) && (this.f2465d instanceof i));
    }

    public final G1.m e() {
        G1.m mVar = new G1.m();
        mVar.f808a = this.f2462a;
        mVar.f809b = this.f2463b;
        mVar.f810c = this.f2464c;
        mVar.f811d = this.f2465d;
        mVar.f812e = this.f2466e;
        mVar.f813f = this.f2467f;
        mVar.f814g = this.f2468g;
        mVar.f815h = this.f2469h;
        mVar.f816i = this.f2470i;
        mVar.f817j = this.f2471j;
        mVar.f818k = this.f2472k;
        mVar.f819l = this.f2473l;
        return mVar;
    }
}
