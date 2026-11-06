package k1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: k1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0890b implements InterfaceC0892d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f9636b = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f9637a;

    public C0890b(ContentResolver contentResolver) {
        this.f9637a = contentResolver;
    }

    @Override // k1.InterfaceC0892d
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f9637a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f9636b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
