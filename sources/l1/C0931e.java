package l1;

import j1.EnumC0843a;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: l1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0931e implements InterfaceC0934h, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j1.i f9887A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f9888B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9889C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile p1.w f9890D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public File f9891E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f9892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0935i f9893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC0933g f9894y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9895z = -1;

    public C0931e(List list, C0935i c0935i, InterfaceC0933g interfaceC0933g) {
        this.f9892w = list;
        this.f9893x = c0935i;
        this.f9894y = interfaceC0933g;
    }

    @Override // l1.InterfaceC0934h
    public final boolean a() {
        while (true) {
            List list = this.f9888B;
            boolean z5 = false;
            if (list != null && this.f9889C < list.size()) {
                this.f9890D = null;
                while (!z5 && this.f9889C < this.f9888B.size()) {
                    List list2 = this.f9888B;
                    int i6 = this.f9889C;
                    this.f9889C = i6 + 1;
                    p1.x xVar = (p1.x) list2.get(i6);
                    File file = this.f9891E;
                    C0935i c0935i = this.f9893x;
                    this.f9890D = xVar.b(file, c0935i.f9902e, c0935i.f9903f, c0935i.f9906i);
                    if (this.f9890D != null && this.f9893x.c(this.f9890D.f12288c.b()) != null) {
                        this.f9890D.f12288c.e(this.f9893x.f9912o, this);
                        z5 = true;
                    }
                }
                return z5;
            }
            int i7 = this.f9895z + 1;
            this.f9895z = i7;
            if (i7 >= this.f9892w.size()) {
                return false;
            }
            j1.i iVar = (j1.i) this.f9892w.get(this.f9895z);
            C0935i c0935i2 = this.f9893x;
            File fileH = c0935i2.f9905h.b().h(new C0932f(iVar, c0935i2.f9911n));
            this.f9891E = fileH;
            if (fileH != null) {
                this.f9887A = iVar;
                this.f9888B = this.f9893x.f9900c.a().e(fileH);
                this.f9889C = 0;
            }
        }
    }

    @Override // l1.InterfaceC0934h
    public final void cancel() {
        p1.w wVar = this.f9890D;
        if (wVar != null) {
            wVar.f12288c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Exception exc) {
        this.f9894y.d(this.f9887A, exc, this.f9890D.f12288c, EnumC0843a.f9426y);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void l(Object obj) {
        this.f9894y.c(this.f9887A, obj, this.f9890D.f12288c, EnumC0843a.f9426y, this.f9887A);
    }
}
