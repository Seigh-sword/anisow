package R4;

import s4.AbstractC1313i;
import x4.AbstractC1492a;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3042a = 0;

    static {
        Object objM;
        Object objM2;
        Exception exc = new Exception();
        String simpleName = com.bumptech.glide.c.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objM = AbstractC1492a.class.getCanonicalName();
        } catch (Throwable th) {
            objM = S3.a.m(th);
        }
        if (AbstractC1313i.a(objM) != null) {
            objM = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM2 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            objM2 = S3.a.m(th2);
        }
        if (AbstractC1313i.a(objM2) != null) {
            objM2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
