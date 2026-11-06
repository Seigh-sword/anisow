package P2;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2416b;

    public b(float f6, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f2415a;
            f6 += ((b) cVar).f2416b;
        }
        this.f2415a = cVar;
        this.f2416b = f6;
    }

    @Override // P2.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2415a.a(rectF) + this.f2416b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2415a.equals(bVar.f2415a) && this.f2416b == bVar.f2416b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2415a, Float.valueOf(this.f2416b)});
    }
}
