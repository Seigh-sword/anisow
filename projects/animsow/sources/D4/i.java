package D4;

import java.io.Serializable;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements g, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f371w;

    public i(int i6) {
        this.f371w = i6;
    }

    @Override // D4.g
    public final int f() {
        return this.f371w;
    }

    public final String toString() {
        s.f378a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC1305a.n(string, "renderLambdaToString(...)");
        return string;
    }
}
