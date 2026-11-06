package m1;

import android.graphics.Bitmap;
import android.os.Build;
import com.google.android.gms.internal.measurement.C0396c2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC1012j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Bitmap.Config[] f10471A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Bitmap.Config[] f10472B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Bitmap.Config[] f10473C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Bitmap.Config[] f10474D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Bitmap.Config[] f10475z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1005c f10476w = new C1005c(2);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0396c2 f10477x = new C0396c2(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f10478y = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f10475z = configArr;
        f10471A = configArr;
        f10472B = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f10473C = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f10474D = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String e(int i6, Bitmap.Config config) {
        return "[" + i6 + "](" + config + ")";
    }

    @Override // m1.InterfaceC1012j
    public final Bitmap a(int i6, int i7, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = C1.n.d(config) * i6 * i7;
        C1005c c1005c = this.f10476w;
        InterfaceC1013k interfaceC1013kS = (InterfaceC1013k) ((Queue) c1005c.f1668w).poll();
        if (interfaceC1013kS == null) {
            interfaceC1013kS = c1005c.s();
        }
        C1015m c1015m = (C1015m) interfaceC1013kS;
        c1015m.f10469b = iD;
        c1015m.f10470c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i8 = AbstractC1014l.f10467a[config.ordinal()];
            configArr = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? new Bitmap.Config[]{config} : f10474D : f10473C : f10472B : f10475z;
        } else {
            configArr = f10471A;
        }
        int length = configArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i9];
            Integer num = (Integer) g(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i9++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                c1005c.l(c1015m);
                int iIntValue = num.intValue();
                InterfaceC1013k interfaceC1013kS2 = (InterfaceC1013k) ((Queue) c1005c.f1668w).poll();
                if (interfaceC1013kS2 == null) {
                    interfaceC1013kS2 = c1005c.s();
                }
                c1015m = (C1015m) interfaceC1013kS2;
                c1015m.f10469b = iIntValue;
                c1015m.f10470c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f10477x.E(c1015m);
        if (bitmap != null) {
            b(Integer.valueOf(c1015m.f10469b), bitmap);
            bitmap.reconfigure(i6, i7, config);
        }
        return bitmap;
    }

    public final void b(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapG = g(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapG.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapG.remove(num);
                return;
            } else {
                navigableMapG.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(C1.n.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    @Override // m1.InterfaceC1012j
    public final int c(Bitmap bitmap) {
        return C1.n.c(bitmap);
    }

    @Override // m1.InterfaceC1012j
    public final void d(Bitmap bitmap) {
        int iC = C1.n.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C1005c c1005c = this.f10476w;
        InterfaceC1013k interfaceC1013kS = (InterfaceC1013k) ((Queue) c1005c.f1668w).poll();
        if (interfaceC1013kS == null) {
            interfaceC1013kS = c1005c.s();
        }
        C1015m c1015m = (C1015m) interfaceC1013kS;
        c1015m.f10469b = iC;
        c1015m.f10470c = config;
        this.f10477x.M(c1015m, bitmap);
        NavigableMap navigableMapG = g(bitmap.getConfig());
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(c1015m.f10469b));
        navigableMapG.put(Integer.valueOf(c1015m.f10469b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // m1.InterfaceC1012j
    public final String f(int i6, int i7, Bitmap.Config config) {
        return e(C1.n.d(config) * i6 * i7, config);
    }

    public final NavigableMap g(Bitmap.Config config) {
        HashMap map = this.f10478y;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    @Override // m1.InterfaceC1012j
    public final String i(Bitmap bitmap) {
        return e(C1.n.c(bitmap), bitmap.getConfig());
    }

    @Override // m1.InterfaceC1012j
    public final Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f10477x.O();
        if (bitmap != null) {
            b(Integer.valueOf(C1.n.c(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f10477x);
        sb.append(", sortedSizes=(");
        HashMap map = this.f10478y;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!map.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
