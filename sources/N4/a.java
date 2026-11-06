package N4;

import M4.m0;
import R4.o;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {
    @Override // R4.o
    public int a() {
        return 1073741823;
    }

    @Override // R4.o
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // R4.o
    public m0 c(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(d.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
