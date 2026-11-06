package p1;

import android.util.Log;
import j1.EnumC0843a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: p1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1242h implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f12250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f12251y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f12252z;

    public /* synthetic */ C1242h(Object obj, int i6, Object obj2) {
        this.f12249w = i6;
        this.f12251y = obj;
        this.f12252z = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        int i6 = this.f12249w;
        Object obj = this.f12252z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((S0.f) obj).b();
            default:
                return ((n) obj).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        int i6 = this.f12249w;
        Object obj = this.f12252z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    Object obj2 = this.f12250x;
                    ((S0.f) obj).getClass();
                    ((InputStream) obj2).close();
                } catch (IOException unused) {
                    return;
                }
                break;
            default:
                Object obj3 = this.f12250x;
                if (obj3 != null) {
                    try {
                        ((n) obj).c(obj3);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9424w;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        int i6 = this.f12249w;
        Object obj = this.f12251y;
        Object obj2 = this.f12252z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    ((S0.f) obj2).getClass();
                    ByteArrayInputStream byteArrayInputStreamY = S0.f.y((String) obj);
                    this.f12250x = byteArrayInputStreamY;
                    dVar.l(byteArrayInputStreamY);
                } catch (IllegalArgumentException e6) {
                    dVar.h(e6);
                }
                break;
            default:
                try {
                    Object objJ = ((n) obj2).j((File) obj);
                    this.f12250x = objJ;
                    dVar.l(objJ);
                } catch (FileNotFoundException e7) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e7);
                    }
                    dVar.h(e7);
                    return;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
