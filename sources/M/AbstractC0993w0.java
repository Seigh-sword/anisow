package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: m.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0993w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f10401a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f10401a = declaredField;
    }
}
