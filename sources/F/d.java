package F;

import V4.y;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import i.C0803c;
import java.net.ProtocolException;
import java.util.Arrays;
import s1.C1291A;
import s3.InterfaceC1304a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1304a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f434y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f435z;

    public d() {
        this.f432w = 1;
        long[] jArr = new long[20];
        this.f434y = jArr;
        this.f435z = new float[20];
        this.f433x = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ed, code lost:
    
        r16 = (int[]) r0.f6775x;
        r17 = (float[]) r0.f6776y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fb, code lost:
    
        if (r7 == 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fd, code lost:
    
        if (r7 == 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ff, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0204, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0207, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020a, code lost:
    
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r24, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r3 = new android.graphics.SweepGradient(r21, r22, (int[]) r0.f6775x, (float[]) r0.f6776y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0227, code lost:
    
        r8 = r21;
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022e, code lost:
    
        if (r23 <= 0.0f) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0230, code lost:
    
        r1 = (int[]) r0.f6775x;
        r21 = (float[]) r0.f6776y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023d, code lost:
    
        if (r7 == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0240, code lost:
    
        if (r7 == 2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0242, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0247, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024a, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024d, code lost:
    
        r3 = new android.graphics.RadialGradient(r8, r9, r23, r1, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025a, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0261, code lost:
    
        return new F.d(r2, r2, r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0269, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
    
        if (r15.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0 = new com.google.android.gms.internal.measurement.C0396c2(r15, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        if (r19 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
    
        r0 = new com.google.android.gms.internal.measurement.C0396c2(r5, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e4, code lost:
    
        r0 = new com.google.android.gms.internal.measurement.C0396c2(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e8, code lost:
    
        if (r11 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01eb, code lost:
    
        if (r11 == 2) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static F.d b(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.d.b(android.content.res.Resources, int, android.content.res.Resources$Theme):F.d");
    }

    public static d e(String str) throws ProtocolException {
        int i6;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        y yVar = y.f3981x;
        if (zStartsWith) {
            i6 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                yVar = y.f3982y;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i6 = 4;
        }
        int i7 = i6 + 3;
        if (str.length() < i7) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i8 = Integer.parseInt(str.substring(i6, i7));
            if (str.length() <= i7) {
                strSubstring = "";
            } else {
                if (str.charAt(i7) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i6 + 4);
            }
            return new d(yVar, i8, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    @Override // s3.InterfaceC1304a
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f433x) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (InterfaceC1304a interfaceC1304a : (InterfaceC1304a[]) this.f434y) {
            if (stackTraceElementArrA.length <= this.f433x) {
                break;
            }
            stackTraceElementArrA = interfaceC1304a.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f433x ? ((C1291A) this.f435z).a(stackTraceElementArrA) : stackTraceElementArrA;
    }

    public final boolean c() {
        if (((Shader) this.f434y) == null) {
            Object obj = this.f435z;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = (ColorStateList) this.f435z;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f433x) {
                this.f433x = colorForState;
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        switch (this.f432w) {
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                StringBuilder sb = new StringBuilder();
                sb.append(((y) this.f434y) == y.f3981x ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f433x);
                if (((String) this.f435z) != null) {
                    sb.append(' ');
                    sb.append((String) this.f435z);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i6, int i7, Object obj, Object obj2) {
        this.f432w = i7;
        this.f434y = obj;
        this.f435z = obj2;
        this.f433x = i6;
    }

    public d(U1.i iVar) {
        this.f432w = 2;
        this.f435z = new C0803c(new M.c(150), new L3.c(25, this), D1.d.f289a);
        this.f434y = iVar;
    }

    public d(y yVar, int i6, String str) {
        this.f432w = 5;
        this.f434y = yVar;
        this.f433x = i6;
        this.f435z = str;
    }

    public d(InterfaceC1304a[] interfaceC1304aArr) {
        this.f432w = 3;
        this.f433x = 1024;
        this.f434y = interfaceC1304aArr;
        this.f435z = new C1291A(1024, 2);
    }
}
