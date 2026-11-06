package k;

import N.InterfaceC0092f0;
import m.i1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f9622A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9625z;

    public k(l lVar) {
        this.f9623x = 0;
        this.f9622A = lVar;
        this.f9624y = false;
        this.f9625z = 0;
    }

    @Override // com.bumptech.glide.c, N.InterfaceC0092f0
    public final void a() {
        switch (this.f9623x) {
            case 1:
                this.f9624y = true;
                break;
        }
    }

    @Override // N.InterfaceC0092f0
    public final void c() {
        int i6 = this.f9623x;
        Object obj = this.f9622A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int i7 = this.f9625z + 1;
                this.f9625z = i7;
                l lVar = (l) obj;
                if (i7 == lVar.f9626a.size()) {
                    InterfaceC0092f0 interfaceC0092f0 = lVar.f9629d;
                    if (interfaceC0092f0 != null) {
                        interfaceC0092f0.c();
                    }
                    this.f9625z = 0;
                    this.f9624y = false;
                    lVar.f9630e = false;
                }
                break;
            default:
                if (!this.f9624y) {
                    ((i1) obj).f10283a.setVisibility(this.f9625z);
                }
                break;
        }
    }

    @Override // com.bumptech.glide.c, N.InterfaceC0092f0
    public final void f() {
        int i6 = this.f9623x;
        Object obj = this.f9622A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!this.f9624y) {
                    this.f9624y = true;
                    InterfaceC0092f0 interfaceC0092f0 = ((l) obj).f9629d;
                    if (interfaceC0092f0 != null) {
                        interfaceC0092f0.f();
                    }
                    break;
                }
                break;
            default:
                ((i1) obj).f10283a.setVisibility(0);
                break;
        }
    }

    public k(i1 i1Var, int i6) {
        this.f9623x = 1;
        this.f9622A = i1Var;
        this.f9625z = i6;
        this.f9624y = false;
    }
}
