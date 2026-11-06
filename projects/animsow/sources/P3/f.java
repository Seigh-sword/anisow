package P3;

import N3.C0116b;
import W.InterfaceC0191j;
import androidx.lifecycle.V;
import java.util.regex.Pattern;
import s4.AbstractC1305a;
import s4.C1314j;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E3.d f2525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0116b f2526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1314j f2528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T4.d f2529e = T4.e.a();

    public f(InterfaceC1432j interfaceC1432j, E3.d dVar, C0116b c0116b, h hVar, InterfaceC0191j interfaceC0191j) {
        this.f2525a = dVar;
        this.f2526b = c0116b;
        this.f2527c = hVar;
        this.f2528d = new C1314j(new V(5, interfaceC0191j));
    }

    public static String f(String str) {
        Pattern patternCompile = Pattern.compile("/");
        AbstractC1305a.n(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC1305a.n(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @Override // P3.r
    public final L4.a a() {
        i iVar = e().f2569b;
        if (iVar == null) {
            AbstractC1305a.W("sessionConfigs");
            throw null;
        }
        Integer num = iVar.f2540c;
        if (num == null) {
            return null;
        }
        int i6 = L4.a.f1740z;
        return new L4.a(S3.a.P(num.intValue(), L4.c.SECONDS));
    }

    @Override // P3.r
    public final Boolean b() {
        i iVar = e().f2569b;
        if (iVar != null) {
            return iVar.f2538a;
        }
        AbstractC1305a.W("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:43:0x00a9, B:45:0x00b5, B:49:0x00c1, B:35:0x0083, B:37:0x008d, B:40:0x0098), top: B:60:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T4.a] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // P3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(v4.InterfaceC1427e r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.f.c(v4.e):java.lang.Object");
    }

    @Override // P3.r
    public final Double d() {
        i iVar = e().f2569b;
        if (iVar != null) {
            return iVar.f2539b;
        }
        AbstractC1305a.W("sessionConfigs");
        throw null;
    }

    public final q e() {
        return (q) this.f2528d.getValue();
    }
}
