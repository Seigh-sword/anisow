package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f14031n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f14044m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14031n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f14060i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            switch (f14031n.get(index)) {
                case 1:
                    this.f14032a = typedArrayObtainStyledAttributes.getFloat(index, this.f14032a);
                    break;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    this.f14033b = typedArrayObtainStyledAttributes.getFloat(index, this.f14033b);
                    break;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    this.f14034c = typedArrayObtainStyledAttributes.getFloat(index, this.f14034c);
                    break;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    this.f14035d = typedArrayObtainStyledAttributes.getFloat(index, this.f14035d);
                    break;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    this.f14036e = typedArrayObtainStyledAttributes.getFloat(index, this.f14036e);
                    break;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f14037f = typedArrayObtainStyledAttributes.getDimension(index, this.f14037f);
                    break;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f14038g = typedArrayObtainStyledAttributes.getDimension(index, this.f14038g);
                    break;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    this.f14040i = typedArrayObtainStyledAttributes.getDimension(index, this.f14040i);
                    break;
                case 9:
                    this.f14041j = typedArrayObtainStyledAttributes.getDimension(index, this.f14041j);
                    break;
                case 10:
                    this.f14042k = typedArrayObtainStyledAttributes.getDimension(index, this.f14042k);
                    break;
                case 11:
                    this.f14043l = true;
                    this.f14044m = typedArrayObtainStyledAttributes.getDimension(index, this.f14044m);
                    break;
                case 12:
                    this.f14039h = n.f(typedArrayObtainStyledAttributes, index, this.f14039h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
