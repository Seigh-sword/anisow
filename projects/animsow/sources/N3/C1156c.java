package n3;

import N.C0095h;
import Z.j;
import android.util.Base64;
import android.util.JsonReader;
import d.AbstractC0628i;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.B;
import m3.C;
import m3.C1086A;
import m3.C1088a0;
import m3.C1090b0;
import m3.C1106j0;
import m3.C1110l0;
import m3.D;
import m3.E;
import m3.G;
import m3.H;
import m3.J;
import m3.L;
import m3.N;
import m3.P0;
import m3.V;
import m3.Y;
import m3.Z;
import y3.d;

/* JADX INFO: renamed from: n3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1156c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K1.b f11702a;

    static {
        d dVar = new d();
        C1086A.f11289a.a(dVar);
        dVar.f13830d = true;
        f11702a = new K1.b(19, dVar);
    }

    public static Z a(JsonReader jsonReader) throws IOException {
        Y y5 = new Y();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    y5.f11437d = jsonReader.nextLong();
                    y5.f11439f = (byte) (y5.f11439f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    y5.f11435b = strNextString;
                    break;
                    break;
                case "pc":
                    y5.f11434a = jsonReader.nextLong();
                    y5.f11439f = (byte) (y5.f11439f | 1);
                    break;
                case "file":
                    y5.f11436c = jsonReader.nextString();
                    break;
                case "importance":
                    y5.f11438e = jsonReader.nextInt();
                    y5.f11439f = (byte) (y5.f11439f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y5.a();
    }

    public static G b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new G(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }

    public static E c(JsonReader jsonReader) throws IOException {
        D d6 = new D();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    d6.f11323i = d(jsonReader, new C0095h(26));
                    break;
                case "pid":
                    d6.f11315a = jsonReader.nextInt();
                    d6.f11324j = (byte) (d6.f11324j | 1);
                    break;
                case "pss":
                    d6.f11319e = jsonReader.nextLong();
                    d6.f11324j = (byte) (d6.f11324j | 8);
                    break;
                case "rss":
                    d6.f11320f = jsonReader.nextLong();
                    d6.f11324j = (byte) (d6.f11324j | 16);
                    break;
                case "timestamp":
                    d6.f11321g = jsonReader.nextLong();
                    d6.f11324j = (byte) (d6.f11324j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    d6.f11316b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    d6.f11317c = jsonReader.nextInt();
                    d6.f11324j = (byte) (d6.f11324j | 2);
                    break;
                case "traceFile":
                    d6.f11322h = jsonReader.nextString();
                    break;
                case "importance":
                    d6.f11318d = jsonReader.nextInt();
                    d6.f11324j = (byte) (d6.f11324j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return d6.a();
    }

    public static List d(JsonReader jsonReader, InterfaceC1155b interfaceC1155b) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC1155b.c(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x021f, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0222, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0230, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x023e, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m3.Q e(android.util.JsonReader r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C1156c.e(android.util.JsonReader):m3.Q");
    }

    public static V f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b6 = 0;
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        V vF = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new C1154a(6));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                    break;
                case "causedBy":
                    vF = f(jsonReader);
                    break;
                case "overflowCount":
                    b6 = (byte) (b6 | 1);
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b6 == 1 && str != null && list != null) {
            return new V(str, strNextString, list, vF, iNextInt);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" type");
        }
        if (list == null) {
            sb.append(" frames");
        }
        if ((b6 & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }

    public static C1090b0 g(JsonReader jsonReader) throws IOException {
        C1088a0 c1088a0 = new C1088a0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    c1088a0.f11450b = jsonReader.nextInt();
                    c1088a0.f11453e = (byte) (c1088a0.f11453e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c1088a0.f11449a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    c1088a0.f11452d = jsonReader.nextBoolean();
                    c1088a0.f11453e = (byte) (c1088a0.f11453e | 4);
                    break;
                case "importance":
                    c1088a0.f11451c = jsonReader.nextInt();
                    c1088a0.f11453e = (byte) (c1088a0.f11453e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c1088a0.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C h(JsonReader jsonReader) throws IOException {
        byte b6;
        Charset charset = P0.f11400a;
        B b7 = new B();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName.hashCode()) {
                case -2118372775:
                    b6 = !strNextName.equals("ndkPayload") ? (byte) -1 : (byte) 0;
                    break;
                case -1962630338:
                    b6 = !strNextName.equals("sdkVersion") ? (byte) -1 : (byte) 1;
                    break;
                case -1907185581:
                    b6 = !strNextName.equals("appQualitySessionId") ? (byte) -1 : (byte) 2;
                    break;
                case -1375141843:
                    b6 = !strNextName.equals("appExitInfo") ? (byte) -1 : (byte) 3;
                    break;
                case -911706486:
                    b6 = !strNextName.equals("buildVersion") ? (byte) -1 : (byte) 4;
                    break;
                case -401988390:
                    b6 = !strNextName.equals("firebaseAuthenticationToken") ? (byte) -1 : (byte) 5;
                    break;
                case 344431858:
                    b6 = !strNextName.equals("gmpAppId") ? (byte) -1 : (byte) 6;
                    break;
                case 719853845:
                    b6 = !strNextName.equals("installationUuid") ? (byte) -1 : (byte) 7;
                    break;
                case 1047652060:
                    b6 = !strNextName.equals("firebaseInstallationId") ? (byte) -1 : (byte) 8;
                    break;
                case 1874684019:
                    b6 = !strNextName.equals("platform") ? (byte) -1 : (byte) 9;
                    break;
                case 1975623094:
                    b6 = !strNextName.equals("displayVersion") ? (byte) -1 : (byte) 10;
                    break;
                case 1984987798:
                    b6 = !strNextName.equals("session") ? (byte) -1 : (byte) 11;
                    break;
                default:
                    b6 = -1;
                    break;
            }
            List listD = null;
            switch (b6) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    jsonReader.beginObject();
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listD = d(jsonReader, new C1154a(1));
                            if (listD == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listD == null) {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                    b7.f11300k = new H(listD, strNextString);
                    break;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    b7.f11290a = strNextString2;
                    break;
                    break;
                case j.FLOAT_FIELD_NUMBER /* 2 */:
                    b7.f11296g = jsonReader.nextString();
                    break;
                case j.INTEGER_FIELD_NUMBER /* 3 */:
                    b7.f11301l = c(jsonReader);
                    break;
                case j.LONG_FIELD_NUMBER /* 4 */:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    b7.f11297h = strNextString3;
                    break;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                    b7.f11295f = jsonReader.nextString();
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    b7.f11291b = strNextString4;
                    break;
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    b7.f11293d = strNextString5;
                    break;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    b7.f11294e = jsonReader.nextString();
                    break;
                case 9:
                    b7.f11292c = jsonReader.nextInt();
                    b7.f11302m = (byte) (b7.f11302m | 1);
                    break;
                case 10:
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    b7.f11298i = strNextString6;
                    break;
                    break;
                case 11:
                    J j6 = new J();
                    j6.f11348f = false;
                    j6.f11355m = (byte) (j6.f11355m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                j6.f11346d = jsonReader.nextLong();
                                j6.f11355m = (byte) (j6.f11355m | 1);
                                break;
                            case "appQualitySessionId":
                                j6.f11345c = jsonReader.nextString();
                                break;
                            case "identifier":
                                j6.f11344b = new String(Base64.decode(jsonReader.nextString(), 2), P0.f11400a);
                                break;
                            case "endedAt":
                                j6.f11347e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                N n5 = new N();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    strNextName4.hashCode();
                                    switch (strNextName4) {
                                        case "simulator":
                                            n5.f11379f = jsonReader.nextBoolean();
                                            n5.f11383j = (byte) (n5.f11383j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            n5.f11381h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            n5.f11377d = jsonReader.nextLong();
                                            n5.f11383j = (byte) (n5.f11383j | 4);
                                            break;
                                        case "arch":
                                            n5.f11374a = jsonReader.nextInt();
                                            n5.f11383j = (byte) (n5.f11383j | 1);
                                            break;
                                        case "diskSpace":
                                            n5.f11378e = jsonReader.nextLong();
                                            n5.f11383j = (byte) (n5.f11383j | 8);
                                            break;
                                        case "cores":
                                            n5.f11376c = jsonReader.nextInt();
                                            n5.f11383j = (byte) (n5.f11383j | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            n5.f11375b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            n5.f11380g = jsonReader.nextInt();
                                            n5.f11383j = (byte) (n5.f11383j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            n5.f11382i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                j6.f11352j = n5.a();
                                break;
                            case "events":
                                j6.f11353k = d(jsonReader, new C1154a(0));
                                break;
                            case "os":
                                C1106j0 c1106j0 = new C1106j0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    strNextName5.hashCode();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            c1106j0.f11550c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            c1106j0.f11551d = jsonReader.nextBoolean();
                                            c1106j0.f11552e = (byte) (c1106j0.f11552e | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            c1106j0.f11549b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            c1106j0.f11548a = jsonReader.nextInt();
                                            c1106j0.f11552e = (byte) (c1106j0.f11552e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                j6.f11351i = c1106j0.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    strNextName6.hashCode();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString13 = jsonReader.nextString();
                                            if (strNextString13 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString12 != null && strNextString13 != null) {
                                    j6.f11349g = new L(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString12 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString13 == null) {
                                        sb.append(" version");
                                    }
                                    throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                j6.f11350h = new C1110l0(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                j6.f11343a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                j6.f11348f = jsonReader.nextBoolean();
                                j6.f11355m = (byte) (j6.f11355m | 2);
                                break;
                            case "generatorType":
                                j6.f11354l = jsonReader.nextInt();
                                j6.f11355m = (byte) (j6.f11355m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    b7.f11299j = j6.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b7.a();
    }

    public static C i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C cH = h(jsonReader);
                jsonReader.close();
                return cH;
            } finally {
            }
        } catch (IllegalStateException e6) {
            throw new IOException(e6);
        }
    }
}
