package androidx.media;

import Z.j;
import com.bumptech.glide.d;
import d.AbstractC0628i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5659a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5660b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5661c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5662d = -1;

    public final boolean equals(Object obj) {
        int i6;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f5660b != audioAttributesImplBase.f5660b) {
            return false;
        }
        int i7 = this.f5661c;
        int i8 = audioAttributesImplBase.f5661c;
        int i9 = audioAttributesImplBase.f5662d;
        if (i9 == -1) {
            int i10 = audioAttributesImplBase.f5659a;
            int i11 = AudioAttributesCompat.f5655b;
            if ((i8 & 1) != 1) {
                i6 = 4;
                if ((i8 & 4) != 4) {
                    switch (i10) {
                        case j.FLOAT_FIELD_NUMBER /* 2 */:
                            i6 = 0;
                            break;
                        case j.INTEGER_FIELD_NUMBER /* 3 */:
                            i6 = 8;
                            break;
                        case j.LONG_FIELD_NUMBER /* 4 */:
                            break;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                            i6 = 5;
                            break;
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            i6 = 2;
                            break;
                        case 11:
                            i6 = 10;
                            break;
                        case 12:
                        default:
                            i6 = 3;
                            break;
                        case 13:
                            i6 = 1;
                            break;
                    }
                } else {
                    i6 = 6;
                }
            } else {
                i6 = 7;
            }
        } else {
            i6 = i9;
        }
        if (i6 == 6) {
            i8 |= 4;
        } else if (i6 == 7) {
            i8 |= 1;
        }
        return i7 == (i8 & 273) && this.f5659a == audioAttributesImplBase.f5659a && this.f5662d == i9;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5660b), Integer.valueOf(this.f5661c), Integer.valueOf(this.f5659a), Integer.valueOf(this.f5662d)});
    }

    public final String toString() {
        String strF;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f5662d != -1) {
            sb.append(" stream=");
            sb.append(this.f5662d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i6 = this.f5659a;
        int i7 = AudioAttributesCompat.f5655b;
        switch (i6) {
            case d.f6312l /* 0 */:
                strF = "USAGE_UNKNOWN";
                break;
            case 1:
                strF = "USAGE_MEDIA";
                break;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                strF = "USAGE_VOICE_COMMUNICATION";
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                strF = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
                strF = "USAGE_ALARM";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                strF = "USAGE_NOTIFICATION";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                strF = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strF = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strF = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strF = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strF = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strF = "USAGE_GAME";
                break;
            case 15:
            default:
                strF = AbstractC0628i.f("unknown usage ", i6);
                break;
            case 16:
                strF = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strF);
        sb.append(" content=");
        sb.append(this.f5660b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f5661c).toUpperCase());
        return sb.toString();
    }
}
