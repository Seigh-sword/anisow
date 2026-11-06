package B2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v0.AbstractC1393d0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1393d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f81a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f82b;

    public b() {
        Paint paint = new Paint();
        this.f81a = paint;
        this.f82b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // v0.AbstractC1393d0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f6;
        int iF;
        float f7;
        float f8;
        Canvas canvas2;
        float f9;
        int iD;
        Paint paint = this.f81a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (f fVar : this.f82b) {
            fVar.getClass();
            ThreadLocal threadLocal = G.a.f639a;
            float f10 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f10))));
            int iE = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).F0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f7144q;
                switch (cVar.f83b) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        break;
                    default:
                        iE = cVar.f84c.G();
                        break;
                }
                f9 = iE;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f7144q;
                int i6 = cVar2.f83b;
                CarouselLayoutManager carouselLayoutManager = cVar2.f84c;
                switch (i6) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        iD = carouselLayoutManager.f13123o;
                        break;
                    default:
                        iD = carouselLayoutManager.f13123o - carouselLayoutManager.D();
                        break;
                }
                f8 = iD;
                f7 = 0.0f;
                fVar.getClass();
                canvas2 = canvas;
                f6 = 0.0f;
            } else {
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f7144q;
                switch (cVar3.f83b) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        iE = cVar3.f84c.E();
                        break;
                }
                f6 = iE;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f7144q;
                int i7 = cVar4.f83b;
                CarouselLayoutManager carouselLayoutManager2 = cVar4.f84c;
                switch (i7) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        iF = carouselLayoutManager2.f13122n - carouselLayoutManager2.F();
                        break;
                    default:
                        iF = carouselLayoutManager2.f13122n;
                        break;
                }
                f7 = iF;
                f8 = 0.0f;
                fVar.getClass();
                canvas2 = canvas;
                f9 = 0.0f;
            }
            canvas2.drawLine(f6, f9, f7, f8, paint);
        }
    }
}
