package y3;

import java.nio.charset.Charset;
import java.util.Map;
import w3.C1478b;
import w3.InterfaceC1480d;

/* JADX INFO: renamed from: y3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1508a implements InterfaceC1480d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13820a;

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        switch (this.f13820a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new C1478b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                w3.e eVar = (w3.e) obj2;
                Charset charset = z3.f.f14113f;
                eVar.f(z3.f.f14114g, entry.getKey());
                eVar.f(z3.f.f14115h, entry.getValue());
                return;
            default:
                throw new C1478b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
