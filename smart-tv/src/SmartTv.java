public class SmartTv {
    boolean estado = false;
    int canal = 1;
    int volume = 0;

    public void aumentarVolume() {
        if(this.estado == false) {
            System.out.println("Tv desligada");
        } else if(this.volume == 100) {
            this.volume = 100;
        } else {
            this.volume++;
        }
    }

    public void diminuirVolume() {
        if(this.estado == false) {
            System.out.println("Tv desligada");
        } else if(this.volume == 0) {
            this.volume = 0;
        } else {
            this.volume--;
        }
    }

    public void mudarCanal(int canal) {
        if(this.estado == false) {
            System.out.println("Tv desligada");
        } else if(canal <= 0) {
            System.out.println("Não existe");
        }
        this.canal = canal;
    }

    public void aumentarCanal() {
        if(this.estado == false) {
            System.out.println("Tv desligada");
        } else{
            this.canal++;
        }
    }

    public void diminuirCanal() {
        if(this.estado == false) {
            System.out.println("Tv desligada");
        } else if (canal == 1){
            this.canal = 1;
        } else {
            this.canal--;
        }
    }

    public void ligar(){
        this.estado = true;
    }

    public void desligar(){
        this.estado = false;
    }


}
