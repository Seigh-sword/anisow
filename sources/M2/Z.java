package m2;

import android.content.SharedPreferences;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f10836e;

    public Z(Y y5, String str, long j6) {
        this.f10836e = y5;
        AbstractC1332d.g(str);
        this.f10832a = str;
        this.f10833b = j6;
    }

    public final long a() {
        if (!this.f10834c) {
            this.f10834c = true;
            this.f10835d = this.f10836e.A().getLong(this.f10832a, this.f10833b);
        }
        return this.f10835d;
    }

    public final void b(long j6) {
        SharedPreferences.Editor editorEdit = this.f10836e.A().edit();
        editorEdit.putLong(this.f10832a, j6);
        editorEdit.apply();
        this.f10835d = j6;
    }
}
