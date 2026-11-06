package f5;

import j3.C0871u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class t extends s {
    public static Long i(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // f5.s, f5.m
    public final void a(w wVar, w wVar2) throws IOException {
        AbstractC1305a.o(wVar2, "target");
        try {
            Files.move(wVar.f(), wVar2.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e6) {
            throw new FileNotFoundException(e6.getMessage());
        }
    }

    @Override // f5.s, f5.m
    public final C0871u e(w wVar) {
        w wVarO;
        AbstractC1305a.o(wVar, "path");
        Path pathF = wVar.f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathF, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathF) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = w.f8492x;
                wVarO = B3.e.o(symbolicLink.toString(), false);
            } else {
                wVarO = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lI = fileTimeCreationTime != null ? i(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lI2 = fileTimeLastModifiedTime != null ? i(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C0871u(zIsRegularFile, zIsDirectory, wVarO, lValueOf, lI, lI2, fileTimeLastAccessTime != null ? i(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // f5.s
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
