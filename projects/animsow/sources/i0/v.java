package I0;

import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f1112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public R0.i f1113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet f1114c;

    public final q a() {
        p pVar = (p) this;
        UUID uuid = pVar.f1112a;
        R0.i iVar = pVar.f1113b;
        HashSet hashSet = pVar.f1114c;
        q qVar = new q();
        qVar.f1115a = uuid;
        qVar.f1116b = iVar;
        qVar.f1117c = hashSet;
        c cVar = this.f1113b.f2909j;
        boolean z5 = cVar.f1093h.f1096a.size() > 0 || cVar.f1089d || cVar.f1087b || cVar.f1088c;
        R0.i iVar2 = this.f1113b;
        if (iVar2.f2916q) {
            if (z5) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (iVar2.f2906g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        this.f1112a = UUID.randomUUID();
        R0.i iVar3 = this.f1113b;
        R0.i iVar4 = new R0.i();
        iVar4.f2901b = 1;
        g gVar = g.f1099c;
        iVar4.f2904e = gVar;
        iVar4.f2905f = gVar;
        iVar4.f2909j = c.f1085i;
        iVar4.f2911l = 1;
        iVar4.f2912m = 30000L;
        iVar4.f2915p = -1L;
        iVar4.f2917r = 1;
        iVar4.f2900a = iVar3.f2900a;
        iVar4.f2902c = iVar3.f2902c;
        iVar4.f2901b = iVar3.f2901b;
        iVar4.f2903d = iVar3.f2903d;
        iVar4.f2904e = new g(iVar3.f2904e);
        iVar4.f2905f = new g(iVar3.f2905f);
        iVar4.f2906g = iVar3.f2906g;
        iVar4.f2907h = iVar3.f2907h;
        iVar4.f2908i = iVar3.f2908i;
        c cVar2 = iVar3.f2909j;
        c cVar3 = new c();
        cVar3.f1086a = 1;
        cVar3.f1091f = -1L;
        cVar3.f1092g = -1L;
        cVar3.f1093h = new e();
        cVar3.f1087b = cVar2.f1087b;
        cVar3.f1088c = cVar2.f1088c;
        cVar3.f1086a = cVar2.f1086a;
        cVar3.f1089d = cVar2.f1089d;
        cVar3.f1090e = cVar2.f1090e;
        cVar3.f1093h = cVar2.f1093h;
        iVar4.f2909j = cVar3;
        iVar4.f2910k = iVar3.f2910k;
        iVar4.f2911l = iVar3.f2911l;
        iVar4.f2912m = iVar3.f2912m;
        iVar4.f2913n = iVar3.f2913n;
        iVar4.f2914o = iVar3.f2914o;
        iVar4.f2915p = iVar3.f2915p;
        iVar4.f2916q = iVar3.f2916q;
        iVar4.f2917r = iVar3.f2917r;
        this.f1113b = iVar4;
        iVar4.f2900a = this.f1112a.toString();
        return qVar;
    }

    public final p b(long j6, TimeUnit timeUnit) {
        this.f1113b.f2906g = timeUnit.toMillis(j6);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.f1113b.f2906g) {
            return (p) this;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
}
