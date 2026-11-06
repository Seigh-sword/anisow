package P3;

import N3.C0115a;
import N3.C0116b;
import android.net.Uri;
import java.net.URL;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0116b f2535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1432j f2536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2537c = "firebase-settings.crashlytics.com";

    public h(C0116b c0116b, InterfaceC1432j interfaceC1432j) {
        this.f2535a = c0116b;
        this.f2536b = interfaceC1432j;
    }

    public static final URL a(h hVar) {
        hVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority(hVar.f2537c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C0116b c0116b = hVar.f2535a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c0116b.f2201a).appendPath("settings");
        C0115a c0115a = c0116b.f2206f;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c0115a.f2197c).appendQueryParameter("display_version", c0115a.f2196b).build().toString());
    }
}
