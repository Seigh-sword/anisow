package N3;

import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;
import w0.ServiceConnectionC1456k;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1432j f2183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Messenger f2184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingDeque f2185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ServiceConnectionC1456k f2186d;

    public T(InterfaceC1432j interfaceC1432j) {
        AbstractC1305a.o(interfaceC1432j, "backgroundDispatcher");
        this.f2183a = interfaceC1432j;
        this.f2185c = new LinkedBlockingDeque(20);
        this.f2186d = new ServiceConnectionC1456k(1, this);
    }

    public static final Message a(T t5, List list, int i6) {
        Object obj;
        t5.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i6) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public final void b(Message message) {
        String str;
        LinkedBlockingDeque linkedBlockingDeque = this.f2185c;
        if (linkedBlockingDeque.offer(message)) {
            str = "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size();
        } else {
            str = "Failed to enqueue message " + message.what + ". Dropping.";
        }
        Log.d("SessionLifecycleClient", str);
    }

    public final void c(int i6) {
        ArrayList arrayList = new ArrayList();
        this.f2185c.drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i6, 0, 0);
        AbstractC1305a.n(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        S3.a.B(S3.a.c(this.f2183a), null, null, new S(this, arrayList, null), 3);
    }
}
