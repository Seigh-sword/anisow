package h5;

import V4.InterfaceC0174e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9089a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0174e f9090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V4.r f9091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f9093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9094f;

    public W(InterfaceC0174e interfaceC0174e, V4.r rVar, List list, List list2, boolean z5) {
        this.f9090b = interfaceC0174e;
        this.f9091c = rVar;
        this.f9092d = list;
        this.f9093e = list2;
        this.f9094f = z5;
    }

    public final InterfaceC0784k a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f9093e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = iIndexOf; i6 < size; i6++) {
            InterfaceC0784k interfaceC0784kA = ((AbstractC0783j) list.get(i6)).a(type, annotationArr);
            if (interfaceC0784kA != null) {
                return interfaceC0784kA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0783j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final X b(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f9089a.get(method);
            if (objPutIfAbsent instanceof X) {
                return (X) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f9089a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                AbstractC0794v abstractC0794vA = X.a(this, cls, method);
                                this.f9089a.put(method, abstractC0794vA);
                                return abstractC0794vA;
                            } catch (Throwable th) {
                                this.f9089a.remove(method);
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f9089a.get(method);
                    if (obj2 != null) {
                        return (X) obj2;
                    }
                } finally {
                }
            }
        }
    }

    public final InterfaceC0790q c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f9092d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = iIndexOf; i6 < size; i6++) {
            InterfaceC0790q interfaceC0790qA = ((AbstractC0789p) list.get(i6)).a(type);
            if (interfaceC0790qA != null) {
                return interfaceC0790qA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0789p) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final InterfaceC0790q d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f9092d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i6 = iIndexOf; i6 < size; i6++) {
            InterfaceC0790q interfaceC0790qB = ((AbstractC0789p) list.get(i6)).b(type, annotationArr, this);
            if (interfaceC0790qB != null) {
                return interfaceC0790qB;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0789p) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f9092d;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((AbstractC0789p) list.get(i6)).getClass();
        }
    }
}
