package com.android.app.models;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerConfig {
    private final String activityName;
    private final String downloadUrl;
    private final String packageName;
    private final String playerDesc;
    private final String playerIcon;
    private final String playerName;

    public PlayerConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC1305a.o(str, "playerName");
        AbstractC1305a.o(str2, "playerDesc");
        AbstractC1305a.o(str3, "packageName");
        AbstractC1305a.o(str4, "activityName");
        AbstractC1305a.o(str5, "downloadUrl");
        AbstractC1305a.o(str6, "playerIcon");
        this.playerName = str;
        this.playerDesc = str2;
        this.packageName = str3;
        this.activityName = str4;
        this.downloadUrl = str5;
        this.playerIcon = str6;
    }

    public static /* synthetic */ PlayerConfig copy$default(PlayerConfig playerConfig, String str, String str2, String str3, String str4, String str5, String str6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = playerConfig.playerName;
        }
        if ((i6 & 2) != 0) {
            str2 = playerConfig.playerDesc;
        }
        String str7 = str2;
        if ((i6 & 4) != 0) {
            str3 = playerConfig.packageName;
        }
        String str8 = str3;
        if ((i6 & 8) != 0) {
            str4 = playerConfig.activityName;
        }
        String str9 = str4;
        if ((i6 & 16) != 0) {
            str5 = playerConfig.downloadUrl;
        }
        String str10 = str5;
        if ((i6 & 32) != 0) {
            str6 = playerConfig.playerIcon;
        }
        return playerConfig.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.playerName;
    }

    public final String component2() {
        return this.playerDesc;
    }

    public final String component3() {
        return this.packageName;
    }

    public final String component4() {
        return this.activityName;
    }

    public final String component5() {
        return this.downloadUrl;
    }

    public final String component6() {
        return this.playerIcon;
    }

    public final PlayerConfig copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC1305a.o(str, "playerName");
        AbstractC1305a.o(str2, "playerDesc");
        AbstractC1305a.o(str3, "packageName");
        AbstractC1305a.o(str4, "activityName");
        AbstractC1305a.o(str5, "downloadUrl");
        AbstractC1305a.o(str6, "playerIcon");
        return new PlayerConfig(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerConfig)) {
            return false;
        }
        PlayerConfig playerConfig = (PlayerConfig) obj;
        return AbstractC1305a.c(this.playerName, playerConfig.playerName) && AbstractC1305a.c(this.playerDesc, playerConfig.playerDesc) && AbstractC1305a.c(this.packageName, playerConfig.packageName) && AbstractC1305a.c(this.activityName, playerConfig.activityName) && AbstractC1305a.c(this.downloadUrl, playerConfig.downloadUrl) && AbstractC1305a.c(this.playerIcon, playerConfig.playerIcon);
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPlayerDesc() {
        return this.playerDesc;
    }

    public final String getPlayerIcon() {
        return this.playerIcon;
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public int hashCode() {
        return this.playerIcon.hashCode() + AbstractC0628i.e(this.downloadUrl, AbstractC0628i.e(this.activityName, AbstractC0628i.e(this.packageName, AbstractC0628i.e(this.playerDesc, this.playerName.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        return "PlayerConfig(playerName=" + this.playerName + ", playerDesc=" + this.playerDesc + ", packageName=" + this.packageName + ", activityName=" + this.activityName + ", downloadUrl=" + this.downloadUrl + ", playerIcon=" + this.playerIcon + ')';
    }
}
