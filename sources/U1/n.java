package U1;

import X1.A;
import X1.T;
import android.os.RemoteException;
import android.util.Log;
import e2.InterfaceC0663a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends T {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3606d;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        AbstractC1332d.c(bArr.length == 25);
        this.f3606d = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // X1.A
    public final InterfaceC0663a c() {
        return new e2.b(s());
    }

    public final boolean equals(Object obj) {
        InterfaceC0663a interfaceC0663aC;
        if (obj != null && (obj instanceof A)) {
            try {
                A a6 = (A) obj;
                if (a6.f() == this.f3606d && (interfaceC0663aC = a6.c()) != null) {
                    return Arrays.equals(s(), (byte[]) e2.b.s(interfaceC0663aC));
                }
                return false;
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
            }
        }
        return false;
    }

    @Override // X1.A
    public final int f() {
        return this.f3606d;
    }

    public final int hashCode() {
        return this.f3606d;
    }

    public abstract byte[] s();
}
