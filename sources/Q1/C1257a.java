package q1;

import C1.j;
import S0.f;
import j1.l;
import j1.m;
import java.util.ArrayDeque;
import p1.o;
import p1.v;
import p1.w;
import p1.x;

/* JADX INFO: renamed from: q1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1257a implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f12333b = l.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f12334a;

    public C1257a(f fVar) {
        this.f12334a = fVar;
    }

    @Override // p1.x
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // p1.x
    public final w b(Object obj, int i6, int i7, m mVar) {
        o oVar = (o) obj;
        f fVar = this.f12334a;
        if (fVar != null) {
            v vVarA = v.a(oVar);
            Object objA = ((j) fVar.f3073x).a(vVarA);
            ArrayDeque arrayDeque = v.f12282d;
            synchronized (arrayDeque) {
                arrayDeque.offer(vVarA);
            }
            o oVar2 = (o) objA;
            if (oVar2 == null) {
                ((j) fVar.f3073x).d(v.a(oVar), oVar);
            } else {
                oVar = oVar2;
            }
        }
        return new w(oVar, new com.bumptech.glide.load.data.l(oVar, ((Integer) mVar.c(f12333b)).intValue()));
    }
}
