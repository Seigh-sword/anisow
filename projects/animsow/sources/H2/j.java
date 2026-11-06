package H2;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1051d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f1053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public M2.d f1054g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f1048a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D2.b f1049b = new D2.b(1, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1052e = true;

    public j(i iVar) {
        this.f1053f = new WeakReference(null);
        this.f1053f = new WeakReference(iVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f1048a;
        this.f1050c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f1051d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f1052e = false;
    }

    public final void b(M2.d dVar, Context context) {
        if (this.f1054g != dVar) {
            this.f1054g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f1048a;
                D2.b bVar = this.f1049b;
                dVar.f(context, textPaint, bVar);
                i iVar = (i) this.f1053f.get();
                if (iVar != null) {
                    textPaint.drawableState = iVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                this.f1052e = true;
            }
            i iVar2 = (i) this.f1053f.get();
            if (iVar2 != null) {
                iVar2.a();
                iVar2.onStateChange(iVar2.getState());
            }
        }
    }
}
