package z3;

import w3.C1478b;
import w3.C1479c;

/* JADX INFO: loaded from: classes.dex */
public final class h implements w3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14123a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14124b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1479c f14125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f14126d;

    public h(f fVar) {
        this.f14126d = fVar;
    }

    @Override // w3.g
    public final w3.g a(String str) {
        if (this.f14123a) {
            throw new C1478b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f14123a = true;
        this.f14126d.i(this.f14125c, str, this.f14124b);
        return this;
    }

    @Override // w3.g
    public final w3.g b(boolean z5) {
        if (this.f14123a) {
            throw new C1478b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f14123a = true;
        this.f14126d.b(this.f14125c, z5 ? 1 : 0, this.f14124b);
        return this;
    }
}
