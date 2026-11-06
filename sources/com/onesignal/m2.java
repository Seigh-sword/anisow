package com.onesignal;

import android.app.Activity;
import d.AbstractC0628i;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p2 f7894a;

    public m2(p2 p2Var) {
        this.f7894a = p2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026e, code lost:
    
        r5 = new java.lang.String[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0270, code lost:
    
        r26 = 0;
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0272, code lost:
    
        r5[0] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0278, code lost:
    
        r5[1] = r0.f5022w;
        r5[2] = r3;
        r10 = ((com.onesignal.C1) ((com.onesignal.B1) r8.f5931x)).J("cached_unique_outcome", r1, "channel_influence_id = ? AND channel_type = ? AND name = ?", r5, null, "1");
        s4.AbstractC1305a.n(r10, "cursor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x029c, code lost:
    
        if (r10.getCount() != 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x029e, code lost:
    
        r12.put(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a3, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a9, code lost:
    
        r15 = r15 + 1;
        r0 = r17;
        r1 = r25;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02b7, code lost:
    
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02ba, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02bb, code lost:
    
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02bf, code lost:
    
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02c2, code lost:
    
        r17 = r0;
        r25 = r1;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ce, code lost:
    
        if (r12.length() <= 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02d0, code lost:
    
        r0 = new a4.C0263a(r11.f5017b, r11.f5016a, r11.f5018c);
        r0.f5018c = r12;
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02e1, code lost:
    
        r17 = r0;
        r25 = r1;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02e9, code lost:
    
        r0 = r17;
        r1 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f1, code lost:
    
        r25 = r1;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02f7, code lost:
    
        if (r10 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02fd, code lost:
    
        if (r10.isClosed() != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ff, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0305, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0306, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0308, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0309, code lost:
    
        r25 = r1;
        r26 = r5;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0310, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0313, code lost:
    
        if (r10 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x031c, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x031d, code lost:
    
        r7.f6238a.getClass();
        com.onesignal.C0594t1.d("OneSignal getNotCachedUniqueOutcome influences: " + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0337, code lost:
    
        if (r9.size() <= 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x033a, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x033b, code lost:
    
        if (r9 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x033d, code lost:
    
        r0 = com.onesignal.EnumC0600v1.f7992B;
        r1 = new java.lang.StringBuilder("Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: ");
        r1.append(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x035e, code lost:
    
        r2.m(r3, 0.0f, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0363, code lost:
    
        if (r3 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x036b, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x036e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0229, code lost:
    
        r7 = ((J3.w) r2.f7949x).l();
        s4.AbstractC1305a.o(r3, "name");
        r8 = r7.f6239b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0238, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0239, code lost:
    
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023e, code lost:
    
        r0 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0242, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0247, code lost:
    
        if (r0.hasNext() == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0249, code lost:
    
        r11 = (a4.C0263a) r0.next();
        r12 = new org.json.JSONArray();
        r13 = r11.f5018c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        if (r13 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0258, code lost:
    
        r14 = r13.length();
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025d, code lost:
    
        if (r15 >= r14) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025f, code lost:
    
        r6 = r13.getString(r15);
        r17 = r0;
        r0 = r11.f5017b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0267, code lost:
    
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0269, code lost:
    
        r1 = new java.lang.String[r5];
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0315 A[Catch: all -> 0x0303, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:87:0x0239, B:140:0x0315, B:130:0x02ff, B:128:0x02f9, B:153:0x0365, B:155:0x036b, B:156:0x036e), top: B:180:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.json.JSONObject r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.m2.a(org.json.JSONObject):void");
    }

    public final void b(JSONObject jSONObject) {
        String strS0;
        C0579o0 c0579o0Q = AbstractC0603w1.q();
        C0585q0 c0585q0 = this.f7894a.f7942e;
        c0579o0Q.getClass();
        String strOptString = jSONObject.optString("pageId", null);
        jSONObject.optString("pageIndex", null);
        if (c0585q0.f7961k || (strS0 = c0579o0Q.s0(c0585q0)) == null) {
            return;
        }
        String strM = AbstractC0628i.m(new StringBuilder(), c0585q0.f7951a, strOptString);
        Set set = c0579o0Q.f7915p;
        if (set.contains(strM)) {
            String strQ = AbstractC0628i.q("Already sent page impression for id: ", strOptString);
            c0579o0Q.f7906g.getClass();
            C0594t1.h(strQ);
            return;
        }
        set.add(strM);
        A0 a02 = c0579o0Q.f7910k;
        String str = AbstractC0603w1.f8032d;
        String strV = AbstractC0603w1.v();
        int iB = OSUtils.b();
        String str2 = c0585q0.f7951a;
        X1 x12 = new X1(c0579o0Q, 5, strM);
        a02.getClass();
        try {
            AbstractC0571l1.J("in_app_messages/" + str2 + "/pageImpression", new C0602w0(str, strV, strS0, iB, strOptString), new C0605x0(a02, set, x12, 1));
        } catch (JSONException e6) {
            e6.printStackTrace();
            a02.f7461b.getClass();
            C0594t1.e("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public final void c(JSONObject jSONObject) {
        boolean z5;
        o2 o2Var = o2.f7926x;
        try {
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        o2 o2VarValueOf = (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals("")) ? o2Var : o2.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
        p2 p2Var = this.f7894a;
        int iE = -1;
        if (o2VarValueOf != o2Var) {
            try {
                iE = p2.e(p2Var, p2Var.f7941d, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
            }
        }
        try {
            z5 = jSONObject.getBoolean("dragToDismissDisabled");
        } catch (JSONException unused2) {
            z5 = false;
        }
        C0552f0 c0552f0 = p2Var.f7943f;
        c0552f0.f7806e = o2VarValueOf;
        c0552f0.f7808g = iE;
        p2Var.f7945h = Integer.valueOf(iE);
        F f6 = new F(p2Var.f7939b, c0552f0, z5);
        synchronized (p2Var.f7938a) {
            p2Var.f7940c = f6;
        }
        f6.f7542t = new j2(p2Var);
        C0548e c0548e = C0554g.f7812x;
        if (c0548e != null) {
            C0548e.f7785d.put("com.onesignal.p2" + p2Var.f7942e.f7951a, p2Var);
            Activity activity = c0548e.f7789b;
            if (activity != null) {
                p2Var.a(activity);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void postMessage(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "OSJavaScriptInterface:postMessage: "
            com.onesignal.v1 r1 = com.onesignal.EnumC0600v1.f7992B     // Catch: org.json.JSONException -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L33
            r2.<init>(r0)     // Catch: org.json.JSONException -> L33
            r2.append(r5)     // Catch: org.json.JSONException -> L33
            java.lang.String r0 = r2.toString()     // Catch: org.json.JSONException -> L33
            r2 = 0
            com.onesignal.AbstractC0603w1.b(r1, r0, r2)     // Catch: org.json.JSONException -> L33
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L33
            r0.<init>(r5)     // Catch: org.json.JSONException -> L33
            java.lang.String r5 = "type"
            java.lang.String r5 = r0.getString(r5)     // Catch: org.json.JSONException -> L33
            int r1 = r5.hashCode()     // Catch: org.json.JSONException -> L33
            r2 = 3
            r3 = 1
            switch(r1) {
                case -1484226720: goto L49;
                case -934437708: goto L3f;
                case 42998156: goto L35;
                case 1851145598: goto L29;
                default: goto L28;
            }     // Catch: org.json.JSONException -> L33
        L28:
            goto L53
        L29:
            java.lang.String r1 = "action_taken"
            boolean r5 = r5.equals(r1)     // Catch: org.json.JSONException -> L33
            if (r5 == 0) goto L53
            r5 = r3
            goto L54
        L33:
            r5 = move-exception
            goto L6f
        L35:
            java.lang.String r1 = "rendering_complete"
            boolean r5 = r5.equals(r1)     // Catch: org.json.JSONException -> L33
            if (r5 == 0) goto L53
            r5 = 0
            goto L54
        L3f:
            java.lang.String r1 = "resize"
            boolean r5 = r5.equals(r1)     // Catch: org.json.JSONException -> L33
            if (r5 == 0) goto L53
            r5 = 2
            goto L54
        L49:
            java.lang.String r1 = "page_change"
            boolean r5 = r5.equals(r1)     // Catch: org.json.JSONException -> L33
            if (r5 == 0) goto L53
            r5 = r2
            goto L54
        L53:
            r5 = -1
        L54:
            if (r5 == 0) goto L6b
            if (r5 == r3) goto L5f
            if (r5 == r2) goto L5b
            goto L72
        L5b:
            r4.b(r0)     // Catch: org.json.JSONException -> L33
            goto L72
        L5f:
            com.onesignal.p2 r5 = r4.f7894a     // Catch: org.json.JSONException -> L33
            com.onesignal.F r5 = r5.f7940c     // Catch: org.json.JSONException -> L33
            boolean r5 = r5.f7535m     // Catch: org.json.JSONException -> L33
            if (r5 != 0) goto L72
            r4.a(r0)     // Catch: org.json.JSONException -> L33
            goto L72
        L6b:
            r4.c(r0)     // Catch: org.json.JSONException -> L33
            goto L72
        L6f:
            r5.printStackTrace()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.m2.postMessage(java.lang.String):void");
    }
}
