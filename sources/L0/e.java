package L0;

import I0.o;
import R0.i;
import S0.k;
import S0.p;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements N0.b, J0.a, p {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f1684F = o.y("DelayMetCommandHandler");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final N0.c f1685A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PowerManager.WakeLock f1688D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f1690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f1692y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h f1693z;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f1689E = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f1687C = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f1686B = new Object();

    public e(Context context, int i6, String str, h hVar) {
        this.f1690w = context;
        this.f1691x = i6;
        this.f1693z = hVar;
        this.f1692y = str;
        this.f1685A = new N0.c(context, hVar.f1704x, this);
    }

    @Override // J0.a
    public final void a(String str, boolean z5) {
        o.w().u(f1684F, "onExecuted " + str + ", " + z5, new Throwable[0]);
        b();
        int i6 = this.f1691x;
        h hVar = this.f1693z;
        Context context = this.f1690w;
        if (z5) {
            hVar.e(new c.d(i6, hVar, b.c(context, this.f1692y)));
        }
        if (this.f1689E) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.e(new c.d(i6, hVar, intent));
        }
    }

    public final void b() {
        synchronized (this.f1686B) {
            try {
                this.f1685A.c();
                this.f1693z.f1705y.b(this.f1692y);
                PowerManager.WakeLock wakeLock = this.f1688D;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.w().u(f1684F, "Releasing wakelock " + this.f1688D + " for WorkSpec " + this.f1692y, new Throwable[0]);
                    this.f1688D.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N0.b
    public final void c(List list) {
        if (list.contains(this.f1692y)) {
            synchronized (this.f1686B) {
                try {
                    if (this.f1687C == 0) {
                        this.f1687C = 1;
                        o.w().u(f1684F, "onAllConstraintsMet for " + this.f1692y, new Throwable[0]);
                        if (this.f1693z.f1706z.g(this.f1692y, null)) {
                            this.f1693z.f1705y.a(this.f1692y, this);
                        } else {
                            b();
                        }
                    } else {
                        o.w().u(f1684F, "Already started work for " + this.f1692y, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // N0.b
    public final void d(ArrayList arrayList) {
        f();
    }

    public final void e() {
        StringBuilder sb = new StringBuilder();
        String str = this.f1692y;
        sb.append(str);
        sb.append(" (");
        this.f1688D = k.a(this.f1690w, AbstractC0628i.l(sb, this.f1691x, ")"));
        o oVarW = o.w();
        PowerManager.WakeLock wakeLock = this.f1688D;
        String str2 = f1684F;
        oVarW.u(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f1688D.acquire();
        i iVarK = this.f1693z.f1697A.f1208j.n().k(str);
        if (iVarK == null) {
            f();
            return;
        }
        boolean zB = iVarK.b();
        this.f1689E = zB;
        if (zB) {
            this.f1685A.b(Collections.singletonList(iVarK));
        } else {
            o.w().u(str2, AbstractC0628i.q("No constraints for ", str), new Throwable[0]);
            c(Collections.singletonList(str));
        }
    }

    public final void f() {
        synchronized (this.f1686B) {
            try {
                if (this.f1687C < 2) {
                    this.f1687C = 2;
                    o oVarW = o.w();
                    String str = f1684F;
                    oVarW.u(str, "Stopping work for WorkSpec " + this.f1692y, new Throwable[0]);
                    Context context = this.f1690w;
                    String str2 = this.f1692y;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    h hVar = this.f1693z;
                    hVar.e(new c.d(this.f1691x, hVar, intent));
                    if (this.f1693z.f1706z.d(this.f1692y)) {
                        o.w().u(str, "WorkSpec " + this.f1692y + " needs to be rescheduled", new Throwable[0]);
                        Intent intentC = b.c(this.f1690w, this.f1692y);
                        h hVar2 = this.f1693z;
                        hVar2.e(new c.d(this.f1691x, hVar2, intentC));
                    } else {
                        o.w().u(str, "Processor does not have WorkSpec " + this.f1692y + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    o.w().u(f1684F, "Already stopped work for " + this.f1692y, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
