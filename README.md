# Lambda Comparator

## Problema
• Suponha uma classe Product com os atributos name e price.

• Podemos implementar a comparação de produtos por meio da
implementação da interface Comparable<Product>
  
• Entretanto, desta forma nossa classe não fica fechada para
alteração: se o critério de comparação mudar, precisaremos
alterar a classe Product.
  
• Podemos então usar o default method "sort" da interface List:
default void sort(Comparator<? super E> c)



## Comparator
https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html

Veja o método sort na interface List:

https://docs.oracle.com/javase/10/docs/api/java/util/List.html

## Resumo
• Comparator objeto de classe separada

• Comparator objeto de classe anônima

• Comparator objeto de expressão lambda com chaves

• Comparator objeto de expressão lambda sem chaves

• Comparator expressão lambda "direto no argumento"
