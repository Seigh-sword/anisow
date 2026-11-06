package Z4;

import J3.x;
import V4.A;
import V4.B;
import V4.G;
import V4.s;
import Y4.i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f4970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f4971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f4973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f4974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4978j;

    public f(List list, i iVar, x xVar, int i6, B b6, A a6, int i7, int i8, int i9) {
        this.f4969a = list;
        this.f4970b = iVar;
        this.f4971c = xVar;
        this.f4972d = i6;
        this.f4973e = b6;
        this.f4974f = a6;
        this.f4975g = i7;
        this.f4976h = i8;
        this.f4977i = i9;
    }

    public final G a(B b6) {
        return b(b6, this.f4970b, this.f4971c);
    }

    public final G b(B b6, i iVar, x xVar) {
        List list = this.f4969a;
        int size = list.size();
        int i6 = this.f4972d;
        if (i6 >= size) {
            throw new AssertionError();
        }
        this.f4978j++;
        x xVar2 = this.f4971c;
        if (xVar2 != null && !xVar2.b().j(b6.f3751a)) {
            throw new IllegalStateException("network interceptor " + list.get(i6 - 1) + " must retain the same host and port");
        }
        if (xVar2 != null && this.f4978j > 1) {
            throw new IllegalStateException("network interceptor " + list.get(i6 - 1) + " must call proceed() exactly once");
        }
        int i7 = i6 + 1;
        A a6 = this.f4974f;
        int i8 = this.f4975g;
        List list2 = this.f4969a;
        f fVar = new f(list2, iVar, xVar, i7, b6, a6, i8, this.f4976h, this.f4977i);
        s sVar = (s) list2.get(i6);
        G gA = sVar.a(fVar);
        if (xVar != null && i7 < list.size() && fVar.f4978j != 1) {
            throw new IllegalStateException("network interceptor " + sVar + " must call proceed() exactly once");
        }
        if (gA == null) {
            throw new NullPointerException("interceptor " + sVar + " returned null");
        }
        if (gA.f3779C != null) {
            return gA;
        }
        throw new IllegalStateException("interceptor " + sVar + " returned a response with no body");
    }
}
