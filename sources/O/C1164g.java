package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1164g implements Iterable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1160c f11715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1160c f11716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final WeakHashMap f11717y = new WeakHashMap();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11718z = 0;

    public C1160c b(Object obj) {
        C1160c c1160c = this.f11715w;
        while (c1160c != null && !c1160c.f11706w.equals(obj)) {
            c1160c = c1160c.f11708y;
        }
        return c1160c;
    }

    public Object c(Object obj) {
        C1160c c1160cB = b(obj);
        if (c1160cB == null) {
            return null;
        }
        this.f11718z--;
        WeakHashMap weakHashMap = this.f11717y;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1163f) it.next()).a(c1160cB);
            }
        }
        C1160c c1160c = c1160cB.f11709z;
        C1160c c1160c2 = c1160cB.f11708y;
        if (c1160c != null) {
            c1160c.f11708y = c1160c2;
        } else {
            this.f11715w = c1160c2;
        }
        C1160c c1160c3 = c1160cB.f11708y;
        if (c1160c3 != null) {
            c1160c3.f11709z = c1160c;
        } else {
            this.f11716x = c1160c;
        }
        c1160cB.f11708y = null;
        c1160cB.f11709z = null;
        return c1160cB.f11707x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((o.AbstractC1162e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof o.C1164g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o.g r7 = (o.C1164g) r7
            int r1 = r6.f11718z
            int r3 = r7.f11718z
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            o.e r3 = (o.AbstractC1162e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            o.e r4 = (o.AbstractC1162e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            o.e r7 = (o.AbstractC1162e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1164g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            AbstractC1162e abstractC1162e = (AbstractC1162e) it;
            if (!abstractC1162e.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) abstractC1162e.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1159b c1159b = new C1159b(this.f11715w, this.f11716x, 0);
        this.f11717y.put(c1159b, Boolean.FALSE);
        return c1159b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            AbstractC1162e abstractC1162e = (AbstractC1162e) it;
            if (!abstractC1162e.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) abstractC1162e.next()).toString());
            if (abstractC1162e.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
