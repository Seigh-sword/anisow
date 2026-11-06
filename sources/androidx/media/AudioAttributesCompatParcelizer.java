package androidx.media;

import H0.a;
import H0.c;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVarH = audioAttributesCompat.f5656a;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        audioAttributesCompat.f5656a = (AudioAttributesImpl) cVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f5656a;
        aVar.i(1);
        aVar.k(audioAttributesImpl);
    }
}
