package androidx.media;

import H0.a;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f5659a = aVar.f(audioAttributesImplBase.f5659a, 1);
        audioAttributesImplBase.f5660b = aVar.f(audioAttributesImplBase.f5660b, 2);
        audioAttributesImplBase.f5661c = aVar.f(audioAttributesImplBase.f5661c, 3);
        audioAttributesImplBase.f5662d = aVar.f(audioAttributesImplBase.f5662d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f5659a, 1);
        aVar.j(audioAttributesImplBase.f5660b, 2);
        aVar.j(audioAttributesImplBase.f5661c, 3);
        aVar.j(audioAttributesImplBase.f5662d, 4);
    }
}
