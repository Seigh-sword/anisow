package T1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.measurement.C0460n0;
import com.google.android.gms.internal.measurement.InterfaceC0394c0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f3426A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f3427B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3428w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f3429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3430y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f3431z;

    public k(C0460n0 c0460n0, boolean z5, Uri uri, String str, String str2) {
        this.f3429x = z5;
        this.f3430y = uri;
        this.f3431z = str;
        this.f3426A = str2;
        this.f3427B = c0460n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.k.run():void");
    }

    public k(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0394c0 interfaceC0394c0, String str, String str2, boolean z5) {
        this.f3430y = interfaceC0394c0;
        this.f3431z = str;
        this.f3426A = str2;
        this.f3429x = z5;
        this.f3427B = appMeasurementDynamiteService;
    }

    public /* synthetic */ k(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z5, BroadcastReceiver.PendingResult pendingResult) {
        this.f3430y = firebaseInstanceIdReceiver;
        this.f3431z = intent;
        this.f3426A = context;
        this.f3429x = z5;
        this.f3427B = pendingResult;
    }
}
