package h5;

import d.AbstractC0628i;
import d2.AbstractC0651b;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0651b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f9010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9012k;

    public /* synthetic */ H(Method method, int i6, boolean z5, int i7) {
        this.f9009h = i7;
        this.f9010i = method;
        this.f9011j = i6;
        this.f9012k = z5;
    }

    public final void H(Q q5, Map map) {
        int i6 = this.f9009h;
        boolean z5 = this.f9012k;
        Method method = this.f9010i;
        int i7 = this.f9011j;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (map == null) {
                    throw d0.k(method, i7, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw d0.k(method, i7, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw d0.k(method, i7, AbstractC0628i.j("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw d0.k(method, i7, "Field map value '" + value + "' converted to null by " + C0777d.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    q5.a(str, string, z5);
                }
                return;
            case 1:
                if (map == null) {
                    throw d0.k(method, i7, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw d0.k(method, i7, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw d0.k(method, i7, AbstractC0628i.j("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    q5.b(str2, value2.toString(), z5);
                }
                return;
            default:
                if (map == null) {
                    throw d0.k(method, i7, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw d0.k(method, i7, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw d0.k(method, i7, AbstractC0628i.j("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw d0.k(method, i7, "Query map value '" + value3 + "' converted to null by " + C0777d.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    q5.d(str3, string2, z5);
                }
                return;
        }
    }

    @Override // d2.AbstractC0651b
    public final /* bridge */ /* synthetic */ void a(Q q5, Object obj) {
        switch (this.f9009h) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                H(q5, (Map) obj);
                break;
            case 1:
                H(q5, (Map) obj);
                break;
            default:
                H(q5, (Map) obj);
                break;
        }
    }
}
