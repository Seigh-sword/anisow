package j3;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: j3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0862l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0863m f9484b;

    public CallableC0862l(C0863m c0863m, long j6) {
        this.f9484b = c0863m;
        this.f9483a = j6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f9483a);
        this.f9484b.f9496k.f(bundle);
        return null;
    }
}
