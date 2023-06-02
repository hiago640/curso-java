package secao13_swing.observer;

public class Namorada implements ChegadaAniversarianteObserver {

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Apagar as luzes...");
		System.out.println("Fazer Silencio...");
		System.out.println("Fazer Surpresa...");
	}

}
