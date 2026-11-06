package com.onesignal;

import android.webkit.ValueCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l2 implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2 f7882a;

    public l2(k2 k2Var) {
        this.f7882a = k2Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        k2 k2Var = this.f7882a;
        try {
            p2 p2Var = k2Var.f7862x;
            k2Var.f7862x.i(Integer.valueOf(p2.e(p2Var, p2Var.f7941d, new JSONObject(str))));
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }
}
