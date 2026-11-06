package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Q2 extends IOException {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f6665w = 0;

    public static Q2 a() {
        return new Q2("Protocol message had invalid UTF-8.");
    }

    public static Q2 b() {
        return new Q2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static Q2 c() {
        return new Q2("Failed to parse the message.");
    }

    public static Q2 d() {
        return new Q2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
