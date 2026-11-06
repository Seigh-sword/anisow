package h1;

import com.bumptech.glide.k;
import java.io.File;

/* JADX INFO: renamed from: h1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0763c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File[] f8943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File[] f8944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f8946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0765e f8948h;

    public C0763c(C0765e c0765e, String str) {
        this.f8948h = c0765e;
        this.f8941a = str;
        int i6 = c0765e.f8956C;
        this.f8942b = new long[i6];
        this.f8943c = new File[i6];
        this.f8944d = new File[i6];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i7 = 0; i7 < c0765e.f8956C; i7++) {
            sb.append(i7);
            File[] fileArr = this.f8943c;
            String string = sb.toString();
            File file = c0765e.f8964w;
            fileArr[i7] = new File(file, string);
            sb.append(".tmp");
            this.f8944d[i7] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j6 : this.f8942b) {
            sb.append(' ');
            sb.append(j6);
        }
        return sb.toString();
    }
}
