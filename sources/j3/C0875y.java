package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import d.C0617E;
import g3.C0731c;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k3.C0897c;
import k3.C0898d;
import k3.C0899e;

/* JADX INFO: renamed from: j3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0875y implements InterfaceC0876z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f9556g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f9557h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0848A f9558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E3.d f9561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0871u f9562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0852b f9563f;

    public C0875y(Context context, String str, E3.d dVar, C0871u c0871u) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f9559b = context;
        this.f9560c = str;
        this.f9561d = dVar;
        this.f9562e = c0871u;
        this.f9558a = new C0848A();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f9556g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final C0874x b(boolean z5) {
        String str;
        C0898d.a(new C0617E(7, C0899e.f9654d), C0897c.f9650A);
        E3.d dVar = this.f9561d;
        String str2 = null;
        if (z5) {
            try {
                str = ((E3.a) f2.h.c(((E3.c) dVar).d(), 10000L, TimeUnit.MILLISECONDS)).f393a;
            } catch (Exception e6) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e6);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) f2.h.c(((E3.c) dVar).c(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e7) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e7);
        }
        return new C0874x(str2, str);
    }

    public final synchronized C0852b c() {
        C0852b c0852b;
        String str;
        C0852b c0852b2 = this.f9563f;
        if (c0852b2 != null && (c0852b2.f9457b != null || !this.f9562e.a())) {
            return this.f9563f;
        }
        C0731c c0731c = C0731c.f8531a;
        c0731c.g("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f9559b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c0731c.g("Cached Firebase Installation ID: " + string);
        if (this.f9562e.a()) {
            C0874x c0874xB = b(false);
            c0731c.g("Fetched Firebase Installation ID: " + c0874xB.f9554a);
            if (c0874xB.f9554a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                c0874xB = new C0874x(str, null);
            }
            this.f9563f = Objects.equals(c0874xB.f9554a, string) ? new C0852b(sharedPreferences.getString("crashlytics.installation.id", null), c0874xB.f9554a, c0874xB.f9555b) : new C0852b(a(sharedPreferences, c0874xB.f9554a), c0874xB.f9554a, c0874xB.f9555b);
        } else {
            if (string == null || !string.startsWith("SYN_")) {
                c0852b = new C0852b(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
            } else {
                c0852b = new C0852b(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
            }
            this.f9563f = c0852b;
        }
        c0731c.g("Install IDs: " + this.f9563f);
        return this.f9563f;
    }

    public final String d() {
        String str;
        C0848A c0848a = this.f9558a;
        Context context = this.f9559b;
        synchronized (c0848a) {
            try {
                if (c0848a.f9447x == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c0848a.f9447x = installerPackageName;
                }
                str = "".equals(c0848a.f9447x) ? null : c0848a.f9447x;
            } finally {
            }
        }
        return str;
    }
}
