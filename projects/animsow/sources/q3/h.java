package Q3;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0165a f2804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ h[] f2805x;

    static {
        C0165a c0165a = new C0165a();
        f2804w = c0165a;
        f2805x = new h[]{c0165a, new h() { // from class: Q3.b
            @Override // Q3.i
            public final String a(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: Q3.c
            @Override // Q3.i
            public final String a(Field field) {
                return h.c(h.b(field.getName(), ' '));
            }
        }, new h() { // from class: Q3.d
            @Override // Q3.i
            public final String a(Field field) {
                return h.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: Q3.e
            @Override // Q3.i
            public final String a(Field field) {
                return h.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: Q3.f
            @Override // Q3.i
            public final String a(Field field) {
                return h.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: Q3.g
            @Override // Q3.i
            public final String a(Field field) {
                return h.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String b(String str, char c6) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c6);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i6 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i6) + upperCase + str.substring(i6 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f2805x.clone();
    }
}
