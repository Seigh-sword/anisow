package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6373a;

    @Override // com.bumptech.glide.load.data.f
    public final g a(Object obj) {
        switch (this.f6373a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new n(obj);
            case 1:
                return new n((ParcelFileDescriptor) obj);
            default:
                return new s1.j((ByteBuffer) obj);
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class b() {
        switch (this.f6373a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }
}
