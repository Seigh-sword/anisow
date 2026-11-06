package g;

import E.f;
import J4.g;
import android.content.Intent;
import d.AbstractActivityC0638s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m3.v0;
import s4.AbstractC1305a;
import s4.C1311g;
import t4.k;
import t4.q;

/* JADX INFO: renamed from: g.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0713b extends v0 {
    @Override // m3.v0
    public final Intent a(AbstractActivityC0638s abstractActivityC0638s, Object obj) {
        AbstractC1305a.o(abstractActivityC0638s, "context");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
        AbstractC1305a.n(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // m3.v0
    public final C0712a e(AbstractActivityC0638s abstractActivityC0638s, Object obj) {
        String[] strArr = (String[]) obj;
        AbstractC1305a.o(abstractActivityC0638s, "context");
        if (strArr.length == 0) {
            return new C0712a(q.f12757w);
        }
        for (String str : strArr) {
            if (f.a(abstractActivityC0638s, str) != 0) {
                return null;
            }
        }
        int iM = AbstractC1305a.M(strArr.length);
        if (iM < 16) {
            iM = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new C0712a(linkedHashMap);
    }

    @Override // m3.v0
    public final Object g(Intent intent, int i6) {
        q qVar = q.f12757w;
        if (i6 != -1 || intent == null) {
            return qVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return qVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i7 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i7 == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it = arrayList2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(k.W(arrayList2), k.W(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new C1311g(it.next(), it2.next()));
        }
        return g.c0(arrayList3);
    }
}
