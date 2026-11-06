package Y0;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearProgressIndicator f4777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f4778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwipeRefreshLayout f4779d;

    public b(ConstraintLayout constraintLayout, RecyclerView recyclerView, LinearProgressIndicator linearProgressIndicator, SwipeRefreshLayout swipeRefreshLayout) {
        this.f4776a = constraintLayout;
        this.f4778c = recyclerView;
        this.f4777b = linearProgressIndicator;
        this.f4779d = swipeRefreshLayout;
    }

    public /* synthetic */ b(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, int i6) {
        this.f4776a = constraintLayout;
        this.f4777b = linearProgressIndicator;
        this.f4778c = recyclerView;
        this.f4779d = swipeRefreshLayout;
    }
}
