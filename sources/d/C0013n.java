package D;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: D.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0013n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f213g;

    public C0013n(int i6, String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = i6 == 0 ? null : IconCompat.b(i6);
        Bundle bundle = new Bundle();
        this.f210d = true;
        this.f208b = iconCompatB;
        if (iconCompatB != null && iconCompatB.d() == 2) {
            this.f211e = iconCompatB.c();
        }
        this.f212f = t.b(str);
        this.f213g = pendingIntent;
        this.f207a = bundle;
        this.f209c = true;
        this.f210d = true;
    }
}
