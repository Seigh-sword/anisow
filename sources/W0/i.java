package W0;

import Q3.n;
import Z0.l;
import Z0.p;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.android.app.activities.PostActivity;
import com.android.app.models.PlayerConfig;
import com.android.app.network.responses.PostResponse;
import com.xo.anilab.R;
import h0.W;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PostActivity f4208x;

    public /* synthetic */ i(PostActivity postActivity, int i6) {
        this.f4207w = i6;
        this.f4208x = postActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f4207w;
        PostActivity postActivity = this.f4208x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int i7 = PostActivity.f6281j0;
                AbstractC1305a.o(postActivity, "this$0");
                postActivity.finish();
                return;
            case 1:
                int i8 = PostActivity.f6281j0;
                AbstractC1305a.o(postActivity, "this$0");
                p pVarO = postActivity.o();
                Integer numR = postActivity.r();
                AbstractC1305a.l(numR);
                if (pVarO.f(numR.intValue())) {
                    p pVarO2 = postActivity.o();
                    Integer numR2 = postActivity.r();
                    AbstractC1305a.l(numR2);
                    int iIntValue = numR2.intValue();
                    pVarO2.getClass();
                    ((Boolean) S3.a.J(new l(pVarO2, iIntValue, null))).getClass();
                } else {
                    p pVarO3 = postActivity.o();
                    Integer numR3 = postActivity.r();
                    AbstractC1305a.l(numR3);
                    int iIntValue2 = numR3.intValue();
                    pVarO3.getClass();
                    ((Boolean) S3.a.J(new Z0.g(pVarO3, iIntValue2, null))).getClass();
                }
                postActivity.p(true);
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                int i9 = PostActivity.f6281j0;
                AbstractC1305a.o(postActivity, "this$0");
                PostResponse postResponse = postActivity.f6288i0;
                if (postResponse == null) {
                    AbstractC1305a.W("post");
                    throw null;
                }
                String share = postResponse.getShare();
                AbstractC1305a.o(share, "data");
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", share);
                intent.setType("text/plain");
                postActivity.startActivity(Intent.createChooser(intent, postActivity.getString(R.string.app_name)));
                return;
            default:
                int i10 = PostActivity.f6281j0;
                AbstractC1305a.o(postActivity, "this$0");
                PostResponse postResponse2 = postActivity.f6288i0;
                if (postResponse2 == null) {
                    AbstractC1305a.W("post");
                    throw null;
                }
                PlayerConfig playerConfig = postResponse2.getPlayerConfig();
                try {
                    Intent intent2 = new Intent();
                    intent2.setComponent(new ComponentName(playerConfig.getPackageName(), playerConfig.getActivityName()));
                    PostResponse postResponse3 = postActivity.f6288i0;
                    if (postResponse3 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    intent2.putExtra("POST_ID", String.valueOf(postResponse3.getId()));
                    PostResponse postResponse4 = postActivity.f6288i0;
                    if (postResponse4 == null) {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                    intent2.putExtra("POST_TITLE", postResponse4.getTitle());
                    postActivity.startActivity(intent2);
                    return;
                } catch (Exception unused) {
                    int i11 = a1.d.f5004M0;
                    AbstractC1305a.o(playerConfig, "data");
                    a1.d dVar = new a1.d();
                    Bundle bundle = new Bundle();
                    String strE = new n().e(playerConfig);
                    AbstractC1305a.n(strE, "toJson(...)");
                    bundle.putString("PLAYER_DATA", strE);
                    dVar.S(bundle);
                    dVar.f8907A0 = true;
                    W wC = postActivity.f8646P.C();
                    PostResponse postResponse5 = postActivity.f6288i0;
                    if (postResponse5 != null) {
                        dVar.X(wC, String.valueOf(postResponse5.getId()));
                        return;
                    } else {
                        AbstractC1305a.W("post");
                        throw null;
                    }
                }
        }
    }
}
