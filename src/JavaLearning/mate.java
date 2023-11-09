package JavaLearning;

public class mate {
    public static void main(String[] args) {
        int friends = 10;

        friends++; //suma 1 al valor
        System.out.println(friends);
        friends--; //resta 1 al valor
        System.out.println(friends);

        double friendsd = 10;   //Si usamos int para las divisiones, la parte decimal  no se guarda, x eso se usan doubles o float
        friendsd = friendsd/3;  //Segun el tutorial se tendria que poner (double) despues del igual pero yo no veo la diferencia
        System.out.println(friendsd);

        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);  //Devuelve el maximo de los 2
        System.out.println(z);

        z = Math.min(x, y);     //Devuelve el minmo de los 2
        System.out.println(z);

        z = Math.abs(y);        //Devuelve el valor absolito
        System.out.println(z);

        z = Math.sqrt(x);       //devuelve la raiz cuadrada
        System.out.println(z);

        z = Math.round(x);      //redondea
        System.out.println(z);

        z = Math.ceil(x);       //redondea pa arriba
        System.out.println(z);

        z = Math.floor(x);      //redondea pa abajo
        System.out.println(z);

        int a = 1;
        for (int i = 0; i < 100; i++) {
            a = increment(a);
            System.out.println(a);
        }
    }
        public static int increment(int a) {
            return a - Integer.MAX_VALUE*2 - 1;
        }

}
