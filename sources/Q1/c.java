package q1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.e;
import f2.h;
import j1.EnumC0843a;
import j1.m;
import java.io.File;
import java.io.FileNotFoundException;
import p1.w;
import p1.x;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String[] f12335G = {"_data"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f12336A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f12337B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final m f12338C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Class f12339D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile boolean f12340E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile e f12341F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f12342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x f12343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f12344y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Uri f12345z;

    public c(Context context, x xVar, x xVar2, Uri uri, int i6, int i7, m mVar, Class cls) {
        this.f12342w = context.getApplicationContext();
        this.f12343x = xVar;
        this.f12344y = xVar2;
        this.f12345z = uri;
        this.f12336A = i6;
        this.f12337B = i7;
        this.f12338C = mVar;
        this.f12339D = cls;
    }

    public final e a() throws Throwable {
        w wVarB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f12342w;
        m mVar = this.f12338C;
        int i6 = this.f12337B;
        int i7 = this.f12336A;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f12345z;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f12335G, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            wVarB = this.f12343x.b(file, i7, i6, mVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f12345z;
            boolean zX = h.x(requireOriginal);
            x xVar = this.f12344y;
            if ((!zX || !requireOriginal.getPathSegments().contains("picker")) && context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            wVarB = xVar.b(requireOriginal, i7, i6, mVar);
        }
        if (wVarB != null) {
            return wVarB.f12288c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return this.f12339D;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        e eVar = this.f12341F;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f12340E = true;
        e eVar = this.f12341F;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9424w;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(g gVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            e eVarA = a();
            if (eVarA == null) {
                dVar.h(new IllegalArgumentException("Failed to build fetcher for: " + this.f12345z));
            } else {
                this.f12341F = eVarA;
                if (this.f12340E) {
                    cancel();
                } else {
                    eVarA.e(gVar, dVar);
                }
            }
        } catch (FileNotFoundException e6) {
            dVar.h(e6);
        }
    }
}
