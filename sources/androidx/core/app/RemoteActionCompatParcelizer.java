package androidx.core.app;

import H0.a;
import H0.b;
import H0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarH = remoteActionCompat.f5310a;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        remoteActionCompat.f5310a = (IconCompat) cVarH;
        CharSequence charSequence = remoteActionCompat.f5311b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f897e);
        }
        remoteActionCompat.f5311b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f5312c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f897e);
        }
        remoteActionCompat.f5312c = charSequence2;
        remoteActionCompat.f5313d = (PendingIntent) aVar.g(remoteActionCompat.f5313d, 4);
        boolean z5 = remoteActionCompat.f5314e;
        if (aVar.e(5)) {
            z5 = ((b) aVar).f897e.readInt() != 0;
        }
        remoteActionCompat.f5314e = z5;
        boolean z6 = remoteActionCompat.f5315f;
        if (aVar.e(6)) {
            z6 = ((b) aVar).f897e.readInt() != 0;
        }
        remoteActionCompat.f5315f = z6;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f5310a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5311b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f897e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f5312c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f5313d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z5 = remoteActionCompat.f5314e;
        aVar.i(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = remoteActionCompat.f5315f;
        aVar.i(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}
