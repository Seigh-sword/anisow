package s1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import t1.C1340c;

/* JADX INFO: loaded from: classes.dex */
public final class E implements j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12546a;

    public /* synthetic */ E(int i6) {
        this.f12546a = i6;
    }

    @Override // j1.o
    public final /* bridge */ /* synthetic */ boolean a(Object obj, j1.m mVar) {
        switch (this.f12546a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // j1.o
    public final l1.F b(Object obj, int i6, int i7, j1.m mVar) {
        switch (this.f12546a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new D(0, (Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C1340c(drawable, 0);
                }
                return null;
            default:
                return new D((File) obj);
        }
    }
}
