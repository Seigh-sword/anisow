package h5;

import d2.AbstractC0651b;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0651b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC0790q f9007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9008k;

    public G(String str, boolean z5, int i6) {
        C0777d c0777d = C0777d.f9105w;
        this.f9005h = i6;
        if (i6 == 1) {
            Objects.requireNonNull(str, "name == null");
            this.f9006i = str;
            this.f9007j = c0777d;
            this.f9008k = z5;
            return;
        }
        if (i6 != 2) {
            Objects.requireNonNull(str, "name == null");
            this.f9006i = str;
            this.f9007j = c0777d;
            this.f9008k = z5;
            return;
        }
        Objects.requireNonNull(str, "name == null");
        this.f9006i = str;
        this.f9007j = c0777d;
        this.f9008k = z5;
    }

    @Override // d2.AbstractC0651b
    public final void a(Q q5, Object obj) {
        String str;
        String str2;
        String str3;
        int i6 = this.f9005h;
        boolean z5 = this.f9008k;
        String str4 = this.f9006i;
        InterfaceC0790q interfaceC0790q = this.f9007j;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (obj != null && (str = (String) interfaceC0790q.k(obj)) != null) {
                    q5.a(str4, str, z5);
                }
                break;
            case 1:
                if (obj != null && (str2 = (String) interfaceC0790q.k(obj)) != null) {
                    q5.b(str4, str2, z5);
                }
                break;
            default:
                if (obj != null && (str3 = (String) interfaceC0790q.k(obj)) != null) {
                    q5.d(str4, str3, z5);
                }
                break;
        }
    }
}
