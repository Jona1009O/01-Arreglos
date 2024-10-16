
public class matrisEntera {
    //Variables de intancias
    private int [] [] ma;

    private int tamanio;

    //Constructor (El constructor no tiene valor de retorno
    //y se debe llamar igual que la clase.

    private matrisEntera (int tamanio) {
        if (tamanio>2) {
            this.tamanio = tamanio;
            ma = new int[tamanio][this.tamanio];
}else{
    this.tamanio = tamanio = 2;     
    ma = new int[tamanio][this.tamanio];
}
    }

    public int gettamanio(){
        return tamanio;
        }

    public int [][] getMa(){
        return ma;
    }

    public void setMa(int[][] ma){
        if(ma.length == this.tamanio && ma[0].length == this.ma[0].length){
            for(int i = 0; i < this.ma.length; i++){
                for(int j = 0; j < this.ma[0].length; j++){
                    this.ma[i][j] = ma[i][j];
                }
                
            }
        }        
    }
}