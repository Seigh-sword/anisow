package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.AbstractC0732a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5098x;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8582t);
        this.f5098x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f5097w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
