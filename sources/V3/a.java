package V3;

import android.content.Intent;
import d.AbstractActivityC0638s;
import f.C0675a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m3.v0;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends v0 {
    @Override // m3.v0
    public Intent a(AbstractActivityC0638s abstractActivityC0638s, Object obj) {
        Intent intent = (Intent) obj;
        AbstractC1305a.o(abstractActivityC0638s, "context");
        return intent;
    }

    @Override // m3.v0
    public Method b(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // m3.v0
    public Constructor c(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // m3.v0
    public String[] d(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // m3.v0
    public boolean f(Class cls) {
        return false;
    }

    @Override // m3.v0
    public Object g(Intent intent, int i6) {
        return new C0675a(intent, i6);
    }
}
