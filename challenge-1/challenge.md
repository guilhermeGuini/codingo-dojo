# Regras de Negócio

## Parte 1

Deve ser construído um algoritmo que "faça" saques na conta do cliente, para facilitar o exercício vamos considerar que
seja permitido apenas sacar notas. Regras:

1. Não deve ser permitido sacar valor maior do que o saldo da conta do cliente;
2. Deve-se limitar o saque em no mínimo R$ 1,00;
3. Após o saque deve-se atualizar o saldo atual;

## Parte 2

Deve ser implementado um sistema de limite, para que o cliente possa sacar valor maior do que o saldo da conta.

1. Ao tentar sacar um valor maior que o saldo da conta, devemos considerar o limite para verificar se o valor a ser sacado é menor que o saldo mais o limite.
2. Se for utilizado o limite devemos subtrair do limite o valor descontado


## Parte 3

Deve ser implementado um sistema de debit balance, onde o cliente poderá ficar com saldo negativo.

1. Implementar um método de débito