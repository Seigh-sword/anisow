package p1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import j1.EnumC0843a;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class t implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f12277y = {"_data"};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f12278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f12279x;

    public t(Context context, Uri uri) {
        this.f12278w = context;
        this.f12279x = uri;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return File.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9424w;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        Cursor cursorQuery = this.f12278w.getContentResolver().query(this.f12279x, f12277y, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            } finally {
                cursorQuery.close();
            }
        }
        if (!TextUtils.isEmpty(string)) {
            dVar.l(new File(string));
            return;
        }
        dVar.h(new FileNotFoundException("Failed to find file path for: " + this.f12279x));
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
