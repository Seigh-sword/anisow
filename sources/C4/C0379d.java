package c4;

import com.onesignal.AbstractC0571l1;
import com.onesignal.C0594t1;
import com.onesignal.InterfaceC0609y1;
import com.onesignal.T0;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: c4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0379d extends AbstractC0376a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6241b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0379d(C0594t1 c0594t1, int i6) {
        super(c0594t1);
        this.f6241b = i6;
        if (i6 != 1) {
            AbstractC1305a.o(c0594t1, "client");
        } else {
            AbstractC1305a.o(c0594t1, "client");
            super(c0594t1);
        }
    }

    @Override // c4.AbstractC0376a
    public final void a(JSONObject jSONObject, InterfaceC0609y1 interfaceC0609y1) {
        int i6 = 1;
        int i7 = this.f6241b;
        C0594t1 c0594t1 = this.f6237a;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0594t1.getClass();
                AbstractC0571l1.J("outcomes/measure", jSONObject, new T0(c0594t1, i6, interfaceC0609y1));
                break;
            default:
                c0594t1.getClass();
                AbstractC0571l1.J("outcomes/measure_sources", jSONObject, new T0(c0594t1, i6, interfaceC0609y1));
                break;
        }
    }
}
