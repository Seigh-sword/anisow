package b5;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0347c[] f5981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f5982b;

    static {
        C0347c c0347c = new C0347c(C0347c.f5961i, "");
        f5.j jVar = C0347c.f5958f;
        C0347c c0347c2 = new C0347c(jVar, "GET");
        C0347c c0347c3 = new C0347c(jVar, "POST");
        f5.j jVar2 = C0347c.f5959g;
        C0347c c0347c4 = new C0347c(jVar2, "/");
        C0347c c0347c5 = new C0347c(jVar2, "/index.html");
        f5.j jVar3 = C0347c.f5960h;
        C0347c c0347c6 = new C0347c(jVar3, "http");
        C0347c c0347c7 = new C0347c(jVar3, "https");
        f5.j jVar4 = C0347c.f5957e;
        C0347c[] c0347cArr = {c0347c, c0347c2, c0347c3, c0347c4, c0347c5, c0347c6, c0347c7, new C0347c(jVar4, "200"), new C0347c(jVar4, "204"), new C0347c(jVar4, "206"), new C0347c(jVar4, "304"), new C0347c(jVar4, "400"), new C0347c(jVar4, "404"), new C0347c(jVar4, "500"), new C0347c("accept-charset", ""), new C0347c("accept-encoding", "gzip, deflate"), new C0347c("accept-language", ""), new C0347c("accept-ranges", ""), new C0347c("accept", ""), new C0347c("access-control-allow-origin", ""), new C0347c("age", ""), new C0347c("allow", ""), new C0347c("authorization", ""), new C0347c("cache-control", ""), new C0347c("content-disposition", ""), new C0347c("content-encoding", ""), new C0347c("content-language", ""), new C0347c("content-length", ""), new C0347c("content-location", ""), new C0347c("content-range", ""), new C0347c("content-type", ""), new C0347c("cookie", ""), new C0347c("date", ""), new C0347c("etag", ""), new C0347c("expect", ""), new C0347c("expires", ""), new C0347c("from", ""), new C0347c("host", ""), new C0347c("if-match", ""), new C0347c("if-modified-since", ""), new C0347c("if-none-match", ""), new C0347c("if-range", ""), new C0347c("if-unmodified-since", ""), new C0347c("last-modified", ""), new C0347c("link", ""), new C0347c("location", ""), new C0347c("max-forwards", ""), new C0347c("proxy-authenticate", ""), new C0347c("proxy-authorization", ""), new C0347c("range", ""), new C0347c("referer", ""), new C0347c("refresh", ""), new C0347c("retry-after", ""), new C0347c("server", ""), new C0347c("set-cookie", ""), new C0347c("strict-transport-security", ""), new C0347c("transfer-encoding", ""), new C0347c("user-agent", ""), new C0347c("vary", ""), new C0347c("via", ""), new C0347c("www-authenticate", "")};
        f5981a = c0347cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0347cArr.length);
        for (int i6 = 0; i6 < c0347cArr.length; i6++) {
            if (!linkedHashMap.containsKey(c0347cArr[i6].f5962a)) {
                linkedHashMap.put(c0347cArr[i6].f5962a, Integer.valueOf(i6));
            }
        }
        f5982b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(f5.j jVar) throws IOException {
        int iD = jVar.d();
        for (int i6 = 0; i6 < iD; i6++) {
            byte bI = jVar.i(i6);
            if (bI >= 65 && bI <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.q()));
            }
        }
    }
}
