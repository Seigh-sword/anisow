package M2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ d f1813A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f1814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1815y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f1816z;

    public c(d dVar, Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        this.f1813A = dVar;
        this.f1814x = context;
        this.f1815y = textPaint;
        this.f1816z = cVar;
    }

    @Override // com.bumptech.glide.c
    public final void B(int i6) {
        this.f1816z.B(i6);
    }

    @Override // com.bumptech.glide.c
    public final void C(Typeface typeface, boolean z5) {
        this.f1813A.g(this.f1814x, this.f1815y, typeface);
        this.f1816z.C(typeface, z5);
    }
}
