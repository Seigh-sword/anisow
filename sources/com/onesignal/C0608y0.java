package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0608y0 extends AbstractC0571l1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0611z0 f8069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A0 f8070i;

    public /* synthetic */ C0608y0(A0 a02, C0561i0 c0561i0, int i6) {
        this.f8068g = i6;
        this.f8070i = a02;
        this.f8069h = c0561i0;
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void H(int i6, String str, Throwable th) {
        int i7 = this.f8068g;
        InterfaceC0611z0 interfaceC0611z0 = this.f8069h;
        A0 a02 = this.f8070i;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                A0.b(a02, "html", i6, str);
                JSONObject jSONObject = new JSONObject();
                int[] iArr = OSUtils.f7658a;
                int i8 = 0;
                while (true) {
                    try {
                        if (i8 >= 5) {
                            int i9 = a02.f7463d;
                            if (i9 < 3) {
                                a02.f7463d = i9 + 1;
                                jSONObject.put("retry", true);
                            }
                        } else if (i6 != iArr[i8]) {
                            i8++;
                        }
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                }
                a02.f7463d = 0;
                jSONObject.put("retry", false);
                interfaceC0611z0.d(jSONObject.toString());
                break;
            default:
                A0.b(a02, "html", i6, str);
                interfaceC0611z0.d(str);
                break;
        }
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void I(String str) {
        int i6 = this.f8068g;
        InterfaceC0611z0 interfaceC0611z0 = this.f8069h;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                this.f8070i.f7463d = 0;
                interfaceC0611z0.a(str);
                break;
            default:
                interfaceC0611z0.a(str);
                break;
        }
    }
}
