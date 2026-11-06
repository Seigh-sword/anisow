package G0;

import M4.B;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import j.C0836b;
import java.io.IOException;
import java.util.ArrayList;
import m.C0955d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f682y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0955d f683z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f679A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0836b f680B = new C0836b(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f681x = new d();

    public f(Context context) {
        this.f682y = context;
    }

    @Override // G0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            H.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            return H.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f681x;
        dVar.f674a.draw(canvas);
        if (dVar.f675b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getAlpha() : this.f681x.f674a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f681x.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f684w;
        return drawable != null ? H.a.c(drawable) : this.f681x.f674a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f684w != null) {
            return new e(this.f684w.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f681x.f674a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f681x.f674a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getOpacity() : this.f681x.f674a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.isAutoMirrored() : this.f681x.f674a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f684w;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f681x.f675b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.isStateful() : this.f681x.f674a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f681x.f674a.setBounds(rect);
        }
    }

    @Override // G0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.setLevel(i6) : this.f681x.f674a.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.setState(iArr) : this.f681x.f674a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else {
            this.f681x.f674a.setAlpha(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setAutoMirrored(z5);
        } else {
            this.f681x.f674a.setAutoMirrored(z5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f681x.f674a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            B.n(drawable, i6);
        } else {
            this.f681x.f674a.setTint(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            B.o(drawable, colorStateList);
        } else {
            this.f681x.f674a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            B.p(drawable, mode);
        } else {
            this.f681x.f674a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            return drawable.setVisible(z5, z6);
        }
        this.f681x.f674a.setVisible(z5, z6);
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f681x;
        if (dVar.f675b.isStarted()) {
            return;
        }
        dVar.f675b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f681x.f675b.end();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r3.f675b != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r3.f675b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        r3.f675b.playTogether(r3.f676c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
