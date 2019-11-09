/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        // VARIABLE
        int entrada = 0;

        // CONTROL
        do {
        boolean testOK = false;
            do {
                try {

                    // Entrada consola
                    System.out.print("Introduzca un numero entero...: ");
                    entrada = SCN.nextInt();
                    testOK = true;

                } catch (Exception e) {
                    //mensaje
                    System.out.println("ERROR: entrada incorrecta");
                } finally {
                    SCN.nextLine();
                }
            } while (!testOK);
            
            // Validación paridad
            if (entrada % 2 != 0) {
                System.out.println("ERROR: Número impar");
                
            }
        } while (entrada % 2 != 0);
        System.out.printf("Numero par...: %d%n", entrada);
    }
}
