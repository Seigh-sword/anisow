package K4;

import C4.p;
import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements J4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f1644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f1647d;

    public c(CharSequence charSequence, int i6, int i7, g gVar) {
        AbstractC1305a.o(charSequence, "input");
        this.f1644a = charSequence;
        this.f1645b = i6;
        this.f1646c = i7;
        this.f1647d = gVar;
    }

    @Override // J4.d
    public final Iterator iterator() {
        return new b(this);
    }
}
