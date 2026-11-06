package D;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i6) {
        return builder.setContentType(i6);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i6) {
        return builder.setLegacyStreamType(i6);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i6) {
        return builder.setUsage(i6);
    }
}
