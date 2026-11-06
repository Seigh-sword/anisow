package w0;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import t0.AbstractC1332d;
import y0.C1494a;

/* JADX INFO: loaded from: classes.dex */
public final class s implements A0.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final A0.d f13552A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1446a f13553B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13554C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f13555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f13556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final File f13557y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f13558z;

    public s(Context context, String str, File file, int i6, A0.d dVar) {
        this.f13555w = context;
        this.f13556x = str;
        this.f13557y = file;
        this.f13558z = i6;
        this.f13552A = dVar;
    }

    @Override // A0.d
    public final synchronized A0.a C() {
        try {
            if (!this.f13554C) {
                c();
                this.f13554C = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13552A.C();
    }

    public final void b(File file) throws IOException {
        ReadableByteChannel channel;
        Context context = this.f13555w;
        String str = this.f13556x;
        if (str != null) {
            channel = Channels.newChannel(context.getAssets().open(str));
        } else {
            File file2 = this.f13557y;
            if (file2 == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(file2).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(fileCreateTempFile).getChannel();
        try {
            channel2.transferFrom(channel, 0L, Long.MAX_VALUE);
            channel2.force(false);
            channel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th) {
            channel.close();
            channel2.close();
            throw th;
        }
    }

    public final void c() {
        String databaseName = this.f13552A.getDatabaseName();
        Context context = this.f13555w;
        File databasePath = context.getDatabasePath(databaseName);
        C1494a c1494a = new C1494a(databaseName, context.getFilesDir(), this.f13553B == null);
        try {
            c1494a.f13692b.lock();
            if (c1494a.f13693c) {
                try {
                    FileChannel channel = new FileOutputStream(c1494a.f13691a).getChannel();
                    c1494a.f13694d = channel;
                    channel.lock();
                } catch (IOException e6) {
                    throw new IllegalStateException("Unable to grab copy lock.", e6);
                }
            }
            if (!databasePath.exists()) {
                try {
                    b(databasePath);
                    c1494a.a();
                    return;
                } catch (IOException e7) {
                    throw new RuntimeException("Unable to copy database file.", e7);
                }
            }
            if (this.f13553B == null) {
                c1494a.a();
                return;
            }
            try {
                int iO0 = AbstractC1332d.o0(databasePath);
                int i6 = this.f13558z;
                if (iO0 == i6) {
                    c1494a.a();
                    return;
                }
                if (this.f13553B.a(iO0, i6)) {
                    c1494a.a();
                    return;
                }
                if (context.deleteDatabase(databaseName)) {
                    try {
                        b(databasePath);
                    } catch (IOException e8) {
                        Log.w("ROOM", "Unable to copy database file.", e8);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c1494a.a();
                return;
            } catch (IOException e9) {
                Log.w("ROOM", "Unable to read database version.", e9);
                c1494a.a();
                return;
            }
        } catch (Throwable th) {
            c1494a.a();
            throw th;
        }
        c1494a.a();
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f13552A.close();
        this.f13554C = false;
    }

    @Override // A0.d
    public final String getDatabaseName() {
        return this.f13552A.getDatabaseName();
    }

    @Override // A0.d
    public final void setWriteAheadLoggingEnabled(boolean z5) {
        this.f13552A.setWriteAheadLoggingEnabled(z5);
    }
}
