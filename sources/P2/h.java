package P2;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2461a;

    public h(float f6) {
        this.f2461a = f6;
    }

    @Override // P2.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2461a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f2461a == ((h) obj).f2461a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2461a)});
    }
}
