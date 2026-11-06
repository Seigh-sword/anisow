package K2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c extends G0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1538c;

    public c(View view, int i6) {
        this.f1537b = i6;
        this.f1538c = view;
    }

    @Override // G0.c
    public final void a(Drawable drawable) {
        int i6 = this.f1537b;
        View view = this.f1538c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                d dVar = (d) view;
                dVar.setIndeterminate(false);
                dVar.a(dVar.f1548x, dVar.f1549y);
                break;
            case 1:
                d dVar2 = (d) view;
                if (!dVar2.f1541C) {
                    dVar2.setVisibility(dVar2.f1542D);
                }
                break;
            default:
                ColorStateList colorStateList = ((C2.b) view).f152K;
                if (colorStateList != null) {
                    H.a.h(drawable, colorStateList);
                }
                break;
        }
    }

    @Override // G0.c
    public final void b(Drawable drawable) {
        switch (this.f1537b) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                C2.b bVar = (C2.b) this.f1538c;
                ColorStateList colorStateList = bVar.f152K;
                if (colorStateList != null) {
                    H.a.g(drawable, colorStateList.getColorForState(bVar.f156O, colorStateList.getDefaultColor()));
                }
                break;
        }
    }
}
