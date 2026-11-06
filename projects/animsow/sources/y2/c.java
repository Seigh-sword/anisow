package Y2;

import android.content.Context;
import d3.C0654b;
import p3.C1251c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements D3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4809c;

    public /* synthetic */ c(Context context, String str) {
        this.f4807a = 2;
        this.f4809c = context;
        this.f4808b = str;
    }

    @Override // D3.c
    public final Object get() {
        int i6 = this.f4807a;
        Object obj = this.f4808b;
        Object obj2 = this.f4809c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g gVar = (g) obj;
                String strD = gVar.d();
                return new H3.a((Context) obj2, strD);
            case 1:
                d3.h hVar = (d3.h) obj;
                C0654b c0654b = (C0654b) obj2;
                hVar.getClass();
                return c0654b.f8186f.f(new C1251c(c0654b, hVar));
            default:
                return new B3.i((Context) obj2, (String) obj);
        }
    }

    public /* synthetic */ c(Object obj, int i6, Object obj2) {
        this.f4807a = i6;
        this.f4808b = obj;
        this.f4809c = obj2;
    }
}
