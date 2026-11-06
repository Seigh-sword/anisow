package j3;

import a3.C0261b;
import android.util.Log;
import b3.C0343c;
import d.C0617E;
import g3.C0730b;
import g3.C0731c;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import k3.C0897c;
import k3.C0898d;
import k3.C0899e;
import p3.C1251c;
import r3.C1276b;

/* JADX INFO: renamed from: j3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0865o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9507b;

    public /* synthetic */ CallableC0865o(int i6, Object obj) {
        this.f9506a = i6;
        this.f9507b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6 = this.f9506a;
        Object obj = this.f9507b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0863m c0863m = ((C0868r) obj).f9519g;
                c0863m.getClass();
                C0899e.a();
                C0261b c0261b = c0863m.f9488c;
                C1251c c1251c = (C1251c) c0261b.f5012y;
                String str = (String) c0261b.f5011x;
                c1251c.getClass();
                boolean zExists = new File((File) c1251c.f12320d, str).exists();
                boolean z5 = true;
                if (zExists) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    C1251c c1251c2 = (C1251c) c0261b.f5012y;
                    String str2 = (String) c0261b.f5011x;
                    c1251c2.getClass();
                    new File((File) c1251c2.f12320d, str2).delete();
                } else {
                    String strE = c0863m.e();
                    if (strE == null || !((C0730b) c0863m.f9495j).c(strE)) {
                        z5 = false;
                    }
                }
                return Boolean.valueOf(z5);
            default:
                J0.l lVar = ((C1276b) obj).f12480x;
                C0343c c0343c = (C0343c) lVar.f1221g;
                r3.d dVar = (r3.d) lVar.f1217c;
                c0343c.getClass();
                C0898d.a(new C0617E(6, C0899e.f9654d), C0897c.f9652z);
                try {
                    HashMap mapO = C0343c.o(dVar);
                    C0343c c0343cI = c0343c.i(mapO);
                    C0343c.e(c0343cI, dVar);
                    ((C0731c) c0343c.f5932y).c("Requesting settings from " + ((String) c0343c.f5930w));
                    ((C0731c) c0343c.f5932y).g("Settings query params were: " + mapO);
                    return c0343c.q(c0343cI.l());
                } catch (IOException e6) {
                    ((C0731c) c0343c.f5932y).d("Settings request failed.", e6);
                    return null;
                }
        }
    }
}
