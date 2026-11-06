package P3;

import android.content.Context;
import android.os.Bundle;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f2513a;

    public b(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f2513a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // P3.r
    public final L4.a a() {
        Bundle bundle = this.f2513a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new L4.a(S3.a.P(bundle.getInt("firebase_sessions_sessions_restart_timeout"), L4.c.SECONDS));
        }
        return null;
    }

    @Override // P3.r
    public final Boolean b() {
        Bundle bundle = this.f2513a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // P3.r
    public final Object c(InterfaceC1427e interfaceC1427e) {
        return C1316l.f12640a;
    }

    @Override // P3.r
    public final Double d() {
        Bundle bundle = this.f2513a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
