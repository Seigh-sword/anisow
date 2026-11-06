package v0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f13288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f13289g;

    public y0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f13289g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f13283a = -1;
        this.f13284b = Integer.MIN_VALUE;
        this.f13285c = false;
        this.f13286d = false;
        this.f13287e = false;
        int[] iArr = this.f13288f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
