import java.security.Principal
var nome: String = ""
fun main () {
    val carro: String = "fusca"
    println("=== VRUM, VRUM ===")
    println("\nMotor roncando...")
    Thread.sleep(800)
    println("\nCalma, aquele $carro estacionado ali, é seu? Que maneiro, parabéns!")
    Thread.sleep(1800)
    println("\nLegal demais, mas e ai amigo, qual seu nome?")
    nome = readln()
    println("Muito prazer $nome, seja bem Bem Vindo a Garagem do Coder.")
    println("Ah sim, mas e sua idade?")
    val idadeInput = readln()
    val idade = idadeInput.toIntOrNull() ?: 0
    println("Entendi $nome, você tem $idade anos.")
    if (idade < 16) {
        println("ACESSO RESTRITO")
        println("Desculpe, mas a Garagem não é para menores de 16 anos.")
    } else {
        println("=== Acesso liberado! ===")
        println("Divirta-se na Garagem $nome, será um prazer!")
        menus()
    }
}
fun menus(){
    var continuar= true
    while (continuar) {
        println("=== HORA DE CODAR! ===")
        println("1.TRIÂNGULO      2.QUADRADO             3.LOSANGO")
        println("4.TRAPÉZIO       5.PARALELOGRAMO        6.RETÂNGULO")
        println("7.CÍRCULO        8.HORA DE CODAR 2      0.SAIR")
        print("Opção:")
        when (readln()) {
            "1" -> triangulo()
            "2" -> quadrado()
            "3" -> losango()
            "4" -> trapezio ()
            "5" -> paralelogramo ()
            "6" -> retangulo ()
            "7" -> circulo ()
            "8" -> horadecodar2()
            "0" -> {
            println("Até mais, volte outras vez por aqui em! $nome")
            continuar=false
            }
            else -> println("Inválido! Tente novamente.")
        }
     }
    }
