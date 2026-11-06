package c0;

import android.text.TextUtils;
import com.onesignal.C0543c0;
import com.onesignal.OSSubscriptionState;
import com.onesignal.S0;
import com.onesignal.V0;

/* JADX INFO: loaded from: classes.dex */
public final class t implements s, S3.q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6144w;

    public t(OSSubscriptionState oSSubscriptionState, S0 s02, C0543c0 c0543c0, V0 v02) {
        s02.getClass();
        oSSubscriptionState.getClass();
        this.f6144w = oSSubscriptionState.f7655x;
        c0543c0.getClass();
        v02.getClass();
    }

    @Override // c0.s
    public boolean b(CharSequence charSequence, int i6, int i7, E e6) {
        if (!TextUtils.equals(charSequence.subSequence(i6, i7), this.f6144w)) {
            return true;
        }
        e6.f6105c = (e6.f6105c & 3) | 4;
        return false;
    }

    @Override // S3.q
    public Object h() {
        throw new Q3.q(this.f6144w);
    }

    public /* synthetic */ t(String str) {
        this.f6144w = str;
    }

    @Override // c0.s
    public Object a() {
        return this;
    }
}
