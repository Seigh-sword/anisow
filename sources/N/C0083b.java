package N;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.xo.anilab.R;
import d.AbstractC0628i;
import g.C0712a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: N.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0083b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1972c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0081a f1974b;

    public C0083b() {
        this(f1972c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1973a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C0712a b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1973a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0712a(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1973a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, O.i iVar) {
        this.f1973a.onInitializeAccessibilityNodeInfo(view, iVar.f2303a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1973a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1973a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i6, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z5 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= listEmptyList.size()) {
                break;
            }
            O.d dVar = (O.d) listEmptyList.get(i7);
            if (dVar.a() == i6) {
                O.s sVar = dVar.f2300d;
                if (sVar != null) {
                    Class cls = dVar.f2299c;
                    if (cls != null) {
                        try {
                            AbstractC0628i.p(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e6) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e6);
                        }
                    }
                    zPerformAccessibilityAction = sVar.a(view);
                }
            } else {
                i7++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f1973a.performAccessibilityAction(view, i6, bundle);
        }
        if (zPerformAccessibilityAction || i6 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i8 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i8)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i9 = 0;
            while (true) {
                if (clickableSpanArr == null || i9 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i9])) {
                    clickableSpan.onClick(view);
                    z5 = true;
                    break;
                }
                i9++;
            }
        }
        return z5;
    }

    public void h(View view, int i6) {
        this.f1973a.sendAccessibilityEvent(view, i6);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f1973a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0083b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1973a = accessibilityDelegate;
        this.f1974b = new C0081a(this);
    }
}
