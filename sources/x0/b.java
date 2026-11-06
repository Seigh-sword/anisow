package X0;

import Z.j;
import android.view.View;
import com.android.app.models.Category;
import com.android.app.models.Post;
import com.android.app.models.Season;
import s4.AbstractC1305a;
import v0.u0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u0 f4498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f4499y;

    public /* synthetic */ b(u0 u0Var, Object obj, int i6) {
        this.f4497w = i6;
        this.f4498x = u0Var;
        this.f4499y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f4497w;
        Object obj = this.f4499y;
        u0 u0Var = this.f4498x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c cVar = (c) u0Var;
                AbstractC1305a.o(cVar, "this$0");
                cVar.f4501v.j((Category) obj);
                break;
            case 1:
                f fVar = (f) u0Var;
                int i7 = f.f4507w;
                AbstractC1305a.o(fVar, "this$0");
                fVar.f4509v.j((Post) obj);
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                g gVar = (g) u0Var;
                int i8 = g.f4510w;
                AbstractC1305a.o(gVar, "this$0");
                gVar.f4512v.j((Season) obj);
                break;
            default:
                i iVar = (i) u0Var;
                int i9 = i.f4515w;
                AbstractC1305a.o(iVar, "this$0");
                iVar.f4517v.j((Post) obj);
                break;
        }
    }
}
