package t4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {
    public static boolean Z(Iterable iterable, Serializable serializable) {
        int iIndexOf;
        AbstractC1305a.o(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(serializable);
        }
        if (!(iterable instanceof List)) {
            int i6 = 0;
            for (Object obj : iterable) {
                if (i6 < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                if (AbstractC1305a.c(serializable, obj)) {
                    iIndexOf = i6;
                } else {
                    i6++;
                }
            }
            return false;
        }
        iIndexOf = ((List) iterable).indexOf(serializable);
        return iIndexOf >= 0;
    }

    public static ArrayList a0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object b0(List list) {
        AbstractC1305a.o(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object c0(List list) {
        AbstractC1305a.o(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void d0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i6, CharSequence charSequence4, C4.l lVar) {
        CharSequence charSequenceValueOf;
        AbstractC1305a.o(iterable, "<this>");
        AbstractC1305a.o(charSequence, "separator");
        AbstractC1305a.o(charSequence2, "prefix");
        AbstractC1305a.o(charSequence3, "postfix");
        AbstractC1305a.o(charSequence4, "truncated");
        sb.append(charSequence2);
        int i7 = 0;
        for (Object objJ : iterable) {
            i7++;
            if (i7 > 1) {
                sb.append(charSequence);
            }
            if (i6 >= 0 && i7 > i6) {
                break;
            }
            if (lVar != null) {
                objJ = lVar.j(objJ);
            } else if (objJ != null && !(objJ instanceof CharSequence)) {
                if (objJ instanceof Character) {
                    sb.append(((Character) objJ).charValue());
                } else {
                    charSequenceValueOf = String.valueOf(objJ);
                    sb.append(charSequenceValueOf);
                }
            }
            charSequenceValueOf = (CharSequence) objJ;
            sb.append(charSequenceValueOf);
        }
        if (i6 >= 0 && i7 > i6) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String f0(Iterable iterable, String str, String str2, String str3, C4.l lVar, int i6) {
        if ((i6 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i6 & 2) != 0 ? "" : str2;
        String str6 = (i6 & 4) != 0 ? "" : str3;
        if ((i6 & 32) != 0) {
            lVar = null;
        }
        AbstractC1305a.o(iterable, "<this>");
        AbstractC1305a.o(str4, "separator");
        AbstractC1305a.o(str5, "prefix");
        AbstractC1305a.o(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        d0(iterable, sb, str4, str5, str6, -1, "...", lVar);
        String string = sb.toString();
        AbstractC1305a.n(string, "toString(...)");
        return string;
    }

    public static Object g0(ArrayList arrayList) {
        AbstractC1305a.o(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.get(S3.a.u(arrayList));
    }

    public static Object h0(List list) {
        AbstractC1305a.o(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List i0(ArrayList arrayList, B.h hVar) {
        if (arrayList.size() <= 1) {
            return k0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        AbstractC1305a.o(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, hVar);
        }
        List listAsList = Arrays.asList(array);
        AbstractC1305a.n(listAsList, "asList(...)");
        return listAsList;
    }

    public static final void j0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC1305a.o(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List k0(Iterable iterable) {
        ArrayList arrayListL0;
        AbstractC1305a.o(iterable, "<this>");
        boolean z5 = iterable instanceof Collection;
        p pVar = p.f12756w;
        if (z5) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return pVar;
            }
            if (size != 1) {
                return l0(collection);
            }
            return S3.a.D(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z5) {
            arrayListL0 = l0((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            j0(iterable, arrayList);
            arrayListL0 = arrayList;
        }
        int size2 = arrayListL0.size();
        return size2 != 0 ? size2 != 1 ? arrayListL0 : S3.a.D(arrayListL0.get(0)) : pVar;
    }

    public static ArrayList l0(Collection collection) {
        AbstractC1305a.o(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set m0(Iterable iterable) {
        AbstractC1305a.o(iterable, "<this>");
        boolean z5 = iterable instanceof Collection;
        r rVar = r.f12758w;
        if (!z5) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            j0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return rVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            AbstractC1305a.n(setSingleton, "singleton(...)");
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return rVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC1305a.M(collection.size()));
            j0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        AbstractC1305a.n(setSingleton2, "singleton(...)");
        return setSingleton2;
    }
}
