package m0;

import P2.e;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: m0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1001b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f10433a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10434b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f10435c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f10436d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }
}
