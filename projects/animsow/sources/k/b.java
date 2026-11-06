package K;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1472a;

    public /* synthetic */ b(int i6) {
        this.f1472a = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r5 < r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r8 < r9) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return 1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.f1472a
            r1 = 0
            switch(r0) {
                case 0: goto L99;
                case 1: goto L88;
                case 2: goto L77;
                case 3: goto L64;
                case 4: goto L47;
                case 5: goto Lf;
                default: goto L6;
            }
        L6:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            int r8 = r8.compareTo(r9)
            return r8
        Lf:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            K.b r0 = V4.C0176g.f3840b
            int r0 = r8.length()
            int r2 = r9.length()
            int r0 = java.lang.Math.min(r0, r2)
            r2 = 4
        L22:
            r3 = 1
            r4 = -1
            if (r2 >= r0) goto L39
            char r5 = r8.charAt(r2)
            char r6 = r9.charAt(r2)
            if (r5 == r6) goto L36
            if (r5 >= r6) goto L34
        L32:
            r1 = r4
            goto L46
        L34:
            r1 = r3
            goto L46
        L36:
            int r2 = r2 + 1
            goto L22
        L39:
            int r8 = r8.length()
            int r9 = r9.length()
            if (r8 == r9) goto L46
            if (r8 >= r9) goto L34
            goto L32
        L46:
            return r1
        L47:
            java.io.File r8 = (java.io.File) r8
            java.io.File r9 = (java.io.File) r9
            java.nio.charset.Charset r0 = p3.C1249a.f12307e
            java.lang.String r8 = r8.getName()
            int r0 = p3.C1249a.f12308f
            java.lang.String r8 = r8.substring(r1, r0)
            java.lang.String r9 = r9.getName()
            java.lang.String r9 = r9.substring(r1, r0)
            int r8 = r8.compareTo(r9)
            return r8
        L64:
            java.io.File r8 = (java.io.File) r8
            java.io.File r9 = (java.io.File) r9
            java.nio.charset.Charset r0 = p3.C1249a.f12307e
            java.lang.String r9 = r9.getName()
            java.lang.String r8 = r8.getName()
            int r8 = r9.compareTo(r8)
            return r8
        L77:
            m3.s0 r8 = (m3.s0) r8
            m3.s0 r9 = (m3.s0) r9
            m3.G r8 = (m3.G) r8
            java.lang.String r8 = r8.f11337a
            m3.G r9 = (m3.G) r9
            java.lang.String r9 = r9.f11337a
            int r8 = r8.compareTo(r9)
            return r8
        L88:
            java.io.File r8 = (java.io.File) r8
            java.io.File r9 = (java.io.File) r9
            long r0 = r9.lastModified()
            long r8 = r8.lastModified()
            int r8 = java.lang.Long.compare(r0, r8)
            return r8
        L99:
            byte[] r8 = (byte[]) r8
            byte[] r9 = (byte[]) r9
            int r0 = r8.length
            int r2 = r9.length
            if (r0 == r2) goto La6
            int r8 = r8.length
            int r9 = r9.length
            int r1 = r8 - r9
            goto Lb6
        La6:
            r0 = r1
        La7:
            int r2 = r8.length
            if (r0 >= r2) goto Lb6
            r2 = r8[r0]
            r3 = r9[r0]
            if (r2 == r3) goto Lb3
            int r1 = r2 - r3
            goto Lb6
        Lb3:
            int r0 = r0 + 1
            goto La7
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K.b.compare(java.lang.Object, java.lang.Object):int");
    }
}
