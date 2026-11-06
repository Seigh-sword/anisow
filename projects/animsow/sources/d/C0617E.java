package d;

import android.os.Looper;
import k3.C0898d;
import o0.C1180d0;
import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: renamed from: d.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0617E extends D4.h implements C4.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f8082E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0617E(int i6, Object obj) {
        super(0, obj, C0618F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V");
        this.f8082E = i6;
        switch (i6) {
            case 1:
                super(0, obj, C0618F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V");
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                super(0, obj, C1180d0.class, "refresh", "refresh()V");
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                super(0, obj, C1180d0.class, "invalidate", "invalidate()V");
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                super(0, obj, C1180d0.class, "invalidate", "invalidate()V");
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                super(0, obj, C0898d.class, "isBackgroundThread", "isBackgroundThread()Z");
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                super(0, obj, C0898d.class, "isBlockingThread", "isBlockingThread()Z");
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                super(0, obj, C0898d.class, "isNotMainThread", "isNotMainThread()Z");
                break;
            default:
                break;
        }
    }

    @Override // C4.a
    public final /* bridge */ /* synthetic */ Object b() {
        C1316l c1316l = C1316l.f12640a;
        switch (this.f8082E) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                l();
                break;
            case 1:
                l();
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                l();
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                l();
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                l();
                break;
        }
        return k();
    }

    public final Boolean k() {
        int i6 = this.f8082E;
        Object obj = this.f361x;
        switch (i6) {
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                ((C0898d) obj).getClass();
                String name = Thread.currentThread().getName();
                AbstractC1305a.n(name, "threadName");
                return Boolean.valueOf(K4.h.W(name, "Firebase Background Thread #"));
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C0898d) obj).getClass();
                String name2 = Thread.currentThread().getName();
                AbstractC1305a.n(name2, "threadName");
                return Boolean.valueOf(K4.h.W(name2, "Firebase Blocking Thread #"));
            default:
                ((C0898d) obj).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }

    public final void l() {
        int i6 = this.f8082E;
        Object obj = this.f361x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0618F) obj).e();
                break;
            case 1:
                ((C0618F) obj).e();
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((C1180d0) obj).f11911d.P(Boolean.TRUE);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((C1180d0) obj).f11911d.P(Boolean.FALSE);
                break;
            default:
                ((C1180d0) obj).f11911d.P(Boolean.FALSE);
                break;
        }
    }
}
