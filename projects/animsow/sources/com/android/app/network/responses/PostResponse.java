package com.android.app.network.responses;

import com.android.app.models.PlayerConfig;
import com.android.app.models.Post;
import com.android.app.models.Season;
import d.AbstractC0628i;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class PostResponse {
    private final String age;
    private final String genres;
    private final int id;
    private final boolean isDemo;
    private final String overview;
    private final PlayerConfig playerConfig;
    private final String poster;
    private final String premiered;
    private final String rating;
    private final List<Post> related;
    private final String runtime;
    private final Float score;
    private final List<Season> seasons;
    private final String share;
    private final List<Post> similar;
    private final String status;
    private final String title;
    private final String type;

    public PostResponse(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Float f6, String str10, String str11, List<Season> list, List<Post> list2, List<Post> list3, PlayerConfig playerConfig, boolean z5) {
        AbstractC1305a.o(str, "type");
        AbstractC1305a.o(str2, "title");
        AbstractC1305a.o(str11, "share");
        AbstractC1305a.o(list, "seasons");
        AbstractC1305a.o(list2, "related");
        AbstractC1305a.o(list3, "similar");
        AbstractC1305a.o(playerConfig, "playerConfig");
        this.id = i6;
        this.type = str;
        this.title = str2;
        this.poster = str3;
        this.overview = str4;
        this.status = str5;
        this.runtime = str6;
        this.premiered = str7;
        this.rating = str8;
        this.age = str9;
        this.score = f6;
        this.genres = str10;
        this.share = str11;
        this.seasons = list;
        this.related = list2;
        this.similar = list3;
        this.playerConfig = playerConfig;
        this.isDemo = z5;
    }

    public final int component1() {
        return this.id;
    }

    public final String component10() {
        return this.age;
    }

    public final Float component11() {
        return this.score;
    }

    public final String component12() {
        return this.genres;
    }

    public final String component13() {
        return this.share;
    }

    public final List<Season> component14() {
        return this.seasons;
    }

    public final List<Post> component15() {
        return this.related;
    }

    public final List<Post> component16() {
        return this.similar;
    }

    public final PlayerConfig component17() {
        return this.playerConfig;
    }

    public final boolean component18() {
        return this.isDemo;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.poster;
    }

    public final String component5() {
        return this.overview;
    }

    public final String component6() {
        return this.status;
    }

    public final String component7() {
        return this.runtime;
    }

    public final String component8() {
        return this.premiered;
    }

    public final String component9() {
        return this.rating;
    }

    public final PostResponse copy(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Float f6, String str10, String str11, List<Season> list, List<Post> list2, List<Post> list3, PlayerConfig playerConfig, boolean z5) {
        AbstractC1305a.o(str, "type");
        AbstractC1305a.o(str2, "title");
        AbstractC1305a.o(str11, "share");
        AbstractC1305a.o(list, "seasons");
        AbstractC1305a.o(list2, "related");
        AbstractC1305a.o(list3, "similar");
        AbstractC1305a.o(playerConfig, "playerConfig");
        return new PostResponse(i6, str, str2, str3, str4, str5, str6, str7, str8, str9, f6, str10, str11, list, list2, list3, playerConfig, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostResponse)) {
            return false;
        }
        PostResponse postResponse = (PostResponse) obj;
        return this.id == postResponse.id && AbstractC1305a.c(this.type, postResponse.type) && AbstractC1305a.c(this.title, postResponse.title) && AbstractC1305a.c(this.poster, postResponse.poster) && AbstractC1305a.c(this.overview, postResponse.overview) && AbstractC1305a.c(this.status, postResponse.status) && AbstractC1305a.c(this.runtime, postResponse.runtime) && AbstractC1305a.c(this.premiered, postResponse.premiered) && AbstractC1305a.c(this.rating, postResponse.rating) && AbstractC1305a.c(this.age, postResponse.age) && AbstractC1305a.c(this.score, postResponse.score) && AbstractC1305a.c(this.genres, postResponse.genres) && AbstractC1305a.c(this.share, postResponse.share) && AbstractC1305a.c(this.seasons, postResponse.seasons) && AbstractC1305a.c(this.related, postResponse.related) && AbstractC1305a.c(this.similar, postResponse.similar) && AbstractC1305a.c(this.playerConfig, postResponse.playerConfig) && this.isDemo == postResponse.isDemo;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getGenres() {
        return this.genres;
    }

    public final int getId() {
        return this.id;
    }

    public final String getOverview() {
        return this.overview;
    }

    public final PlayerConfig getPlayerConfig() {
        return this.playerConfig;
    }

    public final String getPoster() {
        return this.poster;
    }

    public final String getPremiered() {
        return this.premiered;
    }

    public final String getRating() {
        return this.rating;
    }

    public final List<Post> getRelated() {
        return this.related;
    }

    public final String getRuntime() {
        return this.runtime;
    }

    public final Float getScore() {
        return this.score;
    }

    public final List<Season> getSeasons() {
        return this.seasons;
    }

    public final String getShare() {
        return this.share;
    }

    public final List<Post> getSimilar() {
        return this.similar;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iE = AbstractC0628i.e(this.title, AbstractC0628i.e(this.type, Integer.hashCode(this.id) * 31, 31), 31);
        String str = this.poster;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overview;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.runtime;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.premiered;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rating;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.age;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f6 = this.score;
        int iHashCode8 = (iHashCode7 + (f6 == null ? 0 : f6.hashCode())) * 31;
        String str8 = this.genres;
        return Boolean.hashCode(this.isDemo) + ((this.playerConfig.hashCode() + ((this.similar.hashCode() + ((this.related.hashCode() + ((this.seasons.hashCode() + AbstractC0628i.e(this.share, (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isDemo() {
        return this.isDemo;
    }

    public String toString() {
        return "PostResponse(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", poster=" + this.poster + ", overview=" + this.overview + ", status=" + this.status + ", runtime=" + this.runtime + ", premiered=" + this.premiered + ", rating=" + this.rating + ", age=" + this.age + ", score=" + this.score + ", genres=" + this.genres + ", share=" + this.share + ", seasons=" + this.seasons + ", related=" + this.related + ", similar=" + this.similar + ", playerConfig=" + this.playerConfig + ", isDemo=" + this.isDemo + ')';
    }
}
