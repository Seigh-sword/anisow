package t0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: t0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1337i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12712d;

    public C1337i(int i6, int i7, long j6, long j7) {
        this.f12709a = i6;
        this.f12710b = i7;
        this.f12711c = j6;
        this.f12712d = j7;
    }

    public static C1337i a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1337i c1337i = new C1337i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1337i;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f12709a);
            dataOutputStream.writeInt(this.f12710b);
            dataOutputStream.writeLong(this.f12711c);
            dataOutputStream.writeLong(this.f12712d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1337i)) {
            return false;
        }
        C1337i c1337i = (C1337i) obj;
        return this.f12710b == c1337i.f12710b && this.f12711c == c1337i.f12711c && this.f12709a == c1337i.f12709a && this.f12712d == c1337i.f12712d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12710b), Long.valueOf(this.f12711c), Integer.valueOf(this.f12709a), Long.valueOf(this.f12712d));
    }
}
