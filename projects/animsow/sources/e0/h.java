package e0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class h extends B3.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f8245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f8246y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8247z = true;

    public h(TextView textView) {
        this.f8245x = textView;
        this.f8246y = new f(textView);
    }

    @Override // B3.e
    public final void B(boolean z5) {
        this.f8247z = z5;
        E();
        TextView textView = this.f8245x;
        textView.setFilters(r(textView.getFilters()));
    }

    public final void E() {
        TextView textView = this.f8245x;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f8247z) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).f8254a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // B3.e
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        if (!this.f8247z) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i6 = 0; i6 < inputFilterArr.length; i6++) {
                InputFilter inputFilter = inputFilterArr[i6];
                if (inputFilter instanceof f) {
                    sparseArray.put(i6, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (sparseArray.indexOfKey(i8) < 0) {
                    inputFilterArr2[i7] = inputFilterArr[i8];
                    i7++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i9 = 0;
        while (true) {
            f fVar = this.f8246y;
            if (i9 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i9] == fVar) {
                return inputFilterArr;
            }
            i9++;
        }
    }

    @Override // B3.e
    public final void y(boolean z5) {
        if (z5) {
            E();
        }
    }
}
