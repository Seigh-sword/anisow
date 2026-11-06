package m2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10757d;

    public S(long j6, Bundle bundle, String str, String str2) {
        this.f10755b = str;
        this.f10756c = str2;
        this.f10757d = bundle;
        this.f10754a = j6;
    }

    public static S b(C1076v c1076v) {
        String str = c1076v.f11113w;
        return new S(c1076v.f11116z, c1076v.f11114x.c(), str, c1076v.f11115y);
    }

    public final C1076v a() {
        return new C1076v((String) this.f10755b, new C1074u(new Bundle((Bundle) this.f10757d)), (String) this.f10756c, this.f10754a);
    }

    public final String toString() {
        return "origin=" + ((String) this.f10756c) + ",name=" + ((String) this.f10755b) + ",params=" + String.valueOf((Bundle) this.f10757d);
    }
}
