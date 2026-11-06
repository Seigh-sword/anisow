package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.xo.anilab.R;
import h.AbstractC0732a;

/* JADX INFO: renamed from: i.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0808h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f9296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f9297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f9298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f9299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f9300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f9301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f9302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NestedScrollView f9303i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f9305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f9306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f9307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f9308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f9309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ListAdapter f9310p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f9315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HandlerC0806f f9317w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9304j = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9311q = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ViewOnClickListenerC0802b f9318x = new ViewOnClickListenerC0802b(0, this);

    public C0808h(Context context, J j6, Window window) {
        this.f9295a = context;
        this.f9296b = j6;
        this.f9297c = window;
        this.f9317w = new HandlerC0806f(j6);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0732a.f8567e, R.attr.alertDialogStyle, 0);
        this.f9312r = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f9313s = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f9314t = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f9315u = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f9316v = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        j6.e().f(1);
    }

    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
