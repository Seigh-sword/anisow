package l1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: l1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0928b extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.i f9880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f9882c;

    public C0928b(j1.i iVar, y yVar, ReferenceQueue referenceQueue, boolean z5) {
        F f6;
        super(yVar, referenceQueue);
        AbstractC1332d.l(iVar, "Argument must not be null");
        this.f9880a = iVar;
        if (yVar.f10015w && z5) {
            f6 = yVar.f10017y;
            AbstractC1332d.l(f6, "Argument must not be null");
        } else {
            f6 = null;
        }
        this.f9882c = f6;
        this.f9881b = yVar.f10015w;
    }
}
