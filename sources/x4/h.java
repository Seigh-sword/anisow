package x4;

import D4.s;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends c implements D4.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f13688z;

    public h(int i6, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f13688z = i6;
    }

    @Override // D4.g
    public final int f() {
        return this.f13688z;
    }

    @Override // x4.AbstractC1492a
    public final String toString() {
        if (this.f13682w != null) {
            return super.toString();
        }
        s.f378a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC1305a.n(string, "renderLambdaToString(...)");
        return string;
    }
}
