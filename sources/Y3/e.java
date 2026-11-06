package y3;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import w3.C1478b;
import w3.C1479c;
import w3.InterfaceC1480d;
import w3.g;

/* JADX INFO: loaded from: classes.dex */
public final class e implements w3.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13831a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f13832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f13833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f13834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1480d f13835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13836f;

    public e(Writer writer, HashMap map, HashMap map2, C1508a c1508a, boolean z5) {
        this.f13832b = new JsonWriter(writer);
        this.f13833c = map;
        this.f13834d = map2;
        this.f13835e = c1508a;
        this.f13836f = z5;
    }

    @Override // w3.g
    public final g a(String str) throws IOException {
        j();
        this.f13832b.value(str);
        return this;
    }

    @Override // w3.g
    public final g b(boolean z5) throws IOException {
        j();
        this.f13832b.value(z5);
        return this;
    }

    @Override // w3.e
    public final w3.e c(C1479c c1479c, double d6) throws IOException {
        String str = c1479c.f13590a;
        j();
        JsonWriter jsonWriter = this.f13832b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d6);
        return this;
    }

    @Override // w3.e
    public final w3.e d(C1479c c1479c, long j6) throws IOException {
        String str = c1479c.f13590a;
        j();
        JsonWriter jsonWriter = this.f13832b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j6);
        return this;
    }

    @Override // w3.e
    public final w3.e e(C1479c c1479c, int i6) throws IOException {
        String str = c1479c.f13590a;
        j();
        JsonWriter jsonWriter = this.f13832b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i6);
        return this;
    }

    @Override // w3.e
    public final w3.e f(C1479c c1479c, Object obj) throws IOException {
        i(obj, c1479c.f13590a);
        return this;
    }

    @Override // w3.e
    public final w3.e g(C1479c c1479c, boolean z5) throws IOException {
        String str = c1479c.f13590a;
        j();
        JsonWriter jsonWriter = this.f13832b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z5);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f13832b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e6) {
                        throw new C1478b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e6);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1480d interfaceC1480d = (InterfaceC1480d) this.f13833c.get(obj.getClass());
            if (interfaceC1480d != null) {
                jsonWriter.beginObject();
                interfaceC1480d.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            w3.f fVar = (w3.f) this.f13834d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f13835e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof f) {
                int iA = ((f) obj).a();
                j();
                jsonWriter.value(iA);
            } else {
                String strName = ((Enum) obj).name();
                j();
                jsonWriter.value(strName);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i6 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i6 < length) {
                jsonWriter.value(r6[i6]);
                i6++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i6 < length2) {
                long j6 = jArr[i6];
                j();
                jsonWriter.value(j6);
                i6++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i6 < length3) {
                jsonWriter.value(dArr[i6]);
                i6++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i6 < length4) {
                jsonWriter.value(zArr[i6]);
                i6++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i6 < length5) {
                h(numberArr[i6]);
                i6++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i6 < length6) {
                h(objArr[i6]);
                i6++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e i(Object obj, String str) throws IOException {
        boolean z5 = this.f13836f;
        JsonWriter jsonWriter = this.f13832b;
        if (z5) {
            if (obj != null) {
                j();
                jsonWriter.name(str);
                h(obj);
            }
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            h(obj);
        }
        return this;
    }

    public final void j() {
        if (!this.f13831a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
