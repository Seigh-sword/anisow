package androidx.constraintlayout.widget;

import Z.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import u.d;
import w.C1437d;
import w.C1438e;
import w.C1441h;
import z.AbstractC1512c;
import z.AbstractC1513d;
import z.C1514e;
import z.C1516g;
import z.n;
import z.o;
import z.p;
import z.r;
import z.s;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static s f5268N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5269A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f5270B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f5271C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5272D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f5273E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public n f5274F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C1516g f5275G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f5276H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public HashMap f5277I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseArray f5278J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final x.n f5279K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f5280L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f5281M;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SparseArray f5282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f5283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1438e f5284y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5285z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5282w = new SparseArray();
        this.f5283x = new ArrayList(4);
        this.f5284y = new C1438e();
        this.f5285z = 0;
        this.f5269A = 0;
        this.f5270B = Integer.MAX_VALUE;
        this.f5271C = Integer.MAX_VALUE;
        this.f5272D = true;
        this.f5273E = 257;
        this.f5274F = null;
        this.f5275G = null;
        this.f5276H = -1;
        this.f5277I = new HashMap();
        this.f5278J = new SparseArray();
        this.f5279K = new x.n(this, this);
        this.f5280L = 0;
        this.f5281M = 0;
        i(attributeSet, 0);
    }

    public static C1514e g() {
        C1514e c1514e = new C1514e(-2, -2);
        c1514e.f13882a = -1;
        c1514e.f13884b = -1;
        c1514e.f13886c = -1.0f;
        c1514e.f13888d = true;
        c1514e.f13890e = -1;
        c1514e.f13892f = -1;
        c1514e.f13894g = -1;
        c1514e.f13896h = -1;
        c1514e.f13898i = -1;
        c1514e.f13900j = -1;
        c1514e.f13902k = -1;
        c1514e.f13904l = -1;
        c1514e.f13906m = -1;
        c1514e.f13908n = -1;
        c1514e.f13910o = -1;
        c1514e.f13912p = -1;
        c1514e.f13914q = 0;
        c1514e.f13915r = 0.0f;
        c1514e.f13916s = -1;
        c1514e.f13917t = -1;
        c1514e.f13918u = -1;
        c1514e.f13919v = -1;
        c1514e.f13920w = Integer.MIN_VALUE;
        c1514e.f13921x = Integer.MIN_VALUE;
        c1514e.f13922y = Integer.MIN_VALUE;
        c1514e.f13923z = Integer.MIN_VALUE;
        c1514e.f13856A = Integer.MIN_VALUE;
        c1514e.f13857B = Integer.MIN_VALUE;
        c1514e.f13858C = Integer.MIN_VALUE;
        c1514e.f13859D = 0;
        c1514e.f13860E = 0.5f;
        c1514e.f13861F = 0.5f;
        c1514e.f13862G = null;
        c1514e.f13863H = -1.0f;
        c1514e.f13864I = -1.0f;
        c1514e.f13865J = 0;
        c1514e.f13866K = 0;
        c1514e.f13867L = 0;
        c1514e.f13868M = 0;
        c1514e.f13869N = 0;
        c1514e.f13870O = 0;
        c1514e.f13871P = 0;
        c1514e.f13872Q = 0;
        c1514e.f13873R = 1.0f;
        c1514e.f13874S = 1.0f;
        c1514e.f13875T = -1;
        c1514e.f13876U = -1;
        c1514e.f13877V = -1;
        c1514e.f13878W = false;
        c1514e.f13879X = false;
        c1514e.f13880Y = null;
        c1514e.f13881Z = 0;
        c1514e.f13883a0 = true;
        c1514e.f13885b0 = true;
        c1514e.f13887c0 = false;
        c1514e.f13889d0 = false;
        c1514e.f13891e0 = false;
        c1514e.f13893f0 = -1;
        c1514e.f13895g0 = -1;
        c1514e.f13897h0 = -1;
        c1514e.f13899i0 = -1;
        c1514e.f13901j0 = Integer.MIN_VALUE;
        c1514e.f13903k0 = Integer.MIN_VALUE;
        c1514e.f13905l0 = 0.5f;
        c1514e.f13913p0 = new C1437d();
        return c1514e;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s getSharedValues() {
        if (f5268N == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f5268N = sVar;
        }
        return f5268N;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1514e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f5283x;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC1512c) arrayList.get(i6)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i8 = Integer.parseInt(strArrSplit[0]);
                        int i9 = Integer.parseInt(strArrSplit[1]);
                        int i10 = Integer.parseInt(strArrSplit[2]);
                        int i11 = (int) ((i8 / 1080.0f) * width);
                        int i12 = (int) ((i9 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i11;
                        float f7 = i12;
                        float f8 = i11 + ((int) ((i10 / 1080.0f) * width));
                        canvas.drawLine(f6, f7, f8, f7, paint);
                        float f9 = i12 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f8, f7, f8, f9, paint);
                        canvas.drawLine(f8, f9, f6, f9, paint);
                        canvas.drawLine(f6, f9, f6, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f7, f8, f9, paint);
                        canvas.drawLine(f6, f9, f8, f7, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f5272D = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        String str;
        Context context = getContext();
        C1514e c1514e = new C1514e(context, attributeSet);
        c1514e.f13882a = -1;
        c1514e.f13884b = -1;
        c1514e.f13886c = -1.0f;
        c1514e.f13888d = true;
        c1514e.f13890e = -1;
        c1514e.f13892f = -1;
        c1514e.f13894g = -1;
        c1514e.f13896h = -1;
        c1514e.f13898i = -1;
        c1514e.f13900j = -1;
        c1514e.f13902k = -1;
        c1514e.f13904l = -1;
        c1514e.f13906m = -1;
        c1514e.f13908n = -1;
        c1514e.f13910o = -1;
        c1514e.f13912p = -1;
        c1514e.f13914q = 0;
        c1514e.f13915r = 0.0f;
        c1514e.f13916s = -1;
        c1514e.f13917t = -1;
        c1514e.f13918u = -1;
        c1514e.f13919v = -1;
        c1514e.f13920w = Integer.MIN_VALUE;
        c1514e.f13921x = Integer.MIN_VALUE;
        c1514e.f13922y = Integer.MIN_VALUE;
        c1514e.f13923z = Integer.MIN_VALUE;
        c1514e.f13856A = Integer.MIN_VALUE;
        c1514e.f13857B = Integer.MIN_VALUE;
        c1514e.f13858C = Integer.MIN_VALUE;
        c1514e.f13859D = 0;
        c1514e.f13860E = 0.5f;
        c1514e.f13861F = 0.5f;
        c1514e.f13862G = null;
        c1514e.f13863H = -1.0f;
        c1514e.f13864I = -1.0f;
        c1514e.f13865J = 0;
        c1514e.f13866K = 0;
        c1514e.f13867L = 0;
        c1514e.f13868M = 0;
        c1514e.f13869N = 0;
        c1514e.f13870O = 0;
        c1514e.f13871P = 0;
        c1514e.f13872Q = 0;
        c1514e.f13873R = 1.0f;
        c1514e.f13874S = 1.0f;
        c1514e.f13875T = -1;
        c1514e.f13876U = -1;
        c1514e.f13877V = -1;
        c1514e.f13878W = false;
        c1514e.f13879X = false;
        c1514e.f13880Y = null;
        c1514e.f13881Z = 0;
        c1514e.f13883a0 = true;
        c1514e.f13885b0 = true;
        c1514e.f13887c0 = false;
        c1514e.f13889d0 = false;
        c1514e.f13891e0 = false;
        c1514e.f13893f0 = -1;
        c1514e.f13895g0 = -1;
        c1514e.f13897h0 = -1;
        c1514e.f13899i0 = -1;
        c1514e.f13901j0 = Integer.MIN_VALUE;
        c1514e.f13903k0 = Integer.MIN_VALUE;
        c1514e.f13905l0 = 0.5f;
        c1514e.f13913p0 = new C1437d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f14053b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            int i7 = AbstractC1513d.f13855a.get(index);
            switch (i7) {
                case 1:
                    c1514e.f13877V = typedArrayObtainStyledAttributes.getInt(index, c1514e.f13877V);
                    continue;
                    break;
                case j.FLOAT_FIELD_NUMBER /* 2 */:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13912p);
                    c1514e.f13912p = resourceId;
                    if (resourceId == -1) {
                        c1514e.f13912p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case j.INTEGER_FIELD_NUMBER /* 3 */:
                    c1514e.f13914q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13914q);
                    continue;
                    break;
                case j.LONG_FIELD_NUMBER /* 4 */:
                    float f6 = typedArrayObtainStyledAttributes.getFloat(index, c1514e.f13915r) % 360.0f;
                    c1514e.f13915r = f6;
                    if (f6 < 0.0f) {
                        c1514e.f13915r = (360.0f - f6) % 360.0f;
                    } else {
                        continue;
                    }
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    c1514e.f13882a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1514e.f13882a);
                    continue;
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    c1514e.f13884b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1514e.f13884b);
                    continue;
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    c1514e.f13886c = typedArrayObtainStyledAttributes.getFloat(index, c1514e.f13886c);
                    continue;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13890e);
                    c1514e.f13890e = resourceId2;
                    if (resourceId2 == -1) {
                        c1514e.f13890e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13892f);
                    c1514e.f13892f = resourceId3;
                    if (resourceId3 == -1) {
                        c1514e.f13892f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13894g);
                    c1514e.f13894g = resourceId4;
                    if (resourceId4 == -1) {
                        c1514e.f13894g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13896h);
                    c1514e.f13896h = resourceId5;
                    if (resourceId5 == -1) {
                        c1514e.f13896h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13898i);
                    c1514e.f13898i = resourceId6;
                    if (resourceId6 == -1) {
                        c1514e.f13898i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13900j);
                    c1514e.f13900j = resourceId7;
                    if (resourceId7 == -1) {
                        c1514e.f13900j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13902k);
                    c1514e.f13902k = resourceId8;
                    if (resourceId8 == -1) {
                        c1514e.f13902k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13904l);
                    c1514e.f13904l = resourceId9;
                    if (resourceId9 == -1) {
                        c1514e.f13904l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13906m);
                    c1514e.f13906m = resourceId10;
                    if (resourceId10 == -1) {
                        c1514e.f13906m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13916s);
                    c1514e.f13916s = resourceId11;
                    if (resourceId11 == -1) {
                        c1514e.f13916s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13917t);
                    c1514e.f13917t = resourceId12;
                    if (resourceId12 == -1) {
                        c1514e.f13917t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13918u);
                    c1514e.f13918u = resourceId13;
                    if (resourceId13 == -1) {
                        c1514e.f13918u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13919v);
                    c1514e.f13919v = resourceId14;
                    if (resourceId14 == -1) {
                        c1514e.f13919v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                    break;
                case 21:
                    c1514e.f13920w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13920w);
                    continue;
                    break;
                case 22:
                    c1514e.f13921x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13921x);
                    continue;
                    break;
                case 23:
                    c1514e.f13922y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13922y);
                    continue;
                    break;
                case 24:
                    c1514e.f13923z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13923z);
                    continue;
                    break;
                case 25:
                    c1514e.f13856A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13856A);
                    continue;
                    break;
                case 26:
                    c1514e.f13857B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13857B);
                    continue;
                    break;
                case 27:
                    c1514e.f13878W = typedArrayObtainStyledAttributes.getBoolean(index, c1514e.f13878W);
                    continue;
                    break;
                case 28:
                    c1514e.f13879X = typedArrayObtainStyledAttributes.getBoolean(index, c1514e.f13879X);
                    continue;
                    break;
                case 29:
                    c1514e.f13860E = typedArrayObtainStyledAttributes.getFloat(index, c1514e.f13860E);
                    continue;
                    break;
                case 30:
                    c1514e.f13861F = typedArrayObtainStyledAttributes.getFloat(index, c1514e.f13861F);
                    continue;
                    break;
                case 31:
                    int i8 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1514e.f13867L = i8;
                    if (i8 == 1) {
                        str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                    }
                    break;
                case 32:
                    int i9 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1514e.f13868M = i9;
                    if (i9 == 1) {
                        str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                    }
                    break;
                case 33:
                    try {
                        c1514e.f13869N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13869N);
                        continue;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1514e.f13869N) == -2) {
                            c1514e.f13869N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c1514e.f13871P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13871P);
                        continue;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1514e.f13871P) == -2) {
                            c1514e.f13871P = -2;
                        }
                    }
                    break;
                case 35:
                    c1514e.f13873R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1514e.f13873R));
                    c1514e.f13867L = 2;
                    continue;
                    break;
                case 36:
                    try {
                        c1514e.f13870O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13870O);
                        continue;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1514e.f13870O) == -2) {
                            c1514e.f13870O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c1514e.f13872Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13872Q);
                        continue;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1514e.f13872Q) == -2) {
                            c1514e.f13872Q = -2;
                        }
                    }
                    break;
                case 38:
                    c1514e.f13874S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1514e.f13874S));
                    c1514e.f13868M = 2;
                    continue;
                    break;
                default:
                    switch (i7) {
                        case 44:
                            n.h(c1514e, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1514e.f13863H = typedArrayObtainStyledAttributes.getFloat(index, c1514e.f13863H);
                            break;
                        case 46:
                            c1514e.f13864I = typedArrayObtainStyledAttributes.getFloat(index, c1514e.f13864I);
                            break;
                        case 47:
                            c1514e.f13865J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1514e.f13866K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1514e.f13875T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1514e.f13875T);
                            break;
                        case 50:
                            c1514e.f13876U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1514e.f13876U);
                            break;
                        case 51:
                            c1514e.f13880Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13908n);
                            c1514e.f13908n = resourceId15;
                            if (resourceId15 == -1) {
                                c1514e.f13908n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1514e.f13910o);
                            c1514e.f13910o = resourceId16;
                            if (resourceId16 == -1) {
                                c1514e.f13910o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c1514e.f13859D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13859D);
                            break;
                        case 55:
                            c1514e.f13858C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1514e.f13858C);
                            break;
                        default:
                            switch (i7) {
                                case 64:
                                    n.g(c1514e, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c1514e, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1514e.f13881Z = typedArrayObtainStyledAttributes.getInt(index, c1514e.f13881Z);
                                    break;
                                case 67:
                                    c1514e.f13888d = typedArrayObtainStyledAttributes.getBoolean(index, c1514e.f13888d);
                                    continue;
                            }
                            break;
                    }
                    break;
            }
            Log.e("ConstraintLayout", str);
        }
        typedArrayObtainStyledAttributes.recycle();
        c1514e.a();
        return c1514e;
    }

    public int getMaxHeight() {
        return this.f5271C;
    }

    public int getMaxWidth() {
        return this.f5270B;
    }

    public int getMinHeight() {
        return this.f5269A;
    }

    public int getMinWidth() {
        return this.f5285z;
    }

    public int getOptimizationLevel() {
        return this.f5284y.f13411D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C1438e c1438e = this.f5284y;
        if (c1438e.f13384j == null) {
            int id2 = getId();
            c1438e.f13384j = id2 != -1 ? getContext().getResources().getResourceEntryName(id2) : "parent";
        }
        if (c1438e.f13381h0 == null) {
            c1438e.f13381h0 = c1438e.f13384j;
            Log.v("ConstraintLayout", " setDebugName " + c1438e.f13381h0);
        }
        for (C1437d c1437d : c1438e.f13489q0) {
            View view = (View) c1437d.f13377f0;
            if (view != null) {
                if (c1437d.f13384j == null && (id = view.getId()) != -1) {
                    c1437d.f13384j = getContext().getResources().getResourceEntryName(id);
                }
                if (c1437d.f13381h0 == null) {
                    c1437d.f13381h0 = c1437d.f13384j;
                    Log.v("ConstraintLayout", " setDebugName " + c1437d.f13381h0);
                }
            }
        }
        c1438e.o(sb);
        return sb.toString();
    }

    public final C1437d h(View view) {
        if (view == this) {
            return this.f5284y;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof C1514e)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof C1514e)) {
                return null;
            }
        }
        return ((C1514e) view.getLayoutParams()).f13913p0;
    }

    public final void i(AttributeSet attributeSet, int i6) {
        C1438e c1438e = this.f5284y;
        c1438e.f13377f0 = this;
        x.n nVar = this.f5279K;
        c1438e.f13422u0 = nVar;
        c1438e.f13420s0.f13617f = nVar;
        this.f5282w.put(getId(), this);
        this.f5274F = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f14053b, i6, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 16) {
                    this.f5285z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5285z);
                } else if (index == 17) {
                    this.f5269A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5269A);
                } else if (index == 14) {
                    this.f5270B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5270B);
                } else if (index == 15) {
                    this.f5271C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5271C);
                } else if (index == 113) {
                    this.f5273E = typedArrayObtainStyledAttributes.getInt(index, this.f5273E);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f5275G = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar2 = new n();
                        this.f5274F = nVar2;
                        nVar2.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f5274F = null;
                    }
                    this.f5276H = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c1438e.f13411D0 = this.f5273E;
        d.f12774p = c1438e.X(512);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r10) {
        /*
            r9 = this;
            z.g r0 = new z.g
            android.content.Context r1 = r9.getContext()
            r0.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f13929a = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f13930b = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r3 = 0
        L24:
            r4 = 1
            if (r2 == r4) goto La8
            if (r2 == 0) goto L99
            r5 = 2
            if (r2 == r5) goto L2e
            goto L9c
        L2e:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L67;
                case 80204913: goto L5d;
                case 1382829617: goto L54;
                case 1657696882: goto L4a;
                case 1901439077: goto L3c;
                default: goto L3b;
            }     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
        L3b:
            goto L71
        L3c:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L71
            r4 = r8
            goto L72
        L46:
            r10 = move-exception
            goto La1
        L48:
            r10 = move-exception
            goto La5
        L4a:
            java.lang.String r4 = "layoutDescription"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L71
            r4 = 0
            goto L72
        L54:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L71
            goto L72
        L5d:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L71
            r4 = r5
            goto L72
        L67:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L71
            r4 = r7
            goto L72
        L71:
            r4 = -1
        L72:
            if (r4 == r5) goto L8c
            if (r4 == r8) goto L7d
            if (r4 == r7) goto L79
            goto L9c
        L79:
            r0.a(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            goto L9c
        L7d:
            z.f r2 = new z.f     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r3 == 0) goto L9c
            java.lang.Object r4 = r3.f8317y     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r4.add(r2)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            goto L9c
        L8c:
            f.h r3 = new f.h     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            android.util.SparseArray r2 = r0.f13929a     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            int r4 = r3.f8315w     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r2.put(r4, r3)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            goto L9c
        L99:
            r10.getName()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
        L9c:
            int r2 = r10.next()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            goto L24
        La1:
            r10.printStackTrace()
            goto La8
        La5:
            r10.printStackTrace()
        La8:
            r9.f5275G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x04cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(w.C1438e r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(w.e, int, int, int):void");
    }

    public final void l(C1437d c1437d, C1514e c1514e, SparseArray sparseArray, int i6, int i7) {
        View view = (View) this.f5282w.get(i6);
        C1437d c1437d2 = (C1437d) sparseArray.get(i6);
        if (c1437d2 == null || view == null || !(view.getLayoutParams() instanceof C1514e)) {
            return;
        }
        c1514e.f13887c0 = true;
        if (i7 == 6) {
            C1514e c1514e2 = (C1514e) view.getLayoutParams();
            c1514e2.f13887c0 = true;
            c1514e2.f13913p0.f13344E = true;
        }
        c1437d.j(6).b(c1437d2.j(i7), c1514e.f13859D, c1514e.f13858C, true);
        c1437d.f13344E = true;
        c1437d.j(3).j();
        c1437d.j(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C1514e c1514e = (C1514e) childAt.getLayoutParams();
            C1437d c1437d = c1514e.f13913p0;
            if (childAt.getVisibility() != 8 || c1514e.f13889d0 || c1514e.f13891e0 || zIsInEditMode) {
                int iS = c1437d.s();
                int iT = c1437d.t();
                childAt.layout(iS, iT, c1437d.r() + iS, c1437d.l() + iT);
            }
        }
        ArrayList arrayList = this.f5283x;
        int size = arrayList.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((AbstractC1512c) arrayList.get(i11)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 1466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1437d c1437dH = h(view);
        if ((view instanceof p) && !(c1437dH instanceof C1441h)) {
            C1514e c1514e = (C1514e) view.getLayoutParams();
            C1441h c1441h = new C1441h();
            c1514e.f13913p0 = c1441h;
            c1514e.f13889d0 = true;
            c1441h.T(c1514e.f13877V);
        }
        if (view instanceof AbstractC1512c) {
            AbstractC1512c abstractC1512c = (AbstractC1512c) view;
            abstractC1512c.i();
            ((C1514e) view.getLayoutParams()).f13891e0 = true;
            ArrayList arrayList = this.f5283x;
            if (!arrayList.contains(abstractC1512c)) {
                arrayList.add(abstractC1512c);
            }
        }
        this.f5282w.put(view.getId(), view);
        this.f5272D = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f5282w.remove(view.getId());
        C1437d c1437dH = h(view);
        this.f5284y.f13489q0.remove(c1437dH);
        c1437dH.D();
        this.f5283x.remove(view);
        this.f5272D = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f5272D = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f5274F = nVar;
    }

    @Override // android.view.View
    public void setId(int i6) {
        int id = getId();
        SparseArray sparseArray = this.f5282w;
        sparseArray.remove(id);
        super.setId(i6);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i6) {
        if (i6 == this.f5271C) {
            return;
        }
        this.f5271C = i6;
        requestLayout();
    }

    public void setMaxWidth(int i6) {
        if (i6 == this.f5270B) {
            return;
        }
        this.f5270B = i6;
        requestLayout();
    }

    public void setMinHeight(int i6) {
        if (i6 == this.f5269A) {
            return;
        }
        this.f5269A = i6;
        requestLayout();
    }

    public void setMinWidth(int i6) {
        if (i6 == this.f5285z) {
            return;
        }
        this.f5285z = i6;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        C1516g c1516g = this.f5275G;
        if (c1516g != null) {
            c1516g.getClass();
        }
    }

    public void setOptimizationLevel(int i6) {
        this.f5273E = i6;
        C1438e c1438e = this.f5284y;
        c1438e.f13411D0 = i6;
        d.f12774p = c1438e.X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f5282w = new SparseArray();
        this.f5283x = new ArrayList(4);
        this.f5284y = new C1438e();
        this.f5285z = 0;
        this.f5269A = 0;
        this.f5270B = Integer.MAX_VALUE;
        this.f5271C = Integer.MAX_VALUE;
        this.f5272D = true;
        this.f5273E = 257;
        this.f5274F = null;
        this.f5275G = null;
        this.f5276H = -1;
        this.f5277I = new HashMap();
        this.f5278J = new SparseArray();
        this.f5279K = new x.n(this, this);
        this.f5280L = 0;
        this.f5281M = 0;
        i(attributeSet, i6);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1514e c1514e = new C1514e(layoutParams);
        c1514e.f13882a = -1;
        c1514e.f13884b = -1;
        c1514e.f13886c = -1.0f;
        c1514e.f13888d = true;
        c1514e.f13890e = -1;
        c1514e.f13892f = -1;
        c1514e.f13894g = -1;
        c1514e.f13896h = -1;
        c1514e.f13898i = -1;
        c1514e.f13900j = -1;
        c1514e.f13902k = -1;
        c1514e.f13904l = -1;
        c1514e.f13906m = -1;
        c1514e.f13908n = -1;
        c1514e.f13910o = -1;
        c1514e.f13912p = -1;
        c1514e.f13914q = 0;
        c1514e.f13915r = 0.0f;
        c1514e.f13916s = -1;
        c1514e.f13917t = -1;
        c1514e.f13918u = -1;
        c1514e.f13919v = -1;
        c1514e.f13920w = Integer.MIN_VALUE;
        c1514e.f13921x = Integer.MIN_VALUE;
        c1514e.f13922y = Integer.MIN_VALUE;
        c1514e.f13923z = Integer.MIN_VALUE;
        c1514e.f13856A = Integer.MIN_VALUE;
        c1514e.f13857B = Integer.MIN_VALUE;
        c1514e.f13858C = Integer.MIN_VALUE;
        c1514e.f13859D = 0;
        c1514e.f13860E = 0.5f;
        c1514e.f13861F = 0.5f;
        c1514e.f13862G = null;
        c1514e.f13863H = -1.0f;
        c1514e.f13864I = -1.0f;
        c1514e.f13865J = 0;
        c1514e.f13866K = 0;
        c1514e.f13867L = 0;
        c1514e.f13868M = 0;
        c1514e.f13869N = 0;
        c1514e.f13870O = 0;
        c1514e.f13871P = 0;
        c1514e.f13872Q = 0;
        c1514e.f13873R = 1.0f;
        c1514e.f13874S = 1.0f;
        c1514e.f13875T = -1;
        c1514e.f13876U = -1;
        c1514e.f13877V = -1;
        c1514e.f13878W = false;
        c1514e.f13879X = false;
        c1514e.f13880Y = null;
        c1514e.f13881Z = 0;
        c1514e.f13883a0 = true;
        c1514e.f13885b0 = true;
        c1514e.f13887c0 = false;
        c1514e.f13889d0 = false;
        c1514e.f13891e0 = false;
        c1514e.f13893f0 = -1;
        c1514e.f13895g0 = -1;
        c1514e.f13897h0 = -1;
        c1514e.f13899i0 = -1;
        c1514e.f13901j0 = Integer.MIN_VALUE;
        c1514e.f13903k0 = Integer.MIN_VALUE;
        c1514e.f13905l0 = 0.5f;
        c1514e.f13913p0 = new C1437d();
        return c1514e;
    }
}
