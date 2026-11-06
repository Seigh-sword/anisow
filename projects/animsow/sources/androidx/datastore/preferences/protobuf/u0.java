package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static t0 a(Object obj) {
        C c6 = (C) obj;
        t0 t0Var = c6.unknownFields;
        if (t0Var != t0.f5516f) {
            return t0Var;
        }
        t0 t0Var2 = new t0(0, new int[8], new Object[8], true);
        c6.unknownFields = t0Var2;
        return t0Var2;
    }

    public static void b(Object obj) {
        ((C) obj).unknownFields.f5521e = false;
    }

    public static boolean c(Object obj, C0289n c0289n) throws H {
        int i6 = c0289n.f5490a;
        int i7 = i6 >>> 3;
        int i8 = i6 & 7;
        if (i8 == 0) {
            c0289n.z(0);
            ((t0) obj).c(i7 << 3, Long.valueOf(((AbstractC0288m) c0289n.f5493d).n()));
        } else if (i8 == 1) {
            c0289n.z(1);
            ((t0) obj).c((i7 << 3) | 1, Long.valueOf(((AbstractC0288m) c0289n.f5493d).k()));
        } else if (i8 == 2) {
            ((t0) obj).c((i7 << 3) | 2, c0289n.h());
        } else if (i8 == 3) {
            t0 t0Var = new t0(0, new int[8], new Object[8], true);
            int i9 = i7 << 3;
            int i10 = i9 | 4;
            while (c0289n.c() != Integer.MAX_VALUE && c(t0Var, c0289n)) {
            }
            if (i10 != c0289n.f5490a) {
                throw new H("Protocol message end-group tag did not match expected tag.");
            }
            t0Var.f5521e = false;
            ((t0) obj).c(i9 | 3, t0Var);
        } else {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw H.b();
            }
            c0289n.z(5);
            ((t0) obj).c((i7 << 3) | 5, Integer.valueOf(((AbstractC0288m) c0289n.f5493d).j()));
        }
        return true;
    }
}
