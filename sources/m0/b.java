package M0;

import I0.o;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1752b = o.y("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f1753a;

    public b(Context context) {
        this.f1753a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
