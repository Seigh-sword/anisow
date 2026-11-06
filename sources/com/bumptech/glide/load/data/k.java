package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f6380A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AssetManager assetManager, String str, int i6) {
        super(assetManager, str, 0);
        this.f6380A = i6;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void a(Object obj) throws IOException {
        switch (this.f6380A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        switch (this.f6380A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Closeable f(AssetManager assetManager, String str) {
        switch (this.f6380A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
