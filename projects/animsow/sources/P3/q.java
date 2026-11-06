package P3;

import W.InterfaceC0191j;
import a0.C0254b;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0.f f2563c = new a0.f("firebase_sessions_enabled");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0.f f2564d = new a0.f("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0.f f2565e = new a0.f("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0.f f2566f = new a0.f("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0.f f2567g = new a0.f("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0191j f2568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f2569b;

    public q(InterfaceC0191j interfaceC0191j) throws Throwable {
        AbstractC1305a.o(interfaceC0191j, "dataStore");
        this.f2568a = interfaceC0191j;
        S3.a.J(new n(this, null));
    }

    public static final void a(q qVar, C0254b c0254b) {
        qVar.getClass();
        qVar.f2569b = new i((Boolean) c0254b.b(f2563c), (Double) c0254b.b(f2564d), (Integer) c0254b.b(f2565e), (Integer) c0254b.b(f2566f), (Long) c0254b.b(f2567g));
    }

    public final boolean b() {
        Integer num;
        i iVar = this.f2569b;
        if (iVar == null) {
            AbstractC1305a.W("sessionConfigs");
            throw null;
        }
        if (iVar != null) {
            Long l5 = iVar.f2542e;
            return l5 == null || (num = iVar.f2541d) == null || (System.currentTimeMillis() - l5.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        AbstractC1305a.W("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(a0.f r6, java.lang.Object r7, v4.InterfaceC1427e r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof P3.o
            if (r0 == 0) goto L13
            r0 = r8
            P3.o r0 = (P3.o) r0
            int r1 = r0.f2557B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2557B = r1
            goto L18
        L13:
            P3.o r0 = new P3.o
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f2558z
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2557B
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            S3.a.O(r8)     // Catch: java.io.IOException -> L27
            goto L5d
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            S3.a.O(r8)
            W.j r8 = r5.f2568a     // Catch: java.io.IOException -> L27
            P3.p r2 = new P3.p     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r6, r5, r7, r4)     // Catch: java.io.IOException -> L27
            r0.f2557B = r3     // Catch: java.io.IOException -> L27
            a0.i r6 = new a0.i     // Catch: java.io.IOException -> L27
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r8.a(r6, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L5d
            return r1
        L4a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            s4.l r6 = s4.C1316l.f12640a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.q.c(a0.f, java.lang.Object, v4.e):java.lang.Object");
    }
}
