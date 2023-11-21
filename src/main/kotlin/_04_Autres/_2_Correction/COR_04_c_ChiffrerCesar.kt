package _04_Autres._2_Correction

import _10_Demos_et_tests.DataTestChiffrerCesar
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend en argument un entier qui correspond au décalage de lettre et une chaîne de caractères pour
 * message à chiffrer.
 * La fonction applique le code Cesar pour chiffrer le message.
 * @param cle Clé de chiffrement (valeur de 1 à 26)
 * @param message Le message à chiffrer.
 * @return Un String représentant le message chiffré.
 */

fun chiffrerCesar(cle: Int, message: String): String {
    var messageCesar = ""
    for (lettre in message) {
        messageCesar += if (lettre in 'a'..'z' ) {
           (((lettre - 'a' + cle) % 26) + 'a'.code).toChar()
        } else if (lettre in 'A'..'Z' ) {
           (((lettre - 'A' + cle) % 26) + 'A'.code).toChar()
        } else {
            lettre
        }

    }
    return messageCesar
}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_04c = DataTestChiffrerCesar(::chiffrerCesar,3, "Hello World !","Khoor Zruog !")
val dataTest02_04c = DataTestChiffrerCesar(::chiffrerCesar,1, "We are the Champion !","Xf bsf uif Dibnqjpo !")
val listDataTests_04c = listOf(dataTest01_04c , dataTest02_04c)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_04c)
    demoEnLot(listDataTests_04c)
}