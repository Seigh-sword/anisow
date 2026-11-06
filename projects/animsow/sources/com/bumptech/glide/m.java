package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import i1.InterfaceC0827a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import t0.AbstractC1332d;
import w1.C1474r;
import y1.AbstractC1497a;
import z1.C1527b;

/* JADX INFO: loaded from: classes.dex */
public class m extends AbstractC1497a {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final Context f6390W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final o f6391X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Class f6392Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final f f6393Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public a f6394a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Object f6395b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ArrayList f6396c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public m f6397d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public m f6398e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final boolean f6399f0 = true;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f6400g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f6401h0;

    static {
    }

    public m(b bVar, o oVar, Class cls, Context context) {
        y1.f fVar;
        this.f6391X = oVar;
        this.f6392Y = cls;
        this.f6390W = context;
        Map map = oVar.f6411w.f6298y.f6336f;
        a aVar = (a) map.get(cls);
        if (aVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f6394a0 = aVar == null ? f.f6330k : aVar;
        this.f6393Z = bVar.f6298y;
        Iterator it = oVar.f6409E.iterator();
        while (it.hasNext()) {
            A((y1.e) it.next());
        }
        synchronized (oVar) {
            fVar = oVar.f6410F;
        }
        a(fVar);
    }

    public m A(y1.e eVar) {
        if (this.f13735R) {
            return clone().A(eVar);
        }
        if (eVar != null) {
            if (this.f6396c0 == null) {
                this.f6396c0 = new ArrayList();
            }
            this.f6396c0.add(eVar);
        }
        t();
        return this;
    }

    @Override // y1.AbstractC1497a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public m a(AbstractC1497a abstractC1497a) {
        AbstractC1332d.k(abstractC1497a);
        return (m) super.a(abstractC1497a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y1.c C(int r25, int r26, com.bumptech.glide.a r27, com.bumptech.glide.g r28, y1.AbstractC1497a r29, y1.d r30, z1.e r31, java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.m.C(int, int, com.bumptech.glide.a, com.bumptech.glide.g, y1.a, y1.d, z1.e, java.lang.Object):y1.c");
    }

    @Override // y1.AbstractC1497a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public m clone() {
        m mVar = (m) super.clone();
        mVar.f6394a0 = mVar.f6394a0.clone();
        if (mVar.f6396c0 != null) {
            mVar.f6396c0 = new ArrayList(mVar.f6396c0);
        }
        m mVar2 = mVar.f6397d0;
        if (mVar2 != null) {
            mVar.f6397d0 = mVar2.clone();
        }
        m mVar3 = mVar.f6398e0;
        if (mVar3 != null) {
            mVar.f6398e0 = mVar3.clone();
        }
        return mVar;
    }

    public final void E(ImageView imageView) {
        AbstractC1497a abstractC1497aN;
        z1.e c1527b;
        C1.n.a();
        AbstractC1332d.k(imageView);
        if (!AbstractC1497a.l(this.f13740w, 2048) && this.f13727J && imageView.getScaleType() != null) {
            switch (l.f6360a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC1497aN = clone().n();
                    break;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    abstractC1497aN = clone().o();
                    break;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    abstractC1497aN = clone().p();
                    break;
                default:
                    abstractC1497aN = this;
                    break;
            }
        } else {
            abstractC1497aN = this;
        }
        this.f6393Z.f6333c.getClass();
        Class cls = this.f6392Y;
        if (Bitmap.class.equals(cls)) {
            c1527b = new C1527b(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c1527b = new C1527b(imageView, 1);
        }
        F(c1527b, abstractC1497aN);
    }

    public final void F(z1.e eVar, AbstractC1497a abstractC1497a) {
        AbstractC1332d.k(eVar);
        if (!this.f6400g0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        y1.c cVarC = C(abstractC1497a.f13724G, abstractC1497a.f13723F, this.f6394a0, abstractC1497a.f13743z, abstractC1497a, null, eVar, obj);
        y1.c cVarF = eVar.f();
        if (cVarC.l(cVarF) && (abstractC1497a.f13722E || !cVarF.i())) {
            AbstractC1332d.l(cVarF, "Argument must not be null");
            if (cVarF.isRunning()) {
                return;
            }
            cVarF.f();
            return;
        }
        this.f6391X.n(eVar);
        eVar.b(cVarC);
        o oVar = this.f6391X;
        synchronized (oVar) {
            oVar.f6406B.f13587w.add(eVar);
            C1474r c1474r = oVar.f6414z;
            ((Set) c1474r.f13584x).add(cVarC);
            if (c1474r.f13585y) {
                cVarC.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((Set) c1474r.f13586z).add(cVarC);
            } else {
                cVarC.f();
            }
        }
    }

    public m G(W0.k kVar) {
        if (this.f13735R) {
            return clone().G(kVar);
        }
        this.f6396c0 = null;
        return A(kVar);
    }

    public m H(InterfaceC0827a interfaceC0827a) {
        return I(interfaceC0827a);
    }

    public final m I(Object obj) {
        if (this.f13735R) {
            return clone().I(obj);
        }
        this.f6395b0 = obj;
        this.f6400g0 = true;
        t();
        return this;
    }

    @Override // y1.AbstractC1497a
    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (super.equals(mVar)) {
            return Objects.equals(this.f6392Y, mVar.f6392Y) && this.f6394a0.equals(mVar.f6394a0) && Objects.equals(this.f6395b0, mVar.f6395b0) && Objects.equals(this.f6396c0, mVar.f6396c0) && Objects.equals(this.f6397d0, mVar.f6397d0) && Objects.equals(this.f6398e0, mVar.f6398e0) && this.f6399f0 == mVar.f6399f0 && this.f6400g0 == mVar.f6400g0;
        }
        return false;
    }

    @Override // y1.AbstractC1497a
    public final int hashCode() {
        return C1.n.i(C1.n.i(C1.n.h(C1.n.h(C1.n.h(C1.n.h(C1.n.h(C1.n.h(C1.n.h(super.hashCode(), this.f6392Y), this.f6394a0), this.f6395b0), this.f6396c0), this.f6397d0), this.f6398e0), null), this.f6399f0), this.f6400g0);
    }
}
