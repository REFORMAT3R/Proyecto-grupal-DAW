class Calculator {
int add(int a, int b){ return 0; } //Hace Mario
int sub(int a, int b){ return 0; } //Hace Jazmin
int mul(int a, int b){ return 0; } //Hace Omar
int div(int a, int b){ return 0; } //Hace Denny
    public int mod(int a, int b){
        int mod;
        if(b == 0) {
            System.out.println("Nose puede dividir por 0");
            mod = 0;
        }
        else mod = a % b;
        return mod;
    }
}