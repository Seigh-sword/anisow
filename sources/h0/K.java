package h0;

import android.util.Log;
import f.C0675a;
import f.InterfaceC0676b;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC0676b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f8665b;

    public /* synthetic */ K(W w5, int i6) {
        this.f8664a = i6;
        this.f8665b = w5;
    }

    @Override // f.InterfaceC0676b
    public final void a(Object obj) {
        StringBuilder sb;
        int i6 = this.f8664a;
        W w5 = this.f8665b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                S s5 = (S) w5.f8684F.pollFirst();
                if (s5 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = s5.f8673w;
                    if (w5.f8697c.g(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                C0675a c0675a = (C0675a) obj;
                S s6 = (S) w5.f8684F.pollLast();
                if (s6 != null) {
                    String str2 = s6.f8673w;
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BG = w5.f8697c.g(str2);
                    if (abstractComponentCallbacksC0734BG != null) {
                        abstractComponentCallbacksC0734BG.x(s6.f8674x, c0675a.f8300w, c0675a.f8301x);
                    } else {
                        sb = new StringBuilder("Activity result delivered for unknown Fragment ");
                        sb.append(str2);
                    }
                } else {
                    sb = new StringBuilder("No Activities were started for result for ");
                    sb.append(this);
                }
                Log.w("FragmentManager", sb.toString());
                break;
        }
    }
}
