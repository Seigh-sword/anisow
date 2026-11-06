package j1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends IOException {
    public d(int i6, String str, IOException iOException) {
        super(str + ", status code: " + i6, iOException);
    }
}
