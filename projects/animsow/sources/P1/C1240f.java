package p1;

import android.util.Log;
import j1.EnumC0843a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: p1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1240f implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f12247x;

    public /* synthetic */ C1240f(int i6, Object obj) {
        this.f12246w = i6;
        this.f12247x = obj;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        switch (this.f12246w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ByteBuffer.class;
            default:
                return this.f12247x.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9424w;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        int i6 = this.f12246w;
        Object obj = this.f12247x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    dVar.l(C1.b.a((File) obj));
                } catch (IOException e6) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e6);
                    }
                    dVar.h(e6);
                    return;
                }
                break;
            default:
                dVar.l(obj);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
