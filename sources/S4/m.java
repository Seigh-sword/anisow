package S4;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3336b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3337c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3338d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3339e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f3340a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3337c;
        if (atomicIntegerFieldUpdater.get(this) - f3338d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f3325x.f1108w == 1) {
            f3339e.incrementAndGet(this);
        }
        int i6 = atomicIntegerFieldUpdater.get(this) & ModuleDescriptor.MODULE_VERSION;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f3340a;
            if (atomicReferenceArray.get(i6) == null) {
                atomicReferenceArray.lazySet(i6, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3338d;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 - f3337c.get(this) == 0) {
                return null;
            }
            int i7 = i6 & ModuleDescriptor.MODULE_VERSION;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i6, i6 + 1) && (iVar = (i) this.f3340a.getAndSet(i7, null)) != null) {
                if (iVar.f3325x.f1108w == 1) {
                    f3339e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i6, boolean z5) {
        int i7 = i6 & ModuleDescriptor.MODULE_VERSION;
        AtomicReferenceArray atomicReferenceArray = this.f3340a;
        i iVar = (i) atomicReferenceArray.get(i7);
        if (iVar != null) {
            if ((iVar.f3325x.f1108w == 1) == z5) {
                while (!atomicReferenceArray.compareAndSet(i7, iVar, null)) {
                    if (atomicReferenceArray.get(i7) != iVar) {
                    }
                }
                if (z5) {
                    f3339e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
