package L3;

import N.C0095h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import d3.C0654b;
import p3.C1251c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements d3.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1737y;

    public /* synthetic */ d(int i6, Object obj, String str) {
        this.f1735w = i6;
        this.f1736x = str;
        this.f1737y = obj;
    }

    @Override // d3.e
    public final Object f(C1251c c1251c) {
        int i6 = this.f1735w;
        Object obj = this.f1737y;
        String str = this.f1736x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Context context = (Context) c1251c.a(Context.class);
                int i7 = ((C0095h) ((e) obj)).f1989w;
                String strValueOf = "";
                switch (i7) {
                    case 19:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 20:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 21:
                        int i8 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (i8 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new a(str, strValueOf);
            default:
                C0654b c0654b = (C0654b) obj;
                try {
                    Trace.beginSection(str);
                    return c0654b.f8186f.f(c1251c);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
