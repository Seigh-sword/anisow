package i5;

import Q3.n;
import a3.C0261b;
import com.google.gson.reflect.TypeToken;
import h5.AbstractC0789p;
import h5.InterfaceC0790q;
import h5.W;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0789p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f9408a;

    public a(n nVar) {
        this.f9408a = nVar;
    }

    @Override // h5.AbstractC0789p
    public final InterfaceC0790q a(Type type) {
        TypeToken typeToken = new TypeToken(type);
        n nVar = this.f9408a;
        return new b(nVar, nVar.c(typeToken));
    }

    @Override // h5.AbstractC0789p
    public final InterfaceC0790q b(Type type, Annotation[] annotationArr, W w5) {
        TypeToken typeToken = new TypeToken(type);
        n nVar = this.f9408a;
        return new C0261b(nVar, nVar.c(typeToken), 17);
    }
}