fun horadecodar2() {
    var voltar = false
    while (!voltar) {
        println("=== MENU HORA DE CODAR 2: A Víngança do Coder ===")
        println("1.Qual o maior número?       2.Positivo/negativo        3.Maior número? Sem números iguais.")
        println("4.Soma números               5.Média de 6 notas.        6.Primeiro/Último/Maior")
        println("7.Soma 72                    8.Média (0/10)             9.Pode votar?")
        println("10.Seu peso Ideal.          11.Calculadora              12.HORA DE CODAR 3!")
        println("0.Voltar")
        print("Opção:")
        when (readln()) {
            "1" -> maior()
            "2" -> positivo()
            "3" -> maiordetres()
            "4" -> somamaior()
            "5" -> mediaseis()
            "6" -> pum()
            "7" -> seisetedois()
            "8" -> media()
            "9" -> votar()
            "10" -> peso()
            "11" -> calculadora()
            "12" -> horadecodar3()
            "0" -> voltar = true
            else -> println("Em Breve...")
        }
    }
}
fun horadecodar3(){
    var voltar = false
    while (!voltar) {
        println("=== MENU HORA DE CODAR 3: De volta para o Código ===")
        println("1.EXPLOSÃO?                  2.MENOR DE ZERO.           3.10 < 1")
        println("4.INTERVALO 15 & 100         5.2° NÚMERO MAIOR.         6.MÉDIA >= 9.5")
        println("7.MÉDIA ENTRE 6              8.INTEIROS ENTRE?          9.100 até 110")
        println("10.ENTRE 24 & 42.           11.TABUADA              12.HORA DE CODAR 4!")
        println("0.Voltar")
        print("Opção:")
        when (readln()) {
            "1" -> kaboom()
            "2" -> menordezero()
            "3" -> decrescente()
            "4" -> calculandomedia()
            "5" -> maiorquesegundo()
            "6" -> aprovados()
            "7" -> mediadeseis()
            "8" -> doidera()
            "9" -> maiorcem()
            "10" -> dezvalores()
            "11" -> tabuada()
            "12" -> horadecodar4()
            "0" -> voltar = true
            else -> println("Em Breve...")
        }
    }
}
fun horadecodar4(){
    var voltar = false
    while (!voltar) {
        println("=== MENU HORA DE CODAR 4: Um novo dia para Codar ===")
        println("1.LISTA DE ESTUDANTES        2.PLANETAS                 3.FEIRA")
        println("4.HORA DE CODAR 5!")
        println("0.Voltar")
        print("Opção:")
        when (readln()) {
            "1" -> estudantes()
            "2" -> planetas()
            "3" -> feirinhas()
            "4" -> horadecodar5()
            "0" -> voltar = true
            else -> println("Em Breve...")
        }
    }
}
//HORA DE CODAR 1
fun triangulo(){
    println("=== CALCULADORA ===")
    println("Qual a base? Do seu triângulo.")
    val b = readln().toDouble()
    println("E sua altura?")
    val a = readln().toDouble()
    val area= (b*a)/2
    println("Sua área é: $area")
}
fun quadrado(){
    println("Qual o lado do Quadrado?")
    val l = readln().toDouble()
    val area= (l*l)
    println("Sua área é: $area²")
}
fun losango(){
    println("Valor da diagonal maior? Do teu Losango.")
    val maior = readln().toDouble()
    println("Qual o valor da diagonal menor?")
    val menor = readln().toDouble()
    val area = (maior*menor)/2
    println("Sua área é:$area")
}
fun trapezio(){
    println("Valor da base maior do Trapézio?")
    val io = readln().toDouble()
    println("Valor da base menor?")
    val no = readln().toDouble()
    println("Valor da altura?")
    val h = readln().toDouble()
    val area = ((io+no)*h)/2
    println("Sua área é:$area")
}
fun paralelogramo(){
    println("Qual a base do Paralelogramo?")
    val base = readln().toDouble()
    println("Qual a altura do Paralelogramo?")
    val altura = readln().toDouble()
    val area = (base*altura)
    println("Sua área é:$area")
}
fun retangulo(){
    println("Qual a base do Retângulo?")
    val base = readln().toDouble()
    println("Altura?")
    val altura = readln().toDouble()
    val area = (base*altura)
    println("Sua aréa é:$area")
}
fun circulo(){
    println("Qual o valor do Raio do Círculo?")
    val raio = readln().toDouble()
    val area = Math.PI * (raio*raio)
    println("Sua área é:$area²")
}
//HORA DE CODAR 2
fun maior(){
    println("Digite o 1° valor:")
    val x = readln().toDouble()
    println("Digite o 2° valor:")
    val y = readln().toDouble()
    if (x > y) {
        println("O 1° valor é maior:$x")
    }   else if (y > x){
        println("O 2° valor é maior:$y")
    }   else {
        println("Os números são iguais.")
    }
}
fun positivo(){
    println("Digite um valor?")
    val x = readln().toDouble()
    if (x > 0) {
        println("Seu número é positivo.")
    } else if (x == 0.0){
            println("Seu número é zero.")
    } else {
        println("Seu número é negativo.")
    }
}
fun maiordetres(){
    println("Digite o 1° valor:")
    val x = readln().toDouble()
    println("Digite o 2° valor:")
    val y = readln().toDouble()
    println("Digite o 3° valor:")
    val z = readln().toDouble()
    val xx = if (x > y && x > z){
        x
    } else if (y > x && y > z){
        y
    } else{
        z
    }
    println("O número maior é:$xx")
}
fun somamaior(){
    println("Digite o 1° valor:")
    val x = readln().toDouble()
    println("Digite o 2° valor:")
    val y = readln().toDouble()
    println("Digite o 3° valor:")
    val z = readln().toDouble()
    val xx = if (x < y && x < z){
        y+z
    } else if (y < x && y < z){
        x+z
    } else{
        x+y
    }
    println("A soma é:$xx")
}
fun mediaseis(){
    val n=mutableListOf<Double>()
    var soma = 0.0
    for (i in 1..6){
        println("Digite o ${i}° valor:")
        val valor = readln().toDouble()
        n.add(valor)
        soma += valor
    }
    val media = soma / 6
    println("Os números digitados foram:$n")
    println("Média é:$media")
}
fun pum(){
    val n=mutableListOf<Double>()
    for (i in 1..4){
        println("Digite o ${i}° valor:")
        n.add(readln().toDouble())
    }
    println("1° Valor:${n.first()}")
    println("Último Valor:${n.last()}")
    println("Maior Valor:${n.maxOrNull()}")
}
fun seisetedois(){
    val n=mutableListOf<Double>()
    for (i in 1..6) {
        println("Valor ${i}:")
        n.add(readln().toDouble())
    }
    val soma = n.filter { it < 72 }.sum()
    println("Números digitados:$n")
    println("Soma:$soma")
}
fun media(){
    val n=mutableListOf<Double>()
    for (i in 1..4){
        print("Nota ${i}:")
        n.add(readln().toDouble()) }
    val r = n.filter { it in 0.0..10.0 }
    val media = if (r.isNotEmpty()) r.average() else 0.0
    println("Notas:$r")
    println("Média:$media")
    if (media > 5)
        println("Você passou!")
    else {
        println("Você reprovou.")
    }
}
fun votar(){
    println("Digite seu ano de nascimento:")
    val ano = readln().toInt()
    val atual = 2026
    val idade = atual - ano
    if (idade < 16 )
        println("Você possui $idade anos, não pode votar!")
    else {
        println("Você tem $idade anos, pode votar!")
    }
}
fun peso(){
    println("Digite sua altura:")
    val h = readln().toDouble()
    println("Digite seu gênero: \n1 - Feminino  \n2 - Masculino")
    val s = readln().toInt()
    val resul = when (s) {
        1 -> (62.1 * h) - 44.7
        2 -> (72.7 * h) - 58.0
        else -> 0.0 }
    if (resul == 0.0){
        println("Inválido") }
    else {
        println("Seu peso ideal é: ${"%.2f".format(resul)}kg") }
}
fun calculadora(){
    println("Digite um número:")
    val x = readln().toDouble()
    println("Digite outro número:")
    val y = readln().toDouble()
    println("=== ESCOLHA UMA OPERAÇÃO ===")
    println("\n1-Adição  \n2-Subtração  \n3-Divisão  \n4-Multiplicação")
    val z = readln().toInt()
    val r = when (z){
        1 -> x + y
        2 -> x - y
        3 -> if (y != 0.0) x/y else "Inválido."
        4 -> x * y
        else -> "Inválido."
    }
    println("Resultado:$r")
}
// HORA DE CODAR 3
fun kaboom(){
    for (i in 30 downTo 0) {
        println("Tempo restante: $i")
        Thread.sleep(1000)
    }
    println("KABOOM!")
}
fun menordezero(){
    println("Digite o 1° valor: ")
    val x = readln().toDouble()
    println("Digite o 2° valor: ")
    var y = readln().toDouble()
    while ( y <= 0) {
        println("Valor inválido, insira um número maior que 0, tente novamente: ")
        y = readln().toDouble()
    }
    val z = (x / y)
    println("Sua divisão pelo valor $x e $y, é: $z")
}
fun decrescente() {
    for (i in 10 downTo 1) {
        println("Tempo restante: $i")
        Thread.sleep(1000)
    }
}
fun calculandomedia(){
    var x = 0.0
    var y = 0
    for (i in 15..100){
        x += i
        y ++ }
    val z = (x/y)
    println("A soma é: $x")
    println("A quantidade é: $y")
    println("A média é: $z")
}
fun maiorquesegundo() {
    println("Digite o 1° número: ")
    val x = readln().toInt()
    println("Digite o 2° número, maior que o anterior: ")
    var y = readln().toInt()
    while (y <= x) {
        println("Inválido, tente novamente: ")
        y = readln().toInt() }
    var soma = 0.0
    var contador = 0
    for ( i in x..y){
        soma += i
        contador ++ }
    val media = soma / contador
    println("A sua soma é: $soma")
    println("Total de números: $contador")
    println("Sua média é: $media")
}
fun aprovados(){
    var aprovado = 0
    var resposta: String
    do {
        println("Digite a 1° nota: ")
        val  n1 = readln().toDouble()
        println("Digite a 2° nota: ")
        val n2 = readln().toDouble()
        val media = (n1+n2)/2
        println("Sua média é: $media")
        if (media >= 9.5) {
            println("Você foi aprovado!")
            aprovado++
        } else {
            println("Voce foi reprovado!")
        }
        println("Calcular a média de outro aluno Sim/Não? (S/N)")
        resposta = readln().uppercase()
    }   while ( resposta == "S")
        println("Total de alunos aprovados: $aprovado")
}
fun mediadeseis(){
    val n=mutableListOf<Double>()
    for (i in 1..6) {
        println("Digite a ${i} nota de 0 a 10: ")
        var nota = (readln().toDouble())
        while (nota < 0 || nota > 10) {
            println("Inválido! Digite um valor entre 0 e 10 para a ${i}ª nota:")
            nota = readln().toDouble()
        }
        n.add(nota)
    }
        val soma = n.sum()
        val media = soma / n.size
    println("Total de notas: $n")
    println("Soma total: $soma")
    println("Sua média: $media")
}
fun doidera(){
    println("Digite um númemro: ")
    var n = (readln().toInt())
    while (n <=0){
        println("Inválido, tente novamente:")
        n = readln().toInt()
    }
    println("Valores inteiros: $n")
    for (i in 1..n) {
        println("$i")
    }
}
fun maiorcem() {
    for (i in 101..110) {
        println("Tempo restante: $i")
        Thread.sleep(500)

    }
}
fun dezvalores() {
    var dentro = 0
    var fora = 0
    println("=== Descobrindo números dentro de 24 & 42 ===")
    for (i in 1..10) {
        println("Digite o ${i} número: ")
        val num = (readln().toInt())
        if (num in 24..42) {
            dentro++
        } else {
            fora++
        }
    }
        println("Dentro: $dentro")
        println("Fora: $fora ")
}
fun tabuada() {
    println("Escreva um número: ")
    val n = readln().toInt()
    for (num in 1..n) {
        println("Tabuada do $num")
        for (i in 0..10) {
            var calculo = (num * i)
            println("$num x $i é: $calculo")
        }
    }
}
fun estudantes(){
        val lista = mutableListOf<String>()
        var continuar = "S"
        while (continuar == "S") {
            println("Digite o nome do estudante:")
            lista.add(readln())
            println("Deseja cadastrar outro? (S/N)")
            continuar = readln().uppercase()
        }
        println("Lista de Estudantes: $lista")
        println("Total: ${lista.size}")
}
fun planetas(){
    val sistemasolar = listOf ("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno")
    println("Digite um planeta:")
    val lupa = readln().lowercase().capitalize()
    if (sistemasolar.contains(lupa)) {
        println("Sim, $lupa faz parte do sistema solar!")
    } else {
        println("Ops, $lupa não está na nossa lista principal.")
    }
}
fun feirinhas(){
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Uva", "Morango")
    while (frutas.isNotEmpty()) {
        println("\nLista de compras: $frutas")
        println("Qual fruta deseja retirar?")
        val tirar = readln().lowercase().capitalize()
        if (frutas.remove(tirar)) {
            println("Fruta foi retirada com sucesso.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }
    }
    println("Lista de compras finalizada!")
}
var saldo = 100.5
fun horadecodar5() {
    println("=== Olá, tudo bem? Aqui é o Banco Farofa ===")
    println("Olá $nome, é um prazer ter você por aqui!")
    inicio()
}
fun inicio() {
    println("\nEscolha uma opção:")
    println("1. Saldo | 2. Extrato | 3. Saque | 4. Depósito | 5. Transferência | 6. Sair")
    val escolha = readLine()?.toIntOrNull()
    when (escolha) {
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia()
        6 -> sair()
        else -> erro()
    }
}
fun validarSenha(): Boolean {
    print("Por favor, informe sua senha: ")
    val senha = readlnOrNull()
    return if (senha == "3589") {
        true
    } else {
        println("Senha incorreta!")
        false
    }
}
fun verSaldo() {
    if (validarSenha()) {
        println("Seu saldo atual é: R$ $saldo")
    }
    inicio()
}
fun verExtrato() {
    if (validarSenha()) {
        println("=== EXTRATO INTERNO ===")
        println("- Compra Padaria: R$ 10,00")
        println("- Depósito Antigo: R$ 50,00")
        println("- Assinatura Streaming: R$ 34,90")
        println("Saldo final disponível: R$ $saldo")
    }
    inicio()
}
fun fazerDeposito() {
    print("Qual o valor para depósito? ")
    val deposito = readlnOrNull()?.toFloatOrNull()
    if (deposito == null || deposito <= 0) {
        println("Operação não autorizada.")
        inicio()
    } else {
        saldo += deposito
        println("Depósito realizado com sucesso!")
        verSaldo()
    }
}
fun fazerSaque() {
    if (validarSenha()) {
        print("Qual o valor para saque? ")
        val saque = readLine()?.toFloatOrNull()
        if (saque == null || saque <= 0 || saque > saldo) {
            println("Operação não autorizada.")
            inicio()
        } else {
            saldo -= saque
            println("Saque realizado!")
            verSaldo()
        }
    } else {
        fazerSaque()
    }
}
fun fazerTransferencia() {
    if (validarSenha()) {
        print("Informe o número da conta destino (apenas números): ")
        val conta = readlnOrNull()?.toLongOrNull()
        if (conta == null) {
            println("Operação não autorizada. Conta inválida.")
            inicio()
        } else {
            print("Qual o valor da transferência? ")
            val valor = readlnOrNull()?.toFloatOrNull()
            if (valor == null || valor <= 0 || valor > saldo) {
                println("Operação não autorizada.")
                inicio()
            } else {
                saldo -= valor
                println("Transferência realizada com sucesso!")
                verSaldo()
            }
        }
    } else {
        fazerTransferencia()
    }
}
fun erro() {
    println("Por favor, informe um número entre 1 a 6.")
    inicio()
}
fun sair() {
    print("Você deseja sair? (S/N) ")
    val confirma = readlnOrNull().orEmpty().uppercase()
    when (confirma) {
        // Regra: Mensagem personalizada ao sair
        "S" -> println("$nome, foi um prazer ter você por aqui!")
        "N" -> inicio()
        else -> sair()
    }
}