package b0;

/* JADX INFO: renamed from: b0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0334f extends L.i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f5880x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334f(i iVar) {
        super("FloatValueHolder");
        this.f5880x = iVar;
    }

    @Override // L.i
    public final float i(Object obj) {
        return this.f5880x.f5883a;
    }

    @Override // L.i
    public final void m(Object obj, float f6) {
        this.f5880x.f5883a = f6;
    }
}
