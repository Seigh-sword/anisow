package c4;

import com.onesignal.C0594t1;
import com.onesignal.InterfaceC0609y1;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: c4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0594t1 f6237a;

    public AbstractC0376a(C0594t1 c0594t1) {
        AbstractC1305a.o(c0594t1, "client");
        this.f6237a = c0594t1;
    }

    public abstract void a(JSONObject jSONObject, InterfaceC0609y1 interfaceC0609y1);
}
