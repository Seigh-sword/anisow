package P3;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f2538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f2539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f2540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f2541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f2542e;

    public i(Boolean bool, Double d6, Integer num, Integer num2, Long l5) {
        this.f2538a = bool;
        this.f2539b = d6;
        this.f2540c = num;
        this.f2541d = num2;
        this.f2542e = l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC1305a.c(this.f2538a, iVar.f2538a) && AbstractC1305a.c(this.f2539b, iVar.f2539b) && AbstractC1305a.c(this.f2540c, iVar.f2540c) && AbstractC1305a.c(this.f2541d, iVar.f2541d) && AbstractC1305a.c(this.f2542e, iVar.f2542e);
    }

    public final int hashCode() {
        Boolean bool = this.f2538a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d6 = this.f2539b;
        int iHashCode2 = (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.f2540c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f2541d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.f2542e;
        return iHashCode4 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f2538a + ", sessionSamplingRate=" + this.f2539b + ", sessionRestartTimeout=" + this.f2540c + ", cacheDuration=" + this.f2541d + ", cacheUpdatedTime=" + this.f2542e + ')';
    }
}
