package P2;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2414a;

    public a(float f6) {
        this.f2414a = f6;
    }

    @Override // P2.c
    public final float a(RectF rectF) {
        return this.f2414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2414a == ((a) obj).f2414a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2414a)});
    }
}
