package T3;

import Q3.A;
import com.google.gson.reflect.TypeToken;
import d.AbstractC0628i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f3481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Method f3486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A f3488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q3.n f3489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TypeToken f3490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f3491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f3492m;

    public m(String str, Field field, boolean z5, boolean z6, boolean z7, Method method, boolean z8, A a6, Q3.n nVar, TypeToken typeToken, boolean z9, boolean z10) {
        this.f3485f = z7;
        this.f3486g = method;
        this.f3487h = z8;
        this.f3488i = a6;
        this.f3489j = nVar;
        this.f3490k = typeToken;
        this.f3491l = z9;
        this.f3492m = z10;
        this.f3480a = str;
        this.f3481b = field;
        this.f3482c = field.getName();
        this.f3483d = z5;
        this.f3484e = z6;
    }

    public final void a(X3.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.f3483d) {
            boolean z5 = this.f3485f;
            Field field = this.f3481b;
            Method method = this.f3486g;
            if (z5) {
                if (method == null) {
                    q.b(obj, field);
                } else {
                    q.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e6) {
                    throw new Q3.q(AbstractC0628i.j("Accessor ", V3.c.d(method, false), " threw exception"), e6.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            bVar.n(this.f3480a);
            boolean z6 = this.f3487h;
            A sVar = this.f3488i;
            if (!z6) {
                sVar = new s(this.f3489j, sVar, this.f3490k.f7457b);
            }
            sVar.c(bVar, objInvoke);
        }
    }
}
