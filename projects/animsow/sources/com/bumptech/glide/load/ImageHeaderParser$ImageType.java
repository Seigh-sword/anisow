package com.bumptech.glide.load;

import j1.e;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f6362w;

    ImageHeaderParser$ImageType(boolean z5) {
        this.f6362w = z5;
    }

    public boolean hasAlpha() {
        return this.f6362w;
    }

    public boolean isWebp() {
        int i6 = e.f9432a[ordinal()];
        return i6 == 1 || i6 == 2 || i6 == 3;
    }
}
