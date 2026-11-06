package com.google.android.datatransport.cct;

import F1.d;
import I1.b;
import I1.c;
import I1.h;
import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory {
    public h create(c cVar) {
        Context context = ((b) cVar).f1121a;
        b bVar = (b) cVar;
        return new d(context, bVar.f1122b, bVar.f1123c);
    }
}
