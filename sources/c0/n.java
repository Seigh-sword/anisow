package c0;

import J3.AbstractServiceC0052h;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractComponentCallbacksC0734B;
import h0.C0741f;
import h0.C0750o;
import h0.e0;
import h0.j0;
import h0.l0;
import h0.s0;
import h5.C0786m;
import h5.InterfaceC0785l;
import h5.U;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import k.C0878a;
import s.C1280b;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6136x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6137y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f6138z;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i6) {
        this.f6135w = i6;
        this.f6136x = obj;
        this.f6137y = obj2;
        this.f6138z = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6135w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0878a c0878a = (C0878a) this.f6136x;
                com.bumptech.glide.c cVar = (com.bumptech.glide.c) this.f6137y;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f6138z;
                c0878a.getClass();
                try {
                    z zVarI = com.bumptech.glide.d.i(c0878a.f9565x);
                    if (zVarI == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    y yVar = (y) zVarI.f6119a;
                    synchronized (yVar.f6170z) {
                        yVar.f6163B = threadPoolExecutor;
                        break;
                    }
                    zVarI.f6119a.a(new o(cVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    cVar.z(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f6136x;
                View view = (View) this.f6137y;
                C0741f c0741f = (C0741f) this.f6138z;
                AbstractC1305a.o(viewGroup, "$container");
                AbstractC1305a.o(c0741f, "this$0");
                viewGroup.endViewTransition(view);
                ((s0) c0741f.f8807c.f1668w).c(c0741f);
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                s0 s0Var = (s0) this.f6136x;
                s0 s0Var2 = (s0) this.f6137y;
                C0750o c0750o = (C0750o) this.f6138z;
                AbstractC1305a.o(c0750o, "this$0");
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = s0Var.f8888c;
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = s0Var2.f8888c;
                C1280b c1280b = c0750o.f8869n;
                j0 j0Var = e0.f8805a;
                AbstractC1305a.o(abstractComponentCallbacksC0734B, "inFragment");
                AbstractC1305a.o(abstractComponentCallbacksC0734B2, "outFragment");
                AbstractC1305a.o(c1280b, "sharedElements");
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                l0 l0Var = (l0) this.f6136x;
                View view2 = (View) this.f6137y;
                Rect rect = (Rect) this.f6138z;
                AbstractC1305a.o(l0Var, "$impl");
                AbstractC1305a.o(rect, "$lastInEpicenterRect");
                l0.j(rect, view2);
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                AbstractServiceC0052h abstractServiceC0052h = (AbstractServiceC0052h) this.f6136x;
                Intent intent = (Intent) this.f6137y;
                q2.j jVar = (q2.j) this.f6138z;
                int i6 = AbstractServiceC0052h.f1402B;
                abstractServiceC0052h.getClass();
                try {
                    abstractServiceC0052h.b(intent);
                    return;
                } finally {
                    jVar.a(null);
                }
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                C0786m c0786m = (C0786m) this.f6136x;
                InterfaceC0785l interfaceC0785l = (InterfaceC0785l) this.f6137y;
                U u5 = (U) this.f6138z;
                h5.r rVar = (h5.r) c0786m.f9113c;
                if (rVar.f9116x.h()) {
                    interfaceC0785l.b(rVar, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC0785l.a(rVar, u5);
                    return;
                }
            default:
                C0786m c0786m2 = (C0786m) this.f6136x;
                ((InterfaceC0785l) this.f6137y).b((h5.r) c0786m2.f9113c, (Throwable) this.f6138z);
                return;
        }
    }
}
