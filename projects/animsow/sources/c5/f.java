package c5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6254c;

    public f(ArrayList arrayList) {
        this.f6252a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = W4.b.f4485b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f6253b = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        List list = this.f6252a;
        if (zEquals && objArr.length == 0) {
            return list;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list2 = (List) obj2;
                int size = list2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    String str = (String) list2.get(i6);
                    if (list.contains(str)) {
                        this.f6254c = str;
                        return str;
                    }
                }
                String str2 = (String) list.get(0);
                this.f6254c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f6254c = (String) objArr[0];
        return null;
    }
}
