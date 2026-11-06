package a1;

import Q3.n;
import V0.j;
import V0.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.app.models.PlayerConfig;
import com.xo.anilab.R;
import m.C0996y;
import s1.C1299h;
import s1.z;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import y2.C1507i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends C1507i {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final /* synthetic */ int f5004M0 = 0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C0996y f5005K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public PlayerConfig f5006L0;

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, h0.AbstractComponentCallbacksC0734B
    public final void A(Bundle bundle) {
        super.A(bundle);
        Bundle bundle2 = this.f8591B;
        if (bundle2 != null) {
            Object objB = new n().b(PlayerConfig.class, bundle2.getString("PLAYER_DATA"));
            AbstractC1305a.n(objB, "fromJson(...)");
            this.f5006L0 = (PlayerConfig) objB;
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC1305a.o(layoutInflater, "inflater");
        LayoutInflater layoutInflaterF = this.f8623h0;
        if (layoutInflaterF == null) {
            layoutInflaterF = F(null);
            this.f8623h0 = layoutInflaterF;
        }
        View viewInflate = layoutInflaterF.inflate(R.layout.bottom_sheet_player, (ViewGroup) null, false);
        int i6 = R.id.actionBtn;
        LinearLayout linearLayout = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.actionBtn);
        if (linearLayout != null) {
            i6 = R.id.close_icon;
            ImageView imageView = (ImageView) AbstractC1332d.E(viewInflate, R.id.close_icon);
            if (imageView != null) {
                i6 = R.id.icon;
                ImageView imageView2 = (ImageView) AbstractC1332d.E(viewInflate, R.id.icon);
                if (imageView2 != null) {
                    i6 = R.id.message;
                    TextView textView = (TextView) AbstractC1332d.E(viewInflate, R.id.message);
                    if (textView != null) {
                        i6 = R.id.title;
                        TextView textView2 = (TextView) AbstractC1332d.E(viewInflate, R.id.title);
                        if (textView2 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                            this.f5005K0 = new C0996y(linearLayout2, linearLayout, imageView, imageView2, textView, textView2);
                            AbstractC1305a.n(linearLayout2, "getRoot(...)");
                            return linearLayout2;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void K(View view) {
        final int i6 = 1;
        final int i7 = 0;
        AbstractC1305a.o(view, "view");
        C0996y c0996y = this.f5005K0;
        if (c0996y == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ((ImageView) c0996y.f10423c).setOnClickListener(new View.OnClickListener(this) { // from class: a1.c

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ d f5003x;

            {
                this.f5003x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i8 = i7;
                d dVar = this.f5003x;
                switch (i8) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        int i9 = d.f5004M0;
                        AbstractC1305a.o(dVar, "this$0");
                        dVar.Y();
                        return;
                    default:
                        int i10 = d.f5004M0;
                        AbstractC1305a.o(dVar, "this$0");
                        PlayerConfig playerConfig = dVar.f5006L0;
                        if (playerConfig == null) {
                            AbstractC1305a.W("data");
                            throw null;
                        }
                        AbstractC1332d.c0(dVar, playerConfig.getDownloadUrl());
                        dVar.Y();
                        return;
                }
            }
        });
        Context contextM = m();
        AbstractC1332d.l(contextM, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        k kVar = (k) com.bumptech.glide.b.a(contextM).f6293A.d(this);
        PlayerConfig playerConfig = this.f5006L0;
        if (playerConfig == null) {
            AbstractC1305a.W("data");
            throw null;
        }
        j jVarM = kVar.s(playerConfig.getPlayerIcon()).M(new C1299h(0), new z());
        C0996y c0996y2 = this.f5005K0;
        if (c0996y2 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        jVarM.E((ImageView) c0996y2.f10424d);
        C0996y c0996y3 = this.f5005K0;
        if (c0996y3 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        TextView textView = (TextView) c0996y3.f10426f;
        PlayerConfig playerConfig2 = this.f5006L0;
        if (playerConfig2 == null) {
            AbstractC1305a.W("data");
            throw null;
        }
        textView.setText(playerConfig2.getPlayerName());
        C0996y c0996y4 = this.f5005K0;
        if (c0996y4 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        TextView textView2 = (TextView) c0996y4.f10425e;
        PlayerConfig playerConfig3 = this.f5006L0;
        if (playerConfig3 == null) {
            AbstractC1305a.W("data");
            throw null;
        }
        textView2.setText(playerConfig3.getPlayerDesc());
        C0996y c0996y5 = this.f5005K0;
        if (c0996y5 != null) {
            ((LinearLayout) c0996y5.f10422b).setOnClickListener(new View.OnClickListener(this) { // from class: a1.c

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ d f5003x;

                {
                    this.f5003x = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i8 = i6;
                    d dVar = this.f5003x;
                    switch (i8) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            int i9 = d.f5004M0;
                            AbstractC1305a.o(dVar, "this$0");
                            dVar.Y();
                            return;
                        default:
                            int i10 = d.f5004M0;
                            AbstractC1305a.o(dVar, "this$0");
                            PlayerConfig playerConfig4 = dVar.f5006L0;
                            if (playerConfig4 == null) {
                                AbstractC1305a.W("data");
                                throw null;
                            }
                            AbstractC1332d.c0(dVar, playerConfig4.getDownloadUrl());
                            dVar.Y();
                            return;
                    }
                }
            });
        } else {
            AbstractC1305a.W("binding");
            throw null;
        }
    }
}
