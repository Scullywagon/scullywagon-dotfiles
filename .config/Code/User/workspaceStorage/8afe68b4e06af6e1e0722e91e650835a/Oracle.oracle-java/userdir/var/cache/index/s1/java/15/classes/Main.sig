����   A �
      java/lang/Object <init> ()V
  	 
   Main ColourOrdinalPos  java/util/ArrayList
    Student  Mark
     (Ljava/lang/String;I)V
     add (Ljava/lang/Object;)Z  Anna  John  Emma ! Lucas # SelectStudentAge
 " %  & (I)V
  ( ) * iterator ()Ljava/util/Iterator; , - . / 0 java/util/Iterator hasNext ()Z , 2 3 4 next ()Ljava/lang/Object;	 6 7 8 9 : java/lang/System out Ljava/io/PrintStream;
 " < = > Select (LStudent;)Z
 @ A B C D java/io/PrintStream println (Z)V	  F G H aged21 LSelect; J K = =  M Car O BMW
 L  R Audi T Mercedes V Toyota X Honda	  Z [ H isBMW ] Musician$Band _ Rock a Loaded Dipers
 \ c  d ((ILjava/lang/String;Ljava/lang/String;)V f Musician h Guitar
 e j  k $(Ljava/lang/String;LMusician$Band;)V	 e m n o musicianInfo LMusician$MusicianInfo;
 q r s t D Musician$MusicianInfo setAvailable
 q v w  	printInfo
 e y z  printFestival	 | } ~  � Colours BLUE 	LColours;
 | � � � ordinal ()I
 @ � C &
 | � � � values ()[LColours;
 | � � � name ()Ljava/lang/String;
 @ � C � (Ljava/lang/String;)V
 L � � � getMake
 � � � �  java/lang/String equals
  � � � getAge   � = � 
()LSelect;  � 	Signature LSelect<LStudent;>; LSelect<LCar;>; Code LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V args [Ljava/lang/String; MethodParameters SelectStudentAgeInterface s 	LStudent; students Ljava/util/ArrayList; selector LSelectStudentAge; LocalVariableTypeTable  Ljava/util/ArrayList<LStudent;>; StackMapTable SelectStudentAgeLambda SelectCarBMWLambda c LCar; cars Ljava/util/ArrayList<LCar;>; PrintMusicianInfo band LMusician$Band; musician 
LMusician; r � 
[LColours; lambda$static$1 (LCar;)Z car lambda$static$0 student <clinit> 
SourceFile 	Main.java BootstrapMethods  �
  � � > > �
  � � � � �
 � � � � � "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; InnerClasses Band MusicianInfo � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !       G H  �    �  [ H  �    � 
     �   /     *� �    �        �        � �   	 � �  �   2      � �    �   
       �        � �   �    �   	 �   �       �� Y� K*� Y� � W*� Y� � W*� Y� � W*� Y� � W*� Y � � W� "Y� $L*� 'M,� + � ,� 1 � N� 5+-� ;� ?���    �   .         (  8  H  X  b  z ! � " � # �      z  � �   � � �   b ' � �  �      � � �   �    � g  " ,�   	 �   �       �� Y� K*� Y� � W*� Y� � W*� Y� � W*� Y� � W*� Y � � W*� 'L+� + � +� 1 � M� 5� E,� I � ?��ޱ    �   * 
   )  +  , ( - 8 . H / X 1 p 3  4 � 5 �     p  � �   { � �   �      { � �   �    � ]  ,� $ 	 �   �   �     ~� Y� K*� LYN� P� W*� LYQ� P� W*� LYS� P� W*� LYU� P� W*� LYW� P� W*� 'L+� + � +� 1 � LM� 5� Y,� I � ?��ޱ    �   * 
   =  ?  @ & A 5 B D C S E k G z H } I �     k  � �   v � �   �      v � �   �    � X  ,� $ 	 �   �   t     ,� \Y^`� bK� eYg*� iL+� l� p+� l� u+� x�    �       P  Q  S   T ' V + W �       � �     � �  	    �   �     3� {K� 5*� �� �� �L+�=>� +2:� 5� �� �����    �       ]  _  a ! c , a 2 e �     !  � �   / � �   �    �   | �  � 
 � �  �   4     
N*� �� ��    �       K �       
 � �  
 � >  �   D     *� �� � �    �       7 �        � �   �    @  �   �   -      � �  � E� �  � Y�    �   
    7  K  �    � �     �  � � � �  � � � �     \ e � 	 q e �  � � � 