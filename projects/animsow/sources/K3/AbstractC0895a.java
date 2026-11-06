package k3;

import F0.C0022i;
import java.util.concurrent.atomic.AtomicBoolean;
import n.ExecutorC1138a;
import q2.j;
import q2.l;
import q2.s;

/* JADX INFO: renamed from: k3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0895a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorC1138a f9646a = new ExecutorC1138a(12);

    public static s a(s sVar, s sVar2) {
        l lVar = new l(1);
        j jVar = new j((l) lVar.f12355x);
        C0022i c0022i = new C0022i(jVar, new AtomicBoolean(false), lVar, 6);
        ExecutorC1138a executorC1138a = f9646a;
        sVar.j(executorC1138a, c0022i);
        sVar2.j(executorC1138a, c0022i);
        return jVar.f12351a;
    }
}
