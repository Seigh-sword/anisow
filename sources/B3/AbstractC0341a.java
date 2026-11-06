package b3;

import W2.i;
import W2.k;
import W2.o;
import W2.q;
import android.os.Bundle;
import java.util.Arrays;
import m2.C0;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: b3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0341a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f5924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f5925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f5926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f5927d;

    static {
        int i6 = o.f4436y;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f5924a = o.h(15, objArr);
        i iVar = k.f4426x;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        Y2.b.f(7, objArr2);
        f5925b = k.g(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        Y2.b.f(3, objArr3);
        f5926c = k.g(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        Y2.b.f(2, objArr4);
        f5927d = k.g(2, objArr4);
        Y2.b.g(4, "initialCapacity");
        String[] strArr = C0.f10534e;
        Y2.b.f(15, strArr);
        Object[] objArrCopyOf = Arrays.copyOf(new Object[4], AbstractC1305a.x(4, 15));
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        String[] strArr2 = C0.f10535f;
        Y2.b.f(15, strArr2);
        if (objArrCopyOf.length < 30) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC1305a.x(objArrCopyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, 15, 15);
        k.g(30, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        Y2.b.f(2, objArr5);
        k.g(2, objArr5);
    }

    public static boolean a(String str, Bundle bundle) {
        if (f5925b.contains(str)) {
            return false;
        }
        q qVar = f5927d;
        int size = qVar.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = qVar.get(i6);
            i6++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!(!f5926c.contains(str))) {
            return false;
        }
        q qVar = f5927d;
        int size = qVar.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = qVar.get(i6);
            i6++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        byte b6 = -1;
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    b6 = 2;
                }
            } else if (str.equals("fdl")) {
                b6 = 1;
            }
        } else if (str.equals("fcm")) {
            b6 = 0;
        }
        if (b6 == 0) {
            str3 = "fcm_integration";
        } else if (b6 == 1) {
            str3 = "fdl_integration";
        } else {
            if (b6 != 2) {
                return false;
            }
            str3 = "fiam_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }
}
