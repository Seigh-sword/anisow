package s0;

import J.f;
import M4.C0063h;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import n.ExecutorC1138a;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: s0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1288c extends Y2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MeasurementManager f12539b;

    public C1288c(Context context) {
        Object systemService = context.getSystemService((Class<Object>) AbstractC1287b.b());
        AbstractC1305a.n(systemService, "context.getSystemService…:class.java\n            )");
        this.f12539b = AbstractC1287b.a(systemService);
    }

    public Object H(AbstractC1286a abstractC1286a, InterfaceC1427e<? super C1316l> interfaceC1427e) {
        new C0063h(1, AbstractC1305a.H(interfaceC1427e)).v();
        AbstractC1287b.c();
        throw null;
    }

    public Object I(AbstractC1289d abstractC1289d, InterfaceC1427e<? super C1316l> interfaceC1427e) {
        new C0063h(1, AbstractC1305a.H(interfaceC1427e)).v();
        AbstractC1287b.g();
        throw null;
    }

    public Object J(AbstractC1290e abstractC1290e, InterfaceC1427e<? super C1316l> interfaceC1427e) {
        new C0063h(1, AbstractC1305a.H(interfaceC1427e)).v();
        AbstractC1287b.h();
        throw null;
    }

    @Override // Y2.b
    public Object o(InterfaceC1427e<? super Integer> interfaceC1427e) {
        C0063h c0063h = new C0063h(1, AbstractC1305a.H(interfaceC1427e));
        c0063h.v();
        this.f12539b.getMeasurementApiStatus(new ExecutorC1138a(5), new f(c0063h));
        return c0063h.u();
    }

    @Override // Y2.b
    public Object w(Uri uri, InputEvent inputEvent, InterfaceC1427e<? super C1316l> interfaceC1427e) {
        C0063h c0063h = new C0063h(1, AbstractC1305a.H(interfaceC1427e));
        c0063h.v();
        this.f12539b.registerSource(uri, inputEvent, new ExecutorC1138a(2), new f(c0063h));
        Object objU = c0063h.u();
        return objU == EnumC1481a.f13592w ? objU : C1316l.f12640a;
    }

    @Override // Y2.b
    public Object x(Uri uri, InterfaceC1427e<? super C1316l> interfaceC1427e) {
        C0063h c0063h = new C0063h(1, AbstractC1305a.H(interfaceC1427e));
        c0063h.v();
        this.f12539b.registerTrigger(uri, new ExecutorC1138a(6), new f(c0063h));
        Object objU = c0063h.u();
        return objU == EnumC1481a.f13592w ? objU : C1316l.f12640a;
    }
}
