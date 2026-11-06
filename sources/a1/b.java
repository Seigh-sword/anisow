package a1;

import Q3.n;
import V0.j;
import V0.k;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.app.models.Message;
import com.xo.anilab.R;
import p3.C1251c;
import s1.C1299h;
import s1.z;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import y2.C1507i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C1507i {

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final /* synthetic */ int f4998N0 = 0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C1251c f4999K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public Message f5000L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public C4.a f5001M0;

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, h0.AbstractComponentCallbacksC0734B
    public final void A(Bundle bundle) {
        super.A(bundle);
        Bundle bundle2 = this.f8591B;
        if (bundle2 != null) {
            Object objB = new n().b(Message.class, bundle2.getString("MESSAGE_DATA"));
            AbstractC1305a.n(objB, "fromJson(...)");
            this.f5000L0 = (Message) objB;
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
        View viewInflate = layoutInflaterF.inflate(R.layout.bottom_sheet_message, (ViewGroup) null, false);
        int i6 = R.id.action;
        TextView textView = (TextView) AbstractC1332d.E(viewInflate, R.id.action);
        if (textView != null) {
            i6 = R.id.actionBtn;
            LinearLayout linearLayout = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.actionBtn);
            if (linearLayout != null) {
                i6 = R.id.close_icon;
                ImageView imageView = (ImageView) AbstractC1332d.E(viewInflate, R.id.close_icon);
                if (imageView != null) {
                    i6 = R.id.icon;
                    ImageView imageView2 = (ImageView) AbstractC1332d.E(viewInflate, R.id.icon);
                    if (imageView2 != null) {
                        i6 = R.id.message;
                        TextView textView2 = (TextView) AbstractC1332d.E(viewInflate, R.id.message);
                        if (textView2 != null) {
                            i6 = R.id.title;
                            TextView textView3 = (TextView) AbstractC1332d.E(viewInflate, R.id.title);
                            if (textView3 != null) {
                                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                this.f4999K0 = new C1251c(linearLayout2, textView, linearLayout, imageView, imageView2, textView2, textView3, 4);
                                AbstractC1305a.n(linearLayout2, "getRoot(...)");
                                return linearLayout2;
                            }
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
        C1251c c1251c = this.f4999K0;
        if (c1251c == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ((ImageView) c1251c.f12321e).setOnClickListener(new View.OnClickListener(this) { // from class: a1.a

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ b f4997x;

            {
                this.f4997x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i8 = i7;
                b bVar = this.f4997x;
                switch (i8) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        int i9 = b.f4998N0;
                        AbstractC1305a.o(bVar, "this$0");
                        bVar.Y();
                        return;
                    default:
                        int i10 = b.f4998N0;
                        AbstractC1305a.o(bVar, "this$0");
                        Message message = bVar.f5000L0;
                        if (message != null) {
                            AbstractC1332d.c0(bVar, message.getUrl());
                            return;
                        } else {
                            AbstractC1305a.W("message");
                            throw null;
                        }
                }
            }
        });
        C1251c c1251c2 = this.f4999K0;
        if (c1251c2 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ImageView imageView = (ImageView) c1251c2.f12321e;
        AbstractC1305a.n(imageView, "closeIcon");
        if (this.f5000L0 == null) {
            AbstractC1305a.W("message");
            throw null;
        }
        AbstractC1332d.v0(imageView, !r4.getForce());
        Context contextM = m();
        AbstractC1332d.l(contextM, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        k kVar = (k) com.bumptech.glide.b.a(contextM).f6293A.d(this);
        Message message = this.f5000L0;
        if (message == null) {
            AbstractC1305a.W("message");
            throw null;
        }
        j jVarM = kVar.s(message.getIcon()).M(new C1299h(0), new z());
        C1251c c1251c3 = this.f4999K0;
        if (c1251c3 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        jVarM.E((ImageView) c1251c3.f12322f);
        C1251c c1251c4 = this.f4999K0;
        if (c1251c4 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        TextView textView = (TextView) c1251c4.f12324h;
        Message message2 = this.f5000L0;
        if (message2 == null) {
            AbstractC1305a.W("message");
            throw null;
        }
        textView.setText(message2.getTitle());
        C1251c c1251c5 = this.f4999K0;
        if (c1251c5 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        TextView textView2 = (TextView) c1251c5.f12323g;
        Message message3 = this.f5000L0;
        if (message3 == null) {
            AbstractC1305a.W("message");
            throw null;
        }
        textView2.setText(message3.getMessage());
        C1251c c1251c6 = this.f4999K0;
        if (c1251c6 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        TextView textView3 = (TextView) c1251c6.f12319c;
        Message message4 = this.f5000L0;
        if (message4 == null) {
            AbstractC1305a.W("message");
            throw null;
        }
        textView3.setText(message4.getAction());
        C1251c c1251c7 = this.f4999K0;
        if (c1251c7 != null) {
            ((LinearLayout) c1251c7.f12320d).setOnClickListener(new View.OnClickListener(this) { // from class: a1.a

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ b f4997x;

                {
                    this.f4997x = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i8 = i6;
                    b bVar = this.f4997x;
                    switch (i8) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            int i9 = b.f4998N0;
                            AbstractC1305a.o(bVar, "this$0");
                            bVar.Y();
                            return;
                        default:
                            int i10 = b.f4998N0;
                            AbstractC1305a.o(bVar, "this$0");
                            Message message5 = bVar.f5000L0;
                            if (message5 != null) {
                                AbstractC1332d.c0(bVar, message5.getUrl());
                                return;
                            } else {
                                AbstractC1305a.W("message");
                                throw null;
                            }
                    }
                }
            });
        } else {
            AbstractC1305a.W("binding");
            throw null;
        }
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        AbstractC1305a.o(dialogInterface, "dialog");
        C4.a aVar = this.f5001M0;
        if (aVar != null) {
            aVar.b();
        }
        super.onDismiss(dialogInterface);
    }
}
