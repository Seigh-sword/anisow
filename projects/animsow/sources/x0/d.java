package X0;

import C4.l;
import J3.w;
import Z.j;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.app.models.Category;
import com.android.app.models.Post;
import com.android.app.models.Season;
import com.android.app.models.Section;
import com.google.android.gms.internal.measurement.C0396c2;
import com.google.android.material.card.MaterialCardView;
import d1.AbstractC0649a;
import i.C0803c;
import o0.H0;
import s1.C1299h;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import v0.AbstractC1385N;
import v0.C1399h;
import v0.u0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1385N {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f4503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i6, H0 h02) {
        super(new a(0));
        this.f4502e = i6;
        if (i6 == 1) {
            super(new a(2));
            this.f4503f = h02;
        } else if (i6 == 2) {
            super(new a(3));
            this.f4503f = h02;
        } else if (i6 != 3) {
            this.f4503f = h02;
        } else {
            super(new a(1));
            this.f4503f = h02;
        }
    }

    @Override // v0.W
    public final void c(u0 u0Var, int i6) {
        C1399h c1399h = this.f13057d;
        switch (this.f4502e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c cVar = (c) u0Var;
                Category category = (Category) c1399h.f13135f.get(i6);
                if (category != null) {
                    C0396c2 c0396c2 = cVar.f4500u;
                    ((TextView) c0396c2.f6776y).setText(category.getName());
                    ((MaterialCardView) c0396c2.f6775x).setOnClickListener(new b(cVar, category, 0));
                    break;
                }
                break;
            case 1:
                g gVar = (g) u0Var;
                Season season = (Season) c1399h.f13135f.get(i6);
                if (season != null) {
                    C0803c c0803c = gVar.f4511u;
                    AbstractC1332d.x0((ImageView) c0803c.f9278y).s(season.getPoster()).J((y1.f) new y1.f().x(AbstractC0649a.f8164b, true)).E((ImageView) c0803c.f9278y);
                    ((ImageView) c0803c.f9278y).setClipToOutline(true);
                    ((TextView) c0803c.f9279z).setText(season.getTitle());
                    ((MaterialCardView) c0803c.f9277x).setOnClickListener(new b(gVar, season, 2));
                    break;
                }
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                h hVar = (h) u0Var;
                Section section = (Section) c1399h.f13135f.get(i6);
                if (section != null) {
                    C0803c c0803c2 = hVar.f4513u;
                    ((TextView) c0803c2.f9279z).setText(section.getName());
                    d dVar = new d(3, new H0(5, hVar));
                    ((RecyclerView) c0803c2.f9278y).setAdapter(dVar);
                    dVar.e(section.getPosts());
                    break;
                }
                break;
            default:
                i iVar = (i) u0Var;
                Post post = (Post) c1399h.f13135f.get(i6);
                if (post != null) {
                    w wVar = iVar.f4516u;
                    ((V0.j) AbstractC1332d.x0((ImageView) wVar.f1444d).s(post.getPoster()).x(new C1299h(0), true)).E((ImageView) wVar.f1444d);
                    ((ImageView) wVar.f1444d).setClipToOutline(true);
                    ((TextView) wVar.f1442b).setText(post.getAge());
                    LinearLayout linearLayout = (LinearLayout) wVar.f1443c;
                    AbstractC1305a.n(linearLayout, "ageBlock");
                    String age = post.getAge();
                    AbstractC1332d.v0(linearLayout, true ^ (age == null || K4.h.d0(age)));
                    ((MaterialCardView) wVar.f1441a).setOnClickListener(new b(iVar, post, 3));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[PHI: r0
      0x004f: PHI (r0v20 int) = (r0v19 int), (r0v22 int) binds: [B:5:0x002d, B:7:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v0.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v0.u0 d(androidx.recyclerview.widget.RecyclerView r8) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.d.d(androidx.recyclerview.widget.RecyclerView):v0.u0");
    }
}
