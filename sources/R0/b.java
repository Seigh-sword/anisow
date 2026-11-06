package R0;

import w0.AbstractC1447b;
import w0.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1447b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, p pVar, int i6) {
        super(pVar);
        this.f2886d = i6;
        this.f2887e = obj;
    }

    @Override // w0.t
    public final String b() {
        switch (this.f2886d) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [B0.f, B0.g] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v22, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v23, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01d8 -> B:100:0x01f4). Please report as a decompilation issue!!! */
    @Override // w0.AbstractC1447b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(B0.g r17, java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.b.d(B0.g, java.lang.Object):void");
    }
}
