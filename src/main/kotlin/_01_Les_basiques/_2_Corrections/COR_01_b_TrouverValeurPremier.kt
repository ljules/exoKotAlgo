package _01_Les_basiques._2_Corrections

import _10_Demos_et_tests.DataTestIntListInt
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot


/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * Prend en argument une valeur numérique et une liste de valeurs numériques
 * et retourne dans la première occurrence de la valeur recherchée.
 * Si la valeur est absente, la fonction retourne -1.
 * @param value La valeur à chercher.
 * @param list Liste où chercher la valeur.
 * @return Indice de la 1ère occurrence de la valeur cherchée.
 */

fun findFirstValue(value: Number, list: List<Number>): Int {
        for (i in 0..list.lastIndex) {
            if (list[i].toFloat() == value.toFloat()) return (i)
        }
    return -1
}


/* -------------------
    Données de test
   --------------------*/

val dataTest01_01b = DataTestIntListInt(::findFirstValue, 7, listOf<Int>(5, -10, 7, -20, 3, 2, 5, 7, 2, 7), 2)
val dataTest02_01b = DataTestIntListInt(::findFirstValue, 5, listOf<Int>(-5, -10, -2, -100, -2, -3), -1 )
val listDataTests_01b = listOf(dataTest01_01b , dataTest02_01b)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_01b)
    demoEnLot(listDataTests_01b)
}
