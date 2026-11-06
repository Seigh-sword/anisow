package f;

import W.Q;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import m3.v0;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0680f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8308a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8309b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8310c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8311d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f8312e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f8313f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f8314g = new Bundle();

    public final boolean a(int i6, int i7, Intent intent) {
        String str = (String) this.f8308a.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        C0677c c0677c = (C0677c) this.f8312e.get(str);
        if ((c0677c != null ? c0677c.f8302a : null) != null) {
            ArrayList arrayList = this.f8311d;
            if (arrayList.contains(str)) {
                c0677c.f8302a.a(c0677c.f8303b.g(intent, i7));
                arrayList.remove(str);
                return true;
            }
        }
        this.f8313f.remove(str);
        this.f8314g.putParcelable(str, new C0675a(intent, i7));
        return true;
    }

    public abstract void b(int i6, v0 v0Var, Object obj);

    public final C0679e c(String str, v0 v0Var, InterfaceC0676b interfaceC0676b) {
        Object parcelable;
        AbstractC1305a.o(str, "key");
        LinkedHashMap linkedHashMap = this.f8309b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            J4.d<Number> cVar = new J4.c(new Q(16, C0678d.f8304x));
            if (!(cVar instanceof J4.a)) {
                cVar = new J4.a(cVar);
            }
            for (Number number : cVar) {
                int iIntValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f8308a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                    int iIntValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f8312e.put(str, new C0677c(interfaceC0676b, v0Var));
        LinkedHashMap linkedHashMap3 = this.f8313f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            interfaceC0676b.a(obj);
        }
        int i6 = Build.VERSION.SDK_INT;
        Bundle bundle = this.f8314g;
        if (i6 >= 34) {
            parcelable = J.d.a(bundle, str, C0675a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0675a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0675a c0675a = (C0675a) parcelable;
        if (c0675a != null) {
            bundle.remove(str);
            interfaceC0676b.a(v0Var.g(c0675a.f8301x, c0675a.f8300w));
        }
        return new C0679e(this, str, v0Var);
    }
}
