package s1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import i.C0803c;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: s1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1297f implements j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f12570b;

    public /* synthetic */ C1297f(r rVar, int i6) {
        this.f12569a = i6;
        this.f12570b = rVar;
    }

    @Override // j1.o
    public final boolean a(Object obj, j1.m mVar) {
        int i6 = this.f12569a;
        r rVar = this.f12570b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                rVar.getClass();
                break;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    rVar.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // j1.o
    public final l1.F b(Object obj, int i6, int i7, j1.m mVar) {
        int i8 = this.f12569a;
        r rVar = this.f12570b;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return rVar.a(new C0803c((ByteBuffer) obj, rVar.f12595d, rVar.f12594c, 19), i6, i7, mVar, r.f12590j);
            default:
                return rVar.a(new C0803c((ParcelFileDescriptor) obj, rVar.f12595d, rVar.f12594c), i6, i7, mVar, r.f12590j);
        }
    }
}
