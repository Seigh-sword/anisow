package p1;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class F implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f12231b;

    public /* synthetic */ F(x xVar, int i6) {
        this.f12230a = i6;
        this.f12231b = xVar;
    }

    @Override // p1.x
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f12230a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                break;
        }
        return true;
    }

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
    @Override // p1.x
    public final w b(Object obj, int i6, int i7, j1.m mVar) {
        Uri uriFromFile;
        File file;
        int i8 = this.f12230a;
        x xVar = this.f12231b;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else {
                    if (str.charAt(0) == '/') {
                        file = new File(str);
                    } else {
                        Uri uri = Uri.parse(str);
                        if (uri.getScheme() == null) {
                            file = new File(str);
                        } else {
                            uriFromFile = uri;
                        }
                    }
                    uriFromFile = Uri.fromFile(file);
                }
                if (uriFromFile == null || !xVar.a(uriFromFile)) {
                    return null;
                }
                return xVar.b(uriFromFile, i6, i7, mVar);
            default:
                return xVar.b(new o((URL) obj), i6, i7, mVar);
        }
    }
}
