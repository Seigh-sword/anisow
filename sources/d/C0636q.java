package d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Y;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: renamed from: d.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0636q extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8120x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0638s f8121y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0636q(AbstractActivityC0638s abstractActivityC0638s, int i6) {
        super(0);
        this.f8120x = i6;
        this.f8121y = abstractActivityC0638s;
    }

    public final e0 a() {
        int i6 = this.f8120x;
        AbstractActivityC0638s abstractActivityC0638s = this.f8121y;
        switch (i6) {
        }
        return abstractActivityC0638s.f();
    }

    @Override // C4.a
    public final Object b() {
        int i6 = this.f8120x;
        int i7 = 1;
        AbstractActivityC0638s abstractActivityC0638s = this.f8121y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new Y(abstractActivityC0638s.getApplication(), abstractActivityC0638s, abstractActivityC0638s.getIntent() != null ? abstractActivityC0638s.getIntent().getExtras() : null);
            case 1:
                abstractActivityC0638s.reportFullyDrawn();
                return C1316l.f12640a;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0640u(abstractActivityC0638s.f8127B, new C0636q(abstractActivityC0638s, i7));
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                C0618F c0618f = new C0618F(new RunnableC0623d(abstractActivityC0638s, i7));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC1305a.c(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0638s.getClass();
                        abstractActivityC0638s.f205w.a(new C0627h(abstractActivityC0638s, c0618f));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0637r(abstractActivityC0638s, 0, c0618f));
                    }
                }
                return c0618f;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return a();
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return c();
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return a();
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return c();
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return a();
            case 9:
                return c();
            case 10:
                return a();
            default:
                return c();
        }
    }

    public final i0 c() {
        int i6 = this.f8120x;
        AbstractActivityC0638s abstractActivityC0638s = this.f8121y;
        switch (i6) {
        }
        return abstractActivityC0638s.e();
    }
}
