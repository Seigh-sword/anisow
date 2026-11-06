package i;

import D.AbstractC0005f;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import k.C0887j;
import m.C0998z;
import m.R0;
import m.i1;
import m.m1;
import s.C1283e;
import s4.AbstractC1305a;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: i.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0812l extends h0.E implements InterfaceC0813m {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public H f9324V;

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        H h4 = (H) k();
        h4.v();
        ((ViewGroup) h4.f9188X.findViewById(R.id.content)).addView(view, layoutParams);
        h4.f9173I.a(h4.f9172H.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.AbstractActivityC0812l.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((H) k()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // D.AbstractActivityC0011l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((H) k()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i6) {
        H h4 = (H) k();
        h4.v();
        return h4.f9172H.findViewById(i6);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        H h4 = (H) k();
        if (h4.f9176L == null) {
            h4.z();
            U u5 = h4.f9175K;
            h4.f9176L = new C0887j(u5 != null ? u5.B() : h4.f9171G);
        }
        return h4.f9176L;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i6 = m1.f10333a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        H h4 = (H) k();
        if (h4.f9175K != null) {
            h4.z();
            h4.f9175K.getClass();
            h4.A(0);
        }
    }

    public final AbstractC0818s k() {
        if (this.f9324V == null) {
            ExecutorC0817q executorC0817q = AbstractC0818s.f9337w;
            this.f9324V = new H(this, null, this, this);
        }
        return this.f9324V;
    }

    public final void l() {
        com.bumptech.glide.c.N(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC1305a.o(decorView, "<this>");
        decorView.setTag(com.xo.anilab.R.id.view_tree_view_model_store_owner, this);
        AbstractC1332d.p0(getWindow().getDecorView(), this);
        com.bumptech.glide.c.O(getWindow().getDecorView(), this);
    }

    @Override // d.AbstractActivityC0638s, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        H h4 = (H) k();
        if (h4.f9193c0 && h4.f9187W) {
            h4.z();
            U u5 = h4.f9175K;
            if (u5 != null) {
                u5.E(u5.f9259n.getResources().getBoolean(com.xo.anilab.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0998z c0998zA = C0998z.a();
        Context context = h4.f9171G;
        synchronized (c0998zA) {
            R0 r02 = c0998zA.f10429a;
            synchronized (r02) {
                C1283e c1283e = (C1283e) r02.f10186b.get(context);
                if (c1283e != null) {
                    c1283e.a();
                }
            }
        }
        h4.f9205o0 = new Configuration(h4.f9171G.getResources().getConfiguration());
        h4.m(false, false);
    }

    @Override // h0.E, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i6, keyEvent);
        }
        return true;
    }

    @Override // h0.E, d.AbstractActivityC0638s, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        Intent intentE;
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        H h4 = (H) k();
        h4.z();
        U u5 = h4.f9175K;
        if (menuItem.getItemId() == 16908332 && u5 != null && (((i1) u5.f9263r).f10284b & 4) != 0 && (intentE = M4.B.e(this)) != null) {
            if (!shouldUpRecreateTask(intentE)) {
                navigateUpTo(intentE);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentE2 = M4.B.e(this);
            if (intentE2 == null) {
                intentE2 = M4.B.e(this);
            }
            if (intentE2 != null) {
                ComponentName component = intentE2.getComponent();
                if (component == null) {
                    component = intentE2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent intentF = M4.B.f(this, component);
                        if (intentF == null) {
                            break;
                        }
                        arrayList.add(size, intentF);
                        component = intentF.getComponent();
                    } catch (PackageManager.NameNotFoundException e6) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e6);
                    }
                }
                arrayList.add(intentE2);
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = E.f.f379a;
            startActivities(intentArr, null);
            try {
                int i7 = AbstractC0005f.f190b;
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i6, Menu menu) {
        return super.onMenuOpened(i6, menu);
    }

    @Override // d.AbstractActivityC0638s, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i6, Menu menu) {
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((H) k()).v();
    }

    @Override // h0.E, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        H h4 = (H) k();
        h4.z();
        U u5 = h4.f9175K;
        if (u5 != null) {
            u5.f9254G = true;
        }
    }

    @Override // h0.E, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        super.onStart();
        ((H) k()).m(true, false);
    }

    @Override // h0.E, android.app.Activity
    public final void onStop() {
        super.onStop();
        H h4 = (H) k();
        h4.z();
        U u5 = h4.f9175K;
        if (u5 != null) {
            u5.f9254G = false;
            k.l lVar = u5.f9253F;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i6) {
        super.onTitleChanged(charSequence, i6);
        k().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((H) k()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i6) {
        l();
        k().g(i6);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        super.setTheme(i6);
        ((H) k()).f9207q0 = i6;
    }

    @Override // d.AbstractActivityC0638s, android.app.Activity
    public void setContentView(View view) {
        l();
        k().h(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        k().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
