package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: z.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1518i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f13944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f13945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1519j f13946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f13947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f13948f;

    public C1518i() {
        l lVar = new l();
        lVar.f14027a = 0;
        lVar.f14028b = 0;
        lVar.f14029c = 1.0f;
        lVar.f14030d = Float.NaN;
        this.f13944b = lVar;
        k kVar = new k();
        kVar.f14018a = -1;
        kVar.f14019b = 0;
        kVar.f14020c = -1;
        kVar.f14021d = Float.NaN;
        kVar.f14022e = Float.NaN;
        kVar.f14023f = Float.NaN;
        kVar.f14024g = -1;
        kVar.f14025h = null;
        kVar.f14026i = -1;
        this.f13945c = kVar;
        C1519j c1519j = new C1519j();
        c1519j.f13976a = false;
        c1519j.f13982d = -1;
        c1519j.f13984e = -1;
        c1519j.f13986f = -1.0f;
        c1519j.f13988g = true;
        c1519j.f13990h = -1;
        c1519j.f13992i = -1;
        c1519j.f13994j = -1;
        c1519j.f13996k = -1;
        c1519j.f13998l = -1;
        c1519j.f14000m = -1;
        c1519j.f14002n = -1;
        c1519j.f14004o = -1;
        c1519j.f14006p = -1;
        c1519j.f14007q = -1;
        c1519j.f14008r = -1;
        c1519j.f14009s = -1;
        c1519j.f14010t = -1;
        c1519j.f14011u = -1;
        c1519j.f14012v = -1;
        c1519j.f14013w = 0.5f;
        c1519j.f14014x = 0.5f;
        c1519j.f14015y = null;
        c1519j.f14016z = -1;
        c1519j.f13950A = 0;
        c1519j.f13951B = 0.0f;
        c1519j.f13952C = -1;
        c1519j.f13953D = -1;
        c1519j.f13954E = -1;
        c1519j.f13955F = 0;
        c1519j.f13956G = 0;
        c1519j.f13957H = 0;
        c1519j.f13958I = 0;
        c1519j.f13959J = 0;
        c1519j.f13960K = 0;
        c1519j.f13961L = 0;
        c1519j.f13962M = Integer.MIN_VALUE;
        c1519j.f13963N = Integer.MIN_VALUE;
        c1519j.f13964O = Integer.MIN_VALUE;
        c1519j.f13965P = Integer.MIN_VALUE;
        c1519j.f13966Q = Integer.MIN_VALUE;
        c1519j.f13967R = Integer.MIN_VALUE;
        c1519j.f13968S = Integer.MIN_VALUE;
        c1519j.f13969T = -1.0f;
        c1519j.f13970U = -1.0f;
        c1519j.f13971V = 0;
        c1519j.f13972W = 0;
        c1519j.f13973X = 0;
        c1519j.f13974Y = 0;
        c1519j.f13975Z = 0;
        c1519j.f13977a0 = 0;
        c1519j.f13979b0 = 0;
        c1519j.f13981c0 = 0;
        c1519j.f13983d0 = 1.0f;
        c1519j.f13985e0 = 1.0f;
        c1519j.f13987f0 = -1;
        c1519j.f13989g0 = 0;
        c1519j.f13991h0 = -1;
        c1519j.f13999l0 = false;
        c1519j.f14001m0 = false;
        c1519j.f14003n0 = true;
        c1519j.f14005o0 = 0;
        this.f13946d = c1519j;
        m mVar = new m();
        mVar.f14032a = 0.0f;
        mVar.f14033b = 0.0f;
        mVar.f14034c = 0.0f;
        mVar.f14035d = 1.0f;
        mVar.f14036e = 1.0f;
        mVar.f14037f = Float.NaN;
        mVar.f14038g = Float.NaN;
        mVar.f14039h = -1;
        mVar.f14040i = 0.0f;
        mVar.f14041j = 0.0f;
        mVar.f14042k = 0.0f;
        mVar.f14043l = false;
        mVar.f14044m = 0.0f;
        this.f13947e = mVar;
        this.f13948f = new HashMap();
    }

    public final void a(C1514e c1514e) {
        C1519j c1519j = this.f13946d;
        c1514e.f13890e = c1519j.f13990h;
        c1514e.f13892f = c1519j.f13992i;
        c1514e.f13894g = c1519j.f13994j;
        c1514e.f13896h = c1519j.f13996k;
        c1514e.f13898i = c1519j.f13998l;
        c1514e.f13900j = c1519j.f14000m;
        c1514e.f13902k = c1519j.f14002n;
        c1514e.f13904l = c1519j.f14004o;
        c1514e.f13906m = c1519j.f14006p;
        c1514e.f13908n = c1519j.f14007q;
        c1514e.f13910o = c1519j.f14008r;
        c1514e.f13916s = c1519j.f14009s;
        c1514e.f13917t = c1519j.f14010t;
        c1514e.f13918u = c1519j.f14011u;
        c1514e.f13919v = c1519j.f14012v;
        ((ViewGroup.MarginLayoutParams) c1514e).leftMargin = c1519j.f13955F;
        ((ViewGroup.MarginLayoutParams) c1514e).rightMargin = c1519j.f13956G;
        ((ViewGroup.MarginLayoutParams) c1514e).topMargin = c1519j.f13957H;
        ((ViewGroup.MarginLayoutParams) c1514e).bottomMargin = c1519j.f13958I;
        c1514e.f13856A = c1519j.f13967R;
        c1514e.f13857B = c1519j.f13966Q;
        c1514e.f13921x = c1519j.f13963N;
        c1514e.f13923z = c1519j.f13965P;
        c1514e.f13860E = c1519j.f14013w;
        c1514e.f13861F = c1519j.f14014x;
        c1514e.f13912p = c1519j.f14016z;
        c1514e.f13914q = c1519j.f13950A;
        c1514e.f13915r = c1519j.f13951B;
        c1514e.f13862G = c1519j.f14015y;
        c1514e.f13875T = c1519j.f13952C;
        c1514e.f13876U = c1519j.f13953D;
        c1514e.f13864I = c1519j.f13969T;
        c1514e.f13863H = c1519j.f13970U;
        c1514e.f13866K = c1519j.f13972W;
        c1514e.f13865J = c1519j.f13971V;
        c1514e.f13878W = c1519j.f13999l0;
        c1514e.f13879X = c1519j.f14001m0;
        c1514e.f13867L = c1519j.f13973X;
        c1514e.f13868M = c1519j.f13974Y;
        c1514e.f13871P = c1519j.f13975Z;
        c1514e.f13872Q = c1519j.f13977a0;
        c1514e.f13869N = c1519j.f13979b0;
        c1514e.f13870O = c1519j.f13981c0;
        c1514e.f13873R = c1519j.f13983d0;
        c1514e.f13874S = c1519j.f13985e0;
        c1514e.f13877V = c1519j.f13954E;
        c1514e.f13886c = c1519j.f13986f;
        c1514e.f13882a = c1519j.f13982d;
        c1514e.f13884b = c1519j.f13984e;
        ((ViewGroup.MarginLayoutParams) c1514e).width = c1519j.f13978b;
        ((ViewGroup.MarginLayoutParams) c1514e).height = c1519j.f13980c;
        String str = c1519j.f13997k0;
        if (str != null) {
            c1514e.f13880Y = str;
        }
        c1514e.f13881Z = c1519j.f14005o0;
        c1514e.setMarginStart(c1519j.f13960K);
        c1514e.setMarginEnd(c1519j.f13959J);
        c1514e.a();
    }

    public final Object clone() {
        C1518i c1518i = new C1518i();
        C1519j c1519j = c1518i.f13946d;
        c1519j.getClass();
        C1519j c1519j2 = this.f13946d;
        c1519j.f13976a = c1519j2.f13976a;
        c1519j.f13978b = c1519j2.f13978b;
        c1519j.f13980c = c1519j2.f13980c;
        c1519j.f13982d = c1519j2.f13982d;
        c1519j.f13984e = c1519j2.f13984e;
        c1519j.f13986f = c1519j2.f13986f;
        c1519j.f13988g = c1519j2.f13988g;
        c1519j.f13990h = c1519j2.f13990h;
        c1519j.f13992i = c1519j2.f13992i;
        c1519j.f13994j = c1519j2.f13994j;
        c1519j.f13996k = c1519j2.f13996k;
        c1519j.f13998l = c1519j2.f13998l;
        c1519j.f14000m = c1519j2.f14000m;
        c1519j.f14002n = c1519j2.f14002n;
        c1519j.f14004o = c1519j2.f14004o;
        c1519j.f14006p = c1519j2.f14006p;
        c1519j.f14007q = c1519j2.f14007q;
        c1519j.f14008r = c1519j2.f14008r;
        c1519j.f14009s = c1519j2.f14009s;
        c1519j.f14010t = c1519j2.f14010t;
        c1519j.f14011u = c1519j2.f14011u;
        c1519j.f14012v = c1519j2.f14012v;
        c1519j.f14013w = c1519j2.f14013w;
        c1519j.f14014x = c1519j2.f14014x;
        c1519j.f14015y = c1519j2.f14015y;
        c1519j.f14016z = c1519j2.f14016z;
        c1519j.f13950A = c1519j2.f13950A;
        c1519j.f13951B = c1519j2.f13951B;
        c1519j.f13952C = c1519j2.f13952C;
        c1519j.f13953D = c1519j2.f13953D;
        c1519j.f13954E = c1519j2.f13954E;
        c1519j.f13955F = c1519j2.f13955F;
        c1519j.f13956G = c1519j2.f13956G;
        c1519j.f13957H = c1519j2.f13957H;
        c1519j.f13958I = c1519j2.f13958I;
        c1519j.f13959J = c1519j2.f13959J;
        c1519j.f13960K = c1519j2.f13960K;
        c1519j.f13961L = c1519j2.f13961L;
        c1519j.f13962M = c1519j2.f13962M;
        c1519j.f13963N = c1519j2.f13963N;
        c1519j.f13964O = c1519j2.f13964O;
        c1519j.f13965P = c1519j2.f13965P;
        c1519j.f13966Q = c1519j2.f13966Q;
        c1519j.f13967R = c1519j2.f13967R;
        c1519j.f13968S = c1519j2.f13968S;
        c1519j.f13969T = c1519j2.f13969T;
        c1519j.f13970U = c1519j2.f13970U;
        c1519j.f13971V = c1519j2.f13971V;
        c1519j.f13972W = c1519j2.f13972W;
        c1519j.f13973X = c1519j2.f13973X;
        c1519j.f13974Y = c1519j2.f13974Y;
        c1519j.f13975Z = c1519j2.f13975Z;
        c1519j.f13977a0 = c1519j2.f13977a0;
        c1519j.f13979b0 = c1519j2.f13979b0;
        c1519j.f13981c0 = c1519j2.f13981c0;
        c1519j.f13983d0 = c1519j2.f13983d0;
        c1519j.f13985e0 = c1519j2.f13985e0;
        c1519j.f13987f0 = c1519j2.f13987f0;
        c1519j.f13989g0 = c1519j2.f13989g0;
        c1519j.f13991h0 = c1519j2.f13991h0;
        c1519j.f13997k0 = c1519j2.f13997k0;
        int[] iArr = c1519j2.f13993i0;
        if (iArr == null || c1519j2.f13995j0 != null) {
            c1519j.f13993i0 = null;
        } else {
            c1519j.f13993i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c1519j.f13995j0 = c1519j2.f13995j0;
        c1519j.f13999l0 = c1519j2.f13999l0;
        c1519j.f14001m0 = c1519j2.f14001m0;
        c1519j.f14003n0 = c1519j2.f14003n0;
        c1519j.f14005o0 = c1519j2.f14005o0;
        k kVar = c1518i.f13945c;
        kVar.getClass();
        k kVar2 = this.f13945c;
        kVar2.getClass();
        kVar.f14018a = kVar2.f14018a;
        kVar.f14020c = kVar2.f14020c;
        kVar.f14022e = kVar2.f14022e;
        kVar.f14021d = kVar2.f14021d;
        l lVar = c1518i.f13944b;
        lVar.getClass();
        l lVar2 = this.f13944b;
        lVar2.getClass();
        lVar.f14027a = lVar2.f14027a;
        lVar.f14029c = lVar2.f14029c;
        lVar.f14030d = lVar2.f14030d;
        lVar.f14028b = lVar2.f14028b;
        m mVar = c1518i.f13947e;
        mVar.getClass();
        m mVar2 = this.f13947e;
        mVar2.getClass();
        mVar.f14032a = mVar2.f14032a;
        mVar.f14033b = mVar2.f14033b;
        mVar.f14034c = mVar2.f14034c;
        mVar.f14035d = mVar2.f14035d;
        mVar.f14036e = mVar2.f14036e;
        mVar.f14037f = mVar2.f14037f;
        mVar.f14038g = mVar2.f14038g;
        mVar.f14039h = mVar2.f14039h;
        mVar.f14040i = mVar2.f14040i;
        mVar.f14041j = mVar2.f14041j;
        mVar.f14042k = mVar2.f14042k;
        mVar.f14043l = mVar2.f14043l;
        mVar.f14044m = mVar2.f14044m;
        c1518i.f13943a = this.f13943a;
        return c1518i;
    }
}
