package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements InterfaceC0982q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f10283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f10285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f10286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f10287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f10288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f10290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f10291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f10292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f10293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0977o f10295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f10297o;

    public final void a(int i6) {
        View view;
        int i7 = this.f10284b ^ i6;
        this.f10284b = i6;
        if (i7 != 0) {
            if ((i7 & 4) != 0) {
                if ((i6 & 4) != 0) {
                    b();
                }
                int i8 = this.f10284b & 4;
                Toolbar toolbar = this.f10283a;
                if (i8 != 0) {
                    Drawable drawable = this.f10288f;
                    if (drawable == null) {
                        drawable = this.f10297o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i7 & 3) != 0) {
                c();
            }
            int i9 = i7 & 8;
            Toolbar toolbar2 = this.f10283a;
            if (i9 != 0) {
                if ((i6 & 8) != 0) {
                    toolbar2.setTitle(this.f10290h);
                    toolbar2.setSubtitle(this.f10291i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i7 & 16) == 0 || (view = this.f10285c) == null) {
                return;
            }
            if ((i6 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f10284b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f10292j);
            Toolbar toolbar = this.f10283a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f10296n);
            } else {
                toolbar.setNavigationContentDescription(this.f10292j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i6 = this.f10284b;
        if ((i6 & 2) == 0) {
            drawable = null;
        } else if ((i6 & 1) == 0 || (drawable = this.f10287e) == null) {
            drawable = this.f10286d;
        }
        this.f10283a.setLogo(drawable);
    }
}
