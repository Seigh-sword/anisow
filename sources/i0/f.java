package I0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f1097a;

    public f(int i6) {
        if (i6 != 2) {
            this.f1097a = new HashMap();
        } else {
            this.f1097a = new HashMap();
        }
    }

    public final void a(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                this.f1097a.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f1097a.put(str, value);
                } else {
                    int i6 = 0;
                    if (cls == boolean[].class) {
                        Map map2 = this.f1097a;
                        boolean[] zArr = (boolean[]) value;
                        String str2 = g.f1098b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i6 < zArr.length) {
                            boolArr[i6] = Boolean.valueOf(zArr[i6]);
                            i6++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        Map map3 = this.f1097a;
                        byte[] bArr = (byte[]) value;
                        String str3 = g.f1098b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i6 < bArr.length) {
                            bArr2[i6] = Byte.valueOf(bArr[i6]);
                            i6++;
                        }
                        map3.put(str, bArr2);
                    } else if (cls == int[].class) {
                        Map map4 = this.f1097a;
                        int[] iArr = (int[]) value;
                        String str4 = g.f1098b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i6 < iArr.length) {
                            numArr[i6] = Integer.valueOf(iArr[i6]);
                            i6++;
                        }
                        map4.put(str, numArr);
                    } else if (cls == long[].class) {
                        Map map5 = this.f1097a;
                        long[] jArr = (long[]) value;
                        String str5 = g.f1098b;
                        Long[] lArr = new Long[jArr.length];
                        while (i6 < jArr.length) {
                            lArr[i6] = Long.valueOf(jArr[i6]);
                            i6++;
                        }
                        map5.put(str, lArr);
                    } else if (cls == float[].class) {
                        Map map6 = this.f1097a;
                        float[] fArr = (float[]) value;
                        String str6 = g.f1098b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i6 < fArr.length) {
                            fArr2[i6] = Float.valueOf(fArr[i6]);
                            i6++;
                        }
                        map6.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        Map map7 = this.f1097a;
                        double[] dArr = (double[]) value;
                        String str7 = g.f1098b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i6 < dArr.length) {
                            dArr2[i6] = Double.valueOf(dArr[i6]);
                            i6++;
                        }
                        map7.put(str, dArr2);
                    }
                }
            }
        }
    }
}
