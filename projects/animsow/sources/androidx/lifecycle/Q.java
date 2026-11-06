package androidx.lifecycle;

import P4.q0;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import s4.AbstractC1305a;
import s4.C1311g;
import z0.InterfaceC1522c;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f5574f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f5579e;

    public Q() {
        this.f5575a = new LinkedHashMap();
        this.f5576b = new LinkedHashMap();
        this.f5577c = new LinkedHashMap();
        this.f5578d = new LinkedHashMap();
        this.f5579e = new P(this, 0);
    }

    public static Bundle a(Q q5) {
        AbstractC1305a.o(q5, "this$0");
        LinkedHashMap linkedHashMap = q5.f5576b;
        AbstractC1305a.o(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        Iterator it = (size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : AbstractC1305a.X(linkedHashMap) : t4.q.f12757w).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = q5.f5575a;
            int i6 = 0;
            if (zHasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Bundle bundleA = ((InterfaceC1522c) entry.getValue()).a();
                AbstractC1305a.o(str, "key");
                Class[] clsArr = f5574f;
                while (i6 < 29) {
                    Class cls = clsArr[i6];
                    AbstractC1305a.l(cls);
                    if (cls.isInstance(bundleA)) {
                        Object obj = q5.f5577c.get(str);
                        E e6 = obj instanceof E ? (E) obj : null;
                        if (e6 != null) {
                            e6.g(bundleA);
                        } else {
                            linkedHashMap2.put(str, bundleA);
                        }
                        P4.W w5 = (P4.W) q5.f5578d.get(str);
                        if (w5 != null) {
                            ((q0) w5).l(bundleA);
                        }
                    } else {
                        i6++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Set<String> setKeySet = linkedHashMap2.keySet();
            ArrayList arrayList = new ArrayList(setKeySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String str2 : setKeySet) {
                arrayList.add(str2);
                arrayList2.add(linkedHashMap2.get(str2));
            }
            C1311g[] c1311gArr = {new C1311g("keys", arrayList), new C1311g("values", arrayList2)};
            Bundle bundle = new Bundle(2);
            while (i6 < 2) {
                C1311g c1311g = c1311gArr[i6];
                String str3 = (String) c1311g.f12632w;
                Object obj2 = c1311g.f12633x;
                if (obj2 == null) {
                    bundle.putString(str3, null);
                } else if (obj2 instanceof Boolean) {
                    bundle.putBoolean(str3, ((Boolean) obj2).booleanValue());
                } else if (obj2 instanceof Byte) {
                    bundle.putByte(str3, ((Number) obj2).byteValue());
                } else if (obj2 instanceof Character) {
                    bundle.putChar(str3, ((Character) obj2).charValue());
                } else if (obj2 instanceof Double) {
                    bundle.putDouble(str3, ((Number) obj2).doubleValue());
                } else if (obj2 instanceof Float) {
                    bundle.putFloat(str3, ((Number) obj2).floatValue());
                } else if (obj2 instanceof Integer) {
                    bundle.putInt(str3, ((Number) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    bundle.putLong(str3, ((Number) obj2).longValue());
                } else if (obj2 instanceof Short) {
                    bundle.putShort(str3, ((Number) obj2).shortValue());
                } else if (obj2 instanceof Bundle) {
                    bundle.putBundle(str3, (Bundle) obj2);
                } else if (obj2 instanceof CharSequence) {
                    bundle.putCharSequence(str3, (CharSequence) obj2);
                } else if (obj2 instanceof Parcelable) {
                    bundle.putParcelable(str3, (Parcelable) obj2);
                } else if (obj2 instanceof boolean[]) {
                    bundle.putBooleanArray(str3, (boolean[]) obj2);
                } else if (obj2 instanceof byte[]) {
                    bundle.putByteArray(str3, (byte[]) obj2);
                } else if (obj2 instanceof char[]) {
                    bundle.putCharArray(str3, (char[]) obj2);
                } else if (obj2 instanceof double[]) {
                    bundle.putDoubleArray(str3, (double[]) obj2);
                } else if (obj2 instanceof float[]) {
                    bundle.putFloatArray(str3, (float[]) obj2);
                } else if (obj2 instanceof int[]) {
                    bundle.putIntArray(str3, (int[]) obj2);
                } else if (obj2 instanceof long[]) {
                    bundle.putLongArray(str3, (long[]) obj2);
                } else if (obj2 instanceof short[]) {
                    bundle.putShortArray(str3, (short[]) obj2);
                } else if (obj2 instanceof Object[]) {
                    Class<?> componentType = obj2.getClass().getComponentType();
                    AbstractC1305a.l(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(str3, (Parcelable[]) obj2);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(str3, (String[]) obj2);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(str3, (CharSequence[]) obj2);
                    } else {
                        if (!Serializable.class.isAssignableFrom(componentType)) {
                            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str3 + '\"');
                        }
                        bundle.putSerializable(str3, (Serializable) obj2);
                    }
                } else if (obj2 instanceof Serializable) {
                    bundle.putSerializable(str3, (Serializable) obj2);
                } else if (obj2 instanceof IBinder) {
                    bundle.putBinder(str3, (IBinder) obj2);
                } else if (obj2 instanceof Size) {
                    J.c.a(bundle, str3, (Size) obj2);
                } else {
                    if (!(obj2 instanceof SizeF)) {
                        throw new IllegalArgumentException("Illegal value type " + obj2.getClass().getCanonicalName() + " for key \"" + str3 + '\"');
                    }
                    J.c.b(bundle, str3, (SizeF) obj2);
                }
                i6++;
            }
            return bundle;
        }
    }

    public Q(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5575a = linkedHashMap;
        this.f5576b = new LinkedHashMap();
        this.f5577c = new LinkedHashMap();
        this.f5578d = new LinkedHashMap();
        this.f5579e = new P(this, 1);
        linkedHashMap.putAll(map);
    }
}
