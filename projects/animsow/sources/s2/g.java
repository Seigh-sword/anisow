package S2;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {
    @Override // P2.g
    public final void g(Canvas canvas) {
        if (this.f3128T.f3126v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f3128T.f3126v);
        } else {
            canvas.clipRect(this.f3128T.f3126v, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }
}
