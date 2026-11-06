package t1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import j1.l;
import j1.m;
import j1.o;
import java.util.List;
import l1.F;

/* JADX INFO: renamed from: t1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1341d implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f12723b = new l("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, l.f9437e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12724a;

    public C1341d(Context context) {
        this.f12724a = context.getApplicationContext();
    }

    @Override // j1.o
    public final boolean a(Object obj, m mVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // j1.o
    public final /* bridge */ /* synthetic */ F b(Object obj, int i6, int i7, m mVar) {
        return c((Uri) obj, mVar);
    }

    public final F c(Uri uri, m mVar) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f12724a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e6) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e6);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e7) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e7);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) mVar.c(f12723b) : null;
        Drawable drawableN = theme == null ? com.bumptech.glide.d.n(context, contextCreatePackageContext, identifier, null) : com.bumptech.glide.d.n(context, context, identifier, theme);
        if (drawableN != null) {
            return new C1340c(drawableN, 0);
        }
        return null;
    }
}
