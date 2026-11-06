package g5;

import C4.p;
import D4.i;
import D4.r;
import f5.y;
import java.io.IOException;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ r f8559A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f5.i f8560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f8561y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f8562z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y yVar, r rVar, r rVar2, r rVar3) {
        super(2);
        this.f8560x = yVar;
        this.f8561y = rVar;
        this.f8562z = rVar2;
        this.f8559A = rVar3;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            f5.i iVar = this.f8560x;
            byte b6 = iVar.readByte();
            boolean z5 = (b6 & 1) == 1;
            boolean z6 = (b6 & 2) == 2;
            boolean z7 = (b6 & 4) == 4;
            long j6 = z5 ? 5L : 1L;
            if (z6) {
                j6 += 4;
            }
            if (z7) {
                j6 += 4;
            }
            if (jLongValue < j6) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z5) {
                this.f8561y.f377w = Long.valueOf(((long) iVar.A()) * 1000);
            }
            if (z6) {
                this.f8562z.f377w = Long.valueOf(((long) iVar.A()) * 1000);
            }
            if (z7) {
                this.f8559A.f377w = Long.valueOf(((long) iVar.A()) * 1000);
            }
        }
        return C1316l.f12640a;
    }
}
