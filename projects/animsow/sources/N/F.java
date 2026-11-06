package N;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f1949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1951d;

    public F(int i6, Class cls, int i7, int i8) {
        this.f1948a = i6;
        this.f1949b = cls;
        this.f1951d = i7;
        this.f1950c = i8;
    }

    public final Object a(View view) {
        if (Build.VERSION.SDK_INT < this.f1950c) {
            Object tag = view.getTag(this.f1948a);
            if (this.f1949b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        int i6 = ((D) this).f1944e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        return Boolean.valueOf(N.d(view));
                    default:
                        return Boolean.valueOf(N.c(view));
                }
            case 1:
                switch (i6) {
                    case 1:
                        return N.b(view);
                    default:
                        return P.b(view);
                }
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                switch (i6) {
                    case 1:
                        return N.b(view);
                    default:
                        return P.b(view);
                }
            default:
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        return Boolean.valueOf(N.d(view));
                    default:
                        return Boolean.valueOf(N.c(view));
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0065. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.F.b(android.view.View, java.lang.Object):void");
    }
}
