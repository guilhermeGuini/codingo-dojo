# Regras de Negócio

## Adquirência Estabelecimento Comercial

### Parte 1

Deve ser construído um algoritmo que possibilite a realização de uma venda, sendo que:

1. Ao realizar a venda deve-se descontar a taxa alelo no valor de R$ 0.75;
2. Deve-se armazenar o valor da venda no saldo do estabelecimento

### Parte 2

Deve ser implementado um algoritmo que possibilite realizar ajustes no saldo do EC, sendo que:

1. Ao realizar um ajuste de crédito devemos incrementar o valor que o EC tem para receber;
2. Ao realizar um ajuste de débito devemos decrementar o valor que o EC tem para receber;
3. Não devemo possibilitar o ajuste de débito se o EC não tiver saldo;

### Parte 3

Deve ser implementado um algoritmo que possibilite que o EC fique em débit balance, sendo que:

1. Se o saldo for menor que o valor de débito o EC deve entrar em load balance;
2. Se o EC já estiver negativado e receber um crédito maior que o valor em débit balance, o mesmo deve voltar ao normal;

## Conta

### Parte 1

Deve ser construído um algoritmo que "faça" saques na conta do cliente, para facilitar o exercício vamos considerar que
seja permitido apenas sacar notas. Regras:

1. Não deve ser permitido sacar valor maior do que o saldo da conta do cliente;
2. Deve-se limitar o saque em no mínimo R$ 1,00;
3. Após o saque deve-se atualizar o saldo atual;

### Parte 2

Deve ser implementado um sistema de limite, para que o cliente possa sacar valor maior do que o saldo da conta.

1. Ao tentar sacar um valor maior que o saldo da conta, devemos considerar o limite para verificar se o valor a ser sacado é menor que o saldo mais o limite.
2. Se for utilizado o limite devemos subtrair do limite o valor descontado


### Parte 3

Deve ser implementado um sistema de debit balance, onde o cliente poderá ficar com saldo negativo.

1. Implementar um método de débito