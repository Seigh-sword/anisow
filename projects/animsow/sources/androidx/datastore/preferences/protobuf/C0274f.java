package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0274f extends AbstractC0276g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5441w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractC0280i f5443y;

    public C0274f(AbstractC0280i abstractC0280i) {
        this.f5443y = abstractC0280i;
        this.f5442x = abstractC0280i.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5441w < this.f5442x;
    }
}
