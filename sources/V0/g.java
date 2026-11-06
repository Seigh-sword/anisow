package V0;

import Z0.p;
import g1.C0717c;
import g1.C0719e;
import g1.C0721g;
import g1.C0723i;
import g1.C0724j;
import g1.C0726l;
import g1.C0727m;
import p4.InterfaceC1254c;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC1254c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3692b;

    public g(f fVar, int i6) {
        this.f3691a = fVar;
        this.f3692b = i6;
    }

    @Override // q4.InterfaceC1266a
    public final Object get() {
        int i6 = this.f3692b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C0717c();
            case 1:
                return new C0719e();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new p((Z0.e) this.f3691a.f3690c.get());
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0721g();
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return new C0723i();
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return new C0724j();
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0726l();
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0727m();
            default:
                throw new AssertionError(i6);
        }
    }
}
