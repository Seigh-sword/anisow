package l1;

import j1.EnumC0843a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0934h, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j1.i f9852A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f9853B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9854C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile p1.w f9855D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public File f9856E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public H f9857F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC0933g f9858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0935i f9859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9860y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9861z = -1;

    public G(C0935i c0935i, InterfaceC0933g interfaceC0933g) {
        this.f9859x = c0935i;
        this.f9858w = interfaceC0933g;
    }

    @Override // l1.InterfaceC0934h
    public final boolean a() {
        ArrayList arrayListA = this.f9859x.a();
        boolean z5 = false;
        if (arrayListA.isEmpty()) {
            return false;
        }
        List listD = this.f9859x.d();
        if (listD.isEmpty()) {
            if (File.class.equals(this.f9859x.f9908k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f9859x.f9901d.getClass() + " to " + this.f9859x.f9908k);
        }
        while (true) {
            List list = this.f9853B;
            if (list != null && this.f9854C < list.size()) {
                this.f9855D = null;
                while (!z5 && this.f9854C < this.f9853B.size()) {
                    List list2 = this.f9853B;
                    int i6 = this.f9854C;
                    this.f9854C = i6 + 1;
                    p1.x xVar = (p1.x) list2.get(i6);
                    File file = this.f9856E;
                    C0935i c0935i = this.f9859x;
                    this.f9855D = xVar.b(file, c0935i.f9902e, c0935i.f9903f, c0935i.f9906i);
                    if (this.f9855D != null && this.f9859x.c(this.f9855D.f12288c.b()) != null) {
                        this.f9855D.f12288c.e(this.f9859x.f9912o, this);
                        z5 = true;
                    }
                }
                return z5;
            }
            int i7 = this.f9861z + 1;
            this.f9861z = i7;
            if (i7 >= listD.size()) {
                int i8 = this.f9860y + 1;
                this.f9860y = i8;
                if (i8 >= arrayListA.size()) {
                    return false;
                }
                this.f9861z = 0;
            }
            j1.i iVar = (j1.i) arrayListA.get(this.f9860y);
            Class cls = (Class) listD.get(this.f9861z);
            j1.q qVarF = this.f9859x.f(cls);
            C0935i c0935i2 = this.f9859x;
            this.f9857F = new H(c0935i2.f9900c.f6331a, iVar, c0935i2.f9911n, c0935i2.f9902e, c0935i2.f9903f, qVarF, cls, c0935i2.f9906i);
            File fileH = c0935i2.f9905h.b().h(this.f9857F);
            this.f9856E = fileH;
            if (fileH != null) {
                this.f9852A = iVar;
                this.f9853B = this.f9859x.f9900c.a().e(fileH);
                this.f9854C = 0;
            }
        }
    }

    @Override // l1.InterfaceC0934h
    public final void cancel() {
        p1.w wVar = this.f9855D;
        if (wVar != null) {
            wVar.f12288c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Exception exc) {
        this.f9858w.d(this.f9857F, exc, this.f9855D.f12288c, EnumC0843a.f9427z);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void l(Object obj) {
        this.f9858w.c(this.f9852A, obj, this.f9855D.f12288c, EnumC0843a.f9427z, this.f9857F);
    }
}
