package z;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f14017j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14026i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14017j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int[] r0 = z.r.f14057f
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r0)
            int r9 = r8.getIndexCount()
            r0 = 0
            r1 = r0
        Lc:
            if (r1 >= r9) goto La1
            int r2 = r8.getIndex(r1)
            android.util.SparseIntArray r3 = z.k.f14017j
            int r3 = r3.get(r2)
            r4 = 3
            switch(r3) {
                case 1: goto L95;
                case 2: goto L8c;
                case 3: goto L77;
                case 4: goto L73;
                case 5: goto L6a;
                case 6: goto L61;
                case 7: goto L58;
                case 8: goto L4f;
                case 9: goto L46;
                case 10: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L9d
        L1e:
            android.util.TypedValue r3 = r8.peekValue(r2)
            int r3 = r3.type
            r5 = 1
            r6 = -1
            if (r3 != r5) goto L29
            goto L39
        L29:
            if (r3 != r4) goto L40
            java.lang.String r3 = r8.getString(r2)
            r7.f14025h = r3
            java.lang.String r4 = "/"
            int r3 = r3.indexOf(r4)
            if (r3 <= 0) goto L9d
        L39:
            int r2 = r8.getResourceId(r2, r6)
            r7.f14026i = r2
            goto L9d
        L40:
            int r3 = r7.f14026i
            r8.getInteger(r2, r3)
            goto L9d
        L46:
            float r3 = r7.f14023f
            float r2 = r8.getFloat(r2, r3)
            r7.f14023f = r2
            goto L9d
        L4f:
            int r3 = r7.f14024g
            int r2 = r8.getInteger(r2, r3)
            r7.f14024g = r2
            goto L9d
        L58:
            float r3 = r7.f14021d
            float r2 = r8.getFloat(r2, r3)
            r7.f14021d = r2
            goto L9d
        L61:
            int r3 = r7.f14019b
            int r2 = r8.getInteger(r2, r3)
            r7.f14019b = r2
            goto L9d
        L6a:
            int r3 = r7.f14018a
            int r2 = z.n.f(r8, r2, r3)
            r7.f14018a = r2
            goto L9d
        L73:
            r8.getInt(r2, r0)
            goto L9d
        L77:
            android.util.TypedValue r3 = r8.peekValue(r2)
            int r3 = r3.type
            if (r3 != r4) goto L83
            r8.getString(r2)
            goto L9d
        L83:
            java.lang.String[] r3 = v.AbstractC1371a.f12931a
            int r2 = r8.getInteger(r2, r0)
            r2 = r3[r2]
            goto L9d
        L8c:
            int r3 = r7.f14020c
            int r2 = r8.getInt(r2, r3)
            r7.f14020c = r2
            goto L9d
        L95:
            float r3 = r7.f14022e
            float r2 = r8.getFloat(r2, r3)
            r7.f14022e = r2
        L9d:
            int r1 = r1 + 1
            goto Lc
        La1:
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.k.a(android.content.Context, android.util.AttributeSet):void");
    }
}
