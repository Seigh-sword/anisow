package m3;

import android.content.Intent;
import d.AbstractActivityC0638s;
import g.C0712a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    public abstract Intent a(AbstractActivityC0638s abstractActivityC0638s, Object obj);

    public abstract Method b(Class cls, Field field);

    public abstract Constructor c(Class cls);

    public abstract String[] d(Class cls);

    public C0712a e(AbstractActivityC0638s abstractActivityC0638s, Object obj) {
        AbstractC1305a.o(abstractActivityC0638s, "context");
        return null;
    }

    public abstract boolean f(Class cls);

    public abstract Object g(Intent intent, int i6);
}
