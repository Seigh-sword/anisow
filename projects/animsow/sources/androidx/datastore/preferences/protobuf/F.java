package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f5369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f5370b;

    static {
        Charset.forName("US-ASCII");
        f5369a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5370b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0284k(bArr, 0, 0, false).e(0);
        } catch (H e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }
}
