package w2;

import J2.c;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.d;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import u2.C1368a;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1476a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13589b;

    public /* synthetic */ ViewOnLayoutChangeListenerC1476a(int i6, Object obj) {
        this.f13588a = i6;
        this.f13589b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        C1368a c1368a;
        int i14 = this.f13588a;
        Object obj = this.f13589b;
        switch (i14) {
            case d.f6312l /* 0 */:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
            default:
                c cVar = (c) obj;
                if (cVar.f1261J.getVisibility() != 0 || (c1368a = cVar.f1279e0) == null) {
                    return;
                }
                Rect rect = new Rect();
                ImageView imageView = cVar.f1261J;
                imageView.getDrawingRect(rect);
                c1368a.setBounds(rect);
                c1368a.h(imageView, null);
                return;
        }
    }
}
