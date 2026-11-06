package m;

import android.view.View;
import android.view.ViewConfiguration;
import l.InterfaceC0905E;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RunnableC0999z0 f10073A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RunnableC0999z0 f10074B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f10075C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10076D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int[] f10077E = new int[2];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f10078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f10080y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f10081z;

    public A0(View view) {
        this.f10081z = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f10078w = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f10079x = tapTimeout;
        this.f10080y = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0999z0 runnableC0999z0 = this.f10074B;
        View view = this.f10081z;
        if (runnableC0999z0 != null) {
            view.removeCallbacks(runnableC0999z0);
        }
        RunnableC0999z0 runnableC0999z02 = this.f10073A;
        if (runnableC0999z02 != null) {
            view.removeCallbacks(runnableC0999z02);
        }
    }

    public abstract InterfaceC0905E b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0905E interfaceC0905EB = b();
        if (interfaceC0905EB == null || !interfaceC0905EB.a()) {
            return true;
        }
        interfaceC0905EB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.A0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10075C = false;
        this.f10076D = -1;
        RunnableC0999z0 runnableC0999z0 = this.f10073A;
        if (runnableC0999z0 != null) {
            this.f10081z.removeCallbacks(runnableC0999z0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
