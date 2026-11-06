package u1;

import C1.n;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import z1.InterfaceC1529d;

/* JADX INFO: renamed from: u1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1362f implements z1.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f12836A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f12837B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Bitmap f12838C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y1.c f12841y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f12842z;

    public C1362f(Handler handler, int i6, long j6) {
        if (!n.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f12839w = Integer.MIN_VALUE;
        this.f12840x = Integer.MIN_VALUE;
        this.f12842z = handler;
        this.f12836A = i6;
        this.f12837B = j6;
    }

    @Override // z1.e
    public final void a(InterfaceC1529d interfaceC1529d) {
        ((y1.h) interfaceC1529d).n(this.f12839w, this.f12840x);
    }

    @Override // z1.e
    public final void b(y1.c cVar) {
        this.f12841y = cVar;
    }

    @Override // z1.e
    public final y1.c f() {
        return this.f12841y;
    }

    @Override // z1.e
    public final void g(Drawable drawable) {
        this.f12838C = null;
    }

    @Override // z1.e
    public final void h(Object obj) {
        this.f12838C = (Bitmap) obj;
        Handler handler = this.f12842z;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f12837B);
    }

    @Override // w1.InterfaceC1465i
    public final /* bridge */ /* synthetic */ void e() {
    }

    @Override // w1.InterfaceC1465i
    public final /* bridge */ /* synthetic */ void i() {
    }

    @Override // w1.InterfaceC1465i
    public final /* bridge */ /* synthetic */ void j() {
    }

    @Override // z1.e
    public final /* bridge */ /* synthetic */ void c(Drawable drawable) {
    }

    @Override // z1.e
    public final /* bridge */ /* synthetic */ void d(Drawable drawable) {
    }

    @Override // z1.e
    public final /* bridge */ /* synthetic */ void k(InterfaceC1529d interfaceC1529d) {
    }
}
