package P2;

import W.C0183b;
import W.InterfaceC0184c;
import android.graphics.Path;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.Q;
import f5.C0710g;
import h5.C0791s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import m2.InterfaceC1035f;
import s4.AbstractC1305a;
import t0.InterfaceC1331c;

/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC1331c, InterfaceC0184c, InterfaceC1035f {
    public static void c(long j6, C0710g c0710g, int i6, ArrayList arrayList, int i7, int i8, ArrayList arrayList2) {
        int i9;
        int i10;
        int i11;
        int i12;
        C0710g c0710g2;
        int i13 = i6;
        if (i7 >= i8) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i14 = i7; i14 < i8; i14++) {
            if (((f5.j) arrayList.get(i14)).d() < i13) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        f5.j jVar = (f5.j) arrayList.get(i7);
        f5.j jVar2 = (f5.j) arrayList.get(i8 - 1);
        int i15 = -1;
        if (i13 == jVar.d()) {
            int iIntValue = ((Number) arrayList2.get(i7)).intValue();
            int i16 = i7 + 1;
            f5.j jVar3 = (f5.j) arrayList.get(i16);
            i9 = i16;
            i10 = iIntValue;
            jVar = jVar3;
        } else {
            i9 = i7;
            i10 = -1;
        }
        if (jVar.i(i13) == jVar2.i(i13)) {
            int iMin = Math.min(jVar.d(), jVar2.d());
            int i17 = 0;
            for (int i18 = i13; i18 < iMin && jVar.i(i18) == jVar2.i(i18); i18++) {
                i17++;
            }
            long j7 = 4;
            long j8 = (c0710g.f8461x / j7) + j6 + ((long) 2) + ((long) i17) + 1;
            c0710g.a0(-i17);
            c0710g.a0(i10);
            int i19 = i17 + i13;
            while (i13 < i19) {
                c0710g.a0(jVar.i(i13) & 255);
                i13++;
            }
            if (i9 + 1 == i8) {
                if (i19 != ((f5.j) arrayList.get(i9)).d()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                c0710g.a0(((Number) arrayList2.get(i9)).intValue());
                return;
            } else {
                C0710g c0710g3 = new C0710g();
                c0710g.a0(((int) ((c0710g3.f8461x / j7) + j8)) * (-1));
                c(j8, c0710g3, i19, arrayList, i9, i8, arrayList2);
                c0710g.W(c0710g3);
                return;
            }
        }
        int i20 = 1;
        for (int i21 = i9 + 1; i21 < i8; i21++) {
            if (((f5.j) arrayList.get(i21 - 1)).i(i13) != ((f5.j) arrayList.get(i21)).i(i13)) {
                i20++;
            }
        }
        long j9 = 4;
        long j10 = (c0710g.f8461x / j9) + j6 + ((long) 2) + ((long) (i20 * 2));
        c0710g.a0(i20);
        c0710g.a0(i10);
        for (int i22 = i9; i22 < i8; i22++) {
            int i23 = ((f5.j) arrayList.get(i22)).i(i13);
            if (i22 == i9 || i23 != ((f5.j) arrayList.get(i22 - 1)).i(i13)) {
                c0710g.a0(i23 & 255);
            }
        }
        C0710g c0710g4 = new C0710g();
        int i24 = i9;
        while (i24 < i8) {
            byte bI = ((f5.j) arrayList.get(i24)).i(i13);
            int i25 = i24 + 1;
            int i26 = i25;
            while (true) {
                if (i26 >= i8) {
                    i11 = i8;
                    break;
                } else {
                    if (bI != ((f5.j) arrayList.get(i26)).i(i13)) {
                        i11 = i26;
                        break;
                    }
                    i26++;
                }
            }
            if (i25 == i11 && i13 + 1 == ((f5.j) arrayList.get(i24)).d()) {
                c0710g.a0(((Number) arrayList2.get(i24)).intValue());
                i12 = i11;
                c0710g2 = c0710g4;
            } else {
                c0710g.a0(((int) ((c0710g4.f8461x / j9) + j10)) * i15);
                i12 = i11;
                c0710g2 = c0710g4;
                c(j10, c0710g4, i13 + 1, arrayList, i24, i11, arrayList2);
            }
            c0710g4 = c0710g2;
            i24 = i12;
            i15 = -1;
        }
        c0710g.W(c0710g4);
    }

    public static Q f(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new Q();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                AbstractC1305a.n(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new Q(map);
        }
        ClassLoader classLoader = Q.class.getClassLoader();
        AbstractC1305a.l(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = parcelableArrayList.get(i6);
            AbstractC1305a.m(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i6));
        }
        return new Q(linkedHashMap);
    }

    public static f5.j g(String str) {
        AbstractC1305a.o(str, "<this>");
        byte[] bytes = str.getBytes(K4.a.f1637a);
        AbstractC1305a.n(bytes, "this as java.lang.String).getBytes(charset)");
        f5.j jVar = new f5.j(bytes);
        jVar.f8465y = str;
        return jVar;
    }

    public static Path j(float f6, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(f6, f7);
        path.lineTo(f8, f9);
        return path;
    }

    @Override // m2.InterfaceC1035f
    public String b(String str, String str2) {
        return null;
    }

    public List d(Executor executor) {
        return Collections.singletonList(new C0791s(executor));
    }

    public List e() {
        return Collections.emptyList();
    }

    @Override // t0.InterfaceC1331c
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public boolean k(Spannable spannable) {
        return false;
    }

    @Override // t0.InterfaceC1331c
    public void m(int i6, Object obj) {
        String str;
        switch (i6) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i6 == 6 || i6 == 7 || i6 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public void o() {
    }

    @Override // W.InterfaceC0184c
    public Object a(C0183b c0183b) throws C0183b {
        throw c0183b;
    }

    public KeyListener i(KeyListener keyListener) {
        return keyListener;
    }

    public void n(boolean z5) {
    }

    public InputConnection l(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }
}
