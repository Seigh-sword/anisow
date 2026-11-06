package l;

import android.content.Context;
import android.view.MenuItem;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s.C1280b;

/* JADX INFO: renamed from: l.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0911d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.j f9700c;

    public AbstractC0911d(Context context) {
        this.f9698a = context;
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean n(Collection collection, Map map) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void c();

    public abstract Object d(int i6, int i7);

    public abstract C1280b e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i6);

    public abstract Object k(int i6, Object obj);

    public final MenuItem m(MenuItem menuItem) {
        if (!(menuItem instanceof I.b)) {
            return menuItem;
        }
        I.b bVar = (I.b) menuItem;
        if (((s.k) this.f9699b) == null) {
            this.f9699b = new s.k();
        }
        MenuItem menuItem2 = (MenuItem) ((s.k) this.f9699b).getOrDefault(bVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        v vVar = new v((Context) this.f9698a, bVar);
        ((s.k) this.f9699b).put(bVar, vVar);
        return vVar;
    }

    public final Object[] o(int i6, Object[] objArr) {
        int iF = f();
        if (objArr.length < iF) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iF);
        }
        for (int i7 = 0; i7 < iF; i7++) {
            objArr[i7] = d(i7, i6);
        }
        if (objArr.length > iF) {
            objArr[iF] = null;
        }
        return objArr;
    }
}
