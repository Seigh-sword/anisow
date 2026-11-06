package com.onesignal;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.WebView;
import d.AbstractC0628i;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends AbstractC0542c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7936k = AbstractC0565j1.b(24);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static p2 f7937l = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0568k1 f7939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f7940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f7941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0585q0 f7942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0552f0 f7943f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f7938a = new j2(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7944g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f7945h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7946i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7947j = false;

    public p2(Activity activity, C0552f0 c0552f0, C0585q0 c0585q0) {
        this.f7942e = c0585q0;
        this.f7941d = activity;
        this.f7943f = c0552f0;
    }

    public static void c(p2 p2Var, Activity activity, String str, boolean z5) {
        p2Var.getClass();
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        if (enumC0600v1.compareTo(AbstractC0603w1.f8036f) < 1 || enumC0600v1.compareTo(AbstractC0603w1.f8038g) < 1) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C0568k1 c0568k1 = new C0568k1(activity);
        p2Var.f7939b = c0568k1;
        c0568k1.setOverScrollMode(2);
        p2Var.f7939b.setVerticalScrollBarEnabled(false);
        p2Var.f7939b.setHorizontalScrollBarEnabled(false);
        p2Var.f7939b.getSettings().setJavaScriptEnabled(true);
        p2Var.f7939b.addJavascriptInterface(new m2(p2Var), "OSAndroid");
        if (z5) {
            p2Var.f7939b.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                p2Var.f7939b.setFitsSystemWindows(false);
            }
        }
        AbstractC0565j1.a(activity, new RunnableC0576n0(p2Var, activity, str));
    }

    public static void d(p2 p2Var, Activity activity) {
        int iWidth;
        C0568k1 c0568k1 = p2Var.f7939b;
        boolean z5 = p2Var.f7943f.f7805d;
        int i6 = f7936k;
        if (z5) {
            iWidth = activity.getWindow().getDecorView().getWidth();
        } else {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            iWidth = rect.width() - (i6 * 2);
        }
        c0568k1.layout(0, 0, iWidth, AbstractC0565j1.d(activity) - (p2Var.f7943f.f7805d ? 0 : i6 * 2));
    }

    public static int e(p2 p2Var, Activity activity, JSONObject jSONObject) {
        p2Var.getClass();
        try {
            int iB = AbstractC0565j1.b(jSONObject.getJSONObject("rect").getInt("height"));
            EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
            AbstractC0603w1.b(enumC0600v1, "getPageHeightData:pxHeight: " + iB, null);
            int iD = AbstractC0565j1.d(activity) - (p2Var.f7943f.f7805d ? 0 : f7936k * 2);
            if (iB <= iD) {
                return iB;
            }
            AbstractC0603w1.b(enumC0600v1, "getPageHeightData:pxHeight is over screen max: " + iD, null);
            return iD;
        } catch (JSONException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "pageRectToViewHeight could not get page height", e6);
            return -1;
        }
    }

    public static void g(Activity activity, C0552f0 c0552f0, C0585q0 c0585q0) {
        if (c0552f0.f7805d) {
            String str = c0552f0.f7802a;
            int[] iArrC = AbstractC0565j1.c(activity);
            c0552f0.f7802a = AbstractC0628i.i(str, AbstractC0628i.j("\n\n<script>\n    setSafeAreaInsets(", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrC[0]), Integer.valueOf(iArrC[1]), Integer.valueOf(iArrC[2]), Integer.valueOf(iArrC[3])), ");\n</script>"));
        }
        try {
            String strEncodeToString = Base64.encodeToString(c0552f0.f7802a.getBytes("UTF-8"), 2);
            p2 p2Var = new p2(activity, c0552f0, c0585q0);
            f7937l = p2Var;
            OSUtils.u(new P0(p2Var, activity, strEncodeToString, c0552f0));
        } catch (UnsupportedEncodingException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "Catch on initInAppMessage: ", e6);
            e6.printStackTrace();
        }
    }

    public static void h(C0585q0 c0585q0, C0552f0 c0552f0) {
        Activity activityJ = AbstractC0603w1.j();
        AbstractC0603w1.b(EnumC0600v1.f7992B, "in app message showMessageContent on currentActivity: " + activityJ, null);
        if (activityJ == null) {
            Looper.prepare();
            new Handler().postDelayed(new RunnableC0570l0(c0585q0, c0552f0, 11), 200L);
            return;
        }
        p2 p2Var = f7937l;
        if (p2Var == null || !c0585q0.f7961k) {
            g(activityJ, c0552f0, c0585q0);
            return;
        }
        C0584q c0584q = new C0584q();
        c0584q.f7948w = activityJ;
        c0584q.f7949x = c0585q0;
        c0584q.f7950y = c0552f0;
        p2Var.f(c0584q);
    }

    @Override // com.onesignal.AbstractC0542c
    public final void a(Activity activity) {
        String str = this.f7944g;
        this.f7941d = activity;
        this.f7944g = activity.getLocalClassName();
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        AbstractC0603w1.b(enumC0600v1, "In app message activity available currentActivityName: " + this.f7944g + " lastActivityName: " + str, null);
        if (str == null) {
            i(null);
            return;
        }
        if (!str.equals(this.f7944g)) {
            if (this.f7947j) {
                return;
            }
            F f6 = this.f7940c;
            if (f6 != null) {
                f6.g();
            }
            i(this.f7945h);
            return;
        }
        F f7 = this.f7940c;
        if (f7 == null) {
            return;
        }
        if (f7.f7538p == o2.f7926x && !this.f7943f.f7805d) {
            i(null);
        } else {
            AbstractC0603w1.b(enumC0600v1, "In app message new activity, calculate height and show ", null);
            AbstractC0565j1.a(this.f7941d, new k2(this, 1));
        }
    }

    @Override // com.onesignal.AbstractC0542c
    public final void b(Activity activity) {
        AbstractC0603w1.b(EnumC0600v1.f7992B, "In app message activity stopped, cleaning views, currentActivityName: " + this.f7944g + "\nactivity: " + this.f7941d + "\nmessageView: " + this.f7940c, null);
        if (this.f7940c == null || !activity.getLocalClassName().equals(this.f7944g)) {
            return;
        }
        this.f7940c.g();
    }

    public final void f(C0584q c0584q) {
        if (this.f7940c == null || this.f7946i) {
            if (c0584q != null) {
                c0584q.b();
            }
        } else {
            if (this.f7942e != null) {
                AbstractC0603w1.q().f7906g.getClass();
                C0594t1.h("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
            }
            this.f7940c.e(new X1(this, 18, c0584q));
            this.f7946i = true;
        }
    }

    public final void i(Integer num) {
        synchronized (this.f7938a) {
            try {
                if (this.f7940c == null) {
                    AbstractC0603w1.b(EnumC0600v1.f7998z, "No messageView found to update a with a new height.", null);
                    return;
                }
                AbstractC0603w1.b(EnumC0600v1.f7992B, "In app message, showing first one with height: " + num, null);
                F f6 = this.f7940c;
                C0568k1 c0568k1 = this.f7939b;
                f6.f7539q = c0568k1;
                c0568k1.setBackgroundColor(0);
                if (num != null) {
                    this.f7945h = num;
                    F f7 = this.f7940c;
                    int iIntValue = num.intValue();
                    f7.f7527e = iIntValue;
                    OSUtils.u(new Q0.e(iIntValue, 4, f7));
                }
                this.f7940c.d(this.f7941d);
                F f8 = this.f7940c;
                if (f8.f7534l) {
                    f8.f7534l = false;
                    f8.f(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
