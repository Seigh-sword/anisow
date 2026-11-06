package y2;

import N.C0;
import N.I;
import N.I0;
import N.V;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: y2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1505g extends AbstractC1501c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f13799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0 f13800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Window f13801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13802d;

    public C1505g(FrameLayout frameLayout, C0 c02) {
        ColorStateList colorStateListG;
        int iIntValue;
        this.f13800b = c02;
        P2.g gVar = BottomSheetBehavior.A(frameLayout).f7091i;
        if (gVar != null) {
            colorStateListG = gVar.f2457w.f2419c;
        } else {
            WeakHashMap weakHashMap = V.f1964a;
            colorStateListG = I.g(frameLayout);
        }
        if (colorStateListG != null) {
            iIntValue = colorStateListG.getDefaultColor();
        } else {
            ColorStateList colorStateListG2 = m2.C0.g(frameLayout.getBackground());
            Integer numValueOf = colorStateListG2 != null ? Integer.valueOf(colorStateListG2.getDefaultColor()) : null;
            if (numValueOf == null) {
                this.f13799a = null;
                return;
            }
            iIntValue = numValueOf.intValue();
        }
        this.f13799a = Boolean.valueOf(m2.C0.j(iIntValue));
    }

    @Override // y2.AbstractC1501c
    public final void a(View view) {
        d(view);
    }

    @Override // y2.AbstractC1501c
    public final void b(View view) {
        d(view);
    }

    @Override // y2.AbstractC1501c
    public final void c(View view, int i6) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        C0 c02 = this.f13800b;
        if (top < c02.d()) {
            Window window = this.f13801c;
            if (window != null) {
                Boolean bool = this.f13799a;
                new I0(window, window.getDecorView()).f1958a.A(bool == null ? this.f13802d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), c02.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f13801c;
            if (window2 != null) {
                new I0(window2, window2.getDecorView()).f1958a.A(this.f13802d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f13801c == window) {
            return;
        }
        this.f13801c = window;
        if (window != null) {
            this.f13802d = new I0(window, window.getDecorView()).f1958a.w();
        }
    }
}
