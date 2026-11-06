package W2;

import java.util.Arrays;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f4430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4431b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f4432c;

    public m(int i6) {
        this.f4430a = new Object[i6 * 2];
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r6v3 ??, r6v7 ??, r6v4 ??, r6v6 ??, r6v8 ??, r6v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:580)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    public final W2.v a() {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.m.a():W2.v");
    }

    public final void b(Object obj, Object obj2) {
        int i6 = (this.f4431b + 1) * 2;
        Object[] objArr = this.f4430a;
        if (i6 > objArr.length) {
            this.f4430a = Arrays.copyOf(objArr, AbstractC1305a.x(objArr.length, i6));
        }
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 == null) {
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(strValueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        Object[] objArr2 = this.f4430a;
        int i7 = this.f4431b;
        int i8 = i7 * 2;
        objArr2[i8] = obj;
        objArr2[i8 + 1] = obj2;
        this.f4431b = i7 + 1;
    }
}
