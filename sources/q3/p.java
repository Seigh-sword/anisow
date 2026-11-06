package Q3;

import java.io.IOException;
import java.io.StringWriter;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            X3.b bVar = new X3.b(stringWriter);
            bVar.f4691A = true;
            C0.r(this, bVar);
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
