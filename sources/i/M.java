package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import m.C0964h0;
import m.C0984s;
import m.C0988u;
import m.C0990v;

/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f9224b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f9225c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f9226d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f9227e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f9228f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f9229g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s.k f9230h = new s.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f9231a = new Object[2];

    public C0984s a(Context context, AttributeSet attributeSet) {
        return new C0984s(context, attributeSet);
    }

    public C0988u b(Context context, AttributeSet attributeSet) {
        return new C0988u(context, attributeSet, com.xo.anilab.R.attr.buttonStyle);
    }

    public C0990v c(Context context, AttributeSet attributeSet) {
        return new C0990v(context, attributeSet, com.xo.anilab.R.attr.checkboxStyle);
    }

    public m.J d(Context context, AttributeSet attributeSet) {
        return new m.J(context, attributeSet);
    }

    public C0964h0 e(Context context, AttributeSet attributeSet) {
        return new C0964h0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        s.k kVar = f9230h;
        Constructor constructor = (Constructor) kVar.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f9224b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f9231a);
    }
}
