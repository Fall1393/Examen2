    import java.util.Scanner;
    import java.util.Stack;
        class Convertir {
            private Convertir conv;
            public  static  void main(String[]args){
                int a,n = 2355;
                String x = "";
                Stack pila = new Stack();
                do {pila.add(a = n % 2);
                    x = a + x;
                    n = n / 2;} while (n > 0);
                    System.out.println("la conversion de decimal a binario es: [ " + pila.push(x) + " ]");}
                    private void convertir(int decimal) {
                    Scanner entrada = new Scanner( System.in );
                }
        }


        public class Examenunidad2 {
        public static void main(String[] args) {
            Scanner lee = new Scanner(System.in);
            int mayor, menor, medio;
            int a=10;
            int b=9;
            int c=8;
        /*System.out.println("1. Numero Ingresado:  ");
        a= lee.nextInt();
        System.out.println("2. Numero Ingresado:  ");
        b= lee.nextInt();
        System.out.println("3. Numero Ingresado:  ");
        c= lee.nextInt();*/
            if (a>b && a>c){mayor=a;}

            else if(b>a && b>c){mayor=b;}

            else {mayor=c;}

            if (a<b && a<c){menor=a;}

            else if (b<a && b<c){menor=b;}

            else{menor=c;}

            medio=(a+b+c) - (mayor + menor);
            System.out.println("el numero Acendente es: ");
            System.out.println(menor + " "+ medio + " "+ mayor);

            medio=(a+b+c) - (menor + mayor);
            System.out.println("el numero Decendente es: ");
            System.out.println(mayor + " "+ medio + " "+ menor);
        }
    }







