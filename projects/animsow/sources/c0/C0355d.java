package c0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: c0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0355d extends C0354c {
    @Override // B3.e
    public final Signature[] s(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
