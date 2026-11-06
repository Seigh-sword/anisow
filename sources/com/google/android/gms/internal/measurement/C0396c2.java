package com.google.android.gms.internal.measurement;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.onesignal.C0544c1;
import com.onesignal.C0579o0;
import h.AbstractC0732a;
import h0.AbstractComponentCallbacksC0734B;
import h0.DialogInterfaceOnCancelListenerC0756v;
import i.C0803c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.C0932f;
import l1.InterfaceC0933g;
import m1.C1004b;
import m1.C1005c;
import m1.C1008f;
import m1.C1010h;
import m1.InterfaceC1006d;
import m1.InterfaceC1012j;
import m1.InterfaceC1013k;
import n1.C1146b;
import n1.C1152h;
import p1.C1234C;
import r.C1267a;
import r1.AbstractC1272a;
import s1.C1295d;
import s4.AbstractC1305a;
import s4.C1311g;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0396c2 implements InterfaceC0390b2, A0.e, I0.u, j1.h, com.bumptech.glide.load.data.d, InterfaceC1012j, j1.p, s1.q {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static C0396c2 f6773z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6774w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f6775x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f6776y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0396c2() {
        this((Object) null);
        this.f6774w = 11;
    }

    public static String F(int i6, int i7, Bitmap.Config config) {
        return "[" + i6 + "x" + i7 + "], " + config;
    }

    public static synchronized void S() {
        try {
            C0396c2 c0396c2 = f6773z;
            if (c0396c2 != null) {
                Object obj = c0396c2.f6775x;
                if (((Context) obj) != null && ((ContentObserver) c0396c2.f6776y) != null) {
                    ((Context) obj).getContentResolver().unregisterContentObserver((ContentObserver) f6773z.f6776y);
                }
            }
            f6773z = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static s1.D o(ImageDecoder.Source source, int i6, int i7, j1.m mVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new r1.c(i6, i7, mVar));
        if (AbstractC1272a.o(drawableDecodeDrawable)) {
            return new s1.D(2, AbstractC1272a.f(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public final void A(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.A(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void B(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.B(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void C(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, View view, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractC1305a.o(view, "v");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.C(abstractComponentCallbacksC0734B, view, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void D(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.D(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final Object E(InterfaceC1013k interfaceC1013k) {
        C1008f c1008f = (C1008f) ((Map) this.f6776y).get(interfaceC1013k);
        if (c1008f == null) {
            c1008f = new C1008f(interfaceC1013k);
            ((Map) this.f6776y).put(interfaceC1013k, c1008f);
        } else {
            interfaceC1013k.a();
        }
        C1008f c1008f2 = c1008f.f10447d;
        c1008f2.f10446c = c1008f.f10446c;
        c1008f.f10446c.f10447d = c1008f2;
        C1008f c1008f3 = (C1008f) this.f6775x;
        c1008f.f10447d = c1008f3;
        C1008f c1008f4 = c1008f3.f10446c;
        c1008f.f10446c = c1008f4;
        c1008f4.f10447d = c1008f;
        c1008f.f10447d.f10446c = c1008f;
        ArrayList arrayList = c1008f.f10445b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c1008f.f10445b.remove(size - 1);
        }
        return null;
    }

    public final KeyListener G(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((P2.e) ((e0.b) this.f6776y).f8233c).i(keyListener) : keyListener;
    }

    public final boolean H() {
        return ((C1267a) this.f6776y).getPreventCornerOverlap();
    }

    public final String I(j1.i iVar) {
        String str;
        synchronized (((C1.j) this.f6775x)) {
            str = (String) ((C1.j) this.f6775x).a(iVar);
        }
        if (str == null) {
            Object objH = ((M.b) this.f6776y).h();
            AbstractC1332d.l(objH, "Argument must not be null");
            C1152h c1152h = (C1152h) objH;
            try {
                iVar.b(c1152h.f11696w);
                byte[] bArrDigest = c1152h.f11696w.digest();
                char[] cArr = C1.n.f135b;
                synchronized (cArr) {
                    for (int i6 = 0; i6 < bArrDigest.length; i6++) {
                        byte b6 = bArrDigest[i6];
                        int i7 = i6 * 2;
                        char[] cArr2 = C1.n.f134a;
                        cArr[i7] = cArr2[(b6 & 255) >>> 4];
                        cArr[i7 + 1] = cArr2[b6 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((M.b) this.f6776y).d(c1152h);
            }
        }
        synchronized (((C1.j) this.f6775x)) {
            ((C1.j) this.f6775x).d(iVar, str);
        }
        return str;
    }

    public final void J(AttributeSet attributeSet, int i6) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f6775x).getContext().obtainStyledAttributes(attributeSet, AbstractC0732a.f8571i, i6, 0);
        try {
            boolean z5 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((P2.e) ((e0.b) this.f6776y).f8233c).n(z5);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection K(InputConnection inputConnection, EditorInfo editorInfo) {
        e0.b bVar = (e0.b) this.f6776y;
        if (inputConnection != null) {
            return ((P2.e) bVar.f8233c).l(inputConnection, editorInfo);
        }
        bVar.getClass();
        return null;
    }

    public final void L(K.f fVar) {
        int i6 = fVar.f1482b;
        if (i6 != 0) {
            ((Handler) this.f6776y).post(new c.d(this, (L3.c) this.f6775x, i6, 3));
        } else {
            L3.c cVar = (L3.c) this.f6775x;
            ((Handler) this.f6776y).post(new K.a(this, cVar, fVar.f1481a, 0));
        }
    }

    public final void M(InterfaceC1013k interfaceC1013k, Object obj) {
        C1008f c1008f = (C1008f) ((Map) this.f6776y).get(interfaceC1013k);
        if (c1008f == null) {
            c1008f = new C1008f(interfaceC1013k);
            c1008f.f10446c = c1008f;
            c1008f.f10447d = c1008f;
            C1008f c1008f2 = (C1008f) this.f6775x;
            c1008f.f10447d = c1008f2.f10447d;
            c1008f.f10446c = c1008f2;
            c1008f2.f10447d = c1008f;
            c1008f.f10447d.f10446c = c1008f;
            ((Map) this.f6776y).put(interfaceC1013k, c1008f);
        } else {
            interfaceC1013k.a();
        }
        if (c1008f.f10445b == null) {
            c1008f.f10445b = new ArrayList();
        }
        c1008f.f10445b.add(obj);
    }

    public final void N(String str) {
        C1146b c1146b;
        synchronized (this) {
            try {
                Object obj = ((Map) this.f6775x).get(str);
                AbstractC1332d.l(obj, "Argument must not be null");
                c1146b = (C1146b) obj;
                int i6 = c1146b.f11686b;
                if (i6 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c1146b.f11686b);
                }
                int i7 = i6 - 1;
                c1146b.f11686b = i7;
                if (i7 == 0) {
                    C1146b c1146b2 = (C1146b) ((Map) this.f6775x).remove(str);
                    if (!c1146b2.equals(c1146b)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c1146b + ", but actually removed: " + c1146b2 + ", safeKey: " + str);
                    }
                    L3.c cVar = (L3.c) this.f6776y;
                    synchronized (((Queue) cVar.f1734x)) {
                        try {
                            if (((Queue) cVar.f1734x).size() < 10) {
                                ((Queue) cVar.f1734x).offer(c1146b2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c1146b.f11685a.unlock();
    }

    public final Object O() {
        C1008f c1008f = (C1008f) this.f6775x;
        while (true) {
            c1008f = c1008f.f10447d;
            if (c1008f.equals((C1008f) this.f6775x)) {
                return null;
            }
            ArrayList arrayList = c1008f.f10445b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c1008f.f10445b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C1008f c1008f2 = c1008f.f10447d;
            c1008f2.f10446c = c1008f.f10446c;
            c1008f.f10446c.f10447d = c1008f2;
            Map map = (Map) this.f6776y;
            Object obj = c1008f.f10444a;
            map.remove(obj);
            ((InterfaceC1013k) obj).a();
        }
    }

    public final void P(Boolean bool) {
        P4.q0 q0Var = (P4.q0) ((P4.W) this.f6775x);
        q0Var.l(new C1311g(Integer.valueOf(((Number) ((C1311g) q0Var.getValue()).f12632w).intValue() + 1), bool));
    }

    public final void Q(int i6, int i7, int i8, int i9) {
        ((C1267a) this.f6776y).f12406z.set(i6, i7, i8, i9);
        Object obj = this.f6776y;
        super/*android.view.View*/.setPadding(i6 + ((C1267a) obj).f12405y.left, i7 + ((C1267a) obj).f12405y.top, i8 + ((C1267a) obj).f12405y.right, i9 + ((C1267a) obj).f12405y.bottom);
    }

    public final void R(com.bumptech.glide.d dVar) {
        ((androidx.lifecycle.E) this.f6775x).f(dVar);
        if (dVar instanceof I0.t) {
            ((T0.i) this.f6776y).j((I0.t) dVar);
        } else if (dVar instanceof I0.r) {
            ((T0.i) this.f6776y).k(((I0.r) dVar).f1109n);
        }
    }

    @Override // m1.InterfaceC1012j
    public final Bitmap a(int i6, int i7, Bitmap.Config config) {
        C1005c c1005c = (C1005c) this.f6775x;
        InterfaceC1013k interfaceC1013kS = (InterfaceC1013k) ((Queue) c1005c.f1668w).poll();
        if (interfaceC1013kS == null) {
            interfaceC1013kS = c1005c.s();
        }
        C1004b c1004b = (C1004b) interfaceC1013kS;
        c1004b.f10439b = i6;
        c1004b.f10440c = i7;
        c1004b.f10441d = config;
        return (Bitmap) ((C0396c2) this.f6776y).E(c1004b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0390b2
    public final Object b(String str) {
        Object objL;
        if (((Context) this.f6775x) == null || (!W1.a(r0))) {
            return null;
        }
        try {
            try {
                C1358b c1358b = new C1358b(this, 21, str);
                try {
                    objL = c1358b.l();
                } catch (SecurityException unused) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        objL = c1358b.l();
                    } finally {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                }
                return (String) objL;
            } catch (SecurityException e6) {
                e = e6;
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
                return null;
            }
        } catch (IllegalStateException e7) {
            e = e7;
            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            return null;
        }
    }

    @Override // m1.InterfaceC1012j
    public final int c(Bitmap bitmap) {
        return C1.n.c(bitmap);
    }

    @Override // m1.InterfaceC1012j
    public final void d(Bitmap bitmap) {
        C1005c c1005c = (C1005c) this.f6775x;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        InterfaceC1013k interfaceC1013kS = (InterfaceC1013k) ((Queue) c1005c.f1668w).poll();
        if (interfaceC1013kS == null) {
            interfaceC1013kS = c1005c.s();
        }
        C1004b c1004b = (C1004b) interfaceC1013kS;
        c1004b.f10439b = width;
        c1004b.f10440c = height;
        c1004b.f10441d = config;
        ((C0396c2) this.f6776y).M(c1004b, bitmap);
    }

    @Override // j1.p
    public final int e(j1.m mVar) {
        return ((j1.p) this.f6776y).e(mVar);
    }

    @Override // m1.InterfaceC1012j
    public final String f(int i6, int i7, Bitmap.Config config) {
        return F(i6, i7, config);
    }

    @Override // A0.e
    public final void g(B0.f fVar) {
        double dFloatValue;
        long jLongValue;
        int iIntValue;
        Object[] objArr = (Object[]) this.f6776y;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i6 = 0;
        while (i6 < length) {
            Object obj = objArr[i6];
            i6++;
            if (obj == null) {
                fVar.h(i6);
            } else if (obj instanceof byte[]) {
                fVar.b(i6, (byte[]) obj);
            } else {
                if (obj instanceof Float) {
                    dFloatValue = ((Float) obj).floatValue();
                } else if (obj instanceof Double) {
                    dFloatValue = ((Double) obj).doubleValue();
                } else {
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else if (obj instanceof Short) {
                            iIntValue = ((Short) obj).shortValue();
                        } else if (obj instanceof Byte) {
                            iIntValue = ((Byte) obj).byteValue();
                        } else if (obj instanceof String) {
                            fVar.k(i6, (String) obj);
                        } else {
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i6 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                            }
                            jLongValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        jLongValue = iIntValue;
                    }
                    fVar.g(i6, jLongValue);
                }
                fVar.c(i6, dFloatValue);
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Exception exc) {
        l1.J j6 = (l1.J) this.f6776y;
        p1.w wVar = (p1.w) this.f6775x;
        p1.w wVar2 = j6.f9873B;
        if (wVar2 == null || wVar2 != wVar) {
            return;
        }
        l1.J j7 = (l1.J) this.f6776y;
        p1.w wVar3 = (p1.w) this.f6775x;
        InterfaceC0933g interfaceC0933g = j7.f9876x;
        C0932f c0932f = j7.f9874C;
        com.bumptech.glide.load.data.e eVar = wVar3.f12288c;
        interfaceC0933g.d(c0932f, exc, eVar, eVar.d());
    }

    @Override // m1.InterfaceC1012j
    public final String i(Bitmap bitmap) {
        return F(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // j1.h
    public final int j(j1.f fVar) throws IOException {
        switch (this.f6774w) {
            case 17:
                try {
                    return fVar.b((ByteBuffer) this.f6775x, (C1010h) this.f6776y);
                } finally {
                    C1.b.c((ByteBuffer) this.f6775x);
                }
            default:
                try {
                    return fVar.d((InputStream) this.f6775x, (C1010h) this.f6776y);
                } finally {
                    ((InputStream) this.f6775x).reset();
                }
        }
    }

    @Override // A0.e
    public final String k() {
        return (String) this.f6775x;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r3 == j1.EnumC0843a.f9425x) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r3 != j1.EnumC0843a.f9422A) goto L16;
     */
    @Override // com.bumptech.glide.load.data.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6776y
            l1.J r0 = (l1.J) r0
            java.lang.Object r1 = r7.f6775x
            p1.w r1 = (p1.w) r1
            p1.w r0 = r0.f9873B
            if (r0 == 0) goto L53
            if (r0 != r1) goto L53
            java.lang.Object r0 = r7.f6776y
            l1.J r0 = (l1.J) r0
            java.lang.Object r1 = r7.f6775x
            p1.w r1 = (p1.w) r1
            l1.i r2 = r0.f9875w
            l1.p r2 = r2.f9913p
            if (r8 == 0) goto L3e
            com.bumptech.glide.load.data.e r3 = r1.f12288c
            j1.a r3 = r3.d()
            l1.o r2 = (l1.o) r2
            int r2 = r2.f9959d
            switch(r2) {
                case 1: goto L3e;
                case 2: goto L2e;
                default: goto L29;
            }
        L29:
            j1.a r2 = j1.EnumC0843a.f9425x
            if (r3 != r2) goto L3e
            goto L36
        L2e:
            j1.a r2 = j1.EnumC0843a.f9426y
            if (r3 == r2) goto L3e
            j1.a r2 = j1.EnumC0843a.f9422A
            if (r3 == r2) goto L3e
        L36:
            r0.f9872A = r8
            l1.g r8 = r0.f9876x
            r8.b()
            goto L53
        L3e:
            l1.g r2 = r0.f9876x
            j1.i r3 = r1.f12286a
            com.bumptech.glide.load.data.e r4 = r1.f12288c
            j1.a r5 = r4.d()
            l1.f r6 = r0.f9874C
            r0 = r2
            r1 = r3
            r2 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            r0.c(r1, r2, r3, r4, r5)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0396c2.l(java.lang.Object):void");
    }

    @Override // j1.InterfaceC0845c
    public final boolean m(Object obj, File file, j1.m mVar) {
        return ((j1.p) this.f6776y).m(new C1295d(((BitmapDrawable) ((l1.F) obj).a()).getBitmap(), (InterfaceC1006d) this.f6775x), file, mVar);
    }

    @Override // s1.q
    public final void n(Bitmap bitmap, InterfaceC1006d interfaceC1006d) throws IOException {
        IOException iOException = ((C1.e) this.f6776y).f119x;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC1006d.d(bitmap);
            throw iOException;
        }
    }

    public final void p(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.p(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        h0.W w5 = (h0.W) this.f6775x;
        Context context = w5.f8717w.f8643y;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = w5.f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.q(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.r(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    @Override // m1.InterfaceC1012j
    public final Bitmap removeLast() {
        return (Bitmap) ((C0396c2) this.f6776y).O();
    }

    public final void s(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.s(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    @Override // s1.q
    public final void t() {
        s1.y yVar = (s1.y) this.f6775x;
        synchronized (yVar) {
            yVar.f12613y = yVar.f12611w.length;
        }
    }

    public final String toString() {
        switch (this.f6774w) {
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Bounds{lower=" + ((G.c) this.f6775x) + " upper=" + ((G.c) this.f6776y) + "}";
            case 21:
                return "AttributeStrategy:\n  " + ((C0396c2) this.f6776y);
            case 22:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C1008f c1008f = ((C1008f) this.f6775x).f10446c;
                boolean z5 = false;
                while (!c1008f.equals((C1008f) this.f6775x)) {
                    sb.append('{');
                    sb.append(c1008f.f10444a);
                    sb.append(':');
                    ArrayList arrayList = c1008f.f10445b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c1008f = c1008f.f10446c;
                    z5 = true;
                }
                if (z5) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final void u(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.u(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                com.onesignal.X1 x12 = i6.f8660a;
                x12.getClass();
                if (abstractComponentCallbacksC0734B instanceof DialogInterfaceOnCancelListenerC0756v) {
                    C0396c2 c0396c2 = ((h0.W) x12.f7736y).f8709o;
                    c0396c2.getClass();
                    synchronized (((CopyOnWriteArrayList) c0396c2.f6776y)) {
                        int size = ((CopyOnWriteArrayList) c0396c2.f6776y).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                break;
                            }
                            if (((h0.I) ((CopyOnWriteArrayList) c0396c2.f6776y).get(i7)).f8660a == x12) {
                                ((CopyOnWriteArrayList) c0396c2.f6776y).remove(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    ((C0579o0) ((C0544c1) x12.f7735x).f7776a).a0();
                } else {
                    continue;
                }
            }
        }
    }

    public final void v(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.v(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void w(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        h0.W w5 = (h0.W) this.f6775x;
        Context context = w5.f8717w.f8643y;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = w5.f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.w(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void x(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.x(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void y(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.y(abstractComponentCallbacksC0734B, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public final void z(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, Bundle bundle, boolean z5) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "f");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = ((h0.W) this.f6775x).f8719y;
        if (abstractComponentCallbacksC0734B2 != null) {
            abstractComponentCallbacksC0734B2.o().f8709o.z(abstractComponentCallbacksC0734B, bundle, true);
        }
        for (h0.I i6 : (CopyOnWriteArrayList) this.f6776y) {
            if (!z5 || i6.f8661b) {
                i6.f8660a.getClass();
            }
        }
    }

    public C0396c2(int i6) {
        this.f6774w = i6;
        if (i6 == 14) {
            this.f6775x = new androidx.lifecycle.E();
            this.f6776y = new T0.i();
            R(I0.u.f1111g);
            return;
        }
        if (i6 == 25) {
            this.f6775x = new C1.j(1000L);
            this.f6776y = new C0803c(new M.c(10), new L3.c(27, this), D1.d.f289a);
            return;
        }
        int i7 = 0;
        switch (i6) {
            case 21:
                this.f6775x = new C1005c(i7);
                this.f6776y = new C0396c2(22);
                break;
            case 22:
                this.f6775x = new C1008f(null);
                this.f6776y = new HashMap();
                break;
            case 23:
                this.f6775x = new HashMap();
                this.f6776y = new L3.c(26, 0);
                break;
            default:
                this.f6775x = null;
                this.f6776y = null;
                break;
        }
    }

    public C0396c2(int i6, int i7) {
        this.f6774w = 5;
        this.f6775x = new int[]{i6, i7};
        this.f6776y = new float[]{0.0f, 1.0f};
    }

    public C0396c2(int i6, int i7, int i8) {
        this.f6774w = 5;
        this.f6775x = new int[]{i6, i7, i8};
        this.f6776y = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0396c2(Animator animator) {
        this.f6774w = 9;
        this.f6775x = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6776y = animatorSet;
        animatorSet.play(animator);
    }

    public C0396c2(Context context) {
        this.f6774w = 0;
        this.f6775x = context;
        this.f6776y = new C0402d2(null);
        context.getContentResolver().registerContentObserver(R1.f6670a, true, (ContentObserver) this.f6776y);
    }

    public C0396c2(WindowInsetsAnimation.Bounds bounds) {
        this.f6774w = 7;
        this.f6775x = G.c.c(bounds.getLowerBound());
        this.f6776y = G.c.c(bounds.getUpperBound());
    }

    public C0396c2(Animation animation) {
        this.f6774w = 9;
        this.f6775x = animation;
        this.f6776y = null;
    }

    public C0396c2(EditText editText) {
        this.f6774w = 1;
        this.f6775x = editText;
        this.f6776y = new e0.b(editText);
    }

    public C0396c2(TextView textView) {
        this.f6774w = 2;
        textView.getClass();
        this.f6775x = textView;
    }

    public C0396c2(h0.W w5) {
        this.f6774w = 10;
        AbstractC1305a.o(w5, "fragmentManager");
        this.f6775x = w5;
        this.f6776y = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0396c2(C0803c c0803c) {
        this(new C1234C(c0803c));
        this.f6774w = 26;
    }

    public C0396c2(Object obj) {
        this.f6774w = 11;
        P4.q0 q0VarB = P4.d0.b(new C1311g(Integer.MIN_VALUE, obj));
        this.f6775x = q0VarB;
        this.f6776y = new W.C(q0VarB, 1);
    }

    public /* synthetic */ C0396c2(Object obj, int i6, Object obj2) {
        this.f6774w = i6;
        this.f6775x = obj;
        this.f6776y = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0396c2(String str) {
        this(str, 13, (Object) null);
        this.f6774w = 13;
    }

    public C0396c2(ArrayList arrayList, ArrayList arrayList2) {
        this.f6774w = 5;
        int size = arrayList.size();
        this.f6775x = new int[size];
        this.f6776y = new float[size];
        for (int i6 = 0; i6 < size; i6++) {
            ((int[]) this.f6775x)[i6] = ((Integer) arrayList.get(i6)).intValue();
            ((float[]) this.f6776y)[i6] = ((Float) arrayList2.get(i6)).floatValue();
        }
    }

    public /* synthetic */ C0396c2(InterfaceC0933g interfaceC0933g, Object obj, int i6) {
        this.f6774w = i6;
        this.f6776y = interfaceC0933g;
        this.f6775x = obj;
    }

    public C0396c2(C1234C c1234c) {
        this.f6774w = 26;
        this.f6776y = new androidx.lifecycle.D(2);
        this.f6775x = c1234c;
    }

    public C0396c2(C1267a c1267a) {
        this.f6774w = 4;
        this.f6776y = c1267a;
    }
}
