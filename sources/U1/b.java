package U1;

import X1.M;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Y1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final b f3574A = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new M(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final PendingIntent f3577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f3578z;

    public b(int i6) {
        this(1, i6, null, null);
    }

    public static String e(int i6) {
        if (i6 == 99) {
            return "UNFINISHED";
        }
        if (i6 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i6) {
            case -1:
                return "UNKNOWN";
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "SERVICE_DISABLED";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "SIGN_IN_REQUIRED";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i6) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return H1.a.j("UNKNOWN_ERROR_CODE(", i6, ")");
                }
        }
    }

    public final boolean b() {
        return (this.f3576x == 0 || this.f3577y == null) ? false : true;
    }

    public final boolean c() {
        return this.f3576x == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3576x == bVar.f3576x && AbstractC1332d.D(this.f3577y, bVar.f3577y) && AbstractC1332d.D(this.f3578z, bVar.f3578z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3576x), this.f3577y, this.f3578z});
    }

    public final String toString() {
        C1358b c1358b = new C1358b(this);
        c1358b.c(e(this.f3576x), "statusCode");
        c1358b.c(this.f3577y, "resolution");
        c1358b.c(this.f3578z, "message");
        return c1358b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f3575w);
        AbstractC1332d.N0(parcel, 2, 4);
        parcel.writeInt(this.f3576x);
        AbstractC1332d.D0(parcel, 3, this.f3577y, i6);
        AbstractC1332d.F0(parcel, 4, this.f3578z);
        AbstractC1332d.L0(parcel, iJ0);
    }

    public b(int i6, int i7, PendingIntent pendingIntent, String str) {
        this.f3575w = i6;
        this.f3576x = i7;
        this.f3577y = pendingIntent;
        this.f3578z = str;
    }

    public b(int i6, PendingIntent pendingIntent) {
        this(1, i6, pendingIntent, null);
    }
}
