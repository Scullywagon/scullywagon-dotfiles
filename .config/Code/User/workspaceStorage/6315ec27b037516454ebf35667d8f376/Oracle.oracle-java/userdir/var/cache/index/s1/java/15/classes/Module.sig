����   A a
      java/lang/Object <init> ()V  java/util/ArrayList
  	      Module students Ljava/util/ArrayList;	     numStudents I  Student  Alice  Mathematics
     ((Ljava/lang/String;Ljava/lang/String;I)V
      add (Ljava/lang/Object;)Z " Bob $ Physics & Charlie ( 	Chemistry
  * + , size ()I	 . / 0 1 2 java/lang/System out Ljava/io/PrintStream;
 4 5 6 7 8 java/io/PrintStream println (I)V
  : ; < iterator ()Ljava/util/Iterator; > ? @ A B java/util/Iterator hasNext ()Z > D E F next ()Ljava/lang/Object;	  H I J name Ljava/lang/String;
 4 L 7 M (Ljava/lang/String;)V O java/io/Serializable serialVersionUID J ConstantValue        	Signature  Ljava/util/ArrayList<LStudent;>; Code LineNumberTable LocalVariableTable s 	LStudent; this LModule; StackMapTable 
SourceFile Module.java !    N   P Q  R    S      U    V            W       �*� *� Y� 	� 
*� *� 
� Y� � W*� 
� Y!#� � W*� 
� Y%'� � W**� 
� )� � -*� � 3*� 
� 9L+� = � +� C � M� -,� G� K���    X   2           (  <  P  [  e  �  �  �  Y     � 
 Z [    � \ ]   ^    � m   >  �   _    `