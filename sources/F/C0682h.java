package f;

import N.C0;
import N.InterfaceC0107s;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import z.n;
import z.r;

/* JADX INFO: renamed from: f.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0682h implements InterfaceC0107s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f8317y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f8318z;

    public C0682h(Context context, XmlResourceParser xmlResourceParser) {
        this.f8316x = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f14059h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                this.f8315w = typedArrayObtainStyledAttributes.getResourceId(index, this.f8315w);
            } else if (index == 1) {
                this.f8316x = typedArrayObtainStyledAttributes.getResourceId(index, this.f8316x);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f8316x);
                context.getResources().getResourceName(this.f8316x);
                if ("layout".equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f8318z = nVar;
                    nVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f8316x, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // N.InterfaceC0107s
    public final C0 p(View view, C0 c02) {
        int i6 = c02.f1943a.f(7).f642b;
        int i7 = this.f8315w;
        Object obj = this.f8317y;
        if (i7 >= 0) {
            View view2 = (View) obj;
            view2.getLayoutParams().height = this.f8315w + i6;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) obj;
        view3.setPadding(view3.getPaddingLeft(), this.f8316x + i6, view3.getPaddingRight(), view3.getPaddingBottom());
        return c02;
    }
}
