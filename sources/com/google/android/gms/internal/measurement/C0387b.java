package com.google.android.gms.internal.measurement;

import java.util.List;
import u1.C1358b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0387b extends AbstractC0435j {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f6764y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0387b() {
        super("internal.platform");
        this.f6764y = 4;
        this.f6839x.put("getVersion", new C0387b("getVersion", 0));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0435j
    public final InterfaceC0459n a(P0.h hVar, List list) {
        C0494t c0494t = InterfaceC0459n.f6885n;
        switch (this.f6764y) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C0417g(Double.valueOf(0.0d));
            case 1:
            default:
                return c0494t;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0387b(String str, int i6) {
        super(str);
        this.f6764y = i6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0387b(C1358b c1358b) {
        super("internal.remoteConfig");
        this.f6764y = 1;
        this.f6839x.put("getValue", new O2(c1358b, 0));
    }
}
