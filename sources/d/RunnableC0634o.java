package d;

import android.content.Intent;
import android.content.IntentSender;
import f.C0677c;
import f.InterfaceC0676b;
import g.C0712a;
import s4.AbstractC1305a;
import t0.C1329a;
import t0.InterfaceC1331c;

/* JADX INFO: renamed from: d.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0634o implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f8117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8118z;

    public /* synthetic */ RunnableC0634o(int i6, int i7, Object obj, Object obj2) {
        this.f8115w = i7;
        this.f8116x = obj;
        this.f8117y = i6;
        this.f8118z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f8115w;
        Object obj = this.f8118z;
        int i7 = this.f8117y;
        Object obj2 = this.f8116x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0635p c0635p = (C0635p) obj2;
                AbstractC1305a.o(c0635p, "this$0");
                Object obj3 = ((C0712a) obj).f8507a;
                String str = (String) c0635p.f8308a.get(Integer.valueOf(i7));
                if (str != null) {
                    C0677c c0677c = (C0677c) c0635p.f8312e.get(str);
                    if ((c0677c != null ? c0677c.f8302a : null) != null) {
                        InterfaceC0676b interfaceC0676b = c0677c.f8302a;
                        AbstractC1305a.m(interfaceC0676b, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (c0635p.f8311d.remove(str)) {
                            interfaceC0676b.a(obj3);
                        }
                    } else {
                        c0635p.f8314g.remove(str);
                        c0635p.f8313f.put(str, obj3);
                    }
                    break;
                }
                break;
            case 1:
                C0635p c0635p2 = (C0635p) obj2;
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) obj;
                AbstractC1305a.o(c0635p2, "this$0");
                AbstractC1305a.o(sendIntentException, "$e");
                c0635p2.a(i7, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((C1329a) obj2).f12676b.m(i7, obj);
                break;
            default:
                ((InterfaceC1331c) obj2).m(i7, obj);
                break;
        }
    }
}
