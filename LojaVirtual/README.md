# O Problema do Carrinho de Compras
Uma loja virtual possui um carrinho de compras, que guarda uma lista de itens comprados. Um item possui a descrição de um produto, a quantidade, o valor unitário e o valor total desse item.
O programador deve implementar uma funcionalidade que devolva o valor do item de maior valor dentro desse carrinho de compras. Pensando
já nos testes, temos os seguintes cenários:
- Se o carrinho só tiver um item, ele mesmo será o item de maior valor;
- Se o carrinho tiver muitos itens, o item de maior valor é o que deve ser retornado;
- Um carrinho sem nenhum item deve retornar valor 0.