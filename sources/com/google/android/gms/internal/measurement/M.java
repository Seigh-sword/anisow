package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f6641d;

    public final N a() {
        if (this.f6641d == 1 && this.f6638a != null && this.f6639b != 0 && this.f6640c != 0) {
            return new N(this.f6638a, this.f6639b, this.f6640c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6638a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.f6641d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f6639b == 0) {
            sb.append(" fileChecks");
        }
        if (this.f6640c == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
