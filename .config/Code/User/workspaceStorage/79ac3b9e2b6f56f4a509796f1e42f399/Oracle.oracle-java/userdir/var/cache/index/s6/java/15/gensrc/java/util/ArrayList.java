package java.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ArrayList<E extends Object> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable {

    private class ListItr extends Itr implements ListIterator<E> {

        ListItr(int index) {
            // compiled code
        }

        public boolean hasPrevious() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #13                 // Field cursor:I
             * 4: ifeq          11
             * 7: iconst_1
             * 8: goto          12
             * 11: iconst_0
             * 12: ireturn
             *  */
            // </editor-fold>
        }

        public int nextIndex() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #13                 // Field cursor:I
             * 4: ireturn
             *  */
            // </editor-fold>
        }

        public int previousIndex() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #13                 // Field cursor:I
             * 4: iconst_1
             * 5: isub
             * 6: ireturn
             *  */
            // </editor-fold>
        }

        public E previous() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #17                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: getfield      #13                 // Field cursor:I
             * 8: iconst_1
             * 9: isub
             * 10: istore_1
             * 11: iload_1
             * 12: ifge          23
             * 15: new           #21                 // class java/util/NoSuchElementException
             * 18: dup
             * 19: invokespecial #23                 // Method java/util/NoSuchElementException."<init>":()V
             * 22: athrow
             * 23: aload_0
             * 24: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 27: getfield      #25                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 30: astore_2
             * 31: iload_1
             * 32: aload_2
             * 33: arraylength
             * 34: if_icmplt     45
             * 37: new           #31                 // class java/util/ConcurrentModificationException
             * 40: dup
             * 41: invokespecial #33                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 44: athrow
             * 45: aload_0
             * 46: iload_1
             * 47: putfield      #13                 // Field cursor:I
             * 50: aload_2
             * 51: aload_0
             * 52: iload_1
             * 53: dup_x1
             * 54: putfield      #34                 // Field lastRet:I
             * 57: aaload
             * 58: areturn
             *  */
            // </editor-fold>
        }

        public void set(E e) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #34                 // Field lastRet:I
             * 4: ifge          15
             * 7: new           #37                 // class java/lang/IllegalStateException
             * 10: dup
             * 11: invokespecial #39                 // Method java/lang/IllegalStateException."<init>":()V
             * 14: athrow
             * 15: aload_0
             * 16: invokevirtual #17                 // Method checkForComodification:()V
             * 19: aload_0
             * 20: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 23: aload_0
             * 24: getfield      #34                 // Field lastRet:I
             * 27: aload_1
             * 28: invokevirtual #40                 // Method java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
             * 31: pop
             * 32: goto          44
             * 35: astore_2
             * 36: new           #31                 // class java/util/ConcurrentModificationException
             * 39: dup
             * 40: invokespecial #33                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 43: athrow
             * 44: return
             * Exception table:
             * from    to  target type
             * 19    32    35   Class java/lang/IndexOutOfBoundsException
             *  */
            // </editor-fold>
        }

        public void add(E e) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #17                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: getfield      #13                 // Field cursor:I
             * 8: istore_2
             * 9: aload_0
             * 10: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 13: iload_2
             * 14: aload_1
             * 15: invokevirtual #46                 // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
             * 18: aload_0
             * 19: iload_2
             * 20: iconst_1
             * 21: iadd
             * 22: putfield      #13                 // Field cursor:I
             * 25: aload_0
             * 26: iconst_m1
             * 27: putfield      #34                 // Field lastRet:I
             * 30: aload_0
             * 31: aload_0
             * 32: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 35: getfield      #50                 // Field java/util/ArrayList.modCount:I
             * 38: putfield      #53                 // Field expectedModCount:I
             * 41: goto          53
             * 44: astore_2
             * 45: new           #31                 // class java/util/ConcurrentModificationException
             * 48: dup
             * 49: invokespecial #33                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 52: athrow
             * 53: return
             * Exception table:
             * from    to  target type
             * 4    41    44   Class java/lang/IndexOutOfBoundsException
             *  */
            // </editor-fold>
        }
    }

    private class Itr implements Iterator<E> {

        int cursor;
        int lastRet;
        int expectedModCount;

        Itr() {
            // compiled code
        }

        public boolean hasNext() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #25                 // Field cursor:I
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 8: getfield      #28                 // Field java/util/ArrayList.size:I
             * 11: if_icmpeq     18
             * 14: iconst_1
             * 15: goto          19
             * 18: iconst_0
             * 19: ireturn
             *  */
            // </editor-fold>
        }

        public E next() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #31                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: getfield      #25                 // Field cursor:I
             * 8: istore_1
             * 9: iload_1
             * 10: aload_0
             * 11: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 14: getfield      #28                 // Field java/util/ArrayList.size:I
             * 17: if_icmplt     28
             * 20: new           #34                 // class java/util/NoSuchElementException
             * 23: dup
             * 24: invokespecial #36                 // Method java/util/NoSuchElementException."<init>":()V
             * 27: athrow
             * 28: aload_0
             * 29: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 32: getfield      #37                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 35: astore_2
             * 36: iload_1
             * 37: aload_2
             * 38: arraylength
             * 39: if_icmplt     50
             * 42: new           #41                 // class java/util/ConcurrentModificationException
             * 45: dup
             * 46: invokespecial #43                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 49: athrow
             * 50: aload_0
             * 51: iload_1
             * 52: iconst_1
             * 53: iadd
             * 54: putfield      #25                 // Field cursor:I
             * 57: aload_2
             * 58: aload_0
             * 59: iload_1
             * 60: dup_x1
             * 61: putfield      #13                 // Field lastRet:I
             * 64: aaload
             * 65: areturn
             *  */
            // </editor-fold>
        }

        public void remove() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #13                 // Field lastRet:I
             * 4: ifge          15
             * 7: new           #44                 // class java/lang/IllegalStateException
             * 10: dup
             * 11: invokespecial #46                 // Method java/lang/IllegalStateException."<init>":()V
             * 14: athrow
             * 15: aload_0
             * 16: invokevirtual #31                 // Method checkForComodification:()V
             * 19: aload_0
             * 20: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 23: aload_0
             * 24: getfield      #13                 // Field lastRet:I
             * 27: invokevirtual #47                 // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
             * 30: pop
             * 31: aload_0
             * 32: aload_0
             * 33: getfield      #13                 // Field lastRet:I
             * 36: putfield      #25                 // Field cursor:I
             * 39: aload_0
             * 40: iconst_m1
             * 41: putfield      #13                 // Field lastRet:I
             * 44: aload_0
             * 45: aload_0
             * 46: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 49: getfield      #17                 // Field java/util/ArrayList.modCount:I
             * 52: putfield      #22                 // Field expectedModCount:I
             * 55: goto          67
             * 58: astore_1
             * 59: new           #41                 // class java/util/ConcurrentModificationException
             * 62: dup
             * 63: invokespecial #43                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 66: athrow
             * 67: return
             * Exception table:
             * from    to  target type
             * 19    55    58   Class java/lang/IndexOutOfBoundsException
             *  */
            // </editor-fold>
        }

        public void forEachRemaining(Consumer<? super E> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: invokestatic  #53                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
             * 4: pop
             * 5: aload_0
             * 6: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 9: getfield      #28                 // Field java/util/ArrayList.size:I
             * 12: istore_2
             * 13: aload_0
             * 14: getfield      #25                 // Field cursor:I
             * 17: istore_3
             * 18: iload_3
             * 19: iload_2
             * 20: if_icmpge     100
             * 23: aload_0
             * 24: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 27: getfield      #37                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 30: astore        4
             * 32: iload_3
             * 33: aload         4
             * 35: arraylength
             * 36: if_icmplt     47
             * 39: new           #41                 // class java/util/ConcurrentModificationException
             * 42: dup
             * 43: invokespecial #43                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 46: athrow
             * 47: iload_3
             * 48: iload_2
             * 49: if_icmpge     84
             * 52: aload_0
             * 53: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 56: getfield      #17                 // Field java/util/ArrayList.modCount:I
             * 59: aload_0
             * 60: getfield      #22                 // Field expectedModCount:I
             * 63: if_icmpne     84
             * 66: aload_1
             * 67: aload         4
             * 69: iload_3
             * 70: invokestatic  #59                 // Method java/util/ArrayList.elementAt:([Ljava/lang/Object;I)Ljava/lang/Object;
             * 73: invokeinterface #63,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 78: iinc          3, 1
             * 81: goto          47
             * 84: aload_0
             * 85: iload_3
             * 86: putfield      #25                 // Field cursor:I
             * 89: aload_0
             * 90: iload_3
             * 91: iconst_1
             * 92: isub
             * 93: putfield      #13                 // Field lastRet:I
             * 96: aload_0
             * 97: invokevirtual #31                 // Method checkForComodification:()V
             * 100: return
             *  */
            // </editor-fold>
        }

        final void checkForComodification() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 4: getfield      #17                 // Field java/util/ArrayList.modCount:I
             * 7: aload_0
             * 8: getfield      #22                 // Field expectedModCount:I
             * 11: if_icmpeq     22
             * 14: new           #41                 // class java/util/ConcurrentModificationException
             * 17: dup
             * 18: invokespecial #43                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 21: athrow
             * 22: return
             *  */
            // </editor-fold>
        }
    }

    private static class SubList<E extends Object> extends AbstractList<E> implements RandomAccess {

        private final ArrayList<E> root;
        private final SubList<E> parent;
        private final int offset;
        private int size;

        public SubList(ArrayList<E> root, int fromIndex, int toIndex) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/util/AbstractList."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      #7                  // Field root:Ljava/util/ArrayList;
             * 9: aload_0
             * 10: aconst_null
             * 11: putfield      #13                 // Field parent:Ljava/util/ArrayList$SubList;
             * 14: aload_0
             * 15: iload_2
             * 16: putfield      #17                 // Field offset:I
             * 19: aload_0
             * 20: iload_3
             * 21: iload_2
             * 22: isub
             * 23: putfield      #21                 // Field size:I
             * 26: aload_0
             * 27: aload_1
             * 28: getfield      #24                 // Field java/util/ArrayList.modCount:I
             * 31: putfield      #29                 // Field modCount:I
             * 34: return
             *  */
            // </editor-fold>
        }

        private SubList(SubList<E> parent, int fromIndex, int toIndex) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/util/AbstractList."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 9: putfield      #7                  // Field root:Ljava/util/ArrayList;
             * 12: aload_0
             * 13: aload_1
             * 14: putfield      #13                 // Field parent:Ljava/util/ArrayList$SubList;
             * 17: aload_0
             * 18: aload_1
             * 19: getfield      #17                 // Field offset:I
             * 22: iload_2
             * 23: iadd
             * 24: putfield      #17                 // Field offset:I
             * 27: aload_0
             * 28: iload_3
             * 29: iload_2
             * 30: isub
             * 31: putfield      #21                 // Field size:I
             * 34: aload_0
             * 35: aload_1
             * 36: getfield      #29                 // Field modCount:I
             * 39: putfield      #29                 // Field modCount:I
             * 42: return
             *  */
            // </editor-fold>
        }

        public E set(int index, E element) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iload_1
             * 1: aload_0
             * 2: getfield      #21                 // Field size:I
             * 5: invokestatic  #30                 // Method java/util/Objects.checkIndex:(II)I
             * 8: pop
             * 9: aload_0
             * 10: invokevirtual #36                 // Method checkForComodification:()V
             * 13: aload_0
             * 14: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 17: aload_0
             * 18: getfield      #17                 // Field offset:I
             * 21: iload_1
             * 22: iadd
             * 23: invokevirtual #39                 // Method java/util/ArrayList.elementData:(I)Ljava/lang/Object;
             * 26: astore_3
             * 27: aload_0
             * 28: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 31: getfield      #43                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 34: aload_0
             * 35: getfield      #17                 // Field offset:I
             * 38: iload_1
             * 39: iadd
             * 40: aload_2
             * 41: aastore
             * 42: aload_3
             * 43: areturn
             *  */
            // </editor-fold>
        }

        public E get(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iload_1
             * 1: aload_0
             * 2: getfield      #21                 // Field size:I
             * 5: invokestatic  #30                 // Method java/util/Objects.checkIndex:(II)I
             * 8: pop
             * 9: aload_0
             * 10: invokevirtual #36                 // Method checkForComodification:()V
             * 13: aload_0
             * 14: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 17: aload_0
             * 18: getfield      #17                 // Field offset:I
             * 21: iload_1
             * 22: iadd
             * 23: invokevirtual #39                 // Method java/util/ArrayList.elementData:(I)Ljava/lang/Object;
             * 26: areturn
             *  */
            // </editor-fold>
        }

        public int size() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #36                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: getfield      #21                 // Field size:I
             * 8: ireturn
             *  */
            // </editor-fold>
        }

        public void add(int index, E element) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: iload_1
             * 2: invokevirtual #46                 // Method rangeCheckForAdd:(I)V
             * 5: aload_0
             * 6: invokevirtual #36                 // Method checkForComodification:()V
             * 9: aload_0
             * 10: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 13: aload_0
             * 14: getfield      #17                 // Field offset:I
             * 17: iload_1
             * 18: iadd
             * 19: aload_2
             * 20: invokevirtual #50                 // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
             * 23: aload_0
             * 24: iconst_1
             * 25: invokevirtual #54                 // Method updateSizeAndModCount:(I)V
             * 28: return
             *  */
            // </editor-fold>
        }

        public E remove(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iload_1
             * 1: aload_0
             * 2: getfield      #21                 // Field size:I
             * 5: invokestatic  #30                 // Method java/util/Objects.checkIndex:(II)I
             * 8: pop
             * 9: aload_0
             * 10: invokevirtual #36                 // Method checkForComodification:()V
             * 13: aload_0
             * 14: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 17: aload_0
             * 18: getfield      #17                 // Field offset:I
             * 21: iload_1
             * 22: iadd
             * 23: invokevirtual #57                 // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
             * 26: astore_2
             * 27: aload_0
             * 28: iconst_m1
             * 29: invokevirtual #54                 // Method updateSizeAndModCount:(I)V
             * 32: aload_2
             * 33: areturn
             *  */
            // </editor-fold>
        }

        protected void removeRange(int fromIndex, int toIndex) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #36                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 8: aload_0
             * 9: getfield      #17                 // Field offset:I
             * 12: iload_1
             * 13: iadd
             * 14: aload_0
             * 15: getfield      #17                 // Field offset:I
             * 18: iload_2
             * 19: iadd
             * 20: invokevirtual #60                 // Method java/util/ArrayList.removeRange:(II)V
             * 23: aload_0
             * 24: iload_1
             * 25: iload_2
             * 26: isub
             * 27: invokevirtual #54                 // Method updateSizeAndModCount:(I)V
             * 30: return
             *  */
            // </editor-fold>
        }

        public boolean addAll(Collection<? extends E> c) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_0
             * 2: getfield      #21                 // Field size:I
             * 5: aload_1
             * 6: invokevirtual #64                 // Method addAll:(ILjava/util/Collection;)Z
             * 9: ireturn
             *  */
            // </editor-fold>
        }

        public boolean addAll(int index, Collection<? extends E> c) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: iload_1
             * 2: invokevirtual #46                 // Method rangeCheckForAdd:(I)V
             * 5: aload_2
             * 6: invokeinterface #68,  1           // InterfaceMethod java/util/Collection.size:()I
             * 11: istore_3
             * 12: iload_3
             * 13: ifne          18
             * 16: iconst_0
             * 17: ireturn
             * 18: aload_0
             * 19: invokevirtual #36                 // Method checkForComodification:()V
             * 22: aload_0
             * 23: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 26: aload_0
             * 27: getfield      #17                 // Field offset:I
             * 30: iload_1
             * 31: iadd
             * 32: aload_2
             * 33: invokevirtual #73                 // Method java/util/ArrayList.addAll:(ILjava/util/Collection;)Z
             * 36: pop
             * 37: aload_0
             * 38: iload_3
             * 39: invokevirtual #54                 // Method updateSizeAndModCount:(I)V
             * 42: iconst_1
             * 43: ireturn
             *  */
            // </editor-fold>
        }

        public void replaceAll(UnaryOperator<E> operator) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 4: aload_1
             * 5: aload_0
             * 6: getfield      #17                 // Field offset:I
             * 9: aload_0
             * 10: getfield      #17                 // Field offset:I
             * 13: aload_0
             * 14: getfield      #21                 // Field size:I
             * 17: iadd
             * 18: invokevirtual #74                 // Method java/util/ArrayList.replaceAllRange:(Ljava/util/function/UnaryOperator;II)V
             * 21: return
             *  */
            // </editor-fold>
        }

        public boolean removeAll(Collection<?> c) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: iconst_0
             * 3: invokevirtual #78                 // Method batchRemove:(Ljava/util/Collection;Z)Z
             * 6: ireturn
             *  */
            // </editor-fold>
        }

        public boolean retainAll(Collection<?> c) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: iconst_1
             * 3: invokevirtual #78                 // Method batchRemove:(Ljava/util/Collection;Z)Z
             * 6: ireturn
             *  */
            // </editor-fold>
        }

        private boolean batchRemove(Collection<?> c, boolean complement) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #36                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 8: getfield      #82                 // Field java/util/ArrayList.size:I
             * 11: istore_3
             * 12: aload_0
             * 13: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 16: aload_1
             * 17: iload_2
             * 18: aload_0
             * 19: getfield      #17                 // Field offset:I
             * 22: aload_0
             * 23: getfield      #17                 // Field offset:I
             * 26: aload_0
             * 27: getfield      #21                 // Field size:I
             * 30: iadd
             * 31: invokevirtual #83                 // Method java/util/ArrayList.batchRemove:(Ljava/util/Collection;ZII)Z
             * 34: istore        4
             * 36: iload         4
             * 38: ifeq          54
             * 41: aload_0
             * 42: aload_0
             * 43: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 46: getfield      #82                 // Field java/util/ArrayList.size:I
             * 49: iload_3
             * 50: isub
             * 51: invokevirtual #54                 // Method updateSizeAndModCount:(I)V
             * 54: iload         4
             * 56: ireturn
             *  */
            // </editor-fold>
        }

        public boolean removeIf(Predicate<? super E> filter) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #36                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 8: getfield      #82                 // Field java/util/ArrayList.size:I
             * 11: istore_2
             * 12: aload_0
             * 13: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 16: aload_1
             * 17: aload_0
             * 18: getfield      #17                 // Field offset:I
             * 21: aload_0
             * 22: getfield      #17                 // Field offset:I
             * 25: aload_0
             * 26: getfield      #21                 // Field size:I
             * 29: iadd
             * 30: invokevirtual #86                 // Method java/util/ArrayList.removeIf:(Ljava/util/function/Predicate;II)Z
             * 33: istore_3
             * 34: iload_3
             * 35: ifeq          51
             * 38: aload_0
             * 39: aload_0
             * 40: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 43: getfield      #82                 // Field java/util/ArrayList.size:I
             * 46: iload_2
             * 47: isub
             * 48: invokevirtual #54                 // Method updateSizeAndModCount:(I)V
             * 51: iload_3
             * 52: ireturn
             *  */
            // </editor-fold>
        }

        public Object[] toArray() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #36                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 8: getfield      #43                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 11: aload_0
             * 12: getfield      #17                 // Field offset:I
             * 15: aload_0
             * 16: getfield      #17                 // Field offset:I
             * 19: aload_0
             * 20: getfield      #21                 // Field size:I
             * 23: iadd
             * 24: invokestatic  #90                 // Method java/util/Arrays.copyOfRange:([Ljava/lang/Object;II)[Ljava/lang/Object;
             * 27: areturn
             *  */
            // </editor-fold>
        }

        public <T extends Object> T[] toArray(T[] a) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #36                 // Method checkForComodification:()V
             * 4: aload_1
             * 5: arraylength
             * 6: aload_0
             * 7: getfield      #21                 // Field size:I
             * 10: if_icmpge     41
             * 13: aload_0
             * 14: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 17: getfield      #43                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 20: aload_0
             * 21: getfield      #17                 // Field offset:I
             * 24: aload_0
             * 25: getfield      #17                 // Field offset:I
             * 28: aload_0
             * 29: getfield      #21                 // Field size:I
             * 32: iadd
             * 33: aload_1
             * 34: invokevirtual #96                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
             * 37: invokestatic  #102                // Method java/util/Arrays.copyOfRange:([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;
             * 40: areturn
             * 41: aload_0
             * 42: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 45: getfield      #43                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 48: aload_0
             * 49: getfield      #17                 // Field offset:I
             * 52: aload_1
             * 53: iconst_0
             * 54: aload_0
             * 55: getfield      #21                 // Field size:I
             * 58: invokestatic  #105                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
             * 61: aload_1
             * 62: arraylength
             * 63: aload_0
             * 64: getfield      #21                 // Field size:I
             * 67: if_icmple     77
             * 70: aload_1
             * 71: aload_0
             * 72: getfield      #21                 // Field size:I
             * 75: aconst_null
             * 76: aastore
             * 77: aload_1
             * 78: areturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: aload_0
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    #111                // class java/util/List
             * 11: ifne          16
             * 14: iconst_0
             * 15: ireturn
             * 16: aload_0
             * 17: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 20: aload_1
             * 21: checkcast     #111                // class java/util/List
             * 24: aload_0
             * 25: getfield      #17                 // Field offset:I
             * 28: aload_0
             * 29: getfield      #17                 // Field offset:I
             * 32: aload_0
             * 33: getfield      #21                 // Field size:I
             * 36: iadd
             * 37: invokevirtual #113                // Method java/util/ArrayList.equalsRange:(Ljava/util/List;II)Z
             * 40: istore_2
             * 41: aload_0
             * 42: invokevirtual #36                 // Method checkForComodification:()V
             * 45: iload_2
             * 46: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 4: aload_0
             * 5: getfield      #17                 // Field offset:I
             * 8: aload_0
             * 9: getfield      #17                 // Field offset:I
             * 12: aload_0
             * 13: getfield      #21                 // Field size:I
             * 16: iadd
             * 17: invokevirtual #117                // Method java/util/ArrayList.hashCodeRange:(II)I
             * 20: istore_1
             * 21: aload_0
             * 22: invokevirtual #36                 // Method checkForComodification:()V
             * 25: iload_1
             * 26: ireturn
             *  */
            // </editor-fold>
        }

        public int indexOf(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 4: aload_1
             * 5: aload_0
             * 6: getfield      #17                 // Field offset:I
             * 9: aload_0
             * 10: getfield      #17                 // Field offset:I
             * 13: aload_0
             * 14: getfield      #21                 // Field size:I
             * 17: iadd
             * 18: invokevirtual #120                // Method java/util/ArrayList.indexOfRange:(Ljava/lang/Object;II)I
             * 21: istore_2
             * 22: aload_0
             * 23: invokevirtual #36                 // Method checkForComodification:()V
             * 26: iload_2
             * 27: iflt          39
             * 30: iload_2
             * 31: aload_0
             * 32: getfield      #17                 // Field offset:I
             * 35: isub
             * 36: goto          40
             * 39: iconst_m1
             * 40: ireturn
             *  */
            // </editor-fold>
        }

        public int lastIndexOf(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 4: aload_1
             * 5: aload_0
             * 6: getfield      #17                 // Field offset:I
             * 9: aload_0
             * 10: getfield      #17                 // Field offset:I
             * 13: aload_0
             * 14: getfield      #21                 // Field size:I
             * 17: iadd
             * 18: invokevirtual #124                // Method java/util/ArrayList.lastIndexOfRange:(Ljava/lang/Object;II)I
             * 21: istore_2
             * 22: aload_0
             * 23: invokevirtual #36                 // Method checkForComodification:()V
             * 26: iload_2
             * 27: iflt          39
             * 30: iload_2
             * 31: aload_0
             * 32: getfield      #17                 // Field offset:I
             * 35: isub
             * 36: goto          40
             * 39: iconst_m1
             * 40: ireturn
             *  */
            // </editor-fold>
        }

        public boolean contains(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokevirtual #127                // Method indexOf:(Ljava/lang/Object;)I
             * 5: iflt          12
             * 8: iconst_1
             * 9: goto          13
             * 12: iconst_0
             * 13: ireturn
             *  */
            // </editor-fold>
        }

        public Iterator<E> iterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #131                // Method listIterator:()Ljava/util/ListIterator;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        public ListIterator<E> listIterator(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #36                 // Method checkForComodification:()V
             * 4: aload_0
             * 5: iload_1
             * 6: invokevirtual #46                 // Method rangeCheckForAdd:(I)V
             * 9: new           #135                // class java/util/ArrayList$SubList$1
             * 12: dup
             * 13: aload_0
             * 14: iload_1
             * 15: invokespecial #137                // Method java/util/ArrayList$SubList$1."<init>":(Ljava/util/ArrayList$SubList;I)V
             * 18: areturn
             *  */
            // </editor-fold>
        }

        public List<E> subList(int fromIndex, int toIndex) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iload_1
             * 1: iload_2
             * 2: aload_0
             * 3: getfield      #21                 // Field size:I
             * 6: invokestatic  #140                // Method subListRangeCheck:(III)V
             * 9: new           #8                  // class java/util/ArrayList$SubList
             * 12: dup
             * 13: aload_0
             * 14: iload_1
             * 15: iload_2
             * 16: invokespecial #144                // Method "<init>":(Ljava/util/ArrayList$SubList;II)V
             * 19: areturn
             *  */
            // </editor-fold>
        }

        private void rangeCheckForAdd(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iload_1
             * 1: iflt          12
             * 4: iload_1
             * 5: aload_0
             * 6: getfield      #21                 // Field size:I
             * 9: if_icmple     25
             * 12: new           #147                // class java/lang/IndexOutOfBoundsException
             * 15: dup
             * 16: aload_0
             * 17: iload_1
             * 18: invokevirtual #149                // Method outOfBoundsMsg:(I)Ljava/lang/String;
             * 21: invokespecial #153                // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
             * 24: athrow
             * 25: return
             *  */
            // </editor-fold>
        }

        private String outOfBoundsMsg(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #156                // class java/lang/StringBuilder
             * 3: dup
             * 4: invokespecial #158                // Method java/lang/StringBuilder."<init>":()V
             * 7: ldc           #159                // String Index:
             * 9: invokevirtual #161                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 12: iload_1
             * 13: invokevirtual #165                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
             * 16: ldc           #168                // String , Size:
             * 18: invokevirtual #161                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 21: aload_0
             * 22: getfield      #21                 // Field size:I
             * 25: invokevirtual #165                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
             * 28: invokevirtual #170                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 31: areturn
             *  */
            // </editor-fold>
        }

        private void checkForComodification() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 4: getfield      #24                 // Field java/util/ArrayList.modCount:I
             * 7: aload_0
             * 8: getfield      #29                 // Field modCount:I
             * 11: if_icmpeq     22
             * 14: new           #174                // class java/util/ConcurrentModificationException
             * 17: dup
             * 18: invokespecial #176                // Method java/util/ConcurrentModificationException."<init>":()V
             * 21: athrow
             * 22: return
             *  */
            // </editor-fold>
        }

        private void updateSizeAndModCount(int sizeChange) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: astore_2
             * 2: aload_2
             * 3: dup
             * 4: getfield      #21                 // Field size:I
             * 7: iload_1
             * 8: iadd
             * 9: putfield      #21                 // Field size:I
             * 12: aload_2
             * 13: aload_0
             * 14: getfield      #7                  // Field root:Ljava/util/ArrayList;
             * 17: getfield      #24                 // Field java/util/ArrayList.modCount:I
             * 20: putfield      #29                 // Field modCount:I
             * 23: aload_2
             * 24: getfield      #13                 // Field parent:Ljava/util/ArrayList$SubList;
             * 27: astore_2
             * 28: aload_2
             * 29: ifnonnull     2
             * 32: return
             *  */
            // </editor-fold>
        }

        public Spliterator<E> spliterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #36                 // Method checkForComodification:()V
             * 4: new           #177                // class java/util/ArrayList$SubList$2
             * 7: dup
             * 8: aload_0
             * 9: invokespecial #179                // Method java/util/ArrayList$SubList$2."<init>":(Ljava/util/ArrayList$SubList;)V
             * 12: areturn
             *  */
            // </editor-fold>
        }
    }

    final class ArrayListSpliterator implements Spliterator<E> {

        private int index;
        private int fence;
        private int expectedModCount;

        ArrayListSpliterator(int origin, int fence, int expectedModCount) {
            // compiled code
        }

        private int getFence() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #17                 // Field fence:I
             * 4: dup
             * 5: istore_1
             * 6: ifge          33
             * 9: aload_0
             * 10: aload_0
             * 11: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 14: getfield      #23                 // Field java/util/ArrayList.modCount:I
             * 17: putfield      #20                 // Field expectedModCount:I
             * 20: aload_0
             * 21: aload_0
             * 22: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 25: getfield      #28                 // Field java/util/ArrayList.size:I
             * 28: dup_x1
             * 29: putfield      #17                 // Field fence:I
             * 32: istore_1
             * 33: iload_1
             * 34: ireturn
             *  */
            // </editor-fold>
        }

        public ArrayListSpliterator trySplit() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #31                 // Method getFence:()I
             * 4: istore_1
             * 5: aload_0
             * 6: getfield      #13                 // Field index:I
             * 9: istore_2
             * 10: iload_2
             * 11: iload_1
             * 12: iadd
             * 13: iconst_1
             * 14: iushr
             * 15: istore_3
             * 16: iload_2
             * 17: iload_3
             * 18: if_icmplt     25
             * 21: aconst_null
             * 22: goto          47
             * 25: new           #2                  // class java/util/ArrayList$ArrayListSpliterator
             * 28: dup
             * 29: aload_0
             * 30: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 33: iload_2
             * 34: aload_0
             * 35: iload_3
             * 36: dup_x1
             * 37: putfield      #13                 // Field index:I
             * 40: aload_0
             * 41: getfield      #20                 // Field expectedModCount:I
             * 44: invokespecial #35                 // Method "<init>":(Ljava/util/ArrayList;III)V
             * 47: areturn
             *  */
            // </editor-fold>
        }

        public boolean tryAdvance(Consumer<? super E> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #38                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #40                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: invokevirtual #31                 // Method getFence:()I
             * 16: istore_2
             * 17: aload_0
             * 18: getfield      #13                 // Field index:I
             * 21: istore_3
             * 22: iload_3
             * 23: iload_2
             * 24: if_icmpge     77
             * 27: aload_0
             * 28: iload_3
             * 29: iconst_1
             * 30: iadd
             * 31: putfield      #13                 // Field index:I
             * 34: aload_0
             * 35: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 38: getfield      #41                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 41: iload_3
             * 42: aaload
             * 43: astore        4
             * 45: aload_1
             * 46: aload         4
             * 48: invokeinterface #45,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 53: aload_0
             * 54: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 57: getfield      #23                 // Field java/util/ArrayList.modCount:I
             * 60: aload_0
             * 61: getfield      #20                 // Field expectedModCount:I
             * 64: if_icmpeq     75
             * 67: new           #51                 // class java/util/ConcurrentModificationException
             * 70: dup
             * 71: invokespecial #53                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 74: athrow
             * 75: iconst_1
             * 76: ireturn
             * 77: iconst_0
             * 78: ireturn
             *  */
            // </editor-fold>
        }

        public void forEachRemaining(Consumer<? super E> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #38                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #40                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 16: getfield      #41                 // Field java/util/ArrayList.elementData:[Ljava/lang/Object;
             * 19: dup
             * 20: astore        5
             * 22: ifnull        119
             * 25: aload_0
             * 26: getfield      #17                 // Field fence:I
             * 29: dup
             * 30: istore_3
             * 31: ifge          54
             * 34: aload_0
             * 35: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 38: getfield      #23                 // Field java/util/ArrayList.modCount:I
             * 41: istore        4
             * 43: aload_0
             * 44: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 47: getfield      #28                 // Field java/util/ArrayList.size:I
             * 50: istore_3
             * 51: goto          60
             * 54: aload_0
             * 55: getfield      #20                 // Field expectedModCount:I
             * 58: istore        4
             * 60: aload_0
             * 61: getfield      #13                 // Field index:I
             * 64: dup
             * 65: istore_2
             * 66: iflt          119
             * 69: aload_0
             * 70: iload_3
             * 71: dup_x1
             * 72: putfield      #13                 // Field index:I
             * 75: aload         5
             * 77: arraylength
             * 78: if_icmpgt     119
             * 81: iload_2
             * 82: iload_3
             * 83: if_icmpge     106
             * 86: aload         5
             * 88: iload_2
             * 89: aaload
             * 90: astore        6
             * 92: aload_1
             * 93: aload         6
             * 95: invokeinterface #45,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 100: iinc          2, 1
             * 103: goto          81
             * 106: aload_0
             * 107: getfield      #1                  // Field this$0:Ljava/util/ArrayList;
             * 110: getfield      #23                 // Field java/util/ArrayList.modCount:I
             * 113: iload         4
             * 115: if_icmpne     119
             * 118: return
             * 119: new           #51                 // class java/util/ConcurrentModificationException
             * 122: dup
             * 123: invokespecial #53                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 126: athrow
             *  */
            // </editor-fold>
        }

        public long estimateSize() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #31                 // Method getFence:()I
             * 4: aload_0
             * 5: getfield      #13                 // Field index:I
             * 8: isub
             * 9: i2l
             * 10: lreturn
             *  */
            // </editor-fold>
        }

        public int characteristics() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: sipush        16464
             * 3: ireturn
             *  */
            // </editor-fold>
        }
    }
    private static final long serialVersionUID = 8683452581122892189L;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    transient Object[] elementData;
    private int size;

    public ArrayList(int initialCapacity) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/util/AbstractList."<init>":()V
         * 4: iload_1
         * 5: ifle          19
         * 8: aload_0
         * 9: iload_1
         * 10: anewarray     #7                  // class java/lang/Object
         * 13: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 16: goto          60
         * 19: iload_1
         * 20: ifne          33
         * 23: aload_0
         * 24: getstatic     #15                 // Field EMPTY_ELEMENTDATA:[Ljava/lang/Object;
         * 27: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 30: goto          60
         * 33: new           #18                 // class java/lang/IllegalArgumentException
         * 36: dup
         * 37: new           #20                 // class java/lang/StringBuilder
         * 40: dup
         * 41: invokespecial #22                 // Method java/lang/StringBuilder."<init>":()V
         * 44: ldc           #23                 // String Illegal Capacity:
         * 46: invokevirtual #25                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 49: iload_1
         * 50: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 53: invokevirtual #32                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 56: invokespecial #36                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 59: athrow
         * 60: return
         *  */
        // </editor-fold>
    }

    public ArrayList() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/util/AbstractList."<init>":()V
         * 4: aload_0
         * 5: getstatic     #39                 // Field DEFAULTCAPACITY_EMPTY_ELEMENTDATA:[Ljava/lang/Object;
         * 8: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 11: return
         *  */
        // </editor-fold>
    }

    public ArrayList(Collection<? extends E> c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/util/AbstractList."<init>":()V
         * 4: aload_1
         * 5: invokeinterface #42,  1           // InterfaceMethod java/util/Collection.toArray:()[Ljava/lang/Object;
         * 10: astore_2
         * 11: aload_0
         * 12: aload_2
         * 13: arraylength
         * 14: dup_x1
         * 15: putfield      #48                 // Field size:I
         * 18: ifeq          57
         * 21: aload_1
         * 22: invokeinterface #52,  1           // InterfaceMethod java/util/Collection.getClass:()Ljava/lang/Class;
         * 27: ldc           #10                 // class java/util/ArrayList
         * 29: if_acmpne     40
         * 32: aload_0
         * 33: aload_2
         * 34: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 37: goto          64
         * 40: aload_0
         * 41: aload_2
         * 42: aload_0
         * 43: getfield      #48                 // Field size:I
         * 46: ldc           #56                 // class "[Ljava/lang/Object;"
         * 48: invokestatic  #57                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;
         * 51: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 54: goto          64
         * 57: aload_0
         * 58: getstatic     #15                 // Field EMPTY_ELEMENTDATA:[Ljava/lang/Object;
         * 61: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 64: return
         *  */
        // </editor-fold>
    }

    public void trimToSize() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: getfield      #63                 // Field modCount:I
         * 5: iconst_1
         * 6: iadd
         * 7: putfield      #63                 // Field modCount:I
         * 10: aload_0
         * 11: getfield      #48                 // Field size:I
         * 14: aload_0
         * 15: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 18: arraylength
         * 19: if_icmpge     50
         * 22: aload_0
         * 23: aload_0
         * 24: getfield      #48                 // Field size:I
         * 27: ifne          36
         * 30: getstatic     #15                 // Field EMPTY_ELEMENTDATA:[Ljava/lang/Object;
         * 33: goto          47
         * 36: aload_0
         * 37: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 40: aload_0
         * 41: getfield      #48                 // Field size:I
         * 44: invokestatic  #66                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
         * 47: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 50: return
         *  */
        // </editor-fold>
    }

    public void ensureCapacity(int minCapacity) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: aload_0
         * 2: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 5: arraylength
         * 6: if_icmple     41
         * 9: aload_0
         * 10: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 13: getstatic     #39                 // Field DEFAULTCAPACITY_EMPTY_ELEMENTDATA:[Ljava/lang/Object;
         * 16: if_acmpne     25
         * 19: iload_1
         * 20: bipush        10
         * 22: if_icmple     41
         * 25: aload_0
         * 26: dup
         * 27: getfield      #63                 // Field modCount:I
         * 30: iconst_1
         * 31: iadd
         * 32: putfield      #63                 // Field modCount:I
         * 35: aload_0
         * 36: iload_1
         * 37: invokevirtual #69                 // Method grow:(I)[Ljava/lang/Object;
         * 40: pop
         * 41: return
         *  */
        // </editor-fold>
    }

    private Object[] grow(int minCapacity) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 4: arraylength
         * 5: istore_2
         * 6: iload_2
         * 7: ifgt          20
         * 10: aload_0
         * 11: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 14: getstatic     #39                 // Field DEFAULTCAPACITY_EMPTY_ELEMENTDATA:[Ljava/lang/Object;
         * 17: if_acmpeq     45
         * 20: iload_2
         * 21: iload_1
         * 22: iload_2
         * 23: isub
         * 24: iload_2
         * 25: iconst_1
         * 26: ishr
         * 27: invokestatic  #73                 // Method jdk/internal/util/ArraysSupport.newLength:(III)I
         * 30: istore_3
         * 31: aload_0
         * 32: aload_0
         * 33: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 36: iload_3
         * 37: invokestatic  #66                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
         * 40: dup_x1
         * 41: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 44: areturn
         * 45: aload_0
         * 46: bipush        10
         * 48: iload_1
         * 49: invokestatic  #79                 // Method java/lang/Math.max:(II)I
         * 52: anewarray     #7                  // class java/lang/Object
         * 55: dup_x1
         * 56: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 59: areturn
         *  */
        // </editor-fold>
    }

    private Object[] grow() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_0
         * 2: getfield      #48                 // Field size:I
         * 5: iconst_1
         * 6: iadd
         * 7: invokevirtual #69                 // Method grow:(I)[Ljava/lang/Object;
         * 10: areturn
         *  */
        // </editor-fold>
    }

    public int size() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #48                 // Field size:I
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    public boolean isEmpty() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #48                 // Field size:I
         * 4: ifne          11
         * 7: iconst_1
         * 8: goto          12
         * 11: iconst_0
         * 12: ireturn
         *  */
        // </editor-fold>
    }

    public boolean contains(Object o) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #85                 // Method indexOf:(Ljava/lang/Object;)I
         * 5: iflt          12
         * 8: iconst_1
         * 9: goto          13
         * 12: iconst_0
         * 13: ireturn
         *  */
        // </editor-fold>
    }

    public int indexOf(Object o) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: aload_0
         * 4: getfield      #48                 // Field size:I
         * 7: invokevirtual #89                 // Method indexOfRange:(Ljava/lang/Object;II)I
         * 10: ireturn
         *  */
        // </editor-fold>
    }

    int indexOfRange(Object o, int start, int end) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 4: astore        4
         * 6: aload_1
         * 7: ifnonnull     39
         * 10: iload_2
         * 11: istore        5
         * 13: iload         5
         * 15: iload_3
         * 16: if_icmpge     36
         * 19: aload         4
         * 21: iload         5
         * 23: aaload
         * 24: ifnonnull     30
         * 27: iload         5
         * 29: ireturn
         * 30: iinc          5, 1
         * 33: goto          13
         * 36: goto          69
         * 39: iload_2
         * 40: istore        5
         * 42: iload         5
         * 44: iload_3
         * 45: if_icmpge     69
         * 48: aload_1
         * 49: aload         4
         * 51: iload         5
         * 53: aaload
         * 54: invokevirtual #93                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 57: ifeq          63
         * 60: iload         5
         * 62: ireturn
         * 63: iinc          5, 1
         * 66: goto          42
         * 69: iconst_m1
         * 70: ireturn
         *  */
        // </editor-fold>
    }

    public int lastIndexOf(Object o) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: aload_0
         * 4: getfield      #48                 // Field size:I
         * 7: invokevirtual #97                 // Method lastIndexOfRange:(Ljava/lang/Object;II)I
         * 10: ireturn
         *  */
        // </editor-fold>
    }

    int lastIndexOfRange(Object o, int start, int end) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 4: astore        4
         * 6: aload_1
         * 7: ifnonnull     41
         * 10: iload_3
         * 11: iconst_1
         * 12: isub
         * 13: istore        5
         * 15: iload         5
         * 17: iload_2
         * 18: if_icmplt     38
         * 21: aload         4
         * 23: iload         5
         * 25: aaload
         * 26: ifnonnull     32
         * 29: iload         5
         * 31: ireturn
         * 32: iinc          5, -1
         * 35: goto          15
         * 38: goto          73
         * 41: iload_3
         * 42: iconst_1
         * 43: isub
         * 44: istore        5
         * 46: iload         5
         * 48: iload_2
         * 49: if_icmplt     73
         * 52: aload_1
         * 53: aload         4
         * 55: iload         5
         * 57: aaload
         * 58: invokevirtual #93                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 61: ifeq          67
         * 64: iload         5
         * 66: ireturn
         * 67: iinc          5, -1
         * 70: goto          46
         * 73: iconst_m1
         * 74: ireturn
         *  */
        // </editor-fold>
    }

    public Object clone() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #100                // Method java/lang/Object.clone:()Ljava/lang/Object;
         * 4: checkcast     #10                 // class java/util/ArrayList
         * 7: astore_1
         * 8: aload_1
         * 9: aload_0
         * 10: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 13: aload_0
         * 14: getfield      #48                 // Field size:I
         * 17: invokestatic  #66                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
         * 20: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 23: aload_1
         * 24: iconst_0
         * 25: putfield      #63                 // Field modCount:I
         * 28: aload_1
         * 29: areturn
         * 30: astore_1
         * 31: new           #106                // class java/lang/InternalError
         * 34: dup
         * 35: aload_1
         * 36: invokespecial #108                // Method java/lang/InternalError."<init>":(Ljava/lang/Throwable;)V
         * 39: athrow
         * Exception table:
         * from    to  target type
         * 0    29    30   Class java/lang/CloneNotSupportedException
         *  */
        // </editor-fold>
    }

    public Object[] toArray() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 4: aload_0
         * 5: getfield      #48                 // Field size:I
         * 8: invokestatic  #66                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
         * 11: areturn
         *  */
        // </editor-fold>
    }

    public <T extends Object> T[] toArray(T[] a) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: arraylength
         * 2: aload_0
         * 3: getfield      #48                 // Field size:I
         * 6: if_icmpge     25
         * 9: aload_0
         * 10: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 13: aload_0
         * 14: getfield      #48                 // Field size:I
         * 17: aload_1
         * 18: invokevirtual #111                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 21: invokestatic  #57                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;
         * 24: areturn
         * 25: aload_0
         * 26: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 29: iconst_0
         * 30: aload_1
         * 31: iconst_0
         * 32: aload_0
         * 33: getfield      #48                 // Field size:I
         * 36: invokestatic  #112                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 39: aload_1
         * 40: arraylength
         * 41: aload_0
         * 42: getfield      #48                 // Field size:I
         * 45: if_icmple     55
         * 48: aload_1
         * 49: aload_0
         * 50: getfield      #48                 // Field size:I
         * 53: aconst_null
         * 54: aastore
         * 55: aload_1
         * 56: areturn
         *  */
        // </editor-fold>
    }

    E elementData(int index) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 4: iload_1
         * 5: aaload
         * 6: areturn
         *  */
        // </editor-fold>
    }

    static <E extends Object> E elementAt(Object[] es, int index) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: aaload
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public E get(int index) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: aload_0
         * 2: getfield      #48                 // Field size:I
         * 5: invokestatic  #118                // Method java/util/Objects.checkIndex:(II)I
         * 8: pop
         * 9: aload_0
         * 10: iload_1
         * 11: invokevirtual #123                // Method elementData:(I)Ljava/lang/Object;
         * 14: areturn
         *  */
        // </editor-fold>
    }

    public E getFirst() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #48                 // Field size:I
         * 4: ifne          15
         * 7: new           #126                // class java/util/NoSuchElementException
         * 10: dup
         * 11: invokespecial #128                // Method java/util/NoSuchElementException."<init>":()V
         * 14: athrow
         * 15: aload_0
         * 16: iconst_0
         * 17: invokevirtual #123                // Method elementData:(I)Ljava/lang/Object;
         * 20: areturn
         *  */
        // </editor-fold>
    }

    public E getLast() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #48                 // Field size:I
         * 4: iconst_1
         * 5: isub
         * 6: istore_1
         * 7: iload_1
         * 8: ifge          19
         * 11: new           #126                // class java/util/NoSuchElementException
         * 14: dup
         * 15: invokespecial #128                // Method java/util/NoSuchElementException."<init>":()V
         * 18: athrow
         * 19: aload_0
         * 20: iload_1
         * 21: invokevirtual #123                // Method elementData:(I)Ljava/lang/Object;
         * 24: areturn
         *  */
        // </editor-fold>
    }

    public E set(int index, E element) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: aload_0
         * 2: getfield      #48                 // Field size:I
         * 5: invokestatic  #118                // Method java/util/Objects.checkIndex:(II)I
         * 8: pop
         * 9: aload_0
         * 10: iload_1
         * 11: invokevirtual #123                // Method elementData:(I)Ljava/lang/Object;
         * 14: astore_3
         * 15: aload_0
         * 16: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 19: iload_1
         * 20: aload_2
         * 21: aastore
         * 22: aload_3
         * 23: areturn
         *  */
        // </editor-fold>
    }

    private void add(E e, Object[] elementData, int s) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_3
         * 1: aload_2
         * 2: arraylength
         * 3: if_icmpne     11
         * 6: aload_0
         * 7: invokevirtual #129                // Method grow:()[Ljava/lang/Object;
         * 10: astore_2
         * 11: aload_2
         * 12: iload_3
         * 13: aload_1
         * 14: aastore
         * 15: aload_0
         * 16: iload_3
         * 17: iconst_1
         * 18: iadd
         * 19: putfield      #48                 // Field size:I
         * 22: return
         *  */
        // </editor-fold>
    }

    public boolean add(E e) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: getfield      #63                 // Field modCount:I
         * 5: iconst_1
         * 6: iadd
         * 7: putfield      #63                 // Field modCount:I
         * 10: aload_0
         * 11: aload_1
         * 12: aload_0
         * 13: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 16: aload_0
         * 17: getfield      #48                 // Field size:I
         * 20: invokevirtual #131                // Method add:(Ljava/lang/Object;[Ljava/lang/Object;I)V
         * 23: iconst_1
         * 24: ireturn
         *  */
        // </editor-fold>
    }

    public void add(int index, E element) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokevirtual #135                // Method rangeCheckForAdd:(I)V
         * 5: aload_0
         * 6: dup
         * 7: getfield      #63                 // Field modCount:I
         * 10: iconst_1
         * 11: iadd
         * 12: putfield      #63                 // Field modCount:I
         * 15: aload_0
         * 16: getfield      #48                 // Field size:I
         * 19: dup
         * 20: istore_3
         * 21: aload_0
         * 22: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 25: dup
         * 26: astore        4
         * 28: arraylength
         * 29: if_icmpne     38
         * 32: aload_0
         * 33: invokevirtual #129                // Method grow:()[Ljava/lang/Object;
         * 36: astore        4
         * 38: aload         4
         * 40: iload_1
         * 41: aload         4
         * 43: iload_1
         * 44: iconst_1
         * 45: iadd
         * 46: iload_3
         * 47: iload_1
         * 48: isub
         * 49: invokestatic  #112                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 52: aload         4
         * 54: iload_1
         * 55: aload_2
         * 56: aastore
         * 57: aload_0
         * 58: iload_3
         * 59: iconst_1
         * 60: iadd
         * 61: putfield      #48                 // Field size:I
         * 64: return
         *  */
        // </editor-fold>
    }

    public void addFirst(E element) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: aload_1
         * 3: invokevirtual #139                // Method add:(ILjava/lang/Object;)V
         * 6: return
         *  */
        // </editor-fold>
    }

    public void addLast(E element) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #142                // Method add:(Ljava/lang/Object;)Z
         * 5: pop
         * 6: return
         *  */
        // </editor-fold>
    }

    public E remove(int index) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: aload_0
         * 2: getfield      #48                 // Field size:I
         * 5: invokestatic  #118                // Method java/util/Objects.checkIndex:(II)I
         * 8: pop
         * 9: aload_0
         * 10: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 13: astore_2
         * 14: aload_2
         * 15: iload_1
         * 16: aaload
         * 17: astore_3
         * 18: aload_0
         * 19: aload_2
         * 20: iload_1
         * 21: invokevirtual #144                // Method fastRemove:([Ljava/lang/Object;I)V
         * 24: aload_3
         * 25: areturn
         *  */
        // </editor-fold>
    }

    public E removeFirst() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #48                 // Field size:I
         * 4: ifne          15
         * 7: new           #126                // class java/util/NoSuchElementException
         * 10: dup
         * 11: invokespecial #128                // Method java/util/NoSuchElementException."<init>":()V
         * 14: athrow
         * 15: aload_0
         * 16: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 19: astore_1
         * 20: aload_1
         * 21: iconst_0
         * 22: aaload
         * 23: astore_2
         * 24: aload_0
         * 25: aload_1
         * 26: iconst_0
         * 27: invokevirtual #144                // Method fastRemove:([Ljava/lang/Object;I)V
         * 30: aload_2
         * 31: areturn
         *  */
        // </editor-fold>
    }

    public E removeLast() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #48                 // Field size:I
         * 4: iconst_1
         * 5: isub
         * 6: istore_1
         * 7: iload_1
         * 8: ifge          19
         * 11: new           #126                // class java/util/NoSuchElementException
         * 14: dup
         * 15: invokespecial #128                // Method java/util/NoSuchElementException."<init>":()V
         * 18: athrow
         * 19: aload_0
         * 20: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 23: astore_2
         * 24: aload_2
         * 25: iload_1
         * 26: aaload
         * 27: astore_3
         * 28: aload_0
         * 29: aload_2
         * 30: iload_1
         * 31: invokevirtual #144                // Method fastRemove:([Ljava/lang/Object;I)V
         * 34: aload_3
         * 35: areturn
         *  */
        // </editor-fold>
    }

    public boolean equals(Object o) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: aload_0
         * 2: if_acmpne     7
         * 5: iconst_1
         * 6: ireturn
         * 7: aload_1
         * 8: instanceof    #148                // class java/util/List
         * 11: ifne          16
         * 14: iconst_0
         * 15: ireturn
         * 16: aload_0
         * 17: getfield      #63                 // Field modCount:I
         * 20: istore_2
         * 21: aload_1
         * 22: invokevirtual #111                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 25: ldc           #10                 // class java/util/ArrayList
         * 27: if_acmpne     41
         * 30: aload_0
         * 31: aload_1
         * 32: checkcast     #10                 // class java/util/ArrayList
         * 35: invokevirtual #150                // Method equalsArrayList:(Ljava/util/ArrayList;)Z
         * 38: goto          54
         * 41: aload_0
         * 42: aload_1
         * 43: checkcast     #148                // class java/util/List
         * 46: iconst_0
         * 47: aload_0
         * 48: getfield      #48                 // Field size:I
         * 51: invokevirtual #154                // Method equalsRange:(Ljava/util/List;II)Z
         * 54: istore_3
         * 55: aload_0
         * 56: iload_2
         * 57: invokevirtual #158                // Method checkForComodification:(I)V
         * 60: iload_3
         * 61: ireturn
         *  */
        // </editor-fold>
    }

    boolean equalsRange(List<?> other, int from, int to) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 4: astore        4
         * 6: iload_3
         * 7: aload         4
         * 9: arraylength
         * 10: if_icmple     21
         * 13: new           #161                // class java/util/ConcurrentModificationException
         * 16: dup
         * 17: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 20: athrow
         * 21: aload_1
         * 22: invokeinterface #164,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         * 27: astore        5
         * 29: iload_2
         * 30: iload_3
         * 31: if_icmpge     69
         * 34: aload         5
         * 36: invokeinterface #168,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
         * 41: ifeq          61
         * 44: aload         4
         * 46: iload_2
         * 47: aaload
         * 48: aload         5
         * 50: invokeinterface #174,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
         * 55: invokestatic  #177                // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
         * 58: ifne          63
         * 61: iconst_0
         * 62: ireturn
         * 63: iinc          2, 1
         * 66: goto          29
         * 69: aload         5
         * 71: invokeinterface #168,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
         * 76: ifne          83
         * 79: iconst_1
         * 80: goto          84
         * 83: iconst_0
         * 84: ireturn
         *  */
        // </editor-fold>
    }

    private boolean equalsArrayList(ArrayList<?> other) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: getfield      #63                 // Field modCount:I
         * 4: istore_2
         * 5: aload_0
         * 6: getfield      #48                 // Field size:I
         * 9: istore_3
         * 10: iload_3
         * 11: aload_1
         * 12: getfield      #48                 // Field size:I
         * 15: if_icmpne     22
         * 18: iconst_1
         * 19: goto          23
         * 22: iconst_0
         * 23: dup
         * 24: istore        4
         * 26: ifeq          100
         * 29: aload_1
         * 30: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 33: astore        5
         * 35: aload_0
         * 36: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 39: astore        6
         * 41: iload_3
         * 42: aload         6
         * 44: arraylength
         * 45: if_icmpgt     55
         * 48: iload_3
         * 49: aload         5
         * 51: arraylength
         * 52: if_icmple     63
         * 55: new           #161                // class java/util/ConcurrentModificationException
         * 58: dup
         * 59: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 62: athrow
         * 63: iconst_0
         * 64: istore        7
         * 66: iload         7
         * 68: iload_3
         * 69: if_icmpge     100
         * 72: aload         6
         * 74: iload         7
         * 76: aaload
         * 77: aload         5
         * 79: iload         7
         * 81: aaload
         * 82: invokestatic  #177                // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
         * 85: ifne          94
         * 88: iconst_0
         * 89: istore        4
         * 91: goto          100
         * 94: iinc          7, 1
         * 97: goto          66
         * 100: aload_1
         * 101: iload_2
         * 102: invokevirtual #158                // Method checkForComodification:(I)V
         * 105: iload         4
         * 107: ireturn
         *  */
        // </editor-fold>
    }

    private void checkForComodification(int expectedModCount) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #63                 // Field modCount:I
         * 4: iload_1
         * 5: if_icmpeq     16
         * 8: new           #161                // class java/util/ConcurrentModificationException
         * 11: dup
         * 12: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 15: athrow
         * 16: return
         *  */
        // </editor-fold>
    }

    public int hashCode() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #63                 // Field modCount:I
         * 4: istore_1
         * 5: aload_0
         * 6: iconst_0
         * 7: aload_0
         * 8: getfield      #48                 // Field size:I
         * 11: invokevirtual #180                // Method hashCodeRange:(II)I
         * 14: istore_2
         * 15: aload_0
         * 16: iload_1
         * 17: invokevirtual #158                // Method checkForComodification:(I)V
         * 20: iload_2
         * 21: ireturn
         *  */
        // </editor-fold>
    }

    int hashCodeRange(int from, int to) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 4: astore_3
         * 5: iload_2
         * 6: aload_3
         * 7: arraylength
         * 8: if_icmple     19
         * 11: new           #161                // class java/util/ConcurrentModificationException
         * 14: dup
         * 15: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 18: athrow
         * 19: iconst_1
         * 20: istore        4
         * 22: iload_1
         * 23: istore        5
         * 25: iload         5
         * 27: iload_2
         * 28: if_icmpge     65
         * 31: aload_3
         * 32: iload         5
         * 34: aaload
         * 35: astore        6
         * 37: bipush        31
         * 39: iload         4
         * 41: imul
         * 42: aload         6
         * 44: ifnonnull     51
         * 47: iconst_0
         * 48: goto          56
         * 51: aload         6
         * 53: invokevirtual #183                // Method java/lang/Object.hashCode:()I
         * 56: iadd
         * 57: istore        4
         * 59: iinc          5, 1
         * 62: goto          25
         * 65: iload         4
         * 67: ireturn
         *  */
        // </editor-fold>
    }

    public boolean remove(Object o) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 4: astore_2
         * 5: aload_0
         * 6: getfield      #48                 // Field size:I
         * 9: istore_3
         * 10: iconst_0
         * 11: istore        4
         * 13: aload_1
         * 14: ifnonnull     39
         * 17: iload         4
         * 19: iload_3
         * 20: if_icmpge     65
         * 23: aload_2
         * 24: iload         4
         * 26: aaload
         * 27: ifnonnull     33
         * 30: goto          67
         * 33: iinc          4, 1
         * 36: goto          17
         * 39: iload         4
         * 41: iload_3
         * 42: if_icmpge     65
         * 45: aload_1
         * 46: aload_2
         * 47: iload         4
         * 49: aaload
         * 50: invokevirtual #93                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 53: ifeq          59
         * 56: goto          67
         * 59: iinc          4, 1
         * 62: goto          39
         * 65: iconst_0
         * 66: ireturn
         * 67: aload_0
         * 68: aload_2
         * 69: iload         4
         * 71: invokevirtual #144                // Method fastRemove:([Ljava/lang/Object;I)V
         * 74: iconst_1
         * 75: ireturn
         *  */
        // </editor-fold>
    }

    private void fastRemove(Object[] es, int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: getfield      #63                 // Field modCount:I
         * 5: iconst_1
         * 6: iadd
         * 7: putfield      #63                 // Field modCount:I
         * 10: aload_0
         * 11: getfield      #48                 // Field size:I
         * 14: iconst_1
         * 15: isub
         * 16: dup
         * 17: istore_3
         * 18: iload_2
         * 19: if_icmple     34
         * 22: aload_1
         * 23: iload_2
         * 24: iconst_1
         * 25: iadd
         * 26: aload_1
         * 27: iload_2
         * 28: iload_3
         * 29: iload_2
         * 30: isub
         * 31: invokestatic  #112                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 34: aload_1
         * 35: aload_0
         * 36: iload_3
         * 37: dup_x1
         * 38: putfield      #48                 // Field size:I
         * 41: aconst_null
         * 42: aastore
         * 43: return
         *  */
        // </editor-fold>
    }

    public void clear() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: getfield      #63                 // Field modCount:I
         * 5: iconst_1
         * 6: iadd
         * 7: putfield      #63                 // Field modCount:I
         * 10: aload_0
         * 11: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 14: astore_1
         * 15: aload_0
         * 16: getfield      #48                 // Field size:I
         * 19: istore_2
         * 20: aload_0
         * 21: iconst_0
         * 22: dup_x1
         * 23: putfield      #48                 // Field size:I
         * 26: istore_3
         * 27: iload_3
         * 28: iload_2
         * 29: if_icmpge     42
         * 32: aload_1
         * 33: iload_3
         * 34: aconst_null
         * 35: aastore
         * 36: iinc          3, 1
         * 39: goto          27
         * 42: return
         *  */
        // </editor-fold>
    }

    public boolean addAll(Collection<? extends E> c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokeinterface #42,  1           // InterfaceMethod java/util/Collection.toArray:()[Ljava/lang/Object;
         * 6: astore_2
         * 7: aload_0
         * 8: dup
         * 9: getfield      #63                 // Field modCount:I
         * 12: iconst_1
         * 13: iadd
         * 14: putfield      #63                 // Field modCount:I
         * 17: aload_2
         * 18: arraylength
         * 19: istore_3
         * 20: iload_3
         * 21: ifne          26
         * 24: iconst_0
         * 25: ireturn
         * 26: iload_3
         * 27: aload_0
         * 28: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 31: dup
         * 32: astore        4
         * 34: arraylength
         * 35: aload_0
         * 36: getfield      #48                 // Field size:I
         * 39: dup
         * 40: istore        5
         * 42: isub
         * 43: if_icmple     56
         * 46: aload_0
         * 47: iload         5
         * 49: iload_3
         * 50: iadd
         * 51: invokevirtual #69                 // Method grow:(I)[Ljava/lang/Object;
         * 54: astore        4
         * 56: aload_2
         * 57: iconst_0
         * 58: aload         4
         * 60: iload         5
         * 62: iload_3
         * 63: invokestatic  #112                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 66: aload_0
         * 67: iload         5
         * 69: iload_3
         * 70: iadd
         * 71: putfield      #48                 // Field size:I
         * 74: iconst_1
         * 75: ireturn
         *  */
        // </editor-fold>
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokevirtual #135                // Method rangeCheckForAdd:(I)V
         * 5: aload_2
         * 6: invokeinterface #42,  1           // InterfaceMethod java/util/Collection.toArray:()[Ljava/lang/Object;
         * 11: astore_3
         * 12: aload_0
         * 13: dup
         * 14: getfield      #63                 // Field modCount:I
         * 17: iconst_1
         * 18: iadd
         * 19: putfield      #63                 // Field modCount:I
         * 22: aload_3
         * 23: arraylength
         * 24: istore        4
         * 26: iload         4
         * 28: ifne          33
         * 31: iconst_0
         * 32: ireturn
         * 33: iload         4
         * 35: aload_0
         * 36: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 39: dup
         * 40: astore        5
         * 42: arraylength
         * 43: aload_0
         * 44: getfield      #48                 // Field size:I
         * 47: dup
         * 48: istore        6
         * 50: isub
         * 51: if_icmple     65
         * 54: aload_0
         * 55: iload         6
         * 57: iload         4
         * 59: iadd
         * 60: invokevirtual #69                 // Method grow:(I)[Ljava/lang/Object;
         * 63: astore        5
         * 65: iload         6
         * 67: iload_1
         * 68: isub
         * 69: istore        7
         * 71: iload         7
         * 73: ifle          90
         * 76: aload         5
         * 78: iload_1
         * 79: aload         5
         * 81: iload_1
         * 82: iload         4
         * 84: iadd
         * 85: iload         7
         * 87: invokestatic  #112                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 90: aload_3
         * 91: iconst_0
         * 92: aload         5
         * 94: iload_1
         * 95: iload         4
         * 97: invokestatic  #112                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 100: aload_0
         * 101: iload         6
         * 103: iload         4
         * 105: iadd
         * 106: putfield      #48                 // Field size:I
         * 109: iconst_1
         * 110: ireturn
         *  */
        // </editor-fold>
    }

    protected void removeRange(int fromIndex, int toIndex) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: iload_2
         * 2: if_icmple     18
         * 5: new           #187                // class java/lang/IndexOutOfBoundsException
         * 8: dup
         * 9: iload_1
         * 10: iload_2
         * 11: invokestatic  #189                // Method outOfBoundsMsg:(II)Ljava/lang/String;
         * 14: invokespecial #193                // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
         * 17: athrow
         * 18: aload_0
         * 19: dup
         * 20: getfield      #63                 // Field modCount:I
         * 23: iconst_1
         * 24: iadd
         * 25: putfield      #63                 // Field modCount:I
         * 28: aload_0
         * 29: aload_0
         * 30: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 33: iload_1
         * 34: iload_2
         * 35: invokevirtual #194                // Method shiftTailOverGap:([Ljava/lang/Object;II)V
         * 38: return
         *  */
        // </editor-fold>
    }

    private void shiftTailOverGap(Object[] es, int lo, int hi) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: iload_3
         * 2: aload_1
         * 3: iload_2
         * 4: aload_0
         * 5: getfield      #48                 // Field size:I
         * 8: iload_3
         * 9: isub
         * 10: invokestatic  #112                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 13: aload_0
         * 14: getfield      #48                 // Field size:I
         * 17: istore        4
         * 19: aload_0
         * 20: dup
         * 21: getfield      #48                 // Field size:I
         * 24: iload_3
         * 25: iload_2
         * 26: isub
         * 27: isub
         * 28: dup_x1
         * 29: putfield      #48                 // Field size:I
         * 32: istore        5
         * 34: iload         5
         * 36: iload         4
         * 38: if_icmpge     52
         * 41: aload_1
         * 42: iload         5
         * 44: aconst_null
         * 45: aastore
         * 46: iinc          5, 1
         * 49: goto          34
         * 52: return
         *  */
        // </editor-fold>
    }

    private void rangeCheckForAdd(int index) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: aload_0
         * 2: getfield      #48                 // Field size:I
         * 5: if_icmpgt     12
         * 8: iload_1
         * 9: ifge          25
         * 12: new           #187                // class java/lang/IndexOutOfBoundsException
         * 15: dup
         * 16: aload_0
         * 17: iload_1
         * 18: invokevirtual #198                // Method outOfBoundsMsg:(I)Ljava/lang/String;
         * 21: invokespecial #193                // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
         * 24: athrow
         * 25: return
         *  */
        // </editor-fold>
    }

    private String outOfBoundsMsg(int index) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #20                 // class java/lang/StringBuilder
         * 3: dup
         * 4: invokespecial #22                 // Method java/lang/StringBuilder."<init>":()V
         * 7: ldc           #201                // String Index:
         * 9: invokevirtual #25                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 12: iload_1
         * 13: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 16: ldc           #203                // String , Size:
         * 18: invokevirtual #25                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 21: aload_0
         * 22: getfield      #48                 // Field size:I
         * 25: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 28: invokevirtual #32                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 31: areturn
         *  */
        // </editor-fold>
    }

    private static String outOfBoundsMsg(int fromIndex, int toIndex) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #20                 // class java/lang/StringBuilder
         * 3: dup
         * 4: invokespecial #22                 // Method java/lang/StringBuilder."<init>":()V
         * 7: ldc           #205                // String From Index:
         * 9: invokevirtual #25                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 12: iload_0
         * 13: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 16: ldc           #207                // String  > To Index:
         * 18: invokevirtual #25                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 21: iload_1
         * 22: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 25: invokevirtual #32                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 28: areturn
         *  */
        // </editor-fold>
    }

    public boolean removeAll(Collection<?> c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: iconst_0
         * 4: aload_0
         * 5: getfield      #48                 // Field size:I
         * 8: invokevirtual #209                // Method batchRemove:(Ljava/util/Collection;ZII)Z
         * 11: ireturn
         *  */
        // </editor-fold>
    }

    public boolean retainAll(Collection<?> c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_1
         * 3: iconst_0
         * 4: aload_0
         * 5: getfield      #48                 // Field size:I
         * 8: invokevirtual #209                // Method batchRemove:(Ljava/util/Collection;ZII)Z
         * 11: ireturn
         *  */
        // </editor-fold>
    }

    boolean batchRemove(Collection<?> c, boolean complement, int from, int end) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokestatic  #213                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 4: pop
         * 5: aload_0
         * 6: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 9: astore        5
         * 11: iload_3
         * 12: istore        6
         * 14: iload         6
         * 16: iload         4
         * 18: if_icmpne     23
         * 21: iconst_0
         * 22: ireturn
         * 23: aload_1
         * 24: aload         5
         * 26: iload         6
         * 28: aaload
         * 29: invokeinterface #217,  2          // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
         * 34: iload_2
         * 35: if_icmpeq     41
         * 38: goto          47
         * 41: iinc          6, 1
         * 44: goto          14
         * 47: iload         6
         * 49: iinc          6, 1
         * 52: istore        7
         * 54: iload         6
         * 56: iload         4
         * 58: if_icmpge     95
         * 61: aload_1
         * 62: aload         5
         * 64: iload         6
         * 66: aaload
         * 67: dup
         * 68: astore        8
         * 70: invokeinterface #217,  2          // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
         * 75: iload_2
         * 76: if_icmpne     89
         * 79: aload         5
         * 81: iload         7
         * 83: iinc          7, 1
         * 86: aload         8
         * 88: aastore
         * 89: iinc          6, 1
         * 92: goto          54
         * 95: aload_0
         * 96: dup
         * 97: getfield      #63                 // Field modCount:I
         * 100: iload         4
         * 102: iload         7
         * 104: isub
         * 105: iadd
         * 106: putfield      #63                 // Field modCount:I
         * 109: aload_0
         * 110: aload         5
         * 112: iload         7
         * 114: iload         4
         * 116: invokevirtual #194                // Method shiftTailOverGap:([Ljava/lang/Object;II)V
         * 119: goto          182
         * 122: astore        8
         * 124: aload         5
         * 126: iload         6
         * 128: aload         5
         * 130: iload         7
         * 132: iload         4
         * 134: iload         6
         * 136: isub
         * 137: invokestatic  #112                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 140: iload         7
         * 142: iload         4
         * 144: iload         6
         * 146: isub
         * 147: iadd
         * 148: istore        7
         * 150: aload         8
         * 152: athrow
         * 153: astore        9
         * 155: aload_0
         * 156: dup
         * 157: getfield      #63                 // Field modCount:I
         * 160: iload         4
         * 162: iload         7
         * 164: isub
         * 165: iadd
         * 166: putfield      #63                 // Field modCount:I
         * 169: aload_0
         * 170: aload         5
         * 172: iload         7
         * 174: iload         4
         * 176: invokevirtual #194                // Method shiftTailOverGap:([Ljava/lang/Object;II)V
         * 179: aload         9
         * 181: athrow
         * 182: iconst_1
         * 183: ireturn
         * Exception table:
         * from    to  target type
         * 54    95   122   Class java/lang/Throwable
         * 54    95   153   any
         * 122   155   153   any
         *  */
        // </editor-fold>
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #63                 // Field modCount:I
         * 4: istore_2
         * 5: aload_1
         * 6: invokevirtual #222                // Method java/io/ObjectOutputStream.defaultWriteObject:()V
         * 9: aload_1
         * 10: aload_0
         * 11: getfield      #48                 // Field size:I
         * 14: invokevirtual #227                // Method java/io/ObjectOutputStream.writeInt:(I)V
         * 17: iconst_0
         * 18: istore_3
         * 19: iload_3
         * 20: aload_0
         * 21: getfield      #48                 // Field size:I
         * 24: if_icmpge     43
         * 27: aload_1
         * 28: aload_0
         * 29: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 32: iload_3
         * 33: aaload
         * 34: invokevirtual #230                // Method java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
         * 37: iinc          3, 1
         * 40: goto          19
         * 43: aload_0
         * 44: getfield      #63                 // Field modCount:I
         * 47: iload_2
         * 48: if_icmpeq     59
         * 51: new           #161                // class java/util/ConcurrentModificationException
         * 54: dup
         * 55: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 58: athrow
         * 59: return
         *  */
        // </editor-fold>
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokevirtual #234                // Method java/io/ObjectInputStream.defaultReadObject:()V
         * 4: aload_1
         * 5: invokevirtual #239                // Method java/io/ObjectInputStream.readInt:()I
         * 8: pop
         * 9: aload_0
         * 10: getfield      #48                 // Field size:I
         * 13: ifle          70
         * 16: invokestatic  #242                // Method jdk/internal/access/SharedSecrets.getJavaObjectInputStreamAccess:()Ljdk/internal/access/JavaObjectInputStreamAccess;
         * 19: aload_1
         * 20: ldc           #56                 // class "[Ljava/lang/Object;"
         * 22: aload_0
         * 23: getfield      #48                 // Field size:I
         * 26: invokeinterface #248,  4          // InterfaceMethod jdk/internal/access/JavaObjectInputStreamAccess.checkArray:(Ljava/io/ObjectInputStream;Ljava/lang/Class;I)V
         * 31: aload_0
         * 32: getfield      #48                 // Field size:I
         * 35: anewarray     #7                  // class java/lang/Object
         * 38: astore_2
         * 39: iconst_0
         * 40: istore_3
         * 41: iload_3
         * 42: aload_0
         * 43: getfield      #48                 // Field size:I
         * 46: if_icmpge     62
         * 49: aload_2
         * 50: iload_3
         * 51: aload_1
         * 52: invokevirtual #254                // Method java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
         * 55: aastore
         * 56: iinc          3, 1
         * 59: goto          41
         * 62: aload_0
         * 63: aload_2
         * 64: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 67: goto          118
         * 70: aload_0
         * 71: getfield      #48                 // Field size:I
         * 74: ifne          87
         * 77: aload_0
         * 78: getstatic     #15                 // Field EMPTY_ELEMENTDATA:[Ljava/lang/Object;
         * 81: putfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 84: goto          118
         * 87: new           #257                // class java/io/InvalidObjectException
         * 90: dup
         * 91: new           #20                 // class java/lang/StringBuilder
         * 94: dup
         * 95: invokespecial #22                 // Method java/lang/StringBuilder."<init>":()V
         * 98: ldc_w         #259                // String Invalid size:
         * 101: invokevirtual #25                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 104: aload_0
         * 105: getfield      #48                 // Field size:I
         * 108: invokevirtual #29                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 111: invokevirtual #32                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 114: invokespecial #261                // Method java/io/InvalidObjectException."<init>":(Ljava/lang/String;)V
         * 117: athrow
         * 118: return
         *  */
        // </editor-fold>
    }

    public ListIterator<E> listIterator(int index) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokevirtual #135                // Method rangeCheckForAdd:(I)V
         * 5: new           #262                // class java/util/ArrayList$ListItr
         * 8: dup
         * 9: aload_0
         * 10: iload_1
         * 11: invokespecial #264                // Method java/util/ArrayList$ListItr."<init>":(Ljava/util/ArrayList;I)V
         * 14: areturn
         *  */
        // </editor-fold>
    }

    public ListIterator<E> listIterator() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #262                // class java/util/ArrayList$ListItr
         * 3: dup
         * 4: aload_0
         * 5: iconst_0
         * 6: invokespecial #264                // Method java/util/ArrayList$ListItr."<init>":(Ljava/util/ArrayList;I)V
         * 9: areturn
         *  */
        // </editor-fold>
    }

    public Iterator<E> iterator() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #267                // class java/util/ArrayList$Itr
         * 3: dup
         * 4: aload_0
         * 5: invokespecial #269                // Method java/util/ArrayList$Itr."<init>":(Ljava/util/ArrayList;)V
         * 8: areturn
         *  */
        // </editor-fold>
    }

    public List<E> subList(int fromIndex, int toIndex) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: iload_2
         * 2: aload_0
         * 3: getfield      #48                 // Field size:I
         * 6: invokestatic  #272                // Method subListRangeCheck:(III)V
         * 9: new           #276                // class java/util/ArrayList$SubList
         * 12: dup
         * 13: aload_0
         * 14: iload_1
         * 15: iload_2
         * 16: invokespecial #278                // Method java/util/ArrayList$SubList."<init>":(Ljava/util/ArrayList;II)V
         * 19: areturn
         *  */
        // </editor-fold>
    }

    public void forEach(Consumer<? super E> action) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokestatic  #213                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 4: pop
         * 5: aload_0
         * 6: getfield      #63                 // Field modCount:I
         * 9: istore_2
         * 10: aload_0
         * 11: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 14: astore_3
         * 15: aload_0
         * 16: getfield      #48                 // Field size:I
         * 19: istore        4
         * 21: iconst_0
         * 22: istore        5
         * 24: aload_0
         * 25: getfield      #63                 // Field modCount:I
         * 28: iload_2
         * 29: if_icmpne     57
         * 32: iload         5
         * 34: iload         4
         * 36: if_icmpge     57
         * 39: aload_1
         * 40: aload_3
         * 41: iload         5
         * 43: invokestatic  #281                // Method elementAt:([Ljava/lang/Object;I)Ljava/lang/Object;
         * 46: invokeinterface #285,  2          // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
         * 51: iinc          5, 1
         * 54: goto          24
         * 57: aload_0
         * 58: getfield      #63                 // Field modCount:I
         * 61: iload_2
         * 62: if_icmpeq     73
         * 65: new           #161                // class java/util/ConcurrentModificationException
         * 68: dup
         * 69: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 72: athrow
         * 73: return
         *  */
        // </editor-fold>
    }

    public Spliterator<E> spliterator() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #290                // class java/util/ArrayList$ArrayListSpliterator
         * 3: dup
         * 4: aload_0
         * 5: iconst_0
         * 6: iconst_m1
         * 7: iconst_0
         * 8: invokespecial #292                // Method java/util/ArrayList$ArrayListSpliterator."<init>":(Ljava/util/ArrayList;III)V
         * 11: areturn
         *  */
        // </editor-fold>
    }

    private static long[] nBits(int n) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: iconst_1
         * 2: isub
         * 3: bipush        6
         * 5: ishr
         * 6: iconst_1
         * 7: iadd
         * 8: newarray       long
         * 10: areturn
         *  */
        // </editor-fold>
    }

    private static void setBit(long[] bits, int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: bipush        6
         * 4: ishr
         * 5: dup2
         * 6: laload
         * 7: lconst_1
         * 8: iload_1
         * 9: lshl
         * 10: lor
         * 11: lastore
         * 12: return
         *  */
        // </editor-fold>
    }

    private static boolean isClear(long[] bits, int i) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: bipush        6
         * 4: ishr
         * 5: laload
         * 6: lconst_1
         * 7: iload_1
         * 8: lshl
         * 9: land
         * 10: lconst_0
         * 11: lcmp
         * 12: ifne          19
         * 15: iconst_1
         * 16: goto          20
         * 19: iconst_0
         * 20: ireturn
         *  */
        // </editor-fold>
    }

    public boolean removeIf(Predicate<? super E> filter) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: aload_0
         * 4: getfield      #48                 // Field size:I
         * 7: invokevirtual #295                // Method removeIf:(Ljava/util/function/Predicate;II)Z
         * 10: ireturn
         *  */
        // </editor-fold>
    }

    boolean removeIf(Predicate<? super E> filter, int i, int end) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokestatic  #213                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 4: pop
         * 5: aload_0
         * 6: getfield      #63                 // Field modCount:I
         * 9: istore        4
         * 11: aload_0
         * 12: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 15: astore        5
         * 17: iload_2
         * 18: iload_3
         * 19: if_icmpge     43
         * 22: aload_1
         * 23: aload         5
         * 25: iload_2
         * 26: invokestatic  #281                // Method elementAt:([Ljava/lang/Object;I)Ljava/lang/Object;
         * 29: invokeinterface #299,  2          // InterfaceMethod java/util/function/Predicate.test:(Ljava/lang/Object;)Z
         * 34: ifne          43
         * 37: iinc          2, 1
         * 40: goto          17
         * 43: iload_2
         * 44: iload_3
         * 45: if_icmpge     185
         * 48: iload_2
         * 49: istore        6
         * 51: iload_3
         * 52: iload         6
         * 54: isub
         * 55: invokestatic  #304                // Method nBits:(I)[J
         * 58: astore        7
         * 60: aload         7
         * 62: iconst_0
         * 63: lconst_1
         * 64: lastore
         * 65: iload         6
         * 67: iconst_1
         * 68: iadd
         * 69: istore_2
         * 70: iload_2
         * 71: iload_3
         * 72: if_icmpge     105
         * 75: aload_1
         * 76: aload         5
         * 78: iload_2
         * 79: invokestatic  #281                // Method elementAt:([Ljava/lang/Object;I)Ljava/lang/Object;
         * 82: invokeinterface #299,  2          // InterfaceMethod java/util/function/Predicate.test:(Ljava/lang/Object;)Z
         * 87: ifeq          99
         * 90: aload         7
         * 92: iload_2
         * 93: iload         6
         * 95: isub
         * 96: invokestatic  #308                // Method setBit:([JI)V
         * 99: iinc          2, 1
         * 102: goto          70
         * 105: aload_0
         * 106: getfield      #63                 // Field modCount:I
         * 109: iload         4
         * 111: if_icmpeq     122
         * 114: new           #161                // class java/util/ConcurrentModificationException
         * 117: dup
         * 118: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 121: athrow
         * 122: aload_0
         * 123: dup
         * 124: getfield      #63                 // Field modCount:I
         * 127: iconst_1
         * 128: iadd
         * 129: putfield      #63                 // Field modCount:I
         * 132: iload         6
         * 134: istore        8
         * 136: iload         6
         * 138: istore_2
         * 139: iload_2
         * 140: iload_3
         * 141: if_icmpge     174
         * 144: aload         7
         * 146: iload_2
         * 147: iload         6
         * 149: isub
         * 150: invokestatic  #312                // Method isClear:([JI)Z
         * 153: ifeq          168
         * 156: aload         5
         * 158: iload         8
         * 160: iinc          8, 1
         * 163: aload         5
         * 165: iload_2
         * 166: aaload
         * 167: aastore
         * 168: iinc          2, 1
         * 171: goto          139
         * 174: aload_0
         * 175: aload         5
         * 177: iload         8
         * 179: iload_3
         * 180: invokevirtual #194                // Method shiftTailOverGap:([Ljava/lang/Object;II)V
         * 183: iconst_1
         * 184: ireturn
         * 185: aload_0
         * 186: getfield      #63                 // Field modCount:I
         * 189: iload         4
         * 191: if_icmpeq     202
         * 194: new           #161                // class java/util/ConcurrentModificationException
         * 197: dup
         * 198: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 201: athrow
         * 202: iconst_0
         * 203: ireturn
         *  */
        // </editor-fold>
    }

    public void replaceAll(UnaryOperator<E> operator) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: aload_0
         * 4: getfield      #48                 // Field size:I
         * 7: invokevirtual #316                // Method replaceAllRange:(Ljava/util/function/UnaryOperator;II)V
         * 10: aload_0
         * 11: dup
         * 12: getfield      #63                 // Field modCount:I
         * 15: iconst_1
         * 16: iadd
         * 17: putfield      #63                 // Field modCount:I
         * 20: return
         *  */
        // </editor-fold>
    }

    private void replaceAllRange(UnaryOperator<E> operator, int i, int end) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokestatic  #213                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         * 4: pop
         * 5: aload_0
         * 6: getfield      #63                 // Field modCount:I
         * 9: istore        4
         * 11: aload_0
         * 12: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 15: astore        5
         * 17: aload_0
         * 18: getfield      #63                 // Field modCount:I
         * 21: iload         4
         * 23: if_icmpne     53
         * 26: iload_2
         * 27: iload_3
         * 28: if_icmpge     53
         * 31: aload         5
         * 33: iload_2
         * 34: aload_1
         * 35: aload         5
         * 37: iload_2
         * 38: invokestatic  #281                // Method elementAt:([Ljava/lang/Object;I)Ljava/lang/Object;
         * 41: invokeinterface #320,  2          // InterfaceMethod java/util/function/UnaryOperator.apply:(Ljava/lang/Object;)Ljava/lang/Object;
         * 46: aastore
         * 47: iinc          2, 1
         * 50: goto          17
         * 53: aload_0
         * 54: getfield      #63                 // Field modCount:I
         * 57: iload         4
         * 59: if_icmpeq     70
         * 62: new           #161                // class java/util/ConcurrentModificationException
         * 65: dup
         * 66: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 69: athrow
         * 70: return
         *  */
        // </editor-fold>
    }

    public void sort(Comparator<? super E> c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #63                 // Field modCount:I
         * 4: istore_2
         * 5: aload_0
         * 6: getfield      #9                  // Field elementData:[Ljava/lang/Object;
         * 9: iconst_0
         * 10: aload_0
         * 11: getfield      #48                 // Field size:I
         * 14: aload_1
         * 15: invokestatic  #325                // Method java/util/Arrays.sort:([Ljava/lang/Object;IILjava/util/Comparator;)V
         * 18: aload_0
         * 19: getfield      #63                 // Field modCount:I
         * 22: iload_2
         * 23: if_icmpeq     34
         * 26: new           #161                // class java/util/ConcurrentModificationException
         * 29: dup
         * 30: invokespecial #163                // Method java/util/ConcurrentModificationException."<init>":()V
         * 33: athrow
         * 34: aload_0
         * 35: dup
         * 36: getfield      #63                 // Field modCount:I
         * 39: iconst_1
         * 40: iadd
         * 41: putfield      #63                 // Field modCount:I
         * 44: return
         *  */
        // </editor-fold>
    }

    void checkInvariants() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }
}
