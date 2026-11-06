package J0;

import x0.AbstractC1484a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1484a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i6, int i7, int i8) {
        super(i6, i7);
        this.f1191c = i8;
    }

    @Override // x0.AbstractC1484a
    public final void a(B0.b bVar) {
        switch (this.f1191c) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                bVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.g("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
                bVar.g("DROP TABLE IF EXISTS alarmInfo");
                bVar.g("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
                break;
            case 1:
                bVar.g("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                bVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                bVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                bVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                bVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                bVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
        }
    }
}
