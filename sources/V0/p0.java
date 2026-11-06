package v0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f13193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13195g;

    public final void a(RecyclerView recyclerView) {
        int i6 = this.f13192d;
        if (i6 >= 0) {
            this.f13192d = -1;
            recyclerView.M(i6);
            this.f13194f = false;
            return;
        }
        if (!this.f13194f) {
            this.f13195g = 0;
            return;
        }
        Interpolator interpolator = this.f13193e;
        if (interpolator != null && this.f13191c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i7 = this.f13191c;
        if (i7 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f5758y0.b(this.f13189a, this.f13190b, i7, interpolator);
        int i8 = this.f13195g + 1;
        this.f13195g = i8;
        if (i8 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f13194f = false;
    }
}
