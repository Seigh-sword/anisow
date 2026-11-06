package androidx.profileinstaller;

import B3.e;
import C0.b;
import android.content.Context;
import d.RunnableC0637r;
import java.util.Collections;
import java.util.List;
import t0.AbstractC1334f;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // C0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // C0.b
    public final Object b(Context context) {
        AbstractC1334f.a(new RunnableC0637r(this, 7, context.getApplicationContext()));
        return new e();
    }
}
