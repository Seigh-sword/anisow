package m2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0436j0;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f10555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0436j0 f10557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f10559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10560j;

    public E0(Context context, C0436j0 c0436j0, Long l5) {
        this.f10558h = true;
        AbstractC1332d.m(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1332d.m(applicationContext);
        this.f10551a = applicationContext;
        this.f10559i = l5;
        if (c0436j0 != null) {
            this.f10557g = c0436j0;
            this.f10552b = c0436j0.f6841B;
            this.f10553c = c0436j0.f6840A;
            this.f10554d = c0436j0.f6847z;
            this.f10558h = c0436j0.f6846y;
            this.f10556f = c0436j0.f6845x;
            this.f10560j = c0436j0.f6843D;
            Bundle bundle = c0436j0.f6842C;
            if (bundle != null) {
                this.f10555e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
