package com.bumptech.glide;

import android.content.SharedPreferences;
import android.os.Trace;
import h1.C0763c;
import h1.C0765e;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import l3.C0941d;
import m2.Y;
import p3.C1251c;
import t0.AbstractC1332d;
import w1.C1471o;
import w1.InterfaceC1472p;

/* JADX INFO: loaded from: classes.dex */
public final class k implements C1.g, InterfaceC1472p {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f6357x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f6358y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f6359z;

    public k(U1.i iVar, C1471o c1471o) {
        this.f6359z = new P0.e(1, this);
        this.f6358y = iVar;
        this.f6357x = c1471o;
    }

    @Override // C1.g
    public final Object a() {
        if (this.f6356w) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f6356w = true;
        try {
            return AbstractC1332d.t((b) this.f6357x, (List) this.f6358y, (d) this.f6359z);
        } finally {
            this.f6356w = false;
            Trace.endSection();
        }
    }

    public final void b() {
        C0765e.b((C0765e) this.f6359z, this, false);
    }

    public final File c() {
        File file;
        synchronized (((C0765e) this.f6359z)) {
            try {
                Object obj = this.f6357x;
                if (((C0763c) obj).f8946f != this) {
                    throw new IllegalStateException();
                }
                if (!((C0763c) obj).f8945e) {
                    ((boolean[]) this.f6358y)[0] = true;
                }
                file = ((C0763c) obj).f8944d[0];
                ((C0765e) this.f6359z).f8964w.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public final String d() {
        if (!this.f6356w) {
            this.f6356w = true;
            this.f6358y = ((Y) this.f6359z).A().getString((String) this.f6357x, null);
        }
        return (String) this.f6358y;
    }

    public final void e(String str) {
        SharedPreferences.Editor editorEdit = ((Y) this.f6359z).A().edit();
        editorEdit.putString((String) this.f6357x, str);
        editorEdit.apply();
        this.f6358y = str;
    }

    public k(b bVar, List list, d dVar) {
        this.f6357x = bVar;
        this.f6358y = list;
        this.f6359z = dVar;
    }

    public k(C0765e c0765e, C0763c c0763c) {
        this.f6359z = c0765e;
        this.f6357x = c0763c;
        this.f6358y = c0763c.f8945e ? null : new boolean[c0765e.f8956C];
    }

    public k(Y y5, String str) {
        this.f6359z = y5;
        AbstractC1332d.g(str);
        this.f6357x = str;
    }

    public k(C1251c c1251c, boolean z5) {
        this.f6359z = c1251c;
        this.f6358y = new AtomicReference(null);
        this.f6356w = z5;
        this.f6357x = new AtomicMarkableReference(new C0941d(z5 ? 8192 : 1024), false);
    }
}
