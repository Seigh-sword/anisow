package q1;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import i.E;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends E {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i6) {
        super(context, ParcelFileDescriptor.class);
        if (i6 != 1) {
        } else {
            super(context, InputStream.class);
        }
    }
}
