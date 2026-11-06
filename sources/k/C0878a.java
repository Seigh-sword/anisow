package k;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.text.TextUtils;
import c0.ThreadFactoryC0352a;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.E;
import m2.C1051k0;
import m2.N;
import p1.C1234C;
import p1.InterfaceC1246l;
import p1.u;
import p1.x;
import p1.y;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: k.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0878a implements c0.k, A0.c, y, InterfaceC1246l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f9565x;

    public C0878a(Context context, int i6) {
        this.f9564w = i6;
        if (i6 != 7) {
            this.f9565x = context.getApplicationContext();
        } else {
            AbstractC1332d.m(context);
            this.f9565x = context;
        }
    }

    @Override // c0.k
    public final void a(com.bumptech.glide.c cVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0352a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new c0.n(this, cVar, threadPoolExecutor, 0));
    }

    @Override // p1.InterfaceC1246l
    public final Class b() {
        switch (this.f9564w) {
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p1.InterfaceC1246l
    public final void c(Object obj) throws IOException {
        switch (this.f9564w) {
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        switch (this.f9564w) {
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new p1.m(this.f9565x, this);
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return new p1.m(this.f9565x, this);
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return new p1.m(this.f9565x, c1234c.b(Integer.class, InputStream.class));
            default:
                return new u(this.f9565x, 1);
        }
    }

    @Override // p1.InterfaceC1246l
    public final Object e(Resources resources, int i6, Resources.Theme theme) {
        switch (this.f9564w) {
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return resources.openRawResourceFd(i6);
            default:
                return resources.openRawResource(i6);
        }
    }

    public final N f() {
        N n5 = C1051k0.b(this.f9565x, null, null).f10983E;
        C1051k0.i(n5);
        return n5;
    }

    @Override // A0.c
    public final A0.d j(A0.b bVar) {
        Context context = this.f9565x;
        String str = bVar.f3b;
        E e6 = bVar.f4c;
        if (e6 == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        A0.b bVar2 = new A0.b();
        bVar2.f2a = context;
        bVar2.f3b = str;
        bVar2.f4c = e6;
        bVar2.f5d = true;
        return new B0.e(bVar2.f2a, bVar2.f3b, bVar2.f4c, bVar2.f5d);
    }

    public /* synthetic */ C0878a(Context context, int i6, int i7) {
        this.f9564w = i6;
        this.f9565x = context;
    }
}
