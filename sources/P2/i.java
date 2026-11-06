package P2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.bumptech.glide.d {
    @Override // com.bumptech.glide.d
    public final void m(float f6, float f7, t tVar) {
        tVar.d(f7 * f6, 180.0f, 90.0f);
        float f8 = f7 * 2.0f * f6;
        p pVar = new p(0.0f, 0.0f, f8, f8);
        pVar.f2498f = 180.0f;
        pVar.f2499g = 90.0f;
        tVar.f2511g.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f2512h.add(nVar);
        tVar.f2509e = 270.0f;
        float f9 = (0.0f + f8) * 0.5f;
        float f10 = (f8 - 0.0f) / 2.0f;
        double d6 = 270.0f;
        tVar.f2507c = (((float) Math.cos(Math.toRadians(d6))) * f10) + f9;
        tVar.f2508d = (f10 * ((float) Math.sin(Math.toRadians(d6)))) + f9;
    }
}
