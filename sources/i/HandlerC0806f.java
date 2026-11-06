package i;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;

/* JADX INFO: renamed from: i.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0806f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9293a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9294b;

    public HandlerC0806f(DialogInterface dialogInterface) {
        this.f9294b = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string;
        switch (this.f9293a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int i6 = message.what;
                if (i6 == -3 || i6 == -2 || i6 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f9294b).get(), message.what);
                    break;
                } else if (i6 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                AbstractC1305a.o(message, "msg");
                if (message.what != 3) {
                    Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
                    super.handleMessage(message);
                } else {
                    Bundle data = message.getData();
                    if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                        string = "";
                    }
                    Log.d("SessionLifecycleClient", "Session update received: ".concat(string));
                    S3.a.B(S3.a.c((InterfaceC1432j) this.f9294b), null, null, new N3.Q(string, null), 3);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0806f(InterfaceC1432j interfaceC1432j) {
        super(Looper.getMainLooper());
        AbstractC1305a.o(interfaceC1432j, "backgroundDispatcher");
        this.f9294b = interfaceC1432j;
    }
}
