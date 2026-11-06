package d;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h0.AbstractComponentCallbacksC0734B;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0628i {
    public static final void a(int i6, View view, ViewGroup viewGroup) {
        int i7;
        AbstractC1305a.o(viewGroup, "container");
        int iB = u.h.b(i6);
        if (iB == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iB == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            i7 = 0;
        } else if (iB == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            i7 = 8;
        } else {
            if (iB != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            i7 = 4;
        }
        view.setVisibility(i7);
    }

    public static /* synthetic */ int b(int i6) {
        int i7 = 1;
        if (i6 != 1) {
            i7 = 2;
            if (i6 != 2) {
                i7 = 3;
                if (i6 != 3) {
                    if (i6 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i7;
    }

    public static /* synthetic */ boolean c(int i6) {
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            return false;
        }
        if (i6 == 4 || i6 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ long d(int i6) {
        if (i6 == 1) {
            return 0L;
        }
        if (i6 == 2) {
            return 1L;
        }
        if (i6 == 3) {
            return 2L;
        }
        if (i6 == 4) {
            return 3L;
        }
        if (i6 == 5) {
            return 4L;
        }
        throw null;
    }

    public static int e(String str, int i6, int i7) {
        return (str.hashCode() + i6) * i7;
    }

    public static String f(String str, int i6) {
        return str + i6;
    }

    public static String g(String str, long j6) {
        return str + j6;
    }

    public static String h(String str, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, String str2) {
        return str + abstractComponentCallbacksC0734B + str2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String l(StringBuilder sb, int i6, String str) {
        sb.append(i6);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void o(int i6, String str) {
        if (i6 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1305a.class.getName();
            int i7 = 0;
            while (!stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            while (stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            AbstractC1305a.T(AbstractC1305a.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static String q(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String r(int i6) {
        switch (i6) {
            case 1:
                return "NONE";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "LEFT";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "TOP";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "RIGHT";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "BOTTOM";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String s(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
    }

    public static /* synthetic */ String t(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String u(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String v(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE";
    }

    public static /* synthetic */ String w(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
    }

    public static /* synthetic */ String x(int i6) {
        switch (i6) {
            case 1:
                return "INITIALIZE";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "RESOURCE_CACHE";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "DATA_CACHE";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "SOURCE";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "ENCODE";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i6) {
        switch (i6) {
            case 1:
                return "UNKNOWN";
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "HORIZONTAL_DIMENSION";
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "VERTICAL_DIMENSION";
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return "LEFT";
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return "RIGHT";
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TOP";
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "BOTTOM";
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return "BASELINE";
            default:
                return "null";
        }
    }
}
