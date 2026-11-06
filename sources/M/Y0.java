package m;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10229a = new Object();

    public static void a(Context context) {
        if (context.getResources() instanceof a1) {
            return;
        }
        context.getResources();
        int i6 = m1.f10333a;
    }
}
