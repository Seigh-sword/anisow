package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import d2.AbstractC0651b;
import h.AbstractC0732a;
import i.C0803c;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10110a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T1.j f10112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10114e;

    public E(ImageView imageView) {
        this.f10111b = imageView;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e6) {
            Log.w("SupportSQLite", "delete failed: ", e6);
        }
    }

    public final void a() {
        Drawable drawable = ((ImageView) this.f10111b).getDrawable();
        if (drawable != null) {
            AbstractC0983r0.a(drawable);
        }
        if (drawable != null) {
            Z0 z02 = (Z0) this.f10112c;
            if (z02 != null) {
                if (((Z0) this.f10114e) == null) {
                    this.f10114e = new Z0();
                }
                Z0 z03 = (Z0) this.f10114e;
                z03.f10237c = null;
                z03.f10236b = false;
                z03.f10238d = null;
                z03.f10235a = false;
                ColorStateList colorStateListA = T.f.a((ImageView) this.f10111b);
                if (colorStateListA != null) {
                    z03.f10236b = true;
                    z03.f10237c = colorStateListA;
                }
                PorterDuff.Mode modeB = T.f.b((ImageView) this.f10111b);
                if (modeB != null) {
                    z03.f10235a = true;
                    z03.f10238d = modeB;
                }
                if (z03.f10236b || z03.f10235a) {
                    C0998z.d(drawable, z03, ((ImageView) this.f10111b).getDrawableState());
                    return;
                }
            }
            Z0 z04 = (Z0) this.f10113d;
            if (z04 != null) {
                C0998z.d(drawable, z04, ((ImageView) this.f10111b).getDrawableState());
            } else if (z02 != null) {
                C0998z.d(drawable, z02, ((ImageView) this.f10111b).getDrawableState());
            }
        }
    }

    public final void c(AttributeSet attributeSet, int i6) {
        int iB;
        Context context = ((ImageView) this.f10111b).getContext();
        int[] iArr = AbstractC0732a.f8568f;
        C0803c c0803cJ = C0803c.J(context, attributeSet, iArr, i6, 0);
        ImageView imageView = (ImageView) this.f10111b;
        N.V.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0803cJ.f9278y, i6);
        try {
            Drawable drawable = ((ImageView) this.f10111b).getDrawable();
            if (drawable == null && (iB = c0803cJ.B(1, -1)) != -1 && (drawable = AbstractC0651b.p(((ImageView) this.f10111b).getContext(), iB)) != null) {
                ((ImageView) this.f10111b).setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0983r0.a(drawable);
            }
            if (c0803cJ.G(2)) {
                T.f.c((ImageView) this.f10111b, c0803cJ.s(2));
            }
            if (c0803cJ.G(3)) {
                T.f.d((ImageView) this.f10111b, AbstractC0983r0.b(c0803cJ.z(3, -1), null));
            }
            c0803cJ.M();
        } catch (Throwable th) {
            c0803cJ.M();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x003a A[EDGE_INSN: B:87:0x003a->B:18:0x003a BREAK  A[LOOP:3: B:12:0x0022->B:90:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(B0.b r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.E.d(B0.b, int, int):void");
    }

    public final void e(int i6) {
        if (i6 != 0) {
            Drawable drawableP = AbstractC0651b.p(((ImageView) this.f10111b).getContext(), i6);
            if (drawableP != null) {
                AbstractC0983r0.a(drawableP);
            }
            ((ImageView) this.f10111b).setImageDrawable(drawableP);
        } else {
            ((ImageView) this.f10111b).setImageDrawable(null);
        }
        a();
    }

    public final void f(B0.b bVar) {
        bVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.f10113d) + "')");
    }
}
