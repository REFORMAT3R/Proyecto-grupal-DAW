class Calculator {
int add(int a, int b){ return 0; } //Hace Mario
int sub(int a, int b){ return 0; } //Hace Jazmin
int mul(int numero1, int numero2){         //Hace Omar
    return numero1 * numero2; 
} 

int div(int a, int b){ return 0; } //Hace Denny
int mod(int a, int b){ return 0; } //Hace Jhovi
    int add(int a, int b){ return 0; } //Hace Mario

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

    int mul(int a, int b){ return 0; } //Hace Omar

    int mod(int a, int b){ return 0; } //Hace Jhovi 

}
