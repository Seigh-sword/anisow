package k1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: k1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0889a implements InterfaceC0892d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f9634b = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f9635a;

    public C0889a(ContentResolver contentResolver) {
        this.f9635a = contentResolver;
    }

    @Override // k1.InterfaceC0892d
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f9635a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f9634b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
