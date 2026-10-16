# 🐾 Projeto Tamagotchi – Animais Virtuais

Esse projeto foi desenvolvido para uma atividade da faculdade, com base nos conteúdos que aprendemos em aula sobre programação orientada a objetos em Java.

A proposta foi criar um jogo inspirado no Tamagotchi, em que o jogador pode cuidar de três animais virtuais: um gato, um cachorro e um dragão. Cada animal possui seus próprios níveis de energia, fome e felicidade, que mudam de acordo com as ações realizadas durante o jogo.

## 💻 Como foi desenvolvido

Comecei criando a classe abstrata `Animal`, que reúne as características e ações em comum entre os animais. Depois, criei as classes `Gato`, `Cachorro` e `Dragao`, que herdam essa estrutura e possuem comportamentos específicos.

Durante o desenvolvimento, coloquei em prática conceitos de programação orientada a objetos, como herança, classes abstratas e sobrescrita de métodos usando `@Override`.

Cada animal tem suas próprias características durante o jogo. O gato, por exemplo, perde menos energia ao brincar, enquanto o cachorro é mais agitado e o dragão gasta ainda mais energia. Também implementei ações como comer, dormir e avançar o turno, que alteram os atributos dos animais.

Outro ponto importante foi controlar os valores de energia, fome e felicidade para que permanecessem entre 0 e 100, seguindo as regras propostas na atividade.

## 🎮 Interface do jogo

Além da lógica desenvolvida em Java, o projeto conta com uma interface visual para facilitar a interação com os animais. Nela, é possível visualizar os bichinhos, acompanhar seus atributos e utilizar os botões para realizar ações como brincar, comer e dormir.

A interface permite acompanhar as mudanças no estado de cada animal conforme as ações são realizadas, tornando o jogo mais interativo e fácil de entender.

## 📚 O que aprendi

Com esse projeto, pude praticar os conceitos de programação orientada a objetos e entender melhor como utilizar classes, herança, métodos e atributos para organizar o código. Também foi uma oportunidade de aplicar a lógica de programação na criação de um jogo com regras e comportamentos diferentes para cada animal.
