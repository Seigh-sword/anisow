package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: m.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0974m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f10320l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f10321m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10322a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10323b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10324c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10325d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10326e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f10327f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10328g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f10329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f10330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f10331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0968j0 f10332k;

    public C0974m0(TextView textView) {
        this.f10330i = textView;
        this.f10331j = textView.getContext();
        this.f10332k = Build.VERSION.SDK_INT >= 29 ? new C0970k0() : new C0968j0();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i6 : iArr) {
            if (i6 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i6)) < 0) {
                arrayList.add(Integer.valueOf(i6));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr2[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f10321m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f10323b) {
                if (this.f10330i.getMeasuredHeight() <= 0 || this.f10330i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f10332k.b(this.f10330i) ? 1048576 : (this.f10330i.getMeasuredWidth() - this.f10330i.getTotalPaddingLeft()) - this.f10330i.getTotalPaddingRight();
                int height = (this.f10330i.getHeight() - this.f10330i.getCompoundPaddingBottom()) - this.f10330i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f10320l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f10330i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f10323b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f10327f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i6 = length - 1;
        int i7 = 0;
        int i8 = 1;
        while (i8 <= i6) {
            int i9 = (i8 + i6) / 2;
            int i10 = this.f10327f[i9];
            TextView textView = this.f10330i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f10329h;
            if (textPaint == null) {
                this.f10329h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f10329h.set(textView.getPaint());
            this.f10329h.setTextSize(i10);
            StaticLayout staticLayoutA = AbstractC0966i0.a(text, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f10330i, this.f10329h, this.f10332k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i11 = i9 + 1;
                i7 = i8;
                i8 = i11;
            } else {
                i7 = i9 - 1;
                i6 = i7;
            }
        }
        return this.f10327f[i7];
    }

    public final boolean f() {
        return j() && this.f10322a != 0;
    }

    public final void g(int i6, float f6) {
        Context context = this.f10331j;
        float fApplyDimension = TypedValue.applyDimension(i6, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f10330i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f10323b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f10322a == 1) {
            if (!this.f10328g || this.f10327f.length == 0) {
                int iFloor = ((int) Math.floor((this.f10326e - this.f10325d) / this.f10324c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i6 = 0; i6 < iFloor; i6++) {
                    iArr[i6] = Math.round((i6 * this.f10324c) + this.f10325d);
                }
                this.f10327f = b(iArr);
            }
            this.f10323b = true;
        } else {
            this.f10323b = false;
        }
        return this.f10323b;
    }

    public final boolean i() {
        boolean z5 = this.f10327f.length > 0;
        this.f10328g = z5;
        if (z5) {
            this.f10322a = 1;
            this.f10325d = r0[0];
            this.f10326e = r0[r1 - 1];
            this.f10324c = -1.0f;
        }
        return z5;
    }

    public final boolean j() {
        return !(this.f10330i instanceof C0947B);
    }

    public final void k(float f6, float f7, float f8) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f7 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
        }
        this.f10322a = 1;
        this.f10325d = f6;
        this.f10326e = f7;
        this.f10324c = f8;
        this.f10328g = false;
    }
}
