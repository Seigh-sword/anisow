package J2;

import android.content.Context;
import android.view.SubMenu;
import d.AbstractC0628i;
import l.o;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f1284A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Class f1285z;

    public d(Context context, Class cls, int i6) {
        super(context);
        this.f1285z = cls;
        this.f1284A = i6;
    }

    @Override // l.o
    public final q a(int i6, int i7, int i8, CharSequence charSequence) {
        int size = this.f9759f.size() + 1;
        int i9 = this.f1284A;
        if (size <= i9) {
            w();
            q qVarA = super.a(i6, i7, i8, charSequence);
            qVarA.g(true);
            v();
            return qVarA;
        }
        String simpleName = this.f1285z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i9);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(AbstractC0628i.m(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // l.o, android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f1285z.getSimpleName().concat(" does not support submenus"));
    }
}
