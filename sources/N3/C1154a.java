package n3;

import E1.e;
import J3.C0055k;
import J3.q;
import V4.InterfaceC0171b;
import V4.InterfaceC0181l;
import Z.j;
import a3.C0261b;
import android.util.Base64;
import android.util.JsonReader;
import b3.C0343c;
import com.bumptech.glide.d;
import d.AbstractC0628i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import m3.C1098f0;
import m3.C1102h0;
import m3.I;
import m3.P0;
import m3.U;
import m3.X;
import q2.InterfaceC1258a;
import q2.i;
import q3.C1263a;

/* JADX INFO: renamed from: n3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1154a implements InterfaceC1155b, e, InterfaceC1258a, InterfaceC0171b, InterfaceC0181l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11701w;

    public /* synthetic */ C1154a(int i6) {
        this.f11701w = i6;
    }

    @Override // E1.e
    public final Object apply(Object obj) {
        switch (this.f11701w) {
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                C1263a.f12380b.getClass();
                return C1156c.f11702a.c((P0) obj).getBytes(Charset.forName("UTF-8"));
            default:
                K3.e eVar = (K3.e) obj;
                eVar.getClass();
                C0343c c0343c = q.f1427a;
                c0343c.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c0343c.k(eVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // q2.InterfaceC1258a
    public final Object b(i iVar) {
        int i6;
        switch (this.f11701w) {
            case j.BYTES_FIELD_NUMBER /* 8 */:
                Object obj = C0055k.f1413c;
                i6 = 403;
                break;
            default:
                Object obj2 = C0055k.f1413c;
                i6 = -1;
                break;
        }
        return Integer.valueOf(i6);
    }

    @Override // n3.InterfaceC1155b
    public final Object c(JsonReader jsonReader) throws IOException {
        byte[] bArr;
        String strNextString = null;
        byte b6 = 0;
        switch (this.f11701w) {
            case d.f6312l /* 0 */:
                return C1156c.e(jsonReader);
            case 1:
                C0261b c0261b = new C0261b(7);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("filename")) {
                        String strNextString2 = jsonReader.nextString();
                        if (strNextString2 == null) {
                            throw new NullPointerException("Null filename");
                        }
                        c0261b.f5011x = strNextString2;
                    } else if (strNextName.equals("contents")) {
                        byte[] bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            throw new NullPointerException("Null contents");
                        }
                        c0261b.f5012y = bArrDecode;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                String str = (String) c0261b.f5011x;
                if (str != null && (bArr = (byte[]) c0261b.f5012y) != null) {
                    return new I(str, bArr);
                }
                StringBuilder sb = new StringBuilder();
                if (((String) c0261b.f5011x) == null) {
                    sb.append(" filename");
                }
                if (((byte[]) c0261b.f5012y) == null) {
                    sb.append(" contents");
                }
                throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                C1098f0 c1098f0 = new C1098f0();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    strNextName2.hashCode();
                    switch (strNextName2) {
                        case "parameterKey":
                            String strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null parameterKey");
                            }
                            c1098f0.f11505b = strNextString3;
                            break;
                            break;
                        case "templateVersion":
                            c1098f0.f11507d = jsonReader.nextLong();
                            c1098f0.f11508e = (byte) (c1098f0.f11508e | 1);
                            break;
                        case "rolloutVariant":
                            jsonReader.beginObject();
                            String strNextString4 = null;
                            String strNextString5 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName3 = jsonReader.nextName();
                                strNextName3.getClass();
                                if (strNextName3.equals("variantId")) {
                                    strNextString5 = jsonReader.nextString();
                                    if (strNextString5 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                } else if (strNextName3.equals("rolloutId")) {
                                    strNextString4 = jsonReader.nextString();
                                    if (strNextString4 == null) {
                                        throw new NullPointerException("Null rolloutId");
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (strNextString4 != null && strNextString5 != null) {
                                c1098f0.f11504a = new C1102h0(strNextString4, strNextString5);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                if (strNextString4 == null) {
                                    sb2.append(" rolloutId");
                                }
                                if (strNextString5 == null) {
                                    sb2.append(" variantId");
                                }
                                throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb2));
                            }
                            break;
                        case "parameterValue":
                            String strNextString6 = jsonReader.nextString();
                            if (strNextString6 == null) {
                                throw new NullPointerException("Null parameterValue");
                            }
                            c1098f0.f11506c = strNextString6;
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return c1098f0.a();
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                jsonReader.beginObject();
                List listD = null;
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName4 = jsonReader.nextName();
                    strNextName4.getClass();
                    strNextName4.hashCode();
                    switch (strNextName4) {
                        case "frames":
                            listD = C1156c.d(jsonReader, new C1154a(5));
                            if (listD == null) {
                                throw new NullPointerException("Null frames");
                            }
                            continue;
                            break;
                            break;
                        case "name":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case "importance":
                            iNextInt = jsonReader.nextInt();
                            b6 = (byte) (b6 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b6 == 1 && strNextString != null && listD != null) {
                    return new X(strNextString, iNextInt, listD);
                }
                StringBuilder sb3 = new StringBuilder();
                if (strNextString == null) {
                    sb3.append(" name");
                }
                if ((b6 & 1) == 0) {
                    sb3.append(" importance");
                }
                if (listD == null) {
                    sb3.append(" frames");
                }
                throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb3));
            case j.LONG_FIELD_NUMBER /* 4 */:
                jsonReader.beginObject();
                String str2 = null;
                String str3 = null;
                long jNextLong = 0;
                long jNextLong2 = 0;
                while (jsonReader.hasNext()) {
                    String strNextName5 = jsonReader.nextName();
                    strNextName5.getClass();
                    strNextName5.hashCode();
                    switch (strNextName5) {
                        case "name":
                            String strNextString7 = jsonReader.nextString();
                            if (strNextString7 == null) {
                                throw new NullPointerException("Null name");
                            }
                            str2 = strNextString7;
                            break;
                            break;
                        case "size":
                            b6 = (byte) (b6 | 2);
                            jNextLong2 = jsonReader.nextLong();
                            break;
                        case "uuid":
                            str3 = new String(Base64.decode(jsonReader.nextString(), 2), P0.f11400a);
                            break;
                        case "baseAddress":
                            b6 = (byte) (b6 | 1);
                            jNextLong = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b6 == 3 && str2 != null) {
                    return new U(jNextLong, jNextLong2, str2, str3);
                }
                StringBuilder sb4 = new StringBuilder();
                if ((b6 & 1) == 0) {
                    sb4.append(" baseAddress");
                }
                if ((b6 & 2) == 0) {
                    sb4.append(" size");
                }
                if (str2 == null) {
                    sb4.append(" name");
                }
                throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb4));
            case j.STRING_FIELD_NUMBER /* 5 */:
                return C1156c.a(jsonReader);
            default:
                return C1156c.a(jsonReader);
        }
    }
}
