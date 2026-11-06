package j3;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import p3.C1249a;

/* JADX INFO: renamed from: j3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0858h implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9469a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f9469a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                Charset charset = C1249a.f12307e;
                return str.startsWith("event");
            default:
                Charset charset2 = C1249a.f12307e;
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
