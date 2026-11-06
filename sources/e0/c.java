package e0;

import android.text.Editable;
import c0.D;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8234a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f8235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f8236c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f8236c;
        return cls != null ? new D(cls, charSequence) : super.newEditable(charSequence);
    }
}
