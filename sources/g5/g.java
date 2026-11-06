package g5;

import C4.p;
import D4.i;
import D4.o;
import D4.q;
import f5.y;
import java.io.IOException;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ f5.i f8553A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ q f8554B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ q f8555C;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f8556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f8557y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ q f8558z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, long j6, q qVar, y yVar, q qVar2, q qVar3) {
        super(2);
        this.f8556x = oVar;
        this.f8557y = j6;
        this.f8558z = qVar;
        this.f8553A = yVar;
        this.f8554B = qVar2;
        this.f8555C = qVar3;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            o oVar = this.f8556x;
            if (oVar.f374w) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            oVar.f374w = true;
            if (jLongValue < this.f8557y) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            q qVar = this.f8558z;
            long jO = qVar.f376w;
            f5.i iVar = this.f8553A;
            if (jO == 4294967295L) {
                jO = iVar.o();
            }
            qVar.f376w = jO;
            q qVar2 = this.f8554B;
            qVar2.f376w = qVar2.f376w == 4294967295L ? iVar.o() : 0L;
            q qVar3 = this.f8555C;
            qVar3.f376w = qVar3.f376w == 4294967295L ? iVar.o() : 0L;
        }
        return C1316l.f12640a;
    }
}
