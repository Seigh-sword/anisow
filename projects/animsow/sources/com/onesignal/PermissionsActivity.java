package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.xo.anilab.R;
import d.AbstractC0628i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class PermissionsActivity extends Activity {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static boolean f7670A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final HashMap f7671B = new HashMap();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f7672y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f7673z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f7674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f7675x;

    public final void a(Bundle bundle) {
        String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(string);
            this.f7674w = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
            String string2 = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
            this.f7675x = string2;
            if (f7672y) {
                return;
            }
            f7672y = true;
            f7670A = true ^ AbstractC0571l1.T(this, string2);
            requestPermissions(new String[]{string2}, 2);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(AbstractC0628i.q("Could not find callback class for PermissionActivity: ", string));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0603w1.B(this);
        a(getIntent().getExtras());
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent.getExtras());
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        f7672y = false;
        if (i6 == 2) {
            new Handler().postDelayed(new RunnableC0570l0(this, 10, iArr), 500L);
        }
        if (C0554g.f7812x != null) {
            C0548e.f7785d.remove("com.onesignal.PermissionsActivity");
        }
        finish();
        overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }
}
