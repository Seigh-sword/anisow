package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import m1.C1010h;
import s1.y;

/* JADX INFO: loaded from: classes.dex */
public final class n implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6387a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6388b;

    public n(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6388b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.g
    public final Object a() {
        int i6 = this.f6387a;
        Object obj = this.f6388b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return b();
            case 1:
                return obj;
            default:
                y yVar = (y) obj;
                yVar.reset();
                return yVar;
        }
    }

    public final ParcelFileDescriptor b() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f6388b).rewind();
    }

    @Override // com.bumptech.glide.load.data.g
    public final void c() {
        switch (this.f6387a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
            case 1:
                break;
            default:
                ((y) this.f6388b).c();
                break;
        }
    }

    public n(InputStream inputStream, C1010h c1010h) {
        y yVar = new y(inputStream, c1010h);
        this.f6388b = yVar;
        yVar.mark(5242880);
    }

    public n(Object obj) {
        this.f6388b = obj;
    }
}
