package android.support.v4.media;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.k;
import com.xo.anilab.R;
import f2.h;
import m.C0986t;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f5072h;

    public b(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0.q(R.attr.materialCalendarStyle, context, k.class.getCanonicalName()).data, AbstractC1274a.f12463q);
        this.f5065a = C0986t.b(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f5071g = C0986t.b(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f5066b = C0986t.b(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f5067c = C0986t.b(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListO = h.o(context, typedArrayObtainStyledAttributes, 7);
        this.f5068d = C0986t.b(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f5069e = C0986t.b(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f5070f = C0986t.b(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f5072h = paint;
        paint.setColor(colorStateListO.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f5065a = obj;
        this.f5066b = obj2;
        this.f5067c = obj3;
        this.f5068d = obj4;
        this.f5069e = obj5;
        this.f5070f = obj6;
        this.f5071g = obj7;
        this.f5072h = obj8;
    }
}
