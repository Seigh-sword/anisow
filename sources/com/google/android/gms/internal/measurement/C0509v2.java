package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0509v2 extends AbstractC0521x2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6978w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractC0527y2 f6980y;

    public C0509v2(AbstractC0527y2 abstractC0527y2) {
        this.f6980y = abstractC0527y2;
        this.f6979x = abstractC0527y2.j();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6978w < this.f6979x;
    }
}
