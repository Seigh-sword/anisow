package m2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f10697A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ boolean f10698B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ boolean f10699C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ String f10700D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ G0 f10701E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f10702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f10703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f10704y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Bundle f10705z;

    public M0(G0 g02, String str, String str2, long j6, Bundle bundle, boolean z5, boolean z6, boolean z7) {
        this.f10702w = str;
        this.f10703x = str2;
        this.f10704y = j6;
        this.f10705z = bundle;
        this.f10697A = z5;
        this.f10698B = z6;
        this.f10699C = z7;
        this.f10701E = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10701E.E(this.f10702w, this.f10703x, this.f10704y, this.f10705z, this.f10697A, this.f10698B, this.f10699C, this.f10700D);
    }
}
