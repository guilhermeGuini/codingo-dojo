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
3. Não devemos possibilitar o ajuste de débito se o EC não tiver saldo;

### Parte 3

Deve ser implementado um algoritmo que possibilite que o EC fique em débit balance, sendo que:

1. Se o saldo for menor que o valor de débito o EC deve entrar em debit balance;
2. Se o EC já estiver negativado e receber um crédito maior ou igual que o valor em débit balance, o mesmo deve sair de débit balance;
3. Se o EC já estiver negativado e receber um crédito menor que o valor em débit balance o mesmo deve continuar em débit balance;
4. Se o EC já estiver negativado e receber um débito, o mesmo deve continuar em débit balance.