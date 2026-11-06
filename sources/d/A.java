package D;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i6) {
        return builder.setSemanticAction(i6);
    }
}
