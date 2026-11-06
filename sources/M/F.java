package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class F extends ImageView {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0986t f10116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E f10117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10118y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Y0.a(context);
        this.f10118y = false;
        X0.a(getContext(), this);
        C0986t c0986t = new C0986t(this);
        this.f10116w = c0986t;
        c0986t.e(attributeSet, i6);
        E e6 = new E(this);
        this.f10117x = e6;
        e6.c(attributeSet, i6);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0986t c0986t = this.f10116w;
        if (c0986t != null) {
            c0986t.a();
        }
        E e6 = this.f10117x;
        if (e6 != null) {
            e6.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10116w;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10116w;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        Z0 z02;
        E e6 = this.f10117x;
        if (e6 == null || (z02 = (Z0) e6.f10113d) == null) {
            return null;
        }
        return (ColorStateList) z02.f10237c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        Z0 z02;
        E e6 = this.f10117x;
        if (e6 == null || (z02 = (Z0) e6.f10113d) == null) {
            return null;
        }
        return (PorterDuff.Mode) z02.f10238d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f10117x.f10111b).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10116w;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10116w;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        E e6 = this.f10117x;
        if (e6 != null) {
            e6.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        E e6 = this.f10117x;
        if (e6 != null && drawable != null && !this.f10118y) {
            e6.f10110a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (e6 != null) {
            e6.a();
            if (this.f10118y || ((ImageView) e6.f10111b).getDrawable() == null) {
                return;
            }
            ((ImageView) e6.f10111b).getDrawable().setLevel(e6.f10110a);
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i6) {
        super.setImageLevel(i6);
        this.f10118y = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        E e6 = this.f10117x;
        if (e6 != null) {
            e6.e(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        E e6 = this.f10117x;
        if (e6 != null) {
            e6.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0986t c0986t = this.f10116w;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10116w;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        E e6 = this.f10117x;
        if (e6 != null) {
            if (((Z0) e6.f10113d) == null) {
                e6.f10113d = new Z0();
            }
            Z0 z02 = (Z0) e6.f10113d;
            z02.f10237c = colorStateList;
            z02.f10236b = true;
            e6.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        E e6 = this.f10117x;
        if (e6 != null) {
            if (((Z0) e6.f10113d) == null) {
                e6.f10113d = new Z0();
            }
            Z0 z02 = (Z0) e6.f10113d;
            z02.f10238d = mode;
            z02.f10235a = true;
            e6.a();
        }
    }
}
