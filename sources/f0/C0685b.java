package f0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: f0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0685b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final ByteOrder f8325A = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final ByteOrder f8326B = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DataInputStream f8327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ByteOrder f8328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8329y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte[] f8330z;

    public C0685b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f8327w.available();
    }

    public final void b(int i6) throws IOException {
        int i7 = 0;
        while (i7 < i6) {
            DataInputStream dataInputStream = this.f8327w;
            int i8 = i6 - i7;
            int iSkip = (int) dataInputStream.skip(i8);
            if (iSkip <= 0) {
                if (this.f8330z == null) {
                    this.f8330z = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f8330z, 0, Math.min(8192, i8));
                if (iSkip == -1) {
                    throw new EOFException(H1.a.j("Reached EOF while skipping ", i6, " bytes."));
                }
            }
            i7 += iSkip;
        }
        this.f8329y += i7;
    }

    @Override // java.io.InputStream
    public final void mark(int i6) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f8329y++;
        return this.f8327w.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f8329y++;
        return this.f8327w.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f8329y++;
        int i6 = this.f8327w.read();
        if (i6 >= 0) {
            return (byte) i6;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f8329y += 2;
        return this.f8327w.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f8329y += bArr.length;
        this.f8327w.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f8329y += 4;
        DataInputStream dataInputStream = this.f8327w;
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i6 | i7 | i8 | i9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f8328x;
        if (byteOrder == f8325A) {
            return (i9 << 24) + (i8 << 16) + (i7 << 8) + i6;
        }
        if (byteOrder == f8326B) {
            return (i6 << 24) + (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IOException("Invalid byte order: " + this.f8328x);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f8329y += 8;
        DataInputStream dataInputStream = this.f8327w;
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i6 | i7 | i8 | i9 | i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f8328x;
        if (byteOrder == f8325A) {
            return (((long) i13) << 56) + (((long) i12) << 48) + (((long) i11) << 40) + (((long) i10) << 32) + (((long) i9) << 24) + (((long) i8) << 16) + (((long) i7) << 8) + ((long) i6);
        }
        if (byteOrder == f8326B) {
            return (((long) i6) << 56) + (((long) i7) << 48) + (((long) i8) << 40) + (((long) i9) << 32) + (((long) i10) << 24) + (((long) i11) << 16) + (((long) i12) << 8) + ((long) i13);
        }
        throw new IOException("Invalid byte order: " + this.f8328x);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f8329y += 2;
        DataInputStream dataInputStream = this.f8327w;
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        if ((i6 | i7) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f8328x;
        if (byteOrder == f8325A) {
            return (short) ((i7 << 8) + i6);
        }
        if (byteOrder == f8326B) {
            return (short) ((i6 << 8) + i7);
        }
        throw new IOException("Invalid byte order: " + this.f8328x);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f8329y += 2;
        return this.f8327w.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f8329y++;
        return this.f8327w.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f8329y += 2;
        DataInputStream dataInputStream = this.f8327w;
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        if ((i6 | i7) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f8328x;
        if (byteOrder == f8325A) {
            return (i7 << 8) + i6;
        }
        if (byteOrder == f8326B) {
            return (i6 << 8) + i7;
        }
        throw new IOException("Invalid byte order: " + this.f8328x);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i6) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C0685b(InputStream inputStream, ByteOrder byteOrder) {
        this.f8328x = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f8327w = dataInputStream;
        dataInputStream.mark(0);
        this.f8329y = 0;
        this.f8328x = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = this.f8327w.read(bArr, i6, i7);
        this.f8329y += i8;
        return i8;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i6, int i7) throws IOException {
        this.f8329y += i7;
        this.f8327w.readFully(bArr, i6, i7);
    }

    public C0685b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }
}
