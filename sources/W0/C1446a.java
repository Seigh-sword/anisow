package w0;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: w0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1446a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0.c f13490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L3.c f13493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13495f;

    public C1446a(Context context, String str, A0.c cVar, L3.c cVar2, ArrayList arrayList, boolean z5, int i6, Executor executor, Executor executor2, boolean z6, boolean z7) {
        this.f13490a = cVar;
        this.f13491b = context;
        this.f13492c = str;
        this.f13493d = cVar2;
        this.f13494e = z6;
        this.f13495f = z7;
    }

    public final boolean a(int i6, int i7) {
        if (i6 <= i7 || !this.f13495f) {
            return this.f13494e;
        }
        return false;
    }
}
