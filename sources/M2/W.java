package m2;

import android.content.SharedPreferences;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f10794e;

    public W(Y y5, String str, boolean z5) {
        this.f10794e = y5;
        AbstractC1332d.g(str);
        this.f10790a = str;
        this.f10791b = z5;
    }

    public final void a(boolean z5) {
        SharedPreferences.Editor editorEdit = this.f10794e.A().edit();
        editorEdit.putBoolean(this.f10790a, z5);
        editorEdit.apply();
        this.f10793d = z5;
    }

    public final boolean b() {
        if (!this.f10792c) {
            this.f10792c = true;
            this.f10793d = this.f10794e.A().getBoolean(this.f10790a, this.f10791b);
        }
        return this.f10793d;
    }
}
