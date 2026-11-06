package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class K2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f6615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6616b;

    static {
        Charset.forName("US-ASCII");
        f6615a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6616b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw Q2.b();
            }
            int i6 = (0 - 0) + length;
            if (i6 < 0) {
                throw Q2.c();
            }
            if (i6 > Integer.MAX_VALUE) {
                throw Q2.d();
            }
        } catch (Q2 e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static int a(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }
}
