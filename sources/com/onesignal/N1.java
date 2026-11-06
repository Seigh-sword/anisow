package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public final class N1 extends AbstractC0542c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f7650c;

    public N1(String str, String str2, Class cls) {
        this.f7648a = str;
        this.f7649b = str2;
        this.f7650c = cls;
    }

    @Override // com.onesignal.AbstractC0542c
    public final void a(Activity activity) {
        if (activity.getClass().equals(PermissionsActivity.class)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
        intent.setFlags(131072);
        intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.f7648a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.f7649b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.f7650c.getName());
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }
}
