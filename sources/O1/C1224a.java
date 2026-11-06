package o1;

import I0.e;
import I0.p;
import Z.j;
import a3.C0261b;
import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import com.onesignal.AbstractC0571l1;
import com.onesignal.AbstractC0603w1;
import com.onesignal.C;
import com.onesignal.C0546d0;
import com.onesignal.C0548e;
import com.onesignal.C0584q;
import com.onesignal.C0594t1;
import com.onesignal.OSFocusHandler$OnLostFocusWorker;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import l1.ThreadFactoryC0927a;
import s4.AbstractC1305a;
import t4.k;

/* JADX INFO: renamed from: o1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1224a extends Thread {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12173x;

    public /* synthetic */ C1224a(int i6, Object obj) {
        this.f12172w = i6;
        this.f12173x = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        StringBuilder sb;
        int i6 = this.f12172w;
        Object obj = this.f12173x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                Map map = (Map) obj;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(string);
                            Log.w("HttpUrlPinger", sb2.toString());
                            break;
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    String message = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                    sb.append("Error while pinging URL: ");
                    sb.append(string);
                    sb.append(". ");
                    sb.append(message);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    String message2 = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb.append("Error while parsing ping URL: ");
                    sb.append(string);
                    sb.append(". ");
                    sb.append(message2);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } catch (RuntimeException e8) {
                    e = e8;
                    String message3 = e.getMessage();
                    sb = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
                    sb.append("Error while pinging URL: ");
                    sb.append(string);
                    sb.append(". ");
                    sb.append(message3);
                    Log.w("HttpUrlPinger", sb.toString(), e);
                    return;
                } finally {
                }
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                C0584q c0584qP = AbstractC0603w1.p();
                Long lI = c0584qP.i();
                C0594t1 c0594t1 = (C0594t1) c0584qP.f7950y;
                String str2 = "Application stopped focus time: " + ((Long) c0584qP.f7948w) + " timeElapsed: " + lI;
                c0594t1.getClass();
                C0594t1.d(str2);
                if (lI != null) {
                    Collection collectionValues = ((ConcurrentHashMap) ((C0261b) AbstractC0603w1.f8002C.f7948w).f5011x).values();
                    AbstractC1305a.n(collectionValues, "trackers.values");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : collectionValues) {
                        if (!AbstractC1305a.c(((Z3.a) obj2).d(), Y3.a.f4838a)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(k.W(arrayList));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((Z3.a) it.next()).c());
                    }
                    ((C) c0584qP.f7949x).b(arrayList2).f(lI.longValue(), arrayList2);
                }
                C0546d0 c0546d0 = ((C0548e) obj).f7788a;
                Context context = AbstractC0603w1.f8028b;
                c0546d0.getClass();
                AbstractC1305a.o(context, "context");
                e eVar = new e();
                I0.c cVar = new I0.c();
                cVar.f1086a = 1;
                cVar.f1091f = -1L;
                cVar.f1092g = -1L;
                new HashSet();
                cVar.f1087b = false;
                cVar.f1088c = false;
                cVar.f1086a = 2;
                cVar.f1089d = false;
                cVar.f1090e = false;
                cVar.f1093h = eVar;
                cVar.f1091f = -1L;
                cVar.f1092g = -1L;
                p pVar = new p(OSFocusHandler$OnLostFocusWorker.class);
                pVar.f1113b.f2909j = cVar;
                p pVarB = pVar.b(2000L, TimeUnit.MILLISECONDS);
                pVarB.f1114c.add("FOCUS_LOST_WORKER_TAG");
                AbstractC0571l1.q(context).I("FOCUS_LOST_WORKER_TAG", Collections.singletonList(pVarB.a()));
                return;
            default:
                ((C4.a) obj).b();
                return;
        }
    }

    public C1224a(HashMap map) {
        this.f12172w = 1;
        this.f12173x = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1224a(ThreadFactoryC0927a threadFactoryC0927a, Runnable runnable) {
        super(runnable);
        this.f12172w = 0;
        this.f12173x = threadFactoryC0927a;
    }
}
