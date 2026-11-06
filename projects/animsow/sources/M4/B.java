package M4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import d.AbstractC0628i;
import j3.C0848A;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import m.C0986t;
import m.j1;
import m.l1;
import o0.G0;
import o0.h1;
import o0.k1;
import org.xmlpull.v1.XmlPullParserException;
import q0.C1256a;
import s4.AbstractC1305a;
import s4.AbstractC1313i;
import t.C1325h;
import t.C1327j;
import t.C1328k;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0848A f1836a = new C0848A(2, "RESUME_TOKEN");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0848A f1837b = new C0848A(2, "REMOVED_TASK");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0848A f1838c = new C0848A(2, "CLOSED_EMPTY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0848A f1839d = new C0848A(2, "COMPLETING_ALREADY");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0848A f1840e = new C0848A(2, "COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0848A f1841f = new C0848A(2, "COMPLETING_RETRY");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0848A f1842g = new C0848A(2, "TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0848A f1843h = new C0848A(2, "SEALED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L f1844i = new L(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final L f1845j = new L(true);

    public static final Object a(h1 h1Var, int i6) {
        if (i6 >= 0) {
            G0 g02 = (G0) h1Var;
            if (i6 < g02.e()) {
                int i7 = i6 - g02.f11765c;
                if (i7 < 0 || i7 >= g02.f11764b) {
                    return null;
                }
                return g02.b(i7);
            }
        }
        StringBuilder sbL = H1.a.l("Index: ", i6, ", Size: ");
        sbL.append(((G0) h1Var).e());
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public static C1327j b(F f6) {
        C1325h c1325h = new C1325h();
        c1325h.f12670c = new C1328k();
        C1327j c1327j = new C1327j(c1325h);
        c1325h.f12669b = c1327j;
        c1325h.f12668a = C1256a.class;
        try {
            f6.O(new k1(c1325h, 2, f6));
            c1325h.f12668a = "Deferred.asListenableFuture";
        } catch (Exception e6) {
            c1327j.f12674x.j(e6);
        }
        return c1327j;
    }

    public static byte[] c(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final String d(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static Intent e(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strG = g(activity, activity.getComponentName());
            if (strG == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strG);
            try {
                return g(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strG + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static Intent f(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strG = g(context, componentName);
        if (strG == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strG);
        return g(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String g(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static F.f h(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C.a.f102b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    r(xmlResourceParser);
                }
                return new F.i(new C0986t(string, string2, string3, k(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C.a.f103c);
                        int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z5 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
                        int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i9);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            r(xmlResourceParser);
                        }
                        arrayList.add(new F.h(i6, i8, resourceId2, string6, string5, z5));
                    } else {
                        r(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new F.g((F.h[]) arrayList.toArray(new F.h[0]));
            }
        } else {
            r(xmlResourceParser);
        }
        return null;
    }

    public static Z.c i(String str, X.a aVar, int i6) {
        if ((i6 & 2) != 0) {
            aVar = null;
        }
        Z.a aVar2 = Z.a.f4902x;
        S4.d dVar = J.f1852b;
        s0 s0Var = new s0(null);
        dVar.getClass();
        R4.e eVarC = S3.a.c(AbstractC1305a.Q(dVar, s0Var));
        AbstractC1305a.o(str, "name");
        return new Z.c(str, aVar, aVar2, eVarC);
    }

    public static byte[] j(InputStream inputStream, int i6) throws IOException {
        byte[] bArr = new byte[i6];
        int i7 = 0;
        while (i7 < i6) {
            int i8 = inputStream.read(bArr, i7, i6 - i7);
            if (i8 < 0) {
                throw new IllegalStateException(AbstractC0628i.f("Not enough bytes to read: ", i6));
            }
            i7 += i8;
        }
        return bArr;
    }

    public static List k(Resources resources, int i6) {
        if (i6 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i6);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (F.e.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i7 = 0; i7 < typedArrayObtainTypedArray.length(); i7++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i7, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i6);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static byte[] l(FileInputStream fileInputStream, int i6, int i7) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i7];
            byte[] bArr2 = new byte[2048];
            int i8 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i8 < i6) {
                int i9 = fileInputStream.read(bArr2);
                if (i9 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i6 + " bytes");
                }
                inflater.setInput(bArr2, 0, i9);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i7 - iInflate);
                    i8 += i9;
                } catch (DataFormatException e6) {
                    throw new IllegalStateException(e6.getMessage());
                }
            }
            if (i8 == i6) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i6 + " actual=" + i8);
        } finally {
            inflater.end();
        }
    }

    public static long m(InputStream inputStream, int i6) {
        byte[] bArrJ = j(inputStream, i6);
        long j6 = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            j6 += ((long) (bArrJ[i7] & 255)) << (i7 * 8);
        }
        return j6;
    }

    public static void n(Drawable drawable, int i6) {
        H.a.g(drawable, i6);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        H.a.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        H.a.i(drawable, mode);
    }

    public static void q(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            j1.a(view, charSequence);
            return;
        }
        l1 l1Var = l1.f10307G;
        if (l1Var != null && l1Var.f10315w == view) {
            l1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new l1(view, charSequence);
            return;
        }
        l1 l1Var2 = l1.f10308H;
        if (l1Var2 != null && l1Var2.f10315w == view) {
            l1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void r(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i6 = 1;
        while (i6 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i6++;
            } else if (next == 3) {
                i6--;
            }
        }
    }

    public static final String s(InterfaceC1427e interfaceC1427e) {
        Object objM;
        if (interfaceC1427e instanceof R4.h) {
            return interfaceC1427e.toString();
        }
        try {
            objM = interfaceC1427e + '@' + d(interfaceC1427e);
        } catch (Throwable th) {
            objM = S3.a.m(th);
        }
        if (AbstractC1313i.a(objM) != null) {
            objM = interfaceC1427e.getClass().getName() + '@' + d(interfaceC1427e);
        }
        return (String) objM;
    }

    public static final Object t(Object obj) {
        V v5;
        W w5 = obj instanceof W ? (W) obj : null;
        return (w5 == null || (v5 = w5.f1868a) == null) ? obj : v5;
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j6, int i6) {
        byte[] bArr = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i7] = (byte) ((j6 >> (i7 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i6) {
        u(byteArrayOutputStream, i6, 2);
    }
}
