package D;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f245d = false;

    public void a(Bundle bundle) {
        if (this.f245d) {
            bundle.putCharSequence("android.summaryText", this.f244c);
        }
        CharSequence charSequence = this.f243b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c());
    }

    public abstract void b(D d6);

    public abstract String c();
}
