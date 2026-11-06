package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final F f5544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5546y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ E f5547z;

    public C(E e6, F f6) {
        this.f5547z = e6;
        this.f5544w = f6;
    }

    public final void a(boolean z5) {
        if (z5 == this.f5545x) {
            return;
        }
        this.f5545x = z5;
        int i6 = z5 ? 1 : -1;
        E e6 = this.f5547z;
        int i7 = e6.f5552c;
        e6.f5552c = i6 + i7;
        if (!e6.f5553d) {
            e6.f5553d = true;
            while (true) {
                try {
                    int i8 = e6.f5552c;
                    if (i7 == i8) {
                        break;
                    } else {
                        i7 = i8;
                    }
                } finally {
                    e6.f5553d = false;
                }
            }
        }
        if (this.f5545x) {
            e6.c(this);
        }
    }

    public void c() {
    }

    public boolean d(InterfaceC0321v interfaceC0321v) {
        return false;
    }

    public abstract boolean e();
}
