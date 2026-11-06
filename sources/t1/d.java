package T1;

import android.content.Intent;
import android.os.Bundle;
import q2.InterfaceC1258a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1258a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d f3417w = new d();

    @Override // q2.InterfaceC1258a
    public final Object b(q2.i iVar) {
        Intent intent = (Intent) ((Bundle) iVar.d()).getParcelable("notification_data");
        if (intent != null) {
            return new a(intent);
        }
        return null;
    }
}
