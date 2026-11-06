package N;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.xo.anilab.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f1964a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f1965b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1966c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1967d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f1968e = new C();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final E f1969f = new E();

    public static C0090e0 a(View view) {
        if (f1964a == null) {
            f1964a = new WeakHashMap();
        }
        C0090e0 c0090e0 = (C0090e0) f1964a.get(view);
        if (c0090e0 != null) {
            return c0090e0;
        }
        C0090e0 c0090e02 = new C0090e0(view);
        f1964a.put(view, c0090e02);
        return c0090e02;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = U.f1960d;
        U u5 = (U) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (u5 == null) {
            u5 = new U();
            u5.f1961a = null;
            u5.f1962b = null;
            u5.f1963c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u5);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = u5.f1961a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = U.f1960d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (u5.f1961a == null) {
                            u5.f1961a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = U.f1960d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                u5.f1961a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    u5.f1961a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = u5.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (u5.f1962b == null) {
                    u5.f1962b = new SparseArray();
                }
                u5.f1962b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return O.a(view);
        }
        if (f1966c) {
            return null;
        }
        if (f1965b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1965b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1966c = true;
                return null;
            }
        }
        Object obj = f1965b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = N.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(View view) {
        return Build.VERSION.SDK_INT >= 31 ? Q.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i6) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z5) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z5 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i6);
                if (z5) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i6 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i6);
                        return;
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i6);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0093g h(View view, C0093g c0093g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0093g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.b(view, c0093g);
        }
        InterfaceC0108t interfaceC0108t = (InterfaceC0108t) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0109u interfaceC0109u = f1968e;
        if (interfaceC0108t == null) {
            if (view instanceof InterfaceC0109u) {
                interfaceC0109u = (InterfaceC0109u) view;
            }
            return interfaceC0109u.a(c0093g);
        }
        C0093g c0093gA = ((T.r) interfaceC0108t).a(view, c0093g);
        if (c0093gA == null) {
            return null;
        }
        if (view instanceof InterfaceC0109u) {
            interfaceC0109u = (InterfaceC0109u) view;
        }
        return interfaceC0109u.a(c0093gA);
    }

    public static void i(View view, int i6) {
        ArrayList arrayListE = e(view);
        for (int i7 = 0; i7 < arrayListE.size(); i7++) {
            if (((O.d) arrayListE.get(i7)).a() == i6) {
                arrayListE.remove(i7);
                return;
            }
        }
    }

    public static void j(View view, O.d dVar, O.s sVar) {
        O.d dVar2 = new O.d(null, dVar.f2298b, null, sVar, dVar.f2299c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        C0083b c0083b = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof C0081a ? ((C0081a) accessibilityDelegateC).f1971a : new C0083b(accessibilityDelegateC);
        if (c0083b == null) {
            c0083b = new C0083b();
        }
        l(view, c0083b);
        i(view, dVar2.a());
        e(view).add(dVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            O.d(view, context, iArr, attributeSet, typedArray, i6, 0);
        }
    }

    public static void l(View view, C0083b c0083b) {
        if (c0083b == null && (c(view) instanceof C0081a)) {
            c0083b = new C0083b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0083b == null ? null : c0083b.f1974b);
    }

    public static void m(View view, CharSequence charSequence) {
        new D(R.id.tag_accessibility_pane_title, 8, 28, 1 == true ? 1 : 0).b(view, charSequence);
        E e6 = f1969f;
        if (charSequence == null) {
            e6.f1947w.remove(view);
            view.removeOnAttachStateChangeListener(e6);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(e6);
        } else {
            e6.f1947w.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(e6);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e6);
            }
        }
    }
}
