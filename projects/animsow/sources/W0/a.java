package W0;

import d.AbstractActivityC0638s;
import l0.AbstractC0920b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4190x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0638s f4191y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(AbstractActivityC0638s abstractActivityC0638s, int i6) {
        super(0);
        this.f4190x = i6;
        this.f4191y = abstractActivityC0638s;
    }

    public final AbstractC0920b a() {
        int i6 = this.f4190x;
        AbstractActivityC0638s abstractActivityC0638s = this.f4191y;
        switch (i6) {
        }
        return abstractActivityC0638s.a();
    }

    @Override // C4.a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f4190x) {
        }
        return a();
    }
}
