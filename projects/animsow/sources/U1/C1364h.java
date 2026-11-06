package u1;

import T1.m;
import T1.n;
import T1.o;
import T1.p;
import X1.N;
import X1.O;
import X1.P;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: u1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1364h implements Handler.Callback {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12844x;

    public /* synthetic */ C1364h(int i6, Object obj) {
        this.f12843w = i6;
        this.f12844x = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.f12843w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int i6 = message.what;
                Object obj = this.f12844x;
                if (i6 == 1) {
                    ((C1365i) obj).b((C1362f) message.obj);
                    return true;
                }
                if (i6 == 2) {
                    ((C1365i) obj).f12848d.n((C1362f) message.obj);
                }
                return false;
            case 1:
                int i7 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i7);
                }
                m mVar = (m) this.f12844x;
                synchronized (mVar) {
                    try {
                        o oVar = (o) mVar.f3434A.get(i7);
                        if (oVar != null) {
                            mVar.f3434A.remove(i7);
                            mVar.c();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                n nVar = (n) oVar;
                                switch (nVar.f3440e) {
                                    case com.bumptech.glide.d.f6312l /* 0 */:
                                        if (!data.getBoolean("ack", false)) {
                                            nVar.a(new p("Invalid response to one way request", null));
                                        } else {
                                            nVar.b(null);
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        nVar.b(bundle);
                                        break;
                                }
                            } else {
                                oVar.a(new p("Not supported by GmsCore", null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i7);
                        }
                    } finally {
                    }
                }
                return true;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                int i8 = message.what;
                if (i8 == 0) {
                    synchronized (((P) this.f12844x).f4550a) {
                        try {
                            N n5 = (N) message.obj;
                            O o3 = (O) ((P) this.f12844x).f4550a.get(n5);
                            if (o3 != null && o3.f4543w.isEmpty()) {
                                if (o3.f4545y) {
                                    o3.f4542C.f4552c.removeMessages(1, o3.f4540A);
                                    P p5 = o3.f4542C;
                                    p5.f4553d.c(p5.f4551b, o3);
                                    o3.f4545y = false;
                                    o3.f4544x = 2;
                                }
                                ((P) this.f12844x).f4550a.remove(n5);
                            }
                        } finally {
                        }
                        break;
                    }
                    return true;
                }
                if (i8 != 1) {
                    return false;
                }
                synchronized (((P) this.f12844x).f4550a) {
                    try {
                        N n6 = (N) message.obj;
                        O o5 = (O) ((P) this.f12844x).f4550a.get(n6);
                        if (o5 != null && o5.f4544x == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(n6)), new Exception());
                            ComponentName componentName2 = o5.f4541B;
                            if (componentName2 == null) {
                                n6.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = n6.f4538b;
                                AbstractC1332d.m(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            o5.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                    break;
                }
                return true;
            default:
                if (message.what != 0) {
                    return false;
                }
                R2.n nVar2 = (R2.n) this.f12844x;
                R2.m mVar2 = (R2.m) message.obj;
                synchronized (nVar2.f2997a) {
                    try {
                        if (nVar2.f2999c == mVar2 || nVar2.f3000d == mVar2) {
                            nVar2.a(mVar2, 2);
                        }
                    } finally {
                    }
                    break;
                }
                return true;
        }
    }

    public /* synthetic */ C1364h(P p5) {
        this.f12843w = 2;
        this.f12844x = p5;
    }
}
