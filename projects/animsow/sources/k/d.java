package K;

import android.content.Context;
import java.util.concurrent.Callable;
import m.C0986t;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0986t f1477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1478e;

    public /* synthetic */ d(String str, Context context, C0986t c0986t, int i6, int i7) {
        this.f1474a = i7;
        this.f1475b = str;
        this.f1476c = context;
        this.f1477d = c0986t;
        this.f1478e = i6;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        /*
            r6 = this;
            r0 = -3
            java.lang.String r1 = r6.f1475b
            android.content.Context r2 = r6.f1476c
            m.t r3 = r6.f1477d
            int r4 = r6.f1478e
            int r5 = r6.f1474a
            switch(r5) {
                case 0: goto L22;
                default: goto Le;
            }
        Le:
            switch(r5) {
                case 0: goto L1d;
                default: goto L11;
            }
        L11:
            K.f r0 = K.g.a(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            K.f r1 = new K.f
            r1.<init>(r0)
            r0 = r1
            goto L21
        L1d:
            K.f r0 = K.g.a(r1, r2, r3, r4)
        L21:
            return r0
        L22:
            switch(r5) {
                case 0: goto L31;
                default: goto L25;
            }
        L25:
            K.f r0 = K.g.a(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2a
            goto L35
        L2a:
            K.f r1 = new K.f
            r1.<init>(r0)
            r0 = r1
            goto L35
        L31:
            K.f r0 = K.g.a(r1, r2, r3, r4)
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K.d.call():java.lang.Object");
    }
}
