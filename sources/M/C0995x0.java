package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.xo.anilab.R;
import j.RunnableC0835a;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: m.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0995x0 extends ListView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10409A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10410B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0991v0 f10411C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10412D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f10413E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f10414F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public T.g f10415G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public RunnableC0835a f10416H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f10417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10419y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10420z;

    public C0995x0(Context context, boolean z5) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f10417w = new Rect();
        this.f10418x = 0;
        this.f10419y = 0;
        this.f10420z = 0;
        this.f10409A = 0;
        this.f10413E = z5;
        setCacheColorHint(0);
    }

    public final int a(int i6, int i7) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i6, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i7) {
                return i7;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0995x0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f10417w;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f10416H != null) {
            return;
        }
        super.drawableStateChanged();
        C0991v0 c0991v0 = this.f10411C;
        if (c0991v0 != null) {
            c0991v0.f10396x = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f10414F && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f10413E || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f10413E || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f10413E || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f10413E && this.f10412D) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f10416H = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i7 = 1;
        if (actionMasked == 10 && this.f10416H == null) {
            RunnableC0835a runnableC0835a = new RunnableC0835a(i7, this);
            this.f10416H = runnableC0835a;
            post(runnableC0835a);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i6 < 30 || !AbstractC0987t0.f10388d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0987t0.f10385a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0987t0.f10386b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC0987t0.f10387c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f10414F && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10410B = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0835a runnableC0835a = this.f10416H;
        if (runnableC0835a != null) {
            C0995x0 c0995x0 = (C0995x0) runnableC0835a.f9413x;
            c0995x0.f10416H = null;
            c0995x0.removeCallbacks(runnableC0835a);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z5) {
        this.f10412D = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0991v0 c0991v0;
        if (drawable != null) {
            c0991v0 = new C0991v0(drawable);
            c0991v0.f10396x = true;
        } else {
            c0991v0 = null;
        }
        this.f10411C = c0991v0;
        super.setSelector(c0991v0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f10418x = rect.left;
        this.f10419y = rect.top;
        this.f10420z = rect.right;
        this.f10409A = rect.bottom;
    }
}
