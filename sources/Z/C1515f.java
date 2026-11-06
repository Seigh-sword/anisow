package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: z.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1515f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13928e;

    public C1515f(Context context, XmlResourceParser xmlResourceParser) {
        this.f13924a = Float.NaN;
        this.f13925b = Float.NaN;
        this.f13926c = Float.NaN;
        this.f13927d = Float.NaN;
        this.f13928e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f14061j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f13928e);
                this.f13928e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f13927d = typedArrayObtainStyledAttributes.getDimension(index, this.f13927d);
            } else if (index == 2) {
                this.f13925b = typedArrayObtainStyledAttributes.getDimension(index, this.f13925b);
            } else if (index == 3) {
                this.f13926c = typedArrayObtainStyledAttributes.getDimension(index, this.f13926c);
            } else if (index == 4) {
                this.f13924a = typedArrayObtainStyledAttributes.getDimension(index, this.f13924a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
