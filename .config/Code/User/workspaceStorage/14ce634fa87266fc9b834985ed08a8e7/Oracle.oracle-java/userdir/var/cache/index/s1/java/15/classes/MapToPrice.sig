����   A 5
      java/lang/Object <init> ()V  java/util/HashMap
  	      
MapToPrice myMap Ljava/util/HashMap;
      ChristmasGift getPrice ()I
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
     put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 	Signature 7Ljava/util/HashMap<LChristmasGift;Ljava/lang/Integer;>; Code LineNumberTable LocalVariableTable this LMapToPrice; getMyMap ()Ljava/util/HashMap; 9()Ljava/util/HashMap<LChristmasGift;Ljava/lang/Integer;>; setMyMap (Ljava/util/HashMap;)V LocalVariableTypeTable MethodParameters :(Ljava/util/HashMap<LChristmasGift;Ljava/lang/Integer;>;)V addToMap (LChristmasGift;)V cg LChristmasGift; 
SourceFile MapToPrice.java !               !      "   B     *� *� Y� 	� 
�    #           	 $        % &    ' (  "   /     *� 
�    #        $        % &        )  * +  "   P     *+� 
�    #   
       $        % &         ,         !  -            .  / 0  "   I     *� 
++� � � W�    #   
       $        % &      1 2  -    1    3    4