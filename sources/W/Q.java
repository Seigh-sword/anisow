package W;

import M4.InterfaceC0062g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c1.C0365f;
import c1.C0367h;
import c1.C0370k;
import c1.C0373n;
import com.android.app.activities.CategoryActivity;
import com.android.app.activities.HomeActivity;
import com.android.app.activities.PostActivity;
import com.android.app.models.Featured;
import com.android.app.models.Message;
import com.android.app.models.Resource;
import com.android.app.network.responses.ConfigResponse;
import com.android.app.network.responses.HomeResponse;
import com.android.app.network.responses.PostResponse;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.xo.anilab.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import m.RunnableC0969k;
import o0.C1168D;
import o0.C1169E;
import o0.C1170a;
import o0.C1193k;
import o0.C1197m;
import o0.H0;
import o0.p1;
import p3.C1251c;
import s1.C1299h;
import s4.AbstractC1305a;
import s4.C1316l;
import t0.AbstractC1332d;
import t4.AbstractC1344a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends D4.i implements C4.l {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4054x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f4055y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(int i6, Object obj) {
        super(1);
        this.f4054x = i6;
        this.f4055y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Resource resource) {
        ConstraintLayout constraintLayout;
        int i6 = this.f4054x;
        final int i7 = 2;
        Object obj = this.f4055y;
        final int i8 = 1;
        switch (i6) {
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                if (resource.getError() != null) {
                    HomeActivity homeActivity = (HomeActivity) obj;
                    int i9 = HomeActivity.f6270m0;
                    String string = homeActivity.getString(R.string.error_msg);
                    AbstractC1305a.n(string, "getString(...)");
                    C1251c c1251c = homeActivity.f6271c0;
                    if (c1251c == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    switch (c1251c.f12317a) {
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            constraintLayout = (ConstraintLayout) c1251c.f12318b;
                            break;
                        default:
                            constraintLayout = (ConstraintLayout) c1251c.f12318b;
                            break;
                    }
                    R2.l.f(constraintLayout, string).g();
                    return;
                }
                if (resource.getData() != null) {
                    List<Message> messages = ((ConfigResponse) resource.getData()).getMessages();
                    if (!messages.isEmpty()) {
                        for (Message message : messages) {
                            HomeActivity homeActivity2 = (HomeActivity) obj;
                            Z0.p pVarO = homeActivity2.o();
                            String id = message.getId();
                            pVarO.getClass();
                            AbstractC1305a.o(id, "messageID");
                            if (!((Boolean) S3.a.J(new Z0.h(pVarO, id, null))).booleanValue()) {
                                a1.b bVar = new a1.b();
                                Bundle bundle = new Bundle();
                                String strE = new Q3.n().e(message);
                                AbstractC1305a.n(strE, "toJson(...)");
                                bundle.putString("MESSAGE_DATA", strE);
                                bVar.S(bundle);
                                bVar.f8907A0 = true;
                                bVar.X(homeActivity2.f6273e0, message.getId());
                                bVar.f5001M0 = new Z.b(message, i8, homeActivity2);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                PostActivity postActivity = (PostActivity) obj;
                boolean zIsLoading = resource.isLoading();
                Y0.a aVar = postActivity.f6282c0;
                if (aVar == null) {
                    AbstractC1305a.W("binding");
                    throw null;
                }
                NestedScrollView nestedScrollView = aVar.f4755f;
                AbstractC1305a.n(nestedScrollView, "content");
                AbstractC1332d.v0(nestedScrollView, !zIsLoading);
                Y0.a aVar2 = postActivity.f6282c0;
                if (aVar2 == null) {
                    AbstractC1305a.W("binding");
                    throw null;
                }
                LinearProgressIndicator linearProgressIndicator = aVar2.f4757h;
                AbstractC1305a.n(linearProgressIndicator, "loader");
                AbstractC1332d.w0(linearProgressIndicator, zIsLoading);
                if (!zIsLoading) {
                    SwipeRefreshLayout swipeRefreshLayout = postActivity.f6283d0;
                    if (swipeRefreshLayout == null) {
                        AbstractC1305a.W("swipeRefresh");
                        throw null;
                    }
                    swipeRefreshLayout.setRefreshing(false);
                }
                if (resource.getError() != null) {
                    Y0.a aVar3 = postActivity.f6282c0;
                    if (aVar3 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    NestedScrollView nestedScrollView2 = aVar3.f4755f;
                    AbstractC1305a.n(nestedScrollView2, "content");
                    nestedScrollView2.setVisibility(8);
                    String string2 = postActivity.getString(R.string.error_msg);
                    AbstractC1305a.n(string2, "getString(...)");
                    Y0.a aVar4 = postActivity.f6282c0;
                    if (aVar4 != null) {
                        R2.l.f(aVar4.f4750a, string2).g();
                        return;
                    } else {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                }
                if (resource.getData() != null) {
                    postActivity.f6288i0 = (PostResponse) resource.getData();
                    Y0.a aVar5 = postActivity.f6282c0;
                    if (aVar5 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout = aVar5.f4746A;
                    AbstractC1305a.n(linearLayout, "watch");
                    if (postActivity.f6288i0 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    AbstractC1332d.v0(linearLayout, !r2.isDemo());
                    V0.k kVar = (V0.k) com.bumptech.glide.b.a(postActivity).f6293A.e(postActivity);
                    PostResponse postResponse = postActivity.f6288i0;
                    if (postResponse == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    V0.j jVar = (V0.j) kVar.s(postResponse.getPoster()).G(new W0.k(i, postActivity)).x(new C1299h(i), true);
                    Y0.a aVar6 = postActivity.f6282c0;
                    if (aVar6 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    jVar.E(aVar6.f4754e);
                    Y0.a aVar7 = postActivity.f6282c0;
                    if (aVar7 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    aVar7.f4754e.setClipToOutline(true);
                    Y0.a aVar8 = postActivity.f6282c0;
                    if (aVar8 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    aVar8.f4769t.setOnClickListener(new W0.i(postActivity, i7));
                    Y0.a aVar9 = postActivity.f6282c0;
                    if (aVar9 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse2 = postActivity.f6288i0;
                    if (postResponse2 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar9.f4774y.setText(postResponse2.getTitle());
                    Y0.a aVar10 = postActivity.f6282c0;
                    if (aVar10 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse3 = postActivity.f6288i0;
                    if (postResponse3 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar10.f4775z.setText(postResponse3.getType());
                    Y0.a aVar11 = postActivity.f6282c0;
                    if (aVar11 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse4 = postActivity.f6288i0;
                    if (postResponse4 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar11.f4760k.setText(postResponse4.getRating());
                    Y0.a aVar12 = postActivity.f6282c0;
                    if (aVar12 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout2 = aVar12.f4761l;
                    AbstractC1305a.n(linearLayout2, "ratingBlock");
                    PostResponse postResponse5 = postActivity.f6288i0;
                    if (postResponse5 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    String rating = postResponse5.getRating();
                    AbstractC1332d.v0(linearLayout2, !(rating == null || K4.h.d0(rating)));
                    Y0.a aVar13 = postActivity.f6282c0;
                    if (aVar13 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse6 = postActivity.f6288i0;
                    if (postResponse6 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar13.f4751b.setText(postResponse6.getAge());
                    Y0.a aVar14 = postActivity.f6282c0;
                    if (aVar14 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout3 = aVar14.f4752c;
                    AbstractC1305a.n(linearLayout3, "ageBlock");
                    PostResponse postResponse7 = postActivity.f6288i0;
                    if (postResponse7 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    String age = postResponse7.getAge();
                    AbstractC1332d.v0(linearLayout3, !(age == null || K4.h.d0(age)));
                    Y0.a aVar15 = postActivity.f6282c0;
                    if (aVar15 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse8 = postActivity.f6288i0;
                    if (postResponse8 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar15.f4759j.setText(postResponse8.getPremiered());
                    Y0.a aVar16 = postActivity.f6282c0;
                    if (aVar16 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    TextView textView = aVar16.f4759j;
                    AbstractC1305a.n(textView, "premiered");
                    PostResponse postResponse9 = postActivity.f6288i0;
                    if (postResponse9 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    String premiered = postResponse9.getPremiered();
                    AbstractC1332d.v0(textView, !(premiered == null || K4.h.d0(premiered)));
                    Y0.a aVar17 = postActivity.f6282c0;
                    if (aVar17 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse10 = postActivity.f6288i0;
                    if (postResponse10 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar17.f4772w.setText(postResponse10.getStatus());
                    Y0.a aVar18 = postActivity.f6282c0;
                    if (aVar18 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    TextView textView2 = aVar18.f4772w;
                    AbstractC1305a.n(textView2, "status");
                    PostResponse postResponse11 = postActivity.f6288i0;
                    if (postResponse11 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    String status = postResponse11.getStatus();
                    AbstractC1332d.v0(textView2, !(status == null || K4.h.d0(status)));
                    Y0.a aVar19 = postActivity.f6282c0;
                    if (aVar19 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse12 = postActivity.f6288i0;
                    if (postResponse12 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar19.f4764o.setText(postResponse12.getRuntime());
                    Y0.a aVar20 = postActivity.f6282c0;
                    if (aVar20 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    TextView textView3 = aVar20.f4764o;
                    AbstractC1305a.n(textView3, "runtime");
                    PostResponse postResponse13 = postActivity.f6288i0;
                    if (postResponse13 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    String runtime = postResponse13.getRuntime();
                    AbstractC1332d.v0(textView3, !(runtime == null || K4.h.d0(runtime)));
                    Y0.a aVar21 = postActivity.f6282c0;
                    if (aVar21 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse14 = postActivity.f6288i0;
                    if (postResponse14 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar21.f4765p.setText(String.valueOf(postResponse14.getScore()));
                    Y0.a aVar22 = postActivity.f6282c0;
                    if (aVar22 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout4 = aVar22.f4766q;
                    AbstractC1305a.n(linearLayout4, "scoreBlock");
                    PostResponse postResponse15 = postActivity.f6288i0;
                    if (postResponse15 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    AbstractC1332d.v0(linearLayout4, postResponse15.getScore() != null);
                    Y0.a aVar23 = postActivity.f6282c0;
                    if (aVar23 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse16 = postActivity.f6288i0;
                    if (postResponse16 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar23.f4756g.setText(postResponse16.getGenres());
                    Y0.a aVar24 = postActivity.f6282c0;
                    if (aVar24 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    TextView textView4 = aVar24.f4756g;
                    AbstractC1305a.n(textView4, "genres");
                    PostResponse postResponse17 = postActivity.f6288i0;
                    if (postResponse17 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    String genres = postResponse17.getGenres();
                    AbstractC1332d.v0(textView4, !(genres == null || K4.h.d0(genres)));
                    Y0.a aVar25 = postActivity.f6282c0;
                    if (aVar25 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    PostResponse postResponse18 = postActivity.f6288i0;
                    if (postResponse18 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    aVar25.f4758i.setText(postResponse18.getOverview());
                    Y0.a aVar26 = postActivity.f6282c0;
                    if (aVar26 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    TextView textView5 = aVar26.f4758i;
                    AbstractC1305a.n(textView5, "overview");
                    PostResponse postResponse19 = postActivity.f6288i0;
                    if (postResponse19 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    String overview = postResponse19.getOverview();
                    AbstractC1332d.v0(textView5, ((overview == null || K4.h.d0(overview)) ? 1 : 0) ^ 1);
                    X0.d dVar = postActivity.f6285f0;
                    if (dVar == null) {
                        AbstractC1305a.W("seasonsAdapter");
                        throw null;
                    }
                    PostResponse postResponse20 = postActivity.f6288i0;
                    if (postResponse20 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    dVar.e(postResponse20.getSeasons());
                    Y0.a aVar27 = postActivity.f6282c0;
                    if (aVar27 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout5 = aVar27.f4767r;
                    AbstractC1305a.n(linearLayout5, "seasonsBlock");
                    if (postActivity.f6288i0 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    AbstractC1332d.v0(linearLayout5, !r2.getSeasons().isEmpty());
                    X0.d dVar2 = postActivity.f6286g0;
                    if (dVar2 == null) {
                        AbstractC1305a.W("relatedPostsAdapter");
                        throw null;
                    }
                    PostResponse postResponse21 = postActivity.f6288i0;
                    if (postResponse21 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    dVar2.e(postResponse21.getRelated());
                    Y0.a aVar28 = postActivity.f6282c0;
                    if (aVar28 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout6 = aVar28.f4762m;
                    AbstractC1305a.n(linearLayout6, "relatedBlock");
                    if (postActivity.f6288i0 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    AbstractC1332d.v0(linearLayout6, !r2.getRelated().isEmpty());
                    X0.d dVar3 = postActivity.f6287h0;
                    if (dVar3 == null) {
                        AbstractC1305a.W("similarPostsAdapter");
                        throw null;
                    }
                    PostResponse postResponse22 = postActivity.f6288i0;
                    if (postResponse22 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    dVar3.e(postResponse22.getSimilar());
                    Y0.a aVar29 = postActivity.f6282c0;
                    if (aVar29 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout7 = aVar29.f4770u;
                    AbstractC1305a.n(linearLayout7, "similarBlock");
                    if (postActivity.f6288i0 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    AbstractC1332d.v0(linearLayout7, !r2.getSimilar().isEmpty());
                    Y0.a aVar30 = postActivity.f6282c0;
                    if (aVar30 != null) {
                        aVar30.f4746A.setOnClickListener(new W0.i(postActivity, 3));
                        return;
                    } else {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                }
                return;
            case 10:
                C0365f c0365f = (C0365f) obj;
                boolean zIsLoading2 = resource.isLoading();
                Y0.b bVar2 = c0365f.f6186A0;
                if (bVar2 == null) {
                    AbstractC1305a.W("binding");
                    throw null;
                }
                LinearProgressIndicator linearProgressIndicator2 = bVar2.f4777b;
                AbstractC1305a.n(linearProgressIndicator2, "loader");
                AbstractC1332d.w0(linearProgressIndicator2, zIsLoading2);
                if (!zIsLoading2) {
                    SwipeRefreshLayout swipeRefreshLayout2 = c0365f.f6187B0;
                    if (swipeRefreshLayout2 == null) {
                        AbstractC1305a.W("swipeRefresh");
                        throw null;
                    }
                    swipeRefreshLayout2.setRefreshing(false);
                }
                if (resource.getError() != null) {
                    String strP = c0365f.p(R.string.error_msg);
                    AbstractC1305a.n(strP, "getString(...)");
                    Y0.b bVar3 = c0365f.f6186A0;
                    if (bVar3 != null) {
                        R2.l.f(bVar3.f4776a, strP).g();
                        return;
                    } else {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                }
                if (resource.getData() != null) {
                    X0.d dVar4 = c0365f.f6189D0;
                    if (dVar4 != null) {
                        dVar4.e((List) resource.getData());
                        return;
                    } else {
                        AbstractC1305a.W("categoriesAdapter");
                        throw null;
                    }
                }
                return;
            default:
                final C0367h c0367h = (C0367h) obj;
                boolean zIsLoading3 = resource.isLoading();
                Y0.c cVar = c0367h.f6193A0;
                if (cVar == null) {
                    AbstractC1305a.W("binding");
                    throw null;
                }
                NestedScrollView nestedScrollView3 = cVar.f4781b;
                AbstractC1305a.n(nestedScrollView3, "content");
                AbstractC1332d.v0(nestedScrollView3, !zIsLoading3);
                Y0.c cVar2 = c0367h.f6193A0;
                if (cVar2 == null) {
                    AbstractC1305a.W("binding");
                    throw null;
                }
                LinearProgressIndicator linearProgressIndicator3 = cVar2.f4798s;
                AbstractC1305a.n(linearProgressIndicator3, "loader");
                AbstractC1332d.w0(linearProgressIndicator3, zIsLoading3);
                if (!zIsLoading3) {
                    SwipeRefreshLayout swipeRefreshLayout3 = c0367h.f6194B0;
                    if (swipeRefreshLayout3 == null) {
                        AbstractC1305a.W("swipeRefresh");
                        throw null;
                    }
                    swipeRefreshLayout3.setRefreshing(false);
                }
                if (resource.getError() != null) {
                    Y0.c cVar3 = c0367h.f6193A0;
                    if (cVar3 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    NestedScrollView nestedScrollView4 = cVar3.f4781b;
                    AbstractC1305a.n(nestedScrollView4, "content");
                    nestedScrollView4.setVisibility(8);
                    String strP2 = c0367h.p(R.string.error_msg);
                    AbstractC1305a.n(strP2, "getString(...)");
                    Y0.c cVar4 = c0367h.f6193A0;
                    if (cVar4 != null) {
                        R2.l.f(cVar4.f4780a, strP2).g();
                        return;
                    } else {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                }
                if (resource.getData() != null) {
                    HomeResponse homeResponse = (HomeResponse) resource.getData();
                    c0367h.E0 = homeResponse.getFeatured();
                    Y0.c cVar5 = c0367h.f6193A0;
                    if (cVar5 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    cVar5.f4792m.setOnClickListener(new View.OnClickListener() { // from class: c1.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i10 = i;
                            C0367h c0367h2 = c0367h;
                            switch (i10) {
                                case com.bumptech.glide.d.f6312l /* 0 */:
                                    int i11 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Featured featured = c0367h2.E0;
                                    if (featured == null) {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                    String share = featured.getShare();
                                    AbstractC1305a.o(share, "data");
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", share);
                                    intent.setType("text/plain");
                                    c0367h2.T(Intent.createChooser(intent, c0367h2.p(R.string.app_name)));
                                    return;
                                case 1:
                                    int i12 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Featured featured2 = c0367h2.E0;
                                    if (featured2 != null) {
                                        AbstractC1332d.b0(c0367h2, featured2.getId());
                                        return;
                                    } else {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                default:
                                    int i13 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Z0.p pVarU = c0367h2.U();
                                    Featured featured3 = c0367h2.E0;
                                    if (featured3 == null) {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                    if (pVarU.f(featured3.getId())) {
                                        Z0.p pVarU2 = c0367h2.U();
                                        Featured featured4 = c0367h2.E0;
                                        if (featured4 == null) {
                                            AbstractC1305a.W("featured");
                                            throw null;
                                        }
                                        int id2 = featured4.getId();
                                        pVarU2.getClass();
                                        ((Boolean) S3.a.J(new Z0.l(pVarU2, id2, null))).getClass();
                                    } else {
                                        Z0.p pVarU3 = c0367h2.U();
                                        Featured featured5 = c0367h2.E0;
                                        if (featured5 == null) {
                                            AbstractC1305a.W("featured");
                                            throw null;
                                        }
                                        int id3 = featured5.getId();
                                        pVarU3.getClass();
                                        ((Boolean) S3.a.J(new Z0.g(pVarU3, id3, null))).getClass();
                                    }
                                    c0367h2.W(true);
                                    return;
                            }
                        }
                    });
                    Y0.c cVar6 = c0367h.f6193A0;
                    if (cVar6 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    cVar6.f4796q.setOnClickListener(new View.OnClickListener() { // from class: c1.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i10 = i8;
                            C0367h c0367h2 = c0367h;
                            switch (i10) {
                                case com.bumptech.glide.d.f6312l /* 0 */:
                                    int i11 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Featured featured = c0367h2.E0;
                                    if (featured == null) {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                    String share = featured.getShare();
                                    AbstractC1305a.o(share, "data");
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", share);
                                    intent.setType("text/plain");
                                    c0367h2.T(Intent.createChooser(intent, c0367h2.p(R.string.app_name)));
                                    return;
                                case 1:
                                    int i12 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Featured featured2 = c0367h2.E0;
                                    if (featured2 != null) {
                                        AbstractC1332d.b0(c0367h2, featured2.getId());
                                        return;
                                    } else {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                default:
                                    int i13 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Z0.p pVarU = c0367h2.U();
                                    Featured featured3 = c0367h2.E0;
                                    if (featured3 == null) {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                    if (pVarU.f(featured3.getId())) {
                                        Z0.p pVarU2 = c0367h2.U();
                                        Featured featured4 = c0367h2.E0;
                                        if (featured4 == null) {
                                            AbstractC1305a.W("featured");
                                            throw null;
                                        }
                                        int id2 = featured4.getId();
                                        pVarU2.getClass();
                                        ((Boolean) S3.a.J(new Z0.l(pVarU2, id2, null))).getClass();
                                    } else {
                                        Z0.p pVarU3 = c0367h2.U();
                                        Featured featured5 = c0367h2.E0;
                                        if (featured5 == null) {
                                            AbstractC1305a.W("featured");
                                            throw null;
                                        }
                                        int id3 = featured5.getId();
                                        pVarU3.getClass();
                                        ((Boolean) S3.a.J(new Z0.g(pVarU3, id3, null))).getClass();
                                    }
                                    c0367h2.W(true);
                                    return;
                            }
                        }
                    });
                    Y0.c cVar7 = c0367h.f6193A0;
                    if (cVar7 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    cVar7.f4797r.setOnClickListener(new View.OnClickListener() { // from class: c1.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i10 = i7;
                            C0367h c0367h2 = c0367h;
                            switch (i10) {
                                case com.bumptech.glide.d.f6312l /* 0 */:
                                    int i11 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Featured featured = c0367h2.E0;
                                    if (featured == null) {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                    String share = featured.getShare();
                                    AbstractC1305a.o(share, "data");
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", share);
                                    intent.setType("text/plain");
                                    c0367h2.T(Intent.createChooser(intent, c0367h2.p(R.string.app_name)));
                                    return;
                                case 1:
                                    int i12 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Featured featured2 = c0367h2.E0;
                                    if (featured2 != null) {
                                        AbstractC1332d.b0(c0367h2, featured2.getId());
                                        return;
                                    } else {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                default:
                                    int i13 = C0367h.f6192F0;
                                    AbstractC1305a.o(c0367h2, "this$0");
                                    Z0.p pVarU = c0367h2.U();
                                    Featured featured3 = c0367h2.E0;
                                    if (featured3 == null) {
                                        AbstractC1305a.W("featured");
                                        throw null;
                                    }
                                    if (pVarU.f(featured3.getId())) {
                                        Z0.p pVarU2 = c0367h2.U();
                                        Featured featured4 = c0367h2.E0;
                                        if (featured4 == null) {
                                            AbstractC1305a.W("featured");
                                            throw null;
                                        }
                                        int id2 = featured4.getId();
                                        pVarU2.getClass();
                                        ((Boolean) S3.a.J(new Z0.l(pVarU2, id2, null))).getClass();
                                    } else {
                                        Z0.p pVarU3 = c0367h2.U();
                                        Featured featured5 = c0367h2.E0;
                                        if (featured5 == null) {
                                            AbstractC1305a.W("featured");
                                            throw null;
                                        }
                                        int id3 = featured5.getId();
                                        pVarU3.getClass();
                                        ((Boolean) S3.a.J(new Z0.g(pVarU3, id3, null))).getClass();
                                    }
                                    c0367h2.W(true);
                                    return;
                            }
                        }
                    });
                    c0367h.W(false);
                    Context contextM = c0367h.m();
                    AbstractC1332d.l(contextM, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                    V0.k kVar2 = (V0.k) com.bumptech.glide.b.a(contextM).f6293A.d(c0367h);
                    Featured featured = c0367h.E0;
                    if (featured == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    V0.j jVarL = kVar2.s(featured.getPoster()).G(new W0.k(i8, c0367h));
                    Y0.c cVar8 = c0367h.f6193A0;
                    if (cVar8 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    jVarL.E(cVar8.f4785f);
                    Y0.c cVar9 = c0367h.f6193A0;
                    if (cVar9 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    cVar9.f4785f.setClipToOutline(true);
                    Y0.c cVar10 = c0367h.f6193A0;
                    if (cVar10 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured2 = c0367h.E0;
                    if (featured2 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar10.f4794o.setText(featured2.getTitle());
                    Y0.c cVar11 = c0367h.f6193A0;
                    if (cVar11 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured3 = c0367h.E0;
                    if (featured3 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar11.f4795p.setText(featured3.getType());
                    Y0.c cVar12 = c0367h.f6193A0;
                    if (cVar12 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured4 = c0367h.E0;
                    if (featured4 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar12.f4784e.setText(featured4.getGenres());
                    Y0.c cVar13 = c0367h.f6193A0;
                    if (cVar13 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured5 = c0367h.E0;
                    if (featured5 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar13.f4787h.setText(featured5.getRating());
                    Y0.c cVar14 = c0367h.f6193A0;
                    if (cVar14 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout8 = cVar14.f4788i;
                    AbstractC1305a.n(linearLayout8, "featuredRatingBlock");
                    Featured featured6 = c0367h.E0;
                    if (featured6 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    String rating2 = featured6.getRating();
                    AbstractC1332d.v0(linearLayout8, !(rating2 == null || K4.h.d0(rating2)));
                    Y0.c cVar15 = c0367h.f6193A0;
                    if (cVar15 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured7 = c0367h.E0;
                    if (featured7 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar15.f4782c.setText(featured7.getAge());
                    Y0.c cVar16 = c0367h.f6193A0;
                    if (cVar16 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout9 = cVar16.f4783d;
                    AbstractC1305a.n(linearLayout9, "featuredAgeBlock");
                    Featured featured8 = c0367h.E0;
                    if (featured8 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    String age2 = featured8.getAge();
                    AbstractC1332d.v0(linearLayout9, !(age2 == null || K4.h.d0(age2)));
                    Y0.c cVar17 = c0367h.f6193A0;
                    if (cVar17 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured9 = c0367h.E0;
                    if (featured9 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar17.f4786g.setText(featured9.getPremiered());
                    Y0.c cVar18 = c0367h.f6193A0;
                    if (cVar18 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    TextView textView6 = cVar18.f4786g;
                    AbstractC1305a.n(textView6, "featuredPremiered");
                    Featured featured10 = c0367h.E0;
                    if (featured10 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    String premiered2 = featured10.getPremiered();
                    AbstractC1332d.v0(textView6, !(premiered2 == null || K4.h.d0(premiered2)));
                    Y0.c cVar19 = c0367h.f6193A0;
                    if (cVar19 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured11 = c0367h.E0;
                    if (featured11 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar19.f4793n.setText(featured11.getStatus());
                    Y0.c cVar20 = c0367h.f6193A0;
                    if (cVar20 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    TextView textView7 = cVar20.f4793n;
                    AbstractC1305a.n(textView7, "featuredStatus");
                    Featured featured12 = c0367h.E0;
                    if (featured12 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    String status2 = featured12.getStatus();
                    AbstractC1332d.v0(textView7, !(status2 == null || K4.h.d0(status2)));
                    Y0.c cVar21 = c0367h.f6193A0;
                    if (cVar21 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured13 = c0367h.E0;
                    if (featured13 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar21.f4789j.setText(featured13.getRuntime());
                    Y0.c cVar22 = c0367h.f6193A0;
                    if (cVar22 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    TextView textView8 = cVar22.f4789j;
                    AbstractC1305a.n(textView8, "featuredRuntime");
                    Featured featured14 = c0367h.E0;
                    if (featured14 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    String runtime2 = featured14.getRuntime();
                    AbstractC1332d.v0(textView8, !(runtime2 == null || K4.h.d0(runtime2)));
                    Y0.c cVar23 = c0367h.f6193A0;
                    if (cVar23 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    Featured featured15 = c0367h.E0;
                    if (featured15 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    cVar23.f4790k.setText(String.valueOf(featured15.getScore()));
                    Y0.c cVar24 = c0367h.f6193A0;
                    if (cVar24 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    LinearLayout linearLayout10 = cVar24.f4791l;
                    AbstractC1305a.n(linearLayout10, "featuredScoreblock");
                    Featured featured16 = c0367h.E0;
                    if (featured16 == null) {
                        AbstractC1305a.W("featured");
                        throw null;
                    }
                    AbstractC1332d.v0(linearLayout10, featured16.getScore() != null);
                    X0.d dVar5 = new X0.d(2, new H0(7, c0367h));
                    c0367h.f6196D0 = dVar5;
                    Y0.c cVar25 = c0367h.f6193A0;
                    if (cVar25 == null) {
                        AbstractC1305a.W("binding");
                        throw null;
                    }
                    cVar25.f4799t.setAdapter(dVar5);
                    X0.d dVar6 = c0367h.f6196D0;
                    if (dVar6 != null) {
                        dVar6.e(homeResponse.getSections());
                        return;
                    } else {
                        AbstractC1305a.W("sectionsAdapter");
                        throw null;
                    }
                }
                return;
        }
    }

    public final void c(Throwable th) throws InterruptedException {
        int i6 = this.f4054x;
        Object obj = this.f4055y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (th != null) {
                    ((W) obj).f4077g.H(new X(th));
                }
                W w5 = (W) obj;
                if (w5.f4079i.a()) {
                    ((Y.i) w5.f4079i.getValue()).close();
                }
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                ((p1) obj).j(null);
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((InterfaceC0062g) obj).o(C1316l.f12640a);
                break;
            case 20:
                ((T4.h) obj).b();
                break;
            default:
                q2.l lVar = (q2.l) ((q2.l) obj).f12355x;
                int i7 = lVar.f12354w;
                Object obj2 = lVar.f12355x;
                switch (i7) {
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                        ((CountDownLatch) obj2).await();
                        break;
                    default:
                        ((q2.s) obj2).n(null);
                        break;
                }
                break;
        }
    }

    public final void d(C1197m c1197m) {
        ConstraintLayout constraintLayout;
        C1168D c1168d;
        ConstraintLayout constraintLayout2;
        C1168D c1168d2;
        C1168D c1168d3;
        C1168D c1168d4;
        int i6 = this.f4054x;
        Object obj = this.f4055y;
        switch (i6) {
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC1305a.o(c1197m, "loadState");
                C1193k c1193k = (C1193k) obj;
                if (!((Boolean) c1193k.f11976d.getValue()).booleanValue()) {
                    Iterator it = c1193k.f11982j.iterator();
                    while (it.hasNext()) {
                        ((C4.l) it.next()).j(c1197m);
                    }
                    return;
                } else {
                    Handler handler = (Handler) c1193k.f11984l.getValue();
                    RunnableC0969k runnableC0969k = c1193k.f11985m;
                    handler.removeCallbacks(runnableC0969k);
                    ((AtomicReference) runnableC0969k.f10300x).set(c1197m);
                    handler.post(runnableC0969k);
                    return;
                }
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1305a.o(c1197m, "loadState");
                o0.G g4 = c1197m.f12010a;
                boolean z5 = g4 instanceof C1169E;
                o0.G g6 = c1197m.f12012c;
                if (z5 || (g6 instanceof C1169E)) {
                    CategoryActivity.p((CategoryActivity) obj, true);
                } else {
                    CategoryActivity categoryActivity = (CategoryActivity) obj;
                    CategoryActivity.p(categoryActivity, false);
                    if (g6 instanceof C1168D) {
                        AbstractC1305a.m(g6, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                        c1168d = (C1168D) g6;
                    } else {
                        o0.G g7 = c1197m.f12011b;
                        if (g7 instanceof C1168D) {
                            AbstractC1305a.m(g7, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                            c1168d = (C1168D) g7;
                        } else if (g4 instanceof C1168D) {
                            AbstractC1305a.m(g4, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                            c1168d = (C1168D) g4;
                        } else {
                            c1168d = null;
                        }
                    }
                    if (c1168d != null) {
                        String string = categoryActivity.getString(R.string.error_msg);
                        AbstractC1305a.n(string, "getString(...)");
                        C1251c c1251c = categoryActivity.f6266c0;
                        if (c1251c == null) {
                            AbstractC1305a.W("binding");
                            throw null;
                        }
                        switch (c1251c.f12317a) {
                            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                                constraintLayout2 = (ConstraintLayout) c1251c.f12318b;
                                break;
                            default:
                                constraintLayout2 = (ConstraintLayout) c1251c.f12318b;
                                break;
                        }
                        R2.l.f(constraintLayout2, string).g();
                    }
                }
                if ((c1197m.f12013d.f11768a instanceof o0.F) && g6.f11761a) {
                    CategoryActivity categoryActivity2 = (CategoryActivity) obj;
                    X0.e eVar = categoryActivity2.f6269f0;
                    if (eVar == null) {
                        AbstractC1305a.W("postsAdapter");
                        throw null;
                    }
                    if (eVar.a() == 0) {
                        String string2 = categoryActivity2.getString(R.string.empty_result);
                        AbstractC1305a.n(string2, "getString(...)");
                        C1251c c1251c2 = categoryActivity2.f6266c0;
                        if (c1251c2 == null) {
                            AbstractC1305a.W("binding");
                            throw null;
                        }
                        switch (c1251c2.f12317a) {
                            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                                constraintLayout = (ConstraintLayout) c1251c2.f12318b;
                                break;
                            default:
                                constraintLayout = (ConstraintLayout) c1251c2.f12318b;
                                break;
                        }
                        R2.l.f(constraintLayout, string2).g();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                AbstractC1305a.o(c1197m, "loadState");
                o0.G g8 = c1197m.f12010a;
                boolean z6 = g8 instanceof C1169E;
                o0.G g9 = c1197m.f12012c;
                if (z6 || (g9 instanceof C1169E)) {
                    C0370k.W((C0370k) obj, true);
                } else {
                    C0370k c0370k = (C0370k) obj;
                    C0370k.W(c0370k, false);
                    if (g9 instanceof C1168D) {
                        AbstractC1305a.m(g9, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                        c1168d2 = (C1168D) g9;
                    } else {
                        o0.G g10 = c1197m.f12011b;
                        if (g10 instanceof C1168D) {
                            AbstractC1305a.m(g10, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                            c1168d2 = (C1168D) g10;
                        } else if (g8 instanceof C1168D) {
                            AbstractC1305a.m(g8, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                            c1168d2 = (C1168D) g8;
                        } else {
                            c1168d2 = null;
                        }
                    }
                    if (c1168d2 != null) {
                        String strP = c0370k.p(R.string.error_msg);
                        AbstractC1305a.n(strP, "getString(...)");
                        Y0.b bVar = c0370k.f6202A0;
                        if (bVar == null) {
                            AbstractC1305a.W("binding");
                            throw null;
                        }
                        R2.l.f(bVar.f4776a, strP).g();
                    }
                }
                if ((c1197m.f12013d.f11768a instanceof o0.F) && g9.f11761a) {
                    C0370k c0370k2 = (C0370k) obj;
                    X0.e eVar2 = c0370k2.f6205D0;
                    if (eVar2 == null) {
                        AbstractC1305a.W("postsAdapter");
                        throw null;
                    }
                    if (eVar2.a() == 0) {
                        String strP2 = c0370k2.p(R.string.empty_result);
                        AbstractC1305a.n(strP2, "getString(...)");
                        Y0.b bVar2 = c0370k2.f6202A0;
                        if (bVar2 != null) {
                            R2.l.f(bVar2.f4776a, strP2).g();
                            return;
                        } else {
                            AbstractC1305a.W("binding");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            case 13:
                AbstractC1305a.o(c1197m, "loadState");
                o0.G g11 = c1197m.f12010a;
                if (!(g11 instanceof C1169E)) {
                    o0.G g12 = c1197m.f12012c;
                    if (!(g12 instanceof C1169E)) {
                        C0373n c0373n = (C0373n) obj;
                        C0373n.W(c0373n, false);
                        if (g12 instanceof C1168D) {
                            AbstractC1305a.m(g12, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                            c1168d3 = (C1168D) g12;
                        } else {
                            o0.G g13 = c1197m.f12011b;
                            if (g13 instanceof C1168D) {
                                AbstractC1305a.m(g13, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                                c1168d3 = (C1168D) g13;
                            } else if (g11 instanceof C1168D) {
                                AbstractC1305a.m(g11, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                                c1168d3 = (C1168D) g11;
                            } else {
                                c1168d3 = null;
                            }
                        }
                        if (c1168d3 != null) {
                            String strP3 = c0373n.p(R.string.error_msg);
                            AbstractC1305a.n(strP3, "getString(...)");
                            Y0.b bVar3 = c0373n.f6211A0;
                            if (bVar3 != null) {
                                R2.l.f(bVar3.f4776a, strP3).g();
                                return;
                            } else {
                                AbstractC1305a.W("binding");
                                throw null;
                            }
                        }
                        return;
                    }
                }
                C0373n.W((C0373n) obj, true);
                return;
            default:
                AbstractC1305a.o(c1197m, "loadState");
                o0.G g14 = c1197m.f12010a;
                boolean z7 = g14 instanceof C1169E;
                o0.G g15 = c1197m.f12012c;
                if (z7 || (g15 instanceof C1169E)) {
                    c1.t.W((c1.t) obj, true);
                } else {
                    c1.t tVar = (c1.t) obj;
                    c1.t.W(tVar, false);
                    if (g15 instanceof C1168D) {
                        AbstractC1305a.m(g15, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                        c1168d4 = (C1168D) g15;
                    } else {
                        o0.G g16 = c1197m.f12011b;
                        if (g16 instanceof C1168D) {
                            AbstractC1305a.m(g16, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                            c1168d4 = (C1168D) g16;
                        } else if (g14 instanceof C1168D) {
                            AbstractC1305a.m(g14, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
                            c1168d4 = (C1168D) g14;
                        } else {
                            c1168d4 = null;
                        }
                    }
                    if (c1168d4 != null) {
                        String strP4 = tVar.p(R.string.error_msg);
                        AbstractC1305a.n(strP4, "getString(...)");
                        android.support.v4.media.b bVar4 = tVar.f6227A0;
                        if (bVar4 == null) {
                            AbstractC1305a.W("binding");
                            throw null;
                        }
                        R2.l.f((ConstraintLayout) bVar4.f5065a, strP4).g();
                    }
                }
                if ((c1197m.f12013d.f11768a instanceof o0.F) && g15.f11761a) {
                    c1.t tVar2 = (c1.t) obj;
                    X0.e eVar3 = tVar2.E0;
                    if (eVar3 == null) {
                        AbstractC1305a.W("postsAdapter");
                        throw null;
                    }
                    if (eVar3.a() == 0) {
                        String strP5 = tVar2.p(R.string.empty_result);
                        AbstractC1305a.n(strP5, "getString(...)");
                        android.support.v4.media.b bVar5 = tVar2.f6227A0;
                        if (bVar5 != null) {
                            R2.l.f((ConstraintLayout) bVar5.f5065a, strP5).g();
                            return;
                        } else {
                            AbstractC1305a.W("binding");
                            throw null;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // C4.l
    public final Object j(Object obj) throws InterruptedException {
        Object objM;
        C1316l c1316l = C1316l.f12640a;
        int i6 = this.f4054x;
        Object obj2 = this.f4055y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c((Throwable) obj);
                break;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1305a.o(entry, "entry");
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = N.V.f1964a;
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                C1170a c1170a = (C1170a) obj;
                AbstractC1305a.o(c1170a, "it");
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                d((C1197m) obj);
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                c((Throwable) obj);
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
            default:
                c((Throwable) obj);
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                c((Throwable) obj);
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                d((C1197m) obj);
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                a((Resource) obj);
                break;
            case 9:
                a((Resource) obj);
                break;
            case 10:
                a((Resource) obj);
                break;
            case 11:
                a((Resource) obj);
                break;
            case 12:
                d((C1197m) obj);
                break;
            case 13:
                d((C1197m) obj);
                break;
            case 14:
                d((C1197m) obj);
                break;
            case 15:
                if (obj != ((AbstractC1344a) obj2)) {
                    break;
                }
                break;
            case 16:
                AbstractC1305a.o(obj, "it");
                break;
            case 17:
                String str = (String) obj;
                AbstractC1305a.o(str, "line");
                break;
            case 18:
                H4.c cVar = (H4.c) obj;
                AbstractC1305a.o(cVar, "it");
                CharSequence charSequence = (CharSequence) obj2;
                AbstractC1305a.o(charSequence, "<this>");
                break;
            case 19:
                Throwable th = (Throwable) obj;
                try {
                    Throwable th2 = (Throwable) ((C4.l) obj2).j(th);
                    boolean zC = AbstractC1305a.c(th.getMessage(), th2.getMessage());
                    objM = th2;
                    if (!zC) {
                        boolean zC2 = AbstractC1305a.c(th2.getMessage(), th.toString());
                        objM = th2;
                        if (!zC2) {
                            objM = null;
                        }
                    }
                } catch (Throwable th3) {
                    objM = S3.a.m(th3);
                }
                break;
            case 20:
                c((Throwable) obj);
                break;
        }
        return c1316l;
    }
}
