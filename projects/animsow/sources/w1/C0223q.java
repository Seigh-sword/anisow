package W1;

import X1.AbstractBinderC0233a;
import X1.InterfaceC0243k;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: W1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0223q extends AbstractC0231z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4342b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223q(r rVar, C0226u c0226u, U1.b bVar) {
        super(c0226u);
        this.f4344d = rVar;
        this.f4343c = bVar;
    }

    @Override // W1.AbstractC0231z
    public final void a() {
        InterfaceC0243k q5;
        int i6 = this.f4342b;
        Object obj = this.f4344d;
        Object obj2 = this.f4343c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((r) obj).f4347z.j((U1.b) obj2);
                break;
            default:
                C0226u c0226u = (C0226u) obj2;
                o2.i iVar = (o2.i) obj;
                if (c0226u.m(0)) {
                    U1.b bVar = iVar.f12195x;
                    if (bVar.c()) {
                        X1.y yVar = iVar.f12196y;
                        AbstractC1332d.m(yVar);
                        U1.b bVar2 = yVar.f4665y;
                        if (!bVar2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            c0226u.j(bVar2);
                        } else {
                            c0226u.f4363n = true;
                            IBinder iBinder = yVar.f4664x;
                            if (iBinder == null) {
                                q5 = null;
                            } else {
                                int i7 = AbstractBinderC0233a.f4558c;
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                q5 = iInterfaceQueryLocalInterface instanceof InterfaceC0243k ? (InterfaceC0243k) iInterfaceQueryLocalInterface : new X1.Q(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                            }
                            AbstractC1332d.m(q5);
                            c0226u.f4364o = q5;
                            c0226u.f4365p = yVar.f4666z;
                            c0226u.f4366q = yVar.f4662A;
                        }
                    } else if (!c0226u.f4361l || bVar.b()) {
                        c0226u.j(bVar);
                    } else {
                        c0226u.a();
                    }
                    c0226u.l();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223q(C0226u c0226u, C0226u c0226u2, o2.i iVar) {
        super(c0226u);
        this.f4343c = c0226u2;
        this.f4344d = iVar;
    }
}
