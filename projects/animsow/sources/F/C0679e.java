package f;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import d.AbstractC0628i;
import java.util.LinkedHashMap;
import m3.v0;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0679e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0680f f8305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f8307c;

    public C0679e(AbstractC0680f abstractC0680f, String str, v0 v0Var) {
        this.f8305a = abstractC0680f;
        this.f8306b = str;
        this.f8307c = v0Var;
    }

    public final void a() {
        Object parcelable;
        Integer num;
        AbstractC0680f abstractC0680f = this.f8305a;
        abstractC0680f.getClass();
        String str = this.f8306b;
        AbstractC1305a.o(str, "key");
        if (!abstractC0680f.f8311d.contains(str) && (num = (Integer) abstractC0680f.f8309b.remove(str)) != null) {
            abstractC0680f.f8308a.remove(num);
        }
        abstractC0680f.f8312e.remove(str);
        LinkedHashMap linkedHashMap = abstractC0680f.f8313f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbN = AbstractC0628i.n("Dropping pending result for request ", str, ": ");
            sbN.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbN.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = abstractC0680f.f8314g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = J.d.a(bundle, str, C0675a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0675a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0675a) parcelable));
            bundle.remove(str);
        }
        AbstractC0628i.p(abstractC0680f.f8310c.get(str));
    }
}
