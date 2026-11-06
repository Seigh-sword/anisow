package P2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f2417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G2.a f2418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f2419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f2420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ColorStateList f2421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f2422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f2424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f2425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f2431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint.Style f2437u;

    public f(f fVar) {
        this.f2419c = null;
        this.f2420d = null;
        this.f2421e = null;
        this.f2422f = null;
        this.f2423g = PorterDuff.Mode.SRC_IN;
        this.f2424h = null;
        this.f2425i = 1.0f;
        this.f2426j = 1.0f;
        this.f2428l = 255;
        this.f2429m = 0.0f;
        this.f2430n = 0.0f;
        this.f2431o = 0.0f;
        this.f2432p = 0;
        this.f2433q = 0;
        this.f2434r = 0;
        this.f2435s = 0;
        this.f2436t = false;
        this.f2437u = Paint.Style.FILL_AND_STROKE;
        this.f2417a = fVar.f2417a;
        this.f2418b = fVar.f2418b;
        this.f2427k = fVar.f2427k;
        this.f2419c = fVar.f2419c;
        this.f2420d = fVar.f2420d;
        this.f2423g = fVar.f2423g;
        this.f2422f = fVar.f2422f;
        this.f2428l = fVar.f2428l;
        this.f2425i = fVar.f2425i;
        this.f2434r = fVar.f2434r;
        this.f2432p = fVar.f2432p;
        this.f2436t = fVar.f2436t;
        this.f2426j = fVar.f2426j;
        this.f2429m = fVar.f2429m;
        this.f2430n = fVar.f2430n;
        this.f2431o = fVar.f2431o;
        this.f2433q = fVar.f2433q;
        this.f2435s = fVar.f2435s;
        this.f2421e = fVar.f2421e;
        this.f2437u = fVar.f2437u;
        if (fVar.f2424h != null) {
            this.f2424h = new Rect(fVar.f2424h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f2439A = true;
        return gVar;
    }

    public f(j jVar) {
        this.f2419c = null;
        this.f2420d = null;
        this.f2421e = null;
        this.f2422f = null;
        this.f2423g = PorterDuff.Mode.SRC_IN;
        this.f2424h = null;
        this.f2425i = 1.0f;
        this.f2426j = 1.0f;
        this.f2428l = 255;
        this.f2429m = 0.0f;
        this.f2430n = 0.0f;
        this.f2431o = 0.0f;
        this.f2432p = 0;
        this.f2433q = 0;
        this.f2434r = 0;
        this.f2435s = 0;
        this.f2436t = false;
        this.f2437u = Paint.Style.FILL_AND_STROKE;
        this.f2417a = jVar;
        this.f2418b = null;
    }
}
