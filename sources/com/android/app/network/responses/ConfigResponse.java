package com.android.app.network.responses;

import com.android.app.models.Message;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigResponse {
    private final List<Message> messages;

    public ConfigResponse(List<Message> list) {
        AbstractC1305a.o(list, "messages");
        this.messages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigResponse copy$default(ConfigResponse configResponse, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = configResponse.messages;
        }
        return configResponse.copy(list);
    }

    public final List<Message> component1() {
        return this.messages;
    }

    public final ConfigResponse copy(List<Message> list) {
        AbstractC1305a.o(list, "messages");
        return new ConfigResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfigResponse) && AbstractC1305a.c(this.messages, ((ConfigResponse) obj).messages);
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode();
    }

    public String toString() {
        return "ConfigResponse(messages=" + this.messages + ')';
    }
}
