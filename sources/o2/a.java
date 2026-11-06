package O2;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f2313i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f2314j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f2315k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f2316l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f2318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f2319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f2323g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f2324h;

    public a() {
        Paint paint = new Paint();
        this.f2324h = paint;
        this.f2317a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f2318b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f2319c = new Paint(paint2);
    }

    public final void a(int i6) {
        this.f2320d = G.a.d(i6, 68);
        this.f2321e = G.a.d(i6, 20);
        this.f2322f = G.a.d(i6, 0);
        this.f2317a.setColor(this.f2320d);
    }
}
