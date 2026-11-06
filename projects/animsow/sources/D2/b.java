package D2;

import H2.i;
import H2.j;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f293y;

    public /* synthetic */ b(int i6, Object obj) {
        this.f292x = i6;
        this.f293y = obj;
    }

    @Override // com.bumptech.glide.c
    public final void B(int i6) {
        switch (this.f292x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                j jVar = (j) this.f293y;
                jVar.f1052e = true;
                i iVar = (i) jVar.f1053f.get();
                if (iVar != null) {
                    iVar.a();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.c
    public final void C(Typeface typeface, boolean z5) {
        int i6 = this.f292x;
        Object obj = this.f293y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Chip chip = (Chip) obj;
                f fVar = chip.f7149A;
                chip.setText(fVar.f329Z0 ? fVar.f330a0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z5) {
                    j jVar = (j) obj;
                    jVar.f1052e = true;
                    i iVar = (i) jVar.f1053f.get();
                    if (iVar != null) {
                        iVar.a();
                    }
                    break;
                }
                break;
        }
    }
}
