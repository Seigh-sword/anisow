package com.android.app.network.responses;

import com.android.app.models.Post;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class PostsResponse {
    private final List<Post> posts;

    public PostsResponse(List<Post> list) {
        AbstractC1305a.o(list, "posts");
        this.posts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostsResponse copy$default(PostsResponse postsResponse, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = postsResponse.posts;
        }
        return postsResponse.copy(list);
    }

    public final List<Post> component1() {
        return this.posts;
    }

    public final PostsResponse copy(List<Post> list) {
        AbstractC1305a.o(list, "posts");
        return new PostsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostsResponse) && AbstractC1305a.c(this.posts, ((PostsResponse) obj).posts);
    }

    public final List<Post> getPosts() {
        return this.posts;
    }

    public int hashCode() {
        return this.posts.hashCode();
    }

    public String toString() {
        return "PostsResponse(posts=" + this.posts + ')';
    }
}
