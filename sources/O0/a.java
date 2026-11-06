package O0;

import P0.f;
import P0.g;
import P0.h;
import R0.i;
import Z.j;
import android.content.Context;
import android.os.Build;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, C0803c c0803c, int i6) {
        super((P0.a) h.f(context, c0803c).f2407a);
        this.f2307e = i6;
        if (i6 == 1) {
            super((P0.b) h.f(context, c0803c).f2408b);
            return;
        }
        if (i6 == 2) {
            super((f) h.f(context, c0803c).f2409c);
            return;
        }
        if (i6 == 3) {
            super((f) h.f(context, c0803c).f2409c);
        } else if (i6 != 4) {
        } else {
            super((g) h.f(context, c0803c).f2410d);
        }
    }

    @Override // O0.c
    public final boolean a(i iVar) {
        switch (this.f2307e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return iVar.f2909j.f1087b;
            case 1:
                return iVar.f2909j.f1089d;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                return iVar.f2909j.f1086a == 2;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                int i6 = iVar.f2909j.f1086a;
                if (i6 != 3) {
                    return Build.VERSION.SDK_INT >= 30 && i6 == 6;
                }
                return true;
            default:
                return iVar.f2909j.f1090e;
        }
    }

    @Override // O0.c
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f2307e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return f((Boolean) obj);
            case 1:
                return f((Boolean) obj);
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                return e((N0.a) obj);
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return e((N0.a) obj);
            default:
                return f((Boolean) obj);
        }
    }

    public final boolean e(N0.a aVar) {
        switch (this.f2307e) {
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                return Build.VERSION.SDK_INT >= 26 ? (aVar.f2068a && aVar.f2069b) ? false : true : true ^ aVar.f2068a;
            default:
                return !aVar.f2068a || aVar.f2070c;
        }
    }

    public final boolean f(Boolean bool) {
        switch (this.f2307e) {
        }
        return !bool.booleanValue();
    }
}
