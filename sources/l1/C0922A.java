package l1;

import android.util.Log;
import j1.EnumC0843a;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0922A extends Exception {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final StackTraceElement[] f9836B = new StackTraceElement[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f9837A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f9838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j1.i f9839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EnumC0843a f9840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Class f9841z;

    public C0922A(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof C0922A)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((C0922A) th).f9838w.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, z zVar) {
        try {
            c(list, zVar);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void c(List list, z zVar) throws IOException {
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            zVar.append("Cause (");
            int i7 = i6 + 1;
            zVar.append(String.valueOf(i7));
            zVar.append(" of ");
            zVar.append(String.valueOf(size));
            zVar.append("): ");
            Throwable th = (Throwable) list.get(i6);
            if (th instanceof C0922A) {
                ((C0922A) th).f(zVar);
            } else {
                d(th, zVar);
            }
            i6 = i7;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i7 = i6 + 1;
            sb.append(i7);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i6));
            i6 = i7;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f9838w, new z(appendable));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f9837A);
        sb.append(this.f9841z != null ? ", " + this.f9841z : "");
        sb.append(this.f9840y != null ? ", " + this.f9840y : "");
        sb.append(this.f9839x != null ? ", " + this.f9839x : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str = " root causes:";
        }
        sb.append(str);
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    public C0922A(String str, List list) {
        this.f9837A = str;
        setStackTrace(f9836B);
        this.f9838w = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
