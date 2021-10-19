
# o usúario precisa informar os valores
primeiroNumero = int( input("Primeiro valor:  "))
segundoNumero = int(input("Segundo valor: "))

# foi iniciado a variavel com o valor zero
opcao = 0

# enquanto a condição for verdadeira o ciclo será executado
while opcao != 6:

# pequeno menu com as opções
    print('''  
        -------------------------------------------------- 
                    MENU PRINCIPAL
        --------------------------------------------------
                    1 - SOMA                             
                    2 - SUBTRAÇÃO                   
                    3 - MULTIPLICAÇÃO           
                    4 - DIVISÃO                          
                    5 - SAIR DO PROGRAMA    
                    6 - INFORMAR OUTROS VALORES
        ---------------------------------------------------''')

    # input onde o usúario irá informar a opção desejada
    opcao = int(input('Digite a operação desejada:  '))
    # coloquei aqui só para pular uma linha
    print()

    # aqui é onde começa a estrutura condicional
   # caso o usúario opte pela opção 1, será somado os números, esses números
   # serão armazeanos na váriavel "soma", logo em seguida irá imprimir / printar
   # na tela quais números foram somados e o seu resultado, sendo assim para
   # as respectivas opções .
    if opcao == 1:
        soma = primeiroNumero + segundoNumero
        print("A soma entre {} + {} é {}".format(primeiroNumero, segundoNumero, soma))

    elif  opcao == 2:
        subtracao = primeiroNumero  -  segundoNumero
        print("A subtração entre {} - {} é {}".format(primeiroNumero, segundoNumero, subtracao))

    elif  opcao == 3:
        multiplicacao = primeiroNumero *  segundoNumero
        print("A multiplicacao entre {} x {} é {}".format(primeiroNumero, segundoNumero, multiplicacao))

    elif  opcao == 4:
        divisao = primeiroNumero /  segundoNumero
        print("A divisao entre {} / {} é {}".format(primeiroNumero, segundoNumero, divisao))

    # opção para sair do programa
    elif opcao == 5:
        print("Finalizando ....")
    # opção caso o usúario queira fazer operações com outros valores (valores diferentes aos quais ele optou no começo do programa)
    elif opcao == 6:
        primeiroNumero = int(input("Primeiro valor:  "))
        segundoNumero = int(input("Segundo valor: "))

    else:
        print('Opção inválida. Tente novamente')
print('Fim do programa! Volte sempre!')




