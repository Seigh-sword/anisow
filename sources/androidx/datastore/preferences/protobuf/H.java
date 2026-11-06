package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class H extends IOException {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5372w;

    public static H a() {
        return new H("Protocol message had invalid UTF-8.");
    }

    public static G b() {
        return new G("Protocol message tag had invalid wire type.");
    }

    public static H c() {
        return new H("CodedInputStream encountered a malformed varint.");
    }

    public static H d() {
        return new H("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static H e() {
        return new H("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
