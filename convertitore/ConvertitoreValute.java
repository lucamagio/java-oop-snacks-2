package convertitore;

public class ConvertitoreValute {
    private static final String[] valute = {"EUR", "USD", "GBP", "JPY"};
    private double importo;

    public static String[] getValute() {
        return valute;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }
    
    public static double converti(String daValuta, String aValuta, double importo){
        double conversione = 0;

        switch (daValuta+aValuta) {
            case "EURUSD":
                conversione = conversioneEURUSD(importo);
               break;

            case "EURGBP":
                conversione = conversioneEURGBP(importo);
                break;

            case "EURJPY":
                conversione = conversioneEURJPY(importo);
                break;

            case "USDGBP":
                conversione = conversioneUSDGBP(importo);
                break;
            case "USDJPY":
                conversione = conversioneUSDJPY(importo);
                break;
            case "GBPJPY":
                conversione = conversioneGBPJPY(importo);
                break;

            default:
                System.out.println("Errore nella selezione delle valute");
        }

        return conversione;
    }

    public static double conversioneEURUSD(double importo){
        return importo * 1.22;
    }

    public static double conversioneEURGBP(double importo){
        return importo * 0.98;
    }

    public static double conversioneEURJPY(double importo){
        return importo * 1.38;
    }

    public static double conversioneUSDGBP(double importo){
        return importo * 0.78;
    }

    public static double conversioneUSDJPY(double importo){
        return importo * 1.25;
    }

    public static double conversioneGBPJPY(double importo){
        return importo * 1.52;
    }
    
}
