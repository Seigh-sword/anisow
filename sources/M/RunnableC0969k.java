package m;

import D.AbstractC0007h;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import o0.C1193k;

/* JADX INFO: renamed from: m.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0969k implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f10300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f10301y;

    public /* synthetic */ RunnableC0969k(Object obj, int i6, Object obj2) {
        this.f10299w = i6;
        this.f10301y = obj;
        this.f10300x = obj2;
    }

    private void a() {
        try {
            Method method = AbstractC0007h.f200d;
            if (method != null) {
                method.invoke(this.f10300x, this.f10301y, Boolean.FALSE, "AppCompat recreation");
            } else {
                AbstractC0007h.f201e.invoke(this.f10300x, this.f10301y, Boolean.FALSE);
            }
        } catch (RuntimeException e6) {
            if (e6.getClass() == RuntimeException.class && e6.getMessage() != null && e6.getMessage().startsWith("Unable to stop")) {
                throw e6;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 3220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.RunnableC0969k.run():void");
    }

    public /* synthetic */ RunnableC0969k(Object obj, Object obj2, int i6) {
        this.f10299w = i6;
        this.f10300x = obj;
        this.f10301y = obj2;
    }

    public RunnableC0969k(C1193k c1193k) {
        this.f10299w = 6;
        this.f10301y = c1193k;
        this.f10300x = new AtomicReference(null);
    }
}
