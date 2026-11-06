package m3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: m3.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1092c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f11471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f11477g;

    public final C1094d0 a() {
        if (this.f11477g == 31) {
            return new C1094d0(this.f11471a, this.f11472b, this.f11473c, this.f11474d, this.f11475e, this.f11476f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f11477g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f11477g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f11477g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f11477g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f11477g & 16) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
