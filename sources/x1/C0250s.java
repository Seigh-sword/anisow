package X1;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: X1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0250s extends u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Intent f4644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Activity f4645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f4646y = 2;

    public C0250s(Activity activity, Intent intent) {
        this.f4644w = intent;
        this.f4645x = activity;
    }

    @Override // X1.u
    public final void a() {
        Intent intent = this.f4644w;
        if (intent != null) {
            this.f4645x.startActivityForResult(intent, this.f4646y);
        }
    }
}
