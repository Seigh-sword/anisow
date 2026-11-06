package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14030d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f14058g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            if (index == 1) {
                this.f14029c = typedArrayObtainStyledAttributes.getFloat(index, this.f14029c);
            } else if (index == 0) {
                int i7 = typedArrayObtainStyledAttributes.getInt(index, this.f14027a);
                this.f14027a = i7;
                this.f14027a = n.f14045d[i7];
            } else if (index == 4) {
                this.f14028b = typedArrayObtainStyledAttributes.getInt(index, this.f14028b);
            } else if (index == 3) {
                this.f14030d = typedArrayObtainStyledAttributes.getFloat(index, this.f14030d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
