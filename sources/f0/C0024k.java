package F0;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: F0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0024k implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f534b;

    public C0024k(View view, ArrayList arrayList) {
        this.f533a = view;
        this.f534b = arrayList;
    }

    @Override // F0.u
    public final void a(w wVar) {
        wVar.F(this);
        this.f533a.setVisibility(8);
        ArrayList arrayList = this.f534b;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((View) arrayList.get(i6)).setVisibility(0);
        }
    }

    @Override // F0.u
    public final void d(w wVar) {
        wVar.F(this);
        wVar.a(this);
    }

    @Override // F0.u
    public final void c() {
    }

    @Override // F0.u
    public final void e() {
    }

    @Override // F0.u
    public final void b(w wVar) {
    }
}
