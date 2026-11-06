package X1;

import android.content.Context;
import android.content.res.Resources;
import com.xo.anilab.R;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: X1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0247o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f4636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4637b;

    public C0247o(Context context) {
        AbstractC1332d.m(context);
        Resources resources = context.getResources();
        this.f4636a = resources;
        this.f4637b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public static String b(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String a(String str) {
        String str2 = this.f4637b;
        Resources resources = this.f4636a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
