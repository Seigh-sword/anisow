package androidx.media;

import H0.a;
import H0.b;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f5657a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f5657a, 1);
        audioAttributesImplApi21.f5658b = aVar.f(audioAttributesImplApi21.f5658b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f5657a;
        aVar.i(1);
        ((b) aVar).f897e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f5658b, 2);
    }
}
