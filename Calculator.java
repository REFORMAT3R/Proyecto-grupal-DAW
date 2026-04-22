class Calculator {

    double add(double a, double b){
        double suma = a + b;
        System.out.println("El resultado de la adición es:");
        return suma;
    }//Hace Mario

    double sub(double a, double b){
        return a-b ;
    } //Jazmin

    double mul(double numero1, double numero2){
        return numero1 * numero2;
    }//Hace Omar

    double mod(double a, double b){
        double mod;
        if(b == 0) {
            System.out.println("No se puede dividir por 0");
            mod = 0;
        }
        else mod = a % b;
        return mod;
    } //Hace Jhovi

    double div (double numero1, double numero2){ 
        if(numero2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        else {
            double resultado = numero1 / numero2;
            resultado = Math.round(resultado * 100.0) / 100.0;
            return resultado;
        }
    } //Hace Denny
}
