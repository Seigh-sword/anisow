package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import h.AbstractC0732a;

/* JADX INFO: renamed from: m.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0948C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L3.c f10089b;

    public C0948C(TextView textView) {
        this.f10088a = textView;
        this.f10089b = new L3.c(textView);
    }

    public final void a(AttributeSet attributeSet, int i6) {
        TypedArray typedArrayObtainStyledAttributes = this.f10088a.getContext().obtainStyledAttributes(attributeSet, AbstractC0732a.f8571i, i6, 0);
        try {
            boolean z5 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z5);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z5) {
        ((B3.e) this.f10089b.f1734x).y(z5);
    }

    public final void c(boolean z5) {
        ((B3.e) this.f10089b.f1734x).B(z5);
    }
}
