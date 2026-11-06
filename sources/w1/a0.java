package W1;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0218l f4288b;

    public /* synthetic */ a0(C0218l c0218l, int i6) {
        this.f4287a = i6;
        this.f4288b = c0218l;
    }

    @Override // W1.J
    public final void a(Bundle bundle) {
        U1.b bVar = U1.b.f3574A;
        int i6 = this.f4287a;
        C0218l c0218l = this.f4288b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0218l.f4332k.lock();
                try {
                    Bundle bundle2 = c0218l.f4328g;
                    if (bundle2 == null) {
                        c0218l.f4328g = bundle;
                    } else if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    c0218l.f4329h = bVar;
                    C0218l.g(c0218l);
                    return;
                } finally {
                }
            default:
                c0218l.f4332k.lock();
                try {
                    c0218l.f4330i = bVar;
                    C0218l.g(c0218l);
                    return;
                } finally {
                }
        }
    }

    @Override // W1.J
    public final void b(U1.b bVar) {
        int i6 = this.f4287a;
        C0218l c0218l = this.f4288b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0218l.f4332k.lock();
                try {
                    c0218l.f4329h = bVar;
                    C0218l.g(c0218l);
                    return;
                } finally {
                }
            default:
                c0218l.f4332k.lock();
                try {
                    c0218l.f4330i = bVar;
                    C0218l.g(c0218l);
                    return;
                } finally {
                }
        }
    }

    @Override // W1.J
    public final void c(int i6) {
        U1.b bVar;
        int i7 = this.f4287a;
        C0218l c0218l = this.f4288b;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0218l.f4332k.lock();
                try {
                    if (c0218l.f4331j || (bVar = c0218l.f4330i) == null || !bVar.c()) {
                        c0218l.f4331j = false;
                        c0218l.f4324c.c(i6);
                        c0218l.f4330i = null;
                        c0218l.f4329h = null;
                    } else {
                        c0218l.f4331j = true;
                        c0218l.f4326e.b(i6);
                    }
                    return;
                } finally {
                }
            default:
                Lock lock = c0218l.f4332k;
                lock.lock();
                try {
                    if (c0218l.f4331j) {
                        c0218l.f4331j = false;
                        c0218l.f4324c.c(i6);
                        c0218l.f4330i = null;
                        c0218l.f4329h = null;
                    } else {
                        c0218l.f4331j = true;
                        c0218l.f4325d.b(i6);
                    }
                    return;
                } finally {
                    lock.unlock();
                }
        }
    }
}
