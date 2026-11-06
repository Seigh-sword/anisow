package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: j3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0871u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f9546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f9547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f9548i;

    public C0871u(Y2.g gVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f9540a = 0;
        this.f9545f = new Object();
        this.f9546g = new q2.j();
        this.f9541b = false;
        this.f9542c = false;
        this.f9547h = new q2.j();
        gVar.a();
        Context context = gVar.f4816a;
        this.f9544e = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f9542c = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e6) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e6);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f9542c = false;
                boolValueOf = null;
            } else {
                this.f9542c = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f9548i = boolValueOf;
        synchronized (this.f9545f) {
            try {
                if (a()) {
                    ((q2.j) this.f9546g).c(null);
                    this.f9541b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zH;
        Object obj = this.f9548i;
        if (((Boolean) obj) != null) {
            zH = ((Boolean) obj).booleanValue();
        } else {
            try {
                zH = ((Y2.g) this.f9544e).h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        b(zH);
        return zH;
    }

    public final void b(boolean z5) {
        String str = "Crashlytics automatic data collection " + (z5 ? "ENABLED" : "DISABLED") + " by " + (((Boolean) this.f9548i) == null ? "global Firebase setting" : this.f9542c ? "firebase_crashlytics_collection_enabled manifest flag" : "API") + ".";
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public final String toString() {
        switch (this.f9540a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f9541b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f9542c) {
                    arrayList.add("isDirectory");
                }
                Long l5 = (Long) this.f9544e;
                if (l5 != null) {
                    arrayList.add("byteCount=" + l5);
                }
                Long l6 = (Long) this.f9545f;
                if (l6 != null) {
                    arrayList.add("createdAt=" + l6);
                }
                if (((Long) this.f9546g) != null) {
                    arrayList.add("lastModifiedAt=" + ((Long) this.f9546g));
                }
                Long l7 = (Long) this.f9547h;
                if (l7 != null) {
                    arrayList.add("lastAccessedAt=" + l7);
                }
                if (!((Map) this.f9548i).isEmpty()) {
                    arrayList.add("extras=" + ((Map) this.f9548i));
                }
                return t4.n.f0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0871u(boolean z5, boolean z6, f5.w wVar, Long l5, Long l6, Long l7, Long l8) {
        this(z5, z6, wVar, l5, l6, l7, l8, t4.q.f12757w);
        this.f9540a = 1;
    }

    public C0871u(boolean z5, boolean z6, f5.w wVar, Long l5, Long l6, Long l7, Long l8, Map map) {
        Object objX;
        this.f9540a = 1;
        AbstractC1305a.o(map, "extras");
        this.f9541b = z5;
        this.f9542c = z6;
        this.f9544e = l5;
        this.f9545f = l6;
        this.f9546g = l7;
        this.f9547h = l8;
        int size = map.size();
        if (size == 0) {
            objX = t4.q.f12757w;
        } else if (size != 1) {
            objX = new LinkedHashMap(map);
        } else {
            objX = AbstractC1305a.X(map);
        }
        this.f9548i = objX;
    }
}
