package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i6, Class cls) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        if (i6 == 3) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }
}
