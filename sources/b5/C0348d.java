package b5;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: b5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0348d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5.y f5966b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5965a = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0347c[] f5969e = new C0347c[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5970f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5971g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5972h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5967c = 4096;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5968d = 4096;

    public C0348d(u uVar) {
        this.f5966b = f2.h.d(uVar);
    }

    public final int a(int i6) {
        int i7;
        int i8 = 0;
        if (i6 > 0) {
            int length = this.f5969e.length;
            while (true) {
                length--;
                i7 = this.f5970f;
                if (length < i7 || i6 <= 0) {
                    break;
                }
                int i9 = this.f5969e[length].f5964c;
                i6 -= i9;
                this.f5972h -= i9;
                this.f5971g--;
                i8++;
            }
            C0347c[] c0347cArr = this.f5969e;
            System.arraycopy(c0347cArr, i7 + 1, c0347cArr, i7 + 1 + i8, this.f5971g);
            this.f5970f += i8;
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f5.j b(int r4) throws java.io.IOException {
        /*
            r3 = this;
            if (r4 < 0) goto Le
            b5.c[] r0 = b5.f.f5981a
            int r1 = r0.length
            int r1 = r1 + (-1)
            if (r4 > r1) goto Le
            r4 = r0[r4]
        Lb:
            f5.j r4 = r4.f5962a
            return r4
        Le:
            b5.c[] r0 = b5.f.f5981a
            int r0 = r0.length
            int r0 = r4 - r0
            int r1 = r3.f5970f
            int r1 = r1 + 1
            int r1 = r1 + r0
            if (r1 < 0) goto L22
            b5.c[] r0 = r3.f5969e
            int r2 = r0.length
            if (r1 >= r2) goto L22
            r4 = r0[r1]
            goto Lb
        L22:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Header index too large "
            r1.<init>(r2)
            int r4 = r4 + 1
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0348d.b(int):f5.j");
    }

    public final void c(C0347c c0347c) {
        this.f5965a.add(c0347c);
        int i6 = this.f5968d;
        int i7 = c0347c.f5964c;
        if (i7 > i6) {
            Arrays.fill(this.f5969e, (Object) null);
            this.f5970f = this.f5969e.length - 1;
            this.f5971g = 0;
            this.f5972h = 0;
            return;
        }
        a((this.f5972h + i7) - i6);
        int i8 = this.f5971g + 1;
        C0347c[] c0347cArr = this.f5969e;
        if (i8 > c0347cArr.length) {
            C0347c[] c0347cArr2 = new C0347c[c0347cArr.length * 2];
            System.arraycopy(c0347cArr, 0, c0347cArr2, c0347cArr.length, c0347cArr.length);
            this.f5970f = this.f5969e.length - 1;
            this.f5969e = c0347cArr2;
        }
        int i9 = this.f5970f;
        this.f5970f = i9 - 1;
        this.f5969e[i9] = c0347c;
        this.f5971g++;
        this.f5972h += i7;
    }

    public final f5.j d() {
        f5.y yVar = this.f5966b;
        byte b6 = yVar.readByte();
        int i6 = b6 & 255;
        boolean z5 = (b6 & 128) == 128;
        int iE = e(i6, ModuleDescriptor.MODULE_VERSION);
        if (!z5) {
            return yVar.m(iE);
        }
        B b7 = B.f5944d;
        long j6 = iE;
        yVar.y(j6);
        byte[] bArrO = yVar.f8498x.O(j6);
        b7.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e0.b bVar = b7.f5945a;
        e0.b bVar2 = bVar;
        int i7 = 0;
        int i8 = 0;
        for (byte b8 : bArrO) {
            i7 = (i7 << 8) | (b8 & 255);
            i8 += 8;
            while (i8 >= 8) {
                bVar2 = ((e0.b[]) bVar2.f8233c)[(i7 >>> (i8 - 8)) & 255];
                if (((e0.b[]) bVar2.f8233c) == null) {
                    byteArrayOutputStream.write(bVar2.f8231a);
                    i8 -= bVar2.f8232b;
                    bVar2 = bVar;
                } else {
                    i8 -= 8;
                }
            }
        }
        while (i8 > 0) {
            e0.b bVar3 = ((e0.b[]) bVar2.f8233c)[(i7 << (8 - i8)) & 255];
            if (((e0.b[]) bVar3.f8233c) != null || bVar3.f8232b > i8) {
                break;
            }
            byteArrayOutputStream.write(bVar3.f8231a);
            i8 -= bVar3.f8232b;
            bVar2 = bVar;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        f5.j jVar = f5.j.f8462z;
        AbstractC1305a.o(byteArray, "data");
        byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
        AbstractC1305a.n(bArrCopyOf, "copyOf(this, size)");
        return new f5.j(bArrCopyOf);
    }

    public final int e(int i6, int i7) {
        int i8 = i6 & i7;
        if (i8 < i7) {
            return i8;
        }
        int i9 = 0;
        while (true) {
            byte b6 = this.f5966b.readByte();
            int i10 = b6 & 255;
            if ((b6 & 128) == 0) {
                return i7 + (i10 << i9);
            }
            i7 += (b6 & 127) << i9;
            i9 += 7;
        }
    }
}
