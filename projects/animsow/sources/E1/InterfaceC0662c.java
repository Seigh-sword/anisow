package e1;

import com.android.app.models.MyList;
import com.android.app.network.responses.CategoriesResponse;
import com.android.app.network.responses.ConfigResponse;
import com.android.app.network.responses.HomeResponse;
import com.android.app.network.responses.PostResponse;
import com.android.app.network.responses.PostsResponse;
import j5.f;
import j5.o;
import j5.t;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: e1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0662c {
    @f("latest")
    Object a(@t("page") int i6, InterfaceC1427e<? super PostsResponse> interfaceC1427e);

    @o("list")
    Object b(@j5.a MyList myList, @t("page") int i6, InterfaceC1427e<? super PostsResponse> interfaceC1427e);

    @f("category")
    Object c(@t("id") int i6, @t("page") int i7, InterfaceC1427e<? super PostsResponse> interfaceC1427e);

    @f("categories")
    Object d(InterfaceC1427e<? super CategoriesResponse> interfaceC1427e);

    @f("post")
    Object e(@t("id") int i6, InterfaceC1427e<? super PostResponse> interfaceC1427e);

    @f("home")
    Object f(InterfaceC1427e<? super HomeResponse> interfaceC1427e);

    @f("search")
    Object g(@t("query") String str, @t("page") int i6, InterfaceC1427e<? super PostsResponse> interfaceC1427e);

    @f("config")
    Object h(InterfaceC1427e<? super ConfigResponse> interfaceC1427e);
}
