package T1;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.j f3442b = new q2.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f3444d;

    public o(int i6, int i7, Bundle bundle) {
        this.f3441a = i6;
        this.f3443c = i7;
        this.f3444d = bundle;
    }

    public final void a(p pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + pVar.toString());
        }
        this.f3442b.f12351a.k(pVar);
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f3442b.a(bundle);
    }

    public final String toString() {
        boolean z5;
        StringBuilder sb = new StringBuilder("Request { what=");
        sb.append(this.f3443c);
        sb.append(" id=");
        sb.append(this.f3441a);
        sb.append(" oneWay=");
        switch (((n) this).f3440e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                z5 = true;
                break;
            default:
                z5 = false;
                break;
        }
        sb.append(z5);
        sb.append("}");
        return sb.toString();
    }
}
