package v0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f13247t = Collections.emptyList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f13248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f13249b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13257j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f13265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public W f13266s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13250c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13251d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13252e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13253f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13254g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u0 f13255h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u0 f13256i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f13258k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f13259l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13260m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m0 f13261n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13262o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13263p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13264q = -1;

    public u0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f13248a = view;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
            return;
        }
        if ((1024 & this.f13257j) == 0) {
            if (this.f13258k == null) {
                ArrayList arrayList = new ArrayList();
                this.f13258k = arrayList;
                this.f13259l = Collections.unmodifiableList(arrayList);
            }
            this.f13258k.add(obj);
        }
    }

    public final void b(int i6) {
        this.f13257j = i6 | this.f13257j;
    }

    public final int c() {
        int i6 = this.f13254g;
        return i6 == -1 ? this.f13250c : i6;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.f13257j & 1024) != 0 || (arrayList = this.f13258k) == null || arrayList.size() == 0) ? f13247t : this.f13259l;
    }

    public final boolean e(int i6) {
        return (i6 & this.f13257j) != 0;
    }

    public final boolean f() {
        View view = this.f13248a;
        return (view.getParent() == null || view.getParent() == this.f13265r) ? false : true;
    }

    public final boolean g() {
        return (this.f13257j & 1) != 0;
    }

    public final boolean h() {
        return (this.f13257j & 4) != 0;
    }

    public final boolean i() {
        if ((this.f13257j & 16) == 0) {
            WeakHashMap weakHashMap = N.V.f1964a;
            if (!this.f13248a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return (this.f13257j & 8) != 0;
    }

    public final boolean k() {
        return this.f13261n != null;
    }

    public final boolean l() {
        return (this.f13257j & 256) != 0;
    }

    public final boolean m() {
        return (this.f13257j & 2) != 0;
    }

    public final void n(int i6, boolean z5) {
        if (this.f13251d == -1) {
            this.f13251d = this.f13250c;
        }
        if (this.f13254g == -1) {
            this.f13254g = this.f13250c;
        }
        if (z5) {
            this.f13254g += i6;
        }
        this.f13250c += i6;
        View view = this.f13248a;
        if (view.getLayoutParams() != null) {
            ((g0) view.getLayoutParams()).f13127c = true;
        }
    }

    public final void o() {
        this.f13257j = 0;
        this.f13250c = -1;
        this.f13251d = -1;
        this.f13252e = -1L;
        this.f13254g = -1;
        this.f13260m = 0;
        this.f13255h = null;
        this.f13256i = null;
        ArrayList arrayList = this.f13258k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f13257j &= -1025;
        this.f13263p = 0;
        this.f13264q = -1;
        RecyclerView.j(this);
    }

    public final void p(boolean z5) {
        int i6;
        int i7 = this.f13260m;
        int i8 = z5 ? i7 - 1 : i7 + 1;
        this.f13260m = i8;
        if (i8 < 0) {
            this.f13260m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z5 && i8 == 1) {
            i6 = this.f13257j | 16;
        } else if (!z5 || i8 != 0) {
            return;
        } else {
            i6 = this.f13257j & (-17);
        }
        this.f13257j = i6;
    }

    public final boolean q() {
        return (this.f13257j & 128) != 0;
    }

    public final boolean r() {
        return (this.f13257j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f13250c + " id=" + this.f13252e + ", oldPos=" + this.f13251d + ", pLpos:" + this.f13254g);
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.f13262o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.f13257j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f13260m + ")");
        }
        if ((this.f13257j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f13248a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
