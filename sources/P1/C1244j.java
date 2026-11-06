package p1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import d2.AbstractC0651b;
import java.lang.reflect.InvocationTargetException;
import q4.InterfaceC1266a;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: p1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1244j implements y, InterfaceC1246l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Context f12256x;

    public C1244j() {
        this.f12255w = 5;
    }

    public static void i(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e6) {
                j(cls, e6);
                throw null;
            } catch (InstantiationException e7) {
                j(cls, e7);
                throw null;
            } catch (NoSuchMethodException e8) {
                j(cls, e8);
                throw null;
            } catch (InvocationTargetException e9) {
                j(cls, e9);
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e10);
        }
    }

    public static void j(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public final H1.k a() {
        Context context = this.f12256x;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        H1.k kVar = new H1.k();
        kVar.f939w = J1.a.a(H1.n.f945a);
        J1.c cVar = new J1.c(context);
        kVar.f940x = cVar;
        H1.o oVar = P1.b.f2411a;
        H1.o oVar2 = P1.b.f2412b;
        int i6 = 0;
        kVar.f941y = J1.a.a(new I1.g(cVar, new I1.e(cVar, oVar, oVar2, i6)));
        J1.c cVar2 = kVar.f940x;
        int i7 = 1;
        kVar.f942z = new I1.e(cVar2, N1.e.f2085a, N1.e.f2086b, i7);
        InterfaceC1266a interfaceC1266aA = J1.a.a(new H1.v(oVar, oVar2, N1.e.f2087c, kVar.f942z, J1.a.a(new L1.d(cVar2, i7)), 2));
        kVar.f937A = interfaceC1266aA;
        L1.d dVar = new L1.d(oVar, i6);
        J1.c cVar3 = kVar.f940x;
        L1.e eVar = new L1.e(cVar3, interfaceC1266aA, dVar, oVar2, 0);
        InterfaceC1266a interfaceC1266a = kVar.f939w;
        InterfaceC1266a interfaceC1266a2 = kVar.f941y;
        kVar.f938B = J1.a.a(new H1.v(oVar, oVar2, new H1.v(interfaceC1266a, interfaceC1266a2, eVar, interfaceC1266aA, interfaceC1266aA, 1), new M1.k(cVar3, interfaceC1266a2, interfaceC1266aA, eVar, interfaceC1266a, interfaceC1266aA, interfaceC1266aA), new L1.e(interfaceC1266a, interfaceC1266aA, eVar, interfaceC1266aA, 1), 0));
        return kVar;
    }

    @Override // p1.InterfaceC1246l
    public final Class b() {
        return Drawable.class;
    }

    @Override // p1.InterfaceC1246l
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        switch (this.f12255w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new m(this.f12256x, this);
            case 1:
                return new u(this.f12256x, 0);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new m(this.f12256x, c1234c.b(Integer.class, AssetFileDescriptor.class));
            default:
                return new u(this.f12256x, 2);
        }
    }

    @Override // p1.InterfaceC1246l
    public final Object e(Resources resources, int i6, Resources.Theme theme) {
        Context context = this.f12256x;
        return com.bumptech.glide.d.n(context, context, i6, theme);
    }

    public final ApplicationInfo f(int i6, String str) {
        return this.f12256x.getPackageManager().getApplicationInfo(str, i6);
    }

    public final PackageInfo g(int i6, String str) {
        return this.f12256x.getPackageManager().getPackageInfo(str, i6);
    }

    public final boolean h() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC0651b.u(this.f12256x);
        }
        if (!AbstractC1332d.S() || (nameForUid = this.f12256x.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f12256x.getPackageManager().isInstantApp(nameForUid);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1244j(int i6) {
        this();
        this.f12255w = 5;
    }

    public /* synthetic */ C1244j(Context context, int i6) {
        this.f12255w = i6;
        this.f12256x = context;
    }
}
