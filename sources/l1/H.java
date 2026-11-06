package l1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Queue;
import m1.C1005c;
import m1.C1009g;
import m1.C1010h;
import m1.InterfaceC1013k;

/* JADX INFO: loaded from: classes.dex */
public final class H implements j1.i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1.j f9862j = new C1.j(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1010h f9863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.i f9864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1.i f9865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f9868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1.m f9869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1.q f9870i;

    public H(C1010h c1010h, j1.i iVar, j1.i iVar2, int i6, int i7, j1.q qVar, Class cls, j1.m mVar) {
        this.f9863b = c1010h;
        this.f9864c = iVar;
        this.f9865d = iVar2;
        this.f9866e = i6;
        this.f9867f = i7;
        this.f9870i = qVar;
        this.f9868g = cls;
        this.f9869h = mVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        Object objE;
        C1010h c1010h = this.f9863b;
        synchronized (c1010h) {
            C1005c c1005c = c1010h.f10452b;
            InterfaceC1013k interfaceC1013kS = (InterfaceC1013k) ((Queue) c1005c.f1668w).poll();
            if (interfaceC1013kS == null) {
                interfaceC1013kS = c1005c.s();
            }
            C1009g c1009g = (C1009g) interfaceC1013kS;
            c1009g.f10449b = 8;
            c1009g.f10450c = byte[].class;
            objE = c1010h.e(c1009g, byte[].class);
        }
        byte[] bArr = (byte[]) objE;
        ByteBuffer.wrap(bArr).putInt(this.f9866e).putInt(this.f9867f).array();
        this.f9865d.b(messageDigest);
        this.f9864c.b(messageDigest);
        messageDigest.update(bArr);
        j1.q qVar = this.f9870i;
        if (qVar != null) {
            qVar.b(messageDigest);
        }
        this.f9869h.b(messageDigest);
        C1.j jVar = f9862j;
        Class cls = this.f9868g;
        byte[] bytes = (byte[]) jVar.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(j1.i.f9435a);
            jVar.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f9863b.g(bArr);
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h4 = (H) obj;
        return this.f9867f == h4.f9867f && this.f9866e == h4.f9866e && C1.n.b(this.f9870i, h4.f9870i) && this.f9868g.equals(h4.f9868g) && this.f9864c.equals(h4.f9864c) && this.f9865d.equals(h4.f9865d) && this.f9869h.equals(h4.f9869h);
    }

    @Override // j1.i
    public final int hashCode() {
        int iHashCode = ((((this.f9865d.hashCode() + (this.f9864c.hashCode() * 31)) * 31) + this.f9866e) * 31) + this.f9867f;
        j1.q qVar = this.f9870i;
        if (qVar != null) {
            iHashCode = (iHashCode * 31) + qVar.hashCode();
        }
        return this.f9869h.f9442b.hashCode() + ((this.f9868g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f9864c + ", signature=" + this.f9865d + ", width=" + this.f9866e + ", height=" + this.f9867f + ", decodedResourceClass=" + this.f9868g + ", transformation='" + this.f9870i + "', options=" + this.f9869h + '}';
    }
}
