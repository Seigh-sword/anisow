package m2;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import l.RunnableC0914g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ G0 f10641y;

    public /* synthetic */ H0(G0 g02, AtomicReference atomicReference, int i6) {
        this.f10639w = i6;
        this.f10641y = g02;
        this.f10640x = atomicReference;
    }

    private final void a() {
        synchronized (this.f10640x) {
            try {
                try {
                    AtomicReference atomicReference = this.f10640x;
                    C1032e c1032eN = this.f10641y.n();
                    String strB = this.f10641y.s().B();
                    c1032eN.getClass();
                    atomicReference.set(Boolean.valueOf(c1032eN.D(strB, AbstractC1078w.f11144M)));
                } finally {
                    this.f10640x.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10639w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                G0 g02 = this.f10641y;
                Bundle bundleS = g02.p().f10811K.s();
                Y0 y0W = g02.w();
                y0W.r();
                y0W.y();
                y0W.B(new RunnableC0914g(y0W, this.f10640x, y0W.N(false), bundleS, 4));
                return;
            case 1:
                a();
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                synchronized (this.f10640x) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f10640x;
                            C1032e c1032eN = this.f10641y.n();
                            String strB = this.f10641y.s().B();
                            c1032eN.getClass();
                            atomicReference.set(c1032eN.A(strB, AbstractC1078w.f11146N));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                synchronized (this.f10640x) {
                    try {
                        try {
                            this.f10640x.set(Integer.valueOf(this.f10641y.n().x(this.f10641y.s().B(), AbstractC1078w.f11150P)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                synchronized (this.f10640x) {
                    try {
                        try {
                            this.f10640x.set(Long.valueOf(this.f10641y.n().y(this.f10641y.s().B(), AbstractC1078w.f11148O)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f10640x) {
                    try {
                        try {
                            this.f10640x.set(Double.valueOf(this.f10641y.n().s(this.f10641y.s().B(), AbstractC1078w.f11152Q)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
