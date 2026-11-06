package k1;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.g;
import j1.EnumC0843a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: k1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891c implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Uri f9638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0893e f9639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InputStream f9640y;

    public C0891c(Uri uri, C0893e c0893e) {
        this.f9638w = uri;
        this.f9639x = c0893e;
    }

    public static C0891c a(Context context, Uri uri, InterfaceC0892d interfaceC0892d) {
        return new C0891c(uri, new C0893e(com.bumptech.glide.b.a(context).f6298y.a().d(), interfaceC0892d, com.bumptech.glide.b.a(context).f6299z, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        InputStream inputStream = this.f9640y;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9424w;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(g gVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            InputStream inputStreamF = f();
            this.f9640y = inputStreamF;
            dVar.l(inputStreamF);
        } catch (FileNotFoundException e6) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e6);
            }
            dVar.h(e6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0025: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:38), block:B:10:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C0891c.f():java.io.InputStream");
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
