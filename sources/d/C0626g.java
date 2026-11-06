package d;

import android.content.Context;
import android.os.Bundle;
import e.InterfaceC0659a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0626g implements InterfaceC0659a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0638s f8102b;

    public /* synthetic */ C0626g(h0.E e6, int i6) {
        this.f8101a = i6;
        this.f8102b = e6;
    }

    @Override // e.InterfaceC0659a
    public final void a(Context context) {
        int i6 = this.f8101a;
        AbstractActivityC0638s abstractActivityC0638s = this.f8102b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(abstractActivityC0638s, "this$0");
                AbstractC1305a.o(context, "it");
                Bundle bundleA = abstractActivityC0638s.f8142z.f14072b.a("android:support:activity-result");
                if (bundleA != null) {
                    C0635p c0635p = abstractActivityC0638s.f8129D;
                    c0635p.getClass();
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0635p.f8311d.addAll(stringArrayList2);
                    }
                    Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0635p.f8314g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        String str = stringArrayList.get(i7);
                        LinkedHashMap linkedHashMap = c0635p.f8309b;
                        boolean zContainsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = c0635p.f8308a;
                        if (zContainsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof E4.a) {
                                    S3.a.N(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i7);
                        AbstractC1305a.n(num2, "rcs[i]");
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i7);
                        AbstractC1305a.n(str2, "keys[i]");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        linkedHashMap.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                h0.D d6 = (h0.D) ((h0.E) abstractActivityC0638s).f8646P.f3073x;
                d6.f8640A.b(d6, d6, null);
                return;
        }
    }
}
