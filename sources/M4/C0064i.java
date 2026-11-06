package M4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: M4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0064i extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1895c = AtomicIntegerFieldUpdater.newUpdater(C0064i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0064i(InterfaceC1427e interfaceC1427e, Throwable th, boolean z5) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC1427e + " was cancelled normally");
        }
        super(th, z5);
        this._resumed$volatile = 0;
    }
}
