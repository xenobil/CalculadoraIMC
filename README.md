# Calculadora de IMC

Este é um aplicativo simples de calculadora de Índice de Massa Corporal (IMC) desenvolvido em Java para Android. O aplicativo consiste em duas atividades: uma para inserir o peso e a altura do usuário e outra para mostrar o resultado do cálculo do IMC.

## MainActivity

A classe `MainActivity` é responsável pela primeira tela do aplicativo, onde o usuário pode inserir seu peso e altura. 

### Funcionalidades:
- Captura do peso e altura inseridos pelo usuário.
- Cálculo do IMC com base nos dados inseridos.
- Navegação para a próxima tela com os dados do peso e altura inseridos.

### Explicação do Código:
- Captura os elementos de interface do usuário (botão de calcular, campos de peso e altura).
- Define um ouvinte de clique para o botão de calcular que realiza o cálculo do IMC e inicia a próxima atividade com os dados do peso e altura.

## ResultadoActivity

A classe `ResultadoActivity` é responsável pela segunda tela do aplicativo, onde o resultado do cálculo do IMC é exibido.

### Funcionalidades:
- Exibe o peso e altura inseridos pelo usuário.
- Calcula o IMC com base nos dados inseridos e exibe o resultado.
- Arredonda o IMC para um decimal.

### Explicação do Código:
- Recupera os dados do peso e altura passados da tela anterior.
- Calcula o IMC e determina a classificação do peso com base no valor do IMC.
- Exibe os dados do peso e altura e o resultado do cálculo do IMC na interface do usuário.

## Observações
- Ambos os códigos estão escritos em Java para Android.
- Os códigos são simples e foram projetados para fins educacionais e demonstrativos.
