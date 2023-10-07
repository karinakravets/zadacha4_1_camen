 import kotlin.random.Random
fun main() { val choices = arrayOf("камень", "ножницы", "бумага")
    val compChoice = choices[Random.nextInt(choices.size)]
    println("Выбор компьютера: $compChoice")
    println("Сделайте свой выбор: 1 - камень, 2 - ножницы, 3 - бумага")
    val playerChoice = when (readLine()) { "1" -> "камень" "2" -> "ножницы" "3" -> "бумага"
        else -> { println("Неверный ввод. Попробуйте еще раз.")
            return
        }
    }
    println("Ваш выбор: $playerChoice")
    when { compChoice == playerChoice -> println("Ничья, игра проводится заново")
        compChoice == "камень" && playerChoice == "ножницы"
    -> println("Победил компьютер")
        compChoice == "ножницы" && playerChoice == "бумага"
    -> println("Победил компьютер")
        compChoice == "бумага" && playerChoice == "камень"
        -> println("Победил компьютер")
        else -> println("Вы победили!")
    }
}

