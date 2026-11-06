package G0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G.f[] f708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f711d;

    public l() {
        this.f708a = null;
        this.f710c = 0;
    }

    public G.f[] getPathData() {
        return this.f708a;
    }

    public String getPathName() {
        return this.f709b;
    }

    public void setPathData(G.f[] fVarArr) {
        if (!com.bumptech.glide.d.f(this.f708a, fVarArr)) {
            this.f708a = com.bumptech.glide.d.l(fVarArr);
            return;
        }
        G.f[] fVarArr2 = this.f708a;
        for (int i6 = 0; i6 < fVarArr.length; i6++) {
            fVarArr2[i6].f646a = fVarArr[i6].f646a;
            int i7 = 0;
            while (true) {
                float[] fArr = fVarArr[i6].f647b;
                if (i7 < fArr.length) {
                    fVarArr2[i6].f647b[i7] = fArr[i7];
                    i7++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f708a = null;
        this.f710c = 0;
        this.f709b = lVar.f709b;
        this.f711d = lVar.f711d;
        this.f708a = com.bumptech.glide.d.l(lVar.f708a);
    }
}
