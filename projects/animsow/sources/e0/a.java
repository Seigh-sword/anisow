package e0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import d2.AbstractC0651b;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class a extends P2.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EditText f8229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f8230x;

    public a(EditText editText) {
        this.f8229w = editText;
        k kVar = new k(editText);
        this.f8230x = kVar;
        editText.addTextChangedListener(kVar);
        if (c.f8235b == null) {
            synchronized (c.f8234a) {
                try {
                    if (c.f8235b == null) {
                        c cVar = new c();
                        try {
                            c.f8236c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f8235b = cVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c.f8235b);
    }

    @Override // P2.e
    public final KeyListener i(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new g(keyListener);
    }

    @Override // P2.e
    public final InputConnection l(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f8229w, inputConnection, editorInfo);
    }

    @Override // P2.e
    public final void n(boolean z5) {
        k kVar = this.f8230x;
        if (kVar.f8253z != z5) {
            if (kVar.f8252y != null) {
                c0.l lVarA = c0.l.a();
                j jVar = kVar.f8252y;
                lVarA.getClass();
                AbstractC0651b.f(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lVarA.f6124a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lVarA.f6125b.remove(jVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kVar.f8253z = z5;
            if (z5) {
                k.a(kVar.f8250w, c0.l.a().b());
            }
        }
    }
}
