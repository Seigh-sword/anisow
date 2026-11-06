package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import d.AbstractC0628i;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import v.AbstractC1371a;
import y.AbstractC1493a;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f14045d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f14046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f14047f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f14048a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14049b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14050c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14046e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f14047f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(C1510a c1510a, String str) {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = c1510a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i6 = 0;
        int i7 = 0;
        while (i6 < strArrSplit.length) {
            String strTrim = strArrSplit[i6].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1510a.isInEditMode() && (c1510a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1510a.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f5277I) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f5277I.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i7] = iIntValue;
            i6++;
            i7++;
        }
        return i7 != strArrSplit.length ? Arrays.copyOf(iArr, i7) : iArr;
    }

    public static C1518i d(Context context, AttributeSet attributeSet, boolean z5) {
        int i6;
        String str;
        String str2;
        SparseIntArray sparseIntArray;
        String string;
        int i7;
        String str3;
        int dimensionPixelOffset;
        int i8;
        float dimension;
        int i9;
        int i10;
        String string2;
        float f6;
        int i11;
        int i12;
        boolean z6;
        int i13;
        int i14;
        int integer;
        StringBuilder sb;
        int i15;
        C1518i c1518i = new C1518i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5 ? r.f14054c : r.f14052a);
        int[] iArr = f14045d;
        SparseIntArray sparseIntArray2 = f14046e;
        String[] strArr = AbstractC1371a.f12931a;
        l lVar = c1518i.f13944b;
        m mVar = c1518i.f13947e;
        k kVar = c1518i.f13945c;
        C1519j c1519j = c1518i.f13946d;
        String str4 = "Unknown attribute 0x";
        if (z5) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C1517h c1517h = new C1517h();
            c1517h.f13931a = new int[10];
            c1517h.f13932b = new int[10];
            c1517h.f13933c = 0;
            c1517h.f13934d = new int[10];
            c1517h.f13935e = new float[10];
            c1517h.f13936f = 0;
            c1517h.f13937g = new int[5];
            c1517h.f13938h = new String[5];
            c1517h.f13939i = 0;
            c1517h.f13940j = new int[4];
            c1517h.f13941k = new boolean[4];
            c1517h.f13942l = 0;
            kVar.getClass();
            c1519j.getClass();
            lVar.getClass();
            mVar.getClass();
            int i16 = 0;
            while (i16 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i16);
                int i17 = indexCount;
                switch (f14047f.get(index)) {
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                        str3 = str4;
                        c1517h.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13958I));
                        break;
                    case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        sb = new StringBuilder(str4);
                        str3 = str4;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray2.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case Z.j.STRING_FIELD_NUMBER /* 5 */:
                        str3 = str4;
                        c1517h.c(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1519j.f13952C);
                        i8 = 6;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1519j.f13953D);
                        i8 = 7;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13959J);
                        i8 = 8;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 11:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13965P);
                        i8 = 11;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 12:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13966Q);
                        i8 = 12;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 13:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13962M);
                        i8 = 13;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 14:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13964O);
                        i8 = 14;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 15:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13967R);
                        i8 = 15;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 16:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13963N);
                        i8 = 16;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 17:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1519j.f13982d);
                        i8 = 17;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 18:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1519j.f13984e);
                        i8 = 18;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 19:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c1519j.f13986f);
                        i9 = 19;
                        c1517h.a(i9, dimension);
                        break;
                    case 20:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c1519j.f14013w);
                        i9 = 20;
                        c1517h.a(i9, dimension);
                        break;
                    case 21:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1519j.f13980c);
                        i8 = 21;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 22:
                        str3 = str4;
                        dimensionPixelOffset = iArr[typedArrayObtainStyledAttributes.getInt(index, lVar.f14027a)];
                        i8 = 22;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 23:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1519j.f13978b);
                        i8 = 23;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 24:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13955F);
                        i8 = 24;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 27:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c1519j.f13954E);
                        i8 = 27;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 28:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13956G);
                        i8 = 28;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 31:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13960K);
                        i8 = 31;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 34:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13957H);
                        i8 = 34;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 37:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c1519j.f14014x);
                        i9 = 37;
                        c1517h.a(i9, dimension);
                        break;
                    case 38:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getResourceId(index, c1518i.f13943a);
                        c1518i.f13943a = dimensionPixelOffset;
                        i8 = 38;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 39:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c1519j.f13970U);
                        i9 = 39;
                        c1517h.a(i9, dimension);
                        break;
                    case 40:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c1519j.f13969T);
                        i9 = 40;
                        c1517h.a(i9, dimension);
                        break;
                    case 41:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c1519j.f13971V);
                        i8 = 41;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 42:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c1519j.f13972W);
                        i8 = 42;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 43:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, lVar.f14029c);
                        i9 = 43;
                        c1517h.a(i9, dimension);
                        break;
                    case 44:
                        str3 = str4;
                        c1517h.d(44, true);
                        c1517h.a(44, typedArrayObtainStyledAttributes.getDimension(index, mVar.f14044m));
                        break;
                    case 45:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, mVar.f14033b);
                        i9 = 45;
                        c1517h.a(i9, dimension);
                        break;
                    case 46:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, mVar.f14034c);
                        i9 = 46;
                        c1517h.a(i9, dimension);
                        break;
                    case 47:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, mVar.f14035d);
                        i9 = 47;
                        c1517h.a(i9, dimension);
                        break;
                    case 48:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, mVar.f14036e);
                        i9 = 48;
                        c1517h.a(i9, dimension);
                        break;
                    case 49:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, mVar.f14037f);
                        i9 = 49;
                        c1517h.a(i9, dimension);
                        break;
                    case 50:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, mVar.f14038g);
                        i9 = 50;
                        c1517h.a(i9, dimension);
                        break;
                    case 51:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, mVar.f14040i);
                        i9 = 51;
                        c1517h.a(i9, dimension);
                        break;
                    case 52:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, mVar.f14041j);
                        i9 = 52;
                        c1517h.a(i9, dimension);
                        break;
                    case 53:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, mVar.f14042k);
                        i9 = 53;
                        c1517h.a(i9, dimension);
                        break;
                    case 54:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c1519j.f13973X);
                        i8 = 54;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 55:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c1519j.f13974Y);
                        i8 = 55;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 56:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13975Z);
                        i8 = 56;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 57:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13977a0);
                        i8 = 57;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 58:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13979b0);
                        i8 = 58;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 59:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13981c0);
                        i8 = 59;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 60:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, mVar.f14032a);
                        i9 = 60;
                        c1517h.a(i9, dimension);
                        break;
                    case 62:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13950A);
                        i8 = 62;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 63:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, c1519j.f13951B);
                        i9 = 63;
                        c1517h.a(i9, dimension);
                        break;
                    case 64:
                        str3 = str4;
                        dimensionPixelOffset = f(typedArrayObtainStyledAttributes, index, kVar.f14018a);
                        i8 = 64;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 65:
                        str3 = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            string2 = typedArrayObtainStyledAttributes.getString(index);
                            i10 = 65;
                        } else {
                            i10 = 65;
                            string2 = strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        c1517h.c(i10, string2);
                        break;
                    case 66:
                        str3 = str4;
                        c1517h.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.f14022e);
                        i9 = 67;
                        c1517h.a(i9, dimension);
                        break;
                    case 68:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, lVar.f14030d);
                        i9 = 68;
                        c1517h.a(i9, dimension);
                        break;
                    case 69:
                        str3 = str4;
                        f6 = 1.0f;
                        i11 = 69;
                        c1517h.a(i11, typedArrayObtainStyledAttributes.getFloat(index, f6));
                        break;
                    case 70:
                        str3 = str4;
                        i11 = 70;
                        f6 = 1.0f;
                        c1517h.a(i11, typedArrayObtainStyledAttributes.getFloat(index, f6));
                        break;
                    case 71:
                        str3 = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c1519j.f13987f0);
                        i8 = 72;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 73:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13989g0);
                        i8 = 73;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 74:
                        str3 = str4;
                        i12 = 74;
                        c1517h.c(i12, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        str3 = str4;
                        z6 = typedArrayObtainStyledAttributes.getBoolean(index, c1519j.f14003n0);
                        i13 = 75;
                        c1517h.d(i13, z6);
                        break;
                    case 76:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, kVar.f14020c);
                        i8 = 76;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 77:
                        str3 = str4;
                        i12 = 77;
                        c1517h.c(i12, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, lVar.f14028b);
                        i8 = 78;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 79:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.f14021d);
                        i9 = 79;
                        c1517h.a(i9, dimension);
                        break;
                    case 80:
                        str3 = str4;
                        z6 = typedArrayObtainStyledAttributes.getBoolean(index, c1519j.f13999l0);
                        i13 = 80;
                        c1517h.d(i13, z6);
                        break;
                    case 81:
                        str3 = str4;
                        z6 = typedArrayObtainStyledAttributes.getBoolean(index, c1519j.f14001m0);
                        i13 = 81;
                        c1517h.d(i13, z6);
                        break;
                    case 82:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInteger(index, kVar.f14019b);
                        i8 = 82;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 83:
                        str3 = str4;
                        dimensionPixelOffset = f(typedArrayObtainStyledAttributes, index, mVar.f14039h);
                        i8 = 83;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 84:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInteger(index, kVar.f14024g);
                        i8 = 84;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 85:
                        str3 = str4;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, kVar.f14023f);
                        i9 = 85;
                        c1517h.a(i9, dimension);
                        break;
                    case 86:
                        str3 = str4;
                        int i18 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i18 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            kVar.f14026i = resourceId;
                            c1517h.b(89, resourceId);
                            if (kVar.f14026i != -1) {
                                dimensionPixelOffset = -2;
                                i8 = 88;
                                c1517h.b(i8, dimensionPixelOffset);
                            }
                        } else {
                            if (i18 == 3) {
                                String string3 = typedArrayObtainStyledAttributes.getString(index);
                                kVar.f14025h = string3;
                                c1517h.c(90, string3);
                                if (kVar.f14025h.indexOf("/") > 0) {
                                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    kVar.f14026i = resourceId2;
                                    c1517h.b(89, resourceId2);
                                    c1517h.b(88, -2);
                                } else {
                                    integer = -1;
                                    i14 = 88;
                                }
                            } else {
                                i14 = 88;
                                integer = typedArrayObtainStyledAttributes.getInteger(index, kVar.f14026i);
                            }
                            c1517h.b(i14, integer);
                        }
                        break;
                    case 87:
                        str3 = str4;
                        sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray2.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 93:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13961L);
                        i8 = 93;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 94:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1519j.f13968S);
                        i8 = 94;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 95:
                        str3 = str4;
                        i15 = 0;
                        g(c1517h, typedArrayObtainStyledAttributes, index, i15);
                        break;
                    case 96:
                        str3 = str4;
                        i15 = 1;
                        g(c1517h, typedArrayObtainStyledAttributes, index, i15);
                        break;
                    case 97:
                        str3 = str4;
                        dimensionPixelOffset = typedArrayObtainStyledAttributes.getInt(index, c1519j.f14005o0);
                        i8 = 97;
                        c1517h.b(i8, dimensionPixelOffset);
                        break;
                    case 98:
                        str3 = str4;
                        int i19 = AbstractC1493a.f13689O;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c1518i.f13943a = typedArrayObtainStyledAttributes.getResourceId(index, c1518i.f13943a);
                        }
                        break;
                    case 99:
                        str3 = str4;
                        z6 = typedArrayObtainStyledAttributes.getBoolean(index, c1519j.f13988g);
                        i13 = 99;
                        c1517h.d(i13, z6);
                        break;
                }
                i16++;
                indexCount = i17;
                str4 = str3;
            }
        } else {
            String str5 = "CURRENTLY UNSUPPORTED";
            String str6 = "Unknown attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i20 = 0;
            while (i20 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i20);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    kVar.getClass();
                    c1519j.getClass();
                    lVar.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray2.get(index2)) {
                    case 1:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14006p = f(typedArrayObtainStyledAttributes, index2, c1519j.f14006p);
                        break;
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13958I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13958I);
                        break;
                    case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14004o = f(typedArrayObtainStyledAttributes, index2, c1519j.f14004o);
                        break;
                    case Z.j.LONG_FIELD_NUMBER /* 4 */:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14002n = f(typedArrayObtainStyledAttributes, index2, c1519j.f14002n);
                        break;
                    case Z.j.STRING_FIELD_NUMBER /* 5 */:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14015y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13952C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1519j.f13952C);
                        break;
                    case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13953D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1519j.f13953D);
                        break;
                    case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13959J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13959J);
                        break;
                    case 9:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14012v = f(typedArrayObtainStyledAttributes, index2, c1519j.f14012v);
                        break;
                    case 10:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14011u = f(typedArrayObtainStyledAttributes, index2, c1519j.f14011u);
                        break;
                    case 11:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13965P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13965P);
                        break;
                    case 12:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13966Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13966Q);
                        break;
                    case 13:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13962M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13962M);
                        break;
                    case 14:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13964O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13964O);
                        break;
                    case 15:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13967R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13967R);
                        break;
                    case 16:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13963N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13963N);
                        break;
                    case 17:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13982d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1519j.f13982d);
                        break;
                    case 18:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13984e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1519j.f13984e);
                        break;
                    case 19:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13986f = typedArrayObtainStyledAttributes.getFloat(index2, c1519j.f13986f);
                        break;
                    case 20:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14013w = typedArrayObtainStyledAttributes.getFloat(index2, c1519j.f14013w);
                        break;
                    case 21:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13980c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1519j.f13980c);
                        break;
                    case 22:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        lVar.f14027a = iArr[typedArrayObtainStyledAttributes.getInt(index2, lVar.f14027a)];
                        break;
                    case 23:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13978b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1519j.f13978b);
                        break;
                    case 24:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13955F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13955F);
                        break;
                    case 25:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13990h = f(typedArrayObtainStyledAttributes, index2, c1519j.f13990h);
                        break;
                    case 26:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13992i = f(typedArrayObtainStyledAttributes, index2, c1519j.f13992i);
                        break;
                    case 27:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13954E = typedArrayObtainStyledAttributes.getInt(index2, c1519j.f13954E);
                        break;
                    case 28:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13956G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13956G);
                        break;
                    case 29:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13994j = f(typedArrayObtainStyledAttributes, index2, c1519j.f13994j);
                        break;
                    case 30:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13996k = f(typedArrayObtainStyledAttributes, index2, c1519j.f13996k);
                        break;
                    case 31:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13960K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13960K);
                        break;
                    case 32:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14009s = f(typedArrayObtainStyledAttributes, index2, c1519j.f14009s);
                        break;
                    case 33:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14010t = f(typedArrayObtainStyledAttributes, index2, c1519j.f14010t);
                        break;
                    case 34:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13957H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13957H);
                        break;
                    case 35:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14000m = f(typedArrayObtainStyledAttributes, index2, c1519j.f14000m);
                        break;
                    case 36:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13998l = f(typedArrayObtainStyledAttributes, index2, c1519j.f13998l);
                        break;
                    case 37:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14014x = typedArrayObtainStyledAttributes.getFloat(index2, c1519j.f14014x);
                        break;
                    case 38:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1518i.f13943a = typedArrayObtainStyledAttributes.getResourceId(index2, c1518i.f13943a);
                        break;
                    case 39:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13970U = typedArrayObtainStyledAttributes.getFloat(index2, c1519j.f13970U);
                        break;
                    case 40:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13969T = typedArrayObtainStyledAttributes.getFloat(index2, c1519j.f13969T);
                        break;
                    case 41:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13971V = typedArrayObtainStyledAttributes.getInt(index2, c1519j.f13971V);
                        break;
                    case 42:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13972W = typedArrayObtainStyledAttributes.getInt(index2, c1519j.f13972W);
                        break;
                    case 43:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        lVar.f14029c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f14029c);
                        break;
                    case 44:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14043l = true;
                        mVar.f14044m = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f14044m);
                        break;
                    case 45:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14033b = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f14033b);
                        break;
                    case 46:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14034c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f14034c);
                        break;
                    case 47:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14035d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f14035d);
                        break;
                    case 48:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14036e = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f14036e);
                        break;
                    case 49:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14037f = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f14037f);
                        break;
                    case 50:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14038g = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f14038g);
                        break;
                    case 51:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14040i = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f14040i);
                        break;
                    case 52:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14041j = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f14041j);
                        break;
                    case 53:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14042k = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f14042k);
                        break;
                    case 54:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13973X = typedArrayObtainStyledAttributes.getInt(index2, c1519j.f13973X);
                        break;
                    case 55:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13974Y = typedArrayObtainStyledAttributes.getInt(index2, c1519j.f13974Y);
                        break;
                    case 56:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13975Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13975Z);
                        break;
                    case 57:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13977a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13977a0);
                        break;
                    case 58:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13979b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13979b0);
                        break;
                    case 59:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13981c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13981c0);
                        break;
                    case 60:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        mVar.f14032a = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f14032a);
                        break;
                    case 61:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f14016z = f(typedArrayObtainStyledAttributes, index2, c1519j.f14016z);
                        break;
                    case 62:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13950A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13950A);
                        break;
                    case 63:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        c1519j.f13951B = typedArrayObtainStyledAttributes.getFloat(index2, c1519j.f13951B);
                        break;
                    case 64:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        kVar.f14018a = f(typedArrayObtainStyledAttributes, index2, kVar.f14018a);
                        break;
                    case 65:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        sparseIntArray = sparseIntArray2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                        } else {
                            String str7 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                        }
                        kVar.getClass();
                        break;
                    case 66:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 67:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        kVar.f14022e = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f14022e);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 68:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        lVar.f14030d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f14030d);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 69:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        c1519j.f13983d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 70:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        c1519j.f13985e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 71:
                        i6 = indexCount2;
                        str = str5;
                        str2 = str6;
                        Log.e("ConstraintSet", str);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 72:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f13987f0 = typedArrayObtainStyledAttributes.getInt(index2, c1519j.f13987f0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 73:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f13989g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13989g0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 74:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f13995j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 75:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f14003n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1519j.f14003n0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 76:
                        i6 = indexCount2;
                        str2 = str6;
                        kVar.f14020c = typedArrayObtainStyledAttributes.getInt(index2, kVar.f14020c);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 77:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f13997k0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 78:
                        i6 = indexCount2;
                        str2 = str6;
                        lVar.f14028b = typedArrayObtainStyledAttributes.getInt(index2, lVar.f14028b);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 79:
                        i6 = indexCount2;
                        str2 = str6;
                        kVar.f14021d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f14021d);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 80:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f13999l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1519j.f13999l0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 81:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f14001m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c1519j.f14001m0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 82:
                        i6 = indexCount2;
                        str2 = str6;
                        kVar.f14019b = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f14019b);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 83:
                        i6 = indexCount2;
                        str2 = str6;
                        mVar.f14039h = f(typedArrayObtainStyledAttributes, index2, mVar.f14039h);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 84:
                        i6 = indexCount2;
                        str2 = str6;
                        kVar.f14024g = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f14024g);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 85:
                        i6 = indexCount2;
                        str2 = str6;
                        kVar.f14023f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f14023f);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 86:
                        i6 = indexCount2;
                        str2 = str6;
                        int i21 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i21 == 1) {
                            kVar.f14026i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i21 == 3) {
                            String string4 = typedArrayObtainStyledAttributes.getString(index2);
                            kVar.f14025h = string4;
                            if (string4.indexOf("/") > 0) {
                                kVar.f14026i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, kVar.f14026i);
                        }
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 87:
                        i6 = indexCount2;
                        str2 = str6;
                        string = "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray2.get(index2);
                        Log.w("ConstraintSet", string);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str6;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i6 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray2.get(index2));
                        string = sb2.toString();
                        Log.w("ConstraintSet", string);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 91:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f14007q = f(typedArrayObtainStyledAttributes, index2, c1519j.f14007q);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 92:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f14008r = f(typedArrayObtainStyledAttributes, index2, c1519j.f14008r);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 93:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f13961L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13961L);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 94:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f13968S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1519j.f13968S);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 95:
                        i6 = indexCount2;
                        str2 = str6;
                        i7 = 0;
                        g(c1519j, typedArrayObtainStyledAttributes, index2, i7);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 96:
                        i6 = indexCount2;
                        str2 = str6;
                        i7 = 1;
                        g(c1519j, typedArrayObtainStyledAttributes, index2, i7);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 97:
                        i6 = indexCount2;
                        str2 = str6;
                        c1519j.f14005o0 = typedArrayObtainStyledAttributes.getInt(index2, c1519j.f14005o0);
                        str = str5;
                        sparseIntArray = sparseIntArray2;
                        break;
                }
                i20++;
                indexCount2 = i6;
                str6 = str2;
                sparseIntArray2 = sparseIntArray;
                str5 = str;
            }
            if (c1519j.f13995j0 != null) {
                c1519j.f13993i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1518i;
    }

    public static int f(TypedArray typedArray, int i6, int i7) {
        int resourceId = typedArray.getResourceId(i6, i7);
        return resourceId == -1 ? typedArray.getInt(i6, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(C1514e c1514e, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i6 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i6 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f6 = Float.parseFloat(strSubstring3);
                        float f7 = Float.parseFloat(strSubstring4);
                        if (f6 > 0.0f && f7 > 0.0f) {
                            if (i6 == 1) {
                                Math.abs(f7 / f6);
                            } else {
                                Math.abs(f6 / f7);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1514e.f13862G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i6;
        int i7;
        String resourceEntryName;
        n nVar = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashMap map = nVar.f14050c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout2.getChildAt(i8);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f14049b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C1518i c1518i = (C1518i) map.get(Integer.valueOf(id));
                        if (c1518i != null) {
                            if (childAt instanceof C1510a) {
                                C1519j c1519j = c1518i.f13946d;
                                c1519j.f13991h0 = 1;
                                C1510a c1510a = (C1510a) childAt;
                                c1510a.setId(id);
                                c1510a.setType(c1519j.f13987f0);
                                c1510a.setMargin(c1519j.f13989g0);
                                c1510a.setAllowsGoneWidget(c1519j.f14003n0);
                                int[] iArr = c1519j.f13993i0;
                                if (iArr != null) {
                                    c1510a.setReferencedIds(iArr);
                                } else {
                                    String str = c1519j.f13995j0;
                                    if (str != null) {
                                        int[] iArrC = c(c1510a, str);
                                        c1519j.f13993i0 = iArrC;
                                        c1510a.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            C1514e c1514e = (C1514e) childAt.getLayoutParams();
                            c1514e.a();
                            c1518i.a(c1514e);
                            HashMap map2 = c1518i.f13948f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map2.keySet()) {
                                C1511b c1511b = (C1511b) map2.get(str2);
                                String strQ = !c1511b.f13841a ? AbstractC0628i.q("set", str2) : str2;
                                HashMap map3 = map2;
                                try {
                                    switch (u.h.b(c1511b.f13842b)) {
                                        case com.bumptech.glide.d.f6312l /* 0 */:
                                            i7 = childCount;
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(strQ, clsArr).invoke(childAt, Integer.valueOf(c1511b.f13843c));
                                            } catch (IllegalAccessException e6) {
                                                e = e6;
                                                StringBuilder sbN = AbstractC0628i.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN.append(cls.getName());
                                                Log.e("TransitionLayout", sbN.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strQ);
                                            } catch (InvocationTargetException e8) {
                                                e = e8;
                                                StringBuilder sbN2 = AbstractC0628i.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN2.append(cls.getName());
                                                Log.e("TransitionLayout", sbN2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 1:
                                            i7 = childCount;
                                            cls.getMethod(strQ, Float.TYPE).invoke(childAt, Float.valueOf(c1511b.f13844d));
                                            break;
                                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                                            i7 = childCount;
                                            cls.getMethod(strQ, Integer.TYPE).invoke(childAt, Integer.valueOf(c1511b.f13847g));
                                            break;
                                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                                            i7 = childCount;
                                            Method method = cls.getMethod(strQ, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c1511b.f13847g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                                            i7 = childCount;
                                            cls.getMethod(strQ, CharSequence.class).invoke(childAt, c1511b.f13845e);
                                            break;
                                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                                            i7 = childCount;
                                            cls.getMethod(strQ, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1511b.f13846f));
                                            break;
                                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                            i7 = childCount;
                                            cls.getMethod(strQ, Float.TYPE).invoke(childAt, Float.valueOf(c1511b.f13844d));
                                            break;
                                        case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                            i7 = childCount;
                                            try {
                                                cls.getMethod(strQ, Integer.TYPE).invoke(childAt, Integer.valueOf(c1511b.f13843c));
                                            } catch (IllegalAccessException e9) {
                                                e = e9;
                                                StringBuilder sbN22 = AbstractC0628i.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN22.append(cls.getName());
                                                Log.e("TransitionLayout", sbN22.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strQ);
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder sbN222 = AbstractC0628i.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN222.append(cls.getName());
                                                Log.e("TransitionLayout", sbN222.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        default:
                                            i7 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    i7 = childCount;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    i7 = childCount;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    i7 = childCount;
                                }
                                map2 = map3;
                                childCount = i7;
                            }
                            i6 = childCount;
                            childAt.setLayoutParams(c1514e);
                            l lVar = c1518i.f13944b;
                            if (lVar.f14028b == 0) {
                                childAt.setVisibility(lVar.f14027a);
                            }
                            childAt.setAlpha(lVar.f14029c);
                            m mVar = c1518i.f13947e;
                            childAt.setRotation(mVar.f14032a);
                            childAt.setRotationX(mVar.f14033b);
                            childAt.setRotationY(mVar.f14034c);
                            childAt.setScaleX(mVar.f14035d);
                            childAt.setScaleY(mVar.f14036e);
                            if (mVar.f14039h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f14039h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f14037f)) {
                                    childAt.setPivotX(mVar.f14037f);
                                }
                                if (!Float.isNaN(mVar.f14038g)) {
                                    childAt.setPivotY(mVar.f14038g);
                                }
                            }
                            childAt.setTranslationX(mVar.f14040i);
                            childAt.setTranslationY(mVar.f14041j);
                            childAt.setTranslationZ(mVar.f14042k);
                            if (mVar.f14043l) {
                                childAt.setElevation(mVar.f14044m);
                            }
                        }
                    } else {
                        i6 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i8++;
                nVar = this;
                constraintLayout2 = constraintLayout;
                childCount = i6;
            }
            i6 = childCount;
            i8++;
            nVar = this;
            constraintLayout2 = constraintLayout;
            childCount = i6;
        }
        int i9 = childCount;
        for (Integer num : hashSet) {
            C1518i c1518i2 = (C1518i) map.get(num);
            if (c1518i2 != null) {
                C1519j c1519j2 = c1518i2.f13946d;
                if (c1519j2.f13991h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C1510a c1510a2 = new C1510a(context);
                    c1510a2.f13851w = new int[32];
                    c1510a2.f13850C = new HashMap();
                    c1510a2.f13853y = context;
                    c1510a2.g(null);
                    c1510a2.setVisibility(8);
                    c1510a2.setId(num.intValue());
                    int[] iArr2 = c1519j2.f13993i0;
                    if (iArr2 != null) {
                        c1510a2.setReferencedIds(iArr2);
                    } else {
                        String str3 = c1519j2.f13995j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(c1510a2, str3);
                            c1519j2.f13993i0 = iArrC2;
                            c1510a2.setReferencedIds(iArrC2);
                        }
                    }
                    c1510a2.setType(c1519j2.f13987f0);
                    c1510a2.setMargin(c1519j2.f13989g0);
                    C1514e c1514eG = ConstraintLayout.g();
                    c1510a2.i();
                    c1518i2.a(c1514eG);
                    viewGroup = constraintLayout;
                    viewGroup.addView(c1510a2, c1514eG);
                } else {
                    viewGroup = constraintLayout;
                }
                if (c1519j2.f13976a) {
                    p pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C1514e c1514eG2 = ConstraintLayout.g();
                    c1518i2.a(c1514eG2);
                    viewGroup.addView(pVar, c1514eG2);
                }
            }
        }
        for (int i10 = 0; i10 < i9; i10++) {
            View childAt2 = constraintLayout.getChildAt(i10);
            if (childAt2 instanceof AbstractC1512c) {
                ((AbstractC1512c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i6;
        int i7;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = nVar.f14050c;
        map.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout.getChildAt(i8);
            C1514e c1514e = (C1514e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f14049b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C1518i());
            }
            C1518i c1518i = (C1518i) map.get(Integer.valueOf(id));
            if (c1518i == null) {
                i6 = childCount;
            } else {
                HashMap map2 = nVar.f14048a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    C1511b c1511b = (C1511b) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C1511b(c1511b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i7 = childCount;
                        } else {
                            i7 = childCount;
                            try {
                                map3.put(str, new C1511b(c1511b, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e6) {
                                e = e6;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e7) {
                                e = e7;
                                e.printStackTrace();
                            } catch (InvocationTargetException e8) {
                                e = e8;
                                e.printStackTrace();
                            }
                        }
                    } catch (IllegalAccessException e9) {
                        e = e9;
                        i7 = childCount;
                        e.printStackTrace();
                        childCount = i7;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        i7 = childCount;
                        e.printStackTrace();
                        childCount = i7;
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        i7 = childCount;
                        e.printStackTrace();
                        childCount = i7;
                    }
                    childCount = i7;
                }
                i6 = childCount;
                c1518i.f13948f = map3;
                c1518i.f13943a = id;
                int i9 = c1514e.f13890e;
                C1519j c1519j = c1518i.f13946d;
                c1519j.f13990h = i9;
                c1519j.f13992i = c1514e.f13892f;
                c1519j.f13994j = c1514e.f13894g;
                c1519j.f13996k = c1514e.f13896h;
                c1519j.f13998l = c1514e.f13898i;
                c1519j.f14000m = c1514e.f13900j;
                c1519j.f14002n = c1514e.f13902k;
                c1519j.f14004o = c1514e.f13904l;
                c1519j.f14006p = c1514e.f13906m;
                c1519j.f14007q = c1514e.f13908n;
                c1519j.f14008r = c1514e.f13910o;
                c1519j.f14009s = c1514e.f13916s;
                c1519j.f14010t = c1514e.f13917t;
                c1519j.f14011u = c1514e.f13918u;
                c1519j.f14012v = c1514e.f13919v;
                c1519j.f14013w = c1514e.f13860E;
                c1519j.f14014x = c1514e.f13861F;
                c1519j.f14015y = c1514e.f13862G;
                c1519j.f14016z = c1514e.f13912p;
                c1519j.f13950A = c1514e.f13914q;
                c1519j.f13951B = c1514e.f13915r;
                c1519j.f13952C = c1514e.f13875T;
                c1519j.f13953D = c1514e.f13876U;
                c1519j.f13954E = c1514e.f13877V;
                c1519j.f13986f = c1514e.f13886c;
                c1519j.f13982d = c1514e.f13882a;
                c1519j.f13984e = c1514e.f13884b;
                c1519j.f13978b = ((ViewGroup.MarginLayoutParams) c1514e).width;
                c1519j.f13980c = ((ViewGroup.MarginLayoutParams) c1514e).height;
                c1519j.f13955F = ((ViewGroup.MarginLayoutParams) c1514e).leftMargin;
                c1519j.f13956G = ((ViewGroup.MarginLayoutParams) c1514e).rightMargin;
                c1519j.f13957H = ((ViewGroup.MarginLayoutParams) c1514e).topMargin;
                c1519j.f13958I = ((ViewGroup.MarginLayoutParams) c1514e).bottomMargin;
                c1519j.f13961L = c1514e.f13859D;
                c1519j.f13969T = c1514e.f13864I;
                c1519j.f13970U = c1514e.f13863H;
                c1519j.f13972W = c1514e.f13866K;
                c1519j.f13971V = c1514e.f13865J;
                c1519j.f13999l0 = c1514e.f13878W;
                c1519j.f14001m0 = c1514e.f13879X;
                c1519j.f13973X = c1514e.f13867L;
                c1519j.f13974Y = c1514e.f13868M;
                c1519j.f13975Z = c1514e.f13871P;
                c1519j.f13977a0 = c1514e.f13872Q;
                c1519j.f13979b0 = c1514e.f13869N;
                c1519j.f13981c0 = c1514e.f13870O;
                c1519j.f13983d0 = c1514e.f13873R;
                c1519j.f13985e0 = c1514e.f13874S;
                c1519j.f13997k0 = c1514e.f13880Y;
                c1519j.f13963N = c1514e.f13921x;
                c1519j.f13965P = c1514e.f13923z;
                c1519j.f13962M = c1514e.f13920w;
                c1519j.f13964O = c1514e.f13922y;
                c1519j.f13967R = c1514e.f13856A;
                c1519j.f13966Q = c1514e.f13857B;
                c1519j.f13968S = c1514e.f13858C;
                c1519j.f14005o0 = c1514e.f13881Z;
                c1519j.f13959J = c1514e.getMarginEnd();
                c1519j.f13960K = c1514e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c1518i.f13944b;
                lVar.f14027a = visibility;
                lVar.f14029c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c1518i.f13947e;
                mVar.f14032a = rotation;
                mVar.f14033b = childAt.getRotationX();
                mVar.f14034c = childAt.getRotationY();
                mVar.f14035d = childAt.getScaleX();
                mVar.f14036e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f14037f = pivotX;
                    mVar.f14038g = pivotY;
                }
                mVar.f14040i = childAt.getTranslationX();
                mVar.f14041j = childAt.getTranslationY();
                mVar.f14042k = childAt.getTranslationZ();
                if (mVar.f14043l) {
                    mVar.f14044m = childAt.getElevation();
                }
                if (childAt instanceof C1510a) {
                    C1510a c1510a = (C1510a) childAt;
                    c1519j.f14003n0 = c1510a.getAllowsGoneWidget();
                    c1519j.f13993i0 = c1510a.getReferencedIds();
                    c1519j.f13987f0 = c1510a.getType();
                    c1519j.f13989g0 = c1510a.getMargin();
                }
            }
            i8++;
            nVar = this;
            childCount = i6;
        }
    }

    public final void e(Context context, int i6) {
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1518i c1518iD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1518iD.f13946d.f13976a = true;
                    }
                    this.f14050c.put(Integer.valueOf(c1518iD.f13943a), c1518iD);
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }
}
