package w0;

import N3.S;
import N3.T;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.util.Log;
import d2.AbstractC0651b;
import java.util.ArrayList;

/* JADX INFO: renamed from: w0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1456k implements ServiceConnection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f13515x;

    public /* synthetic */ ServiceConnectionC1456k(int i6, Object obj) {
        this.f13514w = i6;
        this.f13515x = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i6 = this.f13514w;
        Object obj = this.f13515x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0651b abstractC0651b = (AbstractC0651b) obj;
                int i7 = n.f13517d;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1451f)) {
                        new C1450e().f13497c = iBinder;
                    }
                }
                abstractC0651b.getClass();
                abstractC0651b.getClass();
                abstractC0651b.getClass();
                throw null;
            default:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                T t5 = (T) obj;
                sb.append(t5.f2185c.size());
                Log.d("SessionLifecycleClient", sb.toString());
                t5.f2184b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                t5.f2185c.drainTo(arrayList);
                S3.a.B(S3.a.c(t5.f2183a), null, null, new S(t5, arrayList, null), 3);
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i6 = this.f13514w;
        Object obj = this.f13515x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0651b abstractC0651b = (AbstractC0651b) obj;
                abstractC0651b.getClass();
                abstractC0651b.getClass();
                throw null;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ((T) obj).f2184b = null;
                return;
        }
    }
}
