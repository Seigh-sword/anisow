package P0;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import c0.C0351B;
import c0.E;
import com.google.android.gms.internal.measurement.C0405e;
import com.google.android.gms.internal.measurement.C0423h;
import com.google.android.gms.internal.measurement.InterfaceC0459n;
import d.AbstractC0628i;
import d0.C0646a;
import d0.C0647b;
import d2.AbstractC0651b;
import i.C0803c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k.AbstractC0880c;
import k.C0884g;
import k.InterfaceC0879b;
import l.MenuC0904D;
import l.o;
import l.v;
import s.C1280b;
import s.C1283e;
import s.k;
import u.i;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0879b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static h f2406e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2410d;

    public h(int i6) {
        if (i6 == 6) {
            this.f2407a = new C1280b();
            this.f2408b = new SparseArray();
            this.f2409c = new C1283e();
            this.f2410d = new C1280b();
            return;
        }
        if (i6 != 9) {
            this.f2407a = new u.e(256, 0);
            this.f2408b = new u.e(256, 0);
            this.f2409c = new u.e(256, 0);
            this.f2410d = new i[32];
            return;
        }
        this.f2407a = null;
        this.f2408b = new ArrayList();
        this.f2409c = null;
        this.f2410d = "";
    }

    public static synchronized h f(Context context, C0803c c0803c) {
        try {
            if (f2406e == null) {
                h hVar = new h();
                Context applicationContext = context.getApplicationContext();
                hVar.f2407a = new a(applicationContext, c0803c);
                hVar.f2408b = new b(applicationContext, c0803c);
                hVar.f2409c = new f(applicationContext, c0803c);
                hVar.f2410d = new g(applicationContext, c0803c);
                f2406e = hVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2406e;
    }

    @Override // k.InterfaceC0879b
    public final boolean a(AbstractC0880c abstractC0880c, o oVar) {
        return ((ActionMode.Callback) this.f2407a).onCreateActionMode(e(abstractC0880c), g(oVar));
    }

    @Override // k.InterfaceC0879b
    public final boolean b(AbstractC0880c abstractC0880c, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2407a).onActionItemClicked(e(abstractC0880c), new v((Context) this.f2408b, (I.b) menuItem));
    }

    @Override // k.InterfaceC0879b
    public final boolean c(AbstractC0880c abstractC0880c, o oVar) {
        return ((ActionMode.Callback) this.f2407a).onPrepareActionMode(e(abstractC0880c), g(oVar));
    }

    @Override // k.InterfaceC0879b
    public final void d(AbstractC0880c abstractC0880c) {
        ((ActionMode.Callback) this.f2407a).onDestroyActionMode(e(abstractC0880c));
    }

    public final C0884g e(AbstractC0880c abstractC0880c) {
        int size = ((ArrayList) this.f2409c).size();
        for (int i6 = 0; i6 < size; i6++) {
            C0884g c0884g = (C0884g) ((ArrayList) this.f2409c).get(i6);
            if (c0884g != null && c0884g.f9581b == abstractC0880c) {
                return c0884g;
            }
        }
        C0884g c0884g2 = new C0884g((Context) this.f2408b, abstractC0880c);
        ((ArrayList) this.f2409c).add(c0884g2);
        return c0884g2;
    }

    public final Menu g(o oVar) {
        Menu menu = (Menu) ((k) this.f2410d).getOrDefault(oVar, null);
        if (menu != null) {
            return menu;
        }
        MenuC0904D menuC0904D = new MenuC0904D((Context) this.f2408b, oVar);
        ((k) this.f2410d).put(oVar, menuC0904D);
        return menuC0904D;
    }

    public final h h() {
        return new h(this, (C1358b) this.f2408b);
    }

    public final InterfaceC0459n i(C0405e c0405e) {
        InterfaceC0459n interfaceC0459nK = InterfaceC0459n.f6885n;
        Iterator itX = c0405e.x();
        while (itX.hasNext()) {
            interfaceC0459nK = ((C1358b) this.f2408b).k(this, c0405e.q(((Integer) itX.next()).intValue()));
            if (interfaceC0459nK instanceof C0423h) {
                break;
            }
        }
        return interfaceC0459nK;
    }

    public final InterfaceC0459n j(InterfaceC0459n interfaceC0459n) {
        return ((C1358b) this.f2408b).k(this, interfaceC0459n);
    }

    public final InterfaceC0459n k(String str) {
        h hVar = this;
        while (!((Map) hVar.f2409c).containsKey(str)) {
            Object obj = hVar.f2407a;
            if (((h) obj) == null) {
                throw new IllegalArgumentException(AbstractC0628i.i(str, " is not defined"));
            }
            hVar = (h) obj;
        }
        return (InterfaceC0459n) ((Map) hVar.f2409c).get(str);
    }

    public final void l(String str, InterfaceC0459n interfaceC0459n) {
        if (((Map) this.f2410d).containsKey(str)) {
            return;
        }
        if (interfaceC0459n == null) {
            ((Map) this.f2409c).remove(str);
        } else {
            ((Map) this.f2409c).put(str, interfaceC0459n);
        }
    }

    public final boolean m(String str) {
        h hVar = this;
        while (!((Map) hVar.f2409c).containsKey(str)) {
            Object obj = hVar.f2407a;
            if (((h) obj) == null) {
                return false;
            }
            hVar = (h) obj;
        }
        return true;
    }

    public final void n(String str, InterfaceC0459n interfaceC0459n) {
        h hVar = this;
        while (!((Map) hVar.f2409c).containsKey(str)) {
            Object obj = hVar.f2407a;
            if (((h) obj) == null || !((h) obj).m(str)) {
                break;
            } else {
                hVar = (h) hVar.f2407a;
            }
        }
        if (((Map) hVar.f2410d).containsKey(str)) {
            return;
        }
        if (interfaceC0459n == null) {
            ((Map) hVar.f2409c).remove(str);
        } else {
            ((Map) hVar.f2409c).put(str, interfaceC0459n);
        }
    }

    public h(h hVar, C1358b c1358b) {
        this.f2409c = new HashMap();
        this.f2410d = new HashMap();
        this.f2407a = hVar;
        this.f2408b = c1358b;
    }

    public h(Typeface typeface, C0647b c0647b) {
        int i6;
        int i7;
        this.f2410d = typeface;
        this.f2407a = c0647b;
        this.f2409c = new C0351B(1024);
        C0647b c0647b2 = (C0647b) this.f2407a;
        int iA = c0647b2.a(6);
        if (iA != 0) {
            int i8 = iA + c0647b2.f8159a;
            i6 = c0647b2.f8160b.getInt(c0647b2.f8160b.getInt(i8) + i8);
        } else {
            i6 = 0;
        }
        this.f2408b = new char[i6 * 2];
        C0647b c0647b3 = (C0647b) this.f2407a;
        int iA2 = c0647b3.a(6);
        if (iA2 != 0) {
            int i9 = iA2 + c0647b3.f8159a;
            i7 = c0647b3.f8160b.getInt(c0647b3.f8160b.getInt(i9) + i9);
        } else {
            i7 = 0;
        }
        for (int i10 = 0; i10 < i7; i10++) {
            E e6 = new E(this, i10);
            C0646a c0646aC = e6.c();
            int iA3 = c0646aC.a(4);
            Character.toChars(iA3 != 0 ? c0646aC.f8160b.getInt(iA3 + c0646aC.f8159a) : 0, (char[]) this.f2408b, i10 * 2);
            AbstractC0651b.d("invalid metadata codepoint length", e6.b() > 0);
            ((C0351B) this.f2409c).a(e6, 0, e6.b() - 1);
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f2407a = obj;
        this.f2408b = obj2;
        this.f2409c = obj3;
        this.f2410d = obj4;
    }
}
