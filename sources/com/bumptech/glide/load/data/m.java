package com.bumptech.glide.load.data;

import java.io.InputStream;
import m1.C1010h;

/* JADX INFO: loaded from: classes.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1010h f6386a;

    public m(C1010h c1010h) {
        this.f6386a = c1010h;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g a(Object obj) {
        return new n((InputStream) obj, this.f6386a);
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class b() {
        return InputStream.class;
    }
}
