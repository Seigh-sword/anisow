package d0;

import B3.e;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: d0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0648c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f8160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8162d;

    public AbstractC0648c() {
        if (e.f99w == null) {
            e.f99w = new e();
        }
    }

    public final int a(int i6) {
        if (i6 < this.f8162d) {
            return this.f8160b.getShort(this.f8161c + i6);
        }
        return 0;
    }
}
