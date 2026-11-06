package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import w.C1437d;
import w.C1440g;
import x.b;
import z.r;
import z.t;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends t {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C1440g f5267F;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13851w = new int[32];
        this.f13850C = new HashMap();
        this.f13853y = context;
        g(attributeSet);
    }

    @Override // z.t, z.AbstractC1512c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        C1440g c1440g = new C1440g();
        c1440g.f13472s0 = 0;
        c1440g.f13473t0 = 0;
        c1440g.f13474u0 = 0;
        c1440g.f13475v0 = 0;
        c1440g.f13476w0 = 0;
        c1440g.f13477x0 = 0;
        c1440g.f13478y0 = false;
        c1440g.f13479z0 = 0;
        c1440g.f13446A0 = 0;
        c1440g.f13447B0 = new b();
        c1440g.f13448C0 = null;
        c1440g.f13449D0 = -1;
        c1440g.E0 = -1;
        c1440g.f13450F0 = -1;
        c1440g.f13451G0 = -1;
        c1440g.f13452H0 = -1;
        c1440g.f13453I0 = -1;
        c1440g.f13454J0 = 0.5f;
        c1440g.f13455K0 = 0.5f;
        c1440g.f13456L0 = 0.5f;
        c1440g.f13457M0 = 0.5f;
        c1440g.f13458N0 = 0.5f;
        c1440g.f13459O0 = 0.5f;
        c1440g.f13460P0 = 0;
        c1440g.f13461Q0 = 0;
        c1440g.f13462R0 = 2;
        c1440g.f13463S0 = 2;
        c1440g.f13464T0 = 0;
        c1440g.f13465U0 = -1;
        c1440g.f13466V0 = 0;
        c1440g.f13467W0 = new ArrayList();
        c1440g.f13468X0 = null;
        c1440g.f13469Y0 = null;
        c1440g.f13470Z0 = null;
        c1440g.b1 = 0;
        this.f5267F = c1440g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f14053b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.f5267F.f13466V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1440g c1440g2 = this.f5267F;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1440g2.f13472s0 = dimensionPixelSize;
                    c1440g2.f13473t0 = dimensionPixelSize;
                    c1440g2.f13474u0 = dimensionPixelSize;
                    c1440g2.f13475v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C1440g c1440g3 = this.f5267F;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1440g3.f13474u0 = dimensionPixelSize2;
                    c1440g3.f13476w0 = dimensionPixelSize2;
                    c1440g3.f13477x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f5267F.f13475v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f5267F.f13476w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f5267F.f13472s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f5267F.f13477x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f5267F.f13473t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f5267F.f13464T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f5267F.f13449D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f5267F.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f5267F.f13450F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f5267F.f13452H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f5267F.f13451G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f5267F.f13453I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f5267F.f13454J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f5267F.f13456L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f5267F.f13458N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f5267F.f13457M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f5267F.f13459O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f5267F.f13455K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f5267F.f13462R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f5267F.f13463S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f5267F.f13460P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f5267F.f13461Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f5267F.f13465U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f13854z = this.f5267F;
        i();
    }

    @Override // z.AbstractC1512c
    public final void h(C1437d c1437d, boolean z5) {
        C1440g c1440g = this.f5267F;
        int i6 = c1440g.f13474u0;
        if (i6 > 0 || c1440g.f13475v0 > 0) {
            if (z5) {
                c1440g.f13476w0 = c1440g.f13475v0;
                c1440g.f13477x0 = i6;
            } else {
                c1440g.f13476w0 = i6;
                c1440g.f13477x0 = c1440g.f13475v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00d7 A[EDGE_INSN: B:430:0x00d7->B:60:0x00d7 BREAK  A[LOOP:1: B:54:0x00c3->B:59:0x00d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    @Override // z.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(w.C1440g r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 2078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(w.g, int, int):void");
    }

    @Override // z.AbstractC1512c, android.view.View
    public final void onMeasure(int i6, int i7) {
        j(this.f5267F, i6, i7);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f5267F.f13456L0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i6) {
        this.f5267F.f13450F0 = i6;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f5267F.f13457M0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i6) {
        this.f5267F.f13451G0 = i6;
        requestLayout();
    }

    public void setHorizontalAlign(int i6) {
        this.f5267F.f13462R0 = i6;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f5267F.f13454J0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i6) {
        this.f5267F.f13460P0 = i6;
        requestLayout();
    }

    public void setHorizontalStyle(int i6) {
        this.f5267F.f13449D0 = i6;
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.f5267F.f13458N0 = f6;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i6) {
        this.f5267F.f13452H0 = i6;
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.f5267F.f13459O0 = f6;
        requestLayout();
    }

    public void setLastVerticalStyle(int i6) {
        this.f5267F.f13453I0 = i6;
        requestLayout();
    }

    public void setMaxElementsWrap(int i6) {
        this.f5267F.f13465U0 = i6;
        requestLayout();
    }

    public void setOrientation(int i6) {
        this.f5267F.f13466V0 = i6;
        requestLayout();
    }

    public void setPadding(int i6) {
        C1440g c1440g = this.f5267F;
        c1440g.f13472s0 = i6;
        c1440g.f13473t0 = i6;
        c1440g.f13474u0 = i6;
        c1440g.f13475v0 = i6;
        requestLayout();
    }

    public void setPaddingBottom(int i6) {
        this.f5267F.f13473t0 = i6;
        requestLayout();
    }

    public void setPaddingLeft(int i6) {
        this.f5267F.f13476w0 = i6;
        requestLayout();
    }

    public void setPaddingRight(int i6) {
        this.f5267F.f13477x0 = i6;
        requestLayout();
    }

    public void setPaddingTop(int i6) {
        this.f5267F.f13472s0 = i6;
        requestLayout();
    }

    public void setVerticalAlign(int i6) {
        this.f5267F.f13463S0 = i6;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f5267F.f13455K0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i6) {
        this.f5267F.f13461Q0 = i6;
        requestLayout();
    }

    public void setVerticalStyle(int i6) {
        this.f5267F.E0 = i6;
        requestLayout();
    }

    public void setWrapMode(int i6) {
        this.f5267F.f13464T0 = i6;
        requestLayout();
    }
}
