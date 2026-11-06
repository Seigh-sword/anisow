package j3;

import android.util.Log;
import java.io.IOException;
import p3.C1251c;

/* JADX INFO: renamed from: j3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0859i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0858h f9470d = new C0858h(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K.b f9471e = new K.b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1251c f9472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9473b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9474c = null;

    public C0859i(C1251c c1251c) {
        this.f9472a = c1251c;
    }

    public static void a(C1251c c1251c, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c1251c.n(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e6) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e6);
        }
    }
}
