package d;

import android.os.Bundle;
import androidx.lifecycle.EnumC0313m;
import h0.W;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import s4.AbstractC1305a;
import z0.InterfaceC1522c;

/* JADX INFO: renamed from: d.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0625f implements InterfaceC1522c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8100b;

    public /* synthetic */ C0625f(int i6, Object obj) {
        this.f8099a = i6;
        this.f8100b = obj;
    }

    @Override // z0.InterfaceC1522c
    public final Bundle a() {
        int i6 = this.f8099a;
        Object obj = this.f8100b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractActivityC0638s abstractActivityC0638s = (AbstractActivityC0638s) obj;
                AbstractC1305a.o(abstractActivityC0638s, "this$0");
                Bundle bundle = new Bundle();
                C0635p c0635p = abstractActivityC0638s.f8129D;
                c0635p.getClass();
                LinkedHashMap linkedHashMap = c0635p.f8309b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0635p.f8311d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0635p.f8314g));
                return bundle;
            case 1:
                h0.E e6 = (h0.E) obj;
                int i7 = h0.E.f8645U;
                while (h0.E.j(e6.f8646P.C())) {
                }
                e6.f8647Q.e(EnumC0313m.ON_STOP);
                return new Bundle();
            default:
                return ((W) obj).W();
        }
    }
}
