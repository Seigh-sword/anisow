package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V2.e f6753b;

    public Z1(Context context, V2.e eVar) {
        this.f6752a = context;
        this.f6753b = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z1) {
            Z1 z12 = (Z1) obj;
            if (this.f6752a.equals(z12.f6752a)) {
                V2.e eVar = z12.f6753b;
                V2.e eVar2 = this.f6753b;
                if (eVar2 != null ? eVar2.equals(eVar) : eVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f6752a.hashCode() ^ 1000003) * 1000003;
        V2.e eVar = this.f6753b;
        return iHashCode ^ (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f6752a) + ", hermeticFileOverrides=" + String.valueOf(this.f6753b) + "}";
    }
}
