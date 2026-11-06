package i;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: i.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0805e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f9284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f9285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f9286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f9287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DialogInterface.OnKeyListener f9288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListAdapter f9289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DialogInterface.OnClickListener f9290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9292j = -1;

    public C0805e(ContextThemeWrapper contextThemeWrapper) {
        this.f9283a = contextThemeWrapper;
        this.f9284b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
