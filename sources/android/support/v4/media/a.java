package android.support.v4.media;

import T.k;
import T1.h;
import X1.C0240h;
import X1.C0244l;
import X1.C0246n;
import X1.C0248p;
import X1.L;
import X1.x;
import X1.y;
import Z.j;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import c.e;
import com.bumptech.glide.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import f.C0675a;
import f.C0683i;
import java.util.ArrayList;
import m.C0975n;
import m.U;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import v0.A0;
import v0.B0;
import v0.C1382K;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5064a;

    public /* synthetic */ a(int i6) {
        this.f5064a = i6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri uri;
        Bundle bundle;
        Bundle bundleU = null;
        Account account = null;
        String strX = null;
        String strX2 = null;
        Intent intent = null;
        int iG0 = 0;
        switch (this.f5064a) {
            case d.f6312l /* 0 */:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public final int f5050w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public final MediaDescriptionCompat f5051x;

                    {
                        this.f5050w = parcel.readInt();
                        this.f5051x = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f5050w + ", mDescription=" + this.f5051x + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i6) {
                        parcel2.writeInt(this.f5050w);
                        this.f5051x.writeToParcel(parcel2, i6);
                    }
                };
            case 1:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(d.class.getClassLoader());
                    uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    uri = null;
                }
                if (uri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri != null ? uri : mediaDescription.getMediaUri());
                mediaDescriptionCompat.f5056E = objCreateFromParcel;
                return mediaDescriptionCompat;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                return new MediaMetadataCompat(parcel);
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case j.LONG_FIELD_NUMBER /* 4 */:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new android.support.v4.media.a(4);

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public final MediaDescriptionCompat f5073w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public final long f5074x;

                    {
                        this.f5073w = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f5074x = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f5073w + ", Id=" + this.f5074x + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i6) {
                        this.f5073w.writeToParcel(parcel2, i6);
                        parcel2.writeLong(this.f5074x);
                    }
                };
            case j.STRING_FIELD_NUMBER /* 5 */:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f5075w = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new android.support.v4.media.a(6);

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public final Object f5076w;

                    {
                        this.f5076w = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = this.f5076w;
                        Object obj3 = ((MediaSessionCompat$Token) obj).f5076w;
                        if (obj2 == null) {
                            return obj3 == null;
                        }
                        if (obj3 == null) {
                            return false;
                        }
                        return obj2.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj = this.f5076w;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i6) {
                        parcel2.writeParcelable((Parcelable) this.f5076w, i6);
                    }
                };
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f5078w = parcel.readInt();
                parcelableVolumeInfo.f5080y = parcel.readInt();
                parcelableVolumeInfo.f5081z = parcel.readInt();
                parcelableVolumeInfo.f5077A = parcel.readInt();
                parcelableVolumeInfo.f5079x = parcel.readInt();
                return parcelableVolumeInfo;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new e(parcel);
            case 10:
                AbstractC1305a.o(parcel, "parcel");
                return new C0675a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 11:
                AbstractC1305a.o(parcel, "inParcel");
                Parcelable parcelable2 = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC1305a.l(parcelable2);
                return new C0683i((IntentSender) parcelable2, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 12:
                C0975n c0975n = new C0975n();
                c0975n.f10334w = parcel.readInt();
                return c0975n;
            case 13:
                U u5 = new U(parcel);
                u5.f10205w = parcel.readByte() != 0;
                return u5;
            case 14:
                k kVar = new k(parcel);
                kVar.f3368w = parcel.readInt();
                return kVar;
            case 15:
                C1382K c1382k = new C1382K();
                c1382k.f13037w = parcel.readInt();
                c1382k.f13038x = parcel.readInt();
                c1382k.f13039y = parcel.readInt() == 1;
                return c1382k;
            case 16:
                A0 a02 = new A0();
                a02.f12934w = parcel.readInt();
                a02.f12935x = parcel.readInt();
                a02.f12937z = parcel.readInt() == 1;
                int i6 = parcel.readInt();
                if (i6 > 0) {
                    int[] iArr = new int[i6];
                    a02.f12936y = iArr;
                    parcel.readIntArray(iArr);
                }
                return a02;
            case 17:
                B0 b02 = new B0();
                b02.f12945w = parcel.readInt();
                b02.f12946x = parcel.readInt();
                int i7 = parcel.readInt();
                b02.f12947y = i7;
                if (i7 > 0) {
                    int[] iArr2 = new int[i7];
                    b02.f12948z = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i8 = parcel.readInt();
                b02.f12939A = i8;
                if (i8 > 0) {
                    int[] iArr3 = new int[i8];
                    b02.f12940B = iArr3;
                    parcel.readIntArray(iArr3);
                }
                b02.f12942D = parcel.readInt() == 1;
                b02.f12943E = parcel.readInt() == 1;
                b02.f12944F = parcel.readInt() == 1;
                b02.f12941C = parcel.readArrayList(A0.class.getClassLoader());
                return b02;
            case 18:
                return new ParcelImpl(parcel);
            case 19:
                int iU0 = AbstractC1332d.u0(parcel);
                long jH0 = 0;
                String strX3 = null;
                String strX4 = null;
                String strX5 = null;
                String strX6 = null;
                Uri uri2 = null;
                String strX7 = null;
                String strX8 = null;
                ArrayList arrayList = null;
                String strX9 = null;
                String strX10 = null;
                int iG02 = 0;
                while (parcel.dataPosition() < iU0) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iG02 = AbstractC1332d.g0(parcel, i9);
                            break;
                        case j.FLOAT_FIELD_NUMBER /* 2 */:
                            strX3 = AbstractC1332d.x(parcel, i9);
                            break;
                        case j.INTEGER_FIELD_NUMBER /* 3 */:
                            strX4 = AbstractC1332d.x(parcel, i9);
                            break;
                        case j.LONG_FIELD_NUMBER /* 4 */:
                            strX5 = AbstractC1332d.x(parcel, i9);
                            break;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                            strX6 = AbstractC1332d.x(parcel, i9);
                            break;
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri2 = (Uri) AbstractC1332d.w(parcel, i9, Uri.CREATOR);
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            strX7 = AbstractC1332d.x(parcel, i9);
                            break;
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            jH0 = AbstractC1332d.h0(parcel, i9);
                            break;
                        case '\t':
                            strX8 = AbstractC1332d.x(parcel, i9);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator = Scope.CREATOR;
                            int iM0 = AbstractC1332d.m0(parcel, i9);
                            int iDataPosition = parcel.dataPosition();
                            if (iM0 != 0) {
                                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                                parcel.setDataPosition(iDataPosition + iM0);
                                arrayList = arrayListCreateTypedArrayList;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 11:
                            strX9 = AbstractC1332d.x(parcel, i9);
                            break;
                        case '\f':
                            strX10 = AbstractC1332d.x(parcel, i9);
                            break;
                        default:
                            AbstractC1332d.q0(parcel, i9);
                            break;
                    }
                }
                AbstractC1332d.C(parcel, iU0);
                return new GoogleSignInAccount(iG02, strX3, strX4, strX5, strX6, uri2, strX7, jH0, strX8, arrayList, strX9, strX10);
            case 20:
                int iU02 = AbstractC1332d.u0(parcel);
                while (parcel.dataPosition() < iU02) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        AbstractC1332d.q0(parcel, i10);
                    } else {
                        intent = (Intent) AbstractC1332d.w(parcel, i10, Intent.CREATOR);
                    }
                }
                AbstractC1332d.C(parcel, iU02);
                return new T1.a(intent);
            case 21:
                return new h(parcel.readStrongBinder());
            case 22:
                int iU03 = AbstractC1332d.u0(parcel);
                while (parcel.dataPosition() < iU03) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        iG0 = AbstractC1332d.g0(parcel, i11);
                    } else if (c6 != 2) {
                        AbstractC1332d.q0(parcel, i11);
                    } else {
                        strX2 = AbstractC1332d.x(parcel, i11);
                    }
                }
                AbstractC1332d.C(parcel, iU03);
                return new Scope(iG0, strX2);
            case 23:
                int iU04 = AbstractC1332d.u0(parcel);
                PendingIntent pendingIntent = null;
                U1.b bVar = null;
                while (parcel.dataPosition() < iU04) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        iG0 = AbstractC1332d.g0(parcel, i12);
                    } else if (c7 == 2) {
                        strX = AbstractC1332d.x(parcel, i12);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) AbstractC1332d.w(parcel, i12, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        AbstractC1332d.q0(parcel, i12);
                    } else {
                        bVar = (U1.b) AbstractC1332d.w(parcel, i12, U1.b.CREATOR);
                    }
                }
                AbstractC1332d.C(parcel, iU04);
                return new Status(iG0, strX, pendingIntent, bVar);
            case 24:
                int iU05 = AbstractC1332d.u0(parcel);
                while (true) {
                    ArrayList arrayListCreateTypedArrayList2 = null;
                    while (parcel.dataPosition() < iU05) {
                        int i13 = parcel.readInt();
                        char c8 = (char) i13;
                        if (c8 == 1) {
                            iG0 = AbstractC1332d.g0(parcel, i13);
                        } else if (c8 != 2) {
                            AbstractC1332d.q0(parcel, i13);
                        } else {
                            Parcelable.Creator<C0244l> creator2 = C0244l.CREATOR;
                            int iM02 = AbstractC1332d.m0(parcel, i13);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM02 == 0) {
                            }
                            arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(iDataPosition2 + iM02);
                        }
                        break;
                    }
                    AbstractC1332d.C(parcel, iU05);
                    return new C0248p(iG0, arrayListCreateTypedArrayList2);
                }
                break;
            case 25:
                int iU06 = AbstractC1332d.u0(parcel);
                long jH02 = 0;
                long jH03 = 0;
                int iG03 = -1;
                String strX11 = null;
                String strX12 = null;
                int iG04 = 0;
                int iG05 = 0;
                int iG06 = 0;
                int iG07 = 0;
                while (parcel.dataPosition() < iU06) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iG04 = AbstractC1332d.g0(parcel, i14);
                            break;
                        case j.FLOAT_FIELD_NUMBER /* 2 */:
                            iG05 = AbstractC1332d.g0(parcel, i14);
                            break;
                        case j.INTEGER_FIELD_NUMBER /* 3 */:
                            iG06 = AbstractC1332d.g0(parcel, i14);
                            break;
                        case j.LONG_FIELD_NUMBER /* 4 */:
                            jH02 = AbstractC1332d.h0(parcel, i14);
                            break;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                            jH03 = AbstractC1332d.h0(parcel, i14);
                            break;
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            strX11 = AbstractC1332d.x(parcel, i14);
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            strX12 = AbstractC1332d.x(parcel, i14);
                            break;
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            iG07 = AbstractC1332d.g0(parcel, i14);
                            break;
                        case '\t':
                            iG03 = AbstractC1332d.g0(parcel, i14);
                            break;
                        default:
                            AbstractC1332d.q0(parcel, i14);
                            break;
                    }
                }
                AbstractC1332d.C(parcel, iU06);
                return new C0244l(iG04, iG05, iG06, jH02, jH03, strX11, strX12, iG07, iG03);
            case 26:
                int iU07 = AbstractC1332d.u0(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iG08 = 0;
                while (parcel.dataPosition() < iU07) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        iG0 = AbstractC1332d.g0(parcel, i15);
                    } else if (c9 == 2) {
                        account = (Account) AbstractC1332d.w(parcel, i15, Account.CREATOR);
                    } else if (c9 == 3) {
                        iG08 = AbstractC1332d.g0(parcel, i15);
                    } else if (c9 != 4) {
                        AbstractC1332d.q0(parcel, i15);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC1332d.w(parcel, i15, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC1332d.C(parcel, iU07);
                return new x(iG0, account, iG08, googleSignInAccount);
            case 27:
                int iU08 = AbstractC1332d.u0(parcel);
                IBinder iBinderF0 = null;
                U1.b bVar2 = null;
                int iG09 = 0;
                boolean zD0 = false;
                boolean zD02 = false;
                while (parcel.dataPosition() < iU08) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 1) {
                        iG09 = AbstractC1332d.g0(parcel, i16);
                    } else if (c10 == 2) {
                        iBinderF0 = AbstractC1332d.f0(parcel, i16);
                    } else if (c10 == 3) {
                        bVar2 = (U1.b) AbstractC1332d.w(parcel, i16, U1.b.CREATOR);
                    } else if (c10 == 4) {
                        zD0 = AbstractC1332d.d0(parcel, i16);
                    } else if (c10 != 5) {
                        AbstractC1332d.q0(parcel, i16);
                    } else {
                        zD02 = AbstractC1332d.d0(parcel, i16);
                    }
                }
                AbstractC1332d.C(parcel, iU08);
                return new y(iG09, iBinderF0, bVar2, zD0, zD02);
            case 28:
                int iU09 = AbstractC1332d.u0(parcel);
                int iG010 = 0;
                boolean zD03 = false;
                boolean zD04 = false;
                int iG011 = 0;
                int iG012 = 0;
                while (parcel.dataPosition() < iU09) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        iG010 = AbstractC1332d.g0(parcel, i17);
                    } else if (c11 == 2) {
                        zD03 = AbstractC1332d.d0(parcel, i17);
                    } else if (c11 == 3) {
                        zD04 = AbstractC1332d.d0(parcel, i17);
                    } else if (c11 == 4) {
                        iG011 = AbstractC1332d.g0(parcel, i17);
                    } else if (c11 != 5) {
                        AbstractC1332d.q0(parcel, i17);
                    } else {
                        iG012 = AbstractC1332d.g0(parcel, i17);
                    }
                }
                AbstractC1332d.C(parcel, iU09);
                return new C0246n(iG010, zD03, zD04, iG011, iG012);
            default:
                int iU010 = AbstractC1332d.u0(parcel);
                U1.d[] dVarArr = null;
                C0240h c0240h = null;
                while (parcel.dataPosition() < iU010) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 1) {
                        bundleU = AbstractC1332d.u(parcel, i18);
                    } else if (c12 == 2) {
                        dVarArr = (U1.d[]) AbstractC1332d.y(parcel, i18, U1.d.CREATOR);
                    } else if (c12 == 3) {
                        iG0 = AbstractC1332d.g0(parcel, i18);
                    } else if (c12 != 4) {
                        AbstractC1332d.q0(parcel, i18);
                    } else {
                        c0240h = (C0240h) AbstractC1332d.w(parcel, i18, C0240h.CREATOR);
                    }
                }
                AbstractC1332d.C(parcel, iU010);
                L l5 = new L();
                l5.f4531w = bundleU;
                l5.f4532x = dVarArr;
                l5.f4533y = iG0;
                l5.f4534z = c0240h;
                return l5;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f5064a) {
            case d.f6312l /* 0 */:
                return new MediaBrowserCompat$MediaItem[i6];
            case 1:
                return new MediaDescriptionCompat[i6];
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                return new MediaMetadataCompat[i6];
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return new RatingCompat[i6];
            case j.LONG_FIELD_NUMBER /* 4 */:
                return new MediaSessionCompat$QueueItem[i6];
            case j.STRING_FIELD_NUMBER /* 5 */:
                return new MediaSessionCompat$ResultReceiverWrapper[i6];
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new MediaSessionCompat$Token[i6];
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ParcelableVolumeInfo[i6];
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new PlaybackStateCompat[i6];
            case 9:
                return new e[i6];
            case 10:
                return new C0675a[i6];
            case 11:
                return new C0683i[i6];
            case 12:
                return new C0975n[i6];
            case 13:
                return new U[i6];
            case 14:
                return new k[i6];
            case 15:
                return new C1382K[i6];
            case 16:
                return new A0[i6];
            case 17:
                return new B0[i6];
            case 18:
                return new ParcelImpl[i6];
            case 19:
                return new GoogleSignInAccount[i6];
            case 20:
                return new T1.a[i6];
            case 21:
                return new h[i6];
            case 22:
                return new Scope[i6];
            case 23:
                return new Status[i6];
            case 24:
                return new C0248p[i6];
            case 25:
                return new C0244l[i6];
            case 26:
                return new x[i6];
            case 27:
                return new y[i6];
            case 28:
                return new C0246n[i6];
            default:
                return new L[i6];
        }
    }
}
