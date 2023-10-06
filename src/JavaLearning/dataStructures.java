package JavaLearning;

import java.util.Arrays;

public class dataStructures {
    public static void main(String[] args) {
        String[] cars = {"Camaro", "Corvet", "Tesla", "BMW"};      //Para convertir una variable en un array lo que se hace es poner [] despues del tipo de dato y los datos se colocan entre {}
        //todos los datos tienen que ser del mismo tipo
        cars[0] = "Mustang";    //para acceder a los datos y modificarlos es igual que en python
        System.out.println(cars[0]);

        String[] carsv2 = new String[3];    //Tambien es posible crear un array vacio con huecos de donde van a ir los datos
        carsv2[0] = "Camaro";   //Para llenar los huecos es igual
        carsv2[1] = "Camaro";
        //carsv2[2] = "Camaro";     //SI no llenamos los huecos en el hueco se queda null
        System.out.println(carsv2[2]);

        for(int i = 0; i<cars.length; i++) {        //para sacar la longitud de datos de un array se hace con length
            System.out.println(cars[i]);
        }

        String[][] carsv3 = new String[3][3];   //asi se crearia un array de 2D

        for(int i = 0; i<carsv3.length; i++) {  //para acceder al array 2D se hace igual que en python
            for(int j = 0; j<carsv3[i].length; j++){
                carsv3[i][j] = "mark-"+j;
            }
        }

        for(int i = 0; i<carsv3.length; i++) {  //para acceder al array 2D se hace igual que en python
            for(int j = 0; j<carsv3[i].length; j++){
                System.out.print(carsv3[i][j]+" ");
            }
            System.out.println();

        }

        String[][] carsv4 = {   {"Camaro", "Corvet", "Silverado"},  //asi es como se asignarian todos los valores de 1
                                {"Mustang", "Ranger", "F1-15"},
                                {"Lambo", "Ferrari", "Tesla"}
                            };
        
        System.out.println(Arrays.deepToString(carsv4));
    }
}
