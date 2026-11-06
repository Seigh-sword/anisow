package w0;

import i.C0803c;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: w0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1452g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13498a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f13501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13503f;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, long[]] */
    public C1452g(int i6) {
        ?? r12 = new long[i6];
        this.f13501d = r12;
        boolean[] zArr = new boolean[i6];
        this.f13502e = zArr;
        this.f13503f = new int[i6];
        Arrays.fill((long[]) r12, 0L);
        Arrays.fill(zArr, false);
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (this.f13499b && !this.f13500c) {
                    int length = ((long[]) this.f13501d).length;
                    int i6 = 0;
                    while (true) {
                        int i7 = 1;
                        if (i6 >= length) {
                            this.f13500c = true;
                            this.f13499b = false;
                            return (int[]) this.f13503f;
                        }
                        boolean z5 = ((long[]) this.f13501d)[i6] > 0;
                        Object obj = this.f13502e;
                        if (z5 != ((boolean[]) obj)[i6]) {
                            int[] iArr = (int[]) this.f13503f;
                            if (!z5) {
                                i7 = 2;
                            }
                            iArr[i6] = i7;
                        } else {
                            ((int[]) this.f13503f)[i6] = 0;
                        }
                        ((boolean[]) obj)[i6] = z5;
                        i6++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r8 = this;
            int r0 = r8.f13498a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            boolean r0 = r8.f13499b
            boolean r1 = r8.f13500c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 32
            r2.<init>(r3)
            java.io.Serializable r3 = r8.f13501d
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            r3 = 123(0x7b, float:1.72E-43)
            r2.append(r3)
            java.lang.Object r3 = r8.f13502e
            i.c r3 = (i.C0803c) r3
            java.lang.Object r3 = r3.f9279z
            i.c r3 = (i.C0803c) r3
            java.lang.String r4 = ""
        L2b:
            if (r3 == 0) goto Lb7
            java.lang.Object r5 = r3.f9278y
            r6 = 1
            if (r5 != 0) goto L35
            if (r0 != 0) goto Lb1
            goto L7e
        L35:
            if (r1 == 0) goto L7e
            boolean r7 = r5 instanceof java.lang.CharSequence
            if (r7 == 0) goto L46
            r7 = r5
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L7e
            goto Lb1
        L46:
            boolean r7 = r5 instanceof java.util.Collection
            if (r7 == 0) goto L52
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            goto L6a
        L52:
            boolean r7 = r5 instanceof java.util.Map
            if (r7 == 0) goto L5e
            r7 = r5
            java.util.Map r7 = (java.util.Map) r7
            boolean r7 = r7.isEmpty()
            goto L6a
        L5e:
            boolean r7 = r5 instanceof V2.c
            if (r7 == 0) goto L6d
            r7 = r5
            V2.c r7 = (V2.c) r7
            boolean r7 = r7.b()
            r7 = r7 ^ r6
        L6a:
            if (r7 != 0) goto Lb1
            goto L7e
        L6d:
            java.lang.Class r7 = r5.getClass()
            boolean r7 = r7.isArray()
            if (r7 == 0) goto L7e
            int r7 = java.lang.reflect.Array.getLength(r5)
            if (r7 != 0) goto L7e
            goto Lb1
        L7e:
            r2.append(r4)
            java.lang.Object r4 = r3.f9277x
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L8f
            r2.append(r4)
            r4 = 61
            r2.append(r4)
        L8f:
            if (r5 == 0) goto Lac
            java.lang.Class r4 = r5.getClass()
            boolean r4 = r4.isArray()
            if (r4 == 0) goto Lac
            java.lang.Object[] r4 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.util.Arrays.deepToString(r4)
            int r5 = r4.length()
            int r5 = r5 - r6
            r2.append(r4, r6, r5)
            goto Laf
        Lac:
            r2.append(r5)
        Laf:
            java.lang.String r4 = ", "
        Lb1:
            java.lang.Object r3 = r3.f9279z
            i.c r3 = (i.C0803c) r3
            goto L2b
        Lb7:
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C1452g.toString():java.lang.String");
    }

    public C1452g(String str) {
        C0803c c0803c = new C0803c();
        this.f13502e = c0803c;
        this.f13503f = c0803c;
        this.f13499b = false;
        this.f13500c = false;
        this.f13501d = str;
    }

    public /* synthetic */ C1452g(String str, int i6) {
        this(str);
    }
}
