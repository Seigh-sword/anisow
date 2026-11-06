package com.google.firebase.messaging.ktx;

import S3.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0654b;
import f2.h;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseMessagingLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0654b> getComponents() {
        return a.D(h.j("fire-fcm-ktx", "24.0.2"));
    }
}
