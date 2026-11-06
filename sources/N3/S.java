package N3;

import M4.InterfaceC0080z;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import j3.C0860j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s4.C1316l;
import t4.C1350g;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class S extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2180A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ T f2181B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ List f2182C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t5, List list, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2181B = t5;
        this.f2182C = list;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((S) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new S(this.f2181B, this.f2182C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2180A;
        if (i6 == 0) {
            S3.a.O(obj);
            O3.c cVar = O3.c.f2336a;
            this.f2180A = 1;
            obj = cVar.b(this);
            if (obj == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection collectionValues = map.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            } else {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((C0860j) it.next()).f9475a.a()) {
                        T t5 = this.f2181B;
                        List list = this.f2182C;
                        for (Message message : t4.n.i0(t4.n.a0(new ArrayList(new C1350g(new Message[]{T.a(t5, list, 2), T.a(t5, list, 1)}, true))), new B.h(5))) {
                            if (t5.f2184b != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = t5.f2184b;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e6) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e6);
                                    t5.b(message);
                                }
                            }
                            t5.b(message);
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
        }
        return C1316l.f12640a;
    }
}
