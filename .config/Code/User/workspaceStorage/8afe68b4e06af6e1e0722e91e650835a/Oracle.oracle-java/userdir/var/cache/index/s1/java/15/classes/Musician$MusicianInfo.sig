����   A C	      Musician$MusicianInfo this$0 
LMusician;
  	 
   java/lang/Object <init> ()V	     	available Z	      java/lang/System out Ljava/io/PrintStream;	      Musician 
instrument Ljava/lang/String;
     ! " java/io/PrintStream println (Ljava/lang/String;)V	  $ % & band LMusician$Band;
 ( ) * + , Musician$Band getStyle ()Ljava/lang/String;  / Not available (LMusician;)V Code LineNumberTable LocalVariableTable this LMusician$MusicianInfo; MethodParameters setAvailable (Z)V 	printInfo StackMapTable < java/lang/String 
SourceFile Musician.java NestHost InnerClasses MusicianInfo Band !                   0  1   >     
*+� *� �    2       ? 3       
 4 5     
    6    �  7 8  1   >     *� �    2   
    E  F 3        4 5         6        9   1   �     2� *� � � � *� � #� '� � *� � -� .� �    2       J  K  L 1 M 3       2 4 5   :    l �      ;  =    > ?     @       A  (  B 	