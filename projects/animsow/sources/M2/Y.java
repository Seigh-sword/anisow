package m2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import h1.C0764d;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC1081x0 {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Pair f10800W = new Pair("", 0L);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SharedPreferences f10801A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0764d f10802B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Z f10803C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.bumptech.glide.k f10804D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f10805E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f10806F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f10807G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Z f10808H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final W f10809I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final com.bumptech.glide.k f10810J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final J3.w f10811K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final W f10812L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Z f10813M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Z f10814N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f10815O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final W f10816P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final W f10817Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Z f10818R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final com.bumptech.glide.k f10819S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final com.bumptech.glide.k f10820T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Z f10821U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final J3.w f10822V;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SharedPreferences f10823y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f10824z;

    public Y(C1051k0 c1051k0) {
        super(c1051k0);
        this.f10824z = new Object();
        this.f10808H = new Z(this, "session_timeout", 1800000L);
        this.f10809I = new W(this, "start_new_session", true);
        this.f10813M = new Z(this, "last_pause_time", 0L);
        this.f10814N = new Z(this, "session_id", 0L);
        this.f10810J = new com.bumptech.glide.k(this, "non_personalized_ads");
        this.f10811K = new J3.w(this, "last_received_uri_timestamps_by_source");
        this.f10812L = new W(this, "allow_remote_dynamite", false);
        this.f10803C = new Z(this, "first_open_time", 0L);
        AbstractC1332d.g("app_install_time");
        this.f10804D = new com.bumptech.glide.k(this, "app_instance_id");
        this.f10816P = new W(this, "app_backgrounded", false);
        this.f10817Q = new W(this, "deep_link_retrieval_complete", false);
        this.f10818R = new Z(this, "deep_link_retrieval_attempts", 0L);
        this.f10819S = new com.bumptech.glide.k(this, "firebase_feature_rollouts");
        this.f10820T = new com.bumptech.glide.k(this, "deferred_attribution_cache");
        this.f10821U = new Z(this, "deferred_attribution_cache_timestamp", 0L);
        this.f10822V = new J3.w(this, "default_event_parameters");
    }

    public final SharedPreferences A() {
        r();
        s();
        AbstractC1332d.m(this.f10823y);
        return this.f10823y;
    }

    public final SparseArray B() {
        Bundle bundleS = this.f10811K.s();
        int[] intArray = bundleS.getIntArray("uriSources");
        long[] longArray = bundleS.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            f().f10715B.d("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i6 = 0; i6 < intArray.length; i6++) {
            sparseArray.put(intArray[i6], Long.valueOf(longArray[i6]));
        }
        return sparseArray;
    }

    public final C1085z0 C() {
        r();
        return C1085z0.d(A().getInt("consent_source", 100), A().getString("consent_settings", "G1"));
    }

    @Override // m2.AbstractC1081x0
    public final boolean u() {
        return true;
    }

    public final void v(SparseArray sparseArray) {
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            iArr[i6] = sparseArray.keyAt(i6);
            jArr[i6] = ((Long) sparseArray.valueAt(i6)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f10811K.u(bundle);
    }

    public final boolean w(long j6) {
        return j6 - this.f10808H.a() > this.f10813M.a();
    }

    public final void x() {
        SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f10823y = sharedPreferences;
        boolean z5 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f10815O = z5;
        if (!z5) {
            SharedPreferences.Editor editorEdit = this.f10823y.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        long jMax = Math.max(0L, ((Long) AbstractC1078w.f11180d.a(null)).longValue());
        C0764d c0764d = new C0764d();
        c0764d.f8951x = this;
        AbstractC1332d.g("health_monitor");
        AbstractC1332d.c(jMax > 0);
        c0764d.f8952y = "health_monitor:start";
        c0764d.f8953z = "health_monitor:count";
        c0764d.f8949A = "health_monitor:value";
        c0764d.f8950w = jMax;
        this.f10802B = c0764d;
    }

    public final void y(boolean z5) {
        r();
        N nF = f();
        nF.f10723J.c(Boolean.valueOf(z5), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = A().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z5);
        editorEdit.apply();
    }

    public final SharedPreferences z() {
        r();
        s();
        if (this.f10801A == null) {
            synchronized (this.f10824z) {
                try {
                    if (this.f10801A == null) {
                        String str = a().getPackageName() + "_preferences";
                        f().f10723J.c(str, "Default prefs file");
                        this.f10801A = a().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f10801A;
    }
}
