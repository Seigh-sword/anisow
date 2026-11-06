package t0;

import android.content.res.AssetManager;
import android.os.Build;
import d.RunnableC0634o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import n.ExecutorC1138a;

/* JADX INFO: renamed from: t0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1329a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f12675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1331c f12676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f12678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12680f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1330b[] f12681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f12682h;

    public C1329a(AssetManager assetManager, ExecutorC1138a executorC1138a, InterfaceC1331c interfaceC1331c, String str, File file) {
        this.f12675a = executorC1138a;
        this.f12676b = interfaceC1331c;
        this.f12679e = str;
        this.f12678d = file;
        int i6 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i6 <= 34) {
            switch (i6) {
                case 24:
                case 25:
                    bArr = AbstractC1332d.f12699h;
                    break;
                case 26:
                    bArr = AbstractC1332d.f12698g;
                    break;
                case 27:
                    bArr = AbstractC1332d.f12697f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC1332d.f12696e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC1332d.f12695d;
                    break;
            }
        }
        this.f12677c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f12676b.h();
            }
            return null;
        }
    }

    public final void b(int i6, Serializable serializable) {
        this.f12675a.execute(new RunnableC0634o(i6, 2, this, serializable));
    }
}
