package h0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import d.AbstractC0628i;
import g0.AbstractC0714a;
import i0.AbstractC0823c;
import i0.C0822b;
import i0.C0824d;
import i0.EnumC0821a;

/* JADX INFO: loaded from: classes.dex */
public final class H implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final W f8659w;

    public H(W w5) {
        this.f8659w = w5;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        c0 c0VarG;
        StringBuilder sb;
        String str2;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        W w5 = this.f8659w;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, w5);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0714a.f8508a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                if (AbstractComponentCallbacksC0734B.class.isAssignableFrom(N.b(context.getClassLoader(), attributeValue))) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BC = resourceId != -1 ? w5.C(resourceId) : null;
                    if (abstractComponentCallbacksC0734BC == null && string != null) {
                        abstractComponentCallbacksC0734BC = w5.D(string);
                    }
                    if (abstractComponentCallbacksC0734BC == null && id != -1) {
                        abstractComponentCallbacksC0734BC = w5.C(id);
                    }
                    if (abstractComponentCallbacksC0734BC == null) {
                        N nH = w5.H();
                        context.getClassLoader();
                        abstractComponentCallbacksC0734BC = nH.a(attributeValue);
                        abstractComponentCallbacksC0734BC.f8599J = true;
                        abstractComponentCallbacksC0734BC.f8609T = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0734BC.f8610U = id;
                        abstractComponentCallbacksC0734BC.f8611V = string;
                        abstractComponentCallbacksC0734BC.f8600K = true;
                        abstractComponentCallbacksC0734BC.f8605P = w5;
                        D d6 = w5.f8717w;
                        abstractComponentCallbacksC0734BC.f8606Q = d6;
                        Context context2 = d6.f8643y;
                        abstractComponentCallbacksC0734BC.f8616a0 = true;
                        if ((d6 != null ? d6.f8642x : null) != null) {
                            abstractComponentCallbacksC0734BC.f8616a0 = true;
                        }
                        c0VarG = w5.a(abstractComponentCallbacksC0734BC);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            sb = new StringBuilder("Fragment ");
                            sb.append(abstractComponentCallbacksC0734BC);
                            str2 = " has been inflated via the <fragment> tag: id=0x";
                            sb.append(str2);
                            sb.append(Integer.toHexString(resourceId));
                            Log.v("FragmentManager", sb.toString());
                        }
                    } else {
                        if (abstractComponentCallbacksC0734BC.f8600K) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0734BC.f8600K = true;
                        abstractComponentCallbacksC0734BC.f8605P = w5;
                        D d7 = w5.f8717w;
                        abstractComponentCallbacksC0734BC.f8606Q = d7;
                        Context context3 = d7.f8643y;
                        abstractComponentCallbacksC0734BC.f8616a0 = true;
                        if ((d7 != null ? d7.f8642x : null) != null) {
                            abstractComponentCallbacksC0734BC.f8616a0 = true;
                        }
                        c0VarG = w5.g(abstractComponentCallbacksC0734BC);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            sb = new StringBuilder("Retained Fragment ");
                            sb.append(abstractComponentCallbacksC0734BC);
                            str2 = " has been re-attached via the <fragment> tag: id=0x";
                            sb.append(str2);
                            sb.append(Integer.toHexString(resourceId));
                            Log.v("FragmentManager", sb.toString());
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0822b c0822b = AbstractC0823c.f9359a;
                    C0824d c0824d = new C0824d(abstractComponentCallbacksC0734BC, viewGroup, 0);
                    AbstractC0823c.c(c0824d);
                    C0822b c0822bA = AbstractC0823c.a(abstractComponentCallbacksC0734BC);
                    if (c0822bA.f9357a.contains(EnumC0821a.f9355z) && AbstractC0823c.e(c0822bA, abstractComponentCallbacksC0734BC.getClass(), C0824d.class)) {
                        AbstractC0823c.b(c0822bA, c0824d);
                    }
                    abstractComponentCallbacksC0734BC.f8617b0 = viewGroup;
                    c0VarG.k();
                    c0VarG.j();
                    View view2 = abstractComponentCallbacksC0734BC.f8618c0;
                    if (view2 == null) {
                        throw new IllegalStateException(AbstractC0628i.j("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0734BC.f8618c0.getTag() == null) {
                        abstractComponentCallbacksC0734BC.f8618c0.setTag(string);
                    }
                    abstractComponentCallbacksC0734BC.f8618c0.addOnAttachStateChangeListener(new G(this, c0VarG));
                    return abstractComponentCallbacksC0734BC.f8618c0;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
