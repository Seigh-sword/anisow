package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import w0.m;
import w0.n;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5783w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f5784x = new HashMap();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f5785y = new m(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final n f5786z = new n(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f5786z;
    }
}
