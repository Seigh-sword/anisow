package H2;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.xo.anilab.R;
import d.AbstractC0628i;
import i.C0803c;
import java.util.ArrayList;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1055a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1056b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B.h f1057c = new B.h(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1058d = 0;

    public static void a(Context context, AttributeSet attributeSet, int i6, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12446J, i6, i7);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z5) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f1056b, "Theme.MaterialComponents");
            }
        }
        c(context, f1055a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12446J, i6, i7);
        boolean z5 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i6, i7);
            for (int i8 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i8, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z5 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z5 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z5) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i6)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC0628i.j("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static ArrayList d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < toolbar.getChildCount(); i6++) {
            View childAt = toolbar.getChildAt(i6);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TypedArray e(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        a(context, attributeSet, i6, i7);
        b(context, attributeSet, iArr, i6, i7, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i6, i7);
    }

    public static C0803c f(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        a(context, attributeSet, i6, i7);
        b(context, attributeSet, iArr, i6, i7, iArr2);
        return new C0803c(context, 2, context.obtainStyledAttributes(attributeSet, iArr, i6, i7));
    }
}
