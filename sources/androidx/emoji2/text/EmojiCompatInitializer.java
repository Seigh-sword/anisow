package androidx.emoji2.text;

import C0.a;
import C0.b;
import android.content.Context;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.InterfaceC0321v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import c0.l;
import c0.m;
import c0.z;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k.C0878a;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // C0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // C0.b
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objB;
        z zVar = new z(new C0878a(context, 1));
        zVar.f6120b = 1;
        if (l.f6123k == null) {
            synchronized (l.f6122j) {
                try {
                    if (l.f6123k == null) {
                        l.f6123k = new l(zVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f107e) {
            try {
                objB = aVarC.f108a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0323x c0323xG = ((InterfaceC0321v) objB).g();
        c0323xG.a(new m(this, c0323xG));
    }
}
