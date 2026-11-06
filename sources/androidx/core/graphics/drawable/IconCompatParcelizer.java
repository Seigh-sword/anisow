package androidx.core.graphics.drawable;

import H0.a;
import H0.b;
import Z.j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5317a = aVar.f(iconCompat.f5317a, 1);
        byte[] bArr = iconCompat.f5319c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f897e;
            int i6 = parcel.readInt();
            if (i6 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i6];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f5319c = bArr;
        iconCompat.f5320d = aVar.g(iconCompat.f5320d, 3);
        iconCompat.f5321e = aVar.f(iconCompat.f5321e, 4);
        iconCompat.f5322f = aVar.f(iconCompat.f5322f, 5);
        iconCompat.f5323g = (ColorStateList) aVar.g(iconCompat.f5323g, 6);
        String string = iconCompat.f5325i;
        if (aVar.e(7)) {
            string = ((b) aVar).f897e.readString();
        }
        iconCompat.f5325i = string;
        String string2 = iconCompat.f5326j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f897e.readString();
        }
        iconCompat.f5326j = string2;
        iconCompat.f5324h = PorterDuff.Mode.valueOf(iconCompat.f5325i);
        switch (iconCompat.f5317a) {
            case -1:
                parcelable = iconCompat.f5320d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f5318b = parcelable;
                return iconCompat;
            case d.f6312l /* 0 */:
            default:
                return iconCompat;
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                parcelable = iconCompat.f5320d;
                if (parcelable != null) {
                    iconCompat.f5318b = parcelable;
                } else {
                    byte[] bArr3 = iconCompat.f5319c;
                    iconCompat.f5318b = bArr3;
                    iconCompat.f5317a = 3;
                    iconCompat.f5321e = 0;
                    iconCompat.f5322f = bArr3.length;
                }
                return iconCompat;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.f5319c, Charset.forName("UTF-16"));
                iconCompat.f5318b = str;
                if (iconCompat.f5317a == 2 && iconCompat.f5326j == null) {
                    iconCompat.f5326j = str.split(":", -1)[0];
                }
                return iconCompat;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f5318b = iconCompat.f5319c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f5325i = iconCompat.f5324h.name();
        switch (iconCompat.f5317a) {
            case -1:
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f5320d = (Parcelable) iconCompat.f5318b;
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f5319c = ((String) iconCompat.f5318b).getBytes(Charset.forName("UTF-16"));
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f5319c = (byte[]) iconCompat.f5318b;
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f5319c = iconCompat.f5318b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i6 = iconCompat.f5317a;
        if (-1 != i6) {
            aVar.j(i6, 1);
        }
        byte[] bArr = iconCompat.f5319c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f897e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f5320d;
        if (parcelable != null) {
            aVar.i(3);
            ((b) aVar).f897e.writeParcelable(parcelable, 0);
        }
        int i7 = iconCompat.f5321e;
        if (i7 != 0) {
            aVar.j(i7, 4);
        }
        int i8 = iconCompat.f5322f;
        if (i8 != 0) {
            aVar.j(i8, 5);
        }
        ColorStateList colorStateList = iconCompat.f5323g;
        if (colorStateList != null) {
            aVar.i(6);
            ((b) aVar).f897e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f5325i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f897e.writeString(str);
        }
        String str2 = iconCompat.f5326j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f897e.writeString(str2);
        }
    }
}
