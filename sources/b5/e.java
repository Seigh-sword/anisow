package b5;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import f5.C0710g;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0710g f5973a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5975c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5974b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0347c[] f5977e = new C0347c[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5978f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5979g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5980h = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5976d = 4096;

    public e(C0710g c0710g) {
        this.f5973a = c0710g;
    }

    public final void a(int i6) {
        int i7;
        if (i6 > 0) {
            int length = this.f5977e.length - 1;
            int i8 = 0;
            while (true) {
                i7 = this.f5978f;
                if (length < i7 || i6 <= 0) {
                    break;
                }
                int i9 = this.f5977e[length].f5964c;
                i6 -= i9;
                this.f5980h -= i9;
                this.f5979g--;
                i8++;
                length--;
            }
            C0347c[] c0347cArr = this.f5977e;
            int i10 = i7 + 1;
            System.arraycopy(c0347cArr, i10, c0347cArr, i10 + i8, this.f5979g);
            C0347c[] c0347cArr2 = this.f5977e;
            int i11 = this.f5978f + 1;
            Arrays.fill(c0347cArr2, i11, i11 + i8, (Object) null);
            this.f5978f += i8;
        }
    }

    public final void b(C0347c c0347c) {
        int i6 = this.f5976d;
        int i7 = c0347c.f5964c;
        if (i7 > i6) {
            Arrays.fill(this.f5977e, (Object) null);
            this.f5978f = this.f5977e.length - 1;
            this.f5979g = 0;
            this.f5980h = 0;
            return;
        }
        a((this.f5980h + i7) - i6);
        int i8 = this.f5979g + 1;
        C0347c[] c0347cArr = this.f5977e;
        if (i8 > c0347cArr.length) {
            C0347c[] c0347cArr2 = new C0347c[c0347cArr.length * 2];
            System.arraycopy(c0347cArr, 0, c0347cArr2, c0347cArr.length, c0347cArr.length);
            this.f5978f = this.f5977e.length - 1;
            this.f5977e = c0347cArr2;
        }
        int i9 = this.f5978f;
        this.f5978f = i9 - 1;
        this.f5977e[i9] = c0347c;
        this.f5979g++;
        this.f5980h += i7;
    }

    public final void c(f5.j jVar) throws EOFException {
        B.f5944d.getClass();
        long j6 = 0;
        long j7 = 0;
        for (int i6 = 0; i6 < jVar.d(); i6++) {
            j7 += (long) B.f5943c[jVar.i(i6) & 255];
        }
        int i7 = (int) ((j7 + 7) >> 3);
        int iD = jVar.d();
        C0710g c0710g = this.f5973a;
        if (i7 < iD) {
            C0710g c0710g2 = new C0710g();
            B.f5944d.getClass();
            int i8 = 0;
            for (int i9 = 0; i9 < jVar.d(); i9++) {
                int i10 = jVar.i(i9) & 255;
                int i11 = B.f5942b[i10];
                byte b6 = B.f5943c[i10];
                j6 = (j6 << b6) | ((long) i11);
                i8 += b6;
                while (i8 >= 8) {
                    i8 -= 8;
                    c0710g2.X((int) (j6 >> i8));
                }
            }
            if (i8 > 0) {
                c0710g2.X((int) ((j6 << (8 - i8)) | ((long) (255 >>> i8))));
            }
            jVar = c0710g2.m(c0710g2.f8461x);
            e(jVar.d(), ModuleDescriptor.MODULE_VERSION, 128);
        } else {
            e(jVar.d(), ModuleDescriptor.MODULE_VERSION, 0);
        }
        c0710g.U(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.e.d(java.util.ArrayList):void");
    }

    public final void e(int i6, int i7, int i8) {
        C0710g c0710g = this.f5973a;
        if (i6 < i7) {
            c0710g.X(i6 | i8);
            return;
        }
        c0710g.X(i8 | i7);
        int i9 = i6 - i7;
        while (i9 >= 128) {
            c0710g.X(128 | (i9 & ModuleDescriptor.MODULE_VERSION));
            i9 >>>= 7;
        }
        c0710g.X(i9);
    }
}
