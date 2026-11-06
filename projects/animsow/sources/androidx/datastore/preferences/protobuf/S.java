package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f5407b = new P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f5408a;

    public S() {
        Y y5;
        Y[] yArr = new Y[2];
        yArr[0] = C0300z.f5536a;
        try {
            y5 = (Y) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            y5 = f5407b;
        }
        yArr[1] = y5;
        Q q5 = new Q();
        q5.f5406a = yArr;
        Charset charset = F.f5369a;
        this.f5408a = q5;
    }
}
