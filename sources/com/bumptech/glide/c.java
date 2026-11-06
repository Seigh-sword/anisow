package com.bumptech.glide;

import F0.G;
import N.InterfaceC0092f0;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.InterfaceC0321v;
import com.xo.anilab.R;
import d.InterfaceC0619G;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import s4.AbstractC1305a;
import t.AbstractC1324g;
import t.C1321d;
import t.C1323f;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements InterfaceC0092f0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f6300w = true;

    public static final void N(View view, InterfaceC0321v interfaceC0321v) {
        AbstractC1305a.o(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0321v);
    }

    public static final void O(View view, InterfaceC0619G interfaceC0619G) {
        AbstractC1305a.o(view, "<this>");
        AbstractC1305a.o(interfaceC0619G, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0619G);
    }

    public static void P(ViewGroup viewGroup, boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            G.b(viewGroup, z5);
        } else if (f6300w) {
            try {
                G.b(viewGroup, z5);
            } catch (NoSuchMethodError unused) {
                f6300w = false;
            }
        }
    }

    public static float n(float f6, float f7, float f8) {
        return f6 < f7 ? f7 : f6 > f8 ? f8 : f6;
    }

    public static int o(int i6, int i7, int i8) {
        return i6 < i7 ? i7 : i6 > i8 ? i8 : i6;
    }

    public static final Object s(Context context, Class cls) {
        Application application;
        AbstractC1305a.o(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Context baseContext = applicationContext;
            while (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                if (baseContext instanceof Application) {
                    application = (Application) baseContext;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
        }
        application = (Application) applicationContext;
        return S3.a.r(cls, application);
    }

    public static F.d t(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i6) {
        F.d dVarB;
        boolean zW = w(xmlPullParser, str);
        Object obj = null;
        int i7 = 0;
        if (zW) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i6, typedValue);
            int i8 = typedValue.type;
            if (i8 >= 28 && i8 <= 31) {
                return new F.d(typedValue.data, i7, obj, obj);
            }
            try {
                dVarB = F.d.b(typedArray.getResources(), typedArray.getResourceId(i6, 0), theme);
            } catch (Exception e6) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e6);
                dVarB = null;
            }
            if (dVarB != null) {
                return dVarB;
            }
        }
        return new F.d(i7, i7, obj, obj);
    }

    public static boolean w(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray x(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void y(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public abstract View A(int i6);

    public abstract void B(int i6);

    public abstract void C(Typeface typeface, boolean z5);

    public abstract boolean D();

    public abstract void E(P0.h hVar);

    public abstract void I(View view, float f6, float f7);

    public abstract void J(T0.f fVar, T0.f fVar2);

    public abstract void K(C1323f c1323f, C1323f c1323f2);

    public abstract void L(T0.f fVar, Thread thread);

    public abstract void M(C1323f c1323f, Thread thread);

    public abstract boolean Q(View view, int i6);

    public abstract void R();

    public abstract boolean h(T0.g gVar, T0.c cVar, T0.c cVar2);

    public abstract boolean i(AbstractC1324g abstractC1324g, C1321d c1321d, C1321d c1321d2);

    public abstract boolean j(T0.g gVar, Object obj, Object obj2);

    public abstract boolean k(AbstractC1324g abstractC1324g, Object obj, Object obj2);

    public abstract boolean l(T0.g gVar, T0.f fVar, T0.f fVar2);

    public abstract boolean m(AbstractC1324g abstractC1324g, C1323f c1323f, C1323f c1323f2);

    public abstract int p(View view, int i6);

    public abstract int q(View view, int i6);

    public abstract List r(String str, List list);

    public int u(View view) {
        return 0;
    }

    public int v() {
        return 0;
    }

    public abstract void z(Throwable th);

    @Override // N.InterfaceC0092f0
    public void a() {
    }

    @Override // N.InterfaceC0092f0
    public void f() {
    }

    public void G(int i6) {
    }

    public void F(View view, int i6) {
    }

    public void H(View view, int i6, int i7) {
    }
}
