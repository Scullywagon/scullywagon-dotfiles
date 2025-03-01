����   A �
      java/lang/Object <init> ()V	  	 
   HangManGame wordsPerSession I  java/lang/String  forty  nine  
undefeated  playing  the  arsenal  way	      words [Ljava/lang/String;	  " #  pos
  % & ' toCharArray ()[C	  ) * + theWord [C	  - . / found [Z 1 java/util/Scanner	 3 4 5 6 7 java/lang/System in Ljava/io/InputStream;
 0 9  : (Ljava/io/InputStream;)V	 3 < = > out Ljava/io/PrintStream; @ 0 Silly hangman game to demonstrate serialisation
 B C D E F java/io/PrintStream println (Ljava/lang/String;)V	  H I  livesPerWord   K L M makeConcatWithConstants (I)Ljava/lang/String;  K  K
 B Q R F print
 B T R U (C)V W _ Y 
 Guess a letter : 
 0 [ \ ] nextLine ()Ljava/lang/String;
  _ ` a charAt (I)C c  you won e 	 you lost g  the word was :  i java/io/FileOutputStream	  k l m saveFilename Ljava/lang/String;
 h o  F q java/io/ObjectOutputStream
 p s  t (Ljava/io/OutputStream;)V
 p v w x writeObject (Ljava/lang/Object;)V
 p z {  close } java/io/FileInputStream
 | o � java/io/ObjectInputStream
  9
  � � � 
readObject ()Ljava/lang/Object;
  z
   �  WELCOME TO HANGMAN � < Try load game (l), save game (s), quit (q) or play game (p)
  � � ] toLowerCase
  � � � loadGame ()LHangManGame; � java/lang/Exception
  � � � valueOf &(Ljava/lang/Object;)Ljava/lang/String;  � L � &(Ljava/lang/String;)Ljava/lang/String;  � L � (II)Ljava/lang/String;
  � � � saveGame (LHangManGame;)V  �
  � � � 
setNewWord ()Z
  � � � playWord �  BYEEEEEEEEE � hangman.ser � java/io/Serializable serialVersionUID J ConstantValue       e Code LineNumberTable LocalVariableTable this LHangManGame; StackMapTable i str ch C 
foundCount foundAny Z scanner Ljava/util/Scanner; won 	livesUsed h fos Ljava/io/FileOutputStream; Ljava/io/ObjectOutputStream; 
Exceptions MethodParameters fis Ljava/io/FileInputStream; Ljava/io/ObjectInputStream; hm main ([Ljava/lang/String;)V e Ljava/lang/Exception; args quit s   <clinit> 
SourceFile HangManGame.java BootstrapMethods �  you have  lives �  your word has  � Lives left =  WORD:  � 6 Unable to load game, exception =  continuing to menu � ) Position =  words played in session =  � 6 Unable to save game, exception =  continuing to menu �
 � � � L � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !    �   � �  �    � �      * +    . /          #    
 I    	 l m        �   v     <*� *� *� YSYSYSYSYSYSYS� *� !�    �          	  6  ; D �       < � �    � �  �   u     2*� !*� �� '**� *Y� !Z`� !2� $� (**� (��� ,��    �          #  .  0  �       2 � �   �    0  � �  �  �  	  ;� 0Y� 2� 8L=� ;?� A� ;� G� J  � A� ;*� ,�� N  � A>� �� G� �� ;� Gd� O  � P6*� ,�� +*� ,3� � ;*� (4� S� � ;V� P���Ѳ ;X� A+� Z:� ^6666*� ,�� .*� (4� *� ,T6*� ,3� ������ �*� (�� =��H� � ;b� A� � ;d� A� ;f� A6*� ,�� � ;*� (4� S����*Y� `� �    �   � '          #  3  5  @  P   ] ! g " w $    � & � ' � ( � ) � * � + � , � - � . � 0 � 1 � + � 3 � 4 � 5 � 6 � 7 � 8 � 9 � < = > ?) >/ @9 A �   p  S 2 �   � 5 �   � Z � m  � R � �  � O �   � L � �   �    ; � �   0 � �  . � �  5 �   �   H � 5 0� #� �  	  0    � �    0  � 
�  	 � �  �   l     � hY� j� nL� pY+� rM,*� u,� y�    �       F  G  H  I  J �         � �     � �   
 = �  �     � �    �   	 � �  �   p     "� |Y� j� ~K� Y*� �L+� �� M+� �,�    �       L  M  N  O   P �        � �     6 �    � �  �     � 	 � �  �       Ի Y� �L=� 0Y� 2� 8N� �� ;�� A� ;�� A-� Z:� �� ^6l� 2� �L� :� ;� �� �  � A� ;+� !+� � �  � A���s� 2� ;+� !+� � �  � A+� ����:� ;� �� �  � A��rq� =� +� �� � =� +� �W��M� ;�� A�  A E H � � � � �  �   z    T  U 
 V  W  X ! Y ) Z / [ : \ A ^ E b H ` J a Z c m d p f w g � k � n � l � m � o � q � r � t � u � v � w � x � z �   R  J  � �  �  � �  / � � m  : � � �    � �      � � �  
 � � �   � � �  �   4 �   0� 2  �  0   �` �
@ �  �    �    �   �   &      
� G�� j�    �   
      D  �    � �   &  �  � �  � �  � �  � �  � �  � �   
  � � � 