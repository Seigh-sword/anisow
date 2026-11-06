package N3;

import M4.InterfaceC0080z;
import android.util.Log;
import j3.C0859i;
import j3.C0860j;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2178A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f2179B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String str, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2179B = str;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((Q) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new Q(this.f2179B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2178A;
        if (i6 == 0) {
            S3.a.O(obj);
            O3.c cVar = O3.c.f2336a;
            this.f2178A = 1;
            obj = cVar.b(this);
            if (obj == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        Collection<C0860j> collectionValues = ((Map) obj).values();
        String str = this.f2179B;
        for (C0860j c0860j : collectionValues) {
            O3.e eVar = new O3.e(str);
            c0860j.getClass();
            String str2 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            C0859i c0859i = c0860j.f9476b;
            String str3 = eVar.f2341a;
            synchronized (c0859i) {
                if (!Objects.equals(c0859i.f9474c, str3)) {
                    C0859i.a(c0859i.f9472a, c0859i.f9473b, str3);
                    c0859i.f9474c = str3;
                }
            }
            Log.d("SessionLifecycleClient", "Notified " + O3.d.f2338w + " of new session " + str);
        }
        return C1316l.f12640a;
    }
}
