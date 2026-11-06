package V1;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class e extends Exception {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Status f3707w;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Status status) {
        int i6 = status.f6435w;
        String str = status.f6436x;
        super(i6 + ": " + (str == null ? "" : str));
        this.f3707w = status;
    }
}
