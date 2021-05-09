package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		tarimKrediManager.hesapla();
		tarimKrediManager.kampanya();
		
		AskerKrediManager askerKrediManager = new AskerKrediManager();
	
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(ogretmenKrediManager);
		krediUI.krediHesapla(tarimKrediManager);
		krediUI.krediHesapla(askerKrediManager);

	}

}
