����   A p
      java/lang/Object <init> ()V  Item 
 fuck
     +(Ljava/lang/Comparable;Ljava/lang/Object;)V  shit
      java/lang/Integer valueOf (I)Ljava/lang/Integer;  SelectByIdentifier
     (Ljava/lang/Comparable;)V
      Main testHashTable
 ! " # $ % java/util/ArrayList iterator ()Ljava/util/Iterator; ' ( ) * + java/util/Iterator hasNext ()Z ' - . / next ()Ljava/lang/Object;	 1 2 3 4 5 java/lang/System out Ljava/io/PrintStream;
 7 8 9 : ; java/io/PrintStream println (Ljava/lang/Object;)V = 	HashTable
 < 
 < @ A B add '(Ljava/lang/Object;Ljava/lang/Object;)V D cunt
 < F G H get &(Ljava/lang/Object;)Ljava/lang/Object; Code LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V args [Ljava/lang/String; A LItem; a B b stringSelector LSelectByIdentifier; intSelector LocalVariableTypeTable ,LItem<Ljava/lang/String;Ljava/lang/Object;>; -LItem<Ljava/lang/Integer;Ljava/lang/Object;>; (LSelectByIdentifier<Ljava/lang/String;>; )LSelectByIdentifier<Ljava/lang/Integer;>; MethodParameters print (Ljava/util/ArrayList;)V item Ljava/lang/Object; list Ljava/util/ArrayList; TU; Ljava/util/ArrayList<TU;>; StackMapTable 	Signature 3<U:Ljava/lang/Object;>(Ljava/util/ArrayList<TU;>;)V table LHashTable; 2LHashTable<Ljava/lang/String;Ljava/lang/Integer;>; 
SourceFile 	Main.java !            I   /     *� �    J        K        L M   	 N O  I       Q� Y		� L� Y� M� Y� � N� Y� � :� Y	� :� Y� � :� �    J   "        	 & 
 5  @  M  P  K   H    Q P Q    E R S   9 T S  & + U S  5  V S  @  W X  M  Y X  Z   >   E R [   9 T [  & + U \  5  V \  @  W ]  M  Y ^  _    P   	 ` a  I   �      *�  L+� & � +� , M� 0,� 6���    J              K       b c      d e   Z       b f      d g   h    �  '�  _    d   i    j 	    I   �     G� <Y� >K*	� � ?*	� � ?*� � ?*� � ?*C� � ?� 0*C� E� 6�    J   "    #  $  %  & & ' 0 ( : * F + K      ? k l   Z      ? k m    n    o