package c0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.google.firebase.messaging.FirebaseMessaging;
import d0.C0646a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import o0.d1;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6157e;

    public v() {
        this.f6154b = d1.f11914y;
        this.f6155c = null;
        this.f6156d = new ReentrantLock();
        this.f6157e = new ArrayList();
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z5) {
        F[] fArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (fArr = (F[]) editable.getSpans(selectionStart, selectionEnd, F.class)) != null && fArr.length > 0) {
            for (F f6 : fArr) {
                int spanStart = editable.getSpanStart(f6);
                int spanEnd = editable.getSpanEnd(f6);
                if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i6, int i7, E e6) {
        if ((e6.f6105c & 3) == 0) {
            i iVar = (i) this.f6156d;
            C0646a c0646aC = e6.c();
            int iA = c0646aC.a(8);
            if (iA != 0) {
                c0646aC.f8160b.getShort(iA + c0646aC.f8159a);
            }
            C0356e c0356e = (C0356e) iVar;
            c0356e.getClass();
            ThreadLocal threadLocal = C0356e.f6114b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i6 < i7) {
                sb.append(charSequence.charAt(i6));
                i6++;
            }
            TextPaint textPaint = c0356e.f6115a;
            String string = sb.toString();
            int i8 = G.e.f645a;
            boolean zA = G.d.a(textPaint, string);
            int i9 = e6.f6105c & 4;
            e6.f6105c = zA ? i9 | 2 : i9 | 1;
        }
        return (e6.f6105c & 3) == 2;
    }

    public final synchronized void c() {
        try {
            if (this.f6153a) {
                return;
            }
            Boolean boolG = g();
            this.f6156d = boolG;
            if (boolG == null) {
                A3.a aVar = new A3.a(this) { // from class: J3.o
                };
                this.f6155c = aVar;
                d3.l lVar = (d3.l) ((A3.c) this.f6154b);
                lVar.a(lVar.f8209c, aVar);
            }
            this.f6153a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d() {
        Object obj = this.f6157e;
        if (this.f6153a) {
            return false;
        }
        ReentrantLock reentrantLock = (ReentrantLock) this.f6156d;
        try {
            reentrantLock.lock();
            if (this.f6153a) {
                return false;
            }
            this.f6153a = true;
            List listK0 = t4.n.k0((List) obj);
            ((List) obj).clear();
            reentrantLock.unlock();
            C4.l lVar = (C4.l) this.f6154b;
            Iterator it = listK0.iterator();
            while (it.hasNext()) {
                lVar.j(it.next());
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final synchronized boolean e() {
        Object obj;
        try {
            c();
            obj = this.f6156d;
        } catch (Throwable th) {
            throw th;
        }
        return ((Boolean) obj) != null ? ((Boolean) obj).booleanValue() : ((FirebaseMessaging) this.f6157e).f7440a.h();
    }

    public final Object f(CharSequence charSequence, int i6, int i7, int i8, boolean z5, s sVar) {
        int i9;
        char c6;
        u uVar = new u((C0351B) ((P0.h) this.f6155c).f2409c, this.f6153a, (int[]) this.f6157e);
        int iCodePointAt = Character.codePointAt(charSequence, i6);
        boolean zB = true;
        int i10 = 0;
        int iCharCount = i6;
        loop0: while (true) {
            i9 = iCharCount;
            while (iCharCount < i7 && i10 < i8 && zB) {
                SparseArray sparseArray = uVar.f6147c.f6096a;
                C0351B c0351b = sparseArray == null ? null : (C0351B) sparseArray.get(iCodePointAt);
                if (uVar.f6145a == 2) {
                    if (c0351b != null) {
                        uVar.f6147c = c0351b;
                        uVar.f6150f++;
                    } else {
                        if (iCodePointAt != 65038) {
                            if (iCodePointAt != 65039) {
                                C0351B c0351b2 = uVar.f6147c;
                                if (c0351b2.f6097b != null) {
                                    if (uVar.f6150f == 1) {
                                        if (uVar.b()) {
                                            c0351b2 = uVar.f6147c;
                                        }
                                    }
                                    uVar.f6148d = c0351b2;
                                    uVar.a();
                                    c6 = 3;
                                }
                            }
                        }
                        uVar.a();
                        c6 = 1;
                    }
                    c6 = 2;
                } else if (c0351b == null) {
                    uVar.a();
                    c6 = 1;
                } else {
                    uVar.f6145a = 2;
                    uVar.f6147c = c0351b;
                    uVar.f6150f = 1;
                    c6 = 2;
                }
                uVar.f6149e = iCodePointAt;
                if (c6 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i9)) + i9;
                    if (iCharCount < i7) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c6 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i7) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c6 == 3) {
                    if (z5 || !b(charSequence, i9, iCharCount, uVar.f6148d.f6097b)) {
                        zB = sVar.b(charSequence, i9, iCharCount, uVar.f6148d.f6097b);
                        i10++;
                    }
                }
            }
            break loop0;
        }
        if (uVar.f6145a == 2 && uVar.f6147c.f6097b != null && ((uVar.f6150f > 1 || uVar.b()) && i10 < i8 && zB && (z5 || !b(charSequence, i9, iCharCount, uVar.f6147c.f6097b)))) {
            sVar.b(charSequence, i9, iCharCount, uVar.f6147c.f6097b);
        }
        return sVar.a();
    }

    public final Boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Y2.g gVar = ((FirebaseMessaging) this.f6157e).f7440a;
        gVar.a();
        Context context = gVar.f4816a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public v(P0.h hVar, P2.e eVar, C0356e c0356e, Set set) {
        this.f6154b = eVar;
        this.f6155c = hVar;
        this.f6156d = c0356e;
        this.f6153a = false;
        this.f6157e = null;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            f(str, 0, str.length(), 1, true, new t(str));
        }
    }

    public v(FirebaseMessaging firebaseMessaging, A3.c cVar) {
        this.f6157e = firebaseMessaging;
        this.f6154b = cVar;
    }
}
