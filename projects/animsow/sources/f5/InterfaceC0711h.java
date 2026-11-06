package f5;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: f5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0711h extends C, WritableByteChannel {
    InterfaceC0711h B(long j6);

    InterfaceC0711h F(int i6);

    InterfaceC0711h e(byte[] bArr);

    InterfaceC0711h f(byte[] bArr, int i6, int i7);

    @Override // f5.C, java.io.Flushable
    void flush();

    InterfaceC0711h i(long j6);

    C0710g j();

    InterfaceC0711h r(int i6);

    InterfaceC0711h t(j jVar);

    InterfaceC0711h w(int i6);

    InterfaceC0711h z(String str);
}
