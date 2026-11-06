package t0;

import C1.n;
import M4.B;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import c1.C0363d;
import com.android.app.activities.HomeActivity;
import com.android.app.activities.PostActivity;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.C0396c2;
import com.google.android.gms.internal.measurement.X;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d2.C0652c;
import h0.AbstractComponentCallbacksC0734B;
import h0.C0736a;
import h0.E;
import h0.W;
import i.C0803c;
import i1.InterfaceC0827a;
import j1.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import k.C0878a;
import m1.C1010h;
import m1.InterfaceC1006d;
import m2.C0;
import p1.C1243i;
import p1.C1244j;
import p1.D;
import p1.G;
import s.C1280b;
import s1.C1292a;
import s1.C1293b;
import s1.C1294c;
import s1.C1297f;
import s1.C1298g;
import s1.I;
import s1.m;
import s1.r;
import s1.v;
import s1.y;
import s4.AbstractC1305a;
import t1.C1338a;
import t1.C1341d;
import u1.C1357a;
import u1.C1360d;
import u1.C1367k;
import v0.AbstractC1397f0;
import v0.Q;
import v0.r0;
import v1.C1419c;
import w1.C1469m;
import x1.C1485a;
import x1.C1486b;
import y2.C1507i;
import z0.InterfaceC1525f;

