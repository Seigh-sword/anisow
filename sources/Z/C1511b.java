package z;

/* JADX INFO: renamed from: z.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1511b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13841a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13847g;

    public C1511b(C1511b c1511b, Object obj) {
        c1511b.getClass();
        this.f13842b = c1511b.f13842b;
        b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[PHI: r12
      0x0064: PHI (r12v4 int) = (r12v0 int), (r12v1 int) binds: [B:18:0x0062, B:22:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r16, android.content.res.XmlResourceParser r17, java.util.HashMap r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C1511b.a(android.content.Context, android.content.res.XmlResourceParser, java.util.HashMap):void");
    }

    public final void b(Object obj) {
        switch (u.h.b(this.f13842b)) {
            case com.bumptech.glide.d.f6312l /* 0 */:
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f13843c = ((Integer) obj).intValue();
                break;
            case 1:
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f13844d = ((Float) obj).floatValue();
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                this.f13847g = ((Integer) obj).intValue();
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                this.f13845e = (String) obj;
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                this.f13846f = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
