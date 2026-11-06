package T3;

import Q3.A;
import Q3.B;
import Q3.z;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class j implements B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3474x;

    public /* synthetic */ j(int i6, Object obj) {
        this.f3473w = i6;
        this.f3474x = obj;
    }

    @Override // Q3.B
    public final A a(Q3.n nVar, TypeToken typeToken) {
        int i6 = this.f3473w;
        Object obj = this.f3474x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (typeToken.f7456a == Number.class) {
                    return (k) obj;
                }
                return null;
            default:
                if (typeToken.f7456a == Object.class) {
                    return new l(nVar, (z) obj);
                }
                return null;
        }
    }
}
