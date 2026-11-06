package O3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2336a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f2337b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f2337b;
        AbstractC1305a.n(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3 A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #0 {all -> 0x00cc, blocks: (B:22:0x009c, B:25:0x00b3, B:26:0x00cb), top: B:31:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009a -> B:21:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(v4.InterfaceC1427e r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.c.b(v4.e):java.lang.Object");
    }
}
