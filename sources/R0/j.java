package R0;

import w0.p;
import w0.t;

/* JADX INFO: loaded from: classes.dex */
public final class j extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(p pVar, int i6) {
        super(pVar);
        this.f2918d = i6;
    }

    @Override // w0.t
    public final String b() {
        switch (this.f2918d) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "DELETE FROM workspec WHERE id=?";
            case 1:
                return "UPDATE workspec SET output=? WHERE id=?";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            default:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }
}
