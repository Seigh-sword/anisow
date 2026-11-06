package j3;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: j3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0855e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f9462b = AbstractC0857g.h(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f9463c = new AtomicLong(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9464a;

    public C0855e() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b6 = bArrArray[0];
        byte b7 = bArrArray[1];
        byte b8 = bArrArray[2];
        byte b9 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b10 = bArrA[0];
        byte b11 = bArrA[1];
        byte[] bArrA2 = a(f9463c.incrementAndGet());
        byte b12 = bArrA2[0];
        byte b13 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        String strE = AbstractC0857g.e(new byte[]{b6, b7, b8, b9, b10, b11, b12, b13, bArrA3[0], bArrA3[1]});
        Locale locale = Locale.US;
        this.f9464a = String.format(locale, "%s%s%s%s", strE.substring(0, 12), strE.substring(12, 16), strE.subSequence(16, 20), f9462b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j6) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j6);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f9464a;
    }
}
