package h5;

import d2.AbstractC0651b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f9046y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f9047z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f9048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f9049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f9050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Annotation[] f9051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Annotation[][] f9052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Type[] f9053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f9062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f9066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public V4.p f9067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public V4.t f9068u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinkedHashSet f9069v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC0651b[] f9070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9071x;

    public S(W w5, Class cls, Method method) {
        this.f9048a = w5;
        this.f9049b = cls;
        this.f9050c = method;
        this.f9051d = method.getAnnotations();
        this.f9053f = method.getGenericParameterTypes();
        this.f9052e = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z5) {
        String str3 = this.f9062o;
        Method method = this.f9050c;
        if (str3 != null) {
            throw d0.j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f9062o = str;
        this.f9063p = z5;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f9046y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw d0.j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f9066s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f9069v = linkedHashSet;
    }

    public final void c(int i6, Type type) {
        if (d0.g(type)) {
            throw d0.k(this.f9050c, i6, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
