package G0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f707l;

    public j() {
        this.f696a = new Matrix();
        this.f697b = new ArrayList();
        this.f698c = 0.0f;
        this.f699d = 0.0f;
        this.f700e = 0.0f;
        this.f701f = 1.0f;
        this.f702g = 1.0f;
        this.f703h = 0.0f;
        this.f704i = 0.0f;
        this.f705j = new Matrix();
        this.f707l = null;
    }

    @Override // G0.k
    public final boolean a() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f697b;
            if (i6 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i6)).a()) {
                return true;
            }
            i6++;
        }
    }

    @Override // G0.k
    public final boolean b(int[] iArr) {
        int i6 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f697b;
            if (i6 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i6)).b(iArr);
            i6++;
        }
    }

    public final void c() {
        Matrix matrix = this.f705j;
        matrix.reset();
        matrix.postTranslate(-this.f699d, -this.f700e);
        matrix.postScale(this.f701f, this.f702g);
        matrix.postRotate(this.f698c, 0.0f, 0.0f);
        matrix.postTranslate(this.f703h + this.f699d, this.f704i + this.f700e);
    }

    public String getGroupName() {
        return this.f707l;
    }

    public Matrix getLocalMatrix() {
        return this.f705j;
    }

    public float getPivotX() {
        return this.f699d;
    }

    public float getPivotY() {
        return this.f700e;
    }

    public float getRotation() {
        return this.f698c;
    }

    public float getScaleX() {
        return this.f701f;
    }

    public float getScaleY() {
        return this.f702g;
    }

    public float getTranslateX() {
        return this.f703h;
    }

    public float getTranslateY() {
        return this.f704i;
    }

    public void setPivotX(float f6) {
        if (f6 != this.f699d) {
            this.f699d = f6;
            c();
        }
    }

    public void setPivotY(float f6) {
        if (f6 != this.f700e) {
            this.f700e = f6;
            c();
        }
    }

    public void setRotation(float f6) {
        if (f6 != this.f698c) {
            this.f698c = f6;
            c();
        }
    }

    public void setScaleX(float f6) {
        if (f6 != this.f701f) {
            this.f701f = f6;
            c();
        }
    }

    public void setScaleY(float f6) {
        if (f6 != this.f702g) {
            this.f702g = f6;
            c();
        }
    }

    public void setTranslateX(float f6) {
        if (f6 != this.f703h) {
            this.f703h = f6;
            c();
        }
    }

    public void setTranslateY(float f6) {
        if (f6 != this.f704i) {
            this.f704i = f6;
            c();
        }
    }

    public j(j jVar, C1280b c1280b) {
        l hVar;
        this.f696a = new Matrix();
        this.f697b = new ArrayList();
        this.f698c = 0.0f;
        this.f699d = 0.0f;
        this.f700e = 0.0f;
        this.f701f = 1.0f;
        this.f702g = 1.0f;
        this.f703h = 0.0f;
        this.f704i = 0.0f;
        Matrix matrix = new Matrix();
        this.f705j = matrix;
        this.f707l = null;
        this.f698c = jVar.f698c;
        this.f699d = jVar.f699d;
        this.f700e = jVar.f700e;
        this.f701f = jVar.f701f;
        this.f702g = jVar.f702g;
        this.f703h = jVar.f703h;
        this.f704i = jVar.f704i;
        String str = jVar.f707l;
        this.f707l = str;
        this.f706k = jVar.f706k;
        if (str != null) {
            c1280b.put(str, this);
        }
        matrix.set(jVar.f705j);
        ArrayList arrayList = jVar.f697b;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            Object obj = arrayList.get(i6);
            if (obj instanceof j) {
                this.f697b.add(new j((j) obj, c1280b));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f686f = 0.0f;
                    iVar2.f688h = 1.0f;
                    iVar2.f689i = 1.0f;
                    iVar2.f690j = 0.0f;
                    iVar2.f691k = 1.0f;
                    iVar2.f692l = 0.0f;
                    iVar2.f693m = Paint.Cap.BUTT;
                    iVar2.f694n = Paint.Join.MITER;
                    iVar2.f695o = 4.0f;
                    iVar2.f685e = iVar.f685e;
                    iVar2.f686f = iVar.f686f;
                    iVar2.f688h = iVar.f688h;
                    iVar2.f687g = iVar.f687g;
                    iVar2.f710c = iVar.f710c;
                    iVar2.f689i = iVar.f689i;
                    iVar2.f690j = iVar.f690j;
                    iVar2.f691k = iVar.f691k;
                    iVar2.f692l = iVar.f692l;
                    iVar2.f693m = iVar.f693m;
                    iVar2.f694n = iVar.f694n;
                    iVar2.f695o = iVar.f695o;
                    hVar = iVar2;
                } else {
                    if (!(obj instanceof h)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    hVar = new h((h) obj);
                }
                this.f697b.add(hVar);
                Object obj2 = hVar.f709b;
                if (obj2 != null) {
                    c1280b.put(obj2, hVar);
                }
            }
        }
    }
}
