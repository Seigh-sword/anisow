package m2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.C0526y1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends t1 {
    public static byte[] z(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i6 = inputStream.read(bArr);
                if (i6 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i6);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public final boolean A() {
        v();
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // m2.t1
    public final boolean x() {
        return false;
    }

    public final void y(String str, y1 y1Var, C0526y1 c0526y1, T t5) {
        r();
        v();
        try {
            URL url = new URI(y1Var.f11281a).toURL();
            s();
            byte[] bArrC = c0526y1.c();
            C1042h0 c1042h0G = g();
            Map mapEmptyMap = y1Var.f11282b;
            if (mapEmptyMap == null) {
                mapEmptyMap = Collections.emptyMap();
            }
            c1042h0G.y(new U(this, str, url, bArrC, mapEmptyMap, t5));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            N nF = f();
            nF.f10715B.b(N.x(str), y1Var.f11281a, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }
}
