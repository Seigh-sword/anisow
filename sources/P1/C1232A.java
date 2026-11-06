package p1;

import j1.EnumC0843a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.C0922A;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: p1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1232A implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f12211A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f12212B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12213C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f12214w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final M.b f12215x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12216y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.bumptech.glide.g f12217z;

    public C1232A(ArrayList arrayList, M.b bVar) {
        this.f12215x = bVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f12214w = arrayList;
        this.f12216y = 0;
    }

    public final void a() {
        if (this.f12213C) {
            return;
        }
        if (this.f12216y < this.f12214w.size() - 1) {
            this.f12216y++;
            e(this.f12217z, this.f12211A);
        } else {
            AbstractC1332d.k(this.f12212B);
            this.f12211A.h(new C0922A("Fetch failed", new ArrayList(this.f12212B)));
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return ((com.bumptech.glide.load.data.e) this.f12214w.get(0)).b();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        List list = this.f12212B;
        if (list != null) {
            this.f12215x.d(list);
        }
        this.f12212B = null;
        Iterator it = this.f12214w.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).c();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f12213C = true;
        Iterator it = this.f12214w.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return ((com.bumptech.glide.load.data.e) this.f12214w.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        this.f12217z = gVar;
        this.f12211A = dVar;
        this.f12212B = (List) this.f12215x.h();
        ((com.bumptech.glide.load.data.e) this.f12214w.get(this.f12216y)).e(gVar, this);
        if (this.f12213C) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Exception exc) {
        List list = this.f12212B;
        AbstractC1332d.l(list, "Argument must not be null");
        list.add(exc);
        a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void l(Object obj) {
        if (obj != null) {
            this.f12211A.l(obj);
        } else {
            a();
        }
    }
}
