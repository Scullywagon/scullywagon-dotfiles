package java.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import jdk.internal.misc.Unsafe;

public class HashMap<K extends Object, V extends Object> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {

    static class Node<K extends Object, V extends Object> implements Entry<K, V> {

        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: iload_1
             * 6: putfield      #7                  // Field hash:I
             * 9: aload_0
             * 10: aload_2
             * 11: putfield      #13                 // Field key:Ljava/lang/Object;
             * 14: aload_0
             * 15: aload_3
             * 16: putfield      #17                 // Field value:Ljava/lang/Object;
             * 19: aload_0
             * 20: aload         4
             * 22: putfield      #20                 // Field next:Ljava/util/HashMap$Node;
             * 25: return
             *  */
            // </editor-fold>
        }

        public final K getKey() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #13                 // Field key:Ljava/lang/Object;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        public final V getValue() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #17                 // Field value:Ljava/lang/Object;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        public final String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #24                 // class java/lang/StringBuilder
             * 3: dup
             * 4: invokespecial #26                 // Method java/lang/StringBuilder."<init>":()V
             * 7: aload_0
             * 8: getfield      #13                 // Field key:Ljava/lang/Object;
             * 11: invokevirtual #27                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 14: ldc           #31                 // String =
             * 16: invokevirtual #33                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 19: aload_0
             * 20: getfield      #17                 // Field value:Ljava/lang/Object;
             * 23: invokevirtual #27                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 26: invokevirtual #36                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 29: areturn
             *  */
            // </editor-fold>
        }

        public final int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #13                 // Field key:Ljava/lang/Object;
             * 4: invokestatic  #40                 // Method java/util/Objects.hashCode:(Ljava/lang/Object;)I
             * 7: aload_0
             * 8: getfield      #17                 // Field value:Ljava/lang/Object;
             * 11: invokestatic  #40                 // Method java/util/Objects.hashCode:(Ljava/lang/Object;)I
             * 14: ixor
             * 15: ireturn
             *  */
            // </editor-fold>
        }

        public final V setValue(V newValue) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #17                 // Field value:Ljava/lang/Object;
             * 4: astore_2
             * 5: aload_0
             * 6: aload_1
             * 7: putfield      #17                 // Field value:Ljava/lang/Object;
             * 10: aload_2
             * 11: areturn
             *  */
            // </editor-fold>
        }

        public final boolean equals(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: aload_0
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    #46                 // class java/util/Map$Entry
             * 11: ifeq          55
             * 14: aload_1
             * 15: checkcast     #46                 // class java/util/Map$Entry
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      #13                 // Field key:Ljava/lang/Object;
             * 23: aload_2
             * 24: invokeinterface #48,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
             * 29: invokestatic  #52                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
             * 32: ifeq          55
             * 35: aload_0
             * 36: getfield      #17                 // Field value:Ljava/lang/Object;
             * 39: aload_2
             * 40: invokeinterface #56,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
             * 45: invokestatic  #52                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
             * 48: ifeq          55
             * 51: iconst_1
             * 52: goto          56
             * 55: iconst_0
             * 56: ireturn
             *  */
            // </editor-fold>
        }
    }

    static final class TreeNode<K extends Object, V extends Object> extends LinkedHashMap.Entry<K, V> {

        TreeNode<K, V> parent;
        TreeNode<K, V> left;
        TreeNode<K, V> right;
        TreeNode<K, V> prev;
        boolean red;

        TreeNode(int hash, K key, V val, Node<K, V> next) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: iload_1
             * 2: aload_2
             * 3: aload_3
             * 4: aload         4
             * 6: invokespecial #3                  // Method java/util/LinkedHashMap$Entry."<init>":(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)V
             * 9: return
             *  */
            // </editor-fold>
        }

        final TreeNode<K, V> root() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: astore_1
             * 2: aload_1
             * 3: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 6: dup
             * 7: astore_2
             * 8: ifnonnull     13
             * 11: aload_1
             * 12: areturn
             * 13: aload_2
             * 14: astore_1
             * 15: goto          2
             *  */
            // </editor-fold>
        }

        static <K extends Object, V extends Object> void moveRootToFront(Node<K, V>[] tab, TreeNode<K, V> root) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnull        123
             * 4: aload_0
             * 5: ifnull        123
             * 8: aload_0
             * 9: arraylength
             * 10: dup
             * 11: istore_2
             * 12: ifle          123
             * 15: iload_2
             * 16: iconst_1
             * 17: isub
             * 18: aload_1
             * 19: getfield      #15                 // Field hash:I
             * 22: iand
             * 23: istore_3
             * 24: aload_0
             * 25: iload_3
             * 26: aaload
             * 27: checkcast     #10                 // class java/util/HashMap$TreeNode
             * 30: astore        4
             * 32: aload_1
             * 33: aload         4
             * 35: if_acmpeq     102
             * 38: aload_0
             * 39: iload_3
             * 40: aload_1
             * 41: aastore
             * 42: aload_1
             * 43: getfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 46: astore        6
             * 48: aload_1
             * 49: getfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 52: dup
             * 53: astore        5
             * 55: ifnull        68
             * 58: aload         5
             * 60: checkcast     #10                 // class java/util/HashMap$TreeNode
             * 63: aload         6
             * 65: putfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 68: aload         6
             * 70: ifnull        80
             * 73: aload         6
             * 75: aload         5
             * 77: putfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 80: aload         4
             * 82: ifnull        91
             * 85: aload         4
             * 87: aload_1
             * 88: putfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 91: aload_1
             * 92: aload         4
             * 94: putfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 97: aload_1
             * 98: aconst_null
             * 99: putfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 102: getstatic     #26                 // Field $assertionsDisabled:Z
             * 105: ifne          123
             * 108: aload_1
             * 109: invokestatic  #30                 // Method checkInvariants:(Ljava/util/HashMap$TreeNode;)Z
             * 112: ifne          123
             * 115: new           #34                 // class java/lang/AssertionError
             * 118: dup
             * 119: invokespecial #36                 // Method java/lang/AssertionError."<init>":()V
             * 122: athrow
             * 123: return
             *  */
            // </editor-fold>
        }

        final TreeNode<K, V> find(int h, Object k, Class<?> kc) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: astore        4
             * 3: aload         4
             * 5: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 8: astore        8
             * 10: aload         4
             * 12: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 15: astore        9
             * 17: aload         4
             * 19: getfield      #15                 // Field hash:I
             * 22: dup
             * 23: istore        5
             * 25: iload_1
             * 26: if_icmple     36
             * 29: aload         8
             * 31: astore        4
             * 33: goto          165
             * 36: iload         5
             * 38: iload_1
             * 39: if_icmpge     49
             * 42: aload         9
             * 44: astore        4
             * 46: goto          165
             * 49: aload         4
             * 51: getfield      #45                 // Field key:Ljava/lang/Object;
             * 54: dup
             * 55: astore        7
             * 57: aload_2
             * 58: if_acmpeq     74
             * 61: aload_2
             * 62: ifnull        77
             * 65: aload_2
             * 66: aload         7
             * 68: invokevirtual #49                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
             * 71: ifeq          77
             * 74: aload         4
             * 76: areturn
             * 77: aload         8
             * 79: ifnonnull     89
             * 82: aload         9
             * 84: astore        4
             * 86: goto          165
             * 89: aload         9
             * 91: ifnonnull     101
             * 94: aload         8
             * 96: astore        4
             * 98: goto          165
             * 101: aload_3
             * 102: ifnonnull     114
             * 105: aload_2
             * 106: invokestatic  #55                 // Method java/util/HashMap.comparableClassFor:(Ljava/lang/Object;)Ljava/lang/Class;
             * 109: dup
             * 110: astore_3
             * 111: ifnull        144
             * 114: aload_3
             * 115: aload_2
             * 116: aload         7
             * 118: invokestatic  #59                 // Method java/util/HashMap.compareComparables:(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)I
             * 121: dup
             * 122: istore        6
             * 124: ifeq          144
             * 127: iload         6
             * 129: ifge          137
             * 132: aload         8
             * 134: goto          139
             * 137: aload         9
             * 139: astore        4
             * 141: goto          165
             * 144: aload         9
             * 146: iload_1
             * 147: aload_2
             * 148: aload_3
             * 149: invokevirtual #63                 // Method find:(ILjava/lang/Object;Ljava/lang/Class;)Ljava/util/HashMap$TreeNode;
             * 152: dup
             * 153: astore        10
             * 155: ifnull        161
             * 158: aload         10
             * 160: areturn
             * 161: aload         8
             * 163: astore        4
             * 165: aload         4
             * 167: ifnonnull     3
             * 170: aconst_null
             * 171: areturn
             *  */
            // </editor-fold>
        }

        final TreeNode<K, V> getTreeNode(int h, Object k) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 4: ifnull        14
             * 7: aload_0
             * 8: invokevirtual #67                 // Method root:()Ljava/util/HashMap$TreeNode;
             * 11: goto          15
             * 14: aload_0
             * 15: iload_1
             * 16: aload_2
             * 17: aconst_null
             * 18: invokevirtual #63                 // Method find:(ILjava/lang/Object;Ljava/lang/Class;)Ljava/util/HashMap$TreeNode;
             * 21: areturn
             *  */
            // </editor-fold>
        }

        static int tieBreakOrder(Object a, Object b) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: ifnull        30
             * 4: aload_1
             * 5: ifnull        30
             * 8: aload_0
             * 9: invokevirtual #71                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
             * 12: invokevirtual #75                 // Method java/lang/Class.getName:()Ljava/lang/String;
             * 15: aload_1
             * 16: invokevirtual #71                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
             * 19: invokevirtual #75                 // Method java/lang/Class.getName:()Ljava/lang/String;
             * 22: invokevirtual #81                 // Method java/lang/String.compareTo:(Ljava/lang/String;)I
             * 25: dup
             * 26: istore_2
             * 27: ifne          47
             * 30: aload_0
             * 31: invokestatic  #87                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
             * 34: aload_1
             * 35: invokestatic  #87                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
             * 38: if_icmpgt     45
             * 41: iconst_m1
             * 42: goto          46
             * 45: iconst_1
             * 46: istore_2
             * 47: iload_2
             * 48: ireturn
             *  */
            // </editor-fold>
        }

        final void treeify(Node<K, V>[] tab) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aconst_null
             * 1: astore_2
             * 2: aload_0
             * 3: astore_3
             * 4: aload_3
             * 5: ifnull        215
             * 8: aload_3
             * 9: getfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 12: checkcast     #10                 // class java/util/HashMap$TreeNode
             * 15: astore        4
             * 17: aload_3
             * 18: aload_3
             * 19: aconst_null
             * 20: dup_x1
             * 21: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 24: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 27: aload_2
             * 28: ifnonnull     46
             * 31: aload_3
             * 32: aconst_null
             * 33: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 36: aload_3
             * 37: iconst_0
             * 38: putfield      #93                 // Field red:Z
             * 41: aload_3
             * 42: astore_2
             * 43: goto          209
             * 46: aload_3
             * 47: getfield      #45                 // Field key:Ljava/lang/Object;
             * 50: astore        5
             * 52: aload_3
             * 53: getfield      #15                 // Field hash:I
             * 56: istore        6
             * 58: aconst_null
             * 59: astore        7
             * 61: aload_2
             * 62: astore        8
             * 64: aload         8
             * 66: getfield      #45                 // Field key:Ljava/lang/Object;
             * 69: astore        11
             * 71: aload         8
             * 73: getfield      #15                 // Field hash:I
             * 76: dup
             * 77: istore        10
             * 79: iload         6
             * 81: if_icmple     90
             * 84: iconst_m1
             * 85: istore        9
             * 87: goto          143
             * 90: iload         10
             * 92: iload         6
             * 94: if_icmpge     103
             * 97: iconst_1
             * 98: istore        9
             * 100: goto          143
             * 103: aload         7
             * 105: ifnonnull     119
             * 108: aload         5
             * 110: invokestatic  #55                 // Method java/util/HashMap.comparableClassFor:(Ljava/lang/Object;)Ljava/lang/Class;
             * 113: dup
             * 114: astore        7
             * 116: ifnull        134
             * 119: aload         7
             * 121: aload         5
             * 123: aload         11
             * 125: invokestatic  #59                 // Method java/util/HashMap.compareComparables:(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)I
             * 128: dup
             * 129: istore        9
             * 131: ifne          143
             * 134: aload         5
             * 136: aload         11
             * 138: invokestatic  #96                 // Method tieBreakOrder:(Ljava/lang/Object;Ljava/lang/Object;)I
             * 141: istore        9
             * 143: aload         8
             * 145: astore        12
             * 147: iload         9
             * 149: ifgt          160
             * 152: aload         8
             * 154: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 157: goto          165
             * 160: aload         8
             * 162: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 165: dup
             * 166: astore        8
             * 168: ifnonnull     206
             * 171: aload_3
             * 172: aload         12
             * 174: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 177: iload         9
             * 179: ifgt          191
             * 182: aload         12
             * 184: aload_3
             * 185: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 188: goto          197
             * 191: aload         12
             * 193: aload_3
             * 194: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 197: aload_2
             * 198: aload_3
             * 199: invokestatic  #100                // Method balanceInsertion:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 202: astore_2
             * 203: goto          209
             * 206: goto          64
             * 209: aload         4
             * 211: astore_3
             * 212: goto          4
             * 215: aload_1
             * 216: aload_2
             * 217: invokestatic  #104                // Method moveRootToFront:([Ljava/util/HashMap$Node;Ljava/util/HashMap$TreeNode;)V
             * 220: return
             *  */
            // </editor-fold>
        }

        final Node<K, V> untreeify(HashMap<K, V> map) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aconst_null
             * 1: astore_2
             * 2: aconst_null
             * 3: astore_3
             * 4: aload_0
             * 5: astore        4
             * 7: aload         4
             * 9: ifnull        50
             * 12: aload_1
             * 13: aload         4
             * 15: aconst_null
             * 16: invokevirtual #108                // Method java/util/HashMap.replacementNode:(Ljava/util/HashMap$Node;Ljava/util/HashMap$Node;)Ljava/util/HashMap$Node;
             * 19: astore        5
             * 21: aload_3
             * 22: ifnonnull     31
             * 25: aload         5
             * 27: astore_2
             * 28: goto          37
             * 31: aload_3
             * 32: aload         5
             * 34: putfield      #112                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 37: aload         5
             * 39: astore_3
             * 40: aload         4
             * 42: getfield      #112                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 45: astore        4
             * 47: goto          7
             * 50: aload_2
             * 51: areturn
             *  */
            // </editor-fold>
        }

        final TreeNode<K, V> putTreeVal(HashMap<K, V> map, Node<K, V>[] tab, int h, K k, V v) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aconst_null
             * 1: astore        6
             * 3: iconst_0
             * 4: istore        7
             * 6: aload_0
             * 7: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 10: ifnull        20
             * 13: aload_0
             * 14: invokevirtual #67                 // Method root:()Ljava/util/HashMap$TreeNode;
             * 17: goto          21
             * 20: aload_0
             * 21: astore        8
             * 23: aload         8
             * 25: astore        9
             * 27: aload         9
             * 29: getfield      #15                 // Field hash:I
             * 32: dup
             * 33: istore        11
             * 35: iload_3
             * 36: if_icmple     45
             * 39: iconst_m1
             * 40: istore        10
             * 42: goto          193
             * 45: iload         11
             * 47: iload_3
             * 48: if_icmpge     57
             * 51: iconst_1
             * 52: istore        10
             * 54: goto          193
             * 57: aload         9
             * 59: getfield      #45                 // Field key:Ljava/lang/Object;
             * 62: dup
             * 63: astore        12
             * 65: aload         4
             * 67: if_acmpeq     85
             * 70: aload         4
             * 72: ifnull        88
             * 75: aload         4
             * 77: aload         12
             * 79: invokevirtual #49                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
             * 82: ifeq          88
             * 85: aload         9
             * 87: areturn
             * 88: aload         6
             * 90: ifnonnull     104
             * 93: aload         4
             * 95: invokestatic  #55                 // Method java/util/HashMap.comparableClassFor:(Ljava/lang/Object;)Ljava/lang/Class;
             * 98: dup
             * 99: astore        6
             * 101: ifnull        119
             * 104: aload         6
             * 106: aload         4
             * 108: aload         12
             * 110: invokestatic  #59                 // Method java/util/HashMap.compareComparables:(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)I
             * 113: dup
             * 114: istore        10
             * 116: ifne          193
             * 119: iload         7
             * 121: ifne          184
             * 124: iconst_1
             * 125: istore        7
             * 127: aload         9
             * 129: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 132: dup
             * 133: astore        14
             * 135: ifnull        154
             * 138: aload         14
             * 140: iload_3
             * 141: aload         4
             * 143: aload         6
             * 145: invokevirtual #63                 // Method find:(ILjava/lang/Object;Ljava/lang/Class;)Ljava/util/HashMap$TreeNode;
             * 148: dup
             * 149: astore        13
             * 151: ifnonnull     181
             * 154: aload         9
             * 156: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 159: dup
             * 160: astore        14
             * 162: ifnull        184
             * 165: aload         14
             * 167: iload_3
             * 168: aload         4
             * 170: aload         6
             * 172: invokevirtual #63                 // Method find:(ILjava/lang/Object;Ljava/lang/Class;)Ljava/util/HashMap$TreeNode;
             * 175: dup
             * 176: astore        13
             * 178: ifnull        184
             * 181: aload         13
             * 183: areturn
             * 184: aload         4
             * 186: aload         12
             * 188: invokestatic  #96                 // Method tieBreakOrder:(Ljava/lang/Object;Ljava/lang/Object;)I
             * 191: istore        10
             * 193: aload         9
             * 195: astore        13
             * 197: iload         10
             * 199: ifgt          210
             * 202: aload         9
             * 204: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 207: goto          215
             * 210: aload         9
             * 212: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 215: dup
             * 216: astore        9
             * 218: ifnonnull     311
             * 221: aload         13
             * 223: getfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 226: astore        14
             * 228: aload_1
             * 229: iload_3
             * 230: aload         4
             * 232: aload         5
             * 234: aload         14
             * 236: invokevirtual #115                // Method java/util/HashMap.newTreeNode:(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)Ljava/util/HashMap$TreeNode;
             * 239: astore        15
             * 241: iload         10
             * 243: ifgt          256
             * 246: aload         13
             * 248: aload         15
             * 250: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 253: goto          263
             * 256: aload         13
             * 258: aload         15
             * 260: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 263: aload         13
             * 265: aload         15
             * 267: putfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 270: aload         15
             * 272: aload         15
             * 274: aload         13
             * 276: dup_x1
             * 277: putfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 280: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 283: aload         14
             * 285: ifnull        298
             * 288: aload         14
             * 290: checkcast     #10                 // class java/util/HashMap$TreeNode
             * 293: aload         15
             * 295: putfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 298: aload_2
             * 299: aload         8
             * 301: aload         15
             * 303: invokestatic  #100                // Method balanceInsertion:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 306: invokestatic  #104                // Method moveRootToFront:([Ljava/util/HashMap$Node;Ljava/util/HashMap$TreeNode;)V
             * 309: aconst_null
             * 310: areturn
             * 311: goto          27
             *  */
            // </editor-fold>
        }

        final void removeTreeNode(HashMap<K, V> map, Node<K, V>[] tab, boolean movable) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_2
             * 1: ifnull        12
             * 4: aload_2
             * 5: arraylength
             * 6: dup
             * 7: istore        4
             * 9: ifne          13
             * 12: return
             * 13: iload         4
             * 15: iconst_1
             * 16: isub
             * 17: aload_0
             * 18: getfield      #15                 // Field hash:I
             * 21: iand
             * 22: istore        5
             * 24: aload_2
             * 25: iload         5
             * 27: aaload
             * 28: checkcast     #10                 // class java/util/HashMap$TreeNode
             * 31: astore        6
             * 33: aload         6
             * 35: astore        7
             * 37: aload_0
             * 38: getfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 41: checkcast     #10                 // class java/util/HashMap$TreeNode
             * 44: astore        9
             * 46: aload_0
             * 47: getfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 50: astore        10
             * 52: aload         10
             * 54: ifnonnull     69
             * 57: aload_2
             * 58: iload         5
             * 60: aload         9
             * 62: dup
             * 63: astore        6
             * 65: aastore
             * 66: goto          76
             * 69: aload         10
             * 71: aload         9
             * 73: putfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 76: aload         9
             * 78: ifnull        88
             * 81: aload         9
             * 83: aload         10
             * 85: putfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 88: aload         6
             * 90: ifnonnull     94
             * 93: return
             * 94: aload         7
             * 96: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 99: ifnull        109
             * 102: aload         7
             * 104: invokevirtual #67                 // Method root:()Ljava/util/HashMap$TreeNode;
             * 107: astore        7
             * 109: aload         7
             * 111: ifnull        145
             * 114: iload_3
             * 115: ifeq          156
             * 118: aload         7
             * 120: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 123: ifnull        145
             * 126: aload         7
             * 128: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 131: dup
             * 132: astore        8
             * 134: ifnull        145
             * 137: aload         8
             * 139: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 142: ifnonnull     156
             * 145: aload_2
             * 146: iload         5
             * 148: aload         6
             * 150: aload_1
             * 151: invokevirtual #119                // Method untreeify:(Ljava/util/HashMap;)Ljava/util/HashMap$Node;
             * 154: aastore
             * 155: return
             * 156: aload_0
             * 157: astore        11
             * 159: aload_0
             * 160: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 163: astore        12
             * 165: aload_0
             * 166: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 169: astore        13
             * 171: aload         12
             * 173: ifnull        434
             * 176: aload         13
             * 178: ifnull        434
             * 181: aload         13
             * 183: astore        15
             * 185: aload         15
             * 187: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 190: dup
             * 191: astore        16
             * 193: ifnull        203
             * 196: aload         16
             * 198: astore        15
             * 200: goto          185
             * 203: aload         15
             * 205: getfield      #93                 // Field red:Z
             * 208: istore        17
             * 210: aload         15
             * 212: aload         11
             * 214: getfield      #93                 // Field red:Z
             * 217: putfield      #93                 // Field red:Z
             * 220: aload         11
             * 222: iload         17
             * 224: putfield      #93                 // Field red:Z
             * 227: aload         15
             * 229: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 232: astore        18
             * 234: aload         11
             * 236: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 239: astore        19
             * 241: aload         15
             * 243: aload         13
             * 245: if_acmpne     265
             * 248: aload         11
             * 250: aload         15
             * 252: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 255: aload         15
             * 257: aload         11
             * 259: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 262: goto          328
             * 265: aload         15
             * 267: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 270: astore        20
             * 272: aload         11
             * 274: aload         20
             * 276: dup_x1
             * 277: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 280: ifnull        310
             * 283: aload         15
             * 285: aload         20
             * 287: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 290: if_acmpne     303
             * 293: aload         20
             * 295: aload         11
             * 297: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 300: goto          310
             * 303: aload         20
             * 305: aload         11
             * 307: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 310: aload         15
             * 312: aload         13
             * 314: dup_x1
             * 315: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 318: ifnull        328
             * 321: aload         13
             * 323: aload         15
             * 325: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 328: aload         11
             * 330: aconst_null
             * 331: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 334: aload         11
             * 336: aload         18
             * 338: dup_x1
             * 339: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 342: ifnull        352
             * 345: aload         18
             * 347: aload         11
             * 349: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 352: aload         15
             * 354: aload         12
             * 356: dup_x1
             * 357: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 360: ifnull        370
             * 363: aload         12
             * 365: aload         15
             * 367: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 370: aload         15
             * 372: aload         19
             * 374: dup_x1
             * 375: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 378: ifnonnull     388
             * 381: aload         15
             * 383: astore        7
             * 385: goto          415
             * 388: aload         11
             * 390: aload         19
             * 392: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 395: if_acmpne     408
             * 398: aload         19
             * 400: aload         15
             * 402: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 405: goto          415
             * 408: aload         19
             * 410: aload         15
             * 412: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 415: aload         18
             * 417: ifnull        427
             * 420: aload         18
             * 422: astore        14
             * 424: goto          431
             * 427: aload         11
             * 429: astore        14
             * 431: goto          462
             * 434: aload         12
             * 436: ifnull        446
             * 439: aload         12
             * 441: astore        14
             * 443: goto          462
             * 446: aload         13
             * 448: ifnull        458
             * 451: aload         13
             * 453: astore        14
             * 455: goto          462
             * 458: aload         11
             * 460: astore        14
             * 462: aload         14
             * 464: aload         11
             * 466: if_acmpeq     544
             * 469: aload         14
             * 471: aload         11
             * 473: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 476: dup_x1
             * 477: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 480: astore        15
             * 482: aload         15
             * 484: ifnonnull     499
             * 487: aload         14
             * 489: dup
             * 490: astore        7
             * 492: iconst_0
             * 493: putfield      #93                 // Field red:Z
             * 496: goto          526
             * 499: aload         11
             * 501: aload         15
             * 503: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 506: if_acmpne     519
             * 509: aload         15
             * 511: aload         14
             * 513: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 516: goto          526
             * 519: aload         15
             * 521: aload         14
             * 523: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 526: aload         11
             * 528: aload         11
             * 530: aload         11
             * 532: aconst_null
             * 533: dup_x1
             * 534: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 537: dup_x1
             * 538: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 541: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 544: aload         11
             * 546: getfield      #93                 // Field red:Z
             * 549: ifeq          557
             * 552: aload         7
             * 554: goto          564
             * 557: aload         7
             * 559: aload         14
             * 561: invokestatic  #123                // Method balanceDeletion:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 564: astore        15
             * 566: aload         14
             * 568: aload         11
             * 570: if_acmpne     626
             * 573: aload         11
             * 575: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 578: astore        16
             * 580: aload         11
             * 582: aconst_null
             * 583: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 586: aload         16
             * 588: ifnull        626
             * 591: aload         11
             * 593: aload         16
             * 595: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 598: if_acmpne     610
             * 601: aload         16
             * 603: aconst_null
             * 604: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 607: goto          626
             * 610: aload         11
             * 612: aload         16
             * 614: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 617: if_acmpne     626
             * 620: aload         16
             * 622: aconst_null
             * 623: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 626: iload_3
             * 627: ifeq          636
             * 630: aload_2
             * 631: aload         15
             * 633: invokestatic  #104                // Method moveRootToFront:([Ljava/util/HashMap$Node;Ljava/util/HashMap$TreeNode;)V
             * 636: return
             *  */
            // </editor-fold>
        }

        final void split(HashMap<K, V> map, Node<K, V>[] tab, int index, int bit) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: astore        5
             * 3: aconst_null
             * 4: astore        6
             * 6: aconst_null
             * 7: astore        7
             * 9: aconst_null
             * 10: astore        8
             * 12: aconst_null
             * 13: astore        9
             * 15: iconst_0
             * 16: istore        10
             * 18: iconst_0
             * 19: istore        11
             * 21: aload         5
             * 23: astore        12
             * 25: aload         12
             * 27: ifnull        131
             * 30: aload         12
             * 32: getfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 35: checkcast     #10                 // class java/util/HashMap$TreeNode
             * 38: astore        13
             * 40: aload         12
             * 42: aconst_null
             * 43: putfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 46: aload         12
             * 48: getfield      #15                 // Field hash:I
             * 51: iload         4
             * 53: iand
             * 54: ifne          92
             * 57: aload         12
             * 59: aload         7
             * 61: dup_x1
             * 62: putfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 65: ifnonnull     75
             * 68: aload         12
             * 70: astore        6
             * 72: goto          82
             * 75: aload         7
             * 77: aload         12
             * 79: putfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 82: aload         12
             * 84: astore        7
             * 86: iinc          10, 1
             * 89: goto          124
             * 92: aload         12
             * 94: aload         9
             * 96: dup_x1
             * 97: putfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 100: ifnonnull     110
             * 103: aload         12
             * 105: astore        8
             * 107: goto          117
             * 110: aload         9
             * 112: aload         12
             * 114: putfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 117: aload         12
             * 119: astore        9
             * 121: iinc          11, 1
             * 124: aload         13
             * 126: astore        12
             * 128: goto          25
             * 131: aload         6
             * 133: ifnull        171
             * 136: iload         10
             * 138: bipush        6
             * 140: if_icmpgt     155
             * 143: aload_2
             * 144: iload_3
             * 145: aload         6
             * 147: aload_1
             * 148: invokevirtual #119                // Method untreeify:(Ljava/util/HashMap;)Ljava/util/HashMap$Node;
             * 151: aastore
             * 152: goto          171
             * 155: aload_2
             * 156: iload_3
             * 157: aload         6
             * 159: aastore
             * 160: aload         8
             * 162: ifnull        171
             * 165: aload         6
             * 167: aload_2
             * 168: invokevirtual #126                // Method treeify:([Ljava/util/HashMap$Node;)V
             * 171: aload         8
             * 173: ifnull        217
             * 176: iload         11
             * 178: bipush        6
             * 180: if_icmpgt     198
             * 183: aload_2
             * 184: iload_3
             * 185: iload         4
             * 187: iadd
             * 188: aload         8
             * 190: aload_1
             * 191: invokevirtual #119                // Method untreeify:(Ljava/util/HashMap;)Ljava/util/HashMap$Node;
             * 194: aastore
             * 195: goto          217
             * 198: aload_2
             * 199: iload_3
             * 200: iload         4
             * 202: iadd
             * 203: aload         8
             * 205: aastore
             * 206: aload         6
             * 208: ifnull        217
             * 211: aload         8
             * 213: aload_2
             * 214: invokevirtual #126                // Method treeify:([Ljava/util/HashMap$Node;)V
             * 217: return
             *  */
            // </editor-fold>
        }

        static <K extends Object, V extends Object> TreeNode<K, V> rotateLeft(TreeNode<K, V> root, TreeNode<K, V> p) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnull        89
             * 4: aload_1
             * 5: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 8: dup
             * 9: astore_2
             * 10: ifnull        89
             * 13: aload_1
             * 14: aload_2
             * 15: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 18: dup_x1
             * 19: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 22: dup
             * 23: astore        4
             * 25: ifnull        34
             * 28: aload         4
             * 30: aload_1
             * 31: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 34: aload_2
             * 35: aload_1
             * 36: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 39: dup_x1
             * 40: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 43: dup
             * 44: astore_3
             * 45: ifnonnull     58
             * 48: aload_2
             * 49: dup
             * 50: astore_0
             * 51: iconst_0
             * 52: putfield      #93                 // Field red:Z
             * 55: goto          79
             * 58: aload_3
             * 59: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 62: aload_1
             * 63: if_acmpne     74
             * 66: aload_3
             * 67: aload_2
             * 68: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 71: goto          79
             * 74: aload_3
             * 75: aload_2
             * 76: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 79: aload_2
             * 80: aload_1
             * 81: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 84: aload_1
             * 85: aload_2
             * 86: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 89: aload_0
             * 90: areturn
             *  */
            // </editor-fold>
        }

        static <K extends Object, V extends Object> TreeNode<K, V> rotateRight(TreeNode<K, V> root, TreeNode<K, V> p) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnull        89
             * 4: aload_1
             * 5: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 8: dup
             * 9: astore_2
             * 10: ifnull        89
             * 13: aload_1
             * 14: aload_2
             * 15: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 18: dup_x1
             * 19: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 22: dup
             * 23: astore        4
             * 25: ifnull        34
             * 28: aload         4
             * 30: aload_1
             * 31: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 34: aload_2
             * 35: aload_1
             * 36: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 39: dup_x1
             * 40: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 43: dup
             * 44: astore_3
             * 45: ifnonnull     58
             * 48: aload_2
             * 49: dup
             * 50: astore_0
             * 51: iconst_0
             * 52: putfield      #93                 // Field red:Z
             * 55: goto          79
             * 58: aload_3
             * 59: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 62: aload_1
             * 63: if_acmpne     74
             * 66: aload_3
             * 67: aload_2
             * 68: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 71: goto          79
             * 74: aload_3
             * 75: aload_2
             * 76: putfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 79: aload_2
             * 80: aload_1
             * 81: putfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 84: aload_1
             * 85: aload_2
             * 86: putfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 89: aload_0
             * 90: areturn
             *  */
            // </editor-fold>
        }

        static <K extends Object, V extends Object> TreeNode<K, V> balanceInsertion(TreeNode<K, V> root, TreeNode<K, V> x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: iconst_1
             * 2: putfield      #93                 // Field red:Z
             * 5: aload_1
             * 6: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 9: dup
             * 10: astore_2
             * 11: ifnonnull     21
             * 14: aload_1
             * 15: iconst_0
             * 16: putfield      #93                 // Field red:Z
             * 19: aload_1
             * 20: areturn
             * 21: aload_2
             * 22: getfield      #93                 // Field red:Z
             * 25: ifeq          37
             * 28: aload_2
             * 29: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 32: dup
             * 33: astore_3
             * 34: ifnonnull     39
             * 37: aload_0
             * 38: areturn
             * 39: aload_2
             * 40: aload_3
             * 41: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 44: dup
             * 45: astore        4
             * 47: if_acmpne     150
             * 50: aload_3
             * 51: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 54: dup
             * 55: astore        5
             * 57: ifnull        89
             * 60: aload         5
             * 62: getfield      #93                 // Field red:Z
             * 65: ifeq          89
             * 68: aload         5
             * 70: iconst_0
             * 71: putfield      #93                 // Field red:Z
             * 74: aload_2
             * 75: iconst_0
             * 76: putfield      #93                 // Field red:Z
             * 79: aload_3
             * 80: iconst_1
             * 81: putfield      #93                 // Field red:Z
             * 84: aload_3
             * 85: astore_1
             * 86: goto          5
             * 89: aload_1
             * 90: aload_2
             * 91: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 94: if_acmpne     123
             * 97: aload_0
             * 98: aload_2
             * 99: dup
             * 100: astore_1
             * 101: invokestatic  #130                // Method rotateLeft:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 104: astore_0
             * 105: aload_1
             * 106: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 109: dup
             * 110: astore_2
             * 111: ifnonnull     118
             * 114: aconst_null
             * 115: goto          122
             * 118: aload_2
             * 119: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 122: astore_3
             * 123: aload_2
             * 124: ifnull        5
             * 127: aload_2
             * 128: iconst_0
             * 129: putfield      #93                 // Field red:Z
             * 132: aload_3
             * 133: ifnull        5
             * 136: aload_3
             * 137: iconst_1
             * 138: putfield      #93                 // Field red:Z
             * 141: aload_0
             * 142: aload_3
             * 143: invokestatic  #133                // Method rotateRight:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 146: astore_0
             * 147: goto          5
             * 150: aload         4
             * 152: ifnull        184
             * 155: aload         4
             * 157: getfield      #93                 // Field red:Z
             * 160: ifeq          184
             * 163: aload         4
             * 165: iconst_0
             * 166: putfield      #93                 // Field red:Z
             * 169: aload_2
             * 170: iconst_0
             * 171: putfield      #93                 // Field red:Z
             * 174: aload_3
             * 175: iconst_1
             * 176: putfield      #93                 // Field red:Z
             * 179: aload_3
             * 180: astore_1
             * 181: goto          5
             * 184: aload_1
             * 185: aload_2
             * 186: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 189: if_acmpne     218
             * 192: aload_0
             * 193: aload_2
             * 194: dup
             * 195: astore_1
             * 196: invokestatic  #133                // Method rotateRight:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 199: astore_0
             * 200: aload_1
             * 201: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 204: dup
             * 205: astore_2
             * 206: ifnonnull     213
             * 209: aconst_null
             * 210: goto          217
             * 213: aload_2
             * 214: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 217: astore_3
             * 218: aload_2
             * 219: ifnull        5
             * 222: aload_2
             * 223: iconst_0
             * 224: putfield      #93                 // Field red:Z
             * 227: aload_3
             * 228: ifnull        5
             * 231: aload_3
             * 232: iconst_1
             * 233: putfield      #93                 // Field red:Z
             * 236: aload_0
             * 237: aload_3
             * 238: invokestatic  #130                // Method rotateLeft:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 241: astore_0
             * 242: goto          5
             *  */
            // </editor-fold>
        }

        static <K extends Object, V extends Object> TreeNode<K, V> balanceDeletion(TreeNode<K, V> root, TreeNode<K, V> x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnull        9
             * 4: aload_1
             * 5: aload_0
             * 6: if_acmpne     11
             * 9: aload_0
             * 10: areturn
             * 11: aload_1
             * 12: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 15: dup
             * 16: astore_2
             * 17: ifnonnull     27
             * 20: aload_1
             * 21: iconst_0
             * 22: putfield      #93                 // Field red:Z
             * 25: aload_1
             * 26: areturn
             * 27: aload_1
             * 28: getfield      #93                 // Field red:Z
             * 31: ifeq          41
             * 34: aload_1
             * 35: iconst_0
             * 36: putfield      #93                 // Field red:Z
             * 39: aload_0
             * 40: areturn
             * 41: aload_2
             * 42: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 45: dup
             * 46: astore_3
             * 47: aload_1
             * 48: if_acmpne     281
             * 51: aload_2
             * 52: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 55: dup
             * 56: astore        4
             * 58: ifnull        105
             * 61: aload         4
             * 63: getfield      #93                 // Field red:Z
             * 66: ifeq          105
             * 69: aload         4
             * 71: iconst_0
             * 72: putfield      #93                 // Field red:Z
             * 75: aload_2
             * 76: iconst_1
             * 77: putfield      #93                 // Field red:Z
             * 80: aload_0
             * 81: aload_2
             * 82: invokestatic  #130                // Method rotateLeft:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 85: astore_0
             * 86: aload_1
             * 87: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 90: dup
             * 91: astore_2
             * 92: ifnonnull     99
             * 95: aconst_null
             * 96: goto          103
             * 99: aload_2
             * 100: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 103: astore        4
             * 105: aload         4
             * 107: ifnonnull     115
             * 110: aload_2
             * 111: astore_1
             * 112: goto          0
             * 115: aload         4
             * 117: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 120: astore        5
             * 122: aload         4
             * 124: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 127: astore        6
             * 129: aload         6
             * 131: ifnull        142
             * 134: aload         6
             * 136: getfield      #93                 // Field red:Z
             * 139: ifne          166
             * 142: aload         5
             * 144: ifnull        155
             * 147: aload         5
             * 149: getfield      #93                 // Field red:Z
             * 152: ifne          166
             * 155: aload         4
             * 157: iconst_1
             * 158: putfield      #93                 // Field red:Z
             * 161: aload_2
             * 162: astore_1
             * 163: goto          278
             * 166: aload         6
             * 168: ifnull        179
             * 171: aload         6
             * 173: getfield      #93                 // Field red:Z
             * 176: ifne          222
             * 179: aload         5
             * 181: ifnull        190
             * 184: aload         5
             * 186: iconst_0
             * 187: putfield      #93                 // Field red:Z
             * 190: aload         4
             * 192: iconst_1
             * 193: putfield      #93                 // Field red:Z
             * 196: aload_0
             * 197: aload         4
             * 199: invokestatic  #133                // Method rotateRight:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 202: astore_0
             * 203: aload_1
             * 204: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 207: dup
             * 208: astore_2
             * 209: ifnonnull     216
             * 212: aconst_null
             * 213: goto          220
             * 216: aload_2
             * 217: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 220: astore        4
             * 222: aload         4
             * 224: ifnull        261
             * 227: aload         4
             * 229: aload_2
             * 230: ifnonnull     237
             * 233: iconst_0
             * 234: goto          241
             * 237: aload_2
             * 238: getfield      #93                 // Field red:Z
             * 241: putfield      #93                 // Field red:Z
             * 244: aload         4
             * 246: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 249: dup
             * 250: astore        6
             * 252: ifnull        261
             * 255: aload         6
             * 257: iconst_0
             * 258: putfield      #93                 // Field red:Z
             * 261: aload_2
             * 262: ifnull        276
             * 265: aload_2
             * 266: iconst_0
             * 267: putfield      #93                 // Field red:Z
             * 270: aload_0
             * 271: aload_2
             * 272: invokestatic  #130                // Method rotateLeft:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 275: astore_0
             * 276: aload_0
             * 277: astore_1
             * 278: goto          0
             * 281: aload_3
             * 282: ifnull        326
             * 285: aload_3
             * 286: getfield      #93                 // Field red:Z
             * 289: ifeq          326
             * 292: aload_3
             * 293: iconst_0
             * 294: putfield      #93                 // Field red:Z
             * 297: aload_2
             * 298: iconst_1
             * 299: putfield      #93                 // Field red:Z
             * 302: aload_0
             * 303: aload_2
             * 304: invokestatic  #133                // Method rotateRight:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 307: astore_0
             * 308: aload_1
             * 309: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 312: dup
             * 313: astore_2
             * 314: ifnonnull     321
             * 317: aconst_null
             * 318: goto          325
             * 321: aload_2
             * 322: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 325: astore_3
             * 326: aload_3
             * 327: ifnonnull     335
             * 330: aload_2
             * 331: astore_1
             * 332: goto          0
             * 335: aload_3
             * 336: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 339: astore        5
             * 341: aload_3
             * 342: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 345: astore        6
             * 347: aload         5
             * 349: ifnull        360
             * 352: aload         5
             * 354: getfield      #93                 // Field red:Z
             * 357: ifne          383
             * 360: aload         6
             * 362: ifnull        373
             * 365: aload         6
             * 367: getfield      #93                 // Field red:Z
             * 370: ifne          383
             * 373: aload_3
             * 374: iconst_1
             * 375: putfield      #93                 // Field red:Z
             * 378: aload_2
             * 379: astore_1
             * 380: goto          489
             * 383: aload         5
             * 385: ifnull        396
             * 388: aload         5
             * 390: getfield      #93                 // Field red:Z
             * 393: ifne          436
             * 396: aload         6
             * 398: ifnull        407
             * 401: aload         6
             * 403: iconst_0
             * 404: putfield      #93                 // Field red:Z
             * 407: aload_3
             * 408: iconst_1
             * 409: putfield      #93                 // Field red:Z
             * 412: aload_0
             * 413: aload_3
             * 414: invokestatic  #130                // Method rotateLeft:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 417: astore_0
             * 418: aload_1
             * 419: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 422: dup
             * 423: astore_2
             * 424: ifnonnull     431
             * 427: aconst_null
             * 428: goto          435
             * 431: aload_2
             * 432: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 435: astore_3
             * 436: aload_3
             * 437: ifnull        472
             * 440: aload_3
             * 441: aload_2
             * 442: ifnonnull     449
             * 445: iconst_0
             * 446: goto          453
             * 449: aload_2
             * 450: getfield      #93                 // Field red:Z
             * 453: putfield      #93                 // Field red:Z
             * 456: aload_3
             * 457: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 460: dup
             * 461: astore        5
             * 463: ifnull        472
             * 466: aload         5
             * 468: iconst_0
             * 469: putfield      #93                 // Field red:Z
             * 472: aload_2
             * 473: ifnull        487
             * 476: aload_2
             * 477: iconst_0
             * 478: putfield      #93                 // Field red:Z
             * 481: aload_0
             * 482: aload_2
             * 483: invokestatic  #133                // Method rotateRight:(Ljava/util/HashMap$TreeNode;Ljava/util/HashMap$TreeNode;)Ljava/util/HashMap$TreeNode;
             * 486: astore_0
             * 487: aload_0
             * 488: astore_1
             * 489: goto          0
             *  */
            // </editor-fold>
        }

        static <K extends Object, V extends Object> boolean checkInvariants(TreeNode<K, V> t) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 4: astore_1
             * 5: aload_0
             * 6: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 9: astore_2
             * 10: aload_0
             * 11: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 14: astore_3
             * 15: aload_0
             * 16: getfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 19: astore        4
             * 21: aload_0
             * 22: getfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 25: checkcast     #10                 // class java/util/HashMap$TreeNode
             * 28: astore        5
             * 30: aload         4
             * 32: ifnull        46
             * 35: aload         4
             * 37: getfield      #22                 // Field next:Ljava/util/HashMap$Node;
             * 40: aload_0
             * 41: if_acmpeq     46
             * 44: iconst_0
             * 45: ireturn
             * 46: aload         5
             * 48: ifnull        62
             * 51: aload         5
             * 53: getfield      #19                 // Field prev:Ljava/util/HashMap$TreeNode;
             * 56: aload_0
             * 57: if_acmpeq     62
             * 60: iconst_0
             * 61: ireturn
             * 62: aload_1
             * 63: ifnull        84
             * 66: aload_0
             * 67: aload_1
             * 68: getfield      #39                 // Field left:Ljava/util/HashMap$TreeNode;
             * 71: if_acmpeq     84
             * 74: aload_0
             * 75: aload_1
             * 76: getfield      #42                 // Field right:Ljava/util/HashMap$TreeNode;
             * 79: if_acmpeq     84
             * 82: iconst_0
             * 83: ireturn
             * 84: aload_2
             * 85: ifnull        109
             * 88: aload_2
             * 89: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 92: aload_0
             * 93: if_acmpne     107
             * 96: aload_2
             * 97: getfield      #15                 // Field hash:I
             * 100: aload_0
             * 101: getfield      #15                 // Field hash:I
             * 104: if_icmple     109
             * 107: iconst_0
             * 108: ireturn
             * 109: aload_3
             * 110: ifnull        134
             * 113: aload_3
             * 114: getfield      #9                  // Field parent:Ljava/util/HashMap$TreeNode;
             * 117: aload_0
             * 118: if_acmpne     132
             * 121: aload_3
             * 122: getfield      #15                 // Field hash:I
             * 125: aload_0
             * 126: getfield      #15                 // Field hash:I
             * 129: if_icmpge     134
             * 132: iconst_0
             * 133: ireturn
             * 134: aload_0
             * 135: getfield      #93                 // Field red:Z
             * 138: ifeq          165
             * 141: aload_2
             * 142: ifnull        165
             * 145: aload_2
             * 146: getfield      #93                 // Field red:Z
             * 149: ifeq          165
             * 152: aload_3
             * 153: ifnull        165
             * 156: aload_3
             * 157: getfield      #93                 // Field red:Z
             * 160: ifeq          165
             * 163: iconst_0
             * 164: ireturn
             * 165: aload_2
             * 166: ifnull        178
             * 169: aload_2
             * 170: invokestatic  #30                 // Method checkInvariants:(Ljava/util/HashMap$TreeNode;)Z
             * 173: ifne          178
             * 176: iconst_0
             * 177: ireturn
             * 178: aload_3
             * 179: ifnull        191
             * 182: aload_3
             * 183: invokestatic  #30                 // Method checkInvariants:(Ljava/util/HashMap$TreeNode;)Z
             * 186: ifne          191
             * 189: iconst_0
             * 190: ireturn
             * 191: iconst_1
             * 192: ireturn
             *  */
            // </editor-fold>
        }
    }

    final class KeySet extends AbstractSet<K> {

        KeySet() {
            // compiled code
        }

        public final int size() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: getfield      #13                 // Field java/util/HashMap.size:I
             * 7: ireturn
             *  */
            // </editor-fold>
        }

        public final void clear() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: invokevirtual #19                 // Method java/util/HashMap.clear:()V
             * 7: return
             *  */
            // </editor-fold>
        }

        public final Iterator<K> iterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #22                 // class java/util/HashMap$KeyIterator
             * 3: dup
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: invokespecial #24                 // Method java/util/HashMap$KeyIterator."<init>":(Ljava/util/HashMap;)V
             * 11: areturn
             *  */
            // </editor-fold>
        }

        public final boolean contains(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: aload_1
             * 5: invokevirtual #27                 // Method java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
             * 8: ireturn
             *  */
            // </editor-fold>
        }

        public final boolean remove(Object key) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: aload_1
             * 5: invokestatic  #31                 // Method java/util/HashMap.hash:(Ljava/lang/Object;)I
             * 8: aload_1
             * 9: aconst_null
             * 10: iconst_0
             * 11: iconst_1
             * 12: invokevirtual #35                 // Method java/util/HashMap.removeNode:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/util/HashMap$Node;
             * 15: ifnull        22
             * 18: iconst_1
             * 19: goto          23
             * 22: iconst_0
             * 23: ireturn
             *  */
            // </editor-fold>
        }

        public final Spliterator<K> spliterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #39                 // class java/util/HashMap$KeySpliterator
             * 3: dup
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: iconst_0
             * 9: iconst_m1
             * 10: iconst_0
             * 11: iconst_0
             * 12: invokespecial #41                 // Method java/util/HashMap$KeySpliterator."<init>":(Ljava/util/HashMap;IIII)V
             * 15: areturn
             *  */
            // </editor-fold>
        }

        public Object[] toArray() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: getfield      #13                 // Field java/util/HashMap.size:I
             * 11: anewarray     #44                 // class java/lang/Object
             * 14: invokevirtual #46                 // Method java/util/HashMap.keysToArray:([Ljava/lang/Object;)[Ljava/lang/Object;
             * 17: areturn
             *  */
            // </editor-fold>
        }

        public <T extends Object> T[] toArray(T[] a) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: aload_1
             * 9: invokevirtual #50                 // Method java/util/HashMap.prepareArray:([Ljava/lang/Object;)[Ljava/lang/Object;
             * 12: invokevirtual #46                 // Method java/util/HashMap.keysToArray:([Ljava/lang/Object;)[Ljava/lang/Object;
             * 15: areturn
             *  */
            // </editor-fold>
        }

        public final void forEach(Consumer<? super K> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #53                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #55                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 16: getfield      #13                 // Field java/util/HashMap.size:I
             * 19: ifle          118
             * 22: aload_0
             * 23: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 26: getfield      #56                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 29: dup
             * 30: astore_2
             * 31: ifnull        118
             * 34: aload_0
             * 35: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 38: getfield      #60                 // Field java/util/HashMap.modCount:I
             * 41: istore_3
             * 42: aload_2
             * 43: astore        4
             * 45: aload         4
             * 47: arraylength
             * 48: istore        5
             * 50: iconst_0
             * 51: istore        6
             * 53: iload         6
             * 55: iload         5
             * 57: if_icmpge     99
             * 60: aload         4
             * 62: iload         6
             * 64: aaload
             * 65: astore        7
             * 67: aload         7
             * 69: ifnull        93
             * 72: aload_1
             * 73: aload         7
             * 75: getfield      #63                 // Field java/util/HashMap$Node.key:Ljava/lang/Object;
             * 78: invokeinterface #69,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 83: aload         7
             * 85: getfield      #75                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 88: astore        7
             * 90: goto          67
             * 93: iinc          6, 1
             * 96: goto          53
             * 99: aload_0
             * 100: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 103: getfield      #60                 // Field java/util/HashMap.modCount:I
             * 106: iload_3
             * 107: if_icmpeq     118
             * 110: new           #79                 // class java/util/ConcurrentModificationException
             * 113: dup
             * 114: invokespecial #81                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 117: athrow
             * 118: return
             *  */
            // </editor-fold>
        }
    }

    final class Values extends AbstractCollection<V> {

        Values() {
            // compiled code
        }

        public final int size() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: getfield      #13                 // Field java/util/HashMap.size:I
             * 7: ireturn
             *  */
            // </editor-fold>
        }

        public final void clear() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: invokevirtual #19                 // Method java/util/HashMap.clear:()V
             * 7: return
             *  */
            // </editor-fold>
        }

        public final Iterator<V> iterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #22                 // class java/util/HashMap$ValueIterator
             * 3: dup
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: invokespecial #24                 // Method java/util/HashMap$ValueIterator."<init>":(Ljava/util/HashMap;)V
             * 11: areturn
             *  */
            // </editor-fold>
        }

        public final boolean contains(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: aload_1
             * 5: invokevirtual #27                 // Method java/util/HashMap.containsValue:(Ljava/lang/Object;)Z
             * 8: ireturn
             *  */
            // </editor-fold>
        }

        public final Spliterator<V> spliterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #31                 // class java/util/HashMap$ValueSpliterator
             * 3: dup
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: iconst_0
             * 9: iconst_m1
             * 10: iconst_0
             * 11: iconst_0
             * 12: invokespecial #33                 // Method java/util/HashMap$ValueSpliterator."<init>":(Ljava/util/HashMap;IIII)V
             * 15: areturn
             *  */
            // </editor-fold>
        }

        public Object[] toArray() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: getfield      #13                 // Field java/util/HashMap.size:I
             * 11: anewarray     #36                 // class java/lang/Object
             * 14: invokevirtual #38                 // Method java/util/HashMap.valuesToArray:([Ljava/lang/Object;)[Ljava/lang/Object;
             * 17: areturn
             *  */
            // </editor-fold>
        }

        public <T extends Object> T[] toArray(T[] a) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: aload_1
             * 9: invokevirtual #42                 // Method java/util/HashMap.prepareArray:([Ljava/lang/Object;)[Ljava/lang/Object;
             * 12: invokevirtual #38                 // Method java/util/HashMap.valuesToArray:([Ljava/lang/Object;)[Ljava/lang/Object;
             * 15: areturn
             *  */
            // </editor-fold>
        }

        public final void forEach(Consumer<? super V> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #45                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #47                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 16: getfield      #13                 // Field java/util/HashMap.size:I
             * 19: ifle          118
             * 22: aload_0
             * 23: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 26: getfield      #48                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 29: dup
             * 30: astore_2
             * 31: ifnull        118
             * 34: aload_0
             * 35: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 38: getfield      #52                 // Field java/util/HashMap.modCount:I
             * 41: istore_3
             * 42: aload_2
             * 43: astore        4
             * 45: aload         4
             * 47: arraylength
             * 48: istore        5
             * 50: iconst_0
             * 51: istore        6
             * 53: iload         6
             * 55: iload         5
             * 57: if_icmpge     99
             * 60: aload         4
             * 62: iload         6
             * 64: aaload
             * 65: astore        7
             * 67: aload         7
             * 69: ifnull        93
             * 72: aload_1
             * 73: aload         7
             * 75: getfield      #55                 // Field java/util/HashMap$Node.value:Ljava/lang/Object;
             * 78: invokeinterface #61,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 83: aload         7
             * 85: getfield      #67                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 88: astore        7
             * 90: goto          67
             * 93: iinc          6, 1
             * 96: goto          53
             * 99: aload_0
             * 100: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 103: getfield      #52                 // Field java/util/HashMap.modCount:I
             * 106: iload_3
             * 107: if_icmpeq     118
             * 110: new           #71                 // class java/util/ConcurrentModificationException
             * 113: dup
             * 114: invokespecial #73                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 117: athrow
             * 118: return
             *  */
            // </editor-fold>
        }
    }

    final class EntrySet extends AbstractSet<Entry<K, V>> {

        EntrySet() {
            // compiled code
        }

        public final int size() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: getfield      #13                 // Field java/util/HashMap.size:I
             * 7: ireturn
             *  */
            // </editor-fold>
        }

        public final void clear() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 4: invokevirtual #19                 // Method java/util/HashMap.clear:()V
             * 7: return
             *  */
            // </editor-fold>
        }

        public final Iterator<Entry<K, V>> iterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #22                 // class java/util/HashMap$EntryIterator
             * 3: dup
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: invokespecial #24                 // Method java/util/HashMap$EntryIterator."<init>":(Ljava/util/HashMap;)V
             * 11: areturn
             *  */
            // </editor-fold>
        }

        public final boolean contains(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: instanceof    #27                 // class java/util/Map$Entry
             * 4: ifeq          15
             * 7: aload_1
             * 8: checkcast     #27                 // class java/util/Map$Entry
             * 11: astore_2
             * 12: goto          17
             * 15: iconst_0
             * 16: ireturn
             * 17: aload_2
             * 18: invokeinterface #29,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
             * 23: astore_3
             * 24: aload_0
             * 25: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 28: aload_3
             * 29: invokevirtual #33                 // Method java/util/HashMap.getNode:(Ljava/lang/Object;)Ljava/util/HashMap$Node;
             * 32: astore        4
             * 34: aload         4
             * 36: ifnull        52
             * 39: aload         4
             * 41: aload_2
             * 42: invokevirtual #37                 // Method java/util/HashMap$Node.equals:(Ljava/lang/Object;)Z
             * 45: ifeq          52
             * 48: iconst_1
             * 49: goto          53
             * 52: iconst_0
             * 53: ireturn
             *  */
            // </editor-fold>
        }

        public final boolean remove(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: instanceof    #27                 // class java/util/Map$Entry
             * 4: ifeq          52
             * 7: aload_1
             * 8: checkcast     #27                 // class java/util/Map$Entry
             * 11: astore_2
             * 12: aload_2
             * 13: invokeinterface #29,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
             * 18: astore_3
             * 19: aload_2
             * 20: invokeinterface #43,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
             * 25: astore        4
             * 27: aload_0
             * 28: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 31: aload_3
             * 32: invokestatic  #46                 // Method java/util/HashMap.hash:(Ljava/lang/Object;)I
             * 35: aload_3
             * 36: aload         4
             * 38: iconst_1
             * 39: iconst_1
             * 40: invokevirtual #50                 // Method java/util/HashMap.removeNode:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/util/HashMap$Node;
             * 43: ifnull        50
             * 46: iconst_1
             * 47: goto          51
             * 50: iconst_0
             * 51: ireturn
             * 52: iconst_0
             * 53: ireturn
             *  */
            // </editor-fold>
        }

        public final Spliterator<Entry<K, V>> spliterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #54                 // class java/util/HashMap$EntrySpliterator
             * 3: dup
             * 4: aload_0
             * 5: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 8: iconst_0
             * 9: iconst_m1
             * 10: iconst_0
             * 11: iconst_0
             * 12: invokespecial #56                 // Method java/util/HashMap$EntrySpliterator."<init>":(Ljava/util/HashMap;IIII)V
             * 15: areturn
             *  */
            // </editor-fold>
        }

        public final void forEach(Consumer<? super Entry<K, V>> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #59                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #61                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 16: getfield      #13                 // Field java/util/HashMap.size:I
             * 19: ifle          115
             * 22: aload_0
             * 23: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 26: getfield      #62                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 29: dup
             * 30: astore_2
             * 31: ifnull        115
             * 34: aload_0
             * 35: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 38: getfield      #66                 // Field java/util/HashMap.modCount:I
             * 41: istore_3
             * 42: aload_2
             * 43: astore        4
             * 45: aload         4
             * 47: arraylength
             * 48: istore        5
             * 50: iconst_0
             * 51: istore        6
             * 53: iload         6
             * 55: iload         5
             * 57: if_icmpge     96
             * 60: aload         4
             * 62: iload         6
             * 64: aaload
             * 65: astore        7
             * 67: aload         7
             * 69: ifnull        90
             * 72: aload_1
             * 73: aload         7
             * 75: invokeinterface #69,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 80: aload         7
             * 82: getfield      #75                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 85: astore        7
             * 87: goto          67
             * 90: iinc          6, 1
             * 93: goto          53
             * 96: aload_0
             * 97: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 100: getfield      #66                 // Field java/util/HashMap.modCount:I
             * 103: iload_3
             * 104: if_icmpeq     115
             * 107: new           #79                 // class java/util/ConcurrentModificationException
             * 110: dup
             * 111: invokespecial #81                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 114: athrow
             * 115: return
             *  */
            // </editor-fold>
        }
    }

    private static final class UnsafeHolder {

        private static final Unsafe unsafe;
        private static final long LF_OFFSET;

        private UnsafeHolder() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: new           #7                  // class java/lang/InternalError
             * 7: dup
             * 8: invokespecial #9                  // Method java/lang/InternalError."<init>":()V
             * 11: athrow
             *  */
            // </editor-fold>
        }

        static void putLoadFactor(HashMap<?, ?> map, float lf) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: getstatic     #10                 // Field unsafe:Ljdk/internal/misc/Unsafe;
             * 3: aload_0
             * 4: getstatic     #16                 // Field LF_OFFSET:J
             * 7: fload_1
             * 8: invokevirtual #20                 // Method jdk/internal/misc/Unsafe.putFloat:(Ljava/lang/Object;JF)V
             * 11: return
             *  */
            // </editor-fold>
        }
    }

    static final class EntrySpliterator<K extends Object, V extends Object> extends HashMapSpliterator<K, V> implements Spliterator<Entry<K, V>> {

        EntrySpliterator(HashMap<K, V> m, int origin, int fence, int est, int expectedModCount) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: iload_2
             * 3: iload_3
             * 4: iload         4
             * 6: iload         5
             * 8: invokespecial #1                  // Method java/util/HashMap$HashMapSpliterator."<init>":(Ljava/util/HashMap;IIII)V
             * 11: return
             *  */
            // </editor-fold>
        }

        public EntrySpliterator<K, V> trySplit() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #7                  // Method getFence:()I
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
             * 18: if_icmpge     28
             * 21: aload_0
             * 22: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 25: ifnull        32
             * 28: aconst_null
             * 29: goto          65
             * 32: new           #8                  // class java/util/HashMap$EntrySpliterator
             * 35: dup
             * 36: aload_0
             * 37: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 40: iload_2
             * 41: aload_0
             * 42: iload_3
             * 43: dup_x1
             * 44: putfield      #13                 // Field index:I
             * 47: aload_0
             * 48: dup
             * 49: getfield      #25                 // Field est:I
             * 52: iconst_1
             * 53: iushr
             * 54: dup_x1
             * 55: putfield      #25                 // Field est:I
             * 58: aload_0
             * 59: getfield      #28                 // Field expectedModCount:I
             * 62: invokespecial #31                 // Method "<init>":(Ljava/util/HashMap;IIII)V
             * 65: areturn
             *  */
            // </editor-fold>
        }

        public void forEachRemaining(Consumer<? super Entry<K, V>> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #32                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #34                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 16: astore        5
             * 18: aload         5
             * 20: getfield      #37                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 23: astore        6
             * 25: aload_0
             * 26: getfield      #43                 // Field fence:I
             * 29: dup
             * 30: istore_3
             * 31: ifge          67
             * 34: aload_0
             * 35: aload         5
             * 37: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 40: dup_x1
             * 41: putfield      #28                 // Field expectedModCount:I
             * 44: istore        4
             * 46: aload_0
             * 47: aload         6
             * 49: ifnonnull     56
             * 52: iconst_0
             * 53: goto          59
             * 56: aload         6
             * 58: arraylength
             * 59: dup_x1
             * 60: putfield      #43                 // Field fence:I
             * 63: istore_3
             * 64: goto          73
             * 67: aload_0
             * 68: getfield      #28                 // Field expectedModCount:I
             * 71: istore        4
             * 73: aload         6
             * 75: ifnull        182
             * 78: aload         6
             * 80: arraylength
             * 81: iload_3
             * 82: if_icmplt     182
             * 85: aload_0
             * 86: getfield      #13                 // Field index:I
             * 89: dup
             * 90: istore_2
             * 91: iflt          182
             * 94: iload_2
             * 95: aload_0
             * 96: iload_3
             * 97: dup_x1
             * 98: putfield      #13                 // Field index:I
             * 101: if_icmplt     111
             * 104: aload_0
             * 105: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 108: ifnull        182
             * 111: aload_0
             * 112: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 115: astore        7
             * 117: aload_0
             * 118: aconst_null
             * 119: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 122: aload         7
             * 124: ifnonnull     139
             * 127: aload         6
             * 129: iload_2
             * 130: iinc          2, 1
             * 133: aaload
             * 134: astore        7
             * 136: goto          154
             * 139: aload_1
             * 140: aload         7
             * 142: invokeinterface #49,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 147: aload         7
             * 149: getfield      #55                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 152: astore        7
             * 154: aload         7
             * 156: ifnonnull     122
             * 159: iload_2
             * 160: iload_3
             * 161: if_icmplt     122
             * 164: aload         5
             * 166: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 169: iload         4
             * 171: if_icmpeq     182
             * 174: new           #60                 // class java/util/ConcurrentModificationException
             * 177: dup
             * 178: invokespecial #62                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 181: athrow
             * 182: return
             *  */
            // </editor-fold>
        }

        public boolean tryAdvance(Consumer<? super Entry<K, V>> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #32                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #34                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 16: getfield      #37                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 19: astore_3
             * 20: aload_3
             * 21: ifnull        133
             * 24: aload_3
             * 25: arraylength
             * 26: aload_0
             * 27: invokevirtual #7                  // Method getFence:()I
             * 30: dup
             * 31: istore_2
             * 32: if_icmplt     133
             * 35: aload_0
             * 36: getfield      #13                 // Field index:I
             * 39: iflt          133
             * 42: aload_0
             * 43: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 46: ifnonnull     57
             * 49: aload_0
             * 50: getfield      #13                 // Field index:I
             * 53: iload_2
             * 54: if_icmpge     133
             * 57: aload_0
             * 58: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 61: ifnonnull     84
             * 64: aload_0
             * 65: aload_3
             * 66: aload_0
             * 67: dup
             * 68: getfield      #13                 // Field index:I
             * 71: dup_x1
             * 72: iconst_1
             * 73: iadd
             * 74: putfield      #13                 // Field index:I
             * 77: aaload
             * 78: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 81: goto          42
             * 84: aload_0
             * 85: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 88: astore        4
             * 90: aload_0
             * 91: aload_0
             * 92: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 95: getfield      #55                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 98: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 101: aload_1
             * 102: aload         4
             * 104: invokeinterface #49,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 109: aload_0
             * 110: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 113: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 116: aload_0
             * 117: getfield      #28                 // Field expectedModCount:I
             * 120: if_icmpeq     131
             * 123: new           #60                 // class java/util/ConcurrentModificationException
             * 126: dup
             * 127: invokespecial #62                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 130: athrow
             * 131: iconst_1
             * 132: ireturn
             * 133: iconst_0
             * 134: ireturn
             *  */
            // </editor-fold>
        }

        public int characteristics() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #43                 // Field fence:I
             * 4: iflt          21
             * 7: aload_0
             * 8: getfield      #25                 // Field est:I
             * 11: aload_0
             * 12: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 15: getfield      #63                 // Field java/util/HashMap.size:I
             * 18: if_icmpne     26
             * 21: bipush        64
             * 23: goto          27
             * 26: iconst_0
             * 27: iconst_1
             * 28: ior
             * 29: ireturn
             *  */
            // </editor-fold>
        }
    }

    static final class ValueSpliterator<K extends Object, V extends Object> extends HashMapSpliterator<K, V> implements Spliterator<V> {

        ValueSpliterator(HashMap<K, V> m, int origin, int fence, int est, int expectedModCount) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: iload_2
             * 3: iload_3
             * 4: iload         4
             * 6: iload         5
             * 8: invokespecial #1                  // Method java/util/HashMap$HashMapSpliterator."<init>":(Ljava/util/HashMap;IIII)V
             * 11: return
             *  */
            // </editor-fold>
        }

        public ValueSpliterator<K, V> trySplit() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #7                  // Method getFence:()I
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
             * 18: if_icmpge     28
             * 21: aload_0
             * 22: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 25: ifnull        32
             * 28: aconst_null
             * 29: goto          65
             * 32: new           #8                  // class java/util/HashMap$ValueSpliterator
             * 35: dup
             * 36: aload_0
             * 37: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 40: iload_2
             * 41: aload_0
             * 42: iload_3
             * 43: dup_x1
             * 44: putfield      #13                 // Field index:I
             * 47: aload_0
             * 48: dup
             * 49: getfield      #25                 // Field est:I
             * 52: iconst_1
             * 53: iushr
             * 54: dup_x1
             * 55: putfield      #25                 // Field est:I
             * 58: aload_0
             * 59: getfield      #28                 // Field expectedModCount:I
             * 62: invokespecial #31                 // Method "<init>":(Ljava/util/HashMap;IIII)V
             * 65: areturn
             *  */
            // </editor-fold>
        }

        public void forEachRemaining(Consumer<? super V> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #32                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #34                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 16: astore        5
             * 18: aload         5
             * 20: getfield      #37                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 23: astore        6
             * 25: aload_0
             * 26: getfield      #43                 // Field fence:I
             * 29: dup
             * 30: istore_3
             * 31: ifge          67
             * 34: aload_0
             * 35: aload         5
             * 37: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 40: dup_x1
             * 41: putfield      #28                 // Field expectedModCount:I
             * 44: istore        4
             * 46: aload_0
             * 47: aload         6
             * 49: ifnonnull     56
             * 52: iconst_0
             * 53: goto          59
             * 56: aload         6
             * 58: arraylength
             * 59: dup_x1
             * 60: putfield      #43                 // Field fence:I
             * 63: istore_3
             * 64: goto          73
             * 67: aload_0
             * 68: getfield      #28                 // Field expectedModCount:I
             * 71: istore        4
             * 73: aload         6
             * 75: ifnull        185
             * 78: aload         6
             * 80: arraylength
             * 81: iload_3
             * 82: if_icmplt     185
             * 85: aload_0
             * 86: getfield      #13                 // Field index:I
             * 89: dup
             * 90: istore_2
             * 91: iflt          185
             * 94: iload_2
             * 95: aload_0
             * 96: iload_3
             * 97: dup_x1
             * 98: putfield      #13                 // Field index:I
             * 101: if_icmplt     111
             * 104: aload_0
             * 105: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 108: ifnull        185
             * 111: aload_0
             * 112: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 115: astore        7
             * 117: aload_0
             * 118: aconst_null
             * 119: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 122: aload         7
             * 124: ifnonnull     139
             * 127: aload         6
             * 129: iload_2
             * 130: iinc          2, 1
             * 133: aaload
             * 134: astore        7
             * 136: goto          157
             * 139: aload_1
             * 140: aload         7
             * 142: getfield      #49                 // Field java/util/HashMap$Node.value:Ljava/lang/Object;
             * 145: invokeinterface #55,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 150: aload         7
             * 152: getfield      #61                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 155: astore        7
             * 157: aload         7
             * 159: ifnonnull     122
             * 162: iload_2
             * 163: iload_3
             * 164: if_icmplt     122
             * 167: aload         5
             * 169: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 172: iload         4
             * 174: if_icmpeq     185
             * 177: new           #64                 // class java/util/ConcurrentModificationException
             * 180: dup
             * 181: invokespecial #66                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 184: athrow
             * 185: return
             *  */
            // </editor-fold>
        }

        public boolean tryAdvance(Consumer<? super V> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #32                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #34                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 16: getfield      #37                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 19: astore_3
             * 20: aload_3
             * 21: ifnull        136
             * 24: aload_3
             * 25: arraylength
             * 26: aload_0
             * 27: invokevirtual #7                  // Method getFence:()I
             * 30: dup
             * 31: istore_2
             * 32: if_icmplt     136
             * 35: aload_0
             * 36: getfield      #13                 // Field index:I
             * 39: iflt          136
             * 42: aload_0
             * 43: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 46: ifnonnull     57
             * 49: aload_0
             * 50: getfield      #13                 // Field index:I
             * 53: iload_2
             * 54: if_icmpge     136
             * 57: aload_0
             * 58: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 61: ifnonnull     84
             * 64: aload_0
             * 65: aload_3
             * 66: aload_0
             * 67: dup
             * 68: getfield      #13                 // Field index:I
             * 71: dup_x1
             * 72: iconst_1
             * 73: iadd
             * 74: putfield      #13                 // Field index:I
             * 77: aaload
             * 78: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 81: goto          42
             * 84: aload_0
             * 85: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 88: getfield      #49                 // Field java/util/HashMap$Node.value:Ljava/lang/Object;
             * 91: astore        4
             * 93: aload_0
             * 94: aload_0
             * 95: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 98: getfield      #61                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 101: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 104: aload_1
             * 105: aload         4
             * 107: invokeinterface #55,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 112: aload_0
             * 113: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 116: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 119: aload_0
             * 120: getfield      #28                 // Field expectedModCount:I
             * 123: if_icmpeq     134
             * 126: new           #64                 // class java/util/ConcurrentModificationException
             * 129: dup
             * 130: invokespecial #66                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 133: athrow
             * 134: iconst_1
             * 135: ireturn
             * 136: iconst_0
             * 137: ireturn
             *  */
            // </editor-fold>
        }

        public int characteristics() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #43                 // Field fence:I
             * 4: iflt          21
             * 7: aload_0
             * 8: getfield      #25                 // Field est:I
             * 11: aload_0
             * 12: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 15: getfield      #67                 // Field java/util/HashMap.size:I
             * 18: if_icmpne     26
             * 21: bipush        64
             * 23: goto          27
             * 26: iconst_0
             * 27: ireturn
             *  */
            // </editor-fold>
        }
    }

    static final class KeySpliterator<K extends Object, V extends Object> extends HashMapSpliterator<K, V> implements Spliterator<K> {

        KeySpliterator(HashMap<K, V> m, int origin, int fence, int est, int expectedModCount) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: iload_2
             * 3: iload_3
             * 4: iload         4
             * 6: iload         5
             * 8: invokespecial #1                  // Method java/util/HashMap$HashMapSpliterator."<init>":(Ljava/util/HashMap;IIII)V
             * 11: return
             *  */
            // </editor-fold>
        }

        public KeySpliterator<K, V> trySplit() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #7                  // Method getFence:()I
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
             * 18: if_icmpge     28
             * 21: aload_0
             * 22: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 25: ifnull        32
             * 28: aconst_null
             * 29: goto          65
             * 32: new           #8                  // class java/util/HashMap$KeySpliterator
             * 35: dup
             * 36: aload_0
             * 37: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 40: iload_2
             * 41: aload_0
             * 42: iload_3
             * 43: dup_x1
             * 44: putfield      #13                 // Field index:I
             * 47: aload_0
             * 48: dup
             * 49: getfield      #25                 // Field est:I
             * 52: iconst_1
             * 53: iushr
             * 54: dup_x1
             * 55: putfield      #25                 // Field est:I
             * 58: aload_0
             * 59: getfield      #28                 // Field expectedModCount:I
             * 62: invokespecial #31                 // Method "<init>":(Ljava/util/HashMap;IIII)V
             * 65: areturn
             *  */
            // </editor-fold>
        }

        public void forEachRemaining(Consumer<? super K> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #32                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #34                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 16: astore        5
             * 18: aload         5
             * 20: getfield      #37                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 23: astore        6
             * 25: aload_0
             * 26: getfield      #43                 // Field fence:I
             * 29: dup
             * 30: istore_3
             * 31: ifge          67
             * 34: aload_0
             * 35: aload         5
             * 37: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 40: dup_x1
             * 41: putfield      #28                 // Field expectedModCount:I
             * 44: istore        4
             * 46: aload_0
             * 47: aload         6
             * 49: ifnonnull     56
             * 52: iconst_0
             * 53: goto          59
             * 56: aload         6
             * 58: arraylength
             * 59: dup_x1
             * 60: putfield      #43                 // Field fence:I
             * 63: istore_3
             * 64: goto          73
             * 67: aload_0
             * 68: getfield      #28                 // Field expectedModCount:I
             * 71: istore        4
             * 73: aload         6
             * 75: ifnull        185
             * 78: aload         6
             * 80: arraylength
             * 81: iload_3
             * 82: if_icmplt     185
             * 85: aload_0
             * 86: getfield      #13                 // Field index:I
             * 89: dup
             * 90: istore_2
             * 91: iflt          185
             * 94: iload_2
             * 95: aload_0
             * 96: iload_3
             * 97: dup_x1
             * 98: putfield      #13                 // Field index:I
             * 101: if_icmplt     111
             * 104: aload_0
             * 105: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 108: ifnull        185
             * 111: aload_0
             * 112: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 115: astore        7
             * 117: aload_0
             * 118: aconst_null
             * 119: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 122: aload         7
             * 124: ifnonnull     139
             * 127: aload         6
             * 129: iload_2
             * 130: iinc          2, 1
             * 133: aaload
             * 134: astore        7
             * 136: goto          157
             * 139: aload_1
             * 140: aload         7
             * 142: getfield      #49                 // Field java/util/HashMap$Node.key:Ljava/lang/Object;
             * 145: invokeinterface #55,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 150: aload         7
             * 152: getfield      #61                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 155: astore        7
             * 157: aload         7
             * 159: ifnonnull     122
             * 162: iload_2
             * 163: iload_3
             * 164: if_icmplt     122
             * 167: aload         5
             * 169: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 172: iload         4
             * 174: if_icmpeq     185
             * 177: new           #64                 // class java/util/ConcurrentModificationException
             * 180: dup
             * 181: invokespecial #66                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 184: athrow
             * 185: return
             *  */
            // </editor-fold>
        }

        public boolean tryAdvance(Consumer<? super K> action) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     12
             * 4: new           #32                 // class java/lang/NullPointerException
             * 7: dup
             * 8: invokespecial #34                 // Method java/lang/NullPointerException."<init>":()V
             * 11: athrow
             * 12: aload_0
             * 13: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 16: getfield      #37                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 19: astore_3
             * 20: aload_3
             * 21: ifnull        136
             * 24: aload_3
             * 25: arraylength
             * 26: aload_0
             * 27: invokevirtual #7                  // Method getFence:()I
             * 30: dup
             * 31: istore_2
             * 32: if_icmplt     136
             * 35: aload_0
             * 36: getfield      #13                 // Field index:I
             * 39: iflt          136
             * 42: aload_0
             * 43: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 46: ifnonnull     57
             * 49: aload_0
             * 50: getfield      #13                 // Field index:I
             * 53: iload_2
             * 54: if_icmpge     136
             * 57: aload_0
             * 58: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 61: ifnonnull     84
             * 64: aload_0
             * 65: aload_3
             * 66: aload_0
             * 67: dup
             * 68: getfield      #13                 // Field index:I
             * 71: dup_x1
             * 72: iconst_1
             * 73: iadd
             * 74: putfield      #13                 // Field index:I
             * 77: aaload
             * 78: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 81: goto          42
             * 84: aload_0
             * 85: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 88: getfield      #49                 // Field java/util/HashMap$Node.key:Ljava/lang/Object;
             * 91: astore        4
             * 93: aload_0
             * 94: aload_0
             * 95: getfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 98: getfield      #61                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 101: putfield      #17                 // Field current:Ljava/util/HashMap$Node;
             * 104: aload_1
             * 105: aload         4
             * 107: invokeinterface #55,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
             * 112: aload_0
             * 113: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 116: getfield      #46                 // Field java/util/HashMap.modCount:I
             * 119: aload_0
             * 120: getfield      #28                 // Field expectedModCount:I
             * 123: if_icmpeq     134
             * 126: new           #64                 // class java/util/ConcurrentModificationException
             * 129: dup
             * 130: invokespecial #66                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 133: athrow
             * 134: iconst_1
             * 135: ireturn
             * 136: iconst_0
             * 137: ireturn
             *  */
            // </editor-fold>
        }

        public int characteristics() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #43                 // Field fence:I
             * 4: iflt          21
             * 7: aload_0
             * 8: getfield      #25                 // Field est:I
             * 11: aload_0
             * 12: getfield      #21                 // Field map:Ljava/util/HashMap;
             * 15: getfield      #67                 // Field java/util/HashMap.size:I
             * 18: if_icmpne     26
             * 21: bipush        64
             * 23: goto          27
             * 26: iconst_0
             * 27: iconst_1
             * 28: ior
             * 29: ireturn
             *  */
            // </editor-fold>
        }
    }

    static class HashMapSpliterator<K extends Object, V extends Object> {

        final HashMap<K, V> map;
        Node<K, V> current;
        int index;
        int fence;
        int est;
        int expectedModCount;

        HashMapSpliterator(HashMap<K, V> m, int origin, int fence, int est, int expectedModCount) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      #7                  // Field map:Ljava/util/HashMap;
             * 9: aload_0
             * 10: iload_2
             * 11: putfield      #13                 // Field index:I
             * 14: aload_0
             * 15: iload_3
             * 16: putfield      #17                 // Field fence:I
             * 19: aload_0
             * 20: iload         4
             * 22: putfield      #20                 // Field est:I
             * 25: aload_0
             * 26: iload         5
             * 28: putfield      #23                 // Field expectedModCount:I
             * 31: return
             *  */
            // </editor-fold>
        }

        final int getFence() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #17                 // Field fence:I
             * 4: dup
             * 5: istore_1
             * 6: ifge          51
             * 9: aload_0
             * 10: getfield      #7                  // Field map:Ljava/util/HashMap;
             * 13: astore_2
             * 14: aload_0
             * 15: aload_2
             * 16: getfield      #26                 // Field java/util/HashMap.size:I
             * 19: putfield      #20                 // Field est:I
             * 22: aload_0
             * 23: aload_2
             * 24: getfield      #31                 // Field java/util/HashMap.modCount:I
             * 27: putfield      #23                 // Field expectedModCount:I
             * 30: aload_2
             * 31: getfield      #34                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 34: astore_3
             * 35: aload_0
             * 36: aload_3
             * 37: ifnonnull     44
             * 40: iconst_0
             * 41: goto          46
             * 44: aload_3
             * 45: arraylength
             * 46: dup_x1
             * 47: putfield      #17                 // Field fence:I
             * 50: istore_1
             * 51: iload_1
             * 52: ireturn
             *  */
            // </editor-fold>
        }

        public final long estimateSize() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #38                 // Method getFence:()I
             * 4: pop
             * 5: aload_0
             * 6: getfield      #20                 // Field est:I
             * 9: i2l
             * 10: lreturn
             *  */
            // </editor-fold>
        }
    }

    final class EntryIterator extends HashIterator implements Iterator<Entry<K, V>> {

        EntryIterator() {
            // compiled code
        }

        public final Entry<K, V> next() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #7                  // Method nextNode:()Ljava/util/HashMap$Node;
             * 4: areturn
             *  */
            // </editor-fold>
        }
    }

    final class ValueIterator extends HashIterator implements Iterator<V> {

        ValueIterator() {
            // compiled code
        }

        public final V next() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #7                  // Method nextNode:()Ljava/util/HashMap$Node;
             * 4: getfield      #13                 // Field java/util/HashMap$Node.value:Ljava/lang/Object;
             * 7: areturn
             *  */
            // </editor-fold>
        }
    }

    final class KeyIterator extends HashIterator implements Iterator<K> {

        KeyIterator() {
            // compiled code
        }

        public final K next() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual #7                  // Method nextNode:()Ljava/util/HashMap$Node;
             * 4: getfield      #13                 // Field java/util/HashMap$Node.key:Ljava/lang/Object;
             * 7: areturn
             *  */
            // </editor-fold>
        }
    }

    abstract class HashIterator {

        Node<K, V> next;
        Node<K, V> current;
        int expectedModCount;
        int index;

        HashIterator() {
            // compiled code
        }

        public final boolean hasNext() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #26                 // Field next:Ljava/util/HashMap$Node;
             * 4: ifnull        11
             * 7: iconst_1
             * 8: goto          12
             * 11: iconst_0
             * 12: ireturn
             *  */
            // </editor-fold>
        }

        final Node<K, V> nextNode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #26                 // Field next:Ljava/util/HashMap$Node;
             * 4: astore_2
             * 5: aload_0
             * 6: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 9: getfield      #13                 // Field java/util/HashMap.modCount:I
             * 12: aload_0
             * 13: getfield      #19                 // Field expectedModCount:I
             * 16: if_icmpeq     27
             * 19: new           #39                 // class java/util/ConcurrentModificationException
             * 22: dup
             * 23: invokespecial #41                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 26: athrow
             * 27: aload_2
             * 28: ifnonnull     39
             * 31: new           #42                 // class java/util/NoSuchElementException
             * 34: dup
             * 35: invokespecial #44                 // Method java/util/NoSuchElementException."<init>":()V
             * 38: athrow
             * 39: aload_0
             * 40: aload_0
             * 41: aload_2
             * 42: dup_x1
             * 43: putfield      #30                 // Field current:Ljava/util/HashMap$Node;
             * 46: getfield      #45                 // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
             * 49: dup_x1
             * 50: putfield      #26                 // Field next:Ljava/util/HashMap$Node;
             * 53: ifnonnull     98
             * 56: aload_0
             * 57: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 60: getfield      #22                 // Field java/util/HashMap.table:[Ljava/util/HashMap$Node;
             * 63: dup
             * 64: astore_1
             * 65: ifnull        98
             * 68: aload_0
             * 69: getfield      #33                 // Field index:I
             * 72: aload_1
             * 73: arraylength
             * 74: if_icmpge     98
             * 77: aload_0
             * 78: aload_1
             * 79: aload_0
             * 80: dup
             * 81: getfield      #33                 // Field index:I
             * 84: dup_x1
             * 85: iconst_1
             * 86: iadd
             * 87: putfield      #33                 // Field index:I
             * 90: aaload
             * 91: dup_x1
             * 92: putfield      #26                 // Field next:Ljava/util/HashMap$Node;
             * 95: ifnull        68
             * 98: aload_2
             * 99: areturn
             *  */
            // </editor-fold>
        }

        public final void remove() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #30                 // Field current:Ljava/util/HashMap$Node;
             * 4: astore_1
             * 5: aload_1
             * 6: ifnonnull     17
             * 9: new           #48                 // class java/lang/IllegalStateException
             * 12: dup
             * 13: invokespecial #50                 // Method java/lang/IllegalStateException."<init>":()V
             * 16: athrow
             * 17: aload_0
             * 18: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 21: getfield      #13                 // Field java/util/HashMap.modCount:I
             * 24: aload_0
             * 25: getfield      #19                 // Field expectedModCount:I
             * 28: if_icmpeq     39
             * 31: new           #39                 // class java/util/ConcurrentModificationException
             * 34: dup
             * 35: invokespecial #41                 // Method java/util/ConcurrentModificationException."<init>":()V
             * 38: athrow
             * 39: aload_0
             * 40: aconst_null
             * 41: putfield      #30                 // Field current:Ljava/util/HashMap$Node;
             * 44: aload_0
             * 45: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 48: aload_1
             * 49: getfield      #51                 // Field java/util/HashMap$Node.hash:I
             * 52: aload_1
             * 53: getfield      #54                 // Field java/util/HashMap$Node.key:Ljava/lang/Object;
             * 56: aconst_null
             * 57: iconst_0
             * 58: iconst_0
             * 59: invokevirtual #58                 // Method java/util/HashMap.removeNode:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/util/HashMap$Node;
             * 62: pop
             * 63: aload_0
             * 64: aload_0
             * 65: getfield      #1                  // Field this$0:Ljava/util/HashMap;
             * 68: getfield      #13                 // Field java/util/HashMap.modCount:I
             * 71: putfield      #19                 // Field expectedModCount:I
             * 74: return
             *  */
            // </editor-fold>
        }
    }
    private static final long serialVersionUID = 362498820763181265L;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final float DEFAULT_LOAD_FACTOR = 0.75F;
    static final int TREEIFY_THRESHOLD = 8;
    static final int UNTREEIFY_THRESHOLD = 6;
    static final int MIN_TREEIFY_CAPACITY = 64;
    transient Node<K, V>[] table;
    transient Set<Entry<K, V>> entrySet;
    transient int size;
    transient int modCount;
    int threshold;
    final float loadFactor;

    static final int hash(Object key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     8
         * 4: iconst_0
         * 5: goto          19
         * 8: aload_0
         * 9: invokevirtual #1                  // Method java/lang/Object.hashCode:()I
         * 12: dup
         * 13: istore_1
         * 14: iload_1
         * 15: bipush        16
         * 17: iushr
         * 18: ixor
         * 19: ireturn
         *  */
        // </editor-fold>
    }

    static Class<?> comparableClassFor(Object x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: instanceof    #7                  // class java/lang/Comparable
         * 4: ifeq          113
         * 7: aload_0
         * 8: invokevirtual #9                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 11: dup
         * 12: astore_1
         * 13: ldc           #13                 // class java/lang/String
         * 15: if_acmpne     20
         * 18: aload_1
         * 19: areturn
         * 20: aload_1
         * 21: invokevirtual #15                 // Method java/lang/Class.getGenericInterfaces:()[Ljava/lang/reflect/Type;
         * 24: dup
         * 25: astore_2
         * 26: ifnull        113
         * 29: aload_2
         * 30: astore        5
         * 32: aload         5
         * 34: arraylength
         * 35: istore        6
         * 37: iconst_0
         * 38: istore        7
         * 40: iload         7
         * 42: iload         6
         * 44: if_icmpge     113
         * 47: aload         5
         * 49: iload         7
         * 51: aaload
         * 52: astore        8
         * 54: aload         8
         * 56: instanceof    #21                 // class java/lang/reflect/ParameterizedType
         * 59: ifeq          107
         * 62: aload         8
         * 64: checkcast     #21                 // class java/lang/reflect/ParameterizedType
         * 67: dup
         * 68: astore        4
         * 70: invokeinterface #23,  1           // InterfaceMethod java/lang/reflect/ParameterizedType.getRawType:()Ljava/lang/reflect/Type;
         * 75: ldc           #7                  // class java/lang/Comparable
         * 77: if_acmpne     107
         * 80: aload         4
         * 82: invokeinterface #27,  1           // InterfaceMethod java/lang/reflect/ParameterizedType.getActualTypeArguments:()[Ljava/lang/reflect/Type;
         * 87: dup
         * 88: astore_3
         * 89: ifnull        107
         * 92: aload_3
         * 93: arraylength
         * 94: iconst_1
         * 95: if_icmpne     107
         * 98: aload_3
         * 99: iconst_0
         * 100: aaload
         * 101: aload_1
         * 102: if_acmpne     107
         * 105: aload_1
         * 106: areturn
         * 107: iinc          7, 1
         * 110: goto          40
         * 113: aconst_null
         * 114: areturn
         *  */
        // </editor-fold>
    }

    static int compareComparables(Class<?> kc, Object k, Object x) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_2
         * 1: ifnull        12
         * 4: aload_2
         * 5: invokevirtual #9                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 8: aload_0
         * 9: if_acmpeq     16
         * 12: iconst_0
         * 13: goto          26
         * 16: aload_1
         * 17: checkcast     #7                  // class java/lang/Comparable
         * 20: aload_2
         * 21: invokeinterface #30,  2           // InterfaceMethod java/lang/Comparable.compareTo:(Ljava/lang/Object;)I
         * 26: ireturn
         *  */
        // </editor-fold>
    }

    static final int tableSizeFor(int cap) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_m1
         * 1: iload_0
         * 2: iconst_1
         * 3: isub
         * 4: invokestatic  #34                 // Method java/lang/Integer.numberOfLeadingZeros:(I)I
         * 7: iushr
         * 8: istore_1
         * 9: iload_1
         * 10: ifge          17
         * 13: iconst_1
         * 14: goto          31
         * 17: iload_1
         * 18: ldc           #42                 // int 1073741824
         * 20: if_icmplt     28
         * 23: ldc           #42                 // int 1073741824
         * 25: goto          31
         * 28: iload_1
         * 29: iconst_1
         * 30: iadd
         * 31: ireturn
         *  */
        // </editor-fold>
    }

    public HashMap(int initialCapacity, float loadFactor) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #43                 // Method java/util/AbstractMap."<init>":()V
         * 4: iload_1
         * 5: ifge          35
         * 8: new           #49                 // class java/lang/IllegalArgumentException
         * 11: dup
         * 12: new           #51                 // class java/lang/StringBuilder
         * 15: dup
         * 16: invokespecial #53                 // Method java/lang/StringBuilder."<init>":()V
         * 19: ldc           #54                 // String Illegal initial capacity:
         * 21: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 24: iload_1
         * 25: invokevirtual #60                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 28: invokevirtual #63                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 31: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 34: athrow
         * 35: iload_1
         * 36: ldc           #42                 // int 1073741824
         * 38: if_icmple     44
         * 41: ldc           #42                 // int 1073741824
         * 43: istore_1
         * 44: fload_2
         * 45: fconst_0
         * 46: fcmpg
         * 47: ifle          57
         * 50: fload_2
         * 51: invokestatic  #70                 // Method java/lang/Float.isNaN:(F)Z
         * 54: ifeq          84
         * 57: new           #49                 // class java/lang/IllegalArgumentException
         * 60: dup
         * 61: new           #51                 // class java/lang/StringBuilder
         * 64: dup
         * 65: invokespecial #53                 // Method java/lang/StringBuilder."<init>":()V
         * 68: ldc           #76                 // String Illegal load factor:
         * 70: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 73: fload_2
         * 74: invokevirtual #78                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
         * 77: invokevirtual #63                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 80: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 83: athrow
         * 84: aload_0
         * 85: fload_2
         * 86: putfield      #81                 // Field loadFactor:F
         * 89: aload_0
         * 90: iload_1
         * 91: invokestatic  #85                 // Method tableSizeFor:(I)I
         * 94: putfield      #88                 // Field threshold:I
         * 97: return
         *  */
        // </editor-fold>
    }

    public HashMap(int initialCapacity) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: ldc           #92                 // float 0.75f
         * 4: invokespecial #93                 // Method "<init>":(IF)V
         * 7: return
         *  */
        // </editor-fold>
    }

    public HashMap() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #43                 // Method java/util/AbstractMap."<init>":()V
         * 4: aload_0
         * 5: ldc           #92                 // float 0.75f
         * 7: putfield      #81                 // Field loadFactor:F
         * 10: return
         *  */
        // </editor-fold>
    }

    public HashMap(Map<? extends K, ? extends V> m) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #43                 // Method java/util/AbstractMap."<init>":()V
         * 4: aload_0
         * 5: ldc           #92                 // float 0.75f
         * 7: putfield      #81                 // Field loadFactor:F
         * 10: aload_0
         * 11: aload_1
         * 12: iconst_0
         * 13: invokevirtual #96                 // Method putMapEntries:(Ljava/util/Map;Z)V
         * 16: return
         *  */
        // </editor-fold>
    }

    final void putMapEntries(Map<? extends K, ? extends V> m, boolean evict) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokeinterface #100,  1          // InterfaceMethod java/util/Map.size:()I
         * 6: istore_3
         * 7: iload_3
         * 8: ifle          169
         * 11: aload_0
         * 12: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 15: ifnonnull     71
         * 18: iload_3
         * 19: i2d
         * 20: aload_0
         * 21: getfield      #81                 // Field loadFactor:F
         * 24: f2d
         * 25: ddiv
         * 26: invokestatic  #109                // Method java/lang/Math.ceil:(D)D
         * 29: dstore        4
         * 31: dload         4
         * 33: ldc2_w        #115                // double 1.073741824E9d
         * 36: dcmpg
         * 37: ifge          46
         * 40: dload         4
         * 42: d2i
         * 43: goto          48
         * 46: ldc           #42                 // int 1073741824
         * 48: istore        6
         * 50: iload         6
         * 52: aload_0
         * 53: getfield      #88                 // Field threshold:I
         * 56: if_icmple     68
         * 59: aload_0
         * 60: iload         6
         * 62: invokestatic  #85                 // Method tableSizeFor:(I)I
         * 65: putfield      #88                 // Field threshold:I
         * 68: goto          97
         * 71: iload_3
         * 72: aload_0
         * 73: getfield      #88                 // Field threshold:I
         * 76: if_icmple     97
         * 79: aload_0
         * 80: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 83: arraylength
         * 84: ldc           #42                 // int 1073741824
         * 86: if_icmpge     97
         * 89: aload_0
         * 90: invokevirtual #117                // Method resize:()[Ljava/util/HashMap$Node;
         * 93: pop
         * 94: goto          71
         * 97: aload_1
         * 98: invokeinterface #121,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
         * 103: invokeinterface #125,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
         * 108: astore        4
         * 110: aload         4
         * 112: invokeinterface #131,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
         * 117: ifeq          169
         * 120: aload         4
         * 122: invokeinterface #137,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
         * 127: checkcast     #141                // class java/util/Map$Entry
         * 130: astore        5
         * 132: aload         5
         * 134: invokeinterface #143,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
         * 139: astore        6
         * 141: aload         5
         * 143: invokeinterface #146,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
         * 148: astore        7
         * 150: aload_0
         * 151: aload         6
         * 153: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 156: aload         6
         * 158: aload         7
         * 160: iconst_0
         * 161: iload_2
         * 162: invokevirtual #152                // Method putVal:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/lang/Object;
         * 165: pop
         * 166: goto          110
         * 169: return
         *  */
        // </editor-fold>
    }

    public int size() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #156                // Field size:I
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    public boolean isEmpty() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #156                // Field size:I
         * 4: ifne          11
         * 7: iconst_1
         * 8: goto          12
         * 11: iconst_0
         * 12: ireturn
         *  */
        // </editor-fold>
    }

    public V get(Object key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #158                // Method getNode:(Ljava/lang/Object;)Ljava/util/HashMap$Node;
         * 5: dup
         * 6: astore_2
         * 7: ifnonnull     14
         * 10: aconst_null
         * 11: goto          18
         * 14: aload_2
         * 15: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 18: areturn
         *  */
        // </editor-fold>
    }

    final Node<K, V> getNode(Object key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 4: dup
         * 5: astore_2
         * 6: ifnull        148
         * 9: aload_2
         * 10: arraylength
         * 11: dup
         * 12: istore        5
         * 14: ifle          148
         * 17: aload_2
         * 18: iload         5
         * 20: iconst_1
         * 21: isub
         * 22: aload_1
         * 23: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 26: dup
         * 27: istore        6
         * 29: iand
         * 30: aaload
         * 31: dup
         * 32: astore_3
         * 33: ifnull        148
         * 36: aload_3
         * 37: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 40: iload         6
         * 42: if_icmpne     71
         * 45: aload_3
         * 46: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 49: dup
         * 50: astore        7
         * 52: aload_1
         * 53: if_acmpeq     69
         * 56: aload_1
         * 57: ifnull        71
         * 60: aload_1
         * 61: aload         7
         * 63: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 66: ifeq          71
         * 69: aload_3
         * 70: areturn
         * 71: aload_3
         * 72: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 75: dup
         * 76: astore        4
         * 78: ifnull        148
         * 81: aload_3
         * 82: instanceof    #180                // class java/util/HashMap$TreeNode
         * 85: ifeq          99
         * 88: aload_3
         * 89: checkcast     #180                // class java/util/HashMap$TreeNode
         * 92: iload         6
         * 94: aload_1
         * 95: invokevirtual #182                // Method java/util/HashMap$TreeNode.getTreeNode:(ILjava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 98: areturn
         * 99: aload         4
         * 101: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 104: iload         6
         * 106: if_icmpne     137
         * 109: aload         4
         * 111: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 114: dup
         * 115: astore        7
         * 117: aload_1
         * 118: if_acmpeq     134
         * 121: aload_1
         * 122: ifnull        137
         * 125: aload_1
         * 126: aload         7
         * 128: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 131: ifeq          137
         * 134: aload         4
         * 136: areturn
         * 137: aload         4
         * 139: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 142: dup
         * 143: astore        4
         * 145: ifnonnull     99
         * 148: aconst_null
         * 149: areturn
         *  */
        // </editor-fold>
    }

    public boolean containsKey(Object key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #158                // Method getNode:(Ljava/lang/Object;)Ljava/util/HashMap$Node;
         * 5: ifnull        12
         * 8: iconst_1
         * 9: goto          13
         * 12: iconst_0
         * 13: ireturn
         *  */
        // </editor-fold>
    }

    public V put(K key, V value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 5: aload_1
         * 6: aload_2
         * 7: iconst_0
         * 8: iconst_1
         * 9: invokevirtual #152                // Method putVal:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/lang/Object;
         * 12: areturn
         *  */
        // </editor-fold>
    }

    final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 4: dup
         * 5: astore        6
         * 7: ifnull        19
         * 10: aload         6
         * 12: arraylength
         * 13: dup
         * 14: istore        8
         * 16: ifne          29
         * 19: aload_0
         * 20: invokevirtual #117                // Method resize:()[Ljava/util/HashMap$Node;
         * 23: dup
         * 24: astore        6
         * 26: arraylength
         * 27: istore        8
         * 29: aload         6
         * 31: iload         8
         * 33: iconst_1
         * 34: isub
         * 35: iload_1
         * 36: iand
         * 37: dup
         * 38: istore        9
         * 40: aaload
         * 41: dup
         * 42: astore        7
         * 44: ifnonnull     63
         * 47: aload         6
         * 49: iload         9
         * 51: aload_0
         * 52: iload_1
         * 53: aload_2
         * 54: aload_3
         * 55: aconst_null
         * 56: invokevirtual #186                // Method newNode:(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)Ljava/util/HashMap$Node;
         * 59: aastore
         * 60: goto          259
         * 63: aload         7
         * 65: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 68: iload_1
         * 69: if_icmpne     104
         * 72: aload         7
         * 74: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 77: dup
         * 78: astore        11
         * 80: aload_2
         * 81: if_acmpeq     97
         * 84: aload_2
         * 85: ifnull        104
         * 88: aload_2
         * 89: aload         11
         * 91: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 94: ifeq          104
         * 97: aload         7
         * 99: astore        10
         * 101: goto          222
         * 104: aload         7
         * 106: instanceof    #180                // class java/util/HashMap$TreeNode
         * 109: ifeq          131
         * 112: aload         7
         * 114: checkcast     #180                // class java/util/HashMap$TreeNode
         * 117: aload_0
         * 118: aload         6
         * 120: iload_1
         * 121: aload_2
         * 122: aload_3
         * 123: invokevirtual #190                // Method java/util/HashMap$TreeNode.putTreeVal:(Ljava/util/HashMap;[Ljava/util/HashMap$Node;ILjava/lang/Object;Ljava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 126: astore        10
         * 128: goto          222
         * 131: iconst_0
         * 132: istore        12
         * 134: aload         7
         * 136: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 139: dup
         * 140: astore        10
         * 142: ifnonnull     175
         * 145: aload         7
         * 147: aload_0
         * 148: iload_1
         * 149: aload_2
         * 150: aload_3
         * 151: aconst_null
         * 152: invokevirtual #186                // Method newNode:(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)Ljava/util/HashMap$Node;
         * 155: putfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 158: iload         12
         * 160: bipush        7
         * 162: if_icmplt     222
         * 165: aload_0
         * 166: aload         6
         * 168: iload_1
         * 169: invokevirtual #194                // Method treeifyBin:([Ljava/util/HashMap$Node;I)V
         * 172: goto          222
         * 175: aload         10
         * 177: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 180: iload_1
         * 181: if_icmpne     212
         * 184: aload         10
         * 186: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 189: dup
         * 190: astore        11
         * 192: aload_2
         * 193: if_acmpeq     222
         * 196: aload_2
         * 197: ifnull        212
         * 200: aload_2
         * 201: aload         11
         * 203: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 206: ifeq          212
         * 209: goto          222
         * 212: aload         10
         * 214: astore        7
         * 216: iinc          12, 1
         * 219: goto          134
         * 222: aload         10
         * 224: ifnull        259
         * 227: aload         10
         * 229: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 232: astore        12
         * 234: iload         4
         * 236: ifeq          244
         * 239: aload         12
         * 241: ifnonnull     250
         * 244: aload         10
         * 246: aload_3
         * 247: putfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 250: aload_0
         * 251: aload         10
         * 253: invokevirtual #198                // Method afterNodeAccess:(Ljava/util/HashMap$Node;)V
         * 256: aload         12
         * 258: areturn
         * 259: aload_0
         * 260: dup
         * 261: getfield      #202                // Field modCount:I
         * 264: iconst_1
         * 265: iadd
         * 266: putfield      #202                // Field modCount:I
         * 269: aload_0
         * 270: dup
         * 271: getfield      #156                // Field size:I
         * 274: iconst_1
         * 275: iadd
         * 276: dup_x1
         * 277: putfield      #156                // Field size:I
         * 280: aload_0
         * 281: getfield      #88                 // Field threshold:I
         * 284: if_icmple     292
         * 287: aload_0
         * 288: invokevirtual #117                // Method resize:()[Ljava/util/HashMap$Node;
         * 291: pop
         * 292: aload_0
         * 293: iload         5
         * 295: invokevirtual #205                // Method afterNodeInsertion:(Z)V
         * 298: aconst_null
         * 299: areturn
         *  */
        // </editor-fold>
    }

    final Node<K, V>[] resize() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 4: astore_1
         * 5: aload_1
         * 6: ifnonnull     13
         * 9: iconst_0
         * 10: goto          15
         * 13: aload_1
         * 14: arraylength
         * 15: istore_2
         * 16: aload_0
         * 17: getfield      #88                 // Field threshold:I
         * 20: istore_3
         * 21: iconst_0
         * 22: istore        5
         * 24: iload_2
         * 25: ifle          67
         * 28: iload_2
         * 29: ldc           #42                 // int 1073741824
         * 31: if_icmplt     42
         * 34: aload_0
         * 35: ldc           #209                // int 2147483647
         * 37: putfield      #88                 // Field threshold:I
         * 40: aload_1
         * 41: areturn
         * 42: iload_2
         * 43: iconst_1
         * 44: ishl
         * 45: dup
         * 46: istore        4
         * 48: ldc           #42                 // int 1073741824
         * 50: if_icmpge     85
         * 53: iload_2
         * 54: bipush        16
         * 56: if_icmplt     85
         * 59: iload_3
         * 60: iconst_1
         * 61: ishl
         * 62: istore        5
         * 64: goto          85
         * 67: iload_3
         * 68: ifle          77
         * 71: iload_3
         * 72: istore        4
         * 74: goto          85
         * 77: bipush        16
         * 79: istore        4
         * 81: bipush        12
         * 83: istore        5
         * 85: iload         5
         * 87: ifne          125
         * 90: iload         4
         * 92: i2f
         * 93: aload_0
         * 94: getfield      #81                 // Field loadFactor:F
         * 97: fmul
         * 98: fstore        6
         * 100: iload         4
         * 102: ldc           #42                 // int 1073741824
         * 104: if_icmpge     121
         * 107: fload         6
         * 109: ldc           #210                // float 1.0737418E9f
         * 111: fcmpg
         * 112: ifge          121
         * 115: fload         6
         * 117: f2i
         * 118: goto          123
         * 121: ldc           #209                // int 2147483647
         * 123: istore        5
         * 125: aload_0
         * 126: iload         5
         * 128: putfield      #88                 // Field threshold:I
         * 131: iload         4
         * 133: anewarray     #163                // class java/util/HashMap$Node
         * 136: astore        6
         * 138: aload_0
         * 139: aload         6
         * 141: putfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 144: aload_1
         * 145: ifnull        353
         * 148: iconst_0
         * 149: istore        7
         * 151: iload         7
         * 153: iload_2
         * 154: if_icmpge     353
         * 157: aload_1
         * 158: iload         7
         * 160: aaload
         * 161: dup
         * 162: astore        8
         * 164: ifnull        347
         * 167: aload_1
         * 168: iload         7
         * 170: aconst_null
         * 171: aastore
         * 172: aload         8
         * 174: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 177: ifnonnull     198
         * 180: aload         6
         * 182: aload         8
         * 184: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 187: iload         4
         * 189: iconst_1
         * 190: isub
         * 191: iand
         * 192: aload         8
         * 194: aastore
         * 195: goto          347
         * 198: aload         8
         * 200: instanceof    #180                // class java/util/HashMap$TreeNode
         * 203: ifeq          223
         * 206: aload         8
         * 208: checkcast     #180                // class java/util/HashMap$TreeNode
         * 211: aload_0
         * 212: aload         6
         * 214: iload         7
         * 216: iload_2
         * 217: invokevirtual #211                // Method java/util/HashMap$TreeNode.split:(Ljava/util/HashMap;[Ljava/util/HashMap$Node;II)V
         * 220: goto          347
         * 223: aconst_null
         * 224: astore        9
         * 226: aconst_null
         * 227: astore        10
         * 229: aconst_null
         * 230: astore        11
         * 232: aconst_null
         * 233: astore        12
         * 235: aload         8
         * 237: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 240: astore        13
         * 242: aload         8
         * 244: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 247: iload_2
         * 248: iand
         * 249: ifne          278
         * 252: aload         10
         * 254: ifnonnull     264
         * 257: aload         8
         * 259: astore        9
         * 261: goto          271
         * 264: aload         10
         * 266: aload         8
         * 268: putfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 271: aload         8
         * 273: astore        10
         * 275: goto          301
         * 278: aload         12
         * 280: ifnonnull     290
         * 283: aload         8
         * 285: astore        11
         * 287: goto          297
         * 290: aload         12
         * 292: aload         8
         * 294: putfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 297: aload         8
         * 299: astore        12
         * 301: aload         13
         * 303: dup
         * 304: astore        8
         * 306: ifnonnull     235
         * 309: aload         10
         * 311: ifnull        327
         * 314: aload         10
         * 316: aconst_null
         * 317: putfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 320: aload         6
         * 322: iload         7
         * 324: aload         9
         * 326: aastore
         * 327: aload         12
         * 329: ifnull        347
         * 332: aload         12
         * 334: aconst_null
         * 335: putfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 338: aload         6
         * 340: iload         7
         * 342: iload_2
         * 343: iadd
         * 344: aload         11
         * 346: aastore
         * 347: iinc          7, 1
         * 350: goto          151
         * 353: aload         6
         * 355: areturn
         *  */
        // </editor-fold>
    }

    final void treeifyBin(Node<K, V>[] tab, int hash) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnull        13
         * 4: aload_1
         * 5: arraylength
         * 6: dup
         * 7: istore_3
         * 8: bipush        64
         * 10: if_icmpge     21
         * 13: aload_0
         * 14: invokevirtual #117                // Method resize:()[Ljava/util/HashMap$Node;
         * 17: pop
         * 18: goto          109
         * 21: aload_1
         * 22: iload_3
         * 23: iconst_1
         * 24: isub
         * 25: iload_2
         * 26: iand
         * 27: dup
         * 28: istore        4
         * 30: aaload
         * 31: dup
         * 32: astore        5
         * 34: ifnull        109
         * 37: aconst_null
         * 38: astore        6
         * 40: aconst_null
         * 41: astore        7
         * 43: aload_0
         * 44: aload         5
         * 46: aconst_null
         * 47: invokevirtual #215                // Method replacementTreeNode:(Ljava/util/HashMap$Node;Ljava/util/HashMap$Node;)Ljava/util/HashMap$TreeNode;
         * 50: astore        8
         * 52: aload         7
         * 54: ifnonnull     64
         * 57: aload         8
         * 59: astore        6
         * 61: goto          78
         * 64: aload         8
         * 66: aload         7
         * 68: putfield      #219                // Field java/util/HashMap$TreeNode.prev:Ljava/util/HashMap$TreeNode;
         * 71: aload         7
         * 73: aload         8
         * 75: putfield      #223                // Field java/util/HashMap$TreeNode.next:Ljava/util/HashMap$Node;
         * 78: aload         8
         * 80: astore        7
         * 82: aload         5
         * 84: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 87: dup
         * 88: astore        5
         * 90: ifnonnull     43
         * 93: aload_1
         * 94: iload         4
         * 96: aload         6
         * 98: dup_x2
         * 99: aastore
         * 100: ifnull        109
         * 103: aload         6
         * 105: aload_1
         * 106: invokevirtual #224                // Method java/util/HashMap$TreeNode.treeify:([Ljava/util/HashMap$Node;)V
         * 109: return
         *  */
        // </editor-fold>
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_1
         * 3: invokevirtual #96                 // Method putMapEntries:(Ljava/util/Map;Z)V
         * 6: return
         *  */
        // </editor-fold>
    }

    public V remove(Object key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 5: aload_1
         * 6: aconst_null
         * 7: iconst_0
         * 8: iconst_1
         * 9: invokevirtual #228                // Method removeNode:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/util/HashMap$Node;
         * 12: dup
         * 13: astore_2
         * 14: ifnonnull     21
         * 17: aconst_null
         * 18: goto          25
         * 21: aload_2
         * 22: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 25: areturn
         *  */
        // </editor-fold>
    }

    final Node<K, V> removeNode(int hash, Object key, Object value, boolean matchValue, boolean movable) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 4: dup
         * 5: astore        6
         * 7: ifnull        289
         * 10: aload         6
         * 12: arraylength
         * 13: dup
         * 14: istore        8
         * 16: ifle          289
         * 19: aload         6
         * 21: iload         8
         * 23: iconst_1
         * 24: isub
         * 25: iload_1
         * 26: iand
         * 27: dup
         * 28: istore        9
         * 30: aaload
         * 31: dup
         * 32: astore        7
         * 34: ifnull        289
         * 37: aconst_null
         * 38: astore        10
         * 40: aload         7
         * 42: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 45: iload_1
         * 46: if_icmpne     81
         * 49: aload         7
         * 51: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 54: dup
         * 55: astore        12
         * 57: aload_2
         * 58: if_acmpeq     74
         * 61: aload_2
         * 62: ifnull        81
         * 65: aload_2
         * 66: aload         12
         * 68: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 71: ifeq          81
         * 74: aload         7
         * 76: astore        10
         * 78: goto          171
         * 81: aload         7
         * 83: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 86: dup
         * 87: astore        11
         * 89: ifnull        171
         * 92: aload         7
         * 94: instanceof    #180                // class java/util/HashMap$TreeNode
         * 97: ifeq          115
         * 100: aload         7
         * 102: checkcast     #180                // class java/util/HashMap$TreeNode
         * 105: iload_1
         * 106: aload_2
         * 107: invokevirtual #182                // Method java/util/HashMap$TreeNode.getTreeNode:(ILjava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 110: astore        10
         * 112: goto          171
         * 115: aload         11
         * 117: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 120: iload_1
         * 121: if_icmpne     156
         * 124: aload         11
         * 126: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 129: dup
         * 130: astore        12
         * 132: aload_2
         * 133: if_acmpeq     149
         * 136: aload_2
         * 137: ifnull        156
         * 140: aload_2
         * 141: aload         12
         * 143: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 146: ifeq          156
         * 149: aload         11
         * 151: astore        10
         * 153: goto          171
         * 156: aload         11
         * 158: astore        7
         * 160: aload         11
         * 162: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 165: dup
         * 166: astore        11
         * 168: ifnonnull     115
         * 171: aload         10
         * 173: ifnull        289
         * 176: iload         4
         * 178: ifeq          206
         * 181: aload         10
         * 183: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 186: dup
         * 187: astore        13
         * 189: aload_3
         * 190: if_acmpeq     206
         * 193: aload_3
         * 194: ifnull        289
         * 197: aload_3
         * 198: aload         13
         * 200: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 203: ifeq          289
         * 206: aload         10
         * 208: instanceof    #180                // class java/util/HashMap$TreeNode
         * 211: ifeq          230
         * 214: aload         10
         * 216: checkcast     #180                // class java/util/HashMap$TreeNode
         * 219: aload_0
         * 220: aload         6
         * 222: iload         5
         * 224: invokevirtual #232                // Method java/util/HashMap$TreeNode.removeTreeNode:(Ljava/util/HashMap;[Ljava/util/HashMap$Node;Z)V
         * 227: goto          260
         * 230: aload         10
         * 232: aload         7
         * 234: if_acmpne     250
         * 237: aload         6
         * 239: iload         9
         * 241: aload         10
         * 243: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 246: aastore
         * 247: goto          260
         * 250: aload         7
         * 252: aload         10
         * 254: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 257: putfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 260: aload_0
         * 261: dup
         * 262: getfield      #202                // Field modCount:I
         * 265: iconst_1
         * 266: iadd
         * 267: putfield      #202                // Field modCount:I
         * 270: aload_0
         * 271: dup
         * 272: getfield      #156                // Field size:I
         * 275: iconst_1
         * 276: isub
         * 277: putfield      #156                // Field size:I
         * 280: aload_0
         * 281: aload         10
         * 283: invokevirtual #236                // Method afterNodeRemoval:(Ljava/util/HashMap$Node;)V
         * 286: aload         10
         * 288: areturn
         * 289: aconst_null
         * 290: areturn
         *  */
        // </editor-fold>
    }

    public void clear() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: getfield      #202                // Field modCount:I
         * 5: iconst_1
         * 6: iadd
         * 7: putfield      #202                // Field modCount:I
         * 10: aload_0
         * 11: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 14: dup
         * 15: astore_1
         * 16: ifnull        49
         * 19: aload_0
         * 20: getfield      #156                // Field size:I
         * 23: ifle          49
         * 26: aload_0
         * 27: iconst_0
         * 28: putfield      #156                // Field size:I
         * 31: iconst_0
         * 32: istore_2
         * 33: iload_2
         * 34: aload_1
         * 35: arraylength
         * 36: if_icmpge     49
         * 39: aload_1
         * 40: iload_2
         * 41: aconst_null
         * 42: aastore
         * 43: iinc          2, 1
         * 46: goto          33
         * 49: return
         *  */
        // </editor-fold>
    }

    public boolean containsValue(Object value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 4: dup
         * 5: astore_2
         * 6: ifnull        87
         * 9: aload_0
         * 10: getfield      #156                // Field size:I
         * 13: ifle          87
         * 16: aload_2
         * 17: astore        4
         * 19: aload         4
         * 21: arraylength
         * 22: istore        5
         * 24: iconst_0
         * 25: istore        6
         * 27: iload         6
         * 29: iload         5
         * 31: if_icmpge     87
         * 34: aload         4
         * 36: iload         6
         * 38: aaload
         * 39: astore        7
         * 41: aload         7
         * 43: ifnull        81
         * 46: aload         7
         * 48: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 51: dup
         * 52: astore_3
         * 53: aload_1
         * 54: if_acmpeq     69
         * 57: aload_1
         * 58: ifnull        71
         * 61: aload_1
         * 62: aload_3
         * 63: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 66: ifeq          71
         * 69: iconst_1
         * 70: ireturn
         * 71: aload         7
         * 73: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 76: astore        7
         * 78: goto          41
         * 81: iinc          6, 1
         * 84: goto          27
         * 87: iconst_0
         * 88: ireturn
         *  */
        // </editor-fold>
    }

    public Set<K> keySet() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #239                // Field keySet:Ljava/util/Set;
         * 4: astore_1
         * 5: aload_1
         * 6: ifnonnull     23
         * 9: new           #243                // class java/util/HashMap$KeySet
         * 12: dup
         * 13: aload_0
         * 14: invokespecial #245                // Method java/util/HashMap$KeySet."<init>":(Ljava/util/HashMap;)V
         * 17: astore_1
         * 18: aload_0
         * 19: aload_1
         * 20: putfield      #239                // Field keySet:Ljava/util/Set;
         * 23: aload_1
         * 24: areturn
         *  */
        // </editor-fold>
    }

    final <T extends Object> T[] prepareArray(T[] a) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #156                // Field size:I
         * 4: istore_2
         * 5: aload_1
         * 6: arraylength
         * 7: iload_2
         * 8: if_icmpge     26
         * 11: aload_1
         * 12: invokevirtual #9                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 15: invokevirtual #248                // Method java/lang/Class.getComponentType:()Ljava/lang/Class;
         * 18: iload_2
         * 19: invokestatic  #251                // Method java/lang/reflect/Array.newInstance:(Ljava/lang/Class;I)Ljava/lang/Object;
         * 22: checkcast     #257                // class "[Ljava/lang/Object;"
         * 25: areturn
         * 26: aload_1
         * 27: arraylength
         * 28: iload_2
         * 29: if_icmple     36
         * 32: aload_1
         * 33: iload_2
         * 34: aconst_null
         * 35: aastore
         * 36: aload_1
         * 37: areturn
         *  */
        // </editor-fold>
    }

    <T extends Object> T[] keysToArray(T[] a) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: astore_2
         * 2: iconst_0
         * 3: istore        4
         * 5: aload_0
         * 6: getfield      #156                // Field size:I
         * 9: ifle          79
         * 12: aload_0
         * 13: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 16: dup
         * 17: astore_3
         * 18: ifnull        79
         * 21: aload_3
         * 22: astore        5
         * 24: aload         5
         * 26: arraylength
         * 27: istore        6
         * 29: iconst_0
         * 30: istore        7
         * 32: iload         7
         * 34: iload         6
         * 36: if_icmpge     79
         * 39: aload         5
         * 41: iload         7
         * 43: aaload
         * 44: astore        8
         * 46: aload         8
         * 48: ifnull        73
         * 51: aload_2
         * 52: iload         4
         * 54: iinc          4, 1
         * 57: aload         8
         * 59: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 62: aastore
         * 63: aload         8
         * 65: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 68: astore        8
         * 70: goto          46
         * 73: iinc          7, 1
         * 76: goto          32
         * 79: aload_1
         * 80: areturn
         *  */
        // </editor-fold>
    }

    <T extends Object> T[] valuesToArray(T[] a) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: astore_2
         * 2: iconst_0
         * 3: istore        4
         * 5: aload_0
         * 6: getfield      #156                // Field size:I
         * 9: ifle          79
         * 12: aload_0
         * 13: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 16: dup
         * 17: astore_3
         * 18: ifnull        79
         * 21: aload_3
         * 22: astore        5
         * 24: aload         5
         * 26: arraylength
         * 27: istore        6
         * 29: iconst_0
         * 30: istore        7
         * 32: iload         7
         * 34: iload         6
         * 36: if_icmpge     79
         * 39: aload         5
         * 41: iload         7
         * 43: aaload
         * 44: astore        8
         * 46: aload         8
         * 48: ifnull        73
         * 51: aload_2
         * 52: iload         4
         * 54: iinc          4, 1
         * 57: aload         8
         * 59: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 62: aastore
         * 63: aload         8
         * 65: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 68: astore        8
         * 70: goto          46
         * 73: iinc          7, 1
         * 76: goto          32
         * 79: aload_1
         * 80: areturn
         *  */
        // </editor-fold>
    }

    public Collection<V> values() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #259                // Field values:Ljava/util/Collection;
         * 4: astore_1
         * 5: aload_1
         * 6: ifnonnull     23
         * 9: new           #263                // class java/util/HashMap$Values
         * 12: dup
         * 13: aload_0
         * 14: invokespecial #265                // Method java/util/HashMap$Values."<init>":(Ljava/util/HashMap;)V
         * 17: astore_1
         * 18: aload_0
         * 19: aload_1
         * 20: putfield      #259                // Field values:Ljava/util/Collection;
         * 23: aload_1
         * 24: areturn
         *  */
        // </editor-fold>
    }

    public Set<Entry<K, V>> entrySet() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #266                // Field entrySet:Ljava/util/Set;
         * 4: dup
         * 5: astore_1
         * 6: ifnonnull     25
         * 9: aload_0
         * 10: new           #268                // class java/util/HashMap$EntrySet
         * 13: dup
         * 14: aload_0
         * 15: invokespecial #270                // Method java/util/HashMap$EntrySet."<init>":(Ljava/util/HashMap;)V
         * 18: dup_x1
         * 19: putfield      #266                // Field entrySet:Ljava/util/Set;
         * 22: goto          26
         * 25: aload_1
         * 26: areturn
         *  */
        // </editor-fold>
    }

    public V getOrDefault(Object key, V defaultValue) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #158                // Method getNode:(Ljava/lang/Object;)Ljava/util/HashMap$Node;
         * 5: dup
         * 6: astore_3
         * 7: ifnonnull     14
         * 10: aload_2
         * 11: goto          18
         * 14: aload_3
         * 15: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 18: areturn
         *  */
        // </editor-fold>
    }

    public V putIfAbsent(K key, V value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 5: aload_1
         * 6: aload_2
         * 7: iconst_1
         * 8: iconst_1
         * 9: invokevirtual #152                // Method putVal:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/lang/Object;
         * 12: areturn
         *  */
        // </editor-fold>
    }

    public boolean remove(Object key, Object value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 5: aload_1
         * 6: aload_2
         * 7: iconst_1
         * 8: iconst_1
         * 9: invokevirtual #228                // Method removeNode:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/util/HashMap$Node;
         * 12: ifnull        19
         * 15: iconst_1
         * 16: goto          20
         * 19: iconst_0
         * 20: ireturn
         *  */
        // </editor-fold>
    }

    public boolean replace(K key, V oldValue, V newValue) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #158                // Method getNode:(Ljava/lang/Object;)Ljava/util/HashMap$Node;
         * 5: dup
         * 6: astore        4
         * 8: ifnull        51
         * 11: aload         4
         * 13: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 16: dup
         * 17: astore        5
         * 19: aload_2
         * 20: if_acmpeq     37
         * 23: aload         5
         * 25: ifnull        51
         * 28: aload         5
         * 30: aload_2
         * 31: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 34: ifeq          51
         * 37: aload         4
         * 39: aload_3
         * 40: putfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 43: aload_0
         * 44: aload         4
         * 46: invokevirtual #198                // Method afterNodeAccess:(Ljava/util/HashMap$Node;)V
         * 49: iconst_1
         * 50: ireturn
         * 51: iconst_0
         * 52: ireturn
         *  */
        // </editor-fold>
    }

    public V replace(K key, V value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual #158                // Method getNode:(Ljava/lang/Object;)Ljava/util/HashMap$Node;
         * 5: dup
         * 6: astore_3
         * 7: ifnull        29
         * 10: aload_3
         * 11: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 14: astore        4
         * 16: aload_3
         * 17: aload_2
         * 18: putfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 21: aload_0
         * 22: aload_3
         * 23: invokevirtual #198                // Method afterNodeAccess:(Ljava/util/HashMap$Node;)V
         * 26: aload         4
         * 28: areturn
         * 29: aconst_null
         * 30: areturn
         *  */
        // </editor-fold>
    }

    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_2
         * 1: ifnonnull     12
         * 4: new           #271                // class java/lang/NullPointerException
         * 7: dup
         * 8: invokespecial #273                // Method java/lang/NullPointerException."<init>":()V
         * 11: athrow
         * 12: aload_1
         * 13: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 16: istore_3
         * 17: iconst_0
         * 18: istore        8
         * 20: aconst_null
         * 21: astore        9
         * 23: aconst_null
         * 24: astore        10
         * 26: aload_0
         * 27: getfield      #156                // Field size:I
         * 30: aload_0
         * 31: getfield      #88                 // Field threshold:I
         * 34: if_icmpgt     56
         * 37: aload_0
         * 38: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 41: dup
         * 42: astore        4
         * 44: ifnull        56
         * 47: aload         4
         * 49: arraylength
         * 50: dup
         * 51: istore        6
         * 53: ifne          66
         * 56: aload_0
         * 57: invokevirtual #117                // Method resize:()[Ljava/util/HashMap$Node;
         * 60: dup
         * 61: astore        4
         * 63: arraylength
         * 64: istore        6
         * 66: aload         4
         * 68: iload         6
         * 70: iconst_1
         * 71: isub
         * 72: iload_3
         * 73: iand
         * 74: dup
         * 75: istore        7
         * 77: aaload
         * 78: dup
         * 79: astore        5
         * 81: ifnull        194
         * 84: aload         5
         * 86: instanceof    #180                // class java/util/HashMap$TreeNode
         * 89: ifeq          110
         * 92: aload         5
         * 94: checkcast     #180                // class java/util/HashMap$TreeNode
         * 97: dup
         * 98: astore        9
         * 100: iload_3
         * 101: aload_1
         * 102: invokevirtual #182                // Method java/util/HashMap$TreeNode.getTreeNode:(ILjava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 105: astore        10
         * 107: goto          169
         * 110: aload         5
         * 112: astore        11
         * 114: aload         11
         * 116: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 119: iload_3
         * 120: if_icmpne     155
         * 123: aload         11
         * 125: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 128: dup
         * 129: astore        12
         * 131: aload_1
         * 132: if_acmpeq     148
         * 135: aload_1
         * 136: ifnull        155
         * 139: aload_1
         * 140: aload         12
         * 142: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 145: ifeq          155
         * 148: aload         11
         * 150: astore        10
         * 152: goto          169
         * 155: iinc          8, 1
         * 158: aload         11
         * 160: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 163: dup
         * 164: astore        11
         * 166: ifnonnull     114
         * 169: aload         10
         * 171: ifnull        194
         * 174: aload         10
         * 176: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 179: dup
         * 180: astore        11
         * 182: ifnull        194
         * 185: aload_0
         * 186: aload         10
         * 188: invokevirtual #198                // Method afterNodeAccess:(Ljava/util/HashMap$Node;)V
         * 191: aload         11
         * 193: areturn
         * 194: aload_0
         * 195: getfield      #202                // Field modCount:I
         * 198: istore        11
         * 200: aload_2
         * 201: aload_1
         * 202: invokeinterface #274,  2          // InterfaceMethod java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;
         * 207: astore        12
         * 209: iload         11
         * 211: aload_0
         * 212: getfield      #202                // Field modCount:I
         * 215: if_icmpeq     226
         * 218: new           #280                // class java/util/ConcurrentModificationException
         * 221: dup
         * 222: invokespecial #282                // Method java/util/ConcurrentModificationException."<init>":()V
         * 225: athrow
         * 226: aload         12
         * 228: ifnonnull     233
         * 231: aconst_null
         * 232: areturn
         * 233: aload         10
         * 235: ifnull        254
         * 238: aload         10
         * 240: aload         12
         * 242: putfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 245: aload_0
         * 246: aload         10
         * 248: invokevirtual #198                // Method afterNodeAccess:(Ljava/util/HashMap$Node;)V
         * 251: aload         12
         * 253: areturn
         * 254: aload         9
         * 256: ifnull        275
         * 259: aload         9
         * 261: aload_0
         * 262: aload         4
         * 264: iload_3
         * 265: aload_1
         * 266: aload         12
         * 268: invokevirtual #190                // Method java/util/HashMap$TreeNode.putTreeVal:(Ljava/util/HashMap;[Ljava/util/HashMap$Node;ILjava/lang/Object;Ljava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 271: pop
         * 272: goto          304
         * 275: aload         4
         * 277: iload         7
         * 279: aload_0
         * 280: iload_3
         * 281: aload_1
         * 282: aload         12
         * 284: aload         5
         * 286: invokevirtual #186                // Method newNode:(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)Ljava/util/HashMap$Node;
         * 289: aastore
         * 290: iload         8
         * 292: bipush        7
         * 294: if_icmplt     304
         * 297: aload_0
         * 298: aload         4
         * 300: iload_3
         * 301: invokevirtual #194                // Method treeifyBin:([Ljava/util/HashMap$Node;I)V
         * 304: aload_0
         * 305: iload         11
         * 307: iconst_1
         * 308: iadd
         * 309: putfield      #202                // Field modCount:I
         * 312: aload_0
         * 313: dup
         * 314: getfield      #156                // Field size:I
         * 317: iconst_1
         * 318: iadd
         * 319: putfield      #156                // Field size:I
         * 322: aload_0
         * 323: iconst_1
         * 324: invokevirtual #205                // Method afterNodeInsertion:(Z)V
         * 327: aload         12
         * 329: areturn
         *  */
        // </editor-fold>
    }

    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_2
         * 1: ifnonnull     12
         * 4: new           #271                // class java/lang/NullPointerException
         * 7: dup
         * 8: invokespecial #273                // Method java/lang/NullPointerException."<init>":()V
         * 11: athrow
         * 12: aload_0
         * 13: aload_1
         * 14: invokevirtual #158                // Method getNode:(Ljava/lang/Object;)Ljava/util/HashMap$Node;
         * 17: dup
         * 18: astore_3
         * 19: ifnull        102
         * 22: aload_3
         * 23: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 26: dup
         * 27: astore        4
         * 29: ifnull        102
         * 32: aload_0
         * 33: getfield      #202                // Field modCount:I
         * 36: istore        5
         * 38: aload_2
         * 39: aload_1
         * 40: aload         4
         * 42: invokeinterface #283,  3          // InterfaceMethod java/util/function/BiFunction.apply:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 47: astore        6
         * 49: iload         5
         * 51: aload_0
         * 52: getfield      #202                // Field modCount:I
         * 55: if_icmpeq     66
         * 58: new           #280                // class java/util/ConcurrentModificationException
         * 61: dup
         * 62: invokespecial #282                // Method java/util/ConcurrentModificationException."<init>":()V
         * 65: athrow
         * 66: aload         6
         * 68: ifnull        85
         * 71: aload_3
         * 72: aload         6
         * 74: putfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 77: aload_0
         * 78: aload_3
         * 79: invokevirtual #198                // Method afterNodeAccess:(Ljava/util/HashMap$Node;)V
         * 82: aload         6
         * 84: areturn
         * 85: aload_1
         * 86: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 89: istore        7
         * 91: aload_0
         * 92: iload         7
         * 94: aload_1
         * 95: aconst_null
         * 96: iconst_0
         * 97: iconst_1
         * 98: invokevirtual #228                // Method removeNode:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/util/HashMap$Node;
         * 101: pop
         * 102: aconst_null
         * 103: areturn
         *  */
        // </editor-fold>
    }

    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_2
         * 1: ifnonnull     12
         * 4: new           #271                // class java/lang/NullPointerException
         * 7: dup
         * 8: invokespecial #273                // Method java/lang/NullPointerException."<init>":()V
         * 11: athrow
         * 12: aload_1
         * 13: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 16: istore_3
         * 17: iconst_0
         * 18: istore        8
         * 20: aconst_null
         * 21: astore        9
         * 23: aconst_null
         * 24: astore        10
         * 26: aload_0
         * 27: getfield      #156                // Field size:I
         * 30: aload_0
         * 31: getfield      #88                 // Field threshold:I
         * 34: if_icmpgt     56
         * 37: aload_0
         * 38: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 41: dup
         * 42: astore        4
         * 44: ifnull        56
         * 47: aload         4
         * 49: arraylength
         * 50: dup
         * 51: istore        6
         * 53: ifne          66
         * 56: aload_0
         * 57: invokevirtual #117                // Method resize:()[Ljava/util/HashMap$Node;
         * 60: dup
         * 61: astore        4
         * 63: arraylength
         * 64: istore        6
         * 66: aload         4
         * 68: iload         6
         * 70: iconst_1
         * 71: isub
         * 72: iload_3
         * 73: iand
         * 74: dup
         * 75: istore        7
         * 77: aaload
         * 78: dup
         * 79: astore        5
         * 81: ifnull        169
         * 84: aload         5
         * 86: instanceof    #180                // class java/util/HashMap$TreeNode
         * 89: ifeq          110
         * 92: aload         5
         * 94: checkcast     #180                // class java/util/HashMap$TreeNode
         * 97: dup
         * 98: astore        9
         * 100: iload_3
         * 101: aload_1
         * 102: invokevirtual #182                // Method java/util/HashMap$TreeNode.getTreeNode:(ILjava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 105: astore        10
         * 107: goto          169
         * 110: aload         5
         * 112: astore        11
         * 114: aload         11
         * 116: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 119: iload_3
         * 120: if_icmpne     155
         * 123: aload         11
         * 125: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 128: dup
         * 129: astore        12
         * 131: aload_1
         * 132: if_acmpeq     148
         * 135: aload_1
         * 136: ifnull        155
         * 139: aload_1
         * 140: aload         12
         * 142: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 145: ifeq          155
         * 148: aload         11
         * 150: astore        10
         * 152: goto          169
         * 155: iinc          8, 1
         * 158: aload         11
         * 160: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 163: dup
         * 164: astore        11
         * 166: ifnonnull     114
         * 169: aload         10
         * 171: ifnonnull     178
         * 174: aconst_null
         * 175: goto          183
         * 178: aload         10
         * 180: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 183: astore        11
         * 185: aload_0
         * 186: getfield      #202                // Field modCount:I
         * 189: istore        12
         * 191: aload_2
         * 192: aload_1
         * 193: aload         11
         * 195: invokeinterface #283,  3          // InterfaceMethod java/util/function/BiFunction.apply:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 200: astore        13
         * 202: iload         12
         * 204: aload_0
         * 205: getfield      #202                // Field modCount:I
         * 208: if_icmpeq     219
         * 211: new           #280                // class java/util/ConcurrentModificationException
         * 214: dup
         * 215: invokespecial #282                // Method java/util/ConcurrentModificationException."<init>":()V
         * 218: athrow
         * 219: aload         10
         * 221: ifnull        258
         * 224: aload         13
         * 226: ifnull        245
         * 229: aload         10
         * 231: aload         13
         * 233: putfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 236: aload_0
         * 237: aload         10
         * 239: invokevirtual #198                // Method afterNodeAccess:(Ljava/util/HashMap$Node;)V
         * 242: goto          336
         * 245: aload_0
         * 246: iload_3
         * 247: aload_1
         * 248: aconst_null
         * 249: iconst_0
         * 250: iconst_1
         * 251: invokevirtual #228                // Method removeNode:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/util/HashMap$Node;
         * 254: pop
         * 255: goto          336
         * 258: aload         13
         * 260: ifnull        336
         * 263: aload         9
         * 265: ifnull        284
         * 268: aload         9
         * 270: aload_0
         * 271: aload         4
         * 273: iload_3
         * 274: aload_1
         * 275: aload         13
         * 277: invokevirtual #190                // Method java/util/HashMap$TreeNode.putTreeVal:(Ljava/util/HashMap;[Ljava/util/HashMap$Node;ILjava/lang/Object;Ljava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 280: pop
         * 281: goto          313
         * 284: aload         4
         * 286: iload         7
         * 288: aload_0
         * 289: iload_3
         * 290: aload_1
         * 291: aload         13
         * 293: aload         5
         * 295: invokevirtual #186                // Method newNode:(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)Ljava/util/HashMap$Node;
         * 298: aastore
         * 299: iload         8
         * 301: bipush        7
         * 303: if_icmplt     313
         * 306: aload_0
         * 307: aload         4
         * 309: iload_3
         * 310: invokevirtual #194                // Method treeifyBin:([Ljava/util/HashMap$Node;I)V
         * 313: aload_0
         * 314: iload         12
         * 316: iconst_1
         * 317: iadd
         * 318: putfield      #202                // Field modCount:I
         * 321: aload_0
         * 322: dup
         * 323: getfield      #156                // Field size:I
         * 326: iconst_1
         * 327: iadd
         * 328: putfield      #156                // Field size:I
         * 331: aload_0
         * 332: iconst_1
         * 333: invokevirtual #205                // Method afterNodeInsertion:(Z)V
         * 336: aload         13
         * 338: areturn
         *  */
        // </editor-fold>
    }

    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_2
         * 1: ifnull        8
         * 4: aload_3
         * 5: ifnonnull     16
         * 8: new           #271                // class java/lang/NullPointerException
         * 11: dup
         * 12: invokespecial #273                // Method java/lang/NullPointerException."<init>":()V
         * 15: athrow
         * 16: aload_1
         * 17: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 20: istore        4
         * 22: iconst_0
         * 23: istore        9
         * 25: aconst_null
         * 26: astore        10
         * 28: aconst_null
         * 29: astore        11
         * 31: aload_0
         * 32: getfield      #156                // Field size:I
         * 35: aload_0
         * 36: getfield      #88                 // Field threshold:I
         * 39: if_icmpgt     61
         * 42: aload_0
         * 43: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 46: dup
         * 47: astore        5
         * 49: ifnull        61
         * 52: aload         5
         * 54: arraylength
         * 55: dup
         * 56: istore        7
         * 58: ifne          71
         * 61: aload_0
         * 62: invokevirtual #117                // Method resize:()[Ljava/util/HashMap$Node;
         * 65: dup
         * 66: astore        5
         * 68: arraylength
         * 69: istore        7
         * 71: aload         5
         * 73: iload         7
         * 75: iconst_1
         * 76: isub
         * 77: iload         4
         * 79: iand
         * 80: dup
         * 81: istore        8
         * 83: aaload
         * 84: dup
         * 85: astore        6
         * 87: ifnull        177
         * 90: aload         6
         * 92: instanceof    #180                // class java/util/HashMap$TreeNode
         * 95: ifeq          117
         * 98: aload         6
         * 100: checkcast     #180                // class java/util/HashMap$TreeNode
         * 103: dup
         * 104: astore        10
         * 106: iload         4
         * 108: aload_1
         * 109: invokevirtual #182                // Method java/util/HashMap$TreeNode.getTreeNode:(ILjava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 112: astore        11
         * 114: goto          177
         * 117: aload         6
         * 119: astore        12
         * 121: aload         12
         * 123: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 126: iload         4
         * 128: if_icmpne     163
         * 131: aload         12
         * 133: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 136: dup
         * 137: astore        13
         * 139: aload_1
         * 140: if_acmpeq     156
         * 143: aload_1
         * 144: ifnull        163
         * 147: aload_1
         * 148: aload         13
         * 150: invokevirtual #173                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 153: ifeq          163
         * 156: aload         12
         * 158: astore        11
         * 160: goto          177
         * 163: iinc          9, 1
         * 166: aload         12
         * 168: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 171: dup
         * 172: astore        12
         * 174: ifnonnull     121
         * 177: aload         11
         * 179: ifnull        268
         * 182: aload         11
         * 184: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 187: ifnull        230
         * 190: aload_0
         * 191: getfield      #202                // Field modCount:I
         * 194: istore        13
         * 196: aload_3
         * 197: aload         11
         * 199: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 202: aload_2
         * 203: invokeinterface #283,  3          // InterfaceMethod java/util/function/BiFunction.apply:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 208: astore        12
         * 210: iload         13
         * 212: aload_0
         * 213: getfield      #202                // Field modCount:I
         * 216: if_icmpeq     227
         * 219: new           #280                // class java/util/ConcurrentModificationException
         * 222: dup
         * 223: invokespecial #282                // Method java/util/ConcurrentModificationException."<init>":()V
         * 226: athrow
         * 227: goto          233
         * 230: aload_2
         * 231: astore        12
         * 233: aload         12
         * 235: ifnull        254
         * 238: aload         11
         * 240: aload         12
         * 242: putfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 245: aload_0
         * 246: aload         11
         * 248: invokevirtual #198                // Method afterNodeAccess:(Ljava/util/HashMap$Node;)V
         * 251: goto          265
         * 254: aload_0
         * 255: iload         4
         * 257: aload_1
         * 258: aconst_null
         * 259: iconst_0
         * 260: iconst_1
         * 261: invokevirtual #228                // Method removeNode:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/util/HashMap$Node;
         * 264: pop
         * 265: aload         12
         * 267: areturn
         * 268: aload         10
         * 270: ifnull        289
         * 273: aload         10
         * 275: aload_0
         * 276: aload         5
         * 278: iload         4
         * 280: aload_1
         * 281: aload_2
         * 282: invokevirtual #190                // Method java/util/HashMap$TreeNode.putTreeVal:(Ljava/util/HashMap;[Ljava/util/HashMap$Node;ILjava/lang/Object;Ljava/lang/Object;)Ljava/util/HashMap$TreeNode;
         * 285: pop
         * 286: goto          319
         * 289: aload         5
         * 291: iload         8
         * 293: aload_0
         * 294: iload         4
         * 296: aload_1
         * 297: aload_2
         * 298: aload         6
         * 300: invokevirtual #186                // Method newNode:(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)Ljava/util/HashMap$Node;
         * 303: aastore
         * 304: iload         9
         * 306: bipush        7
         * 308: if_icmplt     319
         * 311: aload_0
         * 312: aload         5
         * 314: iload         4
         * 316: invokevirtual #194                // Method treeifyBin:([Ljava/util/HashMap$Node;I)V
         * 319: aload_0
         * 320: dup
         * 321: getfield      #202                // Field modCount:I
         * 324: iconst_1
         * 325: iadd
         * 326: putfield      #202                // Field modCount:I
         * 329: aload_0
         * 330: dup
         * 331: getfield      #156                // Field size:I
         * 334: iconst_1
         * 335: iadd
         * 336: putfield      #156                // Field size:I
         * 339: aload_0
         * 340: iconst_1
         * 341: invokevirtual #205                // Method afterNodeInsertion:(Z)V
         * 344: aload_2
         * 345: areturn
         *  */
        // </editor-fold>
    }

    public void forEach(BiConsumer<? super K, ? super V> action) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnonnull     12
         * 4: new           #271                // class java/lang/NullPointerException
         * 7: dup
         * 8: invokespecial #273                // Method java/lang/NullPointerException."<init>":()V
         * 11: athrow
         * 12: aload_0
         * 13: getfield      #156                // Field size:I
         * 16: ifle          111
         * 19: aload_0
         * 20: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 23: dup
         * 24: astore_2
         * 25: ifnull        111
         * 28: aload_0
         * 29: getfield      #202                // Field modCount:I
         * 32: istore_3
         * 33: aload_2
         * 34: astore        4
         * 36: aload         4
         * 38: arraylength
         * 39: istore        5
         * 41: iconst_0
         * 42: istore        6
         * 44: iload         6
         * 46: iload         5
         * 48: if_icmpge     95
         * 51: aload         4
         * 53: iload         6
         * 55: aaload
         * 56: astore        7
         * 58: aload         7
         * 60: ifnull        89
         * 63: aload_1
         * 64: aload         7
         * 66: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 69: aload         7
         * 71: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 74: invokeinterface #288,  3          // InterfaceMethod java/util/function/BiConsumer.accept:(Ljava/lang/Object;Ljava/lang/Object;)V
         * 79: aload         7
         * 81: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 84: astore        7
         * 86: goto          58
         * 89: iinc          6, 1
         * 92: goto          44
         * 95: aload_0
         * 96: getfield      #202                // Field modCount:I
         * 99: iload_3
         * 100: if_icmpeq     111
         * 103: new           #280                // class java/util/ConcurrentModificationException
         * 106: dup
         * 107: invokespecial #282                // Method java/util/ConcurrentModificationException."<init>":()V
         * 110: athrow
         * 111: return
         *  */
        // </editor-fold>
    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnonnull     12
         * 4: new           #271                // class java/lang/NullPointerException
         * 7: dup
         * 8: invokespecial #273                // Method java/lang/NullPointerException."<init>":()V
         * 11: athrow
         * 12: aload_0
         * 13: getfield      #156                // Field size:I
         * 16: ifle          116
         * 19: aload_0
         * 20: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 23: dup
         * 24: astore_2
         * 25: ifnull        116
         * 28: aload_0
         * 29: getfield      #202                // Field modCount:I
         * 32: istore_3
         * 33: aload_2
         * 34: astore        4
         * 36: aload         4
         * 38: arraylength
         * 39: istore        5
         * 41: iconst_0
         * 42: istore        6
         * 44: iload         6
         * 46: iload         5
         * 48: if_icmpge     100
         * 51: aload         4
         * 53: iload         6
         * 55: aaload
         * 56: astore        7
         * 58: aload         7
         * 60: ifnull        94
         * 63: aload         7
         * 65: aload_1
         * 66: aload         7
         * 68: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 71: aload         7
         * 73: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 76: invokeinterface #283,  3          // InterfaceMethod java/util/function/BiFunction.apply:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 81: putfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 84: aload         7
         * 86: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 89: astore        7
         * 91: goto          58
         * 94: iinc          6, 1
         * 97: goto          44
         * 100: aload_0
         * 101: getfield      #202                // Field modCount:I
         * 104: iload_3
         * 105: if_icmpeq     116
         * 108: new           #280                // class java/util/ConcurrentModificationException
         * 111: dup
         * 112: invokespecial #282                // Method java/util/ConcurrentModificationException."<init>":()V
         * 115: athrow
         * 116: return
         *  */
        // </editor-fold>
    }

    public Object clone() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #294                // Method java/util/AbstractMap.clone:()Ljava/lang/Object;
         * 4: checkcast     #40                 // class java/util/HashMap
         * 7: astore_1
         * 8: goto          21
         * 11: astore_2
         * 12: new           #299                // class java/lang/InternalError
         * 15: dup
         * 16: aload_2
         * 17: invokespecial #301                // Method java/lang/InternalError."<init>":(Ljava/lang/Throwable;)V
         * 20: athrow
         * 21: aload_1
         * 22: invokevirtual #304                // Method reinitialize:()V
         * 25: aload_1
         * 26: aload_0
         * 27: iconst_0
         * 28: invokevirtual #96                 // Method putMapEntries:(Ljava/util/Map;Z)V
         * 31: aload_1
         * 32: areturn
         * Exception table:
         * from    to  target type
         * 0     8    11   Class java/lang/CloneNotSupportedException
         *  */
        // </editor-fold>
    }

    final float loadFactor() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #81                 // Field loadFactor:F
         * 4: freturn
         *  */
        // </editor-fold>
    }

    final int capacity() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 4: ifnull        15
         * 7: aload_0
         * 8: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 11: arraylength
         * 12: goto          31
         * 15: aload_0
         * 16: getfield      #88                 // Field threshold:I
         * 19: ifle          29
         * 22: aload_0
         * 23: getfield      #88                 // Field threshold:I
         * 26: goto          31
         * 29: bipush        16
         * 31: ireturn
         *  */
        // </editor-fold>
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #307                // Method capacity:()I
         * 4: istore_2
         * 5: aload_1
         * 6: invokevirtual #310                // Method java/io/ObjectOutputStream.defaultWriteObject:()V
         * 9: aload_1
         * 10: iload_2
         * 11: invokevirtual #315                // Method java/io/ObjectOutputStream.writeInt:(I)V
         * 14: aload_1
         * 15: aload_0
         * 16: getfield      #156                // Field size:I
         * 19: invokevirtual #315                // Method java/io/ObjectOutputStream.writeInt:(I)V
         * 22: aload_0
         * 23: aload_1
         * 24: invokevirtual #319                // Method internalWriteEntries:(Ljava/io/ObjectOutputStream;)V
         * 27: return
         *  */
        // </editor-fold>
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokevirtual #323                // Method java/io/ObjectInputStream.readFields:()Ljava/io/ObjectInputStream$GetField;
         * 4: astore_2
         * 5: aload_2
         * 6: ldc_w         #329                // String loadFactor
         * 9: ldc           #92                 // float 0.75f
         * 11: invokevirtual #330                // Method java/io/ObjectInputStream$GetField.get:(Ljava/lang/String;F)F
         * 14: fstore_3
         * 15: fload_3
         * 16: fconst_0
         * 17: fcmpg
         * 18: ifle          28
         * 21: fload_3
         * 22: invokestatic  #70                 // Method java/lang/Float.isNaN:(F)Z
         * 25: ifeq          55
         * 28: new           #336                // class java/io/InvalidObjectException
         * 31: dup
         * 32: new           #51                 // class java/lang/StringBuilder
         * 35: dup
         * 36: invokespecial #53                 // Method java/lang/StringBuilder."<init>":()V
         * 39: ldc           #76                 // String Illegal load factor:
         * 41: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 44: fload_3
         * 45: invokevirtual #78                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
         * 48: invokevirtual #63                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 51: invokespecial #338                // Method java/io/InvalidObjectException."<init>":(Ljava/lang/String;)V
         * 54: athrow
         * 55: fload_3
         * 56: ldc_w         #339                // float 0.25f
         * 59: ldc_w         #340                // float 4.0f
         * 62: invokestatic  #341                // Method java/lang/Math.clamp:(FFF)F
         * 65: fstore_3
         * 66: aload_0
         * 67: fload_3
         * 68: invokestatic  #345                // Method java/util/HashMap$UnsafeHolder.putLoadFactor:(Ljava/util/HashMap;F)V
         * 71: aload_0
         * 72: invokevirtual #304                // Method reinitialize:()V
         * 75: aload_1
         * 76: invokevirtual #351                // Method java/io/ObjectInputStream.readInt:()I
         * 79: pop
         * 80: aload_1
         * 81: invokevirtual #351                // Method java/io/ObjectInputStream.readInt:()I
         * 84: istore        4
         * 86: iload         4
         * 88: ifge          120
         * 91: new           #336                // class java/io/InvalidObjectException
         * 94: dup
         * 95: new           #51                 // class java/lang/StringBuilder
         * 98: dup
         * 99: invokespecial #53                 // Method java/lang/StringBuilder."<init>":()V
         * 102: ldc_w         #354                // String Illegal mappings count:
         * 105: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 108: iload         4
         * 110: invokevirtual #60                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 113: invokevirtual #63                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 116: invokespecial #338                // Method java/io/InvalidObjectException."<init>":(Ljava/lang/String;)V
         * 119: athrow
         * 120: iload         4
         * 122: ifne          128
         * 125: goto          285
         * 128: iload         4
         * 130: ifle          285
         * 133: iload         4
         * 135: i2d
         * 136: fload_3
         * 137: f2d
         * 138: ddiv
         * 139: invokestatic  #109                // Method java/lang/Math.ceil:(D)D
         * 142: dstore        5
         * 144: dload         5
         * 146: ldc2_w        #356                // double 16.0d
         * 149: dcmpg
         * 150: ifge          158
         * 153: bipush        16
         * 155: goto          178
         * 158: dload         5
         * 160: ldc2_w        #115                // double 1.073741824E9d
         * 163: dcmpl
         * 164: iflt          172
         * 167: ldc           #42                 // int 1073741824
         * 169: goto          178
         * 172: dload         5
         * 174: d2i
         * 175: invokestatic  #85                 // Method tableSizeFor:(I)I
         * 178: istore        7
         * 180: iload         7
         * 182: i2f
         * 183: fload_3
         * 184: fmul
         * 185: fstore        8
         * 187: aload_0
         * 188: iload         7
         * 190: ldc           #42                 // int 1073741824
         * 192: if_icmpge     209
         * 195: fload         8
         * 197: ldc           #210                // float 1.0737418E9f
         * 199: fcmpg
         * 200: ifge          209
         * 203: fload         8
         * 205: f2i
         * 206: goto          211
         * 209: ldc           #209                // int 2147483647
         * 211: putfield      #88                 // Field threshold:I
         * 214: invokestatic  #358                // Method jdk/internal/access/SharedSecrets.getJavaObjectInputStreamAccess:()Ljdk/internal/access/JavaObjectInputStreamAccess;
         * 217: aload_1
         * 218: ldc_w         #364                // class "[Ljava/util/Map$Entry;"
         * 221: iload         7
         * 223: invokeinterface #366,  4          // InterfaceMethod jdk/internal/access/JavaObjectInputStreamAccess.checkArray:(Ljava/io/ObjectInputStream;Ljava/lang/Class;I)V
         * 228: iload         7
         * 230: anewarray     #163                // class java/util/HashMap$Node
         * 233: astore        9
         * 235: aload_0
         * 236: aload         9
         * 238: putfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 241: iconst_0
         * 242: istore        10
         * 244: iload         10
         * 246: iload         4
         * 248: if_icmpge     285
         * 251: aload_1
         * 252: invokevirtual #372                // Method java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
         * 255: astore        11
         * 257: aload_1
         * 258: invokevirtual #372                // Method java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
         * 261: astore        12
         * 263: aload_0
         * 264: aload         11
         * 266: invokestatic  #149                // Method hash:(Ljava/lang/Object;)I
         * 269: aload         11
         * 271: aload         12
         * 273: iconst_0
         * 274: iconst_0
         * 275: invokevirtual #152                // Method putVal:(ILjava/lang/Object;Ljava/lang/Object;ZZ)Ljava/lang/Object;
         * 278: pop
         * 279: iinc          10, 1
         * 282: goto          244
         * 285: return
         *  */
        // </editor-fold>
    }

    Node<K, V> newNode(int hash, K key, V value, Node<K, V> next) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #163                // class java/util/HashMap$Node
         * 3: dup
         * 4: iload_1
         * 5: aload_2
         * 6: aload_3
         * 7: aload         4
         * 9: invokespecial #375                // Method java/util/HashMap$Node."<init>":(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)V
         * 12: areturn
         *  */
        // </editor-fold>
    }

    Node<K, V> replacementNode(Node<K, V> p, Node<K, V> next) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #163                // class java/util/HashMap$Node
         * 3: dup
         * 4: aload_1
         * 5: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 8: aload_1
         * 9: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 12: aload_1
         * 13: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 16: aload_2
         * 17: invokespecial #375                // Method java/util/HashMap$Node."<init>":(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)V
         * 20: areturn
         *  */
        // </editor-fold>
    }

    TreeNode<K, V> newTreeNode(int hash, K key, V value, Node<K, V> next) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #180                // class java/util/HashMap$TreeNode
         * 3: dup
         * 4: iload_1
         * 5: aload_2
         * 6: aload_3
         * 7: aload         4
         * 9: invokespecial #378                // Method java/util/HashMap$TreeNode."<init>":(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)V
         * 12: areturn
         *  */
        // </editor-fold>
    }

    TreeNode<K, V> replacementTreeNode(Node<K, V> p, Node<K, V> next) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #180                // class java/util/HashMap$TreeNode
         * 3: dup
         * 4: aload_1
         * 5: getfield      #168                // Field java/util/HashMap$Node.hash:I
         * 8: aload_1
         * 9: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 12: aload_1
         * 13: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 16: aload_2
         * 17: invokespecial #378                // Method java/util/HashMap$TreeNode."<init>":(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/HashMap$Node;)V
         * 20: areturn
         *  */
        // </editor-fold>
    }

    void reinitialize() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aconst_null
         * 2: putfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 5: aload_0
         * 6: aconst_null
         * 7: putfield      #266                // Field entrySet:Ljava/util/Set;
         * 10: aload_0
         * 11: aconst_null
         * 12: putfield      #239                // Field keySet:Ljava/util/Set;
         * 15: aload_0
         * 16: aconst_null
         * 17: putfield      #259                // Field values:Ljava/util/Collection;
         * 20: aload_0
         * 21: iconst_0
         * 22: putfield      #202                // Field modCount:I
         * 25: aload_0
         * 26: iconst_0
         * 27: putfield      #88                 // Field threshold:I
         * 30: aload_0
         * 31: iconst_0
         * 32: putfield      #156                // Field size:I
         * 35: return
         *  */
        // </editor-fold>
    }

    void afterNodeAccess(Node<K, V> p) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    void afterNodeInsertion(boolean evict) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    void afterNodeRemoval(Node<K, V> p) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    void internalWriteEntries(ObjectOutputStream s) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #156                // Field size:I
         * 4: ifle          77
         * 7: aload_0
         * 8: getfield      #105                // Field table:[Ljava/util/HashMap$Node;
         * 11: dup
         * 12: astore_2
         * 13: ifnull        77
         * 16: aload_2
         * 17: astore_3
         * 18: aload_3
         * 19: arraylength
         * 20: istore        4
         * 22: iconst_0
         * 23: istore        5
         * 25: iload         5
         * 27: iload         4
         * 29: if_icmpge     77
         * 32: aload_3
         * 33: iload         5
         * 35: aaload
         * 36: astore        6
         * 38: aload         6
         * 40: ifnull        71
         * 43: aload_1
         * 44: aload         6
         * 46: getfield      #170                // Field java/util/HashMap$Node.key:Ljava/lang/Object;
         * 49: invokevirtual #379                // Method java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
         * 52: aload_1
         * 53: aload         6
         * 55: getfield      #162                // Field java/util/HashMap$Node.value:Ljava/lang/Object;
         * 58: invokevirtual #379                // Method java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
         * 61: aload         6
         * 63: getfield      #177                // Field java/util/HashMap$Node.next:Ljava/util/HashMap$Node;
         * 66: astore        6
         * 68: goto          38
         * 71: iinc          5, 1
         * 74: goto          25
         * 77: return
         *  */
        // </editor-fold>
    }

    static int calculateHashMapCapacity(int numMappings) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: i2d
         * 2: ldc2_w        #383                // double 0.75d
         * 5: ddiv
         * 6: invokestatic  #109                // Method java/lang/Math.ceil:(D)D
         * 9: d2i
         * 10: ireturn
         *  */
        // </editor-fold>
    }

    public static <K extends Object, V extends Object> HashMap<K, V> newHashMap(int numMappings) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: ifge          32
         * 4: new           #49                 // class java/lang/IllegalArgumentException
         * 7: dup
         * 8: new           #51                 // class java/lang/StringBuilder
         * 11: dup
         * 12: invokespecial #53                 // Method java/lang/StringBuilder."<init>":()V
         * 15: ldc_w         #385                // String Negative number of mappings:
         * 18: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 21: iload_0
         * 22: invokevirtual #60                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 25: invokevirtual #63                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 28: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 31: athrow
         * 32: new           #40                 // class java/util/HashMap
         * 35: dup
         * 36: iload_0
         * 37: invokestatic  #387                // Method calculateHashMapCapacity:(I)I
         * 40: invokespecial #390                // Method "<init>":(I)V
         * 43: areturn
         *  */
        // </editor-fold>
    }
}
