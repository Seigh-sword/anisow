package W2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractSet {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f4402x;

    public /* synthetic */ c(g gVar, int i6) {
        this.f4401w = i6;
        this.f4402x = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i6 = this.f4401w;
        g gVar = this.f4402x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                gVar.clear();
                break;
            default:
                gVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i6 = this.f4401w;
        g gVar = this.f4402x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Map mapB = gVar.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = gVar.d(entry.getKey());
                    if (iD != -1 && C0.d(gVar.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return gVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i6 = this.f4401w;
        g gVar = this.f4402x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Map mapB = gVar.b();
                return mapB != null ? mapB.entrySet().iterator() : new b(gVar, 1);
            default:
                Map mapB2 = gVar.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new b(gVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i6 = this.f4401w;
        g gVar = this.f4402x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Map mapB = gVar.b();
                if (mapB != null) {
                    break;
                } else if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!gVar.f()) {
                        int iC = gVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = gVar.f4417w;
                        Objects.requireNonNull(obj2);
                        int iY = Y2.b.y(key, value, iC, obj2, gVar.h(), gVar.i(), gVar.j());
                        if (iY != -1) {
                            gVar.e(iY, iC);
                            gVar.f4413B--;
                            gVar.f4412A += 32;
                            break;
                        }
                    }
                }
                break;
            default:
                Map mapB2 = gVar.b();
                if (mapB2 == null) {
                    if (gVar.g(obj) != g.f4411F) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i6 = this.f4401w;
        g gVar = this.f4402x;
        switch (i6) {
        }
        return gVar.size();
    }
}
