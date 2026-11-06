package c0;

import android.os.Handler;
import android.os.Looper;
import d2.AbstractC0651b;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.C1281c;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f6122j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile l f6123k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f6124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1281c f6125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f6126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f6127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0358g f6128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f6129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P2.e f6130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0356e f6132i;

    public l(z zVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6124a = reentrantReadWriteLock;
        this.f6126c = 3;
        this.f6129f = zVar.f6119a;
        int i6 = zVar.f6120b;
        this.f6131h = i6;
        this.f6132i = zVar.f6121c;
        this.f6127d = new Handler(Looper.getMainLooper());
        this.f6125b = new C1281c(0);
        this.f6130g = new P2.e();
        C0358g c0358g = new C0358g(17, this);
        this.f6128e = c0358g;
        reentrantReadWriteLock.writeLock().lock();
        if (i6 == 0) {
            try {
                this.f6126c = 0;
            } catch (Throwable th) {
                this.f6124a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            c0358g.H();
        }
    }

    public static l a() {
        l lVar;
        synchronized (f6122j) {
            try {
                lVar = f6123k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public final int b() {
        this.f6124a.readLock().lock();
        try {
            return this.f6126c;
        } finally {
            this.f6124a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f6131h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f6124a.writeLock().lock();
        try {
            if (this.f6126c == 0) {
                return;
            }
            this.f6126c = 0;
            this.f6124a.writeLock().unlock();
            this.f6128e.H();
        } finally {
            this.f6124a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f6124a.writeLock().lock();
        try {
            this.f6126c = 2;
            arrayList.addAll(this.f6125b);
            this.f6125b.clear();
            this.f6124a.writeLock().unlock();
            this.f6127d.post(new c.d(arrayList, this.f6126c, th));
        } catch (Throwable th2) {
            this.f6124a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f6124a.writeLock().lock();
        try {
            this.f6126c = 1;
            arrayList.addAll(this.f6125b);
            this.f6125b.clear();
            this.f6124a.writeLock().unlock();
            this.f6127d.post(new c.d(this.f6126c, arrayList));
        } catch (Throwable th) {
            this.f6124a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(int i6, int i7, CharSequence charSequence) {
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC0651b.d("start should be <= than end", i6 <= i7);
        if (charSequence == null) {
            return null;
        }
        AbstractC0651b.d("start should be < than charSequence length", i6 <= charSequence.length());
        AbstractC0651b.d("end should be < than charSequence length", i7 <= charSequence.length());
        return (charSequence.length() == 0 || i6 == i7) ? charSequence : this.f6128e.I(charSequence, i6, i7, false);
    }

    public final void g(j jVar) {
        AbstractC0651b.f(jVar, "initCallback cannot be null");
        this.f6124a.writeLock().lock();
        try {
            if (this.f6126c == 1 || this.f6126c == 2) {
                this.f6127d.post(new c.d(jVar, this.f6126c));
            } else {
                this.f6125b.add(jVar);
            }
            this.f6124a.writeLock().unlock();
        } catch (Throwable th) {
            this.f6124a.writeLock().unlock();
            throw th;
        }
    }
}
