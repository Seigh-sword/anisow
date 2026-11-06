package z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import w.AbstractC1443j;
import w.C1437d;

/* JADX INFO: renamed from: z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1512c extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f13848A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f13849B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public HashMap f13850C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f13851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Context f13853y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC1443j f13854z;

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La7
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La7
        La:
            android.content.Context r0 = r5.f13853y
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f5277I
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f5277I
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.f(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<z.q> r1 = z.q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f13850C
            r1.put(r0, r6)
            r5.b(r3)
            goto La7
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC1512c.a(java.lang.String):void");
    }

    public final void b(int i6) {
        if (i6 == getId()) {
            return;
        }
        int i7 = this.f13852x + 1;
        int[] iArr = this.f13851w;
        if (i7 > iArr.length) {
            this.f13851w = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f13851w;
        int i8 = this.f13852x;
        iArr2[i8] = i6;
        this.f13852x = i8 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f13853y == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1514e) && strTrim.equals(((C1514e) layoutParams).f13880Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i6 = 0; i6 < this.f13852x; i6++) {
            View view = (View) constraintLayout.f5282w.get(this.f13851w[i6]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f13853y.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f14053b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f13848A = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f13849B = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f13851w, this.f13852x);
    }

    public abstract void h(C1437d c1437d, boolean z5);

    public final void i() {
        if (this.f13854z == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1514e) {
            ((C1514e) layoutParams).f13913p0 = this.f13854z;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f13848A;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f13849B;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f13848A = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f13852x = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i6);
            if (iIndexOf == -1) {
                a(str.substring(i6));
                return;
            } else {
                a(str.substring(i6, iIndexOf));
                i6 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f13849B = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f13852x = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i6);
            if (iIndexOf == -1) {
                c(str.substring(i6));
                return;
            } else {
                c(str.substring(i6, iIndexOf));
                i6 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f13848A = null;
        this.f13852x = 0;
        for (int i6 : iArr) {
            b(i6);
        }
    }

    @Override // android.view.View
    public final void setTag(int i6, Object obj) {
        super.setTag(i6, obj);
        if (obj == null && this.f13848A == null) {
            b(i6);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
