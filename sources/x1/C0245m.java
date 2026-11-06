package X1;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.security.MessageDigest;
import o0.z1;
import p3.C1251c;

/* JADX INFO: renamed from: X1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0245m implements A3.a, d3.e, j1.k, z1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static C0245m f4630w;

    public static synchronized C0245m b() {
        try {
            if (f4630w == null) {
                f4630w = new C0245m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4630w;
    }

    @Override // d3.e
    public Object f(C1251c c1251c) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c1251c);
    }

    @Override // j1.k
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
