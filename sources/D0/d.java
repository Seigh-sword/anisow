package D0;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f252a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f272u;

    public d() {
        Paint paint = new Paint();
        this.f253b = paint;
        Paint paint2 = new Paint();
        this.f254c = paint2;
        Paint paint3 = new Paint();
        this.f255d = paint3;
        this.f256e = 0.0f;
        this.f257f = 0.0f;
        this.f258g = 0.0f;
        this.f259h = 5.0f;
        this.f267p = 1.0f;
        this.f271t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i6) {
        this.f261j = i6;
        this.f272u = this.f260i[i6];
    }
}
