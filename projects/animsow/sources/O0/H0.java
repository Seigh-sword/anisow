package o0;

import android.content.Intent;
import c1.C0365f;
import c1.C0367h;
import c1.C0370k;
import c1.C0373n;
import com.android.app.activities.CategoryActivity;
import com.android.app.activities.PostActivity;
import com.android.app.models.Category;
import com.android.app.models.Post;
import com.android.app.models.Season;
import d.AbstractC0628i;
import s4.AbstractC1305a;
import s4.C1316l;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H0 extends D4.h implements C4.l {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f11771E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(int i6, Object obj) {
        super(1, obj, x1.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.f11771E = i6;
        switch (i6) {
            case 1:
                super(1, obj, CategoryActivity.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                super(1, obj, PostActivity.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Season;)V");
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                super(1, obj, PostActivity.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                super(1, obj, PostActivity.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                super(1, obj, X0.h.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                super(1, obj, C0365f.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Category;)V");
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                super(1, obj, C0367h.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                super(1, obj, C0370k.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case 9:
                super(1, obj, C0373n.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case 10:
                super(1, obj, c1.t.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case 11:
                super(1, obj, c1.t.class, "handleItemClick", "handleItemClick(Lcom/android/app/models/Post;)V");
                break;
            case 12:
                super(1, obj, M4.Y.class, "invoke", "invoke(Ljava/lang/Throwable;)V");
                break;
            default:
                break;
        }
    }

    @Override // C4.l
    public final Object j(Object obj) {
        C1316l c1316l = C1316l.f12640a;
        int i6 = this.f11771E;
        Object obj2 = this.f361x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0628i.p(obj2);
                throw null;
            case 1:
                k((Post) obj);
                return c1316l;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                Season season = (Season) obj;
                AbstractC1305a.o(season, "p0");
                PostActivity postActivity = (PostActivity) obj2;
                int i7 = PostActivity.f6281j0;
                postActivity.getClass();
                AbstractC1332d.a0(postActivity, season.getId());
                return c1316l;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                k((Post) obj);
                return c1316l;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                k((Post) obj);
                return c1316l;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                k((Post) obj);
                return c1316l;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Category category = (Category) obj;
                AbstractC1305a.o(category, "p0");
                C0365f c0365f = (C0365f) obj2;
                int i8 = C0365f.E0;
                c0365f.getClass();
                Intent intent = new Intent(c0365f.O(), (Class<?>) CategoryActivity.class);
                intent.putExtra("CATEGORY_ID", category.getId());
                intent.putExtra("CATEGORY_TITLE", category.getName());
                c0365f.T(intent);
                return c1316l;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                k((Post) obj);
                return c1316l;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                k((Post) obj);
                return c1316l;
            case 9:
                k((Post) obj);
                return c1316l;
            case 10:
                k((Post) obj);
                return c1316l;
            case 11:
                k((Post) obj);
                return c1316l;
            default:
                ((M4.Y) obj2).d((Throwable) obj);
                return c1316l;
        }
    }

    public final void k(Post post) {
        int i6 = this.f11771E;
        Object obj = this.f361x;
        switch (i6) {
            case 1:
                AbstractC1305a.o(post, "p0");
                CategoryActivity categoryActivity = (CategoryActivity) obj;
                int i7 = CategoryActivity.f6265g0;
                categoryActivity.getClass();
                AbstractC1332d.a0(categoryActivity, post.getId());
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                AbstractC1305a.o(post, "p0");
                c1.t tVar = (c1.t) obj;
                int i8 = c1.t.f6226I0;
                tVar.getClass();
                AbstractC1332d.b0(tVar, post.getId());
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC1305a.o(post, "p0");
                PostActivity postActivity = (PostActivity) obj;
                int i9 = PostActivity.f6281j0;
                postActivity.getClass();
                AbstractC1332d.a0(postActivity, post.getId());
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                AbstractC1305a.o(post, "p0");
                PostActivity postActivity2 = (PostActivity) obj;
                int i10 = PostActivity.f6281j0;
                postActivity2.getClass();
                AbstractC1332d.a0(postActivity2, post.getId());
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                AbstractC1305a.o(post, "p0");
                ((X0.h) obj).f4514v.j(post);
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1305a.o(post, "p0");
                C0367h c0367h = (C0367h) obj;
                int i11 = C0367h.f6192F0;
                c0367h.getClass();
                AbstractC1332d.b0(c0367h, post.getId());
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC1305a.o(post, "p0");
                C0370k c0370k = (C0370k) obj;
                int i12 = C0370k.E0;
                c0370k.getClass();
                AbstractC1332d.b0(c0370k, post.getId());
                break;
            case 9:
                AbstractC1305a.o(post, "p0");
                C0373n c0373n = (C0373n) obj;
                int i13 = C0373n.E0;
                c0373n.getClass();
                AbstractC1332d.b0(c0373n, post.getId());
                break;
            case 10:
                AbstractC1305a.o(post, "p0");
                c1.t tVar2 = (c1.t) obj;
                int i14 = c1.t.f6226I0;
                tVar2.getClass();
                AbstractC1332d.b0(tVar2, post.getId());
                break;
        }
    }
}
