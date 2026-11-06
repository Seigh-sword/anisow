package f5;

import j3.C0871u;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class s extends m {
    @Override // f5.m
    public void a(w wVar, w wVar2) throws IOException {
        AbstractC1305a.o(wVar2, "target");
        if (wVar.e().renameTo(wVar2.e())) {
            return;
        }
        throw new IOException("failed to move " + wVar + " to " + wVar2);
    }

    @Override // f5.m
    public final void b(w wVar) throws IOException {
        if (wVar.e().mkdir()) {
            return;
        }
        C0871u c0871uE = e(wVar);
        if (c0871uE == null || !c0871uE.f9542c) {
            throw new IOException("failed to create directory: " + wVar);
        }
    }

    @Override // f5.m
    public final void c(w wVar) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = wVar.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + wVar);
    }

    @Override // f5.m
    public C0871u e(w wVar) {
        AbstractC1305a.o(wVar, "path");
        File fileE = wVar.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !fileE.exists()) {
            return null;
        }
        return new C0871u(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // f5.m
    public final r f(w wVar) {
        AbstractC1305a.o(wVar, "file");
        return new r(false, new RandomAccessFile(wVar.e(), "r"));
    }

    @Override // f5.m
    public final r g(w wVar) {
        return new r(true, new RandomAccessFile(wVar.e(), "rw"));
    }

    @Override // f5.m
    public final E h(w wVar) {
        AbstractC1305a.o(wVar, "file");
        File fileE = wVar.e();
        Logger logger = u.f8489a;
        return new C0706c(new FileInputStream(fileE), G.f8433d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
