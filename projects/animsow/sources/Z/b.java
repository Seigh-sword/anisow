package Z;

import Z0.m;
import Z0.p;
import android.content.Context;
import com.android.app.activities.HomeActivity;
import com.android.app.models.Message;
import java.io.File;
import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4903x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f4904y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f4905z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i6, Object obj2) {
        super(0);
        this.f4903x = i6;
        this.f4904y = obj;
        this.f4905z = obj2;
    }

    @Override // C4.a
    public final Object b() throws Throwable {
        int i6 = this.f4903x;
        Object obj = this.f4905z;
        Object obj2 = this.f4904y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Context context = (Context) obj2;
                AbstractC1305a.n(context, "applicationContext");
                String str = ((c) obj).f4906a;
                AbstractC1305a.o(str, "name");
                String strConcat = str.concat(".preferences_pb");
                AbstractC1305a.o(strConcat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(strConcat));
            default:
                Message message = (Message) obj2;
                if (message.getForce()) {
                    ((HomeActivity) obj).n();
                }
                if (!message.getPersistent()) {
                    p pVarO = ((HomeActivity) obj).o();
                    String id = message.getId();
                    pVarO.getClass();
                    AbstractC1305a.o(id, "messageID");
                    S3.a.J(new m(pVarO, id, null));
                }
                return C1316l.f12640a;
        }
    }
}
