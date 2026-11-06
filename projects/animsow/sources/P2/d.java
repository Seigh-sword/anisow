package P2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.bumptech.glide.d {
    @Override // com.bumptech.glide.d
    public final void m(float f6, float f7, t tVar) {
        tVar.d(f7 * f6, 180.0f, 90.0f);
        double d6 = f7;
        double d7 = f6;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d6 * d7), (float) (Math.sin(Math.toRadians(0.0f)) * d6 * d7));
    }
}
