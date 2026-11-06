package F;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f449c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f447a = colorStateList;
        this.f448b = configuration;
        this.f449c = theme == null ? 0 : theme.hashCode();
    }
}
