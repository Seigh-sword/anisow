package c0;

import d0.C0646a;
import d0.C0647b;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f6102d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0.h f6104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f6105c = 0;

    public E(P0.h hVar, int i6) {
        this.f6104b = hVar;
        this.f6103a = i6;
    }

    public final int a(int i6) {
        C0646a c0646aC = c();
        int iA = c0646aC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c0646aC.f8160b;
        int i7 = iA + c0646aC.f8159a;
        return byteBuffer.getInt((i6 * 4) + byteBuffer.getInt(i7) + i7 + 4);
    }

    public final int b() {
        C0646a c0646aC = c();
        int iA = c0646aC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i6 = iA + c0646aC.f8159a;
        return c0646aC.f8160b.getInt(c0646aC.f8160b.getInt(i6) + i6);
    }

    public final C0646a c() {
        short s5;
        ThreadLocal threadLocal = f6102d;
        C0646a c0646a = (C0646a) threadLocal.get();
        if (c0646a == null) {
            c0646a = new C0646a();
            threadLocal.set(c0646a);
        }
        C0647b c0647b = (C0647b) this.f6104b.f2407a;
        int iA = c0647b.a(6);
        if (iA != 0) {
            int i6 = iA + c0647b.f8159a;
            int i7 = (this.f6103a * 4) + c0647b.f8160b.getInt(i6) + i6 + 4;
            int i8 = c0647b.f8160b.getInt(i7) + i7;
            ByteBuffer byteBuffer = c0647b.f8160b;
            c0646a.f8160b = byteBuffer;
            if (byteBuffer != null) {
                c0646a.f8159a = i8;
                int i9 = i8 - byteBuffer.getInt(i8);
                c0646a.f8161c = i9;
                s5 = c0646a.f8160b.getShort(i9);
            } else {
                s5 = 0;
                c0646a.f8159a = 0;
                c0646a.f8161c = 0;
            }
            c0646a.f8162d = s5;
        }
        return c0646a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0646a c0646aC = c();
        int iA = c0646aC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? c0646aC.f8160b.getInt(iA + c0646aC.f8159a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i6 = 0; i6 < iB; i6++) {
            sb.append(Integer.toHexString(a(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
