package com.google.android.gms.internal.measurement;

import X1.C0247o;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import f2.C0698b;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0442k0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ String f6853A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f6854B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Context f6855C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Bundle f6856D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f6857E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0442k0(C0466o0 c0466o0, Context context, Bundle bundle) {
        super(c0466o0, true);
        this.f6855C = context;
        this.f6856D = bundle;
        this.f6857E = c0466o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        boolean z5;
        String str;
        String str2;
        String str3;
        try {
            C0466o0 c0466o0 = this.f6857E;
            String str4 = this.f6853A;
            String str5 = this.f6854B;
            c0466o0.getClass();
            if (str5 == null || str4 == null) {
                z5 = false;
            } else {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0466o0.class.getClassLoader());
                    z5 = false;
                } catch (ClassNotFoundException unused) {
                    z5 = true;
                }
            }
            Y yAsInterface = null;
            if (z5) {
                str3 = this.f6854B;
                str2 = this.f6853A;
                str = this.f6857E.f6908a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC1332d.m(this.f6855C);
            C0466o0 c0466o02 = this.f6857E;
            Context context = this.f6855C;
            c0466o02.getClass();
            try {
                yAsInterface = AbstractBinderC0388b0.asInterface(f2.f.c(context, f2.f.f8403b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (C0698b e6) {
                c0466o02.c(e6, true, false);
            }
            c0466o02.f6915h = yAsInterface;
            if (this.f6857E.f6915h == null) {
                Log.w(this.f6857E.f6908a, "Failed to connect to measurement client.");
                return;
            }
            int iA = f2.f.a(this.f6855C, ModuleDescriptor.MODULE_ID);
            C0436j0 c0436j0 = new C0436j0(106000L, Math.max(iA, r0), f2.f.d(this.f6855C, ModuleDescriptor.MODULE_ID, false) < iA, str, str2, str3, this.f6856D, C0247o.b(this.f6855C));
            Y y5 = this.f6857E.f6915h;
            AbstractC1332d.m(y5);
            y5.initialize(new e2.b(this.f6855C), c0436j0, this.f6862w);
        } catch (Exception e7) {
            this.f6857E.c(e7, true, false);
        }
    }
}
