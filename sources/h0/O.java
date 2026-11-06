package h0;

import android.util.Log;
import f.C0675a;
import f.InterfaceC0676b;

/* JADX INFO: loaded from: classes.dex */
public final class O implements InterfaceC0676b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f8671a;

    public /* synthetic */ O(W w5) {
        this.f8671a = w5;
    }

    @Override // f.InterfaceC0676b
    public final void a(Object obj) {
        StringBuilder sb;
        C0675a c0675a = (C0675a) obj;
        W w5 = this.f8671a;
        S s5 = (S) w5.f8684F.pollFirst();
        if (s5 == null) {
            sb = new StringBuilder("No IntentSenders were started for ");
            sb.append(this);
        } else {
            J3.w wVar = w5.f8697c;
            String str = s5.f8673w;
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BG = wVar.g(str);
            if (abstractComponentCallbacksC0734BG != null) {
                abstractComponentCallbacksC0734BG.x(s5.f8674x, c0675a.f8300w, c0675a.f8301x);
                return;
            } else {
                sb = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                sb.append(str);
            }
        }
        Log.w("FragmentManager", sb.toString());
    }
}
