package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import d.AbstractC0628i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class L implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f9220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f9221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Method f9222y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Context f9223z;

    public L(View view, String str) {
        this.f9220w = view;
        this.f9221x = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f9222y == null) {
            View view2 = this.f9220w;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f9221x;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbN = AbstractC0628i.n("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbN.append(view2.getClass());
                    sbN.append(str);
                    throw new IllegalStateException(sbN.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f9222y = method;
                        this.f9223z = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f9222y.invoke(this.f9223z, view);
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException("Could not execute method for android:onClick", e7);
        }
    }
}
