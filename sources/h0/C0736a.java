package h0;

import android.util.Log;
import c1.C0363d;
import i0.AbstractC0823c;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: h0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0736a implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f8743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f8745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f8747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f8748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f8749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f8751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W f8752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8754s;

    public C0736a(W w5) {
        w5.H();
        D d6 = w5.f8717w;
        if (d6 != null) {
            d6.f8643y.getClassLoader();
        }
        this.f8736a = new ArrayList();
        this.f8750o = false;
        this.f8754s = -1;
        this.f8752q = w5;
    }

    @Override // h0.T
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f8742g) {
            return true;
        }
        this.f8752q.f8698d.add(this);
        return true;
    }

    public final void b(d0 d0Var) {
        this.f8736a.add(d0Var);
        d0Var.f8795d = this.f8737b;
        d0Var.f8796e = this.f8738c;
        d0Var.f8797f = this.f8739d;
        d0Var.f8798g = this.f8740e;
    }

    public final void c(int i6) {
        if (this.f8742g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i6);
            }
            int size = this.f8736a.size();
            for (int i7 = 0; i7 < size; i7++) {
                d0 d0Var = (d0) this.f8736a.get(i7);
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = d0Var.f8793b;
                if (abstractComponentCallbacksC0734B != null) {
                    abstractComponentCallbacksC0734B.f8604O += i6;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + d0Var.f8793b + " to " + d0Var.f8793b.f8604O);
                    }
                }
            }
        }
    }

    public final int d(boolean z5, boolean z6) {
        if (this.f8753r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new o0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f8753r = true;
        boolean z7 = this.f8742g;
        W w5 = this.f8752q;
        this.f8754s = z7 ? w5.f8705k.getAndIncrement() : -1;
        if (z6) {
            w5.x(this, z5);
        }
        return this.f8754s;
    }

    public final void e(int i6, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, String str, int i7) {
        String str2 = abstractComponentCallbacksC0734B.f8625j0;
        if (str2 != null) {
            AbstractC0823c.d(abstractComponentCallbacksC0734B, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0734B.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0734B.f8611V;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0734B + ": was " + abstractComponentCallbacksC0734B.f8611V + " now " + str);
            }
            abstractComponentCallbacksC0734B.f8611V = str;
        }
        if (i6 != 0) {
            if (i6 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0734B + " with tag " + str + " to container view with no id");
            }
            int i8 = abstractComponentCallbacksC0734B.f8609T;
            if (i8 != 0 && i8 != i6) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0734B + ": was " + abstractComponentCallbacksC0734B.f8609T + " now " + i6);
            }
            abstractComponentCallbacksC0734B.f8609T = i6;
            abstractComponentCallbacksC0734B.f8610U = i6;
        }
        b(new d0(i7, abstractComponentCallbacksC0734B));
        abstractComponentCallbacksC0734B.f8605P = this.f8752q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8743h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8754s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8753r);
            if (this.f8741f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8741f));
            }
            if (this.f8737b != 0 || this.f8738c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8737b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8738c));
            }
            if (this.f8739d != 0 || this.f8740e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8739d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8740e));
            }
            if (this.f8744i != 0 || this.f8745j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8744i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8745j);
            }
            if (this.f8746k != 0 || this.f8747l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8746k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8747l);
            }
        }
        if (this.f8736a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f8736a.size();
        for (int i6 = 0; i6 < size; i6++) {
            d0 d0Var = (d0) this.f8736a.get(i6);
            switch (d0Var.f8792a) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    str2 = "REPLACE";
                    break;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    str2 = "REMOVE";
                    break;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "HIDE";
                    break;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + d0Var.f8792a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i6);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(d0Var.f8793b);
            if (z5) {
                if (d0Var.f8795d != 0 || d0Var.f8796e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(d0Var.f8795d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(d0Var.f8796e));
                }
                if (d0Var.f8797f != 0 || d0Var.f8798g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(d0Var.f8797f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(d0Var.f8798g));
                }
            }
        }
    }

    public final void g(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        W w5 = abstractComponentCallbacksC0734B.f8605P;
        if (w5 == null || w5 == this.f8752q) {
            b(new d0(3, abstractComponentCallbacksC0734B));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0734B.toString() + " is already attached to a FragmentManager.");
    }

    public final void h(int i6, C0363d c0363d, String str) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        e(i6, c0363d, str, 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8754s >= 0) {
            sb.append(" #");
            sb.append(this.f8754s);
        }
        if (this.f8743h != null) {
            sb.append(" ");
            sb.append(this.f8743h);
        }
        sb.append("}");
        return sb.toString();
    }
}
