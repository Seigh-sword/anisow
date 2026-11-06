package com.onesignal;

/* JADX INFO: renamed from: com.onesignal.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0590s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7968a;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("OSInAppMessagePrompt{key=");
        switch (((C0596u0) this).f7982b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                str = "push";
                break;
            default:
                str = "location";
                break;
        }
        sb.append(str);
        sb.append(" prompted=");
        sb.append(this.f7968a);
        sb.append('}');
        return sb.toString();
    }
}
