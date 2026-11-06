package p1;

import android.content.Context;
import android.net.Uri;
import k1.C0889a;
import k1.C0890b;
import k1.C0891c;

/* JADX INFO: loaded from: classes.dex */
public final class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12281b;

    public u(Context context, int i6) {
        this.f12280a = i6;
        if (i6 == 1) {
            this.f12281b = context.getApplicationContext();
        } else if (i6 != 2) {
            this.f12281b = context;
        } else {
            this.f12281b = context.getApplicationContext();
        }
    }

    @Override // p1.x
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f12280a) {
        }
        return d((Uri) obj);
    }

    @Override // p1.x
    public final /* bridge */ /* synthetic */ w b(Object obj, int i6, int i7, j1.m mVar) {
        switch (this.f12280a) {
        }
        return c((Uri) obj, i6, i7, mVar);
    }

    public final w c(Uri uri, int i6, int i7, j1.m mVar) {
        Long l5;
        int i8 = this.f12280a;
        Context context = this.f12281b;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new w(new B1.b(uri), new t(context, uri));
            case 1:
                if (i6 == Integer.MIN_VALUE || i7 == Integer.MIN_VALUE || i6 > 512 || i7 > 384) {
                    return null;
                }
                return new w(new B1.b(uri), C0891c.a(context, uri, new C0889a(context.getContentResolver())));
            default:
                if (i6 == Integer.MIN_VALUE || i7 == Integer.MIN_VALUE || i6 > 512 || i7 > 384 || (l5 = (Long) mVar.c(s1.I.f12550d)) == null || l5.longValue() != -1) {
                    return null;
                }
                return new w(new B1.b(uri), C0891c.a(context, uri, new C0890b(context.getContentResolver())));
        }
    }

    public final boolean d(Uri uri) {
        switch (this.f12280a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            case 1:
                if (f2.h.x(uri) && !uri.getPathSegments().contains("video")) {
                    break;
                }
                break;
            default:
                if (f2.h.x(uri) && uri.getPathSegments().contains("video")) {
                    break;
                }
                break;
        }
        return true;
    }
}
