package F0;

import N.V;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import j0.C0840b;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: F0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0015b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0015b(Class cls, String str, int i6) {
        super(cls, str);
        this.f509a = i6;
    }

    public final Float a(View view) {
        switch (this.f509a) {
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return Float.valueOf(H.f486a.p(view));
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                WeakHashMap weakHashMap = V.f1964a;
                return Float.valueOf(view.getPaddingEnd());
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return Float.valueOf(view.getLayoutParams().width);
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return Float.valueOf(view.getLayoutParams().height);
            case 9:
                WeakHashMap weakHashMap2 = V.f1964a;
                return Float.valueOf(view.getPaddingStart());
        }
    }

    public final void b(C0018e c0018e, PointF pointF) {
        switch (this.f509a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0018e.getClass();
                c0018e.f512a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0018e.f513b = iRound;
                int i6 = c0018e.f517f + 1;
                c0018e.f517f = i6;
                if (i6 == c0018e.f518g) {
                    H.a(c0018e.f516e, c0018e.f512a, iRound, c0018e.f514c, c0018e.f515d);
                    c0018e.f517f = 0;
                    c0018e.f518g = 0;
                }
                break;
            default:
                c0018e.getClass();
                c0018e.f514c = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                c0018e.f515d = iRound2;
                int i7 = c0018e.f518g + 1;
                c0018e.f518g = i7;
                if (c0018e.f517f == i7) {
                    H.a(c0018e.f516e, c0018e.f512a, c0018e.f513b, c0018e.f514c, iRound2);
                    c0018e.f517f = 0;
                    c0018e.f518g = 0;
                }
                break;
        }
    }

    public final void c(View view, PointF pointF) {
        switch (this.f509a) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                H.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                H.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                break;
            default:
                int iRound = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                H.a(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
                break;
        }
    }

    public final void d(View view, Float f6) {
        switch (this.f509a) {
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                H.f486a.x(view, f6.floatValue());
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                WeakHashMap weakHashMap = V.f1964a;
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f6.intValue(), view.getPaddingBottom());
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                view.getLayoutParams().width = f6.intValue();
                view.requestLayout();
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                view.getLayoutParams().height = f6.intValue();
                view.requestLayout();
                break;
            case 9:
                int iIntValue = f6.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = V.f1964a;
                view.setPaddingRelative(iIntValue, paddingTop, view.getPaddingEnd(), view.getPaddingBottom());
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f509a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return null;
            case 1:
                return null;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return null;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return null;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return null;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return a((View) obj);
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((View) obj).getClipBounds();
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return a((View) obj);
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return a((View) obj);
            case 9:
                return a((View) obj);
            case 10:
                return a((View) obj);
            case 11:
                return Float.valueOf(((K2.i) obj).b());
            case 12:
                return Float.valueOf(((K2.n) obj).f1593D);
            default:
                return Float.valueOf(((K2.p) obj).f1605E);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f509a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                b((C0018e) obj, (PointF) obj2);
                break;
            case 1:
                b((C0018e) obj, (PointF) obj2);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                c((View) obj, (PointF) obj2);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                c((View) obj, (PointF) obj2);
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                c((View) obj, (PointF) obj2);
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                d((View) obj, (Float) obj2);
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                d((View) obj, (Float) obj2);
                break;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                d((View) obj, (Float) obj2);
                break;
            case 9:
                d((View) obj, (Float) obj2);
                break;
            case 10:
                d((View) obj, (Float) obj2);
                break;
            case 11:
                K2.i iVar = (K2.i) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                if (iVar.f1570D != fFloatValue) {
                    iVar.f1570D = fFloatValue;
                    iVar.invalidateSelf();
                }
                break;
            case 12:
                K2.n nVar = (K2.n) obj;
                nVar.f1593D = ((Float) obj2).floatValue();
                List list = (List) nVar.f9146x;
                ((K2.j) list.get(0)).f1577a = 0.0f;
                float f6 = ((int) (r13 * 333.0f)) / 667;
                K2.j jVar = (K2.j) list.get(0);
                K2.j jVar2 = (K2.j) list.get(1);
                C0840b c0840b = nVar.f1595z;
                float interpolation = c0840b.getInterpolation(f6);
                jVar2.f1577a = interpolation;
                jVar.f1578b = interpolation;
                K2.j jVar3 = (K2.j) list.get(1);
                K2.j jVar4 = (K2.j) list.get(2);
                float interpolation2 = c0840b.getInterpolation(f6 + 0.49925038f);
                jVar4.f1577a = interpolation2;
                jVar3.f1578b = interpolation2;
                ((K2.j) list.get(2)).f1578b = 1.0f;
                if (nVar.f1592C && ((K2.j) list.get(1)).f1578b < 1.0f) {
                    ((K2.j) list.get(2)).f1579c = ((K2.j) list.get(1)).f1579c;
                    ((K2.j) list.get(1)).f1579c = ((K2.j) list.get(0)).f1579c;
                    ((K2.j) list.get(0)).f1579c = nVar.f1590A.f1553c[nVar.f1591B];
                    nVar.f1592C = false;
                }
                ((K2.l) nVar.f9145w).invalidateSelf();
                break;
            default:
                K2.p pVar = (K2.p) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                pVar.f1605E = fFloatValue2;
                int i6 = (int) (fFloatValue2 * 1800.0f);
                int i7 = 0;
                while (true) {
                    List list2 = (List) pVar.f9146x;
                    if (i7 >= list2.size()) {
                        if (pVar.f1604D) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((K2.j) it.next()).f1579c = pVar.f1602B.f1553c[pVar.f1603C];
                            }
                            pVar.f1604D = false;
                        }
                        ((K2.l) pVar.f9145w).invalidateSelf();
                    } else {
                        K2.j jVar5 = (K2.j) list2.get(i7);
                        int i8 = i7 * 2;
                        int i9 = K2.p.f1599H[i8];
                        int[] iArr = K2.p.f1598G;
                        Interpolator[] interpolatorArr = pVar.f1601A;
                        jVar5.f1577a = com.bumptech.glide.c.n(interpolatorArr[i8].getInterpolation((i6 - i9) / iArr[i8]), 0.0f, 1.0f);
                        jVar5.f1578b = com.bumptech.glide.c.n(interpolatorArr[i8 + 1].getInterpolation((i6 - r5[r6]) / iArr[r6]), 0.0f, 1.0f);
                        i7++;
                    }
                    break;
                }
                break;
        }
    }
}
