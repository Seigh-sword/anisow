package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import d.AbstractC0628i;
import j1.EnumC0843a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile boolean f6381A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p1.o f6382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HttpURLConnection f6384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InputStream f6385z;

    public l(p1.o oVar, int i6) {
        this.f6382w = oVar;
        this.f6383x = i6;
    }

    public static int a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e6);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        InputStream inputStream = this.f6385z;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6384y;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6384y = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f6381A = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9425x;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, d dVar) {
        StringBuilder sb;
        p1.o oVar = this.f6382w;
        int i6 = C1.h.f123b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.l(f(oVar.d(), 0, null, oVar.f12265b.a()));
            } catch (IOException e6) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e6);
                }
                dVar.h(e6);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder("Finished http url fetcher fetch in ");
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(C1.h.a(jElapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C1.h.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i6, URL url2, Map map) throws j1.d {
        InputStream inputStream;
        if (i6 >= 5) {
            throw new j1.d(-1, "Too many (> 5) redirects!", null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new j1.d(-1, "In re-direct loop", null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i7 = this.f6383x;
            httpURLConnection.setConnectTimeout(i7);
            httpURLConnection.setReadTimeout(i7);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f6384y = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f6385z = this.f6384y.getInputStream();
                if (this.f6381A) {
                    return null;
                }
                int iA = a(this.f6384y);
                int i8 = iA / 100;
                if (i8 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f6384y;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            inputStream = new C1.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            inputStream = httpURLConnection2.getInputStream();
                        }
                        this.f6385z = inputStream;
                        return this.f6385z;
                    } catch (IOException e6) {
                        throw new j1.d(a(httpURLConnection2), "Failed to obtain InputStream", e6);
                    }
                }
                if (i8 != 3) {
                    if (iA == -1) {
                        throw new j1.d(iA, "Http request failed", null);
                    }
                    try {
                        throw new j1.d(iA, this.f6384y.getResponseMessage(), null);
                    } catch (IOException e7) {
                        throw new j1.d(iA, "Failed to get a response message", e7);
                    }
                }
                String headerField = this.f6384y.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new j1.d(iA, "Received empty or null redirect url", null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    c();
                    return f(url3, i6 + 1, url, map);
                } catch (MalformedURLException e8) {
                    throw new j1.d(iA, AbstractC0628i.q("Bad redirect url: ", headerField), e8);
                }
            } catch (IOException e9) {
                throw new j1.d(a(this.f6384y), "Failed to connect or obtain data", e9);
            }
        } catch (IOException e10) {
            throw new j1.d(0, "URL.openConnection threw", e10);
        }
    }
}
