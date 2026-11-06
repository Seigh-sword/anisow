package Z3;

import a4.c;
import com.bumptech.glide.d;
import com.onesignal.C0594t1;
import com.onesignal.E1;
import m2.C1017B;
import org.json.JSONArray;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4964g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(K1.b bVar, C0594t1 c0594t1, C0594t1 c0594t12, int i6) {
        super(bVar, c0594t1, c0594t12);
        this.f4964g = i6;
        if (i6 != 1) {
            AbstractC1305a.o(bVar, "dataRepository");
        } else {
            AbstractC1305a.o(bVar, "dataRepository");
            super(bVar, c0594t1, c0594t12);
        }
    }

    @Override // Z3.a
    public final void a() {
        K1.b bVar = this.f4961d;
        c cVar = c.f5026y;
        switch (this.f4964g) {
            case d.f6312l /* 0 */:
                c cVar2 = this.f4958a;
                if (cVar2 != null) {
                    cVar = cVar2;
                }
                if (cVar == c.f5024w) {
                    cVar = c.f5025x;
                }
                bVar.getClass();
                ((C0594t1) bVar.f1515x).getClass();
                E1.g(E1.f7517a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", cVar.toString());
                break;
            default:
                c cVar3 = this.f4958a;
                if (cVar3 != null) {
                    cVar = cVar3;
                }
                bVar.getClass();
                ((C0594t1) bVar.f1515x).getClass();
                String str = E1.f7517a;
                E1.g(str, "PREFS_OS_OUTCOMES_CURRENT_SESSION", cVar.toString());
                String str2 = this.f4960c;
                ((C0594t1) bVar.f1515x).getClass();
                E1.g(str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str2);
                break;
        }
    }

    @Override // Z3.a
    public final int b() {
        K1.b bVar = this.f4961d;
        switch (this.f4964g) {
            case d.f6312l /* 0 */:
                ((C0594t1) bVar.f1515x).getClass();
                return E1.c(10, "PREFS_OS_IAM_LIMIT");
            default:
                ((C0594t1) bVar.f1515x).getClass();
                return E1.c(10, "PREFS_OS_NOTIFICATION_LIMIT");
        }
    }

    @Override // Z3.a
    public final String d() {
        switch (this.f4964g) {
            case d.f6312l /* 0 */:
                return "iam_id";
            default:
                return "notification_id";
        }
    }

    @Override // Z3.a
    public final JSONArray e() {
        K1.b bVar = this.f4961d;
        switch (this.f4964g) {
            case d.f6312l /* 0 */:
                ((C0594t1) bVar.f1515x).getClass();
                String strE = E1.e(E1.f7517a, "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
                return strE != null ? new JSONArray(strE) : new JSONArray();
            default:
                ((C0594t1) bVar.f1515x).getClass();
                String strE2 = E1.e(E1.f7517a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
                return strE2 != null ? new JSONArray(strE2) : new JSONArray();
        }
    }

    @Override // Z3.a
    public final void g() {
        C0594t1 c0594t1 = this.f4962e;
        K1.b bVar = this.f4961d;
        c cVar = c.f5025x;
        switch (this.f4964g) {
            case d.f6312l /* 0 */:
                bVar.getClass();
                ((C0594t1) bVar.f1515x).getClass();
                c cVarO = C1017B.o(E1.e(E1.f7517a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", "UNATTRIBUTED"));
                if (cVarO == cVar) {
                    this.f4959b = f();
                }
                this.f4958a = cVarO;
                c0594t1.getClass();
                C0594t1.d("OneSignal InAppMessageTracker initInfluencedTypeFromCache: " + this);
                break;
            default:
                ((C0594t1) bVar.f1515x).getClass();
                String str = E1.f7517a;
                c cVarO2 = C1017B.o(E1.e(str, "PREFS_OS_OUTCOMES_CURRENT_SESSION", "UNATTRIBUTED"));
                if (cVarO2 == cVar) {
                    this.f4959b = f();
                } else if (cVarO2.b()) {
                    ((C0594t1) bVar.f1515x).getClass();
                    this.f4960c = E1.e(str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
                }
                this.f4958a = cVarO2;
                c0594t1.getClass();
                C0594t1.d("OneSignal NotificationTracker initInfluencedTypeFromCache: " + this);
                break;
        }
    }
}
