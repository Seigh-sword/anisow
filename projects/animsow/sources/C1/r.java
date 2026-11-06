package c1;

import com.android.app.activities.HomeActivity;
import d.RunnableC0632m;
import j.RunnableC0835a;
import java.util.TimerTask;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends TimerTask {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6222y = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6224x;

    public /* synthetic */ r(int i6, Object obj) {
        this.f6223w = i6;
        this.f6224x = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i6 = this.f6223w;
        Object obj = this.f6224x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                t tVar = (t) obj;
                W0.b bVar = tVar.f6184y0;
                if (bVar != null) {
                    bVar.runOnUiThread(new RunnableC0632m(11, tVar));
                    return;
                } else {
                    AbstractC1305a.W("parentActivity");
                    throw null;
                }
            case 1:
                t tVar2 = (t) obj;
                W0.b bVar2 = tVar2.f6184y0;
                if (bVar2 != null) {
                    bVar2.runOnUiThread(new RunnableC0835a(14, tVar2));
                    return;
                } else {
                    AbstractC1305a.W("parentActivity");
                    throw null;
                }
            default:
                HomeActivity homeActivity = (HomeActivity) obj;
                homeActivity.runOnUiThread(new RunnableC0835a(13, homeActivity));
                return;
        }
    }
}
