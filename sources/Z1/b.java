package Z1;

import V1.i;
import V1.j;
import X1.AbstractC0242j;
import X1.C0239g;
import X1.C0249q;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import d.AbstractC0628i;
import f2.h;
import o2.C1227a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4954d;

    public b(int i6) {
        this.f4954d = i6;
    }

    @Override // f2.h
    public final AbstractC0242j e(Context context, Looper looper, C0239g c0239g, Object obj, i iVar, j jVar) {
        int i6 = this.f4954d;
        switch (i6) {
            case 1:
                Integer num = c0239g.f4596h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c0239g.f4589a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C1227a(context, looper, c0239g, bundle, iVar, jVar);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0628i.p(obj);
                throw null;
            default:
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        return new d(context, looper, c0239g, (C0249q) obj, iVar, jVar);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
