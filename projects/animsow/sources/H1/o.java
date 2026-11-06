package H1;

/* JADX INFO: loaded from: classes.dex */
public final class o implements J1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f946a;

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
    @Override // q4.InterfaceC1266a
    public final java.lang.Object get() {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            int r2 = r3.f946a
            switch(r2) {
                case 0: goto L34;
                case 1: goto L31;
                case 2: goto L2a;
                case 3: goto L27;
                case 4: goto L17;
                default: goto L7;
            }
        L7:
            switch(r2) {
                case 4: goto L10;
                default: goto La;
            }
        La:
            P1.c r1 = new P1.c
            r1.<init>(r0)
            goto L16
        L10:
            P1.c r0 = new P1.c
            r0.<init>(r1)
            r1 = r0
        L16:
            return r1
        L17:
            switch(r2) {
                case 4: goto L20;
                default: goto L1a;
            }
        L1a:
            P1.c r1 = new P1.c
            r1.<init>(r0)
            goto L26
        L20:
            P1.c r0 = new P1.c
            r0.<init>(r1)
            r1 = r0
        L26:
            return r1
        L27:
            N1.a r0 = N1.a.f2076f
            return r0
        L2a:
            int r0 = N1.o.f2109z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L31:
            java.lang.String r0 = "com.google.android.datatransport.events"
            return r0
        L34:
            U0.a r0 = new U0.a
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.o.get():java.lang.Object");
    }
}
