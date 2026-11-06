package h2;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import d.AbstractC0628i;

/* JADX INFO: renamed from: h2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0770b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8977a = 0;

    static {
        AbstractC0770b.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC0628i.f("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }
}
