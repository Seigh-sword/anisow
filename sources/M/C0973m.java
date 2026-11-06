package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.xo.anilab.R;

/* JADX INFO: renamed from: m.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0973m extends F implements InterfaceC0979p {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0977o f10319z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0973m(C0977o c0977o, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f10319z = c0977o;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        M4.B.q(this, getContentDescription());
        setOnTouchListener(new C0971l(this, this, c0977o, 0));
    }

    @Override // m.InterfaceC0979p
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0979p
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f10319z.o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i6, int i7, int i8, int i9) {
        boolean frame = super.setFrame(i6, i7, i8, i9);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            H.a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
