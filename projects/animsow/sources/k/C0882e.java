package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.xo.anilab.R;

/* JADX INFO: renamed from: k.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0882e extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f9568f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f9570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f9571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f9572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f9573e;

    public C0882e(Context context, int i6) {
        super(context);
        this.f9569a = i6;
    }

    public final void a(Configuration configuration) {
        if (this.f9573e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f9572d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f9572d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f9570b == null) {
            this.f9570b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9570b.setTo(theme);
            }
        }
        this.f9570b.applyStyle(this.f9569a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f9573e
            if (r0 != 0) goto L37
            android.content.res.Configuration r0 = r3.f9572d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = k.C0882e.f9568f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            k.C0882e.f9568f = r1
        L1c:
            android.content.res.Configuration r1 = k.C0882e.f9568f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f9572d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
        L2f:
            r3.f9573e = r0
            goto L37
        L32:
            android.content.res.Resources r0 = super.getResources()
            goto L2f
        L37:
            android.content.res.Resources r0 = r3.f9573e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0882e.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f9571c == null) {
            this.f9571c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f9571c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f9570b;
        if (theme != null) {
            return theme;
        }
        if (this.f9569a == 0) {
            this.f9569a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f9570b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        if (this.f9569a != i6) {
            this.f9569a = i6;
            b();
        }
    }

    public C0882e(Context context, Resources.Theme theme) {
        super(context);
        this.f9570b = theme;
    }
}
