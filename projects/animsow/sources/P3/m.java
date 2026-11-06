package P3;

import M4.B;
import N3.AbstractC0135v;
import N3.C0116b;
import N3.I;
import android.content.Context;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f2549c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z.c f2550d = B.i(AbstractC0135v.f2276b, new X.a(j.f2543x), 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f2551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2552b;

    public m(Y2.g gVar, InterfaceC1432j interfaceC1432j, InterfaceC1432j interfaceC1432j2, E3.d dVar) {
        gVar.a();
        Context context = gVar.f4816a;
        AbstractC1305a.n(context, "firebaseApp.applicationContext");
        I i6 = I.f2143a;
        C0116b c0116bA = I.a(gVar);
        b bVar = new b(context);
        h hVar = new h(c0116bA, interfaceC1432j);
        f2549c.getClass();
        f fVar = new f(interfaceC1432j2, dVar, c0116bA, hVar, f2550d.a(context, k.f2544a[0]));
        this.f2551a = bVar;
        this.f2552b = fVar;
    }

    public final double a() {
        Double d6 = this.f2551a.d();
        if (d6 != null) {
            double dDoubleValue = d6.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d7 = this.f2552b.d();
        if (d7 != null) {
            double dDoubleValue2 = d7.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(v4.InterfaceC1427e r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof P3.l
            if (r0 == 0) goto L13
            r0 = r6
            P3.l r0 = (P3.l) r0
            int r1 = r0.f2547C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2547C = r1
            goto L18
        L13:
            P3.l r0 = new P3.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2545A
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2547C
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            S3.a.O(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            P3.m r2 = r0.f2548z
            S3.a.O(r6)
            goto L49
        L38:
            S3.a.O(r6)
            r0.f2548z = r5
            r0.f2547C = r4
            P3.r r6 = r5.f2551a
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            P3.r r6 = r2.f2552b
            r2 = 0
            r0.f2548z = r2
            r0.f2547C = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            s4.l r6 = s4.C1316l.f12640a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.m.b(v4.e):java.lang.Object");
    }
}
