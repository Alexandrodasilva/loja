public class ControladorRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControladorRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    public void getVolume(){
        return this.volume
    }
    public void getLigado(){
        return this.ligado;
    }
    public void getTocando(){
        return this.tocando
    }
    public int setVolume(int volume){
        this.volume = volume;
    }
    public boolean setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean setTocando( boolean tocando){
        this.tocando = tocando;
    }
    // métodos abstratos
    @Override
    public abstract void ligar(){
        this.setLigado(true);
    }
    @Override
    public abstract void desligar(){
        this.setLigado(false);
    }
    @Override
    public abstract void abrirMenu(){
        System.out.printl("Esta ligado? "+this.getLigado());
        System.out.printl("Esta tocando? "+this.getTocando());
        System.out.printl("Volume? "+this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.printl(" | ")
        }
    }
    @Override
    public abstract void fecharMenu(){
        System.out.printl("Fechando Menu!!")
    }
    @Override
    public abstract void maisVolume(){
        if(this.getLigado()){
            setVolume(this.getVolume() + 1)
        }
    }
    @Override
    public abstract void menoVolume(){
        if(this.getLigado()){
            setVolume(this.getVolume() - 1)
        }
    }
    @Override
    public abstract void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            setVolume(this.getVolume() + 1)
        }
    }
    @Override
    public abstract void desligarMudo(){

    }
    @Override
    public abstract void  play(){

    }
    @Override
    public abstract void pause(){

    }

}