package b5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class D extends IOException {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EnumC0346b f5947w;

    public D(EnumC0346b enumC0346b) {
        super("stream was reset: " + enumC0346b);
        this.f5947w = enumC0346b;
    }
}
