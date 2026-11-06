package n1;

import java.security.MessageDigest;

/* JADX INFO: renamed from: n1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1152h implements D1.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final MessageDigest f11696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final D1.e f11697x = new D1.e();

    public C1152h(MessageDigest messageDigest) {
        this.f11696w = messageDigest;
    }

    @Override // D1.b
    public final D1.e e() {
        return this.f11697x;
    }
}
