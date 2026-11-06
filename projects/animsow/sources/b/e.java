package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.AbstractC0628i;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f37a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f47k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f48l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f49m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f50n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f51o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f52p;

    public e() {
        super(-2, -2);
        this.f38b = false;
        this.f39c = 0;
        this.f40d = 0;
        this.f41e = -1;
        this.f42f = -1;
        this.f43g = 0;
        this.f44h = 0;
        this.f52p = new Rect();
    }

    public final boolean a(int i6) {
        if (i6 == 0) {
            return this.f50n;
        }
        if (i6 != 1) {
            return false;
        }
        return this.f51o;
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f38b = false;
        this.f39c = 0;
        this.f40d = 0;
        this.f41e = -1;
        this.f42f = -1;
        this.f43g = 0;
        this.f44h = 0;
        this.f52p = new Rect();
    }

    public e(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f38b = false;
        this.f39c = 0;
        this.f40d = 0;
        this.f41e = -1;
        this.f42f = -1;
        this.f43g = 0;
        this.f44h = 0;
        this.f52p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.a.f1b);
        this.f39c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f42f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f40d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f41e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f43g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f44h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f38b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f5286P;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f5286P;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f5288R;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f5287Q);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e6) {
                    throw new RuntimeException(AbstractC0628i.q("Could not inflate Behavior subclass ", string), e6);
                }
            }
            this.f37a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f37a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f38b = false;
        this.f39c = 0;
        this.f40d = 0;
        this.f41e = -1;
        this.f42f = -1;
        this.f43g = 0;
        this.f44h = 0;
        this.f52p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f38b = false;
        this.f39c = 0;
        this.f40d = 0;
        this.f41e = -1;
        this.f42f = -1;
        this.f43g = 0;
        this.f44h = 0;
        this.f52p = new Rect();
    }
}
