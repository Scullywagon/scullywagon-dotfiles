����   A s  java/lang/RuntimeException  AUncompilable code - variable root might not have been initialized
     <init> (Ljava/lang/String;)V 
 ,Uncompilable code - missing return statement  nUncompilable code - cannot find symbol
  symbol:   class AbstractList
  location: class java.util.ArrayList<E>  java/util/ArrayList$SubList  java/lang/Object root Ljava/util/ArrayList; 	Signature Ljava/util/ArrayList<TE;>; parent Ljava/util/ArrayList$SubList; "Ljava/util/ArrayList$SubList<TE;>; offset I size (Ljava/util/ArrayList;II)V Code LineNumberTable LocalVariableTable this 	fromIndex toIndex LocalVariableTypeTable MethodParameters (Ljava/util/ArrayList<TE;>;II)V "(Ljava/util/ArrayList$SubList;II)V '(Ljava/util/ArrayList$SubList<TE;>;II)V set '(ILjava/lang/Object;)Ljava/lang/Object; index element Ljava/lang/Object; TE; 	(ITE;)TE; get (I)Ljava/lang/Object; (I)TE; ()I add (ILjava/lang/Object;)V (ITE;)V remove removeRange (II)V addAll (Ljava/lang/Object;)Z c (ILjava/lang/Object;)Z 
replaceAll %(Ljava/util/function/UnaryOperator;)V operator "Ljava/util/function/UnaryOperator; 'Ljava/util/function/UnaryOperator<TE;>; *(Ljava/util/function/UnaryOperator<TE;>;)V 	removeAll 	retainAll batchRemove (Ljava/lang/Object;Z)Z 
complement Z removeIf !(Ljava/util/function/Predicate;)Z filter Ljava/util/function/Predicate; $Ljava/util/function/Predicate<-TE;>; '(Ljava/util/function/Predicate<-TE;>;)Z toArray ()[Ljava/lang/Object; (([Ljava/lang/Object;)[Ljava/lang/Object; a [Ljava/lang/Object; [TT;  <T:Ljava/lang/Object;>([TT;)[TT; equals o hashCode indexOf (Ljava/lang/Object;)I lastIndexOf contains iterator ()Ljava/lang/Object; listIterator subList (II)Ljava/lang/Object; rangeCheckForAdd (I)V outOfBoundsMsg (I)Ljava/lang/String; checkForComodification ()V updateSizeAndModCount 
sizeChange spliterator <clinit> (<E:Ljava/lang/Object;>Ljava/lang/Object; 
SourceFile ArrayList.java NestHost p java/util/ArrayList InnerClasses SubList                                            d     
� Y� �               *    
       
      
       
 !   "       
    #           !       $   %     d     
� Y� �               *    
       
      
       
 !   "       
    #           !       &  ' (     d     
� Y	� �                    
       
 )     
 * +  "       
       
 * ,  #   	 )   *       -  . /     P     
� Y	� �                   
       
 )   "       
     #    )       0   1     F     
� Y	� �                   
     "       
      2 3     [      �          �                 )      * +  "               * ,  #   	 )   *       4  5 /     P     
� Y	� �                   
       
 )   "       
     #    )       0  6 7     Q      �          +                        !   "            #   	     !    8 9     P     
� Y	� �                   
       
 : +  "       
     #    :    8 ;     Z     
� Y	� �                    
       
 )     
 : +  "       
     #   	 )   :    < =     Q      �          i                > ?  "               > @  #    >       A  B 9     P     
� Y	� �                   
       
 : +  "       
     #    :    C 9     P     
� Y	� �                   
       
 : +  "       
     #    :    D E     Z     
� Y	� �                    
       
 : +    
 F G  "       
     #   	 :   F    H I     Z     
� Y	� �                   
       
 J K  "       
       
 J L  #    J       M  N O     F     
� Y	� �                   
     "       
      N P     Z     
� Y	� �                   
       
 Q R  "       
       
 Q S  #    Q       T  U 9     P     
� Y	� �                   
       
 V +  "       
     #    V    W 1     F     
� Y	� �                   
     "       
      X Y     P     
� Y	� �                   
       
 V +  "       
     #    V    Z Y     P     
� Y	� �                   
       
 V +  "       
     #    V    [ 9     P     
� Y	� �                   
       
 V +  "       
     #    V    \ ]     F     
� Y	� �                   
     "       
      ^ /     P     
� Y	� �                   
       
 )   "       
     #    )    _ `     Z     
� Y	� �                    
       
       
 !   "       
     #   	     !    a b     G      �          �                )   "            #    )    c d     P     
� Y	� �                   
       
 )   "       
     #    )    e f     =      �          �             "             g b     G      �                          h   "            #    h    i ]     F     
� Y	� �                   
     "       
      j f     "      
� Y� �                 k l    m n    o q   
   o r 
