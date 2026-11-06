package e1;

import P2.e;
import Q3.n;
import V4.q;
import V4.r;
import V4.w;
import V4.x;
import V4.y;
import h5.C0780g;
import h5.O;
import h5.V;
import h5.W;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0660a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0662c f8255a;

    static {
        w wVar = new w();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        wVar.f3947t = W4.b.b(timeUnit);
        wVar.f3946s = W4.b.b(timeUnit);
        wVar.f3948u = W4.b.b(timeUnit);
        wVar.f3941n = new K1.b(0, 1L, TimeUnit.NANOSECONDS);
        y yVar = y.f3982y;
        ArrayList arrayList = new ArrayList(S3.a.D(yVar));
        y yVar2 = y.f3978B;
        if (!arrayList.contains(yVar2) && !arrayList.contains(yVar)) {
            throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
        }
        if (arrayList.contains(yVar2) && arrayList.size() > 1) {
            throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
        }
        if (arrayList.contains(y.f3981x)) {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }
        if (arrayList.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayList.remove(y.f3983z);
        wVar.f3929b = Collections.unmodifiableList(arrayList);
        wVar.f3945r = true;
        wVar.f3931d.add(new C0661b());
        x xVar = new x(wVar);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        q qVar = new q();
        qVar.b(null, "https://anilab2.amdapi.click/api/");
        r rVarA = qVar.a();
        List list = rVarA.f3908f;
        if (!"".equals(list.get(list.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + rVarA);
        }
        arrayList2.add(new i5.a(new n()));
        U0.a aVar = O.f9029a;
        e eVar = O.f9031c;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        List listD = eVar.d(aVar);
        arrayList4.addAll(listD);
        List listE = eVar.e();
        ArrayList arrayList5 = new ArrayList(arrayList2.size() + 1 + listE.size());
        arrayList5.add(new C0780g(0));
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(listE);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList4);
        listD.size();
        W w5 = new W(xVar, rVarA, listUnmodifiableList, listUnmodifiableList2, false);
        if (!InterfaceC0662c.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(InterfaceC0662c.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls.getName());
                if (cls != InterfaceC0662c.class) {
                    sb.append(" which is an interface of ");
                    sb.append(InterfaceC0662c.class.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        if (w5.f9094f) {
            B3.e eVar2 = O.f9030b;
            for (Method method : InterfaceC0662c.class.getDeclaredMethods()) {
                if (!eVar2.x(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    w5.b(InterfaceC0662c.class, method);
                }
            }
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(InterfaceC0662c.class.getClassLoader(), new Class[]{InterfaceC0662c.class}, new V(w5));
        AbstractC1305a.n(objNewProxyInstance, "create(...)");
        f8255a = (InterfaceC0662c) objNewProxyInstance;
    }
}
