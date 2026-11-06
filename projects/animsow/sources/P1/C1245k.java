package p1;

import android.content.res.Resources;
import j1.EnumC0843a;
import java.io.IOException;

/* JADX INFO: renamed from: p1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1245k implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f12257A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Resources.Theme f12258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Resources f12259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC1246l f12260y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f12261z;

    public C1245k(Resources.Theme theme, Resources resources, InterfaceC1246l interfaceC1246l, int i6) {
        this.f12258w = theme;
        this.f12259x = resources;
        this.f12260y = interfaceC1246l;
        this.f12261z = i6;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return this.f12260y.b();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        Object obj = this.f12257A;
        if (obj != null) {
            try {
                this.f12260y.c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9424w;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object objE = this.f12260y.e(this.f12259x, this.f12261z, this.f12258w);
            this.f12257A = objE;
            dVar.l(objE);
        } catch (Resources.NotFoundException e6) {
            dVar.h(e6);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
