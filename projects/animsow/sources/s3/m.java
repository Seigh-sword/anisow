package S3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractSet {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f3262x;

    public /* synthetic */ m(p pVar, int i6) {
        this.f3261w = i6;
        this.f3262x = pVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i6 = this.f3261w;
        p pVar = this.f3262x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                pVar.clear();
                break;
            default:
                pVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        o oVarA;
        int i6 = this.f3261w;
        p pVar = this.f3262x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                pVar.getClass();
                Object key = entry.getKey();
                o oVar = null;
                if (key != null) {
                    try {
                        oVarA = pVar.a(key, false);
                    } catch (ClassCastException unused) {
                        oVarA = null;
                    }
                    break;
                } else {
                    oVarA = null;
                }
                if (oVarA != null && Objects.equals(oVarA.f3270D, entry.getValue())) {
                    oVar = oVarA;
                }
                return oVar != null;
            default:
                return pVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3261w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new l(this);
            default:
                return new l(this, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        o oVarA;
        o oVarA2 = null;
        int i6 = this.f3261w;
        p pVar = this.f3262x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    pVar.getClass();
                    Object key = entry.getKey();
                    if (key != null) {
                        try {
                            oVarA = pVar.a(key, false);
                        } catch (ClassCastException unused) {
                            oVarA = null;
                        }
                    } else {
                        oVarA = null;
                    }
                    if (oVarA != null && Objects.equals(oVarA.f3270D, entry.getValue())) {
                        oVarA2 = oVarA;
                    }
                    if (oVarA2 != null) {
                        pVar.c(oVarA2, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                pVar.getClass();
                if (obj != null) {
                    try {
                        oVarA2 = pVar.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (oVarA2 != null) {
                    pVar.c(oVarA2, true);
                }
                if (oVarA2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i6 = this.f3261w;
        p pVar = this.f3262x;
        switch (i6) {
        }
        return pVar.f3284z;
    }
}
