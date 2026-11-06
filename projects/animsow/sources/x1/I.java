package X1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class I implements ServiceConnection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractC0238f f4527x;

    public I(AbstractC0238f abstractC0238f, int i6) {
        this.f4527x = abstractC0238f;
        this.f4526w = i6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i6;
        int i7;
        if (iBinder == null) {
            AbstractC0238f abstractC0238f = this.f4527x;
            synchronized (abstractC0238f.f4574l) {
                i6 = abstractC0238f.f4581s;
            }
            if (i6 == 3) {
                abstractC0238f.f4588z = true;
                i7 = 5;
            } else {
                i7 = 4;
            }
            G g4 = abstractC0238f.f4573k;
            g4.sendMessage(g4.obtainMessage(i7, abstractC0238f.f4562B.get(), 16));
            return;
        }
        synchronized (this.f4527x.f4575m) {
            try {
                AbstractC0238f abstractC0238f2 = this.f4527x;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0238f2.f4576n = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof B)) ? new B(iBinder) : (B) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0238f abstractC0238f3 = this.f4527x;
        int i8 = this.f4526w;
        abstractC0238f3.getClass();
        K k5 = new K(abstractC0238f3, 0);
        G g6 = abstractC0238f3.f4573k;
        g6.sendMessage(g6.obtainMessage(7, i8, -1, k5));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0238f abstractC0238f;
        synchronized (this.f4527x.f4575m) {
            abstractC0238f = this.f4527x;
            abstractC0238f.f4576n = null;
        }
        int i6 = this.f4526w;
        G g4 = abstractC0238f.f4573k;
        g4.sendMessage(g4.obtainMessage(6, i6, 1));
    }
}
