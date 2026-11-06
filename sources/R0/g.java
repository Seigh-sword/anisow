package R0;

import w0.p;
import w0.t;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, p pVar, int i6) {
        super(pVar);
        this.f2896d = i6;
        this.f2897e = obj;
    }

    @Override // w0.t
    public final String b() {
        switch (this.f2896d) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 1:
                return "DELETE FROM WorkProgress";
            default:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }
}
