package J3;

import com.google.firebase.messaging.FirebaseMessaging;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements q2.f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f1418x;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i6) {
        this.f1417w = i6;
        this.f1418x = firebaseMessaging;
    }

    @Override // q2.f
    public final void c(Object obj) {
        boolean z5;
        switch (this.f1417w) {
            case 1:
                D d6 = (D) obj;
                if (!this.f1418x.f7444e.e() || d6.f1351h.a() == null) {
                    return;
                }
                synchronized (d6) {
                    z5 = d6.f1350g;
                }
                if (z5) {
                    return;
                }
                d6.e(0L);
                return;
            default:
                T1.a aVar = (T1.a) obj;
                C1243i c1243i = FirebaseMessaging.f7437k;
                FirebaseMessaging firebaseMessaging = this.f1418x;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    Y2.b.r(aVar.f3404w);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
