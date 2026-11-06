package P2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t[] f2475a = new t[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f2476b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f2477c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f2478d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f2479e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f2480f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f2481g = new t();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f2482h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f2483i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f2484j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f2485k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2486l = true;

    public l() {
        for (int i6 = 0; i6 < 4; i6++) {
            this.f2475a[i6] = new t();
            this.f2476b[i6] = new Matrix();
            this.f2477c[i6] = new Matrix();
        }
    }

    public final void a(j jVar, float f6, RectF rectF, C1243i c1243i, Path path) {
        int i6;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        float fCenterX;
        float f7;
        Path path2;
        C1243i c1243i2;
        int i7;
        float f8;
        float f9;
        l lVar = this;
        C1243i c1243i3 = c1243i;
        Path path3 = path;
        path.rewind();
        Path path4 = lVar.f2479e;
        path4.rewind();
        Path path5 = lVar.f2480f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i8 = 0;
        while (true) {
            i6 = 4;
            matrixArr = lVar.f2477c;
            fArr = lVar.f2482h;
            matrixArr2 = lVar.f2476b;
            tVarArr = lVar.f2475a;
            if (i8 >= 4) {
                break;
            }
            c cVar = i8 != 1 ? i8 != 2 ? i8 != 3 ? jVar.f2467f : jVar.f2466e : jVar.f2469h : jVar.f2468g;
            com.bumptech.glide.d dVar = i8 != 1 ? i8 != 2 ? i8 != 3 ? jVar.f2463b : jVar.f2462a : jVar.f2465d : jVar.f2464c;
            t tVar = tVarArr[i8];
            dVar.getClass();
            dVar.m(f6, cVar.a(rectF), tVar);
            int i9 = i8 + 1;
            float f10 = (i9 % 4) * 90;
            matrixArr2[i8].reset();
            PointF pointF = lVar.f2478d;
            if (i8 == 1) {
                i7 = i9;
                f8 = rectF.right;
            } else if (i8 != 2) {
                if (i8 != 3) {
                    f8 = rectF.right;
                    i7 = i9;
                } else {
                    i7 = i9;
                    f8 = rectF.left;
                }
                f9 = rectF.top;
                pointF.set(f8, f9);
                matrixArr2[i8].setTranslate(pointF.x, pointF.y);
                matrixArr2[i8].preRotate(f10);
                t tVar2 = tVarArr[i8];
                fArr[0] = tVar2.f2507c;
                fArr[1] = tVar2.f2508d;
                matrixArr2[i8].mapPoints(fArr);
                matrixArr[i8].reset();
                matrixArr[i8].setTranslate(fArr[0], fArr[1]);
                matrixArr[i8].preRotate(f10);
                i8 = i7;
            } else {
                i7 = i9;
                f8 = rectF.left;
            }
            f9 = rectF.bottom;
            pointF.set(f8, f9);
            matrixArr2[i8].setTranslate(pointF.x, pointF.y);
            matrixArr2[i8].preRotate(f10);
            t tVar22 = tVarArr[i8];
            fArr[0] = tVar22.f2507c;
            fArr[1] = tVar22.f2508d;
            matrixArr2[i8].mapPoints(fArr);
            matrixArr[i8].reset();
            matrixArr[i8].setTranslate(fArr[0], fArr[1]);
            matrixArr[i8].preRotate(f10);
            i8 = i7;
        }
        int i10 = 0;
        while (i10 < i6) {
            t tVar3 = tVarArr[i10];
            fArr[0] = tVar3.f2505a;
            fArr[1] = tVar3.f2506b;
            matrixArr2[i10].mapPoints(fArr);
            if (i10 == 0) {
                path3.moveTo(fArr[0], fArr[1]);
            } else {
                path3.lineTo(fArr[0], fArr[1]);
            }
            tVarArr[i10].b(matrixArr2[i10], path3);
            if (c1243i3 != null) {
                t tVar4 = tVarArr[i10];
                Matrix matrix = matrixArr2[i10];
                BitSet bitSet = ((g) c1243i3.f12254x).f2460z;
                tVar4.getClass();
                bitSet.set(i10, false);
                s[] sVarArr = ((g) c1243i3.f12254x).f2458x;
                tVar4.a(tVar4.f2510f);
                sVarArr[i10] = new m(new ArrayList(tVar4.f2512h), new Matrix(matrix));
            }
            int i11 = i10 + 1;
            int i12 = i11 % 4;
            t tVar5 = tVarArr[i10];
            fArr[0] = tVar5.f2507c;
            fArr[1] = tVar5.f2508d;
            matrixArr2[i10].mapPoints(fArr);
            t tVar6 = tVarArr[i12];
            float f11 = tVar6.f2505a;
            float[] fArr2 = lVar.f2483i;
            fArr2[0] = f11;
            fArr2[1] = tVar6.f2506b;
            matrixArr2[i12].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            t tVar7 = tVarArr[i10];
            fArr[0] = tVar7.f2507c;
            fArr[1] = tVar7.f2508d;
            matrixArr2[i10].mapPoints(fArr);
            if (i10 == 1 || i10 == 3) {
                fCenterX = rectF.centerX();
                f7 = fArr[0];
            } else {
                fCenterX = rectF.centerY();
                f7 = fArr[1];
            }
            Math.abs(fCenterX - f7);
            t tVar8 = lVar.f2481g;
            tVar8.d(0.0f, 270.0f, 0.0f);
            (i10 != 1 ? i10 != 2 ? i10 != 3 ? jVar.f2471j : jVar.f2470i : jVar.f2473l : jVar.f2472k).getClass();
            tVar8.c(fMax, 0.0f);
            Path path6 = lVar.f2484j;
            path6.reset();
            tVar8.b(matrixArr[i10], path6);
            if (lVar.f2486l && (lVar.b(path6, i10) || lVar.b(path6, i12))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = tVar8.f2505a;
                fArr[1] = tVar8.f2506b;
                matrixArr[i10].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i10], path4);
                c1243i2 = c1243i;
                path2 = path;
            } else {
                path2 = path;
                tVar8.b(matrixArr[i10], path2);
                c1243i2 = c1243i;
            }
            if (c1243i2 != null) {
                Matrix matrix2 = matrixArr[i10];
                ((g) c1243i2.f12254x).f2460z.set(i10 + 4, false);
                s[] sVarArr2 = ((g) c1243i2.f12254x).f2459y;
                tVar8.a(tVar8.f2510f);
                sVarArr2[i10] = new m(new ArrayList(tVar8.f2512h), new Matrix(matrix2));
            }
            lVar = this;
            path3 = path2;
            i10 = i11;
            i6 = 4;
            c1243i3 = c1243i2;
        }
        Path path7 = path3;
        path.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public final boolean b(Path path, int i6) {
        Path path2 = this.f2485k;
        path2.reset();
        this.f2475a[i6].b(this.f2476b[i6], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