/* JADX INFO: renamed from: t0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1332d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B3.e f12692a = new B3.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12693b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f12694c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f12695d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f12696e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f12697f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f12698g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f12699h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f12700i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f12701j = {48, 48, 50, 0};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f12702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Method f12703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Boolean f12704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f12705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Boolean f12706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Boolean f12707p;

    public static boolean A(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z5 = true;
        for (File file2 : fileArrListFiles) {
            z5 = A(file2) && z5;
        }
        return z5;
    }

    public static void A0(ByteArrayOutputStream byteArrayOutputStream, C1330b c1330b, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        B.v(byteArrayOutputStream, str.getBytes(charset).length);
        B.v(byteArrayOutputStream, c1330b.f12687e);
        B.u(byteArrayOutputStream, c1330b.f12688f, 4);
        B.u(byteArrayOutputStream, c1330b.f12685c, 4);
        B.u(byteArrayOutputStream, c1330b.f12689g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void B(String str, String str2, Exception exc) {
        String strJ = J(str);
        if (Log.isLoggable(strJ, 6)) {
            Log.e(strJ, str2, exc);
        }
    }

    public static void B0(ByteArrayOutputStream byteArrayOutputStream, C1330b c1330b) throws IOException {
        byte[] bArr = new byte[(((c1330b.f12689g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1330b.f12691i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i6 = iIntValue2 & 2;
            int i7 = c1330b.f12689g;
            if (i6 != 0) {
                int iY = Y(2, iIntValue, i7);
                int i8 = iY / 8;
                bArr[i8] = (byte) ((1 << (iY % 8)) | bArr[i8]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iY2 = Y(4, iIntValue, i7);
                int i9 = iY2 / 8;
                bArr[i9] = (byte) ((1 << (iY2 % 8)) | bArr[i9]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void C(Parcel parcel, int i6) {
        if (parcel.dataPosition() != i6) {
            throw new Y1.b(AbstractC0628i.f("Overread allowed size end=", i6), parcel);
        }
    }

    public static void C0(ByteArrayOutputStream byteArrayOutputStream, C1330b c1330b) {
        int i6 = 0;
        for (Map.Entry entry : c1330b.f12691i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                B.v(byteArrayOutputStream, iIntValue - i6);
                B.v(byteArrayOutputStream, 0);
                i6 = iIntValue;
            }
        }
    }

    public static boolean D(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void D0(Parcel parcel, int i6, Parcelable parcelable, int i7) {
        if (parcelable == null) {
            return;
        }
        int iJ0 = J0(parcel, i6);
        parcelable.writeToParcel(parcel, i7);
        L0(parcel, iJ0);
    }

    public static View E(View view, int i6) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View viewFindViewById = viewGroup.getChildAt(i7).findViewById(i6);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0292 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0171 A[EXC_TOP_SPLITTER, PHI: r6
      0x0171: PHI (r6v25 char) = (r6v24 char), (r6v31 char), (r6v29 char) binds: [B:92:0x0167, B:94:0x016b, B:95:0x016d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void E0(android.content.Context r19, n.ExecutorC1138a r20, t0.InterfaceC1331c r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.AbstractC1332d.E0(android.content.Context, n.a, t0.c, boolean):void");
    }

    public static String F(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f12699h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f12698g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return AbstractC0628i.m(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static void F0(Parcel parcel, int i6, String str) {
        if (str == null) {
            return;
        }
        int iJ0 = J0(parcel, i6);
        parcel.writeString(str);
        L0(parcel, iJ0);
    }

    public static int G(C1010h c1010h, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, c1010h);
        }
        inputStream.mark(5242880);
        return H(list, new C0396c2(inputStream, 18, c1010h));
    }

    public static void G0(Parcel parcel, int i6, Parcelable[] parcelableArr, int i7) {
        if (parcelableArr == null) {
            return;
        }
        int iJ0 = J0(parcel, i6);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i7);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        L0(parcel, iJ0);
    }

    public static int H(List list, j1.h hVar) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            int iJ = hVar.j((j1.f) list.get(i6));
            if (iJ != -1) {
                return iJ;
            }
        }
        return -1;
    }

    public static void H0(Parcel parcel, int i6, List list) {
        if (list == null) {
            return;
        }
        int iJ0 = J0(parcel, i6);
        int size = list.size();
        parcel.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            Parcelable parcelable = (Parcelable) list.get(i7);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        L0(parcel, iJ0);
    }

    public static String I(int i6) {
        switch (i6) {
            case -1:
                return "SUCCESS_CACHE";
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return AbstractC0628i.f("unknown status code: ", i6);
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static int I0(int i6) {
        int[] iArr = {1, 2, 3};
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = iArr[i7];
            int i9 = i8 - 1;
            if (i8 == 0) {
                throw null;
            }
            if (i9 == i6) {
                return i8;
            }
        }
        return 1;
    }

    public static String J(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static int J0(Parcel parcel, int i6) {
        parcel.writeInt(i6 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static ImageHeaderParser$ImageType K(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((j1.f) list.get(i6)).a(byteBuffer);
                C1.b.c(byteBuffer);
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                C1.b.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static void K0(Parcel parcel, int i6, int i7) {
        if (i6 == i7) {
            return;
        }
        String hexString = Integer.toHexString(i6);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i7);
        sb.append(" got ");
        sb.append(i6);
        sb.append(" (0x");
        throw new Y1.b(AbstractC0628i.m(sb, hexString, ")"), parcel);
    }

    public static ImageHeaderParser$ImageType L(C1010h c1010h, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, c1010h);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = ((j1.f) list.get(i6)).c(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static void L0(Parcel parcel, int i6) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i6 - 4);
        parcel.writeInt(iDataPosition - i6);
        parcel.setDataPosition(iDataPosition);
    }

    public static final void M(HomeActivity homeActivity) {
        View currentFocus = homeActivity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(homeActivity);
        }
        N(homeActivity, currentFocus);
    }

    public static void M0(Parcel parcel, int i6, int i7) {
        int iM0 = m0(parcel, i6);
        if (iM0 == i7) {
            return;
        }
        String hexString = Integer.toHexString(iM0);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i7);
        sb.append(" got ");
        sb.append(iM0);
        sb.append(" (0x");
        throw new Y1.b(AbstractC0628i.m(sb, hexString, ")"), parcel);
    }

    public static final void N(E e6, View view) {
        Object systemService = e6.getSystemService("input_method");
        AbstractC1305a.m(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void N0(Parcel parcel, int i6, int i7) {
        parcel.writeInt(i6 | (i7 << 16));
    }

    public static int O(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(H1.a.j("Could not convert ", i6, " to BackoffPolicy"));
    }

    public static int P(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 == 3) {
            return 4;
        }
        if (i6 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i6 != 5) {
            throw new IllegalArgumentException(H1.a.j("Could not convert ", i6, " to NetworkType"));
        }
        return 6;
    }

    public static int Q(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(H1.a.j("Could not convert ", i6, " to OutOfQuotaPolicy"));
    }

    public static int R(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 == 3) {
            return 4;
        }
        if (i6 == 4) {
            return 5;
        }
        if (i6 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(H1.a.j("Could not convert ", i6, " to State"));
    }

    public static boolean S() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean T() {
        try {
            if (f12703l == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f12703l == null) {
                f12702k = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f12703l = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f12703l.invoke(null, Long.valueOf(f12702k))).booleanValue();
        } catch (Exception e6) {
            if (!(e6 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
                return false;
            }
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean U(Context context, int i6) {
        if (t0(i6, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                U1.i iVarC = U1.i.c(context);
                iVarC.getClass();
                if (packageInfo == null) {
                    return false;
                }
                if (!U1.i.f(packageInfo, false)) {
                    if (!U1.i.f(packageInfo, true)) {
                        return false;
                    }
                    if (!U1.h.a((Context) iVarC.f3595w)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean V(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f12704m == null) {
            f12704m = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f12704m.booleanValue();
        if (f12705n == null) {
            f12705n = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f12705n.booleanValue()) {
            return !S() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static final void W(W0.b bVar) {
        AbstractC1305a.o(bVar, "<this>");
        S0.f fVar = bVar.f8646P;
        try {
            for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : fVar.C().f8697c.j()) {
                W wC = fVar.C();
                wC.getClass();
                C0736a c0736a = new C0736a(wC);
                c0736a.g(abstractComponentCallbacksC0734B);
                c0736a.d(false, true);
            }
        } catch (Exception e6) {
            C0.h().a(e6);
            e6.printStackTrace();
        }
    }

    public static final void X(String str) {
        AbstractC1305a.o(str, "str");
        if (str.length() <= 4000) {
            Log.e("APP_LOG_TAG", str);
            return;
        }
        String strSubstring = str.substring(0, 4000);
        AbstractC1305a.n(strSubstring, "substring(...)");
        Log.e("APP_LOG_TAG", strSubstring);
        String strSubstring2 = str.substring(4000);
        AbstractC1305a.n(strSubstring2, "substring(...)");
        X(strSubstring2);
    }

    public static int Y(int i6, int i7, int i8) {
        if (i6 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i6 == 2) {
            return i7;
        }
        if (i6 == 4) {
            return i7 + i8;
        }
        throw new IllegalStateException(AbstractC0628i.f("Unexpected flag: ", i6));
    }

    public static void Z(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static I0.e a(byte[] r7) throws java.lang.Throwable {
        /*
            I0.e r0 = new I0.e
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            I0.d r5 = new I0.d     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f1096a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L60
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5f
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5f
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L60
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r7 = move-exception
            r7.printStackTrace()
        L5c:
            r1.close()     // Catch: java.io.IOException -> L42
        L5f:
            return r0
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.AbstractC1332d.a(byte[]):I0.e");
    }

    public static final void a0(W0.b bVar, int i6) {
        AbstractC1305a.o(bVar, "<this>");
        Intent intent = new Intent(bVar, (Class<?>) PostActivity.class);
        intent.putExtra("POST_ID", i6);
        bVar.startActivity(intent);
    }

    public static void b(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final void b0(C0363d c0363d, int i6) {
        AbstractC1305a.o(c0363d, "<this>");
        Intent intent = new Intent(c0363d.O(), (Class<?>) PostActivity.class);
        intent.putExtra("POST_ID", i6);
        c0363d.T(intent);
    }

    public static void c(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static final void c0(C1507i c1507i, String str) {
        AbstractC1305a.o(str, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        c1507i.T(intent);
    }

    public static void d(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static boolean d0(Parcel parcel, int i6) {
        M0(parcel, i6, 4);
        return parcel.readInt() != 0;
    }

    public static void e(X x5) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != x5.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + x5.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static int[] e0(ByteArrayInputStream byteArrayInputStream, int i6) {
        int[] iArr = new int[i6];
        int iM = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            iM += (int) B.m(byteArrayInputStream, 2);
            iArr[i7] = iM;
        }
        return iArr;
    }

    public static void f(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static IBinder f0(Parcel parcel, int i6) {
        int iM0 = m0(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iM0 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM0);
        return strongBinder;
    }

    public static void g(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static int g0(Parcel parcel, int i6) {
        M0(parcel, i6, 4);
        return parcel.readInt();
    }

    public static void h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static long h0(Parcel parcel, int i6) {
        M0(parcel, i6, 8);
        return parcel.readLong();
    }

    public static void i() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static C1330b[] i0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1330b[] c1330bArr) throws IOException {
        byte[] bArr3 = f12700i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f12701j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) B.m(fileInputStream, 2);
            byte[] bArrL = B.l(fileInputStream, (int) B.m(fileInputStream, 4), (int) B.m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrL);
            try {
                C1330b[] c1330bArrK0 = k0(byteArrayInputStream, bArr2, iM, c1330bArr);
                byteArrayInputStream.close();
                return c1330bArrK0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f12695d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) B.m(fileInputStream, 1);
        byte[] bArrL2 = B.l(fileInputStream, (int) B.m(fileInputStream, 4), (int) B.m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrL2);
        try {
            C1330b[] c1330bArrJ0 = j0(byteArrayInputStream2, iM2, c1330bArr);
            byteArrayInputStream2.close();
            return c1330bArrJ0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static void j(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static C1330b[] j0(ByteArrayInputStream byteArrayInputStream, int i6, C1330b[] c1330bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1330b[0];
        }
        if (i6 != c1330bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i6];
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int iM = (int) B.m(byteArrayInputStream, 2);
            iArr[i7] = (int) B.m(byteArrayInputStream, 2);
            strArr[i7] = new String(B.j(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i8 = 0; i8 < i6; i8++) {
            C1330b c1330b = c1330bArr[i8];
            if (!c1330b.f12684b.equals(strArr[i8])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i9 = iArr[i8];
            c1330b.f12687e = i9;
            c1330b.f12690h = e0(byteArrayInputStream, i9);
        }
        return c1330bArr;
    }

    public static void k(Object obj) {
        l(obj, "Argument must not be null");
    }

    public static C1330b[] k0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i6, C1330b[] c1330bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1330b[0];
        }
        if (i6 != c1330bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            B.m(byteArrayInputStream, 2);
            String str = new String(B.j(byteArrayInputStream, (int) B.m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = B.m(byteArrayInputStream, 4);
            int iM = (int) B.m(byteArrayInputStream, 2);
            C1330b c1330b = null;
            if (c1330bArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i8 = 0;
                while (true) {
                    if (i8 >= c1330bArr.length) {
                        break;
                    }
                    if (c1330bArr[i8].f12684b.equals(strSubstring)) {
                        c1330b = c1330bArr[i8];
                        break;
                    }
                    i8++;
                }
            }
            if (c1330b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1330b.f12686d = jM;
            int[] iArrE0 = e0(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f12699h)) {
                c1330b.f12687e = iM;
                c1330b.f12690h = iArrE0;
            }
        }
        return c1330bArr;
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static C1330b[] l0(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f12696e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) B.m(fileInputStream, 1);
        byte[] bArrL = B.l(fileInputStream, (int) B.m(fileInputStream, 4), (int) B.m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrL);
        try {
            C1330b[] c1330bArrN0 = n0(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return c1330bArrN0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void m(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static int m0(Parcel parcel, int i6) {
        return (i6 & (-65536)) != -65536 ? (char) (i6 >> 16) : parcel.readInt();
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static C1330b[] n0(ByteArrayInputStream byteArrayInputStream, String str, int i6) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C1330b[0];
        }
        C1330b[] c1330bArr = new C1330b[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int iM = (int) B.m(byteArrayInputStream, 2);
            int iM2 = (int) B.m(byteArrayInputStream, 2);
            c1330bArr[i7] = new C1330b(str, new String(B.j(byteArrayInputStream, iM), StandardCharsets.UTF_8), B.m(byteArrayInputStream, 4), iM2, (int) B.m(byteArrayInputStream, 4), (int) B.m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i8 = 0; i8 < i6; i8++) {
            C1330b c1330b = c1330bArr[i8];
            int iAvailable = byteArrayInputStream.available() - c1330b.f12688f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c1330b.f12691i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) B.m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) B.m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    B.m(byteArrayInputStream, 2);
                    int iM5 = (int) B.m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            B.m(byteArrayInputStream, 1);
                            for (int iM6 = (int) B.m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                B.m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1330b.f12690h = e0(byteArrayInputStream, c1330b.f12687e);
            int i9 = c1330b.f12689g;
            BitSet bitSetValueOf = BitSet.valueOf(B.j(byteArrayInputStream, (((i9 * 2) + 7) & (-8)) / 8));
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = bitSetValueOf.get(Y(2, i10, i9)) ? 2 : 0;
                if (bitSetValueOf.get(Y(4, i10, i9))) {
                    i11 |= 4;
                }
                if (i11 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i10));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i10), Integer.valueOf(i11 | num.intValue()));
                }
            }
        }
        return c1330bArr;
    }

    public static void o(String str, boolean z5) {
        if (!z5) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static int o0(File file) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i6 = byteBufferAllocate.getInt();
            channel.close();
            return i6;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }

    public static void p(boolean z5) {
        if (!z5) {
            throw new IllegalStateException();
        }
    }

    public static final void p0(View view, InterfaceC1525f interfaceC1525f) {
        AbstractC1305a.o(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC1525f);
    }

    public static int q(r0 r0Var, Q q5, View view, View view2, AbstractC1397f0 abstractC1397f0, boolean z5) {
        if (abstractC1397f0.v() == 0 || r0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return Math.abs(AbstractC1397f0.H(view) - AbstractC1397f0.H(view2)) + 1;
        }
        return Math.min(q5.g(), q5.b(view2) - q5.d(view));
    }

    public static void q0(Parcel parcel, int i6) {
        parcel.setDataPosition(parcel.dataPosition() + m0(parcel, i6));
    }

    public static int r(r0 r0Var, Q q5, View view, View view2, AbstractC1397f0 abstractC1397f0, boolean z5, boolean z6) {
        if (abstractC1397f0.v() == 0 || r0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z6 ? Math.max(0, (r0Var.b() - Math.max(AbstractC1397f0.H(view), AbstractC1397f0.H(view2))) - 1) : Math.max(0, Math.min(AbstractC1397f0.H(view), AbstractC1397f0.H(view2)));
        if (z5) {
            return Math.round((iMax * (Math.abs(q5.b(view2) - q5.d(view)) / (Math.abs(AbstractC1397f0.H(view) - AbstractC1397f0.H(view2)) + 1))) + (q5.f() - q5.d(view)));
        }
        return iMax;
    }

    public static int r0(int i6) {
        int iB = u.h.b(i6);
        if (iB == 0) {
            return 0;
        }
        int i7 = 1;
        if (iB != 1) {
            i7 = 2;
            if (iB != 2) {
                i7 = 3;
                if (iB != 3) {
                    i7 = 4;
                    if (iB != 4) {
                        if (iB == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + H1.a.B(i6) + " to int");
                    }
                }
            }
        }
        return i7;
    }

    public static int s(r0 r0Var, Q q5, View view, View view2, AbstractC1397f0 abstractC1397f0, boolean z5) {
        if (abstractC1397f0.v() == 0 || r0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return r0Var.b();
        }
        return (int) (((q5.b(view2) - q5.d(view)) / (Math.abs(AbstractC1397f0.H(view) - AbstractC1397f0.H(view2)) + 1)) * r0Var.b());
    }

    /* JADX WARN: Finally extract failed */
    public static boolean s0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1330b[] c1330bArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f12695d;
        int i6 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f12696e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrV = v(c1330bArr, bArr3);
                B.u(byteArrayOutputStream, c1330bArr.length, 1);
                B.u(byteArrayOutputStream, bArrV.length, 4);
                byte[] bArrC = B.c(bArrV);
                B.u(byteArrayOutputStream, bArrC.length, 4);
                byteArrayOutputStream.write(bArrC);
                return true;
            }
            byte[] bArr4 = f12698g;
            if (Arrays.equals(bArr, bArr4)) {
                B.u(byteArrayOutputStream, c1330bArr.length, 1);
                for (C1330b c1330b : c1330bArr) {
                    int size = c1330b.f12691i.size() * 4;
                    String strF = F(c1330b.f12683a, c1330b.f12684b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    B.v(byteArrayOutputStream, strF.getBytes(charset).length);
                    B.v(byteArrayOutputStream, c1330b.f12690h.length);
                    B.u(byteArrayOutputStream, size, 4);
                    B.u(byteArrayOutputStream, c1330b.f12685c, 4);
                    byteArrayOutputStream.write(strF.getBytes(charset));
                    Iterator it = c1330b.f12691i.keySet().iterator();
                    while (it.hasNext()) {
                        B.v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        B.v(byteArrayOutputStream, 0);
                    }
                    for (int i7 : c1330b.f12690h) {
                        B.v(byteArrayOutputStream, i7);
                    }
                }
                return true;
            }
            byte[] bArr5 = f12697f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrV2 = v(c1330bArr, bArr5);
                B.u(byteArrayOutputStream, c1330bArr.length, 1);
                B.u(byteArrayOutputStream, bArrV2.length, 4);
                byte[] bArrC2 = B.c(bArrV2);
                B.u(byteArrayOutputStream, bArrC2.length, 4);
                byteArrayOutputStream.write(bArrC2);
                return true;
            }
            byte[] bArr6 = f12699h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            B.v(byteArrayOutputStream, c1330bArr.length);
            for (C1330b c1330b2 : c1330bArr) {
                String strF2 = F(c1330b2.f12683a, c1330b2.f12684b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                B.v(byteArrayOutputStream, strF2.getBytes(charset2).length);
                TreeMap treeMap = c1330b2.f12691i;
                B.v(byteArrayOutputStream, treeMap.size());
                B.v(byteArrayOutputStream, c1330b2.f12690h.length);
                B.u(byteArrayOutputStream, c1330b2.f12685c, 4);
                byteArrayOutputStream.write(strF2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    B.v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i8 : c1330b2.f12690h) {
                    B.v(byteArrayOutputStream, i8);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            B.v(byteArrayOutputStream2, c1330bArr.length);
            int i9 = 2;
            int i10 = 2;
            for (C1330b c1330b3 : c1330bArr) {
                B.u(byteArrayOutputStream2, c1330b3.f12685c, 4);
                B.u(byteArrayOutputStream2, c1330b3.f12686d, 4);
                B.u(byteArrayOutputStream2, c1330b3.f12689g, 4);
                String strF3 = F(c1330b3.f12683a, c1330b3.f12684b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strF3.getBytes(charset3).length;
                B.v(byteArrayOutputStream2, length2);
                i10 = i10 + 14 + length2;
                byteArrayOutputStream2.write(strF3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i10 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c1330bArr.length) {
                try {
                    C1330b c1330b4 = c1330bArr[i11];
                    B.v(byteArrayOutputStream3, i11);
                    B.v(byteArrayOutputStream3, c1330b4.f12687e);
                    i12 = i12 + 4 + (c1330b4.f12687e * 2);
                    int[] iArr = c1330b4.f12690h;
                    int length3 = iArr.length;
                    int i13 = i6;
                    while (i6 < length3) {
                        int i14 = iArr[i6];
                        B.v(byteArrayOutputStream3, i14 - i13);
                        i6++;
                        i13 = i14;
                    }
                    i11++;
                    i6 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < c1330bArr.length) {
                try {
                    C1330b c1330b5 = c1330bArr[i15];
                    Iterator it3 = c1330b5.f12691i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        B0(byteArrayOutputStream4, c1330b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            C0(byteArrayOutputStream4, c1330b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            B.v(byteArrayOutputStream3, i15);
                            int length4 = byteArray3.length + i9 + byteArray4.length;
                            int i17 = i16 + 6;
                            ArrayList arrayList4 = arrayList3;
                            B.u(byteArrayOutputStream3, length4, 4);
                            B.v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i16 = i17 + length4;
                            i15++;
                            arrayList3 = arrayList4;
                            i9 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + ((long) (arrayList2.size() * 16));
            int i18 = 4;
            B.u(byteArrayOutputStream, arrayList2.size(), 4);
            int i19 = 0;
            while (i19 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i19);
                B.u(byteArrayOutputStream, AbstractC0628i.d(kVar4.f12716a), i18);
                B.u(byteArrayOutputStream, size2, i18);
                boolean z5 = kVar4.f12718c;
                byte[] bArr7 = kVar4.f12717b;
                if (z5) {
                    long length5 = bArr7.length;
                    byte[] bArrC3 = B.c(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrC3);
                    B.u(byteArrayOutputStream, bArrC3.length, 4);
                    B.u(byteArrayOutputStream, length5, 4);
                    length = bArrC3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    B.u(byteArrayOutputStream, bArr7.length, 4);
                    B.u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i19++;
                arrayList5 = arrayList;
                i18 = 4;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static com.bumptech.glide.j t(com.bumptech.glide.b bVar, List list, com.bumptech.glide.d dVar) {
        o c1297f;
        o c1292a;
        int i6;
        String str;
        int i7;
        InterfaceC1006d interfaceC1006d = bVar.f6296w;
        com.bumptech.glide.f fVar = bVar.f6298y;
        Context applicationContext = fVar.getApplicationContext();
        I0.f fVar2 = fVar.f6338h;
        com.bumptech.glide.j jVar = new com.bumptech.glide.j();
        m mVar = new m();
        C1486b c1486b = jVar.f6352g;
        synchronized (c1486b) {
            c1486b.f13667a.add(mVar);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 27) {
            v vVar = new v();
            C1486b c1486b2 = jVar.f6352g;
            synchronized (c1486b2) {
                c1486b2.f13667a.add(vVar);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListD = jVar.d();
        C1010h c1010h = bVar.f6299z;
        C1357a c1357a = new C1357a(applicationContext, arrayListD, interfaceC1006d, c1010h);
        I i9 = new I(interfaceC1006d, new I0.o(18));
        r rVar = new r(jVar.d(), resources.getDisplayMetrics(), interfaceC1006d, c1010h);
        int i10 = 0;
        int i11 = 2;
        if (i8 < 28 || !fVar2.f1097a.containsKey(com.bumptech.glide.c.class)) {
            c1297f = new C1297f(rVar, i10);
            c1292a = new C1292a(rVar, i11, c1010h);
        } else {
            c1292a = new C1298g(1);
            c1297f = new C1298g(0);
        }
        int i12 = 29;
        if (i8 >= 28) {
            i6 = i8;
            jVar.a(new C1338a(new C0396c2(arrayListD, i12, c1010h), 1), InputStream.class, Drawable.class, "Animation");
            jVar.a(new C1338a(new C0396c2(arrayListD, 29, c1010h), 0), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            i6 = i8;
        }
        C1341d c1341d = new C1341d(applicationContext);
        C1293b c1293b = new C1293b(c1010h);
        T1.j jVar2 = new T1.j(3);
        V0.m mVar2 = new V0.m(19);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        I0.o oVar = new I0.o(11);
        C1419c c1419c = jVar.f6347b;
        synchronized (c1419c) {
            c1419c.f13295a.add(new C1485a(ByteBuffer.class, oVar));
        }
        C1243i c1243i = new C1243i(1, c1010h);
        C1419c c1419c2 = jVar.f6347b;
        synchronized (c1419c2) {
            c1419c2.f13295a.add(new C1485a(InputStream.class, c1243i));
        }
        jVar.a(c1297f, ByteBuffer.class, Bitmap.class, "Bitmap");
        jVar.a(c1292a, InputStream.class, Bitmap.class, "Bitmap");
        String str2 = Build.FINGERPRINT;
        if (!"robolectric".equals(str2)) {
            str = "Animation";
            jVar.a(new C1297f(rVar, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        } else {
            str = "Animation";
        }
        jVar.a(new I(interfaceC1006d, new V0.m()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        jVar.a(i9, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        G g4 = G.f12232w;
        jVar.c(Bitmap.class, Bitmap.class, g4);
        jVar.a(new s1.E(0), Bitmap.class, Bitmap.class, "Bitmap");
        jVar.b(Bitmap.class, c1293b);
        jVar.a(new C1292a(resources, c1297f), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.a(new C1292a(resources, c1292a), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.a(new C1292a(resources, i9), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.b(BitmapDrawable.class, new C0396c2(interfaceC1006d, 27, c1293b));
        C1367k c1367k = new C1367k(arrayListD, c1357a, c1010h);
        String str3 = str;
        jVar.a(c1367k, InputStream.class, C1360d.class, str3);
        jVar.a(c1357a, ByteBuffer.class, C1360d.class, str3);
        jVar.b(C1360d.class, new I0.o(19));
        jVar.c(InterfaceC0827a.class, InterfaceC0827a.class, g4);
        jVar.a(new C1294c(interfaceC1006d), InterfaceC0827a.class, Bitmap.class, "Bitmap");
        jVar.a(c1341d, Uri.class, Drawable.class, "legacy_append");
        jVar.a(new C1292a(c1341d, 1, interfaceC1006d), Uri.class, Bitmap.class, "legacy_append");
        jVar.g(new com.bumptech.glide.load.data.h(2));
        jVar.c(File.class, ByteBuffer.class, new V0.m(11));
        jVar.c(File.class, InputStream.class, new K2.f(1));
        jVar.a(new s1.E(2), File.class, File.class, "legacy_append");
        jVar.c(File.class, ParcelFileDescriptor.class, new K2.f(0));
        jVar.c(File.class, File.class, g4);
        jVar.g(new com.bumptech.glide.load.data.m(c1010h));
        if (!"robolectric".equals(str2)) {
            jVar.g(new com.bumptech.glide.load.data.h(1));
        }
        int i13 = 0;
        C0878a c0878a = new C0878a(applicationContext, 4, i13);
        C0878a c0878a2 = new C0878a(applicationContext, 3, i13);
        C1244j c1244j = new C1244j(applicationContext, i13);
        Class cls = Integer.TYPE;
        jVar.c(cls, InputStream.class, c0878a);
        jVar.c(Integer.class, InputStream.class, c0878a);
        jVar.c(cls, AssetFileDescriptor.class, c0878a2);
        jVar.c(Integer.class, AssetFileDescriptor.class, c0878a2);
        jVar.c(cls, Drawable.class, c1244j);
        jVar.c(Integer.class, Drawable.class, c1244j);
        int i14 = 0;
        jVar.c(Uri.class, InputStream.class, new C0878a(applicationContext, 5, i14));
        jVar.c(Uri.class, AssetFileDescriptor.class, new C1244j(applicationContext, 2));
        D d6 = new D(resources, 1);
        D d7 = new D(resources, i14);
        p1.E e6 = new p1.E(resources, 0);
        jVar.c(Integer.class, Uri.class, d6);
        jVar.c(cls, Uri.class, d6);
        jVar.c(Integer.class, AssetFileDescriptor.class, d7);
        jVar.c(cls, AssetFileDescriptor.class, d7);
        jVar.c(Integer.class, InputStream.class, e6);
        jVar.c(cls, InputStream.class, e6);
        jVar.c(String.class, InputStream.class, new C1243i(0));
        jVar.c(Uri.class, InputStream.class, new C1243i(0));
        int i15 = 14;
        jVar.c(String.class, InputStream.class, new V0.m(i15));
        jVar.c(String.class, ParcelFileDescriptor.class, new I0.o(i15));
        jVar.c(String.class, AssetFileDescriptor.class, new V0.m(13));
        jVar.c(Uri.class, InputStream.class, new L3.c(28, applicationContext.getAssets()));
        jVar.c(Uri.class, AssetFileDescriptor.class, new S0.f(23, applicationContext.getAssets()));
        int i16 = 0;
        jVar.c(Uri.class, InputStream.class, new C0878a(applicationContext, 6, i16));
        jVar.c(Uri.class, InputStream.class, new C1244j(applicationContext, 3));
        if (i6 >= 29) {
            i7 = 1;
            jVar.c(Uri.class, InputStream.class, new q1.b(applicationContext, 1));
            jVar.c(Uri.class, ParcelFileDescriptor.class, new q1.b(applicationContext, 0));
        } else {
            i7 = 1;
        }
        jVar.c(Uri.class, InputStream.class, new p1.I(contentResolver, i7));
        jVar.c(Uri.class, ParcelFileDescriptor.class, new C1243i(2, contentResolver));
        jVar.c(Uri.class, AssetFileDescriptor.class, new p1.I(contentResolver, i16));
        int i17 = 15;
        jVar.c(Uri.class, InputStream.class, new I0.o(i17));
        jVar.c(URL.class, InputStream.class, new V0.m(i17));
        jVar.c(Uri.class, File.class, new C1244j(applicationContext, 1));
        jVar.c(p1.o.class, InputStream.class, new C1243i(3));
        int i18 = 10;
        jVar.c(byte[].class, ByteBuffer.class, new I0.o(i18));
        jVar.c(byte[].class, InputStream.class, new V0.m(i18));
        jVar.c(Uri.class, Uri.class, g4);
        jVar.c(Drawable.class, Drawable.class, g4);
        jVar.a(new s1.E(1), Drawable.class, Drawable.class, "legacy_append");
        jVar.h(Bitmap.class, BitmapDrawable.class, new p1.E(resources, 1));
        jVar.h(Bitmap.class, byte[].class, jVar2);
        jVar.h(Drawable.class, byte[].class, new C0803c(interfaceC1006d, jVar2, mVar2, 22));
        jVar.h(C1360d.class, byte[].class, mVar2);
        I i19 = new I(interfaceC1006d, new I0.o(17));
        jVar.a(i19, ByteBuffer.class, Bitmap.class, "legacy_append");
        jVar.a(new C1292a(resources, i19), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
        if (dVar != null) {
            dVar.v();
        }
        return jVar;
    }

    public static boolean t0(int i6, Context context, String str) {
        C1244j c1244jA = C0652c.a(context);
        c1244jA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) c1244jA.f12256x.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i6, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static Bundle u(Parcel parcel, int i6) {
        int iM0 = m0(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iM0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM0);
        return bundle;
    }

    public static int u0(Parcel parcel) {
        int i6 = parcel.readInt();
        int iM0 = m0(parcel, i6);
        char c6 = (char) i6;
        int iDataPosition = parcel.dataPosition();
        if (c6 != 20293) {
            throw new Y1.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i6))), parcel);
        }
        int i7 = iM0 + iDataPosition;
        if (i7 < iDataPosition || i7 > parcel.dataSize()) {
            throw new Y1.b(H1.a.k("Size read is invalid start=", iDataPosition, " end=", i7), parcel);
        }
        return i7;
    }

    public static byte[] v(C1330b[] c1330bArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C1330b c1330b : c1330bArr) {
            length += ((((c1330b.f12689g * 2) + 7) & (-8)) / 8) + (c1330b.f12687e * 2) + F(c1330b.f12683a, c1330b.f12684b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1330b.f12688f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f12697f)) {
            for (C1330b c1330b2 : c1330bArr) {
                A0(byteArrayOutputStream, c1330b2, F(c1330b2.f12683a, c1330b2.f12684b, bArr));
                C0(byteArrayOutputStream, c1330b2);
                int[] iArr = c1330b2.f12690h;
                int length2 = iArr.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr[i6];
                    B.v(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                B0(byteArrayOutputStream, c1330b2);
            }
        } else {
            for (C1330b c1330b3 : c1330bArr) {
                A0(byteArrayOutputStream, c1330b3, F(c1330b3.f12683a, c1330b3.f12684b, bArr));
            }
            for (C1330b c1330b4 : c1330bArr) {
                C0(byteArrayOutputStream, c1330b4);
                int[] iArr2 = c1330b4.f12690h;
                int length3 = iArr2.length;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length3) {
                    int i11 = iArr2[i9];
                    B.v(byteArrayOutputStream, i11 - i10);
                    i9++;
                    i10 = i11;
                }
                B0(byteArrayOutputStream, c1330b4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final void v0(View view, boolean z5) {
        if (z5) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public static Parcelable w(Parcel parcel, int i6, Parcelable.Creator creator) {
        int iM0 = m0(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iM0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM0);
        return parcelable;
    }

    public static final void w0(LinearProgressIndicator linearProgressIndicator, boolean z5) {
        if (z5) {
            linearProgressIndicator.setVisibility(0);
        } else {
            linearProgressIndicator.setVisibility(8);
        }
    }

    public static String x(Parcel parcel, int i6) {
        int iM0 = m0(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iM0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM0);
        return string;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static V0.k x0(ImageView imageView) {
        com.bumptech.glide.o oVarC;
        Context context = imageView.getContext();
        l(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        C1469m c1469m = com.bumptech.glide.b.a(context).f6293A;
        c1469m.getClass();
        char[] cArr = n.f134a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            oVarC = c1469m.c(imageView.getContext().getApplicationContext());
        } else {
            l(imageView.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity activityA = C1469m.a(imageView.getContext());
            if (activityA != null && (activityA instanceof E)) {
                E e6 = (E) activityA;
                C1280b c1280b = c1469m.f13576y;
                c1280b.clear();
                C1469m.b(e6.f8646P.C().f8697c.j(), c1280b);
                View viewFindViewById = e6.findViewById(android.R.id.content);
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = null;
                for (View view = imageView; !view.equals(viewFindViewById) && (abstractComponentCallbacksC0734B = (AbstractComponentCallbacksC0734B) c1280b.getOrDefault(view, null)) == null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                }
                c1280b.clear();
                oVarC = abstractComponentCallbacksC0734B != null ? c1469m.d(abstractComponentCallbacksC0734B) : c1469m.e(e6);
            } else {
                oVarC = c1469m.c(imageView.getContext().getApplicationContext());
            }
        }
        return (V0.k) oVarC;
    }

    public static Object[] y(Parcel parcel, int i6, Parcelable.Creator creator) {
        int iM0 = m0(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iM0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM0);
        return objArrCreateTypedArray;
    }

    public static void y0(Parcel parcel, int i6, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iJ0 = J0(parcel, i6);
        parcel.writeBundle(bundle);
        L0(parcel, iJ0);
    }

    public static void z(String str, String str2, Object obj) {
        String strJ = J(str);
        if (Log.isLoggable(strJ, 3)) {
            Log.d(strJ, String.format(str2, obj));
        }
    }

    public static void z0(Parcel parcel, int i6, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iJ0 = J0(parcel, i6);
        parcel.writeStrongBinder(iBinder);
        L0(parcel, iJ0);
    }
}
