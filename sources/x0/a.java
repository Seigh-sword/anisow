package X0;

import Z.j;
import com.android.app.models.Category;
import com.android.app.models.Post;
import com.android.app.models.Season;
import com.android.app.models.Section;
import s4.AbstractC1305a;
import v0.AbstractC1414x;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1414x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4496b;

    public a(int i6) {
        this.f4496b = i6;
    }

    @Override // v0.AbstractC1414x
    public final boolean b(Object obj, Object obj2) {
        switch (this.f4496b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Category category = (Category) obj;
                Category category2 = (Category) obj2;
                AbstractC1305a.o(category, "oldItem");
                AbstractC1305a.o(category2, "newItem");
                return AbstractC1305a.c(category, category2);
            case 1:
                Post post = (Post) obj;
                Post post2 = (Post) obj2;
                AbstractC1305a.o(post, "oldItem");
                AbstractC1305a.o(post2, "newItem");
                return AbstractC1305a.c(post, post2);
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                Season season = (Season) obj;
                Season season2 = (Season) obj2;
                AbstractC1305a.o(season, "oldItem");
                AbstractC1305a.o(season2, "newItem");
                return AbstractC1305a.c(season, season2);
            default:
                Section section = (Section) obj;
                Section section2 = (Section) obj2;
                AbstractC1305a.o(section, "oldItem");
                AbstractC1305a.o(section2, "newItem");
                return AbstractC1305a.c(section, section2);
        }
    }

    @Override // v0.AbstractC1414x
    public final boolean d(Object obj, Object obj2) {
        switch (this.f4496b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Category category = (Category) obj;
                Category category2 = (Category) obj2;
                AbstractC1305a.o(category, "oldItem");
                AbstractC1305a.o(category2, "newItem");
                return category.getId() == category2.getId();
            case 1:
                Post post = (Post) obj;
                Post post2 = (Post) obj2;
                AbstractC1305a.o(post, "oldItem");
                AbstractC1305a.o(post2, "newItem");
                return post.getId() == post2.getId();
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                Season season = (Season) obj;
                Season season2 = (Season) obj2;
                AbstractC1305a.o(season, "oldItem");
                AbstractC1305a.o(season2, "newItem");
                return season.getId() == season2.getId();
            default:
                Section section = (Section) obj;
                Section section2 = (Section) obj2;
                AbstractC1305a.o(section, "oldItem");
                AbstractC1305a.o(section2, "newItem");
                return AbstractC1305a.c(section.getName(), section2.getName());
        }
    }
}
