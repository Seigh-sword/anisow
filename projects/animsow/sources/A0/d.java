package A0;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface d extends Closeable {
    a C();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z5);
}
