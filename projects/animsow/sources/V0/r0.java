package v0;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13227n;

    public final void a(int i6) {
        if ((this.f13217d & i6) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i6) + " but it is " + Integer.toBinaryString(this.f13217d));
    }

    public final int b() {
        return this.f13220g ? this.f13215b - this.f13216c : this.f13218e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f13214a + ", mData=null, mItemCount=" + this.f13218e + ", mIsMeasuring=" + this.f13222i + ", mPreviousLayoutItemCount=" + this.f13215b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f13216c + ", mStructureChanged=" + this.f13219f + ", mInPreLayout=" + this.f13220g + ", mRunSimpleAnimations=" + this.f13223j + ", mRunPredictiveAnimations=" + this.f13224k + '}';
    }
}
