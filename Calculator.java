class Calculator {
    int add(int a, int b){
        int suma = a + b;
        System.out.println("El resultado de la adición es:");
        return suma;
    }//Hace Mario
    int sub(int a, int b){ return 0; } //Hace Jazmin
    int mul(int numero1, int numero2){         //Hace Omar
        return numero1 * numero2;
    }
    int mod(int a, int b){
        int mod;
        if(b == 0) {
            System.out.println("Nose puede dividir por 0");
            mod = 0;
        }
        else mod = a % b;
        return mod;
    } //Hace Jhovi
    double sub(double a, double b){
        return a-b ;
    } //Jazmin
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
