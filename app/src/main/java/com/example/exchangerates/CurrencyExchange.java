package com.example.exchangerates;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange {

    private RatesEntity rates;

    public List<Currency> getCurrencyList(){
        List<Currency> currencyList = new ArrayList<>();


        currencyList.add(new Currency("USD", rates.getUSD(),"United State Dollar"));
        currencyList.add(new Currency("SGD", rates.getSGD(),"Singapore Dollar"));
        currencyList.add(new Currency("EUR", rates.getEUR(),"Euro"));
        currencyList.add(new Currency("GBP", rates.getGBP(),"Pound Sterling"));
        currencyList.add(new Currency("KRW", rates.getKRW(),"Korean Won"));
        currencyList.add(new Currency("THB", rates.getTHB(),"Thai Baht"));
        currencyList.add(new Currency("JPY", rates.getJPY(),"Japanese Yen"));
        currencyList.add(new Currency("KRW", rates.getKRW(),"Korean Won"));
        currencyList.add(new Currency("THB", rates.getTHB(),"Thai Baht"));

        currencyList.add(new Currency("AUD", rates.getAUD(),"Australian Dollar"));
        currencyList.add(new Currency("RUB", rates.getRUB(),"Russian Rouble"));
        currencyList.add(new Currency("CNY", rates.getCNY(),"Chinese Yuan"));
        currencyList.add(new Currency("BDT", rates.getBDT(),"Bangladesh Taka"));
        currencyList.add(new Currency("BND", rates.getBND(),"Brunei Dollar"));
        currencyList.add(new Currency("BRL", rates.getBRL(),"Brazilian Real"));
        currencyList.add(new Currency("CAD", rates.getCAD(),"Canadian Dollar"));

        currencyList.add(new Currency("CHF", rates.getCHF(),"Swiss Franc"));

        currencyList.add(new Currency("CZK", rates.getCZK(),"Czech Koruna"));
        currencyList.add(new Currency("DKK", rates.getDKK(),"Danish Krone"));
        currencyList.add(new Currency("EGP", rates.getEGP(),"Egyptian Pound"));


        currencyList.add(new Currency("GBP", rates.getGBP(),"Pound Sterling"));
        currencyList.add(new Currency("HKD", rates.getHKD(),"Hong Kong Dollar"));
        currencyList.add(new Currency("IDR", rates.getIDR(),"Indonesian Rupiah"));
        currencyList.add(new Currency("ILS", rates.getILS(),"Israeli Shekel"));

        currencyList.add(new Currency("INR", rates.getINR(),"Indian Rupee"));

        currencyList.add(new Currency("KES", rates.getKES(),"Kenya Shilling"));
        currencyList.add(new Currency("KHR", rates.getKHR(),"Cambodian Rie"));


        currencyList.add(new Currency("KWD", rates.getKWD(),"Kuwaiti Dinar"));
        currencyList.add(new Currency("LAK", rates.getLAK(),"Lao Kip"));
        currencyList.add(new Currency("LKR", rates.getLKR(),"Sri Lankan Rupee"));
        currencyList.add(new Currency("MYR", rates.getMYR(),"Malaysian Ringgit"));
        currencyList.add(new Currency("NOK", rates.getNOK(),"Norwegian Kroner"));

        currencyList.add(new Currency("NPR", rates.getNPR(),"Nepalese Rupee"));
        currencyList.add(new Currency("NZD", rates.getNZD(),"New Zealand Dollar"));
        currencyList.add(new Currency("PHP", rates.getPHP(),"Philippines Peso"));
        currencyList.add(new Currency("PKR", rates.getPKR(),"Pakistani Rupee"));
        currencyList.add(new Currency("RSD", rates.getRSD(),"Serbian Dinar"));

        currencyList.add(new Currency("SAR", rates.getSAR(),"Saudi Arabian Riyal"));
        currencyList.add(new Currency("SEK", rates.getSEK(),"Swedish Krona"));

        currencyList.add(new Currency("VND", rates.getVND(),"Vietnamese Dong"));

        currencyList.add(new Currency("ZAR", rates.getZAR(),"South Africa Rand"));

        return currencyList;
    }


    public RatesEntity getRates() {
        return rates;
    }

    public void setRates(RatesEntity rates) {
        this.rates = rates;
    }

    public static class RatesEntity {
        private String AUD;
        private String BDT;
        private String BND;
        private String BRL;
        private String CAD;
        private String CHF;
        private String CNY;
        private String CZK;
        private String DKK;
        private String EGP;
        private String EUR;
        private String GBP;
        private String HKD;
        private String IDR;
        private String ILS;
        private String INR;
        private String JPY;
        private String KES;
        private String KHR;
        private String KRW;
        private String KWD;
        private String LAK;
        private String LKR;
        private String MYR;
        private String NOK;
        private String NPR;
        private String NZD;
        private String PHP;
        private String PKR;
        private String RSD;
        private String RUB;
        private String SAR;
        private String SEK;
        private String SGD;
        private String THB;
        private String USD;
        private String VND;
        private String ZAR;

        public String getAUD() {
            return AUD;
        }

        public void setAUD(String AUD) {
            this.AUD = AUD;
        }

        public String getBDT() {
            return BDT;
        }

        public void setBDT(String BDT) {
            this.BDT = BDT;
        }

        public String getBND() {
            return BND;
        }

        public void setBND(String BND) {
            this.BND = BND;
        }

        public String getBRL() {
            return BRL;
        }

        public void setBRL(String BRL) {
            this.BRL = BRL;
        }

        public String getCAD() {
            return CAD;
        }

        public void setCAD(String CAD) {
            this.CAD = CAD;
        }

        public String getCHF() {
            return CHF;
        }

        public void setCHF(String CHF) {
            this.CHF = CHF;
        }

        public String getCNY() {
            return CNY;
        }

        public void setCNY(String CNY) {
            this.CNY = CNY;
        }

        public String getCZK() {
            return CZK;
        }

        public void setCZK(String CZK) {
            this.CZK = CZK;
        }

        public String getDKK() {
            return DKK;
        }

        public void setDKK(String DKK) {
            this.DKK = DKK;
        }

        public String getEGP() {
            return EGP;
        }

        public void setEGP(String EGP) {
            this.EGP = EGP;
        }

        public String getEUR() {
            return EUR;
        }

        public void setEUR(String EUR) {
            this.EUR = EUR;
        }

        public String getGBP() {
            return GBP;
        }

        public void setGBP(String GBP) {
            this.GBP = GBP;
        }

        public String getHKD() {
            return HKD;
        }

        public void setHKD(String HKD) {
            this.HKD = HKD;
        }

        public String getIDR() {
            return IDR;
        }

        public void setIDR(String IDR) {
            this.IDR = IDR;
        }

        public String getILS() {
            return ILS;
        }

        public void setILS(String ILS) {
            this.ILS = ILS;
        }

        public String getINR() {
            return INR;
        }

        public void setINR(String INR) {
            this.INR = INR;
        }

        public String getJPY() {
            return JPY;
        }

        public void setJPY(String JPY) {
            this.JPY = JPY;
        }

        public String getKES() {
            return KES;
        }

        public void setKES(String KES) {
            this.KES = KES;
        }

        public String getKHR() {
            return KHR;
        }

        public void setKHR(String KHR) {
            this.KHR = KHR;
        }

        public String getKRW() {
            return KRW;
        }

        public void setKRW(String KRW) {
            this.KRW = KRW;
        }

        public String getKWD() {
            return KWD;
        }

        public void setKWD(String KWD) {
            this.KWD = KWD;
        }

        public String getLAK() {
            return LAK;
        }

        public void setLAK(String LAK) {
            this.LAK = LAK;
        }

        public String getLKR() {
            return LKR;
        }

        public void setLKR(String LKR) {
            this.LKR = LKR;
        }

        public String getMYR() {
            return MYR;
        }

        public void setMYR(String MYR) {
            this.MYR = MYR;
        }

        public String getNOK() {
            return NOK;
        }

        public void setNOK(String NOK) {
            this.NOK = NOK;
        }

        public String getNPR() {
            return NPR;
        }

        public void setNPR(String NPR) {
            this.NPR = NPR;
        }

        public String getNZD() {
            return NZD;
        }

        public void setNZD(String NZD) {
            this.NZD = NZD;
        }

        public String getPHP() {
            return PHP;
        }

        public void setPHP(String PHP) {
            this.PHP = PHP;
        }

        public String getPKR() {
            return PKR;
        }

        public void setPKR(String PKR) {
            this.PKR = PKR;
        }

        public String getRSD() {
            return RSD;
        }

        public void setRSD(String RSD) {
            this.RSD = RSD;
        }

        public String getRUB() {
            return RUB;
        }

        public void setRUB(String RUB) {
            this.RUB = RUB;
        }

        public String getSAR() {
            return SAR;
        }

        public void setSAR(String SAR) {
            this.SAR = SAR;
        }

        public String getSEK() {
            return SEK;
        }

        public void setSEK(String SEK) {
            this.SEK = SEK;
        }

        public String getSGD() {
            return SGD;
        }

        public void setSGD(String SGD) {
            this.SGD = SGD;
        }

        public String getTHB() {
            return THB;
        }

        public void setTHB(String THB) {
            this.THB = THB;
        }

        public String getUSD() {
            return USD;
        }

        public void setUSD(String USD) {
            this.USD = USD;
        }

        public String getVND() {
            return VND;
        }

        public void setVND(String VND) {
            this.VND = VND;
        }

        public String getZAR() {
            return ZAR;
        }

        public void setZAR(String ZAR) {
            this.ZAR = ZAR;
        }
    }
}
