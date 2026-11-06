package T1;

import M4.InterfaceC0062g;
import O.s;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.onesignal.FCMBroadcastReceiver;
import com.onesignal.S;
import com.onesignal.T;
import i.C0804d;
import i.C0805e;
import i.C0807g;
import i.C0808h;
import i.DialogInterfaceC0809i;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import l1.F;
import q2.InterfaceC1261d;
import s1.D;
import v0.AbstractC1397f0;
import v0.E0;
import v0.g0;
import v1.InterfaceC1417a;
import y0.C1495b;
import y0.C1496c;
import z3.C1531a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements InterfaceC1261d, S, InterfaceC1417a, s, E0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f3425x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(int i6) {
        this(100, Bitmap.CompressFormat.JPEG);
        if (i6 == 6) {
            this.f3425x = z3.d.f14111w;
        }
    }

    public static j e() {
        return new j(6);
    }

    public static void h(B0.b bVar) {
        bVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static w0.q k(B0.b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new C1495b("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new C1495b("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C1496c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C1496c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new y0.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        hashSet2.add(new y0.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        y0.f fVar = new y0.f("Dependency", map, hashSet, hashSet2);
        y0.f fVarA = y0.f.a(bVar, "Dependency");
        if (!fVar.equals(fVarA)) {
            return new w0.q(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new C1495b("id", "TEXT", true, 1, null, 1));
        map2.put("state", new C1495b("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new C1495b("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new C1495b("input_merger_class_name", "TEXT", false, 0, null, 1));
        map2.put("input", new C1495b("input", "BLOB", true, 0, null, 1));
        map2.put("output", new C1495b("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new C1495b("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new C1495b("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new C1495b("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new C1495b("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new C1495b("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new C1495b("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("period_start_time", new C1495b("period_start_time", "INTEGER", true, 0, null, 1));
        map2.put("minimum_retention_duration", new C1495b("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new C1495b("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new C1495b("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new C1495b("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("required_network_type", new C1495b("required_network_type", "INTEGER", false, 0, null, 1));
        map2.put("requires_charging", new C1495b("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new C1495b("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new C1495b("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new C1495b("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new C1495b("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new C1495b("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new C1495b("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new y0.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        hashSet4.add(new y0.e("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        y0.f fVar2 = new y0.f("WorkSpec", map2, hashSet3, hashSet4);
        y0.f fVarA2 = y0.f.a(bVar, "WorkSpec");
        if (!fVar2.equals(fVarA2)) {
            return new w0.q(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + fVarA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new C1495b("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new C1495b("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C1496c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new y0.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        y0.f fVar3 = new y0.f("WorkTag", map3, hashSet5, hashSet6);
        y0.f fVarA3 = y0.f.a(bVar, "WorkTag");
        if (!fVar3.equals(fVarA3)) {
            return new w0.q(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + fVarA3);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new C1495b("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("system_id", new C1495b("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C1496c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        y0.f fVar4 = new y0.f("SystemIdInfo", map4, hashSet7, new HashSet(0));
        y0.f fVarA4 = y0.f.a(bVar, "SystemIdInfo");
        if (!fVar4.equals(fVarA4)) {
            return new w0.q(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + fVarA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new C1495b("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new C1495b("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C1496c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new y0.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        y0.f fVar5 = new y0.f("WorkName", map5, hashSet8, hashSet9);
        y0.f fVarA5 = y0.f.a(bVar, "WorkName");
        if (!fVar5.equals(fVarA5)) {
            return new w0.q(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + fVarA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new C1495b("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new C1495b("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C1496c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        y0.f fVar6 = new y0.f("WorkProgress", map6, hashSet10, new HashSet(0));
        y0.f fVarA6 = y0.f.a(bVar, "WorkProgress");
        if (!fVar6.equals(fVarA6)) {
            return new w0.q(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + fVarA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new C1495b("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new C1495b("long_value", "INTEGER", false, 0, null, 1));
        y0.f fVar7 = new y0.f("Preference", map7, new HashSet(0), new HashSet(0));
        y0.f fVarA7 = y0.f.a(bVar, "Preference");
        if (fVar7.equals(fVarA7)) {
            return new w0.q(true, (String) null);
        }
        return new w0.q(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + fVarA7);
    }

    @Override // O.s
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f3425x).H(this.f3424w);
        return true;
    }

    @Override // com.onesignal.S
    public void b(T t5) {
        FCMBroadcastReceiver fCMBroadcastReceiver;
        switch (this.f3424w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object obj = this.f3425x;
                if (t5 == null) {
                    fCMBroadcastReceiver = (FCMBroadcastReceiver) obj;
                    int i6 = FCMBroadcastReceiver.f7551c;
                    if (!fCMBroadcastReceiver.isOrderedBroadcast()) {
                    }
                } else if (t5.f7704b || t5.f7706d) {
                    FCMBroadcastReceiver fCMBroadcastReceiver2 = (FCMBroadcastReceiver) obj;
                    int i7 = FCMBroadcastReceiver.f7551c;
                    if (fCMBroadcastReceiver2.isOrderedBroadcast()) {
                        fCMBroadcastReceiver2.abortBroadcast();
                        fCMBroadcastReceiver2.setResultCode(-1);
                    }
                    break;
                } else {
                    fCMBroadcastReceiver = (FCMBroadcastReceiver) obj;
                    int i8 = FCMBroadcastReceiver.f7551c;
                    if (!fCMBroadcastReceiver.isOrderedBroadcast()) {
                    }
                }
                fCMBroadcastReceiver.setResultCode(-1);
                break;
        }
    }

    @Override // q2.InterfaceC1261d
    public void c(q2.i iVar) {
        switch (this.f3424w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((CountDownLatch) this.f3425x).countDown();
                break;
            default:
                Exception excC = iVar.c();
                if (excC != null) {
                    ((InterfaceC0062g) this.f3425x).o(S3.a.m(excC));
                } else if (!((q2.s) iVar).f12377d) {
                    ((InterfaceC0062g) this.f3425x).o(iVar.d());
                } else {
                    ((InterfaceC0062g) this.f3425x).s(null);
                }
                break;
        }
    }

    public C1531a d() {
        return new C1531a(this.f3424w, (z3.d) this.f3425x);
    }

    @Override // v1.InterfaceC1417a
    public F f(F f6, j1.m mVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) f6.a()).compress((Bitmap.CompressFormat) this.f3425x, this.f3424w, byteArrayOutputStream);
        f6.f();
        return new D(byteArrayOutputStream.toByteArray());
    }

    public DialogInterfaceC0809i g() {
        DialogInterfaceC0809i dialogInterfaceC0809i = new DialogInterfaceC0809i(((C0805e) this.f3425x).f9283a, this.f3424w);
        C0805e c0805e = (C0805e) this.f3425x;
        View view = c0805e.f9287e;
        C0808h c0808h = dialogInterfaceC0809i.f9319B;
        int i6 = 0;
        if (view != null) {
            c0808h.f9309o = view;
        } else {
            CharSequence charSequence = c0805e.f9286d;
            if (charSequence != null) {
                c0808h.f9298d = charSequence;
                TextView textView = c0808h.f9307m;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0805e.f9285c;
            if (drawable != null) {
                c0808h.f9305k = drawable;
                c0808h.f9304j = 0;
                ImageView imageView = c0808h.f9306l;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0808h.f9306l.setImageDrawable(drawable);
                }
            }
        }
        if (c0805e.f9289g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0805e.f9284b.inflate(c0808h.f9313s, (ViewGroup) null);
            int i7 = c0805e.f9291i ? c0808h.f9314t : c0808h.f9315u;
            ListAdapter c0807g = c0805e.f9289g;
            if (c0807g == null) {
                c0807g = new C0807g(c0805e.f9283a, i7, R.id.text1, null);
            }
            c0808h.f9310p = c0807g;
            c0808h.f9311q = c0805e.f9292j;
            if (c0805e.f9290h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0804d(c0805e, i6, c0808h));
            }
            if (c0805e.f9291i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0808h.f9299e = alertController$RecycleListView;
        }
        ((C0805e) this.f3425x).getClass();
        dialogInterfaceC0809i.setCancelable(true);
        ((C0805e) this.f3425x).getClass();
        dialogInterfaceC0809i.setCanceledOnTouchOutside(true);
        ((C0805e) this.f3425x).getClass();
        dialogInterfaceC0809i.setOnCancelListener(null);
        ((C0805e) this.f3425x).getClass();
        dialogInterfaceC0809i.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = ((C0805e) this.f3425x).f9288f;
        if (onKeyListener != null) {
            dialogInterfaceC0809i.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC0809i;
    }

    public int i(View view) {
        int i6 = this.f3424w;
        Object obj = this.f3425x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g0 g0Var = (g0) view.getLayoutParams();
                ((AbstractC1397f0) obj).getClass();
                return view.getRight() + ((g0) view.getLayoutParams()).f13126b.right + ((ViewGroup.MarginLayoutParams) g0Var).rightMargin;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                ((AbstractC1397f0) obj).getClass();
                return view.getBottom() + ((g0) view.getLayoutParams()).f13126b.bottom + ((ViewGroup.MarginLayoutParams) g0Var2).bottomMargin;
        }
    }

    public int j(View view) {
        int i6 = this.f3424w;
        Object obj = this.f3425x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g0 g0Var = (g0) view.getLayoutParams();
                ((AbstractC1397f0) obj).getClass();
                return (view.getLeft() - ((g0) view.getLayoutParams()).f13126b.left) - ((ViewGroup.MarginLayoutParams) g0Var).leftMargin;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                ((AbstractC1397f0) obj).getClass();
                return (view.getTop() - ((g0) view.getLayoutParams()).f13126b.top) - ((ViewGroup.MarginLayoutParams) g0Var2).topMargin;
        }
    }

    public /* synthetic */ j(int i6, Object obj) {
        this.f3424w = i6;
        this.f3425x = obj;
    }

    public j(Context context) {
        int i6 = DialogInterfaceC0809i.i(context, 0);
        this.f3425x = new C0805e(new ContextThemeWrapper(context, DialogInterfaceC0809i.i(context, i6)));
        this.f3424w = i6;
    }
}
