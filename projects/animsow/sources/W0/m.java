package w0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f13516a;

    public m(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f13516a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        HashMap map = this.f13516a.f5784x;
        Integer num = (Integer) obj;
        num.intValue();
        map.remove(num);
    }
}
