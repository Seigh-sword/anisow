package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import j1.EnumC0843a;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f6366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Comparable f6367y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f6368z;

    public /* synthetic */ b(Object obj, Comparable comparable, int i6) {
        this.f6365w = i6;
        this.f6368z = obj;
        this.f6367y = comparable;
    }

    public abstract void a(Object obj);

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        switch (this.f6365w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object obj = this.f6366x;
                if (obj != null) {
                    try {
                        a(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.f6366x;
                if (obj2 != null) {
                    try {
                        a(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9424w;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, d dVar) {
        int i6 = this.f6365w;
        Object obj = this.f6368z;
        Comparable comparable = this.f6367y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    Closeable closeableF = f((AssetManager) obj, (String) comparable);
                    this.f6366x = closeableF;
                    dVar.l(closeableF);
                } catch (IOException e6) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e6);
                    }
                    dVar.h(e6);
                }
                break;
            default:
                try {
                    Object objG = g((ContentResolver) obj, (Uri) comparable);
                    this.f6366x = objG;
                    dVar.l(objG);
                } catch (FileNotFoundException e7) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e7);
                    }
                    dVar.h(e7);
                    return;
                }
                break;
        }
    }

    public abstract Closeable f(AssetManager assetManager, String str);

    public abstract Object g(ContentResolver contentResolver, Uri uri);
}
