package P2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f2487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f2488d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f2487c = arrayList;
        this.f2488d = matrix;
    }

    @Override // P2.s
    public final void a(Matrix matrix, O2.a aVar, int i6, Canvas canvas) {
        Iterator it = this.f2487c.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(this.f2488d, aVar, i6, canvas);
        }
    }
}
